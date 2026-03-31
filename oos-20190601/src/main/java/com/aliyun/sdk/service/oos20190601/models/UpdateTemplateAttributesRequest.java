// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

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
 * {@link UpdateTemplateAttributesRequest} extends {@link RequestModel}
 *
 * <p>UpdateTemplateAttributesRequest</p>
 */
public class UpdateTemplateAttributesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountIds")
    private String accountIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsFavorite")
    private Boolean isFavorite;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SharePermissionAction")
    private String sharePermissionAction;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ShareTemplateVersion")
    private String shareTemplateVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String templateName;

    private UpdateTemplateAttributesRequest(Builder builder) {
        super(builder);
        this.accountIds = builder.accountIds;
        this.isFavorite = builder.isFavorite;
        this.regionId = builder.regionId;
        this.sharePermissionAction = builder.sharePermissionAction;
        this.shareTemplateVersion = builder.shareTemplateVersion;
        this.templateName = builder.templateName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateTemplateAttributesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountIds
     */
    public String getAccountIds() {
        return this.accountIds;
    }

    /**
     * @return isFavorite
     */
    public Boolean getIsFavorite() {
        return this.isFavorite;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return sharePermissionAction
     */
    public String getSharePermissionAction() {
        return this.sharePermissionAction;
    }

    /**
     * @return shareTemplateVersion
     */
    public String getShareTemplateVersion() {
        return this.shareTemplateVersion;
    }

    /**
     * @return templateName
     */
    public String getTemplateName() {
        return this.templateName;
    }

    public static final class Builder extends Request.Builder<UpdateTemplateAttributesRequest, Builder> {
        private String accountIds; 
        private Boolean isFavorite; 
        private String regionId; 
        private String sharePermissionAction; 
        private String shareTemplateVersion; 
        private String templateName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateTemplateAttributesRequest request) {
            super(request);
            this.accountIds = request.accountIds;
            this.isFavorite = request.isFavorite;
            this.regionId = request.regionId;
            this.sharePermissionAction = request.sharePermissionAction;
            this.shareTemplateVersion = request.shareTemplateVersion;
            this.templateName = request.templateName;
        } 

        /**
         * AccountIds.
         */
        public Builder accountIds(String accountIds) {
            this.putQueryParameter("AccountIds", accountIds);
            this.accountIds = accountIds;
            return this;
        }

        /**
         * IsFavorite.
         */
        public Builder isFavorite(Boolean isFavorite) {
            this.putQueryParameter("IsFavorite", isFavorite);
            this.isFavorite = isFavorite;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * SharePermissionAction.
         */
        public Builder sharePermissionAction(String sharePermissionAction) {
            this.putQueryParameter("SharePermissionAction", sharePermissionAction);
            this.sharePermissionAction = sharePermissionAction;
            return this;
        }

        /**
         * ShareTemplateVersion.
         */
        public Builder shareTemplateVersion(String shareTemplateVersion) {
            this.putQueryParameter("ShareTemplateVersion", shareTemplateVersion);
            this.shareTemplateVersion = shareTemplateVersion;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MyTemplate</p>
         */
        public Builder templateName(String templateName) {
            this.putQueryParameter("TemplateName", templateName);
            this.templateName = templateName;
            return this;
        }

        @Override
        public UpdateTemplateAttributesRequest build() {
            return new UpdateTemplateAttributesRequest(this);
        } 

    } 

}
