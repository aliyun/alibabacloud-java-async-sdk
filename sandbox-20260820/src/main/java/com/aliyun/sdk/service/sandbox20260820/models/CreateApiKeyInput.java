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
 * {@link CreateApiKeyInput} extends {@link TeaModel}
 *
 * <p>CreateApiKeyInput</p>
 */
public class CreateApiKeyInput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("apiKeyName")
    private String apiKeyName;

    @com.aliyun.core.annotation.NameInMap("expireTime")
    private String expireTime;

    @com.aliyun.core.annotation.NameInMap("ipBlacklist")
    private java.util.List<IPConfig> ipBlacklist;

    @com.aliyun.core.annotation.NameInMap("ipWhitelist")
    private java.util.List<IPConfig> ipWhitelist;

    @com.aliyun.core.annotation.NameInMap("teamID")
    private String teamID;

    private CreateApiKeyInput(Builder builder) {
        this.apiKeyName = builder.apiKeyName;
        this.expireTime = builder.expireTime;
        this.ipBlacklist = builder.ipBlacklist;
        this.ipWhitelist = builder.ipWhitelist;
        this.teamID = builder.teamID;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateApiKeyInput create() {
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
     * @return teamID
     */
    public String getTeamID() {
        return this.teamID;
    }

    public static final class Builder {
        private String apiKeyName; 
        private String expireTime; 
        private java.util.List<IPConfig> ipBlacklist; 
        private java.util.List<IPConfig> ipWhitelist; 
        private String teamID; 

        private Builder() {
        } 

        private Builder(CreateApiKeyInput model) {
            this.apiKeyName = model.apiKeyName;
            this.expireTime = model.expireTime;
            this.ipBlacklist = model.ipBlacklist;
            this.ipWhitelist = model.ipWhitelist;
            this.teamID = model.teamID;
        } 

        /**
         * <p>The name of the API key. The name can be up to 128 characters in length and can contain letters, digits, spaces, hyphens (-), underscores (_), and periods (.).</p>
         * 
         * <strong>example:</strong>
         * <p>ci-pipeline-key</p>
         */
        public Builder apiKeyName(String apiKeyName) {
            this.apiKeyName = apiKeyName;
            return this;
        }

        /**
         * <p>The expiration time of the API key. The time is in UTC and in the RFC 3339 format. If you leave this parameter empty, the API key never expires.</p>
         * 
         * <strong>example:</strong>
         * <p>2099-12-31T23:59:59Z</p>
         */
        public Builder expireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }

        /**
         * <p>The IP blacklist. After you configure this parameter, IP addresses in the list cannot use the API key. This parameter is mutually exclusive with ipWhitelist.</p>
         */
        public Builder ipBlacklist(java.util.List<IPConfig> ipBlacklist) {
            this.ipBlacklist = ipBlacklist;
            return this;
        }

        /**
         * <p>The IP address whitelist. After you configure this parameter, only IP addresses in the list can use the API key. This parameter is mutually exclusive with ipBlacklist.</p>
         */
        public Builder ipWhitelist(java.util.List<IPConfig> ipWhitelist) {
            this.ipWhitelist = ipWhitelist;
            return this;
        }

        /**
         * <p>The ID of the team to which the API key belongs. The value is in UUID format. If you do not specify this parameter, the default team of the current account is used.</p>
         * 
         * <strong>example:</strong>
         * <p>5f4a2c18-****</p>
         */
        public Builder teamID(String teamID) {
            this.teamID = teamID;
            return this;
        }

        public CreateApiKeyInput build() {
            return new CreateApiKeyInput(this);
        } 

    } 

}
