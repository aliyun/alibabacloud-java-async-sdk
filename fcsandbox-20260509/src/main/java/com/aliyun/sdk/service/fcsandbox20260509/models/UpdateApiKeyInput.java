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

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    private UpdateApiKeyInput(Builder builder) {
        this.apiKeyName = builder.apiKeyName;
        this.expireTime = builder.expireTime;
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
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String apiKeyName; 
        private String expireTime; 
        private String status; 

        private Builder() {
        } 

        private Builder(UpdateApiKeyInput model) {
            this.apiKeyName = model.apiKeyName;
            this.expireTime = model.expireTime;
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
