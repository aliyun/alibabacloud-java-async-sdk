// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

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
 * {@link CopyPlaybookRequest} extends {@link RequestModel}
 *
 * <p>CopyPlaybookRequest</p>
 */
public class CopyPlaybookRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DisplayName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String displayName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ReleaseVersion")
    private String releaseVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RoleFor")
    private Long roleFor;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RoleType")
    private String roleType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SourcePlaybookUuid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourcePlaybookUuid;

    private CopyPlaybookRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.displayName = builder.displayName;
        this.lang = builder.lang;
        this.releaseVersion = builder.releaseVersion;
        this.roleFor = builder.roleFor;
        this.roleType = builder.roleType;
        this.sourcePlaybookUuid = builder.sourcePlaybookUuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CopyPlaybookRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return displayName
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return releaseVersion
     */
    public String getReleaseVersion() {
        return this.releaseVersion;
    }

    /**
     * @return roleFor
     */
    public Long getRoleFor() {
        return this.roleFor;
    }

    /**
     * @return roleType
     */
    public String getRoleType() {
        return this.roleType;
    }

    /**
     * @return sourcePlaybookUuid
     */
    public String getSourcePlaybookUuid() {
        return this.sourcePlaybookUuid;
    }

    public static final class Builder extends Request.Builder<CopyPlaybookRequest, Builder> {
        private String description; 
        private String displayName; 
        private String lang; 
        private String releaseVersion; 
        private Long roleFor; 
        private String roleType; 
        private String sourcePlaybookUuid; 

        private Builder() {
            super();
        } 

        private Builder(CopyPlaybookRequest request) {
            super(request);
            this.description = request.description;
            this.displayName = request.displayName;
            this.lang = request.lang;
            this.releaseVersion = request.releaseVersion;
            this.roleFor = request.roleFor;
            this.roleType = request.roleType;
            this.sourcePlaybookUuid = request.sourcePlaybookUuid;
        } 

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>playbook_xxx</p>
         */
        public Builder displayName(String displayName) {
            this.putBodyParameter("DisplayName", displayName);
            this.displayName = displayName;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * ReleaseVersion.
         */
        public Builder releaseVersion(String releaseVersion) {
            this.putBodyParameter("ReleaseVersion", releaseVersion);
            this.releaseVersion = releaseVersion;
            return this;
        }

        /**
         * RoleFor.
         */
        public Builder roleFor(Long roleFor) {
            this.putQueryParameter("RoleFor", roleFor);
            this.roleFor = roleFor;
            return this;
        }

        /**
         * RoleType.
         */
        public Builder roleType(String roleType) {
            this.putQueryParameter("RoleType", roleType);
            this.roleType = roleType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>94bc318c-<strong><strong>-4cba-</strong></strong>-801ccb0d739f</p>
         */
        public Builder sourcePlaybookUuid(String sourcePlaybookUuid) {
            this.putBodyParameter("SourcePlaybookUuid", sourcePlaybookUuid);
            this.sourcePlaybookUuid = sourcePlaybookUuid;
            return this;
        }

        @Override
        public CopyPlaybookRequest build() {
            return new CopyPlaybookRequest(this);
        } 

    } 

}
