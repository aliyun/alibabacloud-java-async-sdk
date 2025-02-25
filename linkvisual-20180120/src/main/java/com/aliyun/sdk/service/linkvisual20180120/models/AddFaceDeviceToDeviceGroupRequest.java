// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddFaceDeviceToDeviceGroupRequest} extends {@link RequestModel}
 *
 * <p>AddFaceDeviceToDeviceGroupRequest</p>
 */
public class AddFaceDeviceToDeviceGroupRequest extends Request {
    @Query
    @NameInMap("DeviceGroupId")
    @Validation(required = true)
    private String deviceGroupId;

    @Query
    @NameInMap("DeviceName")
    @Validation(required = true)
    private String deviceName;

    @Query
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    @Query
    @NameInMap("IsolationId")
    @Validation(required = true)
    private String isolationId;

    @Query
    @NameInMap("ProductKey")
    @Validation(required = true)
    private String productKey;

    private AddFaceDeviceToDeviceGroupRequest(Builder builder) {
        super(builder);
        this.deviceGroupId = builder.deviceGroupId;
        this.deviceName = builder.deviceName;
        this.iotInstanceId = builder.iotInstanceId;
        this.isolationId = builder.isolationId;
        this.productKey = builder.productKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddFaceDeviceToDeviceGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deviceGroupId
     */
    public String getDeviceGroupId() {
        return this.deviceGroupId;
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
     * @return isolationId
     */
    public String getIsolationId() {
        return this.isolationId;
    }

    /**
     * @return productKey
     */
    public String getProductKey() {
        return this.productKey;
    }

    public static final class Builder extends Request.Builder<AddFaceDeviceToDeviceGroupRequest, Builder> {
        private String deviceGroupId; 
        private String deviceName; 
        private String iotInstanceId; 
        private String isolationId; 
        private String productKey; 

        private Builder() {
            super();
        } 

        private Builder(AddFaceDeviceToDeviceGroupRequest request) {
            super(request);
            this.deviceGroupId = request.deviceGroupId;
            this.deviceName = request.deviceName;
            this.iotInstanceId = request.iotInstanceId;
            this.isolationId = request.isolationId;
            this.productKey = request.productKey;
        } 

        /**
         * DeviceGroupId.
         */
        public Builder deviceGroupId(String deviceGroupId) {
            this.putQueryParameter("DeviceGroupId", deviceGroupId);
            this.deviceGroupId = deviceGroupId;
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
         * IsolationId.
         */
        public Builder isolationId(String isolationId) {
            this.putQueryParameter("IsolationId", isolationId);
            this.isolationId = isolationId;
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

        @Override
        public AddFaceDeviceToDeviceGroupRequest build() {
            return new AddFaceDeviceToDeviceGroupRequest(this);
        } 

    } 

}
