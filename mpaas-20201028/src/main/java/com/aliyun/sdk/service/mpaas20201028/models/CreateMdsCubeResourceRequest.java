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
 * {@link CreateMdsCubeResourceRequest} extends {@link RequestModel}
 *
 * <p>CreateMdsCubeResourceRequest</p>
 */
public class CreateMdsCubeResourceRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AndroidMaxVersion")
    private String androidMaxVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AndroidMinVersion")
    private String androidMinVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExtendInfo")
    private String extendInfo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FileUrl")
    private String fileUrl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IosMaxVersion")
    private String iosMaxVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IosMinVersion")
    private String iosMinVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MockDataUrl")
    private String mockDataUrl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OnexFlag")
    private Boolean onexFlag;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Platform")
    private String platform;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PreviewPictureUrl")
    private String previewPictureUrl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TemplateId")
    private String templateId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TemplateResourceDesc")
    private String templateResourceDesc;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TemplateResourceVersion")
    private String templateResourceVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TenantId")
    private String tenantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private CreateMdsCubeResourceRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.androidMaxVersion = builder.androidMaxVersion;
        this.androidMinVersion = builder.androidMinVersion;
        this.appId = builder.appId;
        this.extendInfo = builder.extendInfo;
        this.fileUrl = builder.fileUrl;
        this.iosMaxVersion = builder.iosMaxVersion;
        this.iosMinVersion = builder.iosMinVersion;
        this.mockDataUrl = builder.mockDataUrl;
        this.onexFlag = builder.onexFlag;
        this.platform = builder.platform;
        this.previewPictureUrl = builder.previewPictureUrl;
        this.templateId = builder.templateId;
        this.templateResourceDesc = builder.templateResourceDesc;
        this.templateResourceVersion = builder.templateResourceVersion;
        this.tenantId = builder.tenantId;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMdsCubeResourceRequest create() {
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
     * @return androidMaxVersion
     */
    public String getAndroidMaxVersion() {
        return this.androidMaxVersion;
    }

    /**
     * @return androidMinVersion
     */
    public String getAndroidMinVersion() {
        return this.androidMinVersion;
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return extendInfo
     */
    public String getExtendInfo() {
        return this.extendInfo;
    }

    /**
     * @return fileUrl
     */
    public String getFileUrl() {
        return this.fileUrl;
    }

    /**
     * @return iosMaxVersion
     */
    public String getIosMaxVersion() {
        return this.iosMaxVersion;
    }

    /**
     * @return iosMinVersion
     */
    public String getIosMinVersion() {
        return this.iosMinVersion;
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
     * @return platform
     */
    public String getPlatform() {
        return this.platform;
    }

    /**
     * @return previewPictureUrl
     */
    public String getPreviewPictureUrl() {
        return this.previewPictureUrl;
    }

    /**
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    /**
     * @return templateResourceDesc
     */
    public String getTemplateResourceDesc() {
        return this.templateResourceDesc;
    }

    /**
     * @return templateResourceVersion
     */
    public String getTemplateResourceVersion() {
        return this.templateResourceVersion;
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

    public static final class Builder extends Request.Builder<CreateMdsCubeResourceRequest, Builder> {
        private String regionId; 
        private String androidMaxVersion; 
        private String androidMinVersion; 
        private String appId; 
        private String extendInfo; 
        private String fileUrl; 
        private String iosMaxVersion; 
        private String iosMinVersion; 
        private String mockDataUrl; 
        private Boolean onexFlag; 
        private String platform; 
        private String previewPictureUrl; 
        private String templateId; 
        private String templateResourceDesc; 
        private String templateResourceVersion; 
        private String tenantId; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(CreateMdsCubeResourceRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.androidMaxVersion = request.androidMaxVersion;
            this.androidMinVersion = request.androidMinVersion;
            this.appId = request.appId;
            this.extendInfo = request.extendInfo;
            this.fileUrl = request.fileUrl;
            this.iosMaxVersion = request.iosMaxVersion;
            this.iosMinVersion = request.iosMinVersion;
            this.mockDataUrl = request.mockDataUrl;
            this.onexFlag = request.onexFlag;
            this.platform = request.platform;
            this.previewPictureUrl = request.previewPictureUrl;
            this.templateId = request.templateId;
            this.templateResourceDesc = request.templateResourceDesc;
            this.templateResourceVersion = request.templateResourceVersion;
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
         * AndroidMaxVersion.
         */
        public Builder androidMaxVersion(String androidMaxVersion) {
            this.putBodyParameter("AndroidMaxVersion", androidMaxVersion);
            this.androidMaxVersion = androidMaxVersion;
            return this;
        }

        /**
         * AndroidMinVersion.
         */
        public Builder androidMinVersion(String androidMinVersion) {
            this.putBodyParameter("AndroidMinVersion", androidMinVersion);
            this.androidMinVersion = androidMinVersion;
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
         * ExtendInfo.
         */
        public Builder extendInfo(String extendInfo) {
            this.putBodyParameter("ExtendInfo", extendInfo);
            this.extendInfo = extendInfo;
            return this;
        }

        /**
         * FileUrl.
         */
        public Builder fileUrl(String fileUrl) {
            this.putBodyParameter("FileUrl", fileUrl);
            this.fileUrl = fileUrl;
            return this;
        }

        /**
         * IosMaxVersion.
         */
        public Builder iosMaxVersion(String iosMaxVersion) {
            this.putBodyParameter("IosMaxVersion", iosMaxVersion);
            this.iosMaxVersion = iosMaxVersion;
            return this;
        }

        /**
         * IosMinVersion.
         */
        public Builder iosMinVersion(String iosMinVersion) {
            this.putBodyParameter("IosMinVersion", iosMinVersion);
            this.iosMinVersion = iosMinVersion;
            return this;
        }

        /**
         * MockDataUrl.
         */
        public Builder mockDataUrl(String mockDataUrl) {
            this.putBodyParameter("MockDataUrl", mockDataUrl);
            this.mockDataUrl = mockDataUrl;
            return this;
        }

        /**
         * OnexFlag.
         */
        public Builder onexFlag(Boolean onexFlag) {
            this.putBodyParameter("OnexFlag", onexFlag);
            this.onexFlag = onexFlag;
            return this;
        }

        /**
         * Platform.
         */
        public Builder platform(String platform) {
            this.putBodyParameter("Platform", platform);
            this.platform = platform;
            return this;
        }

        /**
         * PreviewPictureUrl.
         */
        public Builder previewPictureUrl(String previewPictureUrl) {
            this.putBodyParameter("PreviewPictureUrl", previewPictureUrl);
            this.previewPictureUrl = previewPictureUrl;
            return this;
        }

        /**
         * TemplateId.
         */
        public Builder templateId(String templateId) {
            this.putBodyParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        /**
         * TemplateResourceDesc.
         */
        public Builder templateResourceDesc(String templateResourceDesc) {
            this.putBodyParameter("TemplateResourceDesc", templateResourceDesc);
            this.templateResourceDesc = templateResourceDesc;
            return this;
        }

        /**
         * TemplateResourceVersion.
         */
        public Builder templateResourceVersion(String templateResourceVersion) {
            this.putBodyParameter("TemplateResourceVersion", templateResourceVersion);
            this.templateResourceVersion = templateResourceVersion;
            return this;
        }

        /**
         * TenantId.
         */
        public Builder tenantId(String tenantId) {
            this.putBodyParameter("TenantId", tenantId);
            this.tenantId = tenantId;
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
        public CreateMdsCubeResourceRequest build() {
            return new CreateMdsCubeResourceRequest(this);
        } 

    } 

}
