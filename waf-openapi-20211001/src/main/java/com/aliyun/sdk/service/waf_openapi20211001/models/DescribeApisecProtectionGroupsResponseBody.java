// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

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
 * {@link DescribeApisecProtectionGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeApisecProtectionGroupsResponseBody</p>
 */
public class DescribeApisecProtectionGroupsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private DescribeApisecProtectionGroupsResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeApisecProtectionGroupsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
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
        private java.util.List<Data> data; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(DescribeApisecProtectionGroupsResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The protected object groups.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D7861F61-5B61-46CE-A47C-6B19****5EB0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of protected object groups.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeApisecProtectionGroupsResponseBody build() {
            return new DescribeApisecProtectionGroupsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeApisecProtectionGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApisecProtectionGroupsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApisecStatus")
        private Long apisecStatus;

        @com.aliyun.core.annotation.NameInMap("ReportStatus")
        private Long reportStatus;

        @com.aliyun.core.annotation.NameInMap("ResourceGroup")
        private String resourceGroup;

        @com.aliyun.core.annotation.NameInMap("TraceStatus")
        private Long traceStatus;

        private Data(Builder builder) {
            this.apisecStatus = builder.apisecStatus;
            this.reportStatus = builder.reportStatus;
            this.resourceGroup = builder.resourceGroup;
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
         * @return resourceGroup
         */
        public String getResourceGroup() {
            return this.resourceGroup;
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
            private String resourceGroup; 
            private Long traceStatus; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.apisecStatus = model.apisecStatus;
                this.reportStatus = model.reportStatus;
                this.resourceGroup = model.resourceGroup;
                this.traceStatus = model.traceStatus;
            } 

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
             * <p>0</p>
             */
            public Builder reportStatus(Long reportStatus) {
                this.reportStatus = reportStatus;
                return this;
            }

            /**
             * <p>The name of the protected object group.</p>
             * 
             * <strong>example:</strong>
             * <p>group1</p>
             */
            public Builder resourceGroup(String resourceGroup) {
                this.resourceGroup = resourceGroup;
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
