// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyOrderAutoRebootTimeResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyOrderAutoRebootTimeResponseBody</p>
 */
public class ModifyOrderAutoRebootTimeResponseBody extends TeaModel {
    @NameInMap("ModifyOrderAutoRebootTimeInfo")
    private ModifyOrderAutoRebootTimeInfo modifyOrderAutoRebootTimeInfo;

    @NameInMap("RequestId")
    private String requestId;

    private ModifyOrderAutoRebootTimeResponseBody(Builder builder) {
        this.modifyOrderAutoRebootTimeInfo = builder.modifyOrderAutoRebootTimeInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyOrderAutoRebootTimeResponseBody create() {
        return builder().build();
    }

    /**
     * @return modifyOrderAutoRebootTimeInfo
     */
    public ModifyOrderAutoRebootTimeInfo getModifyOrderAutoRebootTimeInfo() {
        return this.modifyOrderAutoRebootTimeInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ModifyOrderAutoRebootTimeInfo modifyOrderAutoRebootTimeInfo; 
        private String requestId; 

        /**
         * ModifyOrderAutoRebootTimeInfo.
         */
        public Builder modifyOrderAutoRebootTimeInfo(ModifyOrderAutoRebootTimeInfo modifyOrderAutoRebootTimeInfo) {
            this.modifyOrderAutoRebootTimeInfo = modifyOrderAutoRebootTimeInfo;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyOrderAutoRebootTimeResponseBody build() {
            return new ModifyOrderAutoRebootTimeResponseBody(this);
        } 

    } 

    public static class ModifyOrderAutoRebootTimeInfo extends TeaModel {
        @NameInMap("AutoRebootTime")
        private String autoRebootTime;

        @NameInMap("OrderId")
        private Long orderId;

        private ModifyOrderAutoRebootTimeInfo(Builder builder) {
            this.autoRebootTime = builder.autoRebootTime;
            this.orderId = builder.orderId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ModifyOrderAutoRebootTimeInfo create() {
            return builder().build();
        }

        /**
         * @return autoRebootTime
         */
        public String getAutoRebootTime() {
            return this.autoRebootTime;
        }

        /**
         * @return orderId
         */
        public Long getOrderId() {
            return this.orderId;
        }

        public static final class Builder {
            private String autoRebootTime; 
            private Long orderId; 

            /**
             * AutoRebootTime.
             */
            public Builder autoRebootTime(String autoRebootTime) {
                this.autoRebootTime = autoRebootTime;
                return this;
            }

            /**
             * OrderId.
             */
            public Builder orderId(Long orderId) {
                this.orderId = orderId;
                return this;
            }

            public ModifyOrderAutoRebootTimeInfo build() {
                return new ModifyOrderAutoRebootTimeInfo(this);
            } 

        } 

    }
}
