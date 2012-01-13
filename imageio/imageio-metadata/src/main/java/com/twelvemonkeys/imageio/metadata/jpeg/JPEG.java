/*
 * Copyright (c) 2011, Harald Kuhr
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *     * Redistributions of source code must retain the above copyright
 *       notice, this list of conditions and the following disclaimer.
 *     * Redistributions in binary form must reproduce the above copyright
 *       notice, this list of conditions and the following disclaimer in the
 *       documentation and/or other materials provided with the distribution.
 *     * Neither the name "TwelveMonkeys" nor the
 *       names of its contributors may be used to endorse or promote products
 *       derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
 * A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package com.twelvemonkeys.imageio.metadata.jpeg;

/**
 * JPEG
 *
 * @author <a href="mailto:harald.kuhr@gmail.com">Harald Kuhr</a>
 * @author last modified by $Author: haraldk$
 * @version $Id: JPEG.java,v 1.0 11.02.11 15.51 haraldk Exp$
 */
public interface JPEG {
    int SOI = 0xFFD8;
    int EOI = 0xFFD9;
    int SOS = 0xFFDA;

    int APP0 = 0xFFE0;
    int APP1 = 0xFFE1;
    int APP2 = 0xFFE2;
    int APP13 = 0xFFED;
    int APP14 = 0xFFEE;

    int SOF0 = 0xFFC0;
    int SOF1 = 0xFFC1;
    int SOF2 = 0xFFC2;
    int SOF3 = 0xFFC3;
    int SOF5 = 0xFFC5;
    int SOF6 = 0xFFC6;
    int SOF7 = 0xFFC7;
    int SOF9 = 0xFFC9;
    int SOF10 = 0xFFCA;
    int SOF11 = 0xFFCB;
    int SOF13 = 0xFFCD;
    int SOF14 = 0xFFCE;
    int SOF15 = 0xFFCF;
}
