// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyApiGroupRequest} extends {@link RequestModel}
 *
 * <p>ModifyApiGroupRequest</p>
 */
public class ModifyApiGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BasePath")
    private String basePath;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CompatibleFlags")
    private String compatibleFlags;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomTraceConfig")
    private String customTraceConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomerConfigs")
    private String customerConfigs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DefaultDomain")
    private String defaultDomain;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FilterAppCodeForBackend")
    private String filterAppCodeForBackend;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupName")
    private String groupName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PassthroughHeaders")
    private String passthroughHeaders;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RpcPattern")
    private String rpcPattern;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SupportSSE")
    private String supportSSE;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List < Tag> tag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserLogConfig")
    private String userLogConfig;

    private ModifyApiGroupRequest(Builder builder) {
        super(builder);
        this.basePath = builder.basePath;
        this.compatibleFlags = builder.compatibleFlags;
        this.customTraceConfig = builder.customTraceConfig;
        this.customerConfigs = builder.customerConfigs;
        this.defaultDomain = builder.defaultDomain;
        this.description = builder.description;
        this.filterAppCodeForBackend = builder.filterAppCodeForBackend;
        this.groupId = builder.groupId;
        this.groupName = builder.groupName;
        this.passthroughHeaders = builder.passthroughHeaders;
        this.rpcPattern = builder.rpcPattern;
        this.securityToken = builder.securityToken;
        this.supportSSE = builder.supportSSE;
        this.tag = builder.tag;
        this.userLogConfig = builder.userLogConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyApiGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return basePath
     */
    public String getBasePath() {
        return this.basePath;
    }

    /**
     * @return compatibleFlags
     */
    public String getCompatibleFlags() {
        return this.compatibleFlags;
    }

    /**
     * @return customTraceConfig
     */
    public String getCustomTraceConfig() {
        return this.customTraceConfig;
    }

    /**
     * @return customerConfigs
     */
    public String getCustomerConfigs() {
        return this.customerConfigs;
    }

    /**
     * @return defaultDomain
     */
    public String getDefaultDomain() {
        return this.defaultDomain;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return filterAppCodeForBackend
     */
    public String getFilterAppCodeForBackend() {
        return this.filterAppCodeForBackend;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return groupName
     */
    public String getGroupName() {
        return this.groupName;
    }

    /**
     * @return passthroughHeaders
     */
    public String getPassthroughHeaders() {
        return this.passthroughHeaders;
    }

    /**
     * @return rpcPattern
     */
    public String getRpcPattern() {
        return this.rpcPattern;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    /**
     * @return supportSSE
     */
    public String getSupportSSE() {
        return this.supportSSE;
    }

    /**
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    /**
     * @return userLogConfig
     */
    public String getUserLogConfig() {
        return this.userLogConfig;
    }

    public static final class Builder extends Request.Builder<ModifyApiGroupRequest, Builder> {
        private String basePath; 
        private String compatibleFlags; 
        private String customTraceConfig; 
        private String customerConfigs; 
        private String defaultDomain; 
        private String description; 
        private String filterAppCodeForBackend; 
        private String groupId; 
        private String groupName; 
        private String passthroughHeaders; 
        private String rpcPattern; 
        private String securityToken; 
        private String supportSSE; 
        private java.util.List < Tag> tag; 
        private String userLogConfig; 

        private Builder() {
            super();
        } 

        private Builder(ModifyApiGroupRequest request) {
            super(request);
            this.basePath = request.basePath;
            this.compatibleFlags = request.compatibleFlags;
            this.customTraceConfig = request.customTraceConfig;
            this.customerConfigs = request.customerConfigs;
            this.defaultDomain = request.defaultDomain;
            this.description = request.description;
            this.filterAppCodeForBackend = request.filterAppCodeForBackend;
            this.groupId = request.groupId;
            this.groupName = request.groupName;
            this.passthroughHeaders = request.passthroughHeaders;
            this.rpcPattern = request.rpcPattern;
            this.securityToken = request.securityToken;
            this.supportSSE = request.supportSSE;
            this.tag = request.tag;
            this.userLogConfig = request.userLogConfig;
        } 

        /**
         * The root path of the API.
         */
        public Builder basePath(String basePath) {
            this.putQueryParameter("BasePath", basePath);
            this.basePath = basePath;
            return this;
        }

        /**
         * The list of associated tags. Separate multiple tags with commas (,).
         */
        public Builder compatibleFlags(String compatibleFlags) {
            this.putQueryParameter("CompatibleFlags", compatibleFlags);
            this.compatibleFlags = compatibleFlags;
            return this;
        }

        /**
         * The custom trace configuration.
         */
        public Builder customTraceConfig(String customTraceConfig) {
            this.putQueryParameter("CustomTraceConfig", customTraceConfig);
            this.customTraceConfig = customTraceConfig;
            return this;
        }

        /**
         * The data of custom configuration items.
         */
        public Builder customerConfigs(String customerConfigs) {
            this.putQueryParameter("CustomerConfigs", customerConfigs);
            this.customerConfigs = customerConfigs;
            return this;
        }

        /**
         * The default domain name.
         */
        public Builder defaultDomain(String defaultDomain) {
            this.putQueryParameter("DefaultDomain", defaultDomain);
            this.defaultDomain = defaultDomain;
            return this;
        }

        /**
         * The API group description that you want to specify, which cannot exceed 180 characters. If this parameter is not specified, the group description is not modified.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * FilterAppCodeForBackend.
         */
        public Builder filterAppCodeForBackend(String filterAppCodeForBackend) {
            this.putQueryParameter("FilterAppCodeForBackend", filterAppCodeForBackend);
            this.filterAppCodeForBackend = filterAppCodeForBackend;
            return this;
        }

        /**
         * The ID of the API group. This ID is generated by the system and globally unique.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * The API group name must be globally unique. The name must be 4 to 50 characters in length. It must start with a letter and can contain letters, digits, and underscores (\_). If this parameter is not specified, the group name is not modified.
         */
        public Builder groupName(String groupName) {
            this.putQueryParameter("GroupName", groupName);
            this.groupName = groupName;
            return this;
        }

        /**
         * Specifies whether to pass headers.
         */
        public Builder passthroughHeaders(String passthroughHeaders) {
            this.putQueryParameter("PassthroughHeaders", passthroughHeaders);
            this.passthroughHeaders = passthroughHeaders;
            return this;
        }

        /**
         * The RPC mode.
         */
        public Builder rpcPattern(String rpcPattern) {
            this.putQueryParameter("RpcPattern", rpcPattern);
            this.rpcPattern = rpcPattern;
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
         * SupportSSE.
         */
        public Builder supportSSE(String supportSSE) {
            this.putQueryParameter("SupportSSE", supportSSE);
            this.supportSSE = supportSSE;
            return this;
        }

        /**
         * The object tags that match the lifecycle rule. You can specify multiple tags.
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * The user log configuration.
         */
        public Builder userLogConfig(String userLogConfig) {
            this.putQueryParameter("UserLogConfig", userLogConfig);
            this.userLogConfig = userLogConfig;
            return this;
        }

        @Override
        public ModifyApiGroupRequest build() {
            return new ModifyApiGroupRequest(this);
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
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of the tag.
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
