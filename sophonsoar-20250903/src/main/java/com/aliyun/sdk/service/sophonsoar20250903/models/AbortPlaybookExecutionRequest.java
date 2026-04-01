// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20250903.models;

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
 * {@link AbortPlaybookExecutionRequest} extends {@link RequestModel}
 *
 * <p>AbortPlaybookExecutionRequest</p>
 */
public class AbortPlaybookExecutionRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PlaybookExecutionUuid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String playbookExecutionUuid;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PlaybookUuid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String playbookUuid;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoleFor")
    private Long roleFor;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoleType")
    private String roleType;

    private AbortPlaybookExecutionRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.playbookExecutionUuid = builder.playbookExecutionUuid;
        this.playbookUuid = builder.playbookUuid;
        this.roleFor = builder.roleFor;
        this.roleType = builder.roleType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AbortPlaybookExecutionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return playbookExecutionUuid
     */
    public String getPlaybookExecutionUuid() {
        return this.playbookExecutionUuid;
    }

    /**
     * @return playbookUuid
     */
    public String getPlaybookUuid() {
        return this.playbookUuid;
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

    public static final class Builder extends Request.Builder<AbortPlaybookExecutionRequest, Builder> {
        private String lang; 
        private String playbookExecutionUuid; 
        private String playbookUuid; 
        private Long roleFor; 
        private String roleType; 

        private Builder() {
            super();
        } 

        private Builder(AbortPlaybookExecutionRequest request) {
            super(request);
            this.lang = request.lang;
            this.playbookExecutionUuid = request.playbookExecutionUuid;
            this.playbookUuid = request.playbookUuid;
            this.roleFor = request.roleFor;
            this.roleType = request.roleType;
        } 

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putBodyParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>e776dab31-499b-4307-9248-xxxxxx</p>
         */
        public Builder playbookExecutionUuid(String playbookExecutionUuid) {
            this.putBodyParameter("PlaybookExecutionUuid", playbookExecutionUuid);
            this.playbookExecutionUuid = playbookExecutionUuid;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>e99dab31-499b-4307-9248-xxxxxx</p>
         */
        public Builder playbookUuid(String playbookUuid) {
            this.putBodyParameter("PlaybookUuid", playbookUuid);
            this.playbookUuid = playbookUuid;
            return this;
        }

        /**
         * RoleFor.
         */
        public Builder roleFor(Long roleFor) {
            this.putBodyParameter("RoleFor", roleFor);
            this.roleFor = roleFor;
            return this;
        }

        /**
         * RoleType.
         */
        public Builder roleType(String roleType) {
            this.putBodyParameter("RoleType", roleType);
            this.roleType = roleType;
            return this;
        }

        @Override
        public AbortPlaybookExecutionRequest build() {
            return new AbortPlaybookExecutionRequest(this);
        } 

    } 

}
