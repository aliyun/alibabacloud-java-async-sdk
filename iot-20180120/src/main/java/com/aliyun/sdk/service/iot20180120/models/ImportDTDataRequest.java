// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ImportDTDataRequest} extends {@link RequestModel}
 *
 * <p>ImportDTDataRequest</p>
 */
public class ImportDTDataRequest extends Request {
    @Body
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    @Body
    @NameInMap("Items")
    @Validation(required = true)
    private java.util.List < Items> items;

    @Body
    @NameInMap("ProductKey")
    @Validation(required = true)
    private String productKey;

    private ImportDTDataRequest(Builder builder) {
        super(builder);
        this.iotInstanceId = builder.iotInstanceId;
        this.items = builder.items;
        this.productKey = builder.productKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ImportDTDataRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    /**
     * @return items
     */
    public java.util.List < Items> getItems() {
        return this.items;
    }

    /**
     * @return productKey
     */
    public String getProductKey() {
        return this.productKey;
    }

    public static final class Builder extends Request.Builder<ImportDTDataRequest, Builder> {
        private String iotInstanceId; 
        private java.util.List < Items> items; 
        private String productKey; 

        private Builder() {
            super();
        } 

        private Builder(ImportDTDataRequest request) {
            super(request);
            this.iotInstanceId = request.iotInstanceId;
            this.items = request.items;
            this.productKey = request.productKey;
        } 

        /**
         * IotInstanceId.
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putBodyParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * Items.
         */
        public Builder items(java.util.List < Items> items) {
            this.putBodyParameter("Items", items);
            this.items = items;
            return this;
        }

        /**
         * ProductKey.
         */
        public Builder productKey(String productKey) {
            this.putBodyParameter("ProductKey", productKey);
            this.productKey = productKey;
            return this;
        }

        @Override
        public ImportDTDataRequest build() {
            return new ImportDTDataRequest(this);
        } 

    } 

    public static class Items extends TeaModel {
        @NameInMap("DeviceName")
        @Validation(required = true)
        private String deviceName;

        @NameInMap("Params")
        @Validation(required = true)
        private String params;

        private Items(Builder builder) {
            this.deviceName = builder.deviceName;
            this.params = builder.params;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return deviceName
         */
        public String getDeviceName() {
            return this.deviceName;
        }

        /**
         * @return params
         */
        public String getParams() {
            return this.params;
        }

        public static final class Builder {
            private String deviceName; 
            private String params; 

            /**
             * DeviceName.
             */
            public Builder deviceName(String deviceName) {
                this.deviceName = deviceName;
                return this;
            }

            /**
             * Params.
             */
            public Builder params(String params) {
                this.params = params;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
