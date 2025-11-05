// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

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
 * {@link DescribeCdnSubListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCdnSubListResponseBody</p>
 */
public class DescribeCdnSubListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Content")
    private Content content;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeCdnSubListResponseBody(Builder builder) {
        this.content = builder.content;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCdnSubListResponseBody create() {
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

        private Builder(DescribeCdnSubListResponseBody model) {
            this.content = model.content;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The information about the custom report task.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;RequestId&quot;:&quot;3250A51D-C11D-46BA-B6B3-95348EEDE652&quot;,&quot;Description&quot;:&quot;Successful&quot;,&quot;Content&quot;:{&quot;data&quot;:[{&quot;subId&quot;:5,&quot;reportId&quot;:[1,2,3],&quot;createTime&quot;:&quot;2020-09-25T09:39:33Z&quot;,&quot;domains&quot;[&quot;<a href="http://www.example.com%22,%22www.example.com%22%5D,%22effectiveFrom%22:%222020-09-17T00:00:00Z%22,%22effectiveEnd%22:%222020-11-17T00:00:00Z%22,%22status%22:%22enable%22%7D%5D%7D%7D">www.example.com&quot;,&quot;www.example.com&quot;],&quot;effectiveFrom&quot;:&quot;2020-09-17T00:00:00Z&quot;,&quot;effectiveEnd&quot;:&quot;2020-11-17T00:00:00Z&quot;,&quot;status&quot;:&quot;enable&quot;}]}}</a></p>
         */
        public Builder content(Content content) {
            this.content = content;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>3250A51D-C11D-46BA-B6B3-95348EEDE652</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeCdnSubListResponseBody build() {
            return new DescribeCdnSubListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCdnSubListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCdnSubListResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("createTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("domains")
        private java.util.List<String> domains;

        @com.aliyun.core.annotation.NameInMap("effectiveEnd")
        private String effectiveEnd;

        @com.aliyun.core.annotation.NameInMap("effectiveFrom")
        private String effectiveFrom;

        @com.aliyun.core.annotation.NameInMap("reportId")
        private java.util.List<Long> reportId;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("subId")
        private Long subId;

        private Data(Builder builder) {
            this.createTime = builder.createTime;
            this.domains = builder.domains;
            this.effectiveEnd = builder.effectiveEnd;
            this.effectiveFrom = builder.effectiveFrom;
            this.reportId = builder.reportId;
            this.status = builder.status;
            this.subId = builder.subId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return domains
         */
        public java.util.List<String> getDomains() {
            return this.domains;
        }

        /**
         * @return effectiveEnd
         */
        public String getEffectiveEnd() {
            return this.effectiveEnd;
        }

        /**
         * @return effectiveFrom
         */
        public String getEffectiveFrom() {
            return this.effectiveFrom;
        }

        /**
         * @return reportId
         */
        public java.util.List<Long> getReportId() {
            return this.reportId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return subId
         */
        public Long getSubId() {
            return this.subId;
        }

        public static final class Builder {
            private String createTime; 
            private java.util.List<String> domains; 
            private String effectiveEnd; 
            private String effectiveFrom; 
            private java.util.List<Long> reportId; 
            private String status; 
            private Long subId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.createTime = model.createTime;
                this.domains = model.domains;
                this.effectiveEnd = model.effectiveEnd;
                this.effectiveFrom = model.effectiveFrom;
                this.reportId = model.reportId;
                this.status = model.status;
                this.subId = model.subId;
            } 

            /**
             * createTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * domains.
             */
            public Builder domains(java.util.List<String> domains) {
                this.domains = domains;
                return this;
            }

            /**
             * effectiveEnd.
             */
            public Builder effectiveEnd(String effectiveEnd) {
                this.effectiveEnd = effectiveEnd;
                return this;
            }

            /**
             * effectiveFrom.
             */
            public Builder effectiveFrom(String effectiveFrom) {
                this.effectiveFrom = effectiveFrom;
                return this;
            }

            /**
             * reportId.
             */
            public Builder reportId(java.util.List<Long> reportId) {
                this.reportId = reportId;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * subId.
             */
            public Builder subId(Long subId) {
                this.subId = subId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCdnSubListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCdnSubListResponseBody</p>
     */
    public static class Content extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("data")
        private java.util.List<Data> data;

        private Content(Builder builder) {
            this.data = builder.data;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Content create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public java.util.List<Data> getData() {
            return this.data;
        }

        public static final class Builder {
            private java.util.List<Data> data; 

            private Builder() {
            } 

            private Builder(Content model) {
                this.data = model.data;
            } 

            /**
             * data.
             */
            public Builder data(java.util.List<Data> data) {
                this.data = data;
                return this;
            }

            public Content build() {
                return new Content(this);
            } 

        } 

    }
}
