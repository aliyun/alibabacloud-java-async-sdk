// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudwifi_pop20191118.models;

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
 * {@link SaveApPortalConfigRequest} extends {@link RequestModel}
 *
 * <p>SaveApPortalConfigRequest</p>
 */
public class SaveApPortalConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApConfigId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long apConfigId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppAuthUrl")
    private String appAuthUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthKey")
    private String authKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthSecret")
    private String authSecret;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CheckUrl")
    private String checkUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientDownload")
    private Integer clientDownload;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientUpload")
    private Integer clientUpload;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Countdown")
    private Integer countdown;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Network")
    private Integer network;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PortalTypes")
    private java.util.List<String> portalTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PortalUrl")
    private String portalUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TimeStamp")
    private Long timeStamp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TotalDownload")
    private Integer totalDownload;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TotalUpload")
    private Integer totalUpload;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WebAuthUrl")
    private String webAuthUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Whitelist")
    private String whitelist;

    private SaveApPortalConfigRequest(Builder builder) {
        super(builder);
        this.apConfigId = builder.apConfigId;
        this.appAuthUrl = builder.appAuthUrl;
        this.appCode = builder.appCode;
        this.appName = builder.appName;
        this.authKey = builder.authKey;
        this.authSecret = builder.authSecret;
        this.checkUrl = builder.checkUrl;
        this.clientDownload = builder.clientDownload;
        this.clientUpload = builder.clientUpload;
        this.countdown = builder.countdown;
        this.network = builder.network;
        this.portalTypes = builder.portalTypes;
        this.portalUrl = builder.portalUrl;
        this.timeStamp = builder.timeStamp;
        this.totalDownload = builder.totalDownload;
        this.totalUpload = builder.totalUpload;
        this.webAuthUrl = builder.webAuthUrl;
        this.whitelist = builder.whitelist;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveApPortalConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apConfigId
     */
    public Long getApConfigId() {
        return this.apConfigId;
    }

    /**
     * @return appAuthUrl
     */
    public String getAppAuthUrl() {
        return this.appAuthUrl;
    }

    /**
     * @return appCode
     */
    public String getAppCode() {
        return this.appCode;
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return authKey
     */
    public String getAuthKey() {
        return this.authKey;
    }

    /**
     * @return authSecret
     */
    public String getAuthSecret() {
        return this.authSecret;
    }

    /**
     * @return checkUrl
     */
    public String getCheckUrl() {
        return this.checkUrl;
    }

    /**
     * @return clientDownload
     */
    public Integer getClientDownload() {
        return this.clientDownload;
    }

    /**
     * @return clientUpload
     */
    public Integer getClientUpload() {
        return this.clientUpload;
    }

    /**
     * @return countdown
     */
    public Integer getCountdown() {
        return this.countdown;
    }

    /**
     * @return network
     */
    public Integer getNetwork() {
        return this.network;
    }

    /**
     * @return portalTypes
     */
    public java.util.List<String> getPortalTypes() {
        return this.portalTypes;
    }

    /**
     * @return portalUrl
     */
    public String getPortalUrl() {
        return this.portalUrl;
    }

    /**
     * @return timeStamp
     */
    public Long getTimeStamp() {
        return this.timeStamp;
    }

    /**
     * @return totalDownload
     */
    public Integer getTotalDownload() {
        return this.totalDownload;
    }

    /**
     * @return totalUpload
     */
    public Integer getTotalUpload() {
        return this.totalUpload;
    }

    /**
     * @return webAuthUrl
     */
    public String getWebAuthUrl() {
        return this.webAuthUrl;
    }

    /**
     * @return whitelist
     */
    public String getWhitelist() {
        return this.whitelist;
    }

    public static final class Builder extends Request.Builder<SaveApPortalConfigRequest, Builder> {
        private Long apConfigId; 
        private String appAuthUrl; 
        private String appCode; 
        private String appName; 
        private String authKey; 
        private String authSecret; 
        private String checkUrl; 
        private Integer clientDownload; 
        private Integer clientUpload; 
        private Integer countdown; 
        private Integer network; 
        private java.util.List<String> portalTypes; 
        private String portalUrl; 
        private Long timeStamp; 
        private Integer totalDownload; 
        private Integer totalUpload; 
        private String webAuthUrl; 
        private String whitelist; 

        private Builder() {
            super();
        } 

        private Builder(SaveApPortalConfigRequest request) {
            super(request);
            this.apConfigId = request.apConfigId;
            this.appAuthUrl = request.appAuthUrl;
            this.appCode = request.appCode;
            this.appName = request.appName;
            this.authKey = request.authKey;
            this.authSecret = request.authSecret;
            this.checkUrl = request.checkUrl;
            this.clientDownload = request.clientDownload;
            this.clientUpload = request.clientUpload;
            this.countdown = request.countdown;
            this.network = request.network;
            this.portalTypes = request.portalTypes;
            this.portalUrl = request.portalUrl;
            this.timeStamp = request.timeStamp;
            this.totalDownload = request.totalDownload;
            this.totalUpload = request.totalUpload;
            this.webAuthUrl = request.webAuthUrl;
            this.whitelist = request.whitelist;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder apConfigId(Long apConfigId) {
            this.putQueryParameter("ApConfigId", apConfigId);
            this.apConfigId = apConfigId;
            return this;
        }

        /**
         * AppAuthUrl.
         */
        public Builder appAuthUrl(String appAuthUrl) {
            this.putQueryParameter("AppAuthUrl", appAuthUrl);
            this.appAuthUrl = appAuthUrl;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder appCode(String appCode) {
            this.putQueryParameter("AppCode", appCode);
            this.appCode = appCode;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * AuthKey.
         */
        public Builder authKey(String authKey) {
            this.putQueryParameter("AuthKey", authKey);
            this.authKey = authKey;
            return this;
        }

        /**
         * AuthSecret.
         */
        public Builder authSecret(String authSecret) {
            this.putQueryParameter("AuthSecret", authSecret);
            this.authSecret = authSecret;
            return this;
        }

        /**
         * CheckUrl.
         */
        public Builder checkUrl(String checkUrl) {
            this.putQueryParameter("CheckUrl", checkUrl);
            this.checkUrl = checkUrl;
            return this;
        }

        /**
         * ClientDownload.
         */
        public Builder clientDownload(Integer clientDownload) {
            this.putQueryParameter("ClientDownload", clientDownload);
            this.clientDownload = clientDownload;
            return this;
        }

        /**
         * ClientUpload.
         */
        public Builder clientUpload(Integer clientUpload) {
            this.putQueryParameter("ClientUpload", clientUpload);
            this.clientUpload = clientUpload;
            return this;
        }

        /**
         * Countdown.
         */
        public Builder countdown(Integer countdown) {
            this.putQueryParameter("Countdown", countdown);
            this.countdown = countdown;
            return this;
        }

        /**
         * Network.
         */
        public Builder network(Integer network) {
            this.putQueryParameter("Network", network);
            this.network = network;
            return this;
        }

        /**
         * PortalTypes.
         */
        public Builder portalTypes(java.util.List<String> portalTypes) {
            String portalTypesShrink = shrink(portalTypes, "PortalTypes", "simple");
            this.putQueryParameter("PortalTypes", portalTypesShrink);
            this.portalTypes = portalTypes;
            return this;
        }

        /**
         * PortalUrl.
         */
        public Builder portalUrl(String portalUrl) {
            this.putQueryParameter("PortalUrl", portalUrl);
            this.portalUrl = portalUrl;
            return this;
        }

        /**
         * TimeStamp.
         */
        public Builder timeStamp(Long timeStamp) {
            this.putQueryParameter("TimeStamp", timeStamp);
            this.timeStamp = timeStamp;
            return this;
        }

        /**
         * TotalDownload.
         */
        public Builder totalDownload(Integer totalDownload) {
            this.putQueryParameter("TotalDownload", totalDownload);
            this.totalDownload = totalDownload;
            return this;
        }

        /**
         * TotalUpload.
         */
        public Builder totalUpload(Integer totalUpload) {
            this.putQueryParameter("TotalUpload", totalUpload);
            this.totalUpload = totalUpload;
            return this;
        }

        /**
         * WebAuthUrl.
         */
        public Builder webAuthUrl(String webAuthUrl) {
            this.putQueryParameter("WebAuthUrl", webAuthUrl);
            this.webAuthUrl = webAuthUrl;
            return this;
        }

        /**
         * Whitelist.
         */
        public Builder whitelist(String whitelist) {
            this.putQueryParameter("Whitelist", whitelist);
            this.whitelist = whitelist;
            return this;
        }

        @Override
        public SaveApPortalConfigRequest build() {
            return new SaveApPortalConfigRequest(this);
        } 

    } 

}
