// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20230630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchBindDeviceResponseBody} extends {@link TeaModel}
 *
 * <p>BatchBindDeviceResponseBody</p>
 */
public class BatchBindDeviceResponseBody extends TeaModel {
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

    private BatchBindDeviceResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchBindDeviceResponseBody create() {
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

        public BatchBindDeviceResponseBody build() {
            return new BatchBindDeviceResponseBody(this);
        } 

    } 

    public static class BindDeviceList extends TeaModel {
        @NameInMap("BindResultCode")
        private Integer bindResultCode;

        @NameInMap("BindResultMessage")
        private String bindResultMessage;

        @NameInMap("DeviceName")
        private String deviceName;

        @NameInMap("IotId")
        private String iotId;

        @NameInMap("ProductKey")
        private String productKey;

        private BindDeviceList(Builder builder) {
            this.bindResultCode = builder.bindResultCode;
            this.bindResultMessage = builder.bindResultMessage;
            this.deviceName = builder.deviceName;
            this.iotId = builder.iotId;
            this.productKey = builder.productKey;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BindDeviceList create() {
            return builder().build();
        }

        /**
         * @return bindResultCode
         */
        public Integer getBindResultCode() {
            return this.bindResultCode;
        }

        /**
         * @return bindResultMessage
         */
        public String getBindResultMessage() {
            return this.bindResultMessage;
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
            private Integer bindResultCode; 
            private String bindResultMessage; 
            private String deviceName; 
            private String iotId; 
            private String productKey; 

            /**
             * BindResultCode.
             */
            public Builder bindResultCode(Integer bindResultCode) {
                this.bindResultCode = bindResultCode;
                return this;
            }

            /**
             * BindResultMessage.
             */
            public Builder bindResultMessage(String bindResultMessage) {
                this.bindResultMessage = bindResultMessage;
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

            public BindDeviceList build() {
                return new BindDeviceList(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("BindDeviceList")
        private java.util.List < BindDeviceList> bindDeviceList;

        private Data(Builder builder) {
            this.bindDeviceList = builder.bindDeviceList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return bindDeviceList
         */
        public java.util.List < BindDeviceList> getBindDeviceList() {
            return this.bindDeviceList;
        }

        public static final class Builder {
            private java.util.List < BindDeviceList> bindDeviceList; 

            /**
             * BindDeviceList.
             */
            public Builder bindDeviceList(java.util.List < BindDeviceList> bindDeviceList) {
                this.bindDeviceList = bindDeviceList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
