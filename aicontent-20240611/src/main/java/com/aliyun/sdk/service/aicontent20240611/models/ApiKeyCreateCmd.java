// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aicontent20240611.models;

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
 * {@link ApiKeyCreateCmd} extends {@link TeaModel}
 *
 * <p>ApiKeyCreateCmd</p>
 */
public class ApiKeyCreateCmd extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("clientId")
    private Long clientId;

    private ApiKeyCreateCmd(Builder builder) {
        this.clientId = builder.clientId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ApiKeyCreateCmd create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientId
     */
    public Long getClientId() {
        return this.clientId;
    }

    public static final class Builder {
        private Long clientId; 

        private Builder() {
        } 

        private Builder(ApiKeyCreateCmd model) {
            this.clientId = model.clientId;
        } 

        /**
         * clientId.
         */
        public Builder clientId(Long clientId) {
            this.clientId = clientId;
            return this;
        }

        public ApiKeyCreateCmd build() {
            return new ApiKeyCreateCmd(this);
        } 

    } 

}
