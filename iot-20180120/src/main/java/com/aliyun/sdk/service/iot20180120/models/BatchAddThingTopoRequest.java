// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchAddThingTopoRequest} extends {@link RequestModel}
 *
 * <p>BatchAddThingTopoRequest</p>
 */
public class BatchAddThingTopoRequest extends Request {
    @Query
    @NameInMap("GwDeviceName")
    @Validation(required = true)
    private String gwDeviceName;

    @Query
    @NameInMap("GwProductKey")
    @Validation(required = true)
    private String gwProductKey;

    @Query
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    @Query
    @NameInMap("TopoAddItem")
    @Validation(required = true)
    private java.util.List < TopoAddItem> topoAddItem;

    private BatchAddThingTopoRequest(Builder builder) {
        super(builder);
        this.gwDeviceName = builder.gwDeviceName;
        this.gwProductKey = builder.gwProductKey;
        this.iotInstanceId = builder.iotInstanceId;
        this.topoAddItem = builder.topoAddItem;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchAddThingTopoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return gwDeviceName
     */
    public String getGwDeviceName() {
        return this.gwDeviceName;
    }

    /**
     * @return gwProductKey
     */
    public String getGwProductKey() {
        return this.gwProductKey;
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    /**
     * @return topoAddItem
     */
    public java.util.List < TopoAddItem> getTopoAddItem() {
        return this.topoAddItem;
    }

    public static final class Builder extends Request.Builder<BatchAddThingTopoRequest, Builder> {
        private String gwDeviceName; 
        private String gwProductKey; 
        private String iotInstanceId; 
        private java.util.List < TopoAddItem> topoAddItem; 

        private Builder() {
            super();
        } 

        private Builder(BatchAddThingTopoRequest request) {
            super(request);
            this.gwDeviceName = request.gwDeviceName;
            this.gwProductKey = request.gwProductKey;
            this.iotInstanceId = request.iotInstanceId;
            this.topoAddItem = request.topoAddItem;
        } 

        /**
         * GwDeviceName.
         */
        public Builder gwDeviceName(String gwDeviceName) {
            this.putQueryParameter("GwDeviceName", gwDeviceName);
            this.gwDeviceName = gwDeviceName;
            return this;
        }

        /**
         * GwProductKey.
         */
        public Builder gwProductKey(String gwProductKey) {
            this.putQueryParameter("GwProductKey", gwProductKey);
            this.gwProductKey = gwProductKey;
            return this;
        }

        /**
         * IotInstanceId.
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * TopoAddItem.
         */
        public Builder topoAddItem(java.util.List < TopoAddItem> topoAddItem) {
            this.putQueryParameter("TopoAddItem", topoAddItem);
            this.topoAddItem = topoAddItem;
            return this;
        }

        @Override
        public BatchAddThingTopoRequest build() {
            return new BatchAddThingTopoRequest(this);
        } 

    } 

    public static class TopoAddItem extends TeaModel {
        @NameInMap("ClientId")
        private String clientId;

        @NameInMap("DeviceName")
        @Validation(required = true)
        private String deviceName;

        @NameInMap("ProductKey")
        @Validation(required = true)
        private String productKey;

        @NameInMap("Sign")
        @Validation(required = true)
        private String sign;

        @NameInMap("SignMethod")
        @Validation(required = true)
        private String signMethod;

        @NameInMap("Timestamp")
        private String timestamp;

        private TopoAddItem(Builder builder) {
            this.clientId = builder.clientId;
            this.deviceName = builder.deviceName;
            this.productKey = builder.productKey;
            this.sign = builder.sign;
            this.signMethod = builder.signMethod;
            this.timestamp = builder.timestamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TopoAddItem create() {
            return builder().build();
        }

        /**
         * @return clientId
         */
        public String getClientId() {
            return this.clientId;
        }

        /**
         * @return deviceName
         */
        public String getDeviceName() {
            return this.deviceName;
        }

        /**
         * @return productKey
         */
        public String getProductKey() {
            return this.productKey;
        }

        /**
         * @return sign
         */
        public String getSign() {
            return this.sign;
        }

        /**
         * @return signMethod
         */
        public String getSignMethod() {
            return this.signMethod;
        }

        /**
         * @return timestamp
         */
        public String getTimestamp() {
            return this.timestamp;
        }

        public static final class Builder {
            private String clientId; 
            private String deviceName; 
            private String productKey; 
            private String sign; 
            private String signMethod; 
            private String timestamp; 

            /**
             * ClientId.
             */
            public Builder clientId(String clientId) {
                this.clientId = clientId;
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
             * ProductKey.
             */
            public Builder productKey(String productKey) {
                this.productKey = productKey;
                return this;
            }

            /**
             * Sign.
             */
            public Builder sign(String sign) {
                this.sign = sign;
                return this;
            }

            /**
             * SignMethod.
             */
            public Builder signMethod(String signMethod) {
                this.signMethod = signMethod;
                return this;
            }

            /**
             * Timestamp.
             */
            public Builder timestamp(String timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            public TopoAddItem build() {
                return new TopoAddItem(this);
            } 

        } 

    }
}
