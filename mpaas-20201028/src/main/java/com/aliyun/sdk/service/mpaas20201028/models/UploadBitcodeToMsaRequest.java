// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UploadBitcodeToMsaRequest} extends {@link RequestModel}
 *
 * <p>UploadBitcodeToMsaRequest</p>
 */
public class UploadBitcodeToMsaRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Bitcode")
    private String bitcode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CodeVersion")
    private String codeVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("License")
    private String license;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tenantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private UploadBitcodeToMsaRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.appId = builder.appId;
        this.bitcode = builder.bitcode;
        this.codeVersion = builder.codeVersion;
        this.license = builder.license;
        this.tenantId = builder.tenantId;
        this.type = builder.type;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UploadBitcodeToMsaRequest create() {
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
     * @return bitcode
     */
    public String getBitcode() {
        return this.bitcode;
    }

    /**
     * @return codeVersion
     */
    public String getCodeVersion() {
        return this.codeVersion;
    }

    /**
     * @return license
     */
    public String getLicense() {
        return this.license;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<UploadBitcodeToMsaRequest, Builder> {
        private String regionId; 
        private String appId; 
        private String bitcode; 
        private String codeVersion; 
        private String license; 
        private String tenantId; 
        private String type; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(UploadBitcodeToMsaRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.appId = request.appId;
            this.bitcode = request.bitcode;
            this.codeVersion = request.codeVersion;
            this.license = request.license;
            this.tenantId = request.tenantId;
            this.type = request.type;
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
         * AppId.
         */
        public Builder appId(String appId) {
            this.putBodyParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * Bitcode.
         */
        public Builder bitcode(String bitcode) {
            this.putBodyParameter("Bitcode", bitcode);
            this.bitcode = bitcode;
            return this;
        }

        /**
         * CodeVersion.
         */
        public Builder codeVersion(String codeVersion) {
            this.putBodyParameter("CodeVersion", codeVersion);
            this.codeVersion = codeVersion;
            return this;
        }

        /**
         * License.
         */
        public Builder license(String license) {
            this.putBodyParameter("License", license);
            this.license = license;
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
         * Type.
         */
        public Builder type(String type) {
            this.putBodyParameter("Type", type);
            this.type = type;
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
        public UploadBitcodeToMsaRequest build() {
            return new UploadBitcodeToMsaRequest(this);
        } 

    } 

}
