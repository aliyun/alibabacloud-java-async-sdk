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
 * {@link UpdatePushAppRequest} extends {@link RequestModel}
 *
 * <p>UpdatePushAppRequest</p>
 */
public class UpdatePushAppRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppId")
    private Long appId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DownloadLink")
    private String downloadLink;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("tenant-proxy-uid")
    private String tenantProxyUid;

    private UpdatePushAppRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.downloadLink = builder.downloadLink;
        this.tenantProxyUid = builder.tenantProxyUid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdatePushAppRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public Long getAppId() {
        return this.appId;
    }

    /**
     * @return downloadLink
     */
    public String getDownloadLink() {
        return this.downloadLink;
    }

    /**
     * @return tenantProxyUid
     */
    public String getTenantProxyUid() {
        return this.tenantProxyUid;
    }

    public static final class Builder extends Request.Builder<UpdatePushAppRequest, Builder> {
        private Long appId; 
        private String downloadLink; 
        private String tenantProxyUid; 

        private Builder() {
            super();
        } 

        private Builder(UpdatePushAppRequest request) {
            super(request);
            this.appId = request.appId;
            this.downloadLink = request.downloadLink;
            this.tenantProxyUid = request.tenantProxyUid;
        } 

        /**
         * AppId.
         */
        public Builder appId(Long appId) {
            this.putBodyParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * DownloadLink.
         */
        public Builder downloadLink(String downloadLink) {
            this.putBodyParameter("DownloadLink", downloadLink);
            this.downloadLink = downloadLink;
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
        public UpdatePushAppRequest build() {
            return new UpdatePushAppRequest(this);
        } 

    } 

}
