// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fcsandbox20260509.models;

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
 * {@link DescribeApiKeyResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeApiKeyResponseBody</p>
 */
public class DescribeApiKeyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("apiKey")
    private ApiKey apiKey;

    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("effectivePermissions")
    private EffectivePermissions effectivePermissions;

    @com.aliyun.core.annotation.NameInMap("ipBlacklist")
    private java.util.List<IPConfig> ipBlacklist;

    @com.aliyun.core.annotation.NameInMap("ipWhitelist")
    private java.util.List<IPConfig> ipWhitelist;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("permissionPolicy")
    private PermissionPolicy permissionPolicy;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private DescribeApiKeyResponseBody(Builder builder) {
        this.apiKey = builder.apiKey;
        this.code = builder.code;
        this.effectivePermissions = builder.effectivePermissions;
        this.ipBlacklist = builder.ipBlacklist;
        this.ipWhitelist = builder.ipWhitelist;
        this.message = builder.message;
        this.permissionPolicy = builder.permissionPolicy;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeApiKeyResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiKey
     */
    public ApiKey getApiKey() {
        return this.apiKey;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return effectivePermissions
     */
    public EffectivePermissions getEffectivePermissions() {
        return this.effectivePermissions;
    }

    /**
     * @return ipBlacklist
     */
    public java.util.List<IPConfig> getIpBlacklist() {
        return this.ipBlacklist;
    }

    /**
     * @return ipWhitelist
     */
    public java.util.List<IPConfig> getIpWhitelist() {
        return this.ipWhitelist;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return permissionPolicy
     */
    public PermissionPolicy getPermissionPolicy() {
        return this.permissionPolicy;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ApiKey apiKey; 
        private String code; 
        private EffectivePermissions effectivePermissions; 
        private java.util.List<IPConfig> ipBlacklist; 
        private java.util.List<IPConfig> ipWhitelist; 
        private String message; 
        private PermissionPolicy permissionPolicy; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeApiKeyResponseBody model) {
            this.apiKey = model.apiKey;
            this.code = model.code;
            this.effectivePermissions = model.effectivePermissions;
            this.ipBlacklist = model.ipBlacklist;
            this.ipWhitelist = model.ipWhitelist;
            this.message = model.message;
            this.permissionPolicy = model.permissionPolicy;
            this.requestId = model.requestId;
        } 

        /**
         * apiKey.
         */
        public Builder apiKey(ApiKey apiKey) {
            this.apiKey = apiKey;
            return this;
        }

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * effectivePermissions.
         */
        public Builder effectivePermissions(EffectivePermissions effectivePermissions) {
            this.effectivePermissions = effectivePermissions;
            return this;
        }

        /**
         * ipBlacklist.
         */
        public Builder ipBlacklist(java.util.List<IPConfig> ipBlacklist) {
            this.ipBlacklist = ipBlacklist;
            return this;
        }

        /**
         * ipWhitelist.
         */
        public Builder ipWhitelist(java.util.List<IPConfig> ipWhitelist) {
            this.ipWhitelist = ipWhitelist;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * permissionPolicy.
         */
        public Builder permissionPolicy(PermissionPolicy permissionPolicy) {
            this.permissionPolicy = permissionPolicy;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeApiKeyResponseBody build() {
            return new DescribeApiKeyResponseBody(this);
        } 

    } 

}
