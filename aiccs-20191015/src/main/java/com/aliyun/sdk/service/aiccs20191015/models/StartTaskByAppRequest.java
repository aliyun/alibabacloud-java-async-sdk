// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartTaskByAppRequest} extends {@link RequestModel}
 *
 * <p>StartTaskByAppRequest</p>
 */
public class StartTaskByAppRequest extends Request {
    @Query
    @NameInMap("App")
    private String app;

    @Query
    @NameInMap("AppId")
    private Integer appId;

    @Query
    @NameInMap("AppName")
    private String appName;

    @Query
    @NameInMap("BuildId")
    private String buildId;

    @Query
    @NameInMap("EnvTypes")
    private String envTypes;

    @Query
    @NameInMap("Operator")
    private String operator;

    @Query
    @NameInMap("RequestId")
    private String requestId;

    @Query
    @NameInMap("SiteType")
    private String siteType;

    @Query
    @NameInMap("Token")
    private String token;

    private StartTaskByAppRequest(Builder builder) {
        super(builder);
        this.app = builder.app;
        this.appId = builder.appId;
        this.appName = builder.appName;
        this.buildId = builder.buildId;
        this.envTypes = builder.envTypes;
        this.operator = builder.operator;
        this.requestId = builder.requestId;
        this.siteType = builder.siteType;
        this.token = builder.token;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartTaskByAppRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return app
     */
    public String getApp() {
        return this.app;
    }

    /**
     * @return appId
     */
    public Integer getAppId() {
        return this.appId;
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return buildId
     */
    public String getBuildId() {
        return this.buildId;
    }

    /**
     * @return envTypes
     */
    public String getEnvTypes() {
        return this.envTypes;
    }

    /**
     * @return operator
     */
    public String getOperator() {
        return this.operator;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return siteType
     */
    public String getSiteType() {
        return this.siteType;
    }

    /**
     * @return token
     */
    public String getToken() {
        return this.token;
    }

    public static final class Builder extends Request.Builder<StartTaskByAppRequest, Builder> {
        private String app; 
        private Integer appId; 
        private String appName; 
        private String buildId; 
        private String envTypes; 
        private String operator; 
        private String requestId; 
        private String siteType; 
        private String token; 

        private Builder() {
            super();
        } 

        private Builder(StartTaskByAppRequest response) {
            super(response);
            this.app = response.app;
            this.appId = response.appId;
            this.appName = response.appName;
            this.buildId = response.buildId;
            this.envTypes = response.envTypes;
            this.operator = response.operator;
            this.requestId = response.requestId;
            this.siteType = response.siteType;
            this.token = response.token;
        } 

        /**
         * app
         */
        public Builder app(String app) {
            this.putQueryParameter("App", app);
            this.app = app;
            return this;
        }

        /**
         * appId
         */
        public Builder appId(Integer appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * appName
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * buildId
         */
        public Builder buildId(String buildId) {
            this.putQueryParameter("BuildId", buildId);
            this.buildId = buildId;
            return this;
        }

        /**
         * envTypes
         */
        public Builder envTypes(String envTypes) {
            this.putQueryParameter("EnvTypes", envTypes);
            this.envTypes = envTypes;
            return this;
        }

        /**
         * operator
         */
        public Builder operator(String operator) {
            this.putQueryParameter("Operator", operator);
            this.operator = operator;
            return this;
        }

        /**
         * requestId
         */
        public Builder requestId(String requestId) {
            this.putQueryParameter("RequestId", requestId);
            this.requestId = requestId;
            return this;
        }

        /**
         * siteType
         */
        public Builder siteType(String siteType) {
            this.putQueryParameter("SiteType", siteType);
            this.siteType = siteType;
            return this;
        }

        /**
         * token
         */
        public Builder token(String token) {
            this.putQueryParameter("Token", token);
            this.token = token;
            return this;
        }

        @Override
        public StartTaskByAppRequest build() {
            return new StartTaskByAppRequest(this);
        } 

    } 

}
