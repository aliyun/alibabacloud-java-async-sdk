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
 * {@link CreatePluginRequest} extends {@link RequestModel}
 *
 * <p>CreatePluginRequest</p>
 */
public class CreatePluginRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PluginData")
    @com.aliyun.core.annotation.Validation(required = true)
    private String pluginData;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PluginName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String pluginName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PluginType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String pluginType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    private CreatePluginRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.pluginData = builder.pluginData;
        this.pluginName = builder.pluginName;
        this.pluginType = builder.pluginType;
        this.securityToken = builder.securityToken;
        this.tag = builder.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePluginRequest create() {
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
     * @return pluginData
     */
    public String getPluginData() {
        return this.pluginData;
    }

    /**
     * @return pluginName
     */
    public String getPluginName() {
        return this.pluginName;
    }

    /**
     * @return pluginType
     */
    public String getPluginType() {
        return this.pluginType;
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

    public static final class Builder extends Request.Builder<CreatePluginRequest, Builder> {
        private String description; 
        private String pluginData; 
        private String pluginName; 
        private String pluginType; 
        private String securityToken; 
        private java.util.List<Tag> tag; 

        private Builder() {
            super();
        } 

        private Builder(CreatePluginRequest request) {
            super(request);
            this.description = request.description;
            this.pluginData = request.pluginData;
            this.pluginName = request.pluginName;
            this.pluginType = request.pluginType;
            this.securityToken = request.securityToken;
            this.tag = request.tag;
        } 

        /**
         * <p>The description of the plug-in. The description can contain a maximum of 200 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>createPlugin</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The plug-in definition. Supported formats: JSON and YAML.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Plugin definition</p>
         */
        public Builder pluginData(String pluginData) {
            this.putQueryParameter("PluginData", pluginData);
            this.pluginData = pluginData;
            return this;
        }

        /**
         * <p>The name of the plug-in. The name must be 4 to 50 characters in length and can contain letters, digits, and underscores (_). However, it cannot start with an underscore.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>NewCors</p>
         */
        public Builder pluginName(String pluginName) {
            this.putQueryParameter("PluginName", pluginName);
            this.pluginName = pluginName;
            return this;
        }

        /**
         * <p>The type of the plug-in. Valid values:</p>
         * <ul>
         * <li><strong>ipControl: IP address-based access control</strong></li>
         * <li><strong>trafficControl: throttling</strong></li>
         * <li><strong>backendSignature: backend signature</strong></li>
         * <li><strong>jwtAuth</strong> :JWT (OpenId Connect) authentication</li>
         * <li><strong>cors</strong> :cross-origin resource sharing (CORS)</li>
         * <li><strong>caching</strong></li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cors</p>
         */
        public Builder pluginType(String pluginType) {
            this.putQueryParameter("PluginType", pluginType);
            this.pluginType = pluginType;
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
        public CreatePluginRequest build() {
            return new CreatePluginRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreatePluginRequest} extends {@link TeaModel}
     *
     * <p>CreatePluginRequest</p>
     */
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

            private Builder() {
            } 

            private Builder(Tag model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The key of the tag.</p>
             * <p>N can be an integer from 1 to 20.``</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>env</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the tag.</p>
             * <p>N can be an integer from 1 to 20.``</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot; &quot;</p>
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
