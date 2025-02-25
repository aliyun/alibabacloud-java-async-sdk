// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryGbSubDeviceListResponseBody} extends {@link TeaModel}
 *
 * <p>QueryGbSubDeviceListResponseBody</p>
 */
public class QueryGbSubDeviceListResponseBody extends TeaModel {
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

    private QueryGbSubDeviceListResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryGbSubDeviceListResponseBody create() {
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

        public QueryGbSubDeviceListResponseBody build() {
            return new QueryGbSubDeviceListResponseBody(this);
        } 

    } 

    public static class GbSubDeviceList extends TeaModel {
        @NameInMap("DeviceEnable")
        private Integer deviceEnable;

        @NameInMap("DeviceId")
        private String deviceId;

        @NameInMap("DeviceName")
        private String deviceName;

        @NameInMap("IotId")
        private String iotId;

        @NameInMap("ProductKey")
        private String productKey;

        private GbSubDeviceList(Builder builder) {
            this.deviceEnable = builder.deviceEnable;
            this.deviceId = builder.deviceId;
            this.deviceName = builder.deviceName;
            this.iotId = builder.iotId;
            this.productKey = builder.productKey;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GbSubDeviceList create() {
            return builder().build();
        }

        /**
         * @return deviceEnable
         */
        public Integer getDeviceEnable() {
            return this.deviceEnable;
        }

        /**
         * @return deviceId
         */
        public String getDeviceId() {
            return this.deviceId;
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

        public static final class Builder {
            private Integer deviceEnable; 
            private String deviceId; 
            private String deviceName; 
            private String iotId; 
            private String productKey; 

            /**
             * DeviceEnable.
             */
            public Builder deviceEnable(Integer deviceEnable) {
                this.deviceEnable = deviceEnable;
                return this;
            }

            /**
             * DeviceId.
             */
            public Builder deviceId(String deviceId) {
                this.deviceId = deviceId;
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

            public GbSubDeviceList build() {
                return new GbSubDeviceList(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("GbSubDeviceList")
        private java.util.List < GbSubDeviceList> gbSubDeviceList;

        @NameInMap("Total")
        private Integer total;

        private Data(Builder builder) {
            this.gbSubDeviceList = builder.gbSubDeviceList;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return gbSubDeviceList
         */
        public java.util.List < GbSubDeviceList> getGbSubDeviceList() {
            return this.gbSubDeviceList;
        }

        /**
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        public static final class Builder {
            private java.util.List < GbSubDeviceList> gbSubDeviceList; 
            private Integer total; 

            /**
             * GbSubDeviceList.
             */
            public Builder gbSubDeviceList(java.util.List < GbSubDeviceList> gbSubDeviceList) {
                this.gbSubDeviceList = gbSubDeviceList;
                return this;
            }

            /**
             * Total.
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
