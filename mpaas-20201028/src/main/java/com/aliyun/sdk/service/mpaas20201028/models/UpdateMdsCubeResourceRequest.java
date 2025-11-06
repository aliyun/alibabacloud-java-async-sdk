// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

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
 * {@link UpdateMdsCubeResourceRequest} extends {@link RequestModel}
 *
 * <p>UpdateMdsCubeResourceRequest</p>
 */
public class UpdateMdsCubeResourceRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MockDataUrl")
    @com.aliyun.core.annotation.Validation(required = true)
    private String mockDataUrl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OnexFlag")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean onexFlag;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TemplateResourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long templateResourceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tenantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private UpdateMdsCubeResourceRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.appId = builder.appId;
        this.mockDataUrl = builder.mockDataUrl;
        this.onexFlag = builder.onexFlag;
        this.templateResourceId = builder.templateResourceId;
        this.tenantId = builder.tenantId;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateMdsCubeResourceRequest create() {
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
     * @return mockDataUrl
     */
    public String getMockDataUrl() {
        return this.mockDataUrl;
    }

    /**
     * @return onexFlag
     */
    public Boolean getOnexFlag() {
        return this.onexFlag;
    }

    /**
     * @return templateResourceId
     */
    public Long getTemplateResourceId() {
        return this.templateResourceId;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<UpdateMdsCubeResourceRequest, Builder> {
        private String regionId; 
        private String appId; 
        private String mockDataUrl; 
        private Boolean onexFlag; 
        private Long templateResourceId; 
        private String tenantId; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateMdsCubeResourceRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.appId = request.appId;
            this.mockDataUrl = request.mockDataUrl;
            this.onexFlag = request.onexFlag;
            this.templateResourceId = request.templateResourceId;
            this.tenantId = request.tenantId;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ALIPUBE5C3F6D091419</p>
         */
        public Builder appId(String appId) {
            this.putBodyParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>url</p>
         */
        public Builder mockDataUrl(String mockDataUrl) {
            this.putBodyParameter("MockDataUrl", mockDataUrl);
            this.mockDataUrl = mockDataUrl;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder onexFlag(Boolean onexFlag) {
            this.putBodyParameter("OnexFlag", onexFlag);
            this.onexFlag = onexFlag;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder templateResourceId(Long templateResourceId) {
            this.putBodyParameter("TemplateResourceId", templateResourceId);
            this.templateResourceId = templateResourceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ZXCXMAHQ-zh_CN</p>
         */
        public Builder tenantId(String tenantId) {
            this.putBodyParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dev</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putBodyParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public UpdateMdsCubeResourceRequest build() {
            return new UpdateMdsCubeResourceRequest(this);
        } 

    } 

}
