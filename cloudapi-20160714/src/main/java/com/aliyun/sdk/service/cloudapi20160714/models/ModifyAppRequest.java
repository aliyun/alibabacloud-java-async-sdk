// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

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
 * {@link ModifyAppRequest} extends {@link RequestModel}
 *
 * <p>ModifyAppRequest</p>
 */
public class ModifyAppRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppName")
    private String appName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Disabled")
    private Boolean disabled;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Extend")
    private String extend;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    private ModifyAppRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.appName = builder.appName;
        this.description = builder.description;
        this.disabled = builder.disabled;
        this.extend = builder.extend;
        this.securityToken = builder.securityToken;
        this.tag = builder.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyAppRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public Long getAppId() {
        return this.appId;
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return disabled
     */
    public Boolean getDisabled() {
        return this.disabled;
    }

    /**
     * @return extend
     */
    public String getExtend() {
        return this.extend;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    /**
     * @return tag
     */
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    public static final class Builder extends Request.Builder<ModifyAppRequest, Builder> {
        private Long appId; 
        private String appName; 
        private String description; 
        private Boolean disabled; 
        private String extend; 
        private String securityToken; 
        private java.util.List<Tag> tag; 

        private Builder() {
            super();
        } 

        private Builder(ModifyAppRequest request) {
            super(request);
            this.appId = request.appId;
            this.appName = request.appName;
            this.description = request.description;
            this.disabled = request.disabled;
            this.extend = request.extend;
            this.securityToken = request.securityToken;
            this.tag = request.tag;
        } 

        /**
         * <p>The ID of the app.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>20112314518278</p>
         */
        public Builder appId(Long appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>The value must be 4 to 26 characters in length and can contain letters, digits, and underscores (_). It must start with a letter.</p>
         * <p>This parameter is required only when you want to modify the value.</p>
         * 
         * <strong>example:</strong>
         * <p>jiedian_pord</p>
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * <p>The description of the app. The description can contain a maximum of 180 characters in length.</p>
         * <p>This parameter is required only when you want to modify the value.</p>
         * 
         * <strong>example:</strong>
         * <p>modidyTest</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * Disabled.
         */
        public Builder disabled(Boolean disabled) {
            this.putQueryParameter("Disabled", disabled);
            this.disabled = disabled;
            return this;
        }

        /**
         * <p>扩展信息</p>
         * 
         * <strong>example:</strong>
         * <p>110461946884</p>
         */
        public Builder extend(String extend) {
            this.putQueryParameter("Extend", extend);
            this.extend = extend;
            return this;
        }

        /**
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        /**
         * <p>The tag of objects that match the rule. You can specify multiple tags.</p>
         * 
         * <strong>example:</strong>
         * <p>Key， Value</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        @Override
        public ModifyAppRequest build() {
            return new ModifyAppRequest(this);
        } 

    } 

    /**
     * 
     * {@link ModifyAppRequest} extends {@link TeaModel}
     *
     * <p>ModifyAppRequest</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        @com.aliyun.core.annotation.Validation(required = true)
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
             * <p>The value of the tag.</p>
             * <p>N can be an integer from 1 to 20.``</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>key</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the tag.</p>
             * <p>N can be an integer from 1 to 20.``</p>
             * 
             * <strong>example:</strong>
             * <p>value</p>
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
