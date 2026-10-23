// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ram20150501.models;

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
 * {@link CreateRoleRequest} extends {@link RequestModel}
 *
 * <p>CreateRoleRequest</p>
 */
public class CreateRoleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AllowConsoleLogin")
    private Boolean allowConsoleLogin;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AssumeRolePolicyDocument")
    private String assumeRolePolicyDocument;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxSessionDuration")
    private Long maxSessionDuration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RoleName")
    private String roleName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    private CreateRoleRequest(Builder builder) {
        super(builder);
        this.allowConsoleLogin = builder.allowConsoleLogin;
        this.assumeRolePolicyDocument = builder.assumeRolePolicyDocument;
        this.description = builder.description;
        this.maxSessionDuration = builder.maxSessionDuration;
        this.roleName = builder.roleName;
        this.tag = builder.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRoleRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return allowConsoleLogin
     */
    public Boolean getAllowConsoleLogin() {
        return this.allowConsoleLogin;
    }

    /**
     * @return assumeRolePolicyDocument
     */
    public String getAssumeRolePolicyDocument() {
        return this.assumeRolePolicyDocument;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return maxSessionDuration
     */
    public Long getMaxSessionDuration() {
        return this.maxSessionDuration;
    }

    /**
     * @return roleName
     */
    public String getRoleName() {
        return this.roleName;
    }

    /**
     * @return tag
     */
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    public static final class Builder extends Request.Builder<CreateRoleRequest, Builder> {
        private Boolean allowConsoleLogin; 
        private String assumeRolePolicyDocument; 
        private String description; 
        private Long maxSessionDuration; 
        private String roleName; 
        private java.util.List<Tag> tag; 

        private Builder() {
            super();
        } 

        private Builder(CreateRoleRequest request) {
            super(request);
            this.allowConsoleLogin = request.allowConsoleLogin;
            this.assumeRolePolicyDocument = request.assumeRolePolicyDocument;
            this.description = request.description;
            this.maxSessionDuration = request.maxSessionDuration;
            this.roleName = request.roleName;
            this.tag = request.tag;
        } 

        /**
         * <p>Specifies whether the RAM role is allowed to log on to the console. Valid values:</p>
         * <ul>
         * <li>true: allowed</li>
         * <li>false: not allowed</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder allowConsoleLogin(Boolean allowConsoleLogin) {
            this.putQueryParameter("AllowConsoleLogin", allowConsoleLogin);
            this.allowConsoleLogin = allowConsoleLogin;
            return this;
        }

        /**
         * <p>The trust policy. Specifies one or more principals that are allowed to assume the RAM role. The principals can be Alibaba Cloud accounts, Alibaba Cloud services, or identity providers.</p>
         * <blockquote>
         * <p>Resource Access Management (RAM) users cannot assume RAM roles whose trusted entity is an Alibaba Cloud service.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Statement&quot;:[{&quot;Action&quot;:&quot;sts:AssumeRole&quot;,&quot;Effect&quot;:&quot;Allow&quot;,&quot;Principal&quot;:{&quot;RAM&quot;:&quot;acs:ram::123456789012****:root&quot;}}],&quot;Version&quot;:&quot;1&quot;}</p>
         */
        public Builder assumeRolePolicyDocument(String assumeRolePolicyDocument) {
            this.putQueryParameter("AssumeRolePolicyDocument", assumeRolePolicyDocument);
            this.assumeRolePolicyDocument = assumeRolePolicyDocument;
            return this;
        }

        /**
         * <p>The description of the RAM role.</p>
         * <p>The description must be 1 to 1,024 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>ECS management role</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The maximum session duration of the RAM role.</p>
         * <p>Valid values: 3600 to 43200. Unit: seconds. Default value: 3600.</p>
         * <p>If this parameter is left empty, the default value is used.</p>
         * 
         * <strong>example:</strong>
         * <p>3600</p>
         */
        public Builder maxSessionDuration(Long maxSessionDuration) {
            this.putQueryParameter("MaxSessionDuration", maxSessionDuration);
            this.maxSessionDuration = maxSessionDuration;
            return this;
        }

        /**
         * <p>The name of the RAM role.</p>
         * <p>The name must be 1 to 64 characters in length and can contain letters, digits, periods (.), and hyphens (-).</p>
         * 
         * <strong>example:</strong>
         * <p>ECSAdmin</p>
         */
        public Builder roleName(String roleName) {
            this.putQueryParameter("RoleName", roleName);
            this.roleName = roleName;
            return this;
        }

        /**
         * <p>The tags.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            String tagShrink = shrink(tag, "Tag", "json");
            this.putQueryParameter("Tag", tagShrink);
            this.tag = tag;
            return this;
        }

        @Override
        public CreateRoleRequest build() {
            return new CreateRoleRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateRoleRequest} extends {@link TeaModel}
     *
     * <p>CreateRoleRequest</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(Tag model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>k1</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>v1</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}
