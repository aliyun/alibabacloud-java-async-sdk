// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExportMappCenterAppConfigRequest} extends {@link RequestModel}
 *
 * <p>ExportMappCenterAppConfigRequest</p>
 */
public class ExportMappCenterAppConfigRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ApkFileUrl")
    private String apkFileUrl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CertRsaBase64")
    private String certRsaBase64;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Identifier")
    @com.aliyun.core.annotation.Validation(required = true)
    private String identifier;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OnexFlag")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean onexFlag;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SystemType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String systemType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private ExportMappCenterAppConfigRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.apkFileUrl = builder.apkFileUrl;
        this.appId = builder.appId;
        this.certRsaBase64 = builder.certRsaBase64;
        this.identifier = builder.identifier;
        this.onexFlag = builder.onexFlag;
        this.systemType = builder.systemType;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExportMappCenterAppConfigRequest create() {
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
     * @return apkFileUrl
     */
    public String getApkFileUrl() {
        return this.apkFileUrl;
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return certRsaBase64
     */
    public String getCertRsaBase64() {
        return this.certRsaBase64;
    }

    /**
     * @return identifier
     */
    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * @return onexFlag
     */
    public Boolean getOnexFlag() {
        return this.onexFlag;
    }

    /**
     * @return systemType
     */
    public String getSystemType() {
        return this.systemType;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<ExportMappCenterAppConfigRequest, Builder> {
        private String regionId; 
        private String apkFileUrl; 
        private String appId; 
        private String certRsaBase64; 
        private String identifier; 
        private Boolean onexFlag; 
        private String systemType; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(ExportMappCenterAppConfigRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.apkFileUrl = request.apkFileUrl;
            this.appId = request.appId;
            this.certRsaBase64 = request.certRsaBase64;
            this.identifier = request.identifier;
            this.onexFlag = request.onexFlag;
            this.systemType = request.systemType;
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
         * ApkFileUrl.
         */
        public Builder apkFileUrl(String apkFileUrl) {
            this.putBodyParameter("ApkFileUrl", apkFileUrl);
            this.apkFileUrl = apkFileUrl;
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
         * CertRsaBase64.
         */
        public Builder certRsaBase64(String certRsaBase64) {
            this.putBodyParameter("CertRsaBase64", certRsaBase64);
            this.certRsaBase64 = certRsaBase64;
            return this;
        }

        /**
         * Identifier.
         */
        public Builder identifier(String identifier) {
            this.putBodyParameter("Identifier", identifier);
            this.identifier = identifier;
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
         * SystemType.
         */
        public Builder systemType(String systemType) {
            this.putBodyParameter("SystemType", systemType);
            this.systemType = systemType;
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
        public ExportMappCenterAppConfigRequest build() {
            return new ExportMappCenterAppConfigRequest(this);
        } 

    } 

}
