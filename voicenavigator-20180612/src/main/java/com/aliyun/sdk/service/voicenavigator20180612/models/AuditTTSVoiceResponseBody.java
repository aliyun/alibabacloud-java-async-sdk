// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.voicenavigator20180612.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AuditTTSVoiceResponseBody} extends {@link TeaModel}
 *
 * <p>AuditTTSVoiceResponseBody</p>
 */
public class AuditTTSVoiceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AuditionUrl")
    private String auditionUrl;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private AuditTTSVoiceResponseBody(Builder builder) {
        this.auditionUrl = builder.auditionUrl;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AuditTTSVoiceResponseBody create() {
        return builder().build();
    }

    /**
     * @return auditionUrl
     */
    public String getAuditionUrl() {
        return this.auditionUrl;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String auditionUrl; 
        private String requestId; 

        /**
         * AuditionUrl.
         */
        public Builder auditionUrl(String auditionUrl) {
            this.auditionUrl = auditionUrl;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AuditTTSVoiceResponseBody build() {
            return new AuditTTSVoiceResponseBody(this);
        } 

    } 

}
