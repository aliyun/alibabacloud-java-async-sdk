// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeApisecProtectionResourcesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeApisecProtectionResourcesResponseBody</p>
 */
public class DescribeApisecProtectionResourcesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List < Data> data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private DescribeApisecProtectionResourcesResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeApisecProtectionResourcesResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < Data> data; 
        private String requestId; 
        private Long totalCount; 

        /**
         * <p>The protected objects.</p>
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2EFCFE18-78F8-5079-B312-07***48B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeApisecProtectionResourcesResponseBody build() {
            return new DescribeApisecProtectionResourcesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeApisecProtectionResourcesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApisecProtectionResourcesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApisecStatus")
        private Long apisecStatus;

        @com.aliyun.core.annotation.NameInMap("ReportStatus")
        private Long reportStatus;

        @com.aliyun.core.annotation.NameInMap("Resource")
        private String resource;

        @com.aliyun.core.annotation.NameInMap("TraceStatus")
        private Long traceStatus;

        private Data(Builder builder) {
            this.apisecStatus = builder.apisecStatus;
            this.reportStatus = builder.reportStatus;
            this.resource = builder.resource;
            this.traceStatus = builder.traceStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return apisecStatus
         */
        public Long getApisecStatus() {
            return this.apisecStatus;
        }

        /**
         * @return reportStatus
         */
        public Long getReportStatus() {
            return this.reportStatus;
        }

        /**
         * @return resource
         */
        public String getResource() {
            return this.resource;
        }

        /**
         * @return traceStatus
         */
        public Long getTraceStatus() {
            return this.traceStatus;
        }

        public static final class Builder {
            private Long apisecStatus; 
            private Long reportStatus; 
            private String resource; 
            private Long traceStatus; 

            /**
             * <p>The switch of the API security module.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder apisecStatus(Long apisecStatus) {
                this.apisecStatus = apisecStatus;
                return this;
            }

            /**
             * <p>The switch of the compliance check feature.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder reportStatus(Long reportStatus) {
                this.reportStatus = reportStatus;
                return this;
            }

            /**
             * <p>The protected object.</p>
             * 
             * <strong>example:</strong>
             * <p>cwaf-***-waf</p>
             */
            public Builder resource(String resource) {
                this.resource = resource;
                return this;
            }

            /**
             * <p>The switch of the tracing and auditing feature.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder traceStatus(Long traceStatus) {
                this.traceStatus = traceStatus;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
