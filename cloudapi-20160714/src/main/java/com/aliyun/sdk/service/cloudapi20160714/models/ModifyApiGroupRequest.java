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
    @com.aliyun.core.annotation.NameInMap("CustomAppCodeConfig")
    private String customAppCodeConfig;

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
    @com.aliyun.core.annotation.NameInMap("RpsLimitForServerless")
    private String rpsLimitForServerless;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SupportSSE")
    private String supportSSE;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserLogConfig")
    private String userLogConfig;

    private ModifyApiGroupRequest(Builder builder) {
        super(builder);
        this.basePath = builder.basePath;
        this.compatibleFlags = builder.compatibleFlags;
        this.customAppCodeConfig = builder.customAppCodeConfig;
        this.customTraceConfig = builder.customTraceConfig;
        this.customerConfigs = builder.customerConfigs;
        this.defaultDomain = builder.defaultDomain;
        this.description = builder.description;
        this.filterAppCodeForBackend = builder.filterAppCodeForBackend;
        this.groupId = builder.groupId;
        this.groupName = builder.groupName;
        this.passthroughHeaders = builder.passthroughHeaders;
        this.rpcPattern = builder.rpcPattern;
        this.rpsLimitForServerless = builder.rpsLimitForServerless;
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
     * @return customAppCodeConfig
     */
    public String getCustomAppCodeConfig() {
        return this.customAppCodeConfig;
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
     * @return rpsLimitForServerless
     */
    public String getRpsLimitForServerless() {
        return this.rpsLimitForServerless;
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
    public java.util.List<Tag> getTag() {
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
        private String customAppCodeConfig; 
        private String customTraceConfig; 
        private String customerConfigs; 
        private String defaultDomain; 
        private String description; 
        private String filterAppCodeForBackend; 
        private String groupId; 
        private String groupName; 
        private String passthroughHeaders; 
        private String rpcPattern; 
        private String rpsLimitForServerless; 
        private String securityToken; 
        private String supportSSE; 
        private java.util.List<Tag> tag; 
        private String userLogConfig; 

        private Builder() {
            super();
        } 

        private Builder(ModifyApiGroupRequest request) {
            super(request);
            this.basePath = request.basePath;
            this.compatibleFlags = request.compatibleFlags;
            this.customAppCodeConfig = request.customAppCodeConfig;
            this.customTraceConfig = request.customTraceConfig;
            this.customerConfigs = request.customerConfigs;
            this.defaultDomain = request.defaultDomain;
            this.description = request.description;
            this.filterAppCodeForBackend = request.filterAppCodeForBackend;
            this.groupId = request.groupId;
            this.groupName = request.groupName;
            this.passthroughHeaders = request.passthroughHeaders;
            this.rpcPattern = request.rpcPattern;
            this.rpsLimitForServerless = request.rpsLimitForServerless;
            this.securityToken = request.securityToken;
            this.supportSSE = request.supportSSE;
            this.tag = request.tag;
            this.userLogConfig = request.userLogConfig;
        } 

        /**
         * <p>The root path of the API.</p>
         * 
         * <strong>example:</strong>
         * <p>/eeee</p>
         */
        public Builder basePath(String basePath) {
            this.putQueryParameter("BasePath", basePath);
            this.basePath = basePath;
            return this;
        }

        /**
         * <p>The list of associated tags. Separate multiple tags with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>depart:dep1</p>
         */
        public Builder compatibleFlags(String compatibleFlags) {
            this.putQueryParameter("CompatibleFlags", compatibleFlags);
            this.compatibleFlags = compatibleFlags;
            return this;
        }

        /**
         * <p>The custom appcode configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;location&quot;:&quot;HEADER&quot;,&quot;name&quot;:&quot;myAppCodeHeader&quot;}</p>
         */
        public Builder customAppCodeConfig(String customAppCodeConfig) {
            this.putQueryParameter("CustomAppCodeConfig", customAppCodeConfig);
            this.customAppCodeConfig = customAppCodeConfig;
            return this;
        }

        /**
         * <p>The custom trace configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;parameterLocation&quot;:&quot;HEADER&quot;,&quot;parameterName&quot;:&quot;traceId&quot;}</p>
         */
        public Builder customTraceConfig(String customTraceConfig) {
            this.putQueryParameter("CustomTraceConfig", customTraceConfig);
            this.customTraceConfig = customTraceConfig;
            return this;
        }

        /**
         * <p>The data of custom configuration items.</p>
         * 
         * <strong>example:</strong>
         * <p>removeResponseServerHeader</p>
         */
        public Builder customerConfigs(String customerConfigs) {
            this.putQueryParameter("CustomerConfigs", customerConfigs);
            this.customerConfigs = customerConfigs;
            return this;
        }

        /**
         * <p>The default domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>mkt.api.gaore.com</p>
         */
        public Builder defaultDomain(String defaultDomain) {
            this.putQueryParameter("DefaultDomain", defaultDomain);
            this.defaultDomain = defaultDomain;
            return this;
        }

        /**
         * <p>The API group description that you want to specify, which cannot exceed 180 characters. If this parameter is not specified, the group description is not modified.</p>
         * 
         * <strong>example:</strong>
         * <p>New weather informations.</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>If filter AppCode for backend.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder filterAppCodeForBackend(String filterAppCodeForBackend) {
            this.putQueryParameter("FilterAppCodeForBackend", filterAppCodeForBackend);
            this.filterAppCodeForBackend = filterAppCodeForBackend;
            return this;
        }

        /**
         * <p>The ID of the API group. This ID is generated by the system and globally unique.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>523e8dc7bbe04613b5b1d726c2a7889d</p>
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The API group name must be globally unique. The name must be 4 to 50 characters in length. It must start with a letter and can contain letters, digits, and underscores (_). If this parameter is not specified, the group name is not modified.</p>
         * 
         * <strong>example:</strong>
         * <p>NewWeather</p>
         */
        public Builder groupName(String groupName) {
            this.putQueryParameter("GroupName", groupName);
            this.groupName = groupName;
            return this;
        }

        /**
         * <p>Specifies whether to pass headers.</p>
         * 
         * <strong>example:</strong>
         * <p>eagleeye-rpcid,x-b3-traceid,host</p>
         */
        public Builder passthroughHeaders(String passthroughHeaders) {
            this.putQueryParameter("PassthroughHeaders", passthroughHeaders);
            this.passthroughHeaders = passthroughHeaders;
            return this;
        }

        /**
         * <p>The RPC mode.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder rpcPattern(String rpcPattern) {
            this.putQueryParameter("RpcPattern", rpcPattern);
            this.rpcPattern = rpcPattern;
            return this;
        }

        /**
         * RpsLimitForServerless.
         */
        public Builder rpsLimitForServerless(String rpsLimitForServerless) {
            this.putQueryParameter("RpsLimitForServerless", rpsLimitForServerless);
            this.rpsLimitForServerless = rpsLimitForServerless;
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
         * <p>If support SSE.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder supportSSE(String supportSSE) {
            this.putQueryParameter("SupportSSE", supportSSE);
            this.supportSSE = supportSSE;
            return this;
        }

        /**
         * <p>The object tags that match the lifecycle rule. You can specify multiple tags.</p>
         * 
         * <strong>example:</strong>
         * <p>Key， Value</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>The user log configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;requestBody&quot;:false,&quot;responseBody&quot;:false,&quot;queryString&quot;:&quot;&quot;,&quot;requestHeaders&quot;:&quot;&quot;,&quot;responseHeaders&quot;:&quot;&quot;,&quot;jwtClaims&quot;:&quot;&quot;}</p>
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

    /**
     * 
     * {@link ModifyApiGroupRequest} extends {@link TeaModel}
     *
     * <p>ModifyApiGroupRequest</p>
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
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>uat</p>
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
