// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apds20220331.models;

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
 * {@link ListAppDownloadHistoryRequest} extends {@link RequestModel}
 *
 * <p>ListAppDownloadHistoryRequest</p>
 */
public class ListAppDownloadHistoryRequest extends Request {
    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("biz-module-code")
    private String bizModuleCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("appId")
    private String appId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("platform")
    private String platform;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("startDate")
    private String startDate;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("tenantUid")
    private String tenantUid;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("tenant-proxy-uid")
    private String tenantProxyUid;

    private ListAppDownloadHistoryRequest(Builder builder) {
        super(builder);
        this.bizModuleCode = builder.bizModuleCode;
        this.appId = builder.appId;
        this.platform = builder.platform;
        this.startDate = builder.startDate;
        this.tenantUid = builder.tenantUid;
        this.tenantProxyUid = builder.tenantProxyUid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAppDownloadHistoryRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizModuleCode
     */
    public String getBizModuleCode() {
        return this.bizModuleCode;
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return platform
     */
    public String getPlatform() {
        return this.platform;
    }

    /**
     * @return startDate
     */
    public String getStartDate() {
        return this.startDate;
    }

    /**
     * @return tenantUid
     */
    public String getTenantUid() {
        return this.tenantUid;
    }

    /**
     * @return tenantProxyUid
     */
    public String getTenantProxyUid() {
        return this.tenantProxyUid;
    }

    public static final class Builder extends Request.Builder<ListAppDownloadHistoryRequest, Builder> {
        private String bizModuleCode; 
        private String appId; 
        private String platform; 
        private String startDate; 
        private String tenantUid; 
        private String tenantProxyUid; 

        private Builder() {
            super();
        } 

        private Builder(ListAppDownloadHistoryRequest request) {
            super(request);
            this.bizModuleCode = request.bizModuleCode;
            this.appId = request.appId;
            this.platform = request.platform;
            this.startDate = request.startDate;
            this.tenantUid = request.tenantUid;
            this.tenantProxyUid = request.tenantProxyUid;
        } 

        /**
         * biz-module-code.
         */
        public Builder bizModuleCode(String bizModuleCode) {
            this.putHeaderParameter("biz-module-code", bizModuleCode);
            this.bizModuleCode = bizModuleCode;
            return this;
        }

        /**
         * appId.
         */
        public Builder appId(String appId) {
            this.putBodyParameter("appId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * platform.
         */
        public Builder platform(String platform) {
            this.putBodyParameter("platform", platform);
            this.platform = platform;
            return this;
        }

        /**
         * startDate.
         */
        public Builder startDate(String startDate) {
            this.putBodyParameter("startDate", startDate);
            this.startDate = startDate;
            return this;
        }

        /**
         * tenantUid.
         */
        public Builder tenantUid(String tenantUid) {
            this.putBodyParameter("tenantUid", tenantUid);
            this.tenantUid = tenantUid;
            return this;
        }

        /**
         * tenant-proxy-uid.
         */
        public Builder tenantProxyUid(String tenantProxyUid) {
            this.putHeaderParameter("tenant-proxy-uid", tenantProxyUid);
            this.tenantProxyUid = tenantProxyUid;
            return this;
        }

        @Override
        public ListAppDownloadHistoryRequest build() {
            return new ListAppDownloadHistoryRequest(this);
        } 

    } 

}
