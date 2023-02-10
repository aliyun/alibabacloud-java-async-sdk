// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ClearDeviceDesiredPropertyRequest} extends {@link RequestModel}
 *
 * <p>ClearDeviceDesiredPropertyRequest</p>
 */
public class ClearDeviceDesiredPropertyRequest extends Request {
    @Query
    @NameInMap("DeviceName")
    private String deviceName;

    @Body
    @NameInMap("Identifies")
    private java.util.List < String > identifies;

    @Query
    @NameInMap("IotId")
    private String iotId;

    @Query
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    @Query
    @NameInMap("ProductKey")
    private String productKey;

    private ClearDeviceDesiredPropertyRequest(Builder builder) {
        super(builder);
        this.deviceName = builder.deviceName;
        this.identifies = builder.identifies;
        this.iotId = builder.iotId;
        this.iotInstanceId = builder.iotInstanceId;
        this.productKey = builder.productKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ClearDeviceDesiredPropertyRequest create() {
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
     * @return identifies
     */
    public java.util.List < String > getIdentifies() {
        return this.identifies;
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
     * @return productKey
     */
    public String getProductKey() {
        return this.productKey;
    }

    public static final class Builder extends Request.Builder<ClearDeviceDesiredPropertyRequest, Builder> {
        private String deviceName; 
        private java.util.List < String > identifies; 
        private String iotId; 
        private String iotInstanceId; 
        private String productKey; 

        private Builder() {
            super();
        } 

        private Builder(ClearDeviceDesiredPropertyRequest request) {
            super(request);
            this.deviceName = request.deviceName;
            this.identifies = request.identifies;
            this.iotId = request.iotId;
            this.iotInstanceId = request.iotInstanceId;
            this.productKey = request.productKey;
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
         * Identifies.
         */
        public Builder identifies(java.util.List < String > identifies) {
            this.putBodyParameter("Identifies", identifies);
            this.identifies = identifies;
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
         * ProductKey.
         */
        public Builder productKey(String productKey) {
            this.putQueryParameter("ProductKey", productKey);
            this.productKey = productKey;
            return this;
        }

        @Override
        public ClearDeviceDesiredPropertyRequest build() {
            return new ClearDeviceDesiredPropertyRequest(this);
        } 

    } 

}
