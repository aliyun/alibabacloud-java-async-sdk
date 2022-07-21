// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateDeviceShadowRequest} extends {@link RequestModel}
 *
 * <p>UpdateDeviceShadowRequest</p>
 */
public class UpdateDeviceShadowRequest extends Request {
    @Query
    @NameInMap("DeltaUpdate")
    private Boolean deltaUpdate;

    @Query
    @NameInMap("DeviceName")
    @Validation(required = true)
    private String deviceName;

    @Query
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    @Query
    @NameInMap("ProductKey")
    @Validation(required = true)
    private String productKey;

    @Query
    @NameInMap("ShadowMessage")
    @Validation(required = true)
    private String shadowMessage;

    private UpdateDeviceShadowRequest(Builder builder) {
        super(builder);
        this.deltaUpdate = builder.deltaUpdate;
        this.deviceName = builder.deviceName;
        this.iotInstanceId = builder.iotInstanceId;
        this.productKey = builder.productKey;
        this.shadowMessage = builder.shadowMessage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDeviceShadowRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deltaUpdate
     */
    public Boolean getDeltaUpdate() {
        return this.deltaUpdate;
    }

    /**
     * @return deviceName
     */
    public String getDeviceName() {
        return this.deviceName;
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    /**
     * @return productKey
     */
    public String getProductKey() {
        return this.productKey;
    }

    /**
     * @return shadowMessage
     */
    public String getShadowMessage() {
        return this.shadowMessage;
    }

    public static final class Builder extends Request.Builder<UpdateDeviceShadowRequest, Builder> {
        private Boolean deltaUpdate; 
        private String deviceName; 
        private String iotInstanceId; 
        private String productKey; 
        private String shadowMessage; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDeviceShadowRequest request) {
            super(request);
            this.deltaUpdate = request.deltaUpdate;
            this.deviceName = request.deviceName;
            this.iotInstanceId = request.iotInstanceId;
            this.productKey = request.productKey;
            this.shadowMessage = request.shadowMessage;
        } 

        /**
         * DeltaUpdate.
         */
        public Builder deltaUpdate(Boolean deltaUpdate) {
            this.putQueryParameter("DeltaUpdate", deltaUpdate);
            this.deltaUpdate = deltaUpdate;
            return this;
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
         * IotInstanceId.
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
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
         * ShadowMessage.
         */
        public Builder shadowMessage(String shadowMessage) {
            this.putQueryParameter("ShadowMessage", shadowMessage);
            this.shadowMessage = shadowMessage;
            return this;
        }

        @Override
        public UpdateDeviceShadowRequest build() {
            return new UpdateDeviceShadowRequest(this);
        } 

    } 

}
