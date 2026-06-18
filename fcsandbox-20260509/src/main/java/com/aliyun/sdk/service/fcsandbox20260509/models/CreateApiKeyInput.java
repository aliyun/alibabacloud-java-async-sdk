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
 * {@link CreateApiKeyInput} extends {@link TeaModel}
 *
 * <p>CreateApiKeyInput</p>
 */
public class CreateApiKeyInput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("apiKeyName")
    private String apiKeyName;

    @com.aliyun.core.annotation.NameInMap("expireTime")
    private String expireTime;

    private CreateApiKeyInput(Builder builder) {
        this.apiKeyName = builder.apiKeyName;
        this.expireTime = builder.expireTime;
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

    public static final class Builder {
        private String apiKeyName; 
        private String expireTime; 

        private Builder() {
        } 

        private Builder(CreateApiKeyInput model) {
            this.apiKeyName = model.apiKeyName;
            this.expireTime = model.expireTime;
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

        public CreateApiKeyInput build() {
            return new CreateApiKeyInput(this);
        } 

    } 

}
