// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetTemplatePermissionRequest} extends {@link RequestModel}
 *
 * <p>SetTemplatePermissionRequest</p>
 */
public class SetTemplatePermissionRequest extends Request {
    @Query
    @NameInMap("AccountIds")
    @Validation(required = true)
    private java.util.List < String > accountIds;

    @Query
    @NameInMap("ShareOption")
    @Validation(required = true)
    private String shareOption;

    @Query
    @NameInMap("TemplateId")
    @Validation(required = true)
    private String templateId;

    @Query
    @NameInMap("TemplateVersion")
    private String templateVersion;

    @Query
    @NameInMap("VersionOption")
    private String versionOption;

    private SetTemplatePermissionRequest(Builder builder) {
        super(builder);
        this.accountIds = builder.accountIds;
        this.shareOption = builder.shareOption;
        this.templateId = builder.templateId;
        this.templateVersion = builder.templateVersion;
        this.versionOption = builder.versionOption;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetTemplatePermissionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountIds
     */
    public java.util.List < String > getAccountIds() {
        return this.accountIds;
    }

    /**
     * @return shareOption
     */
    public String getShareOption() {
        return this.shareOption;
    }

    /**
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    /**
     * @return templateVersion
     */
    public String getTemplateVersion() {
        return this.templateVersion;
    }

    /**
     * @return versionOption
     */
    public String getVersionOption() {
        return this.versionOption;
    }

    public static final class Builder extends Request.Builder<SetTemplatePermissionRequest, Builder> {
        private java.util.List < String > accountIds; 
        private String shareOption; 
        private String templateId; 
        private String templateVersion; 
        private String versionOption; 

        private Builder() {
            super();
        } 

        private Builder(SetTemplatePermissionRequest request) {
            super(request);
            this.accountIds = request.accountIds;
            this.shareOption = request.shareOption;
            this.templateId = request.templateId;
            this.templateVersion = request.templateVersion;
            this.versionOption = request.versionOption;
        } 

        /**
         * AccountIds.
         */
        public Builder accountIds(java.util.List < String > accountIds) {
            this.putQueryParameter("AccountIds", accountIds);
            this.accountIds = accountIds;
            return this;
        }

        /**
         * ShareOption.
         */
        public Builder shareOption(String shareOption) {
            this.putQueryParameter("ShareOption", shareOption);
            this.shareOption = shareOption;
            return this;
        }

        /**
         * TemplateId.
         */
        public Builder templateId(String templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        /**
         * TemplateVersion.
         */
        public Builder templateVersion(String templateVersion) {
            this.putQueryParameter("TemplateVersion", templateVersion);
            this.templateVersion = templateVersion;
            return this;
        }

        /**
         * VersionOption.
         */
        public Builder versionOption(String versionOption) {
            this.putQueryParameter("VersionOption", versionOption);
            this.versionOption = versionOption;
            return this;
        }

        @Override
        public SetTemplatePermissionRequest build() {
            return new SetTemplatePermissionRequest(this);
        } 

    } 

}
