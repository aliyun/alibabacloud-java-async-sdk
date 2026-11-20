// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

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
 * {@link VerifyDomainOwnerResponseBody} extends {@link TeaModel}
 *
 * <p>VerifyDomainOwnerResponseBody</p>
 */
public class VerifyDomainOwnerResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("VerifyResult")
    private VerifyResult verifyResult;

    private VerifyDomainOwnerResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.verifyResult = builder.verifyResult;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VerifyDomainOwnerResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return verifyResult
     */
    public VerifyResult getVerifyResult() {
        return this.verifyResult;
    }

    public static final class Builder {
        private String requestId; 
        private VerifyResult verifyResult; 

        private Builder() {
        } 

        private Builder(VerifyDomainOwnerResponseBody model) {
            this.requestId = model.requestId;
            this.verifyResult = model.verifyResult;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F35F45B0-5D6B-4238-BE02-A62D****E840</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The verification result.</p>
         */
        public Builder verifyResult(VerifyResult verifyResult) {
            this.verifyResult = verifyResult;
            return this;
        }

        public VerifyDomainOwnerResponseBody build() {
            return new VerifyDomainOwnerResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link VerifyDomainOwnerResponseBody} extends {@link TeaModel}
     *
     * <p>VerifyDomainOwnerResponseBody</p>
     */
    public static class VerifyResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FailCode")
        private String failCode;

        @com.aliyun.core.annotation.NameInMap("Result")
        private Boolean result;

        private VerifyResult(Builder builder) {
            this.failCode = builder.failCode;
            this.result = builder.result;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VerifyResult create() {
            return builder().build();
        }

        /**
         * @return failCode
         */
        public String getFailCode() {
            return this.failCode;
        }

        /**
         * @return result
         */
        public Boolean getResult() {
            return this.result;
        }

        public static final class Builder {
            private String failCode; 
            private Boolean result; 

            private Builder() {
            } 

            private Builder(VerifyResult model) {
                this.failCode = model.failCode;
                this.result = model.result;
            } 

            /**
             * <p>The reason for verification failure.</p>
             * <ul>
             * <li>DnsTxtVerifyFailed: The DNS TXT record does not match.</li>
             * <li>DnsServerError: A DNS server error occurred.</li>
             * <li>VerifyFileNotExist: The verification file does not exist.</li>
             * <li>VerifyDomainNotAccess: Access to the domain name failed.</li>
             * <li>FileContentVerifyFailed: The file content does not match.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>DnsTxtVerifyFailed</p>
             */
            public Builder failCode(String failCode) {
                this.failCode = failCode;
                return this;
            }

            /**
             * <p>The verification result. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: The verification passed.</li>
             * <li><strong>false</strong>: The verification failed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder result(Boolean result) {
                this.result = result;
                return this;
            }

            public VerifyResult build() {
                return new VerifyResult(this);
            } 

        } 

    }
}
