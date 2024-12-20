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

        /**
         * PoolInfo.
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

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * ExectorUsage.
             */
            public Builder exectorUsage(Integer exectorUsage) {
                this.exectorUsage = exectorUsage;
                return this;
            }

            /**
             * IsDefault.
             */
            public Builder isDefault(Boolean isDefault) {
                this.isDefault = isDefault;
                return this;
            }

            /**
             * MaxExectorNum.
             */
            public Builder maxExectorNum(Integer maxExectorNum) {
                this.maxExectorNum = maxExectorNum;
                return this;
            }

            /**
             * PoolName.
             */
            public Builder poolName(String poolName) {
                this.poolName = poolName;
                return this;
            }

            /**
             * Priority.
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * Reason.
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * UpdateTime.
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
