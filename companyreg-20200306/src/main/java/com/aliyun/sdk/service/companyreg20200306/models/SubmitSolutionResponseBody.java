// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.companyreg20200306.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitSolutionResponseBody} extends {@link TeaModel}
 *
 * <p>SubmitSolutionResponseBody</p>
 */
public class SubmitSolutionResponseBody extends TeaModel {
    @NameInMap("ConfirmUrl")
    private String confirmUrl;

    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMsg")
    private String errorMsg;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SolutionBizId")
    private String solutionBizId;

    @NameInMap("Success")
    private Boolean success;

    private SubmitSolutionResponseBody(Builder builder) {
        this.confirmUrl = builder.confirmUrl;
        this.errorCode = builder.errorCode;
        this.errorMsg = builder.errorMsg;
        this.requestId = builder.requestId;
        this.solutionBizId = builder.solutionBizId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitSolutionResponseBody create() {
        return builder().build();
    }

    /**
     * @return confirmUrl
     */
    public String getConfirmUrl() {
        return this.confirmUrl;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMsg
     */
    public String getErrorMsg() {
        return this.errorMsg;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return solutionBizId
     */
    public String getSolutionBizId() {
        return this.solutionBizId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String confirmUrl; 
        private String errorCode; 
        private String errorMsg; 
        private String requestId; 
        private String solutionBizId; 
        private Boolean success; 

        /**
         * ConfirmUrl.
         */
        public Builder confirmUrl(String confirmUrl) {
            this.confirmUrl = confirmUrl;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * ErrorMsg.
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SolutionBizId.
         */
        public Builder solutionBizId(String solutionBizId) {
            this.solutionBizId = solutionBizId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public SubmitSolutionResponseBody build() {
            return new SubmitSolutionResponseBody(this);
        } 

    } 

}
