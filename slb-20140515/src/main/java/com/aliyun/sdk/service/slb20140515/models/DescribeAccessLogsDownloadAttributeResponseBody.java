// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.slb20140515.models;

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
 * {@link DescribeAccessLogsDownloadAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAccessLogsDownloadAttributeResponseBody</p>
 */
public class DescribeAccessLogsDownloadAttributeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LogsDownloadAttributes")
    private LogsDownloadAttributes logsDownloadAttributes;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeAccessLogsDownloadAttributeResponseBody(Builder builder) {
        this.logsDownloadAttributes = builder.logsDownloadAttributes;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAccessLogsDownloadAttributeResponseBody create() {
        return builder().build();
    }

    /**
     * @return logsDownloadAttributes
     */
    public LogsDownloadAttributes getLogsDownloadAttributes() {
        return this.logsDownloadAttributes;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
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
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private LogsDownloadAttributes logsDownloadAttributes; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * <p>The configuration of the access log.</p>
         */
        public Builder logsDownloadAttributes(LogsDownloadAttributes logsDownloadAttributes) {
            this.logsDownloadAttributes = logsDownloadAttributes;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>8B9DB03B-ED39-5DB8-9C9F-1ED5F548D61E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeAccessLogsDownloadAttributeResponseBody build() {
            return new DescribeAccessLogsDownloadAttributeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAccessLogsDownloadAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAccessLogsDownloadAttributeResponseBody</p>
     */
    public static class LogsDownloadAttribute extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LoadBalancerId")
        private String loadBalancerId;

        @com.aliyun.core.annotation.NameInMap("LogProject")
        private String logProject;

        @com.aliyun.core.annotation.NameInMap("LogStore")
        private String logStore;

        @com.aliyun.core.annotation.NameInMap("LogType")
        private String logType;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        private LogsDownloadAttribute(Builder builder) {
            this.loadBalancerId = builder.loadBalancerId;
            this.logProject = builder.logProject;
            this.logStore = builder.logStore;
            this.logType = builder.logType;
            this.region = builder.region;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LogsDownloadAttribute create() {
            return builder().build();
        }

        /**
         * @return loadBalancerId
         */
        public String getLoadBalancerId() {
            return this.loadBalancerId;
        }

        /**
         * @return logProject
         */
        public String getLogProject() {
            return this.logProject;
        }

        /**
         * @return logStore
         */
        public String getLogStore() {
            return this.logStore;
        }

        /**
         * @return logType
         */
        public String getLogType() {
            return this.logType;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        public static final class Builder {
            private String loadBalancerId; 
            private String logProject; 
            private String logStore; 
            private String logType; 
            private String region; 

            /**
             * <p>The CLB instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>lb-bp1b6c719dfa08ex*****</p>
             */
            public Builder loadBalancerId(String loadBalancerId) {
                this.loadBalancerId = loadBalancerId;
                return this;
            }

            /**
             * <p>The name of the Log Service project.</p>
             * 
             * <strong>example:</strong>
             * <p>test-log-project</p>
             */
            public Builder logProject(String logProject) {
                this.logProject = logProject;
                return this;
            }

            /**
             * <p>The name of the Logstore.</p>
             * 
             * <strong>example:</strong>
             * <p>test-log-store</p>
             */
            public Builder logStore(String logStore) {
                this.logStore = logStore;
                return this;
            }

            /**
             * <p>The type of access log. Only <strong>layer7</strong> is returned, which indicates Layer 7 access logs.</p>
             * 
             * <strong>example:</strong>
             * <p>layer7</p>
             */
            public Builder logType(String logType) {
                this.logType = logType;
                return this;
            }

            /**
             * <p>The region ID of the CLB instance.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            public LogsDownloadAttribute build() {
                return new LogsDownloadAttribute(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAccessLogsDownloadAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAccessLogsDownloadAttributeResponseBody</p>
     */
    public static class LogsDownloadAttributes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LogsDownloadAttribute")
        private java.util.List<LogsDownloadAttribute> logsDownloadAttribute;

        private LogsDownloadAttributes(Builder builder) {
            this.logsDownloadAttribute = builder.logsDownloadAttribute;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LogsDownloadAttributes create() {
            return builder().build();
        }

        /**
         * @return logsDownloadAttribute
         */
        public java.util.List<LogsDownloadAttribute> getLogsDownloadAttribute() {
            return this.logsDownloadAttribute;
        }

        public static final class Builder {
            private java.util.List<LogsDownloadAttribute> logsDownloadAttribute; 

            /**
             * LogsDownloadAttribute.
             */
            public Builder logsDownloadAttribute(java.util.List<LogsDownloadAttribute> logsDownloadAttribute) {
                this.logsDownloadAttribute = logsDownloadAttribute;
                return this;
            }

            public LogsDownloadAttributes build() {
                return new LogsDownloadAttributes(this);
            } 

        } 

    }
}
