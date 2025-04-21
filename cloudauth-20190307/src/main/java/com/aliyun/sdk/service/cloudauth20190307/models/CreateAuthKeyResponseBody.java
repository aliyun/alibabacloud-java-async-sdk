// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth20190307.models;

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
 * {@link CreateAuthKeyResponseBody} extends {@link TeaModel}
 *
 * <p>CreateAuthKeyResponseBody</p>
 */
public class CreateAuthKeyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AuthKey")
    private String authKey;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateAuthKeyResponseBody(Builder builder) {
        this.authKey = builder.authKey;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAuthKeyResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authKey
     */
    public String getAuthKey() {
        return this.authKey;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String authKey; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateAuthKeyResponseBody model) {
            this.authKey = model.authKey;
            this.requestId = model.requestId;
        } 

        /**
         * AuthKey.
         */
        public Builder authKey(String authKey) {
            this.authKey = authKey;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateAuthKeyResponseBody build() {
            return new CreateAuthKeyResponseBody(this);
        } 

    } 

}
