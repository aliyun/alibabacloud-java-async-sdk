// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.trademark20190902.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SaveTemporaryApplicantResponseBody} extends {@link TeaModel}
 *
 * <p>SaveTemporaryApplicantResponseBody</p>
 */
public class SaveTemporaryApplicantResponseBody extends TeaModel {
    @NameInMap("ApplicantId")
    private Long applicantId;

    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private SaveTemporaryApplicantResponseBody(Builder builder) {
        this.applicantId = builder.applicantId;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveTemporaryApplicantResponseBody create() {
        return builder().build();
    }

    /**
     * @return applicantId
     */
    public Long getApplicantId() {
        return this.applicantId;
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Long applicantId; 
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        /**
         * ApplicantId.
         */
        public Builder applicantId(Long applicantId) {
            this.applicantId = applicantId;
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
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public SaveTemporaryApplicantResponseBody build() {
            return new SaveTemporaryApplicantResponseBody(this);
        } 

    } 

}
