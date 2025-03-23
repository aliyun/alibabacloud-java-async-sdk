// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mhub20170825.models;

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
 * {@link DescribeDashboardRequest} extends {@link RequestModel}
 *
 * <p>DescribeDashboardRequest</p>
 */
public class DescribeDashboardRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppKey")
    private String appKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppType")
    private Integer appType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppVersion")
    private String appVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Keyword")
    private String keyword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProxyAction")
    private String proxyAction;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceName")
    private String serviceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private Long startTime;

    private DescribeDashboardRequest(Builder builder) {
        super(builder);
        this.appKey = builder.appKey;
        this.appType = builder.appType;
        this.appVersion = builder.appVersion;
        this.endTime = builder.endTime;
        this.keyword = builder.keyword;
        this.proxyAction = builder.proxyAction;
        this.serviceName = builder.serviceName;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDashboardRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appKey
     */
    public String getAppKey() {
        return this.appKey;
    }

    /**
     * @return appType
     */
    public Integer getAppType() {
        return this.appType;
    }

    /**
     * @return appVersion
     */
    public String getAppVersion() {
        return this.appVersion;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return keyword
     */
    public String getKeyword() {
        return this.keyword;
    }

    /**
     * @return proxyAction
     */
    public String getProxyAction() {
        return this.proxyAction;
    }

    /**
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<DescribeDashboardRequest, Builder> {
        private String appKey; 
        private Integer appType; 
        private String appVersion; 
        private Long endTime; 
        private String keyword; 
        private String proxyAction; 
        private String serviceName; 
        private Long startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDashboardRequest request) {
            super(request);
            this.appKey = request.appKey;
            this.appType = request.appType;
            this.appVersion = request.appVersion;
            this.endTime = request.endTime;
            this.keyword = request.keyword;
            this.proxyAction = request.proxyAction;
            this.serviceName = request.serviceName;
            this.startTime = request.startTime;
        } 

        /**
         * AppKey.
         */
        public Builder appKey(String appKey) {
            this.putQueryParameter("AppKey", appKey);
            this.appKey = appKey;
            return this;
        }

        /**
         * AppType.
         */
        public Builder appType(Integer appType) {
            this.putQueryParameter("AppType", appType);
            this.appType = appType;
            return this;
        }

        /**
         * AppVersion.
         */
        public Builder appVersion(String appVersion) {
            this.putQueryParameter("AppVersion", appVersion);
            this.appVersion = appVersion;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * Keyword.
         */
        public Builder keyword(String keyword) {
            this.putQueryParameter("Keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * ProxyAction.
         */
        public Builder proxyAction(String proxyAction) {
            this.putQueryParameter("ProxyAction", proxyAction);
            this.proxyAction = proxyAction;
            return this;
        }

        /**
         * ServiceName.
         */
        public Builder serviceName(String serviceName) {
            this.putQueryParameter("ServiceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribeDashboardRequest build() {
            return new DescribeDashboardRequest(this);
        } 

    } 

}
