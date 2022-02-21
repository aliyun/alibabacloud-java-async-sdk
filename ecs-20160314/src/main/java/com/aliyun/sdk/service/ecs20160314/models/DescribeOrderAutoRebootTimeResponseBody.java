// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeOrderAutoRebootTimeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeOrderAutoRebootTimeResponseBody</p>
 */
public class DescribeOrderAutoRebootTimeResponseBody extends TeaModel {
    @NameInMap("DescribeOrderAutoRebootTimeInfo")
    private DescribeOrderAutoRebootTimeInfo describeOrderAutoRebootTimeInfo;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeOrderAutoRebootTimeResponseBody(Builder builder) {
        this.describeOrderAutoRebootTimeInfo = builder.describeOrderAutoRebootTimeInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeOrderAutoRebootTimeResponseBody create() {
        return builder().build();
    }

    /**
     * @return describeOrderAutoRebootTimeInfo
     */
    public DescribeOrderAutoRebootTimeInfo getDescribeOrderAutoRebootTimeInfo() {
        return this.describeOrderAutoRebootTimeInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private DescribeOrderAutoRebootTimeInfo describeOrderAutoRebootTimeInfo; 
        private String requestId; 

        /**
         * DescribeOrderAutoRebootTimeInfo.
         */
        public Builder describeOrderAutoRebootTimeInfo(DescribeOrderAutoRebootTimeInfo describeOrderAutoRebootTimeInfo) {
            this.describeOrderAutoRebootTimeInfo = describeOrderAutoRebootTimeInfo;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeOrderAutoRebootTimeResponseBody build() {
            return new DescribeOrderAutoRebootTimeResponseBody(this);
        } 

    } 

    public static class DescribeOrderAutoRebootTimeInfo extends TeaModel {
        @NameInMap("AutoRebootTime")
        private String autoRebootTime;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("OrderId")
        private Long orderId;

        private DescribeOrderAutoRebootTimeInfo(Builder builder) {
            this.autoRebootTime = builder.autoRebootTime;
            this.instanceId = builder.instanceId;
            this.orderId = builder.orderId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DescribeOrderAutoRebootTimeInfo create() {
            return builder().build();
        }

        /**
         * @return autoRebootTime
         */
        public String getAutoRebootTime() {
            return this.autoRebootTime;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return orderId
         */
        public Long getOrderId() {
            return this.orderId;
        }

        public static final class Builder {
            private String autoRebootTime; 
            private String instanceId; 
            private Long orderId; 

            /**
             * AutoRebootTime.
             */
            public Builder autoRebootTime(String autoRebootTime) {
                this.autoRebootTime = autoRebootTime;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * OrderId.
             */
            public Builder orderId(Long orderId) {
                this.orderId = orderId;
                return this;
            }

            public DescribeOrderAutoRebootTimeInfo build() {
                return new DescribeOrderAutoRebootTimeInfo(this);
            } 

        } 

    }
}
