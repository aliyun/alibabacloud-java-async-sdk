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

    private UpdateApiKeyInput(Builder builder) {
        this.apiKeyName = builder.apiKeyName;
        this.expireTime = builder.expireTime;
        this.ipBlacklist = builder.ipBlacklist;
        this.ipWhitelist = builder.ipWhitelist;
        this.status = builder.status;
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

    public static final class Builder {
        private String apiKeyName; 
        private String expireTime; 
        private java.util.List<IPConfig> ipBlacklist; 
        private java.util.List<IPConfig> ipWhitelist; 
        private String status; 

        private Builder() {
        } 

        private Builder(UpdateApiKeyInput model) {
            this.apiKeyName = model.apiKeyName;
            this.expireTime = model.expireTime;
            this.ipBlacklist = model.ipBlacklist;
            this.ipWhitelist = model.ipWhitelist;
            this.status = model.status;
        } 

        /**
         * apiKeyName.
         */
        public Builder apiKeyName(String apiKeyName) {
            this.apiKeyName = apiKeyName;
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
         * status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public UpdateApiKeyInput build() {
            return new UpdateApiKeyInput(this);
        } 

    } 

}
