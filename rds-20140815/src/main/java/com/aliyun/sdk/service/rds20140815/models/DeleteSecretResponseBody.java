// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteSecretResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteSecretResponseBody</p>
 */
public class DeleteSecretResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SecretArn")
    private String secretArn;

    @com.aliyun.core.annotation.NameInMap("SecretName")
    private String secretName;

    @com.aliyun.core.annotation.NameInMap("Success")
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
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The ARN of the credential for the Data API account.
         */
        public Builder secretArn(String secretArn) {
            this.secretArn = secretArn;
            return this;
        }

        /**
         * The name of the credential.
         */
        public Builder secretName(String secretName) {
            this.secretName = secretName;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false**
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
