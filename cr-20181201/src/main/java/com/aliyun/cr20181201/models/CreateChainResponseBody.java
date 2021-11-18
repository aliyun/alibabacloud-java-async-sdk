// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link CreateChainResponseBody} extends {@link TeaModel}
 *
 * <p>CreateChainResponseBody</p>
 */
public class CreateChainResponseBody extends TeaModel {
    @NameInMap("ChainId")
    private String chainId;

    @NameInMap("Code")
    private String code;

    @NameInMap("IsSuccess")
    private Boolean isSuccess;

    @NameInMap("RequestId")
    private String requestId;


    private CreateChainResponseBody(Builder builder) {
        this.chainId = builder.chainId;
        this.code = builder.code;
        this.isSuccess = builder.isSuccess;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateChainResponseBody create() {
        return builder().build();
    }

    /**
     * @return chainId
     */
    public String getChainId() {
        return this.chainId;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return isSuccess
     */
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String chainId; 
        private String code; 
        private Boolean isSuccess; 
        private String requestId; 

        /**
         * <p>ChainId.</p>
         */
        public Builder chainId(String chainId) {
            this.chainId = chainId;
            return this;
        }

        /**
         * <p>Code.</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>IsSuccess.</p>
         */
        public Builder isSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }

        /**
         * <p>RequestId.</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateChainResponseBody build() {
            return new CreateChainResponseBody(this);
        } 

    } 

}
