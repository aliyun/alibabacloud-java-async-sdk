// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alimt20181012.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDetectLanguageResponseBody} extends {@link TeaModel}
 *
 * <p>GetDetectLanguageResponseBody</p>
 */
public class GetDetectLanguageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DetectedLanguage")
    private String detectedLanguage;

    @com.aliyun.core.annotation.NameInMap("LanguageProbabilities")
    private String languageProbabilities;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetDetectLanguageResponseBody(Builder builder) {
        this.detectedLanguage = builder.detectedLanguage;
        this.languageProbabilities = builder.languageProbabilities;
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
     * @return languageProbabilities
     */
    public String getLanguageProbabilities() {
        return this.languageProbabilities;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String detectedLanguage; 
        private String languageProbabilities; 
        private String requestId; 

        /**
         * DetectedLanguage.
         */
        public Builder detectedLanguage(String detectedLanguage) {
            this.detectedLanguage = detectedLanguage;
            return this;
        }

        /**
         * LanguageProbabilities.
         */
        public Builder languageProbabilities(String languageProbabilities) {
            this.languageProbabilities = languageProbabilities;
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
