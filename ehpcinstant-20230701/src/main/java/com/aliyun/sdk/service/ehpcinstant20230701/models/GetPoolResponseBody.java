// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpcinstant20230701.models;

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
 * {@link GetPoolResponseBody} extends {@link TeaModel}
 *
 * <p>GetPoolResponseBody</p>
 */
public class GetPoolResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PoolInfo")
    private PoolInfo poolInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetPoolResponseBody(Builder builder) {
        this.poolInfo = builder.poolInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPoolResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return poolInfo
     */
    public PoolInfo getPoolInfo() {
        return this.poolInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private PoolInfo poolInfo; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetPoolResponseBody model) {
            this.poolInfo = model.poolInfo;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The resource pool information.</p>
         */
        public Builder poolInfo(PoolInfo poolInfo) {
            this.poolInfo = poolInfo;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>896D338C-E4F4-41EC-A154-D605E5DE****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetPoolResponseBody build() {
            return new GetPoolResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetPoolResponseBody} extends {@link TeaModel}
     *
     * <p>GetPoolResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(Tags model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>TestKey</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>TestValue</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetPoolResponseBody} extends {@link TeaModel}
     *
     * <p>GetPoolResponseBody</p>
     */
    public static class PoolInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Creator")
        private String creator;

        @com.aliyun.core.annotation.NameInMap("ExecutorUsage")
        private Integer executorUsage;

        @com.aliyun.core.annotation.NameInMap("IsDefault")
        private Boolean isDefault;

        @com.aliyun.core.annotation.NameInMap("MaxExecutorNum")
        private Integer maxExecutorNum;

        @com.aliyun.core.annotation.NameInMap("PoolName")
        private String poolName;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private Integer priority;

        @com.aliyun.core.annotation.NameInMap("Reason")
        private String reason;

        @com.aliyun.core.annotation.NameInMap("SchedulingPolicyId")
        private String schedulingPolicyId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<Tags> tags;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        private PoolInfo(Builder builder) {
            this.createTime = builder.createTime;
            this.creator = builder.creator;
            this.executorUsage = builder.executorUsage;
            this.isDefault = builder.isDefault;
            this.maxExecutorNum = builder.maxExecutorNum;
            this.poolName = builder.poolName;
            this.priority = builder.priority;
            this.reason = builder.reason;
            this.schedulingPolicyId = builder.schedulingPolicyId;
            this.status = builder.status;
            this.tags = builder.tags;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PoolInfo create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return creator
         */
        public String getCreator() {
            return this.creator;
        }

        /**
         * @return executorUsage
         */
        public Integer getExecutorUsage() {
            return this.executorUsage;
        }

        /**
         * @return isDefault
         */
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        /**
         * @return maxExecutorNum
         */
        public Integer getMaxExecutorNum() {
            return this.maxExecutorNum;
        }

        /**
         * @return poolName
         */
        public String getPoolName() {
            return this.poolName;
        }

        /**
         * @return priority
         */
        public Integer getPriority() {
            return this.priority;
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        /**
         * @return schedulingPolicyId
         */
        public String getSchedulingPolicyId() {
            return this.schedulingPolicyId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tags
         */
        public java.util.List<Tags> getTags() {
            return this.tags;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String createTime; 
            private String creator; 
            private Integer executorUsage; 
            private Boolean isDefault; 
            private Integer maxExecutorNum; 
            private String poolName; 
            private Integer priority; 
            private String reason; 
            private String schedulingPolicyId; 
            private String status; 
            private java.util.List<Tags> tags; 
            private String updateTime; 

            private Builder() {
            } 

            private Builder(PoolInfo model) {
                this.createTime = model.createTime;
                this.creator = model.creator;
                this.executorUsage = model.executorUsage;
                this.isDefault = model.isDefault;
                this.maxExecutorNum = model.maxExecutorNum;
                this.poolName = model.poolName;
                this.priority = model.priority;
                this.reason = model.reason;
                this.schedulingPolicyId = model.schedulingPolicyId;
                this.status = model.status;
                this.tags = model.tags;
                this.updateTime = model.updateTime;
            } 

            /**
             * <p>The time when the resource pool was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-12-01 20:00:00</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The ID of the resource pool creator.</p>
             * 
             * <strong>example:</strong>
             * <p>200428053788xxxx</p>
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * <p>The number of executor nodes that are currently running in the resource pool.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder executorUsage(Integer executorUsage) {
                this.executorUsage = executorUsage;
                return this;
            }

            /**
             * <p>Indicates whether the resource pool is the default resource pool. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: Yes.</li>
             * <li><strong>false</strong>: No.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isDefault(Boolean isDefault) {
                this.isDefault = isDefault;
                return this;
            }

            /**
             * <p>The maximum number of executor nodes that can run concurrently in the resource pool.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder maxExecutorNum(Integer maxExecutorNum) {
                this.maxExecutorNum = maxExecutorNum;
                return this;
            }

            /**
             * <p>The resource pool name.</p>
             * <ul>
             * <li>The name can be up to 15 characters in length.</li>
             * <li>The name can contain digits, uppercase letters, lowercase letters, underscores (_), and periods (.).</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PoolTest</p>
             */
            public Builder poolName(String poolName) {
                this.poolName = poolName;
                return this;
            }

            /**
             * <p>The priority of the resource pool.</p>
             * <ul>
             * <li>Valid values: 1 to 99. Default value: 1, which indicates the lowest priority.</li>
             * <li>Jobs submitted to a resource pool with a higher priority value are scheduled before pending jobs in a resource pool with a lower priority value. The resource pool priority takes precedence over the job priority.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>The error reason.</p>
             * 
             * <strong>example:</strong>
             * <p>Fails to *** pool: ***.</p>
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * <p>The scheduling policy ID.</p>
             * 
             * <strong>example:</strong>
             * <p>policy-xxx</p>
             */
            public Builder schedulingPolicyId(String schedulingPolicyId) {
                this.schedulingPolicyId = schedulingPolicyId;
                return this;
            }

            /**
             * <p>The resource pool status. Valid values:</p>
             * <ul>
             * <li>Creating: The resource pool is being created.</li>
             * <li>Updating: The resource pool is being updated.</li>
             * <li>Deleting: The resource pool is being deleted.</li>
             * <li>Working: The resource pool is running.</li>
             * <li>Deleted: The resource pool has been deleted.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Working</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The tag information.</p>
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The time when the resource pool was last updated.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-12-01 20:00:00</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public PoolInfo build() {
                return new PoolInfo(this);
            } 

        } 

    }
}
