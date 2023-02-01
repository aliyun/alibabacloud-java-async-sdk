// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreatePluginRequest} extends {@link RequestModel}
 *
 * <p>CreatePluginRequest</p>
 */
public class CreatePluginRequest extends Request {
    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("PluginData")
    @Validation(required = true)
    private String pluginData;

    @Query
    @NameInMap("PluginName")
    @Validation(required = true)
    private String pluginName;

    @Query
    @NameInMap("PluginType")
    @Validation(required = true)
    private String pluginType;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    @Query
    @NameInMap("Tag")
    private java.util.List < Tag> tag;

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
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    public static final class Builder extends Request.Builder<CreatePluginRequest, Builder> {
        private String description; 
        private String pluginData; 
        private String pluginName; 
        private String pluginType; 
        private String securityToken; 
        private java.util.List < Tag> tag; 

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
         * The description of the plug-in. The description can contain a maximum of 200 characters in length.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The plug-in definition statement, which can be in JSON or YAML format.
         */
        public Builder pluginData(String pluginData) {
            this.putQueryParameter("PluginData", pluginData);
            this.pluginData = pluginData;
            return this;
        }

        /**
         * The name of the plug-in. The name must be 4 to 50 characters in length and can contain letters, digits, and underscores (\_). However, it cannot start with an underscore.
         */
        public Builder pluginName(String pluginName) {
            this.putQueryParameter("PluginName", pluginName);
            this.pluginName = pluginName;
            return this;
        }

        /**
         * The type of the plug-in. Valid values:
         * <p>
         * 
         * *   **ipControl: IP address-based access control**
         * *   **trafficControl: throttling**
         * *   **backendSignature: backend signature**
         * *   **jwtAuth** :JWT (OpenId Connect) authentication
         * *   **cors** :cross-origin resource sharing (CORS)
         * *   **caching**
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
         * The tag of objects that match the rule. You can specify multiple tags.
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        @Override
        public CreatePluginRequest build() {
            return new CreatePluginRequest(this);
        } 

    } 

    public static class Tag extends TeaModel {
        @NameInMap("Key")
        @Validation(required = true)
        private String key;

        @NameInMap("Value")
        @Validation(required = true)
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
