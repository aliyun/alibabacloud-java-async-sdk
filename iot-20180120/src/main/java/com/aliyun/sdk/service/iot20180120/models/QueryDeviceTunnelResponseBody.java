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
 * {@link QueryDeviceTunnelResponseBody} extends {@link TeaModel}
 *
 * <p>QueryDeviceTunnelResponseBody</p>
 */
public class QueryDeviceTunnelResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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

        private Builder() {
        } 

        private Builder(QueryDeviceTunnelResponseBody model) {
            this.code = model.code;
            this.data = model.data;
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

    /**
     * 
     * {@link QueryDeviceTunnelResponseBody} extends {@link TeaModel}
     *
     * <p>QueryDeviceTunnelResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DeviceConnState")
        private String deviceConnState;

        @com.aliyun.core.annotation.NameInMap("DeviceName")
        private String deviceName;

        @com.aliyun.core.annotation.NameInMap("IotId")
        private String iotId;

        @com.aliyun.core.annotation.NameInMap("ProductKey")
        private String productKey;

        @com.aliyun.core.annotation.NameInMap("ProductName")
        private String productName;

        @com.aliyun.core.annotation.NameInMap("SourceConnState")
        private String sourceConnState;

        @com.aliyun.core.annotation.NameInMap("TunnelId")
        private String tunnelId;

        @com.aliyun.core.annotation.NameInMap("TunnelState")
        private String tunnelState;

        @com.aliyun.core.annotation.NameInMap("Udi")
        private String udi;

        @com.aliyun.core.annotation.NameInMap("UtcClosed")
        private String utcClosed;

        @com.aliyun.core.annotation.NameInMap("UtcCreated")
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.description = model.description;
                this.deviceConnState = model.deviceConnState;
                this.deviceName = model.deviceName;
                this.iotId = model.iotId;
                this.productKey = model.productKey;
                this.productName = model.productName;
                this.sourceConnState = model.sourceConnState;
                this.tunnelId = model.tunnelId;
                this.tunnelState = model.tunnelState;
                this.udi = model.udi;
                this.utcClosed = model.utcClosed;
                this.utcCreated = model.utcCreated;
            } 

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
