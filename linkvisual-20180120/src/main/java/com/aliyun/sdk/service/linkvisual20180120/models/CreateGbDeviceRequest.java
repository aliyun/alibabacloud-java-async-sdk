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
 * {@link CreateGbDeviceRequest} extends {@link RequestModel}
 *
 * <p>CreateGbDeviceRequest</p>
 */
public class CreateGbDeviceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeviceName")
    private String deviceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeviceType")
    private Integer deviceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GbId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String gbId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String iotInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MediaNetProtocol")
    private String mediaNetProtocol;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Password")
    @com.aliyun.core.annotation.Validation(required = true)
    private String password;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubProductKey")
    private String subProductKey;

    private CreateGbDeviceRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.deviceName = builder.deviceName;
        this.deviceType = builder.deviceType;
        this.gbId = builder.gbId;
        this.iotInstanceId = builder.iotInstanceId;
        this.mediaNetProtocol = builder.mediaNetProtocol;
        this.password = builder.password;
        this.productKey = builder.productKey;
        this.subProductKey = builder.subProductKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateGbDeviceRequest create() {
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
     * @return deviceType
     */
    public Integer getDeviceType() {
        return this.deviceType;
    }

    /**
     * @return gbId
     */
    public String getGbId() {
        return this.gbId;
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    /**
     * @return mediaNetProtocol
     */
    public String getMediaNetProtocol() {
        return this.mediaNetProtocol;
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

    /**
     * @return subProductKey
     */
    public String getSubProductKey() {
        return this.subProductKey;
    }

    public static final class Builder extends Request.Builder<CreateGbDeviceRequest, Builder> {
        private String description; 
        private String deviceName; 
        private Integer deviceType; 
        private String gbId; 
        private String iotInstanceId; 
        private String mediaNetProtocol; 
        private String password; 
        private String productKey; 
        private String subProductKey; 

        private Builder() {
            super();
        } 

        private Builder(CreateGbDeviceRequest request) {
            super(request);
            this.description = request.description;
            this.deviceName = request.deviceName;
            this.deviceType = request.deviceType;
            this.gbId = request.gbId;
            this.iotInstanceId = request.iotInstanceId;
            this.mediaNetProtocol = request.mediaNetProtocol;
            this.password = request.password;
            this.productKey = request.productKey;
            this.subProductKey = request.subProductKey;
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
         * DeviceType.
         */
        public Builder deviceType(Integer deviceType) {
            this.putQueryParameter("DeviceType", deviceType);
            this.deviceType = deviceType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder gbId(String gbId) {
            this.putQueryParameter("GbId", gbId);
            this.gbId = gbId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * MediaNetProtocol.
         */
        public Builder mediaNetProtocol(String mediaNetProtocol) {
            this.putQueryParameter("MediaNetProtocol", mediaNetProtocol);
            this.mediaNetProtocol = mediaNetProtocol;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder password(String password) {
            this.putQueryParameter("Password", password);
            this.password = password;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder productKey(String productKey) {
            this.putQueryParameter("ProductKey", productKey);
            this.productKey = productKey;
            return this;
        }

        /**
         * SubProductKey.
         */
        public Builder subProductKey(String subProductKey) {
            this.putQueryParameter("SubProductKey", subProductKey);
            this.subProductKey = subProductKey;
            return this;
        }

        @Override
        public CreateGbDeviceRequest build() {
            return new CreateGbDeviceRequest(this);
        } 

    } 

}
