// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchGetEdgeInstanceDeviceDriverResponseBody} extends {@link TeaModel}
 *
 * <p>BatchGetEdgeInstanceDeviceDriverResponseBody</p>
 */
public class BatchGetEdgeInstanceDeviceDriverResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("DeviceDriverList")
    private java.util.List < DeviceDriverList> deviceDriverList;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private BatchGetEdgeInstanceDeviceDriverResponseBody(Builder builder) {
        this.code = builder.code;
        this.deviceDriverList = builder.deviceDriverList;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchGetEdgeInstanceDeviceDriverResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return deviceDriverList
     */
    public java.util.List < DeviceDriverList> getDeviceDriverList() {
        return this.deviceDriverList;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private java.util.List < DeviceDriverList> deviceDriverList; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * DeviceDriverList.
         */
        public Builder deviceDriverList(java.util.List < DeviceDriverList> deviceDriverList) {
            this.deviceDriverList = deviceDriverList;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public BatchGetEdgeInstanceDeviceDriverResponseBody build() {
            return new BatchGetEdgeInstanceDeviceDriverResponseBody(this);
        } 

    } 

    public static class DeviceDriverList extends TeaModel {
        @NameInMap("DriverId")
        private String driverId;

        @NameInMap("IotId")
        private String iotId;

        private DeviceDriverList(Builder builder) {
            this.driverId = builder.driverId;
            this.iotId = builder.iotId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeviceDriverList create() {
            return builder().build();
        }

        /**
         * @return driverId
         */
        public String getDriverId() {
            return this.driverId;
        }

        /**
         * @return iotId
         */
        public String getIotId() {
            return this.iotId;
        }

        public static final class Builder {
            private String driverId; 
            private String iotId; 

            /**
             * DriverId.
             */
            public Builder driverId(String driverId) {
                this.driverId = driverId;
                return this;
            }

            /**
             * IotId.
             */
            public Builder iotId(String iotId) {
                this.iotId = iotId;
                return this;
            }

            public DeviceDriverList build() {
                return new DeviceDriverList(this);
            } 

        } 

    }
}
