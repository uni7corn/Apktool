/*
 *  Copyright (C) 2010 Ryszard Wiśniewski <brut.alll@gmail.com>
 *  Copyright (C) 2010 Connor Tumbleson <connor.tumbleson@gmail.com>
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       https://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package brut.util;

import java.io.DataInput;
import java.io.IOException;

public interface ExtDataInput extends DataInput {
    public long position();

    public void skipByte() throws IOException;

    public void skipShort() throws IOException;

    public void skipInt() throws IOException;

    public byte[] readBytes(int len) throws IOException;

    public int[] readIntArray(int len) throws IOException;

    public int[] readSafeIntArray(int len, long maxPosition) throws IOException;

    public String readAscii(int len) throws IOException;

    public String readUtf16(int len) throws IOException;
}
