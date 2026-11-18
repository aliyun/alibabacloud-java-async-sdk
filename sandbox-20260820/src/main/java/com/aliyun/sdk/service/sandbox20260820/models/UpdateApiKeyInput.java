// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sandbox20260820.models;

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
 * {@link UpdateApiKeyInput} extends {@link TeaModel}
 *
 * <p>UpdateApiKeyInput</p>
 */
public class UpdateApiKeyInput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("apiKeyName")
    private String apiKeyName;

    @com.aliyun.core.annotation.NameInMap("expireTime")
    private String expireTime;

    @com.aliyun.core.annotation.NameInMap("ipBlacklist")
    private java.util.List<IPConfig> ipBlacklist;

    @com.aliyun.core.annotation.NameInMap("ipWhitelist")
    private java.util.List<IPConfig> ipWhitelist;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("vpcBindings")
    private java.util.List<String> vpcBindings;

    private UpdateApiKeyInput(Builder builder) {
        this.apiKeyName = builder.apiKeyName;
        this.expireTime = builder.expireTime;
        this.ipBlacklist = builder.ipBlacklist;
        this.ipWhitelist = builder.ipWhitelist;
        this.status = builder.status;
        this.vpcBindings = builder.vpcBindings;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateApiKeyInput create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiKeyName
     */
    public String getApiKeyName() {
        return this.apiKeyName;
    }

    /**
     * @return expireTime
     */
    public String getExpireTime() {
        return this.expireTime;
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
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return vpcBindings
     */
    public java.util.List<String> getVpcBindings() {
        return this.vpcBindings;
    }

    public static final class Builder {
        private String apiKeyName; 
        private String expireTime; 
        private java.util.List<IPConfig> ipBlacklist; 
        private java.util.List<IPConfig> ipWhitelist; 
        private String status; 
        private java.util.List<String> vpcBindings; 

        private Builder() {
        } 

        private Builder(UpdateApiKeyInput model) {
            this.apiKeyName = model.apiKeyName;
            this.expireTime = model.expireTime;
            this.ipBlacklist = model.ipBlacklist;
            this.ipWhitelist = model.ipWhitelist;
            this.status = model.status;
            this.vpcBindings = model.vpcBindings;
        } 

        /**
         * <p>The new name of the API key. The name can be up to 128 characters in length and can contain only letters, digits, spaces, hyphens (-), underscores (_), and periods (.).</p>
         * 
         * <strong>example:</strong>
         * <p>ci-pipeline-key-v2</p>
         */
        public Builder apiKeyName(String apiKeyName) {
            this.apiKeyName = apiKeyName;
            return this;
        }

        /**
         * <p>The expiration time of the API key in UTC. The time must be in RFC 3339 format. An empty value indicates that the API key never expires.</p>
         * 
         * <strong>example:</strong>
         * <p>2099-12-31T23:59:59Z</p>
         */
        public Builder expireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }

        /**
         * <p>The IP address blacklist. If you specify this parameter, the existing blacklist is completely overwritten. This parameter is mutually exclusive with ipWhitelist.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;ipAddress&quot;:&quot;192.0.2.1&quot;,&quot;description&quot;:&quot;example client&quot;}]</p>
         */
        public Builder ipBlacklist(java.util.List<IPConfig> ipBlacklist) {
            this.ipBlacklist = ipBlacklist;
            return this;
        }

        /**
         * <p>The IP address whitelist. If you specify this parameter, the existing whitelist is completely overwritten. This parameter is mutually exclusive with ipBlacklist.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;ipAddress&quot;:&quot;192.0.2.1&quot;,&quot;description&quot;:&quot;example client&quot;}]</p>
         */
        public Builder ipWhitelist(java.util.List<IPConfig> ipWhitelist) {
            this.ipWhitelist = ipWhitelist;
            return this;
        }

        /**
         * <p>The new status of the API key. Valid values:</p>
         * <ul>
         * <li>active: Enabled.</li>
         * <li>inactive: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>inactive</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The set of allowed source VPC IDs. This set is updated independently of the IP blacklists and whitelists. If you omit this parameter or set it to null, the original set is retained. A non-empty array completely replaces the original set. An explicit empty array [] purges the VPC restrictions. Updating only this parameter does not affect the IP address lists, and updating the IP address lists does not affect the VPC restrictions. An empty request body {} purges all IP address and VPC source restrictions. You can update this parameter along with other parameters such as the name.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;vpc-examplea&quot;,&quot;vpc-exampleb&quot;]</p>
         */
        public Builder vpcBindings(java.util.List<String> vpcBindings) {
            this.vpcBindings = vpcBindings;
            return this;
        }

        public UpdateApiKeyInput build() {
            return new UpdateApiKeyInput(this);
        } 

    } 

}
