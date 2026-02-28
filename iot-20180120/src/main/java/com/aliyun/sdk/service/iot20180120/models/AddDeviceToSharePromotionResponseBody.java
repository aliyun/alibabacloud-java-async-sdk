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
 * {@link AddDeviceToSharePromotionResponseBody} extends {@link TeaModel}
 *
 * <p>AddDeviceToSharePromotionResponseBody</p>
 */
public class AddDeviceToSharePromotionResponseBody extends TeaModel {
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

    private AddDeviceToSharePromotionResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddDeviceToSharePromotionResponseBody create() {
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

        private Builder(AddDeviceToSharePromotionResponseBody model) {
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

        public AddDeviceToSharePromotionResponseBody build() {
            return new AddDeviceToSharePromotionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link AddDeviceToSharePromotionResponseBody} extends {@link TeaModel}
     *
     * <p>AddDeviceToSharePromotionResponseBody</p>
     */
    public static class Item extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeviceName")
        private String deviceName;

        @com.aliyun.core.annotation.NameInMap("FailCode")
        private Integer failCode;

        @com.aliyun.core.annotation.NameInMap("FailReason")
        private String failReason;

        @com.aliyun.core.annotation.NameInMap("ProductKey")
        private String productKey;

        private Item(Builder builder) {
            this.deviceName = builder.deviceName;
            this.failCode = builder.failCode;
            this.failReason = builder.failReason;
            this.productKey = builder.productKey;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Item create() {
            return builder().build();
        }

        /**
         * @return deviceName
         */
        public String getDeviceName() {
            return this.deviceName;
        }

        /**
         * @return failCode
         */
        public Integer getFailCode() {
            return this.failCode;
        }

        /**
         * @return failReason
         */
        public String getFailReason() {
            return this.failReason;
        }

        /**
         * @return productKey
         */
        public String getProductKey() {
            return this.productKey;
        }

        public static final class Builder {
            private String deviceName; 
            private Integer failCode; 
            private String failReason; 
            private String productKey; 

            private Builder() {
            } 

            private Builder(Item model) {
                this.deviceName = model.deviceName;
                this.failCode = model.failCode;
                this.failReason = model.failReason;
                this.productKey = model.productKey;
            } 

            /**
             * DeviceName.
             */
            public Builder deviceName(String deviceName) {
                this.deviceName = deviceName;
                return this;
            }

            /**
             * FailCode.
             */
            public Builder failCode(Integer failCode) {
                this.failCode = failCode;
                return this;
            }

            /**
             * FailReason.
             */
            public Builder failReason(String failReason) {
                this.failReason = failReason;
                return this;
            }

            /**
             * ProductKey.
             */
            public Builder productKey(String productKey) {
                this.productKey = productKey;
                return this;
            }

            public Item build() {
                return new Item(this);
            } 

        } 

    }
    /**
     * 
     * {@link AddDeviceToSharePromotionResponseBody} extends {@link TeaModel}
     *
     * <p>AddDeviceToSharePromotionResponseBody</p>
     */
    public static class FailDeviceSimpleInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("item")
        private java.util.List<Item> item;

        private FailDeviceSimpleInfoList(Builder builder) {
            this.item = builder.item;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FailDeviceSimpleInfoList create() {
            return builder().build();
        }

        /**
         * @return item
         */
        public java.util.List<Item> getItem() {
            return this.item;
        }

        public static final class Builder {
            private java.util.List<Item> item; 

            private Builder() {
            } 

            private Builder(FailDeviceSimpleInfoList model) {
                this.item = model.item;
            } 

            /**
             * item.
             */
            public Builder item(java.util.List<Item> item) {
                this.item = item;
                return this;
            }

            public FailDeviceSimpleInfoList build() {
                return new FailDeviceSimpleInfoList(this);
            } 

        } 

    }
    /**
     * 
     * {@link AddDeviceToSharePromotionResponseBody} extends {@link TeaModel}
     *
     * <p>AddDeviceToSharePromotionResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FailDeviceSimpleInfoList")
        private FailDeviceSimpleInfoList failDeviceSimpleInfoList;

        private Data(Builder builder) {
            this.failDeviceSimpleInfoList = builder.failDeviceSimpleInfoList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return failDeviceSimpleInfoList
         */
        public FailDeviceSimpleInfoList getFailDeviceSimpleInfoList() {
            return this.failDeviceSimpleInfoList;
        }

        public static final class Builder {
            private FailDeviceSimpleInfoList failDeviceSimpleInfoList; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.failDeviceSimpleInfoList = model.failDeviceSimpleInfoList;
            } 

            /**
             * FailDeviceSimpleInfoList.
             */
            public Builder failDeviceSimpleInfoList(FailDeviceSimpleInfoList failDeviceSimpleInfoList) {
                this.failDeviceSimpleInfoList = failDeviceSimpleInfoList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
