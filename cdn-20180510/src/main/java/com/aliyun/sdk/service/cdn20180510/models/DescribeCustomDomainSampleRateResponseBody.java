// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeCustomDomainSampleRateResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCustomDomainSampleRateResponseBody</p>
 */
public class DescribeCustomDomainSampleRateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Content")
    private Content content;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeCustomDomainSampleRateResponseBody(Builder builder) {
        this.content = builder.content;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCustomDomainSampleRateResponseBody create() {
        return builder().build();
    }

    /**
     * @return content
     */
    public Content getContent() {
        return this.content;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Content content; 
        private String requestId; 

        /**
         * Content.
         */
        public Builder content(Content content) {
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

        public DescribeCustomDomainSampleRateResponseBody build() {
            return new DescribeCustomDomainSampleRateResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCustomDomainSampleRateResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCustomDomainSampleRateResponseBody</p>
     */
    public static class DomainContent extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DomainName")
        private String domainName;

        @com.aliyun.core.annotation.NameInMap("SampleRate")
        private Float sampleRate;

        private DomainContent(Builder builder) {
            this.domainName = builder.domainName;
            this.sampleRate = builder.sampleRate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DomainContent create() {
            return builder().build();
        }

        /**
         * @return domainName
         */
        public String getDomainName() {
            return this.domainName;
        }

        /**
         * @return sampleRate
         */
        public Float getSampleRate() {
            return this.sampleRate;
        }

        public static final class Builder {
            private String domainName; 
            private Float sampleRate; 

            /**
             * DomainName.
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * SampleRate.
             */
            public Builder sampleRate(Float sampleRate) {
                this.sampleRate = sampleRate;
                return this;
            }

            public DomainContent build() {
                return new DomainContent(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCustomDomainSampleRateResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCustomDomainSampleRateResponseBody</p>
     */
    public static class Content extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DomainContent")
        private java.util.List < DomainContent> domainContent;

        private Content(Builder builder) {
            this.domainContent = builder.domainContent;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Content create() {
            return builder().build();
        }

        /**
         * @return domainContent
         */
        public java.util.List < DomainContent> getDomainContent() {
            return this.domainContent;
        }

        public static final class Builder {
            private java.util.List < DomainContent> domainContent; 

            /**
             * DomainContent.
             */
            public Builder domainContent(java.util.List < DomainContent> domainContent) {
                this.domainContent = domainContent;
                return this;
            }

            public Content build() {
                return new Content(this);
            } 

        } 

    }
}
