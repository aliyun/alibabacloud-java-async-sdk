// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteSecretResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteSecretResponseBody</p>
 */
public class DeleteSecretResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SecretArn")
    private String secretArn;

    @NameInMap("SecretName")
    private String secretName;

    @NameInMap("Success")
    private Boolean success;

    private DeleteSecretResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.secretArn = builder.secretArn;
        this.secretName = builder.secretName;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSecretResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return secretArn
     */
    public String getSecretArn() {
        return this.secretArn;
    }

    /**
     * @return secretName
     */
    public String getSecretName() {
        return this.secretName;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String requestId; 
        private String secretArn; 
        private String secretName; 
        private Boolean success; 

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SecretArn.
         */
        public Builder secretArn(String secretArn) {
            this.secretArn = secretArn;
            return this;
        }

        /**
         * SecretName.
         */
        public Builder secretName(String secretName) {
            this.secretName = secretName;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DeleteSecretResponseBody build() {
            return new DeleteSecretResponseBody(this);
        } 

    } 

}
