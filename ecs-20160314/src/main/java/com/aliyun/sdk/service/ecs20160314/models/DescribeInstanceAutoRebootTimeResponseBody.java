// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstanceAutoRebootTimeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceAutoRebootTimeResponseBody</p>
 */
public class DescribeInstanceAutoRebootTimeResponseBody extends TeaModel {
    @NameInMap("AutoRebootInfos")
    private AutoRebootInfos autoRebootInfos;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeInstanceAutoRebootTimeResponseBody(Builder builder) {
        this.autoRebootInfos = builder.autoRebootInfos;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceAutoRebootTimeResponseBody create() {
        return builder().build();
    }

    /**
     * @return autoRebootInfos
     */
    public AutoRebootInfos getAutoRebootInfos() {
        return this.autoRebootInfos;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private AutoRebootInfos autoRebootInfos; 
        private String requestId; 

        /**
         * AutoRebootInfos.
         */
        public Builder autoRebootInfos(AutoRebootInfos autoRebootInfos) {
            this.autoRebootInfos = autoRebootInfos;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeInstanceAutoRebootTimeResponseBody build() {
            return new DescribeInstanceAutoRebootTimeResponseBody(this);
        } 

    } 

    public static class AutoRebootInfo extends TeaModel {
        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("LimitRebootTime")
        private String limitRebootTime;

        @NameInMap("OrderType")
        private String orderType;

        @NameInMap("RebootTime")
        private String rebootTime;

        private AutoRebootInfo(Builder builder) {
            this.instanceId = builder.instanceId;
            this.limitRebootTime = builder.limitRebootTime;
            this.orderType = builder.orderType;
            this.rebootTime = builder.rebootTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AutoRebootInfo create() {
            return builder().build();
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return limitRebootTime
         */
        public String getLimitRebootTime() {
            return this.limitRebootTime;
        }

        /**
         * @return orderType
         */
        public String getOrderType() {
            return this.orderType;
        }

        /**
         * @return rebootTime
         */
        public String getRebootTime() {
            return this.rebootTime;
        }

        public static final class Builder {
            private String instanceId; 
            private String limitRebootTime; 
            private String orderType; 
            private String rebootTime; 

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * LimitRebootTime.
             */
            public Builder limitRebootTime(String limitRebootTime) {
                this.limitRebootTime = limitRebootTime;
                return this;
            }

            /**
             * OrderType.
             */
            public Builder orderType(String orderType) {
                this.orderType = orderType;
                return this;
            }

            /**
             * RebootTime.
             */
            public Builder rebootTime(String rebootTime) {
                this.rebootTime = rebootTime;
                return this;
            }

            public AutoRebootInfo build() {
                return new AutoRebootInfo(this);
            } 

        } 

    }
    public static class AutoRebootInfos extends TeaModel {
        @NameInMap("AutoRebootInfo")
        private java.util.List < AutoRebootInfo> autoRebootInfo;

        private AutoRebootInfos(Builder builder) {
            this.autoRebootInfo = builder.autoRebootInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AutoRebootInfos create() {
            return builder().build();
        }

        /**
         * @return autoRebootInfo
         */
        public java.util.List < AutoRebootInfo> getAutoRebootInfo() {
            return this.autoRebootInfo;
        }

        public static final class Builder {
            private java.util.List < AutoRebootInfo> autoRebootInfo; 

            /**
             * AutoRebootInfo.
             */
            public Builder autoRebootInfo(java.util.List < AutoRebootInfo> autoRebootInfo) {
                this.autoRebootInfo = autoRebootInfo;
                return this;
            }

            public AutoRebootInfos build() {
                return new AutoRebootInfos(this);
            } 

        } 

    }
}
