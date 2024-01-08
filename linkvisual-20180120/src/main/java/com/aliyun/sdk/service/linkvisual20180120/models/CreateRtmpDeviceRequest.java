// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateRtmpDeviceRequest} extends {@link RequestModel}
 *
 * <p>CreateRtmpDeviceRequest</p>
 */
public class CreateRtmpDeviceRequest extends Request {
    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("DeviceName")
    private String deviceName;

    @Query
    @NameInMap("IotInstanceId")
    @Validation(required = true)
    private String iotInstanceId;

    @Query
    @NameInMap("ProductKey")
    @Validation(required = true)
    private String productKey;

    @Query
    @NameInMap("PullAuthKey")
    private String pullAuthKey;

    @Query
    @NameInMap("PullKeyExpireTime")
    private Integer pullKeyExpireTime;

    @Query
    @NameInMap("PushAuthKey")
    private String pushAuthKey;

    @Query
    @NameInMap("PushKeyExpireTime")
    private Integer pushKeyExpireTime;

    @Query
    @NameInMap("SubStreamName")
    private String subStreamName;

    private CreateRtmpDeviceRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.deviceName = builder.deviceName;
        this.iotInstanceId = builder.iotInstanceId;
        this.productKey = builder.productKey;
        this.pullAuthKey = builder.pullAuthKey;
        this.pullKeyExpireTime = builder.pullKeyExpireTime;
        this.pushAuthKey = builder.pushAuthKey;
        this.pushKeyExpireTime = builder.pushKeyExpireTime;
        this.subStreamName = builder.subStreamName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRtmpDeviceRequest create() {
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
     * @return pullAuthKey
     */
    public String getPullAuthKey() {
        return this.pullAuthKey;
    }

    /**
     * @return pullKeyExpireTime
     */
    public Integer getPullKeyExpireTime() {
        return this.pullKeyExpireTime;
    }

    /**
     * @return pushAuthKey
     */
    public String getPushAuthKey() {
        return this.pushAuthKey;
    }

    /**
     * @return pushKeyExpireTime
     */
    public Integer getPushKeyExpireTime() {
        return this.pushKeyExpireTime;
    }

    /**
     * @return subStreamName
     */
    public String getSubStreamName() {
        return this.subStreamName;
    }

    public static final class Builder extends Request.Builder<CreateRtmpDeviceRequest, Builder> {
        private String description; 
        private String deviceName; 
        private String iotInstanceId; 
        private String productKey; 
        private String pullAuthKey; 
        private Integer pullKeyExpireTime; 
        private String pushAuthKey; 
        private Integer pushKeyExpireTime; 
        private String subStreamName; 

        private Builder() {
            super();
        } 

        private Builder(CreateRtmpDeviceRequest request) {
            super(request);
            this.description = request.description;
            this.deviceName = request.deviceName;
            this.iotInstanceId = request.iotInstanceId;
            this.productKey = request.productKey;
            this.pullAuthKey = request.pullAuthKey;
            this.pullKeyExpireTime = request.pullKeyExpireTime;
            this.pushAuthKey = request.pushAuthKey;
            this.pushKeyExpireTime = request.pushKeyExpireTime;
            this.subStreamName = request.subStreamName;
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
         * PullAuthKey.
         */
        public Builder pullAuthKey(String pullAuthKey) {
            this.putQueryParameter("PullAuthKey", pullAuthKey);
            this.pullAuthKey = pullAuthKey;
            return this;
        }

        /**
         * PullKeyExpireTime.
         */
        public Builder pullKeyExpireTime(Integer pullKeyExpireTime) {
            this.putQueryParameter("PullKeyExpireTime", pullKeyExpireTime);
            this.pullKeyExpireTime = pullKeyExpireTime;
            return this;
        }

        /**
         * PushAuthKey.
         */
        public Builder pushAuthKey(String pushAuthKey) {
            this.putQueryParameter("PushAuthKey", pushAuthKey);
            this.pushAuthKey = pushAuthKey;
            return this;
        }

        /**
         * PushKeyExpireTime.
         */
        public Builder pushKeyExpireTime(Integer pushKeyExpireTime) {
            this.putQueryParameter("PushKeyExpireTime", pushKeyExpireTime);
            this.pushKeyExpireTime = pushKeyExpireTime;
            return this;
        }

        /**
         * SubStreamName.
         */
        public Builder subStreamName(String subStreamName) {
            this.putQueryParameter("SubStreamName", subStreamName);
            this.subStreamName = subStreamName;
            return this;
        }

        @Override
        public CreateRtmpDeviceRequest build() {
            return new CreateRtmpDeviceRequest(this);
        } 

    } 

}
