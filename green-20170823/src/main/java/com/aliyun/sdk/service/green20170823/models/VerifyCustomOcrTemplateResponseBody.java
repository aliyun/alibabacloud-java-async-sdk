// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20170823.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link VerifyCustomOcrTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>VerifyCustomOcrTemplateResponseBody</p>
 */
public class VerifyCustomOcrTemplateResponseBody extends TeaModel {
    @NameInMap("ImageUrl")
    private String imageUrl;

    @NameInMap("RecognizeInfo")
    private String recognizeInfo;

    @NameInMap("RequestId")
    private String requestId;

    private VerifyCustomOcrTemplateResponseBody(Builder builder) {
        this.imageUrl = builder.imageUrl;
        this.recognizeInfo = builder.recognizeInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VerifyCustomOcrTemplateResponseBody create() {
        return builder().build();
    }

    /**
     * @return imageUrl
     */
    public String getImageUrl() {
        return this.imageUrl;
    }

    /**
     * @return recognizeInfo
     */
    public String getRecognizeInfo() {
        return this.recognizeInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String imageUrl; 
        private String recognizeInfo; 
        private String requestId; 

        /**
         * ImageUrl.
         */
        public Builder imageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }

        /**
         * RecognizeInfo.
         */
        public Builder recognizeInfo(String recognizeInfo) {
            this.recognizeInfo = recognizeInfo;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public VerifyCustomOcrTemplateResponseBody build() {
            return new VerifyCustomOcrTemplateResponseBody(this);
        } 

    } 

}
