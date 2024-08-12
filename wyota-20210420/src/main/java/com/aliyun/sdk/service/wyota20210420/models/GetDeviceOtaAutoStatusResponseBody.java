// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wyota20210420.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDeviceOtaAutoStatusResponseBody} extends {@link TeaModel}
 *
 * <p>GetDeviceOtaAutoStatusResponseBody</p>
 */
public class GetDeviceOtaAutoStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetDeviceOtaAutoStatusResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDeviceOtaAutoStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetDeviceOtaAutoStatusResponseBody build() {
            return new GetDeviceOtaAutoStatusResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoUpdate")
        private Integer autoUpdate;

        @com.aliyun.core.annotation.NameInMap("AutoUpdateTimeSchedule")
        private String autoUpdateTimeSchedule;

        @com.aliyun.core.annotation.NameInMap("ForceUpgrade")
        private Integer forceUpgrade;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        private Data(Builder builder) {
            this.autoUpdate = builder.autoUpdate;
            this.autoUpdateTimeSchedule = builder.autoUpdateTimeSchedule;
            this.forceUpgrade = builder.forceUpgrade;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return autoUpdate
         */
        public Integer getAutoUpdate() {
            return this.autoUpdate;
        }

        /**
         * @return autoUpdateTimeSchedule
         */
        public String getAutoUpdateTimeSchedule() {
            return this.autoUpdateTimeSchedule;
        }

        /**
         * @return forceUpgrade
         */
        public Integer getForceUpgrade() {
            return this.forceUpgrade;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Integer autoUpdate; 
            private String autoUpdateTimeSchedule; 
            private Integer forceUpgrade; 
            private Integer status; 

            /**
             * AutoUpdate.
             */
            public Builder autoUpdate(Integer autoUpdate) {
                this.autoUpdate = autoUpdate;
                return this;
            }

            /**
             * AutoUpdateTimeSchedule.
             */
            public Builder autoUpdateTimeSchedule(String autoUpdateTimeSchedule) {
                this.autoUpdateTimeSchedule = autoUpdateTimeSchedule;
                return this;
            }

            /**
             * ForceUpgrade.
             */
            public Builder forceUpgrade(Integer forceUpgrade) {
                this.forceUpgrade = forceUpgrade;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
