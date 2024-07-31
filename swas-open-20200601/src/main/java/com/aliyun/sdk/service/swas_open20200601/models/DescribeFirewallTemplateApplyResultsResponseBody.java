// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeFirewallTemplateApplyResultsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeFirewallTemplateApplyResultsResponseBody</p>
 */
public class DescribeFirewallTemplateApplyResultsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private String pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private String pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private String totalCount;

    @com.aliyun.core.annotation.NameInMap("data")
    private java.util.List < Data> data;

    private DescribeFirewallTemplateApplyResultsResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.data = builder.data;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFirewallTemplateApplyResultsResponseBody create() {
        return builder().build();
    }

    /**
     * @return pageNumber
     */
    public String getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
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
    public String getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    public static final class Builder {
        private String pageNumber; 
        private String pageSize; 
        private String requestId; 
        private String totalCount; 
        private java.util.List < Data> data; 

        /**
         * The page number.
         */
        public Builder pageNumber(String pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page. Default value: 20.
         */
        public Builder pageSize(String pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * The returned results.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        public DescribeFirewallTemplateApplyResultsResponseBody build() {
            return new DescribeFirewallTemplateApplyResultsResponseBody(this);
        } 

    } 

    public static class InstanceApplyResults extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private InstanceApplyResults(Builder builder) {
            this.instanceId = builder.instanceId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceApplyResults create() {
            return builder().build();
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String instanceId; 
            private String status; 

            /**
             * The ID of the simple application server.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The status of applying the firewall template to the simple application servers. Valid values:
             * <p>
             * 
             * *   Running: The firewall template is being applied to the simple application servers.
             * *   Failed: The firewall template is applied to none of the simple application servers.
             * *   Success: The firewall template is applied to all the simple application servers.
             * *   PartFailed: The firewall template fails to be applied to some simple application servers.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public InstanceApplyResults build() {
                return new InstanceApplyResults(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("FailedCount")
        private String failedCount;

        @com.aliyun.core.annotation.NameInMap("FirewallTemplateId")
        private String firewallTemplateId;

        @com.aliyun.core.annotation.NameInMap("InstanceApplyResults")
        private java.util.List < InstanceApplyResults> instanceApplyResults;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private String totalCount;

        private Data(Builder builder) {
            this.createTime = builder.createTime;
            this.failedCount = builder.failedCount;
            this.firewallTemplateId = builder.firewallTemplateId;
            this.instanceApplyResults = builder.instanceApplyResults;
            this.status = builder.status;
            this.taskId = builder.taskId;
            this.totalCount = builder.totalCount;
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
         * @return failedCount
         */
        public String getFailedCount() {
            return this.failedCount;
        }

        /**
         * @return firewallTemplateId
         */
        public String getFirewallTemplateId() {
            return this.firewallTemplateId;
        }

        /**
         * @return instanceApplyResults
         */
        public java.util.List < InstanceApplyResults> getInstanceApplyResults() {
            return this.instanceApplyResults;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return totalCount
         */
        public String getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private String createTime; 
            private String failedCount; 
            private String firewallTemplateId; 
            private java.util.List < InstanceApplyResults> instanceApplyResults; 
            private String status; 
            private String taskId; 
            private String totalCount; 

            /**
             * The time when the firewall template was applied to the simple application servers.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The total number of simple application servers to which the firewall template fails to apply.
             */
            public Builder failedCount(String failedCount) {
                this.failedCount = failedCount;
                return this;
            }

            /**
             * The ID of the firewall template.
             */
            public Builder firewallTemplateId(String firewallTemplateId) {
                this.firewallTemplateId = firewallTemplateId;
                return this;
            }

            /**
             * The result of applying the firewall template to the simple application servers.
             */
            public Builder instanceApplyResults(java.util.List < InstanceApplyResults> instanceApplyResults) {
                this.instanceApplyResults = instanceApplyResults;
                return this;
            }

            /**
             * The status of applying the template to all simple application servers. Valid values:
             * <p>
             * 
             * *   Running: The firewall template is being applied to simple application servers.
             * *   Failed: The firewall template is applied to none of simple application servers.
             * *   Success: The firewall template is applied to all simple application servers.
             * *   PartFailed: The firewall template fails to be applied to some simple application servers.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The ID of the execution to apply the template.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * The total number of entries returned.
             */
            public Builder totalCount(String totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
