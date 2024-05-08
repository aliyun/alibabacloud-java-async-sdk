// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeletePluginRequest} extends {@link RequestModel}
 *
 * <p>DeletePluginRequest</p>
 */
public class DeletePluginRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PluginId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String pluginId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List < Tag> tag;

    private DeletePluginRequest(Builder builder) {
        super(builder);
        this.pluginId = builder.pluginId;
        this.securityToken = builder.securityToken;
        this.tag = builder.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeletePluginRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pluginId
     */
    public String getPluginId() {
        return this.pluginId;
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
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    public static final class Builder extends Request.Builder<DeletePluginRequest, Builder> {
        private String pluginId; 
        private String securityToken; 
        private java.util.List < Tag> tag; 

        private Builder() {
            super();
        } 

        private Builder(DeletePluginRequest request) {
            super(request);
            this.pluginId = request.pluginId;
            this.securityToken = request.securityToken;
            this.tag = request.tag;
        } 

        /**
         * The ID of the plug-in to be deleted.
         */
        public Builder pluginId(String pluginId) {
            this.putQueryParameter("PluginId", pluginId);
            this.pluginId = pluginId;
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
         * The tag of objects that match the rule. You can specify multiple tags.
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        @Override
        public DeletePluginRequest build() {
            return new DeletePluginRequest(this);
        } 

    } 

    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        @com.aliyun.core.annotation.Validation(required = true)
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        @com.aliyun.core.annotation.Validation(required = true)
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

            /**
             * The key of the tag.
             * <p>
             * 
             * N can be an integer from 1 to 20.``
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of the tag.
             * <p>
             * 
             * N can be an integer from 1 to 20.``
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
