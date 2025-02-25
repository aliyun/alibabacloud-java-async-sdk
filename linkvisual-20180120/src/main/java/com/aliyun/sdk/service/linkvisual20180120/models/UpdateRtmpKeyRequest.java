// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateRtmpKeyRequest} extends {@link RequestModel}
 *
 * <p>UpdateRtmpKeyRequest</p>
 */
public class UpdateRtmpKeyRequest extends Request {
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
    @NameInMap("ProductKey")
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

    private UpdateRtmpKeyRequest(Builder builder) {
        super(builder);
        this.deviceName = builder.deviceName;
        this.iotId = builder.iotId;
        this.iotInstanceId = builder.iotInstanceId;
        this.productKey = builder.productKey;
        this.pullAuthKey = builder.pullAuthKey;
        this.pullKeyExpireTime = builder.pullKeyExpireTime;
        this.pushAuthKey = builder.pushAuthKey;
        this.pushKeyExpireTime = builder.pushKeyExpireTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateRtmpKeyRequest create() {
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

    public static final class Builder extends Request.Builder<UpdateRtmpKeyRequest, Builder> {
        private String deviceName; 
        private String iotId; 
        private String iotInstanceId; 
        private String productKey; 
        private String pullAuthKey; 
        private Integer pullKeyExpireTime; 
        private String pushAuthKey; 
        private Integer pushKeyExpireTime; 

        private Builder() {
            super();
        } 

        private Builder(UpdateRtmpKeyRequest request) {
            super(request);
            this.deviceName = request.deviceName;
            this.iotId = request.iotId;
            this.iotInstanceId = request.iotInstanceId;
            this.productKey = request.productKey;
            this.pullAuthKey = request.pullAuthKey;
            this.pullKeyExpireTime = request.pullKeyExpireTime;
            this.pushAuthKey = request.pushAuthKey;
            this.pushKeyExpireTime = request.pushKeyExpireTime;
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

        @Override
        public UpdateRtmpKeyRequest build() {
            return new UpdateRtmpKeyRequest(this);
        } 

    } 

}
