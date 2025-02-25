// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

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
 * {@link CreateSshKeyResponseBody} extends {@link TeaModel}
 *
 * <p>CreateSshKeyResponseBody</p>
 */
public class CreateSshKeyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("errorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("errorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("sshKey")
    private SshKey sshKey;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private CreateSshKeyResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.sshKey = builder.sshKey;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSshKeyResponseBody create() {
        return builder().build();
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sshKey
     */
    public SshKey getSshKey() {
        return this.sshKey;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private SshKey sshKey; 
        private Boolean success; 

        /**
         * errorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * errorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * sshKey.
         */
        public Builder sshKey(SshKey sshKey) {
            this.sshKey = sshKey;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public CreateSshKeyResponseBody build() {
            return new CreateSshKeyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateSshKeyResponseBody} extends {@link TeaModel}
     *
     * <p>CreateSshKeyResponseBody</p>
     */
    public static class SshKey extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("publicKey")
        private String publicKey;

        private SshKey(Builder builder) {
            this.id = builder.id;
            this.publicKey = builder.publicKey;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SshKey create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return publicKey
         */
        public String getPublicKey() {
            return this.publicKey;
        }

        public static final class Builder {
            private Long id; 
            private String publicKey; 

            /**
             * id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * publicKey.
             */
            public Builder publicKey(String publicKey) {
                this.publicKey = publicKey;
                return this;
            }

            public SshKey build() {
                return new SshKey(this);
            } 

        } 

    }
}
