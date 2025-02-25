// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DetectImageTextsResponseBody} extends {@link TeaModel}
 *
 * <p>DetectImageTextsResponseBody</p>
 */
public class DetectImageTextsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("OCRContents")
    private java.util.List<OCRContents> OCRContents;

    @com.aliyun.core.annotation.NameInMap("OCRTexts")
    private String OCRTexts;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DetectImageTextsResponseBody(Builder builder) {
        this.OCRContents = builder.OCRContents;
        this.OCRTexts = builder.OCRTexts;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DetectImageTextsResponseBody create() {
        return builder().build();
    }

    /**
     * @return OCRContents
     */
    public java.util.List<OCRContents> getOCRContents() {
        return this.OCRContents;
    }

    /**
     * @return OCRTexts
     */
    public String getOCRTexts() {
        return this.OCRTexts;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<OCRContents> OCRContents; 
        private String OCRTexts; 
        private String requestId; 

        /**
         * <p>OCR text blocks.</p>
         */
        public Builder OCRContents(java.util.List<OCRContents> OCRContents) {
            this.OCRContents = OCRContents;
            return this;
        }

        /**
         * <p>The full Optical Character Recognition (OCR) text, which is spliced by using the content of OCRContents.</p>
         */
        public Builder OCRTexts(String OCRTexts) {
            this.OCRTexts = OCRTexts;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1B3D5E0A-D8B8-4DA0-8127-ED32C851****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DetectImageTextsResponseBody build() {
            return new DetectImageTextsResponseBody(this);
        } 

    } 

}
