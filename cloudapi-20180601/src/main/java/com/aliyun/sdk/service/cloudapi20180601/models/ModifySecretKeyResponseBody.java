// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20180601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifySecretKeyResponseBody} extends {@link TeaModel}
 *
 * <p>ModifySecretKeyResponseBody</p>
 */
public class ModifySecretKeyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SecretKeyId")
    private String secretKeyId;

    @NameInMap("SecretKeyName")
    private String secretKeyName;

    private ModifySecretKeyResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.secretKeyId = builder.secretKeyId;
        this.secretKeyName = builder.secretKeyName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifySecretKeyResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return secretKeyId
     */
    public String getSecretKeyId() {
        return this.secretKeyId;
    }

    /**
     * @return secretKeyName
     */
    public String getSecretKeyName() {
        return this.secretKeyName;
    }

    public static final class Builder {
        private String requestId; 
        private String secretKeyId; 
        private String secretKeyName; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SecretKeyId.
         */
        public Builder secretKeyId(String secretKeyId) {
            this.secretKeyId = secretKeyId;
            return this;
        }

        /**
         * SecretKeyName.
         */
        public Builder secretKeyName(String secretKeyName) {
            this.secretKeyName = secretKeyName;
            return this;
        }

        public ModifySecretKeyResponseBody build() {
            return new ModifySecretKeyResponseBody(this);
        } 

    } 

}
