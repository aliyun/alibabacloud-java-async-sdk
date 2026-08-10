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
 * {@link ApiKey} extends {@link TeaModel}
 *
 * <p>ApiKey</p>
 */
public class ApiKey extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("apiKeyID")
    private String apiKeyID;

    @com.aliyun.core.annotation.NameInMap("apiKeyMask")
    private String apiKeyMask;

    @com.aliyun.core.annotation.NameInMap("apiKeyName")
    private String apiKeyName;

    @com.aliyun.core.annotation.NameInMap("apiKeyValue")
    private String apiKeyValue;

    @com.aliyun.core.annotation.NameInMap("createdTime")
    private String createdTime;

    @com.aliyun.core.annotation.NameInMap("expireTime")
    private String expireTime;

    @com.aliyun.core.annotation.NameInMap("ipBlacklist")
    private java.util.List<IPConfig> ipBlacklist;

    @com.aliyun.core.annotation.NameInMap("ipWhitelist")
    private java.util.List<IPConfig> ipWhitelist;

    @com.aliyun.core.annotation.NameInMap("lastUsedTime")
    private String lastUsedTime;

    @com.aliyun.core.annotation.NameInMap("resourceGroupID")
    private String resourceGroupID;

    @com.aliyun.core.annotation.NameInMap("source")
    private String source;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("teamID")
    private String teamID;

    @com.aliyun.core.annotation.NameInMap("teamName")
    private String teamName;

    @com.aliyun.core.annotation.NameInMap("teamPlan")
    private String teamPlan;

    @com.aliyun.core.annotation.NameInMap("userID")
    private String userID;

    @com.aliyun.core.annotation.NameInMap("username")
    private String username;

    private ApiKey(Builder builder) {
        this.apiKeyID = builder.apiKeyID;
        this.apiKeyMask = builder.apiKeyMask;
        this.apiKeyName = builder.apiKeyName;
        this.apiKeyValue = builder.apiKeyValue;
        this.createdTime = builder.createdTime;
        this.expireTime = builder.expireTime;
        this.ipBlacklist = builder.ipBlacklist;
        this.ipWhitelist = builder.ipWhitelist;
        this.lastUsedTime = builder.lastUsedTime;
        this.resourceGroupID = builder.resourceGroupID;
        this.source = builder.source;
        this.status = builder.status;
        this.teamID = builder.teamID;
        this.teamName = builder.teamName;
        this.teamPlan = builder.teamPlan;
        this.userID = builder.userID;
        this.username = builder.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ApiKey create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiKeyID
     */
    public String getApiKeyID() {
        return this.apiKeyID;
    }

    /**
     * @return apiKeyMask
     */
    public String getApiKeyMask() {
        return this.apiKeyMask;
    }

    /**
     * @return apiKeyName
     */
    public String getApiKeyName() {
        return this.apiKeyName;
    }

    /**
     * @return apiKeyValue
     */
    public String getApiKeyValue() {
        return this.apiKeyValue;
    }

    /**
     * @return createdTime
     */
    public String getCreatedTime() {
        return this.createdTime;
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
     * @return lastUsedTime
     */
    public String getLastUsedTime() {
        return this.lastUsedTime;
    }

    /**
     * @return resourceGroupID
     */
    public String getResourceGroupID() {
        return this.resourceGroupID;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return teamID
     */
    public String getTeamID() {
        return this.teamID;
    }

    /**
     * @return teamName
     */
    public String getTeamName() {
        return this.teamName;
    }

    /**
     * @return teamPlan
     */
    public String getTeamPlan() {
        return this.teamPlan;
    }

    /**
     * @return userID
     */
    public String getUserID() {
        return this.userID;
    }

    /**
     * @return username
     */
    public String getUsername() {
        return this.username;
    }

    public static final class Builder {
        private String apiKeyID; 
        private String apiKeyMask; 
        private String apiKeyName; 
        private String apiKeyValue; 
        private String createdTime; 
        private String expireTime; 
        private java.util.List<IPConfig> ipBlacklist; 
        private java.util.List<IPConfig> ipWhitelist; 
        private String lastUsedTime; 
        private String resourceGroupID; 
        private String source; 
        private String status; 
        private String teamID; 
        private String teamName; 
        private String teamPlan; 
        private String userID; 
        private String username; 

        private Builder() {
        } 

        private Builder(ApiKey model) {
            this.apiKeyID = model.apiKeyID;
            this.apiKeyMask = model.apiKeyMask;
            this.apiKeyName = model.apiKeyName;
            this.apiKeyValue = model.apiKeyValue;
            this.createdTime = model.createdTime;
            this.expireTime = model.expireTime;
            this.ipBlacklist = model.ipBlacklist;
            this.ipWhitelist = model.ipWhitelist;
            this.lastUsedTime = model.lastUsedTime;
            this.resourceGroupID = model.resourceGroupID;
            this.source = model.source;
            this.status = model.status;
            this.teamID = model.teamID;
            this.teamName = model.teamName;
            this.teamPlan = model.teamPlan;
            this.userID = model.userID;
            this.username = model.username;
        } 

        /**
         * apiKeyID.
         */
        public Builder apiKeyID(String apiKeyID) {
            this.apiKeyID = apiKeyID;
            return this;
        }

        /**
         * apiKeyMask.
         */
        public Builder apiKeyMask(String apiKeyMask) {
            this.apiKeyMask = apiKeyMask;
            return this;
        }

        /**
         * apiKeyName.
         */
        public Builder apiKeyName(String apiKeyName) {
            this.apiKeyName = apiKeyName;
            return this;
        }

        /**
         * apiKeyValue.
         */
        public Builder apiKeyValue(String apiKeyValue) {
            this.apiKeyValue = apiKeyValue;
            return this;
        }

        /**
         * createdTime.
         */
        public Builder createdTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }

        /**
         * expireTime.
         */
        public Builder expireTime(String expireTime) {
            this.expireTime = expireTime;
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
         * lastUsedTime.
         */
        public Builder lastUsedTime(String lastUsedTime) {
            this.lastUsedTime = lastUsedTime;
            return this;
        }

        /**
         * resourceGroupID.
         */
        public Builder resourceGroupID(String resourceGroupID) {
            this.resourceGroupID = resourceGroupID;
            return this;
        }

        /**
         * source.
         */
        public Builder source(String source) {
            this.source = source;
            return this;
        }

        /**
         * status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * teamID.
         */
        public Builder teamID(String teamID) {
            this.teamID = teamID;
            return this;
        }

        /**
         * teamName.
         */
        public Builder teamName(String teamName) {
            this.teamName = teamName;
            return this;
        }

        /**
         * teamPlan.
         */
        public Builder teamPlan(String teamPlan) {
            this.teamPlan = teamPlan;
            return this;
        }

        /**
         * userID.
         */
        public Builder userID(String userID) {
            this.userID = userID;
            return this;
        }

        /**
         * username.
         */
        public Builder username(String username) {
            this.username = username;
            return this;
        }

        public ApiKey build() {
            return new ApiKey(this);
        } 

    } 

}
