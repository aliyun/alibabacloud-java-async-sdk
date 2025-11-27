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
         * <p>The information about the resource pool.</p>
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
    public static class PoolInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("ExectorUsage")
        private Integer exectorUsage;

        @com.aliyun.core.annotation.NameInMap("IsDefault")
        private Boolean isDefault;

        @com.aliyun.core.annotation.NameInMap("MaxExectorNum")
        private Integer maxExectorNum;

        @com.aliyun.core.annotation.NameInMap("PoolName")
        private String poolName;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private Integer priority;

        @com.aliyun.core.annotation.NameInMap("Reason")
        private String reason;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        private PoolInfo(Builder builder) {
            this.createTime = builder.createTime;
            this.exectorUsage = builder.exectorUsage;
            this.isDefault = builder.isDefault;
            this.maxExectorNum = builder.maxExectorNum;
            this.poolName = builder.poolName;
            this.priority = builder.priority;
            this.reason = builder.reason;
            this.status = builder.status;
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
         * @return exectorUsage
         */
        public Integer getExectorUsage() {
            return this.exectorUsage;
        }

        /**
         * @return isDefault
         */
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        /**
         * @return maxExectorNum
         */
        public Integer getMaxExectorNum() {
            return this.maxExectorNum;
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
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String createTime; 
            private Integer exectorUsage; 
            private Boolean isDefault; 
            private Integer maxExectorNum; 
            private String poolName; 
            private Integer priority; 
            private String reason; 
            private String status; 
            private String updateTime; 

            private Builder() {
            } 

            private Builder(PoolInfo model) {
                this.createTime = model.createTime;
                this.exectorUsage = model.exectorUsage;
                this.isDefault = model.isDefault;
                this.maxExectorNum = model.maxExectorNum;
                this.poolName = model.poolName;
                this.priority = model.priority;
                this.reason = model.reason;
                this.status = model.status;
                this.updateTime = model.updateTime;
            } 

            /**
             * <p>The time when the resource pool is created.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-12-01 20:00:00</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The usage of execution nodes that are running in a resource pool.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder exectorUsage(Integer exectorUsage) {
                this.exectorUsage = exectorUsage;
                return this;
            }

            /**
             * <p>Indices whether the resource pool is the default resource pool. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
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
             * <p>The maximum number of execution nodes that can run concurrently in a resource pool.</p>
             * 
             * <strong>example:</strong>
             * <p>2000</p>
             */
            public Builder maxExectorNum(Integer maxExectorNum) {
                this.maxExectorNum = maxExectorNum;
                return this;
            }

            /**
             * <p>The name of the resource group.</p>
             * <ul>
             * <li>The value can be up to 15 characters in length.</li>
             * <li>It can contain digits, uppercase letters, lowercase letters, underscores (_), and dots (.).</li>
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
             * <li>You can set a priority in the range of 1 to 99. The default value is 1, which is the lowest priority.</li>
             * <li>Jobs submitted to a resource pool with a higher priority level value will be scheduled before pending jobs in a resource pool with a lower priority level value, and the priority level of the resource pool takes precedence over the priority of the job.</li>
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
             * <p>The cause of the error.</p>
             * 
             * <strong>example:</strong>
             * <p>Fails to *** pool: ***.</p>
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * <p>The status of the resource pool. Valid values:</p>
             * <ul>
             * <li>Creating: The resource pool is being created.</li>
             * <li>Updating: The resource pool is being updated.</li>
             * <li>Deleting: The resource pool is being deleted.</li>
             * <li>Working: The resource pool is working.</li>
             * <li>Deleted: The resource pool is deleted.</li>
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
             * <p>The time when the resource pool was updated.</p>
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
