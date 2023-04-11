// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alimt20181012.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDetectLanguageResponseBody} extends {@link TeaModel}
 *
 * <p>GetDetectLanguageResponseBody</p>
 */
public class GetDetectLanguageResponseBody extends TeaModel {
    @NameInMap("DetectedLanguage")
    private String detectedLanguage;

    @NameInMap("RequestId")
    private String requestId;

    private GetDetectLanguageResponseBody(Builder builder) {
        this.detectedLanguage = builder.detectedLanguage;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDetectLanguageResponseBody create() {
        return builder().build();
    }

    /**
     * @return detectedLanguage
     */
    public String getDetectedLanguage() {
        return this.detectedLanguage;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String detectedLanguage; 
        private String requestId; 

        /**
         * DetectedLanguage.
         */
        public Builder detectedLanguage(String detectedLanguage) {
            this.detectedLanguage = detectedLanguage;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetDetectLanguageResponseBody build() {
            return new GetDetectLanguageResponseBody(this);
        } 

    } 

}
