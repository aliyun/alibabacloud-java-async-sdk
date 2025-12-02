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
 * {@link GetPlaybookRequest} extends {@link RequestModel}
 *
 * <p>GetPlaybookRequest</p>
 */
public class GetPlaybookRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PlaybookUuid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String playbookUuid;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PlaybookVersion")
    private String playbookVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PlaybookVersionType")
    private String playbookVersionType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoleFor")
    private Long roleFor;

    private GetPlaybookRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.playbookUuid = builder.playbookUuid;
        this.playbookVersion = builder.playbookVersion;
        this.playbookVersionType = builder.playbookVersionType;
        this.roleFor = builder.roleFor;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPlaybookRequest create() {
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
     * @return playbookUuid
     */
    public String getPlaybookUuid() {
        return this.playbookUuid;
    }

    /**
     * @return playbookVersion
     */
    public String getPlaybookVersion() {
        return this.playbookVersion;
    }

    /**
     * @return playbookVersionType
     */
    public String getPlaybookVersionType() {
        return this.playbookVersionType;
    }

    /**
     * @return roleFor
     */
    public Long getRoleFor() {
        return this.roleFor;
    }

    public static final class Builder extends Request.Builder<GetPlaybookRequest, Builder> {
        private String lang; 
        private String playbookUuid; 
        private String playbookVersion; 
        private String playbookVersionType; 
        private Long roleFor; 

        private Builder() {
            super();
        } 

        private Builder(GetPlaybookRequest request) {
            super(request);
            this.lang = request.lang;
            this.playbookUuid = request.playbookUuid;
            this.playbookVersion = request.playbookVersion;
            this.playbookVersionType = request.playbookVersionType;
            this.roleFor = request.roleFor;
        } 

        /**
         * <p>The language type for requests and received messages.</p>
         * <ul>
         * <li><strong>zh</strong> (default): Chinese</li>
         * <li><strong>en</strong>: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putBodyParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The UUID of the playbook.</p>
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
         * <p>The version ID of the playbook, which is only effective when <strong>PlaybookVersionType</strong> is <strong>History</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>36c9dcd6-<strong><strong>-4262-</strong></strong>-d508464ebd21</p>
         */
        public Builder playbookVersion(String playbookVersion) {
            this.putBodyParameter("PlaybookVersion", playbookVersion);
            this.playbookVersion = playbookVersion;
            return this;
        }

        /**
         * <p>The version type of the playbook, with the following values:</p>
         * <ul>
         * <li><strong>Draft</strong>: Editing state.</li>
         * <li><strong>Online</strong>: Online version.</li>
         * <li><strong>History</strong>: Historical version.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>History</p>
         */
        public Builder playbookVersionType(String playbookVersionType) {
            this.putBodyParameter("PlaybookVersionType", playbookVersionType);
            this.playbookVersionType = playbookVersionType;
            return this;
        }

        /**
         * <p>The user ID for the administrator to switch to another member&quot;s perspective.</p>
         * 
         * <strong>example:</strong>
         * <p>13760*****718726</p>
         */
        public Builder roleFor(Long roleFor) {
            this.putBodyParameter("RoleFor", roleFor);
            this.roleFor = roleFor;
            return this;
        }

        @Override
        public GetPlaybookRequest build() {
            return new GetPlaybookRequest(this);
        } 

    } 

}
