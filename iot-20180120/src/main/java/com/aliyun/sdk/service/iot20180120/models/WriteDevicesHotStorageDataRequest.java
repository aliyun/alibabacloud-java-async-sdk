// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link WriteDevicesHotStorageDataRequest} extends {@link RequestModel}
 *
 * <p>WriteDevicesHotStorageDataRequest</p>
 */
public class WriteDevicesHotStorageDataRequest extends Request {
    @Query
    @NameInMap("DeviceName")
    private String deviceName;

    @Query
    @NameInMap("IotId")
    private String iotId;

    @Query
    @NameInMap("IotInstanceId")
    @Validation(required = true)
    private String iotInstanceId;

    @Query
    @NameInMap("Items")
    @Validation(required = true)
    private String items;

    @Query
    @NameInMap("ProductKey")
    private String productKey;

    @Query
    @NameInMap("UserTopic")
    @Validation(required = true)
    private String userTopic;

    private WriteDevicesHotStorageDataRequest(Builder builder) {
        super(builder);
        this.deviceName = builder.deviceName;
        this.iotId = builder.iotId;
        this.iotInstanceId = builder.iotInstanceId;
        this.items = builder.items;
        this.productKey = builder.productKey;
        this.userTopic = builder.userTopic;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static WriteDevicesHotStorageDataRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    /**
     * @return items
     */
    public String getItems() {
        return this.items;
    }

    /**
     * @return productKey
     */
    public String getProductKey() {
        return this.productKey;
    }

    /**
     * @return userTopic
     */
    public String getUserTopic() {
        return this.userTopic;
    }

    public static final class Builder extends Request.Builder<WriteDevicesHotStorageDataRequest, Builder> {
        private String deviceName; 
        private String iotId; 
        private String iotInstanceId; 
        private String items; 
        private String productKey; 
        private String userTopic; 

        private Builder() {
            super();
        } 

        private Builder(WriteDevicesHotStorageDataRequest request) {
            super(request);
            this.deviceName = request.deviceName;
            this.iotId = request.iotId;
            this.iotInstanceId = request.iotInstanceId;
            this.items = request.items;
            this.productKey = request.productKey;
            this.userTopic = request.userTopic;
        } 

        /**
         * DeviceName.
         */
        public Builder deviceName(String deviceName) {
            this.putQueryParameter("DeviceName", deviceName);
            this.deviceName = deviceName;
            return this;
        }

        /**
         * IotId.
         */
        public Builder iotId(String iotId) {
            this.putQueryParameter("IotId", iotId);
            this.iotId = iotId;
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
         * Items.
         */
        public Builder items(String items) {
            this.putQueryParameter("Items", items);
            this.items = items;
            return this;
        }

        /**
         * ProductKey.
         */
        public Builder productKey(String productKey) {
            this.putQueryParameter("ProductKey", productKey);
            this.productKey = productKey;
            return this;
        }

        /**
         * UserTopic.
         */
        public Builder userTopic(String userTopic) {
            this.putQueryParameter("UserTopic", userTopic);
            this.userTopic = userTopic;
            return this;
        }

        @Override
        public WriteDevicesHotStorageDataRequest build() {
            return new WriteDevicesHotStorageDataRequest(this);
        } 

    } 

}
