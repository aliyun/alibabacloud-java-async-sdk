// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

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
    private java.util.List<Data> data;

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
    public java.util.List<Data> getData() {
        return this.data;
    }

    public static final class Builder {
        private String pageNumber; 
        private String pageSize; 
        private String requestId; 
        private String totalCount; 
        private java.util.List<Data> data; 

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(String pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. Default value: 20.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(String pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>30637AD6-D977-4833-A54C-CC89483E****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>The returned results.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        public DescribeFirewallTemplateApplyResultsResponseBody build() {
            return new DescribeFirewallTemplateApplyResultsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeFirewallTemplateApplyResultsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeFirewallTemplateApplyResultsResponseBody</p>
     */
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
             * <p>The ID of the simple application server.</p>
             * 
             * <strong>example:</strong>
             * <p>33774babccc84003a2b1ad47e8001233</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The status of applying the firewall template to the simple application servers. Valid values:</p>
             * <ul>
             * <li>Running: The firewall template is being applied to the simple application servers.</li>
             * <li>Failed: The firewall template is applied to none of the simple application servers.</li>
             * <li>Success: The firewall template is applied to all the simple application servers.</li>
             * <li>PartFailed: The firewall template fails to be applied to some simple application servers.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Success</p>
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
    /**
     * 
     * {@link DescribeFirewallTemplateApplyResultsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeFirewallTemplateApplyResultsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("FailedCount")
        private String failedCount;

        @com.aliyun.core.annotation.NameInMap("FirewallTemplateId")
        private String firewallTemplateId;

        @com.aliyun.core.annotation.NameInMap("InstanceApplyResults")
        private java.util.List<InstanceApplyResults> instanceApplyResults;

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
        public java.util.List<InstanceApplyResults> getInstanceApplyResults() {
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
            private java.util.List<InstanceApplyResults> instanceApplyResults; 
            private String status; 
            private String taskId; 
            private String totalCount; 

            /**
             * <p>The time when the firewall template was applied to the simple application servers.</p>
             * 
             * <strong>example:</strong>
             * <p>Tue May 14 11:53:07 CST 2024</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The total number of simple application servers to which the firewall template fails to apply.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder failedCount(String failedCount) {
                this.failedCount = failedCount;
                return this;
            }

            /**
             * <p>The ID of the firewall template.</p>
             * 
             * <strong>example:</strong>
             * <p>ft-bcf1a7hrdq717****</p>
             */
            public Builder firewallTemplateId(String firewallTemplateId) {
                this.firewallTemplateId = firewallTemplateId;
                return this;
            }

            /**
             * <p>The result of applying the firewall template to the simple application servers.</p>
             */
            public Builder instanceApplyResults(java.util.List<InstanceApplyResults> instanceApplyResults) {
                this.instanceApplyResults = instanceApplyResults;
                return this;
            }

            /**
             * <p>The status of applying the template to all simple application servers. Valid values:</p>
             * <ul>
             * <li>Running: The firewall template is being applied to simple application servers.</li>
             * <li>Failed: The firewall template is applied to none of simple application servers.</li>
             * <li>Success: The firewall template is applied to all simple application servers.</li>
             * <li>PartFailed: The firewall template fails to be applied to some simple application servers.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Success</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The ID of the execution to apply the template.</p>
             * 
             * <strong>example:</strong>
             * <p>aft-ikgt0bynitvs3****</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
