// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

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
 * {@link QueryGbSubDeviceListResponseBody} extends {@link TeaModel}
 *
 * <p>QueryGbSubDeviceListResponseBody</p>
 */
public class QueryGbSubDeviceListResponseBody extends TeaModel {
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

        private Builder(QueryGbSubDeviceListResponseBody model) {
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

        public QueryGbSubDeviceListResponseBody build() {
            return new QueryGbSubDeviceListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryGbSubDeviceListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryGbSubDeviceListResponseBody</p>
     */
    public static class GbSubDeviceList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeviceEnable")
        private Integer deviceEnable;

        @com.aliyun.core.annotation.NameInMap("DeviceId")
        private String deviceId;

        @com.aliyun.core.annotation.NameInMap("DeviceName")
        private String deviceName;

        @com.aliyun.core.annotation.NameInMap("IotId")
        private String iotId;

        @com.aliyun.core.annotation.NameInMap("ProductKey")
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

            private Builder() {
            } 

            private Builder(GbSubDeviceList model) {
                this.deviceEnable = model.deviceEnable;
                this.deviceId = model.deviceId;
                this.deviceName = model.deviceName;
                this.iotId = model.iotId;
                this.productKey = model.productKey;
            } 

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
    /**
     * 
     * {@link QueryGbSubDeviceListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryGbSubDeviceListResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GbSubDeviceList")
        private java.util.List<GbSubDeviceList> gbSubDeviceList;

        @com.aliyun.core.annotation.NameInMap("Total")
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
        public java.util.List<GbSubDeviceList> getGbSubDeviceList() {
            return this.gbSubDeviceList;
        }

        /**
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        public static final class Builder {
            private java.util.List<GbSubDeviceList> gbSubDeviceList; 
            private Integer total; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.gbSubDeviceList = model.gbSubDeviceList;
                this.total = model.total;
            } 

            /**
             * GbSubDeviceList.
             */
            public Builder gbSubDeviceList(java.util.List<GbSubDeviceList> gbSubDeviceList) {
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
