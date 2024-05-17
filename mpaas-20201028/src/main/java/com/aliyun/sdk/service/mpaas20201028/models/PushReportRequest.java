// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PushReportRequest} extends {@link RequestModel}
 *
 * <p>PushReportRequest</p>
 */
public class PushReportRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppVersion")
    private String appVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Channel")
    private String channel;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ConnectType")
    private String connectType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DeliveryToken")
    @com.aliyun.core.annotation.Validation(required = true)
    private String deliveryToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Imei")
    private String imei;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Imsi")
    private String imsi;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Model")
    private String model;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OsType")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 100)
    private Integer osType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PushVersion")
    private String pushVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ThirdChannel")
    @com.aliyun.core.annotation.Validation(maximum = 100)
    private Integer thirdChannel;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ThirdChannelDeviceToken")
    private String thirdChannelDeviceToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private PushReportRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.appId = builder.appId;
        this.appVersion = builder.appVersion;
        this.channel = builder.channel;
        this.connectType = builder.connectType;
        this.deliveryToken = builder.deliveryToken;
        this.imei = builder.imei;
        this.imsi = builder.imsi;
        this.model = builder.model;
        this.osType = builder.osType;
        this.pushVersion = builder.pushVersion;
        this.thirdChannel = builder.thirdChannel;
        this.thirdChannelDeviceToken = builder.thirdChannelDeviceToken;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PushReportRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return appVersion
     */
    public String getAppVersion() {
        return this.appVersion;
    }

    /**
     * @return channel
     */
    public String getChannel() {
        return this.channel;
    }

    /**
     * @return connectType
     */
    public String getConnectType() {
        return this.connectType;
    }

    /**
     * @return deliveryToken
     */
    public String getDeliveryToken() {
        return this.deliveryToken;
    }

    /**
     * @return imei
     */
    public String getImei() {
        return this.imei;
    }

    /**
     * @return imsi
     */
    public String getImsi() {
        return this.imsi;
    }

    /**
     * @return model
     */
    public String getModel() {
        return this.model;
    }

    /**
     * @return osType
     */
    public Integer getOsType() {
        return this.osType;
    }

    /**
     * @return pushVersion
     */
    public String getPushVersion() {
        return this.pushVersion;
    }

    /**
     * @return thirdChannel
     */
    public Integer getThirdChannel() {
        return this.thirdChannel;
    }

    /**
     * @return thirdChannelDeviceToken
     */
    public String getThirdChannelDeviceToken() {
        return this.thirdChannelDeviceToken;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<PushReportRequest, Builder> {
        private String regionId; 
        private String appId; 
        private String appVersion; 
        private String channel; 
        private String connectType; 
        private String deliveryToken; 
        private String imei; 
        private String imsi; 
        private String model; 
        private Integer osType; 
        private String pushVersion; 
        private Integer thirdChannel; 
        private String thirdChannelDeviceToken; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(PushReportRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.appId = request.appId;
            this.appVersion = request.appVersion;
            this.channel = request.channel;
            this.connectType = request.connectType;
            this.deliveryToken = request.deliveryToken;
            this.imei = request.imei;
            this.imsi = request.imsi;
            this.model = request.model;
            this.osType = request.osType;
            this.pushVersion = request.pushVersion;
            this.thirdChannel = request.thirdChannel;
            this.thirdChannelDeviceToken = request.thirdChannelDeviceToken;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.putBodyParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * AppVersion.
         */
        public Builder appVersion(String appVersion) {
            this.putBodyParameter("AppVersion", appVersion);
            this.appVersion = appVersion;
            return this;
        }

        /**
         * Channel.
         */
        public Builder channel(String channel) {
            this.putBodyParameter("Channel", channel);
            this.channel = channel;
            return this;
        }

        /**
         * ConnectType.
         */
        public Builder connectType(String connectType) {
            this.putBodyParameter("ConnectType", connectType);
            this.connectType = connectType;
            return this;
        }

        /**
         * DeliveryToken.
         */
        public Builder deliveryToken(String deliveryToken) {
            this.putBodyParameter("DeliveryToken", deliveryToken);
            this.deliveryToken = deliveryToken;
            return this;
        }

        /**
         * Imei.
         */
        public Builder imei(String imei) {
            this.putBodyParameter("Imei", imei);
            this.imei = imei;
            return this;
        }

        /**
         * Imsi.
         */
        public Builder imsi(String imsi) {
            this.putBodyParameter("Imsi", imsi);
            this.imsi = imsi;
            return this;
        }

        /**
         * Model.
         */
        public Builder model(String model) {
            this.putBodyParameter("Model", model);
            this.model = model;
            return this;
        }

        /**
         * OsType.
         */
        public Builder osType(Integer osType) {
            this.putBodyParameter("OsType", osType);
            this.osType = osType;
            return this;
        }

        /**
         * PushVersion.
         */
        public Builder pushVersion(String pushVersion) {
            this.putBodyParameter("PushVersion", pushVersion);
            this.pushVersion = pushVersion;
            return this;
        }

        /**
         * ThirdChannel.
         */
        public Builder thirdChannel(Integer thirdChannel) {
            this.putBodyParameter("ThirdChannel", thirdChannel);
            this.thirdChannel = thirdChannel;
            return this;
        }

        /**
         * ThirdChannelDeviceToken.
         */
        public Builder thirdChannelDeviceToken(String thirdChannelDeviceToken) {
            this.putBodyParameter("ThirdChannelDeviceToken", thirdChannelDeviceToken);
            this.thirdChannelDeviceToken = thirdChannelDeviceToken;
            return this;
        }

        /**
         * WorkspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putBodyParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public PushReportRequest build() {
            return new PushReportRequest(this);
        } 

    } 

}
