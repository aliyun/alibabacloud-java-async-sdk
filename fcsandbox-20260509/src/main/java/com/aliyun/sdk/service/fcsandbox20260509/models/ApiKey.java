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

    @com.aliyun.core.annotation.NameInMap("lastUsedTime")
    private String lastUsedTime;

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
        this.lastUsedTime = builder.lastUsedTime;
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
     * @return lastUsedTime
     */
    public String getLastUsedTime() {
        return this.lastUsedTime;
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
        private String lastUsedTime; 
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
            this.lastUsedTime = model.lastUsedTime;
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
         * lastUsedTime.
         */
        public Builder lastUsedTime(String lastUsedTime) {
            this.lastUsedTime = lastUsedTime;
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
