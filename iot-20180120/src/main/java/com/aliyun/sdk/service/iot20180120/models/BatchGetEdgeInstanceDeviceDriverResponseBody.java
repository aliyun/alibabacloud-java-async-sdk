// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

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
 * {@link BatchGetEdgeInstanceDeviceDriverResponseBody} extends {@link TeaModel}
 *
 * <p>BatchGetEdgeInstanceDeviceDriverResponseBody</p>
 */
public class BatchGetEdgeInstanceDeviceDriverResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("DeviceDriverList")
    private java.util.List<DeviceDriverList> deviceDriverList;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<DeviceDriverList> getDeviceDriverList() {
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
        private java.util.List<DeviceDriverList> deviceDriverList; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(BatchGetEdgeInstanceDeviceDriverResponseBody model) {
            this.code = model.code;
            this.deviceDriverList = model.deviceDriverList;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

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
        public Builder deviceDriverList(java.util.List<DeviceDriverList> deviceDriverList) {
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

    /**
     * 
     * {@link BatchGetEdgeInstanceDeviceDriverResponseBody} extends {@link TeaModel}
     *
     * <p>BatchGetEdgeInstanceDeviceDriverResponseBody</p>
     */
    public static class DeviceDriverList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DriverId")
        private String driverId;

        @com.aliyun.core.annotation.NameInMap("IotId")
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

            private Builder() {
            } 

            private Builder(DeviceDriverList model) {
                this.driverId = model.driverId;
                this.iotId = model.iotId;
            } 

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
