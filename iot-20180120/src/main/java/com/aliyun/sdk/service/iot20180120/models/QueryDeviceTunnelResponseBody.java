// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDeviceTunnelResponseBody} extends {@link TeaModel}
 *
 * <p>QueryDeviceTunnelResponseBody</p>
 */
public class QueryDeviceTunnelResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private QueryDeviceTunnelResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDeviceTunnelResponseBody create() {
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
        private Data data; 
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
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
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

        public QueryDeviceTunnelResponseBody build() {
            return new QueryDeviceTunnelResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("DeviceConnState")
        private String deviceConnState;

        @NameInMap("DeviceName")
        private String deviceName;

        @NameInMap("IotId")
        private String iotId;

        @NameInMap("ProductKey")
        private String productKey;

        @NameInMap("ProductName")
        private String productName;

        @NameInMap("SourceConnState")
        private String sourceConnState;

        @NameInMap("TunnelId")
        private String tunnelId;

        @NameInMap("TunnelState")
        private String tunnelState;

        @NameInMap("Udi")
        private String udi;

        @NameInMap("UtcClosed")
        private String utcClosed;

        @NameInMap("UtcCreated")
        private String utcCreated;

        private Data(Builder builder) {
            this.description = builder.description;
            this.deviceConnState = builder.deviceConnState;
            this.deviceName = builder.deviceName;
            this.iotId = builder.iotId;
            this.productKey = builder.productKey;
            this.productName = builder.productName;
            this.sourceConnState = builder.sourceConnState;
            this.tunnelId = builder.tunnelId;
            this.tunnelState = builder.tunnelState;
            this.udi = builder.udi;
            this.utcClosed = builder.utcClosed;
            this.utcCreated = builder.utcCreated;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return deviceConnState
         */
        public String getDeviceConnState() {
            return this.deviceConnState;
        }

        /**
         * @return deviceName
         */
        public String getDeviceName() {
            return this.deviceName;
        }

        /**
         * @return iotId
         */
        public String getIotId() {
            return this.iotId;
        }

        /**
         * @return productKey
         */
        public String getProductKey() {
            return this.productKey;
        }

        /**
         * @return productName
         */
        public String getProductName() {
            return this.productName;
        }

        /**
         * @return sourceConnState
         */
        public String getSourceConnState() {
            return this.sourceConnState;
        }

        /**
         * @return tunnelId
         */
        public String getTunnelId() {
            return this.tunnelId;
        }

        /**
         * @return tunnelState
         */
        public String getTunnelState() {
            return this.tunnelState;
        }

        /**
         * @return udi
         */
        public String getUdi() {
            return this.udi;
        }

        /**
         * @return utcClosed
         */
        public String getUtcClosed() {
            return this.utcClosed;
        }

        /**
         * @return utcCreated
         */
        public String getUtcCreated() {
            return this.utcCreated;
        }

        public static final class Builder {
            private String description; 
            private String deviceConnState; 
            private String deviceName; 
            private String iotId; 
            private String productKey; 
            private String productName; 
            private String sourceConnState; 
            private String tunnelId; 
            private String tunnelState; 
            private String udi; 
            private String utcClosed; 
            private String utcCreated; 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * DeviceConnState.
             */
            public Builder deviceConnState(String deviceConnState) {
                this.deviceConnState = deviceConnState;
                return this;
            }

            /**
             * DeviceName.
             */
            public Builder deviceName(String deviceName) {
                this.deviceName = deviceName;
                return this;
            }

            /**
             * IotId.
             */
            public Builder iotId(String iotId) {
                this.iotId = iotId;
                return this;
            }

            /**
             * ProductKey.
             */
            public Builder productKey(String productKey) {
                this.productKey = productKey;
                return this;
            }

            /**
             * ProductName.
             */
            public Builder productName(String productName) {
                this.productName = productName;
                return this;
            }

            /**
             * SourceConnState.
             */
            public Builder sourceConnState(String sourceConnState) {
                this.sourceConnState = sourceConnState;
                return this;
            }

            /**
             * TunnelId.
             */
            public Builder tunnelId(String tunnelId) {
                this.tunnelId = tunnelId;
                return this;
            }

            /**
             * TunnelState.
             */
            public Builder tunnelState(String tunnelState) {
                this.tunnelState = tunnelState;
                return this;
            }

            /**
             * Udi.
             */
            public Builder udi(String udi) {
                this.udi = udi;
                return this;
            }

            /**
             * UtcClosed.
             */
            public Builder utcClosed(String utcClosed) {
                this.utcClosed = utcClosed;
                return this;
            }

            /**
             * UtcCreated.
             */
            public Builder utcCreated(String utcCreated) {
                this.utcCreated = utcCreated;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
