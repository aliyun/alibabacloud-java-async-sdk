// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResetSshKeyResponseBody} extends {@link TeaModel}
 *
 * <p>ResetSshKeyResponseBody</p>
 */
public class ResetSshKeyResponseBody extends TeaModel {
    @NameInMap("errorCode")
    private String errorCode;

    @NameInMap("errorMessage")
    private String errorMessage;

    @NameInMap("requestId")
    private String requestId;

    @NameInMap("sshKey")
    private SshKey sshKey;

    @NameInMap("success")
    private Boolean success;

    private ResetSshKeyResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.sshKey = builder.sshKey;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResetSshKeyResponseBody create() {
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
         * 错误码
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * 错误信息
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * 请求id，每次请求都是唯一值，便于后续排查问题
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 企业公钥
         */
        public Builder sshKey(SshKey sshKey) {
            this.sshKey = sshKey;
            return this;
        }

        /**
         * true 接口调用成功，false 接口调用失败
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ResetSshKeyResponseBody build() {
            return new ResetSshKeyResponseBody(this);
        } 

    } 

    public static class SshKey extends TeaModel {
        @NameInMap("id")
        private Long id;

        @NameInMap("publicKey")
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
             * 企业公钥id
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * 企业公钥
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
