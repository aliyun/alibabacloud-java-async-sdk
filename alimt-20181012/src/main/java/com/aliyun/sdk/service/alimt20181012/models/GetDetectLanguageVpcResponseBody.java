// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alimt20181012.models;

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
 * {@link GetDetectLanguageVpcResponseBody} extends {@link TeaModel}
 *
 * <p>GetDetectLanguageVpcResponseBody</p>
 */
public class GetDetectLanguageVpcResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DetectedLanguage")
    private String detectedLanguage;

    @com.aliyun.core.annotation.NameInMap("LanguageProbabilities")
    private String languageProbabilities;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetDetectLanguageVpcResponseBody(Builder builder) {
        this.detectedLanguage = builder.detectedLanguage;
        this.languageProbabilities = builder.languageProbabilities;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDetectLanguageVpcResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetDetectLanguageVpcResponseBody model) {
            this.detectedLanguage = model.detectedLanguage;
            this.languageProbabilities = model.languageProbabilities;
            this.requestId = model.requestId;
        } 

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

        public GetDetectLanguageVpcResponseBody build() {
            return new GetDetectLanguageVpcResponseBody(this);
        } 

    } 

}
