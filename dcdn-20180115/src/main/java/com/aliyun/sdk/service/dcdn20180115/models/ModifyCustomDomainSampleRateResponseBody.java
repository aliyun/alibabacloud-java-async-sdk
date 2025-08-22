// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

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
 * {@link ModifyCustomDomainSampleRateResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyCustomDomainSampleRateResponseBody</p>
 */
public class ModifyCustomDomainSampleRateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Content")
    private java.util.List<Content> content;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ModifyCustomDomainSampleRateResponseBody(Builder builder) {
        this.content = builder.content;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyCustomDomainSampleRateResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return content
     */
    public java.util.List<Content> getContent() {
        return this.content;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Content> content; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ModifyCustomDomainSampleRateResponseBody model) {
            this.content = model.content;
            this.requestId = model.requestId;
        } 

        /**
         * Content.
         */
        public Builder content(java.util.List<Content> content) {
            this.content = content;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyCustomDomainSampleRateResponseBody build() {
            return new ModifyCustomDomainSampleRateResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ModifyCustomDomainSampleRateResponseBody} extends {@link TeaModel}
     *
     * <p>ModifyCustomDomainSampleRateResponseBody</p>
     */
    public static class Content extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DomainName")
        private String domainName;

        @com.aliyun.core.annotation.NameInMap("ErrMessage")
        private String errMessage;

        @com.aliyun.core.annotation.NameInMap("SampleRate")
        private Float sampleRate;

        private Content(Builder builder) {
            this.domainName = builder.domainName;
            this.errMessage = builder.errMessage;
            this.sampleRate = builder.sampleRate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Content create() {
            return builder().build();
        }

        /**
         * @return domainName
         */
        public String getDomainName() {
            return this.domainName;
        }

        /**
         * @return errMessage
         */
        public String getErrMessage() {
            return this.errMessage;
        }

        /**
         * @return sampleRate
         */
        public Float getSampleRate() {
            return this.sampleRate;
        }

        public static final class Builder {
            private String domainName; 
            private String errMessage; 
            private Float sampleRate; 

            private Builder() {
            } 

            private Builder(Content model) {
                this.domainName = model.domainName;
                this.errMessage = model.errMessage;
                this.sampleRate = model.sampleRate;
            } 

            /**
             * DomainName.
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * ErrMessage.
             */
            public Builder errMessage(String errMessage) {
                this.errMessage = errMessage;
                return this;
            }

            /**
             * SampleRate.
             */
            public Builder sampleRate(Float sampleRate) {
                this.sampleRate = sampleRate;
                return this;
            }

            public Content build() {
                return new Content(this);
            } 

        } 

    }
}
