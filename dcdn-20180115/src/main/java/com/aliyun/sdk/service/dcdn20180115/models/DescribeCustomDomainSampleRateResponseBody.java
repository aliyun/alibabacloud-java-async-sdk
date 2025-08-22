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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeCustomDomainSampleRateResponseBody model) {
            this.content = model.content;
            this.requestId = model.requestId;
        } 

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

            private Builder() {
            } 

            private Builder(DomainContent model) {
                this.domainName = model.domainName;
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
        private java.util.List<DomainContent> domainContent;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Long pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Long pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Long totalCount;

        private Content(Builder builder) {
            this.domainContent = builder.domainContent;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
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
        public java.util.List<DomainContent> getDomainContent() {
            return this.domainContent;
        }

        /**
         * @return pageNumber
         */
        public Long getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public Long getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List<DomainContent> domainContent; 
            private Long pageNumber; 
            private Long pageSize; 
            private Long totalCount; 

            private Builder() {
            } 

            private Builder(Content model) {
                this.domainContent = model.domainContent;
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * DomainContent.
             */
            public Builder domainContent(java.util.List<DomainContent> domainContent) {
                this.domainContent = domainContent;
                return this;
            }

            /**
             * PageNumber.
             */
            public Builder pageNumber(Long pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Content build() {
                return new Content(this);
            } 

        } 

    }
}
