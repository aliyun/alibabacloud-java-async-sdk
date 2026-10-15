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
 * {@link ImportApiKeyInput} extends {@link TeaModel}
 *
 * <p>ImportApiKeyInput</p>
 */
public class ImportApiKeyInput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("apiKeyName")
    private String apiKeyName;

    @com.aliyun.core.annotation.NameInMap("apiKeyValue")
    private String apiKeyValue;

    @com.aliyun.core.annotation.NameInMap("expireTime")
    private String expireTime;

    @com.aliyun.core.annotation.NameInMap("teamID")
    private String teamID;

    private ImportApiKeyInput(Builder builder) {
        this.apiKeyName = builder.apiKeyName;
        this.apiKeyValue = builder.apiKeyValue;
        this.expireTime = builder.expireTime;
        this.teamID = builder.teamID;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ImportApiKeyInput create() {
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
     * @return apiKeyValue
     */
    public String getApiKeyValue() {
        return this.apiKeyValue;
    }

    /**
     * @return expireTime
     */
    public String getExpireTime() {
        return this.expireTime;
    }

    /**
     * @return teamID
     */
    public String getTeamID() {
        return this.teamID;
    }

    public static final class Builder {
        private String apiKeyName; 
        private String apiKeyValue; 
        private String expireTime; 
        private String teamID; 

        private Builder() {
        } 

        private Builder(ImportApiKeyInput model) {
            this.apiKeyName = model.apiKeyName;
            this.apiKeyValue = model.apiKeyValue;
            this.expireTime = model.expireTime;
            this.teamID = model.teamID;
        } 

        /**
         * <p>The name of the API key.</p>
         * 
         * <strong>example:</strong>
         * <p>dev</p>
         */
        public Builder apiKeyName(String apiKeyName) {
            this.apiKeyName = apiKeyName;
            return this;
        }

        /**
         * <p>The value of the API key to import.</p>
         */
        public Builder apiKeyValue(String apiKeyValue) {
            this.apiKeyValue = apiKeyValue;
            return this;
        }

        /**
         * <p>The expiration time of the API key.</p>
         */
        public Builder expireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }

        /**
         * <p>The unique identifier of the team to which the API key belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>70d1c834-0383-58d8-97ac-5336eb91abcd</p>
         */
        public Builder teamID(String teamID) {
            this.teamID = teamID;
            return this;
        }

        public ImportApiKeyInput build() {
            return new ImportApiKeyInput(this);
        } 

    } 

}
