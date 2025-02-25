// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baasdis20200509.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link IssueNormalVerifiableVCResponseBody} extends {@link TeaModel}
 *
 * <p>IssueNormalVerifiableVCResponseBody</p>
 */
public class IssueNormalVerifiableVCResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResultCode")
    private String resultCode;

    @com.aliyun.core.annotation.NameInMap("ResultMessage")
    private String resultMessage;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("VerifiableClaimContent")
    private String verifiableClaimContent;

    @com.aliyun.core.annotation.NameInMap("VerifiableClaimId")
    private String verifiableClaimId;

    private IssueNormalVerifiableVCResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resultCode = builder.resultCode;
        this.resultMessage = builder.resultMessage;
        this.success = builder.success;
        this.verifiableClaimContent = builder.verifiableClaimContent;
        this.verifiableClaimId = builder.verifiableClaimId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static IssueNormalVerifiableVCResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resultCode
     */
    public String getResultCode() {
        return this.resultCode;
    }

    /**
     * @return resultMessage
     */
    public String getResultMessage() {
        return this.resultMessage;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return verifiableClaimContent
     */
    public String getVerifiableClaimContent() {
        return this.verifiableClaimContent;
    }

    /**
     * @return verifiableClaimId
     */
    public String getVerifiableClaimId() {
        return this.verifiableClaimId;
    }

    public static final class Builder {
        private String requestId; 
        private String resultCode; 
        private String resultMessage; 
        private Boolean success; 
        private String verifiableClaimContent; 
        private String verifiableClaimId; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ResultCode.
         */
        public Builder resultCode(String resultCode) {
            this.resultCode = resultCode;
            return this;
        }

        /**
         * ResultMessage.
         */
        public Builder resultMessage(String resultMessage) {
            this.resultMessage = resultMessage;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * VerifiableClaimContent.
         */
        public Builder verifiableClaimContent(String verifiableClaimContent) {
            this.verifiableClaimContent = verifiableClaimContent;
            return this;
        }

        /**
         * VerifiableClaimId.
         */
        public Builder verifiableClaimId(String verifiableClaimId) {
            this.verifiableClaimId = verifiableClaimId;
            return this;
        }

        public IssueNormalVerifiableVCResponseBody build() {
            return new IssueNormalVerifiableVCResponseBody(this);
        } 

    } 

}
