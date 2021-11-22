// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link SetTemplatePermissionRequest} extends {@link RequestModel}
 *
 * <p>SetTemplatePermissionRequest</p>
 */
public class SetTemplatePermissionRequest extends Request {
    @Query
    @NameInMap("AccountIds")
    private java.util.List < String > accountIds;

    @Query
    @NameInMap("ShareOption")
    private String shareOption;

    @Query
    @NameInMap("TemplateId")
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

    public static final class Builder extends Request.Builder {
        private java.util.List < String > accountIds; 
        private String shareOption; 
        private String templateId; 
        private String templateVersion; 
        private String versionOption; 

        /**
         * <p>AccountIds.</p>
         */
        public Builder accountIds(java.util.List < String > accountIds) {
            this.putQueryParameter("AccountIds", accountIds);
            this.accountIds = accountIds;
            return this;
        }

        /**
         * <p>ShareOption.</p>
         */
        public Builder shareOption(String shareOption) {
            this.putQueryParameter("ShareOption", shareOption);
            this.shareOption = shareOption;
            return this;
        }

        /**
         * <p>TemplateId.</p>
         */
        public Builder templateId(String templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        /**
         * <p>TemplateVersion.</p>
         */
        public Builder templateVersion(String templateVersion) {
            this.putQueryParameter("TemplateVersion", templateVersion);
            this.templateVersion = templateVersion;
            return this;
        }

        /**
         * <p>VersionOption.</p>
         */
        public Builder versionOption(String versionOption) {
            this.putQueryParameter("VersionOption", versionOption);
            this.versionOption = versionOption;
            return this;
        }

        public SetTemplatePermissionRequest build() {
            return new SetTemplatePermissionRequest(this);
        } 

    } 

}
