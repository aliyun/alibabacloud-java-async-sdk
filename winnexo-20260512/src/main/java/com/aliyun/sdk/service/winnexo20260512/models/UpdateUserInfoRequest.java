// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.winnexo20260512.models;

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
 * {@link UpdateUserInfoRequest} extends {@link RequestModel}
 *
 * <p>UpdateUserInfoRequest</p>
 */
public class UpdateUserInfoRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("avatar")
    private String avatar;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("languagePreference")
    private String languagePreference;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("offering")
    private String offering;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("profileRoleInfo")
    private String profileRoleInfo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("selfIntroduction")
    private String selfIntroduction;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    private UpdateUserInfoRequest(Builder builder) {
        super(builder);
        this.avatar = builder.avatar;
        this.languagePreference = builder.languagePreference;
        this.name = builder.name;
        this.offering = builder.offering;
        this.profileRoleInfo = builder.profileRoleInfo;
        this.selfIntroduction = builder.selfIntroduction;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateUserInfoRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return avatar
     */
    public String getAvatar() {
        return this.avatar;
    }

    /**
     * @return languagePreference
     */
    public String getLanguagePreference() {
        return this.languagePreference;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return offering
     */
    public String getOffering() {
        return this.offering;
    }

    /**
     * @return profileRoleInfo
     */
    public String getProfileRoleInfo() {
        return this.profileRoleInfo;
    }

    /**
     * @return selfIntroduction
     */
    public String getSelfIntroduction() {
        return this.selfIntroduction;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<UpdateUserInfoRequest, Builder> {
        private String avatar; 
        private String languagePreference; 
        private String name; 
        private String offering; 
        private String profileRoleInfo; 
        private String selfIntroduction; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateUserInfoRequest request) {
            super(request);
            this.avatar = request.avatar;
            this.languagePreference = request.languagePreference;
            this.name = request.name;
            this.offering = request.offering;
            this.profileRoleInfo = request.profileRoleInfo;
            this.selfIntroduction = request.selfIntroduction;
            this.tenantId = request.tenantId;
        } 

        /**
         * <p>The profile picture URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/avatar.png">https://example.com/avatar.png</a></p>
         */
        public Builder avatar(String avatar) {
            this.putBodyParameter("avatar", avatar);
            this.avatar = avatar;
            return this;
        }

        /**
         * <p>The language preference: zh-CN or en-US.</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder languagePreference(String languagePreference) {
            this.putBodyParameter("languagePreference", languagePreference);
            this.languagePreference = languagePreference;
            return this;
        }

        /**
         * <p>The name.</p>
         * 
         * <strong>example:</strong>
         * <p>SampleName.pdf</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The user service description. Maximum length: 1000 characters.</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder offering(String offering) {
            this.putBodyParameter("offering", offering);
            this.offering = offering;
            return this;
        }

        /**
         * <p>The user role description. This parameter is used when profileRole is set to Others. Maximum length: 100 characters.</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder profileRoleInfo(String profileRoleInfo) {
            this.putBodyParameter("profileRoleInfo", profileRoleInfo);
            this.profileRoleInfo = profileRoleInfo;
            return this;
        }

        /**
         * <p>The user self-introduction. Maximum length: 1000 characters.</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder selfIntroduction(String selfIntroduction) {
            this.putBodyParameter("selfIntroduction", selfIntroduction);
            this.selfIntroduction = selfIntroduction;
            return this;
        }

        /**
         * <p>The ID of the effective tenant.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        public Builder tenantId(String tenantId) {
            this.putQueryParameter("tenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        @Override
        public UpdateUserInfoRequest build() {
            return new UpdateUserInfoRequest(this);
        } 

    } 

}
