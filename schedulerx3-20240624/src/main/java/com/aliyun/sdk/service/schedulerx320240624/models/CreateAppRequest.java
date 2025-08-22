// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.schedulerx320240624.models;

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
 * {@link CreateAppRequest} extends {@link RequestModel}
 *
 * <p>CreateAppRequest</p>
 */
public class CreateAppRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AccessToken")
    @com.aliyun.core.annotation.Validation(maxLength = 32, minLength = 6)
    private String accessToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppName")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64, minLength = 1)
    private String appName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppType")
    private Integer appType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EnableLog")
    private Boolean enableLog;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LabelRouteStrategy")
    private Integer labelRouteStrategy;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaxConcurrency")
    private Integer maxConcurrency;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Title")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64, minLength = 1)
    private String title;

    private CreateAppRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.accessToken = builder.accessToken;
        this.appName = builder.appName;
        this.appType = builder.appType;
        this.clusterId = builder.clusterId;
        this.enableLog = builder.enableLog;
        this.labelRouteStrategy = builder.labelRouteStrategy;
        this.maxConcurrency = builder.maxConcurrency;
        this.title = builder.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAppRequest create() {
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
     * @return accessToken
     */
    public String getAccessToken() {
        return this.accessToken;
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return appType
     */
    public Integer getAppType() {
        return this.appType;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return enableLog
     */
    public Boolean getEnableLog() {
        return this.enableLog;
    }

    /**
     * @return labelRouteStrategy
     */
    public Integer getLabelRouteStrategy() {
        return this.labelRouteStrategy;
    }

    /**
     * @return maxConcurrency
     */
    public Integer getMaxConcurrency() {
        return this.maxConcurrency;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    public static final class Builder extends Request.Builder<CreateAppRequest, Builder> {
        private String regionId; 
        private String accessToken; 
        private String appName; 
        private Integer appType; 
        private String clusterId; 
        private Boolean enableLog; 
        private Integer labelRouteStrategy; 
        private Integer maxConcurrency; 
        private String title; 

        private Builder() {
            super();
        } 

        private Builder(CreateAppRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.accessToken = request.accessToken;
            this.appName = request.appName;
            this.appType = request.appType;
            this.clusterId = request.clusterId;
            this.enableLog = request.enableLog;
            this.labelRouteStrategy = request.labelRouteStrategy;
            this.maxConcurrency = request.maxConcurrency;
            this.title = request.title;
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
         * AccessToken.
         */
        public Builder accessToken(String accessToken) {
            this.putBodyParameter("AccessToken", accessToken);
            this.accessToken = accessToken;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test-app</p>
         */
        public Builder appName(String appName) {
            this.putBodyParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * AppType.
         */
        public Builder appType(Integer appType) {
            this.putBodyParameter("AppType", appType);
            this.appType = appType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>xxljob-b6ec1xxxx</p>
         */
        public Builder clusterId(String clusterId) {
            this.putBodyParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * EnableLog.
         */
        public Builder enableLog(Boolean enableLog) {
            this.putBodyParameter("EnableLog", enableLog);
            this.enableLog = enableLog;
            return this;
        }

        /**
         * LabelRouteStrategy.
         */
        public Builder labelRouteStrategy(Integer labelRouteStrategy) {
            this.putBodyParameter("LabelRouteStrategy", labelRouteStrategy);
            this.labelRouteStrategy = labelRouteStrategy;
            return this;
        }

        /**
         * MaxConcurrency.
         */
        public Builder maxConcurrency(Integer maxConcurrency) {
            this.putBodyParameter("MaxConcurrency", maxConcurrency);
            this.maxConcurrency = maxConcurrency;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder title(String title) {
            this.putBodyParameter("Title", title);
            this.title = title;
            return this;
        }

        @Override
        public CreateAppRequest build() {
            return new CreateAppRequest(this);
        } 

    } 

}
