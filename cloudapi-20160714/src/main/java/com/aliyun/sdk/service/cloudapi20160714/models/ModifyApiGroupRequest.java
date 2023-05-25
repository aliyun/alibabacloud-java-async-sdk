// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyApiGroupRequest} extends {@link RequestModel}
 *
 * <p>ModifyApiGroupRequest</p>
 */
public class ModifyApiGroupRequest extends Request {
    @Query
    @NameInMap("BasePath")
    private String basePath;

    @Query
    @NameInMap("CompatibleFlags")
    private String compatibleFlags;

    @Query
    @NameInMap("CustomTraceConfig")
    private String customTraceConfig;

    @Query
    @NameInMap("CustomerConfigs")
    private String customerConfigs;

    @Query
    @NameInMap("DefaultDomain")
    private String defaultDomain;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("GroupId")
    @Validation(required = true)
    private String groupId;

    @Query
    @NameInMap("GroupName")
    private String groupName;

    @Query
    @NameInMap("PassthroughHeaders")
    private String passthroughHeaders;

    @Query
    @NameInMap("RpcPattern")
    private String rpcPattern;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    @Query
    @NameInMap("Tag")
    private java.util.List < Tag> tag;

    @Query
    @NameInMap("UserLogConfig")
    private String userLogConfig;

    private ModifyApiGroupRequest(Builder builder) {
        super(builder);
        this.basePath = builder.basePath;
        this.compatibleFlags = builder.compatibleFlags;
        this.customTraceConfig = builder.customTraceConfig;
        this.customerConfigs = builder.customerConfigs;
        this.defaultDomain = builder.defaultDomain;
        this.description = builder.description;
        this.groupId = builder.groupId;
        this.groupName = builder.groupName;
        this.passthroughHeaders = builder.passthroughHeaders;
        this.rpcPattern = builder.rpcPattern;
        this.securityToken = builder.securityToken;
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
        private String groupId; 
        private String groupName; 
        private String passthroughHeaders; 
        private String rpcPattern; 
        private String securityToken; 
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
            this.groupId = request.groupId;
            this.groupName = request.groupName;
            this.passthroughHeaders = request.passthroughHeaders;
            this.rpcPattern = request.rpcPattern;
            this.securityToken = request.securityToken;
            this.tag = request.tag;
            this.userLogConfig = request.userLogConfig;
        } 

        /**
         * BasePath.
         */
        public Builder basePath(String basePath) {
            this.putQueryParameter("BasePath", basePath);
            this.basePath = basePath;
            return this;
        }

        /**
         * CompatibleFlags.
         */
        public Builder compatibleFlags(String compatibleFlags) {
            this.putQueryParameter("CompatibleFlags", compatibleFlags);
            this.compatibleFlags = compatibleFlags;
            return this;
        }

        /**
         * CustomTraceConfig.
         */
        public Builder customTraceConfig(String customTraceConfig) {
            this.putQueryParameter("CustomTraceConfig", customTraceConfig);
            this.customTraceConfig = customTraceConfig;
            return this;
        }

        /**
         * CustomerConfigs.
         */
        public Builder customerConfigs(String customerConfigs) {
            this.putQueryParameter("CustomerConfigs", customerConfigs);
            this.customerConfigs = customerConfigs;
            return this;
        }

        /**
         * DefaultDomain.
         */
        public Builder defaultDomain(String defaultDomain) {
            this.putQueryParameter("DefaultDomain", defaultDomain);
            this.defaultDomain = defaultDomain;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * GroupId.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * GroupName.
         */
        public Builder groupName(String groupName) {
            this.putQueryParameter("GroupName", groupName);
            this.groupName = groupName;
            return this;
        }

        /**
         * PassthroughHeaders.
         */
        public Builder passthroughHeaders(String passthroughHeaders) {
            this.putQueryParameter("PassthroughHeaders", passthroughHeaders);
            this.passthroughHeaders = passthroughHeaders;
            return this;
        }

        /**
         * RpcPattern.
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
         * Tag.
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * UserLogConfig.
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
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
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
