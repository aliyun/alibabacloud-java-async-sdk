// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20230630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDeviceDetailResponseBody} extends {@link TeaModel}
 *
 * <p>QueryDeviceDetailResponseBody</p>
 */
public class QueryDeviceDetailResponseBody extends TeaModel {
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

    private QueryDeviceDetailResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDeviceDetailResponseBody create() {
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

        public QueryDeviceDetailResponseBody build() {
            return new QueryDeviceDetailResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("ActiveTime")
        private Long activeTime;

        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("DeviceName")
        private String deviceName;

        @NameInMap("DeviceSecret")
        private String deviceSecret;

        @NameInMap("FirmwareVersion")
        private String firmwareVersion;

        @NameInMap("IotId")
        private String iotId;

        @NameInMap("IpAddress")
        private String ipAddress;

        @NameInMap("Nickname")
        private String nickname;

        @NameInMap("NodeType")
        private Integer nodeType;

        @NameInMap("OnlineTime")
        private Long onlineTime;

        @NameInMap("ProductKey")
        private String productKey;

        @NameInMap("ProductName")
        private String productName;

        @NameInMap("Region")
        private String region;

        @NameInMap("Status")
        private String status;

        private Data(Builder builder) {
            this.activeTime = builder.activeTime;
            this.createTime = builder.createTime;
            this.deviceName = builder.deviceName;
            this.deviceSecret = builder.deviceSecret;
            this.firmwareVersion = builder.firmwareVersion;
            this.iotId = builder.iotId;
            this.ipAddress = builder.ipAddress;
            this.nickname = builder.nickname;
            this.nodeType = builder.nodeType;
            this.onlineTime = builder.onlineTime;
            this.productKey = builder.productKey;
            this.productName = builder.productName;
            this.region = builder.region;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return activeTime
         */
        public Long getActiveTime() {
            return this.activeTime;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return deviceName
         */
        public String getDeviceName() {
            return this.deviceName;
        }

        /**
         * @return deviceSecret
         */
        public String getDeviceSecret() {
            return this.deviceSecret;
        }

        /**
         * @return firmwareVersion
         */
        public String getFirmwareVersion() {
            return this.firmwareVersion;
        }

        /**
         * @return iotId
         */
        public String getIotId() {
            return this.iotId;
        }

        /**
         * @return ipAddress
         */
        public String getIpAddress() {
            return this.ipAddress;
        }

        /**
         * @return nickname
         */
        public String getNickname() {
            return this.nickname;
        }

        /**
         * @return nodeType
         */
        public Integer getNodeType() {
            return this.nodeType;
        }

        /**
         * @return onlineTime
         */
        public Long getOnlineTime() {
            return this.onlineTime;
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
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Long activeTime; 
            private Long createTime; 
            private String deviceName; 
            private String deviceSecret; 
            private String firmwareVersion; 
            private String iotId; 
            private String ipAddress; 
            private String nickname; 
            private Integer nodeType; 
            private Long onlineTime; 
            private String productKey; 
            private String productName; 
            private String region; 
            private String status; 

            /**
             * ActiveTime.
             */
            public Builder activeTime(Long activeTime) {
                this.activeTime = activeTime;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
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
             * DeviceSecret.
             */
            public Builder deviceSecret(String deviceSecret) {
                this.deviceSecret = deviceSecret;
                return this;
            }

            /**
             * FirmwareVersion.
             */
            public Builder firmwareVersion(String firmwareVersion) {
                this.firmwareVersion = firmwareVersion;
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
             * IpAddress.
             */
            public Builder ipAddress(String ipAddress) {
                this.ipAddress = ipAddress;
                return this;
            }

            /**
             * Nickname.
             */
            public Builder nickname(String nickname) {
                this.nickname = nickname;
                return this;
            }

            /**
             * NodeType.
             */
            public Builder nodeType(Integer nodeType) {
                this.nodeType = nodeType;
                return this;
            }

            /**
             * OnlineTime.
             */
            public Builder onlineTime(Long onlineTime) {
                this.onlineTime = onlineTime;
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
             * Region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
