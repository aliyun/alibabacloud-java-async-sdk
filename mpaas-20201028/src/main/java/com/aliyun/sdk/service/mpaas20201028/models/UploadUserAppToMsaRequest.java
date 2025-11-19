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
 * {@link UploadUserAppToMsaRequest} extends {@link RequestModel}
 *
 * <p>UploadUserAppToMsaRequest</p>
 */
public class UploadUserAppToMsaRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FileName")
    private String fileName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FileUrl")
    private String fileUrl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tenantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UseYShield")
    private Boolean useYShield;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private UploadUserAppToMsaRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.appId = builder.appId;
        this.fileName = builder.fileName;
        this.fileUrl = builder.fileUrl;
        this.tenantId = builder.tenantId;
        this.useYShield = builder.useYShield;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UploadUserAppToMsaRequest create() {
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
     * @return fileName
     */
    public String getFileName() {
        return this.fileName;
    }

    /**
     * @return fileUrl
     */
    public String getFileUrl() {
        return this.fileUrl;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @return useYShield
     */
    public Boolean getUseYShield() {
        return this.useYShield;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<UploadUserAppToMsaRequest, Builder> {
        private String regionId; 
        private String appId; 
        private String fileName; 
        private String fileUrl; 
        private String tenantId; 
        private Boolean useYShield; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(UploadUserAppToMsaRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.appId = request.appId;
            this.fileName = request.fileName;
            this.fileUrl = request.fileUrl;
            this.tenantId = request.tenantId;
            this.useYShield = request.useYShield;
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
         */
        public Builder appId(String appId) {
            this.putBodyParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * FileName.
         */
        public Builder fileName(String fileName) {
            this.putBodyParameter("FileName", fileName);
            this.fileName = fileName;
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
         * <p>This parameter is required.</p>
         */
        public Builder tenantId(String tenantId) {
            this.putBodyParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        /**
         * UseYShield.
         */
        public Builder useYShield(Boolean useYShield) {
            this.putBodyParameter("UseYShield", useYShield);
            this.useYShield = useYShield;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putBodyParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public UploadUserAppToMsaRequest build() {
            return new UploadUserAppToMsaRequest(this);
        } 

    } 

}
