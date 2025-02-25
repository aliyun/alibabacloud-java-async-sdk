// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateGbDeviceRequest} extends {@link RequestModel}
 *
 * <p>UpdateGbDeviceRequest</p>
 */
public class UpdateGbDeviceRequest extends Request {
    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("DeviceName")
    private String deviceName;

    @Query
    @NameInMap("GbId")
    private String gbId;

    @Query
    @NameInMap("IotId")
    private String iotId;

    @Query
    @NameInMap("IotInstanceId")
    @Validation(required = true)
    private String iotInstanceId;

    @Query
    @NameInMap("Password")
    private String password;

    @Query
    @NameInMap("ProductKey")
    private String productKey;

    private UpdateGbDeviceRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.deviceName = builder.deviceName;
        this.gbId = builder.gbId;
        this.iotId = builder.iotId;
        this.iotInstanceId = builder.iotInstanceId;
        this.password = builder.password;
        this.productKey = builder.productKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateGbDeviceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return deviceName
     */
    public String getDeviceName() {
        return this.deviceName;
    }

    /**
     * @return gbId
     */
    public String getGbId() {
        return this.gbId;
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
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * @return productKey
     */
    public String getProductKey() {
        return this.productKey;
    }

    public static final class Builder extends Request.Builder<UpdateGbDeviceRequest, Builder> {
        private String description; 
        private String deviceName; 
        private String gbId; 
        private String iotId; 
        private String iotInstanceId; 
        private String password; 
        private String productKey; 

        private Builder() {
            super();
        } 

        private Builder(UpdateGbDeviceRequest request) {
            super(request);
            this.description = request.description;
            this.deviceName = request.deviceName;
            this.gbId = request.gbId;
            this.iotId = request.iotId;
            this.iotInstanceId = request.iotInstanceId;
            this.password = request.password;
            this.productKey = request.productKey;
        } 

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
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
         * GbId.
         */
        public Builder gbId(String gbId) {
            this.putQueryParameter("GbId", gbId);
            this.gbId = gbId;
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
         * Password.
         */
        public Builder password(String password) {
            this.putQueryParameter("Password", password);
            this.password = password;
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
        public UpdateGbDeviceRequest build() {
            return new UpdateGbDeviceRequest(this);
        } 

    } 

}
