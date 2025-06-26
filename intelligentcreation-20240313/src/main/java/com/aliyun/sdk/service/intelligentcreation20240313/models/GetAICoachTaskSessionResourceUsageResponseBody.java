// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240313.models;

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
 * {@link GetAICoachTaskSessionResourceUsageResponseBody} extends {@link TeaModel}
 *
 * <p>GetAICoachTaskSessionResourceUsageResponseBody</p>
 */
public class GetAICoachTaskSessionResourceUsageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("audioUsage")
    private Integer audioUsage;

    @com.aliyun.core.annotation.NameInMap("deductionStatus")
    private Integer deductionStatus;

    @com.aliyun.core.annotation.NameInMap("errorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("errorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("tokenUsage")
    private Integer tokenUsage;

    private GetAICoachTaskSessionResourceUsageResponseBody(Builder builder) {
        this.audioUsage = builder.audioUsage;
        this.deductionStatus = builder.deductionStatus;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.tokenUsage = builder.tokenUsage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAICoachTaskSessionResourceUsageResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return audioUsage
     */
    public Integer getAudioUsage() {
        return this.audioUsage;
    }

    /**
     * @return deductionStatus
     */
    public Integer getDeductionStatus() {
        return this.deductionStatus;
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

    /**
     * @return tokenUsage
     */
    public Integer getTokenUsage() {
        return this.tokenUsage;
    }

    public static final class Builder {
        private Integer audioUsage; 
        private Integer deductionStatus; 
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 
        private Integer tokenUsage; 

        private Builder() {
        } 

        private Builder(GetAICoachTaskSessionResourceUsageResponseBody model) {
            this.audioUsage = model.audioUsage;
            this.deductionStatus = model.deductionStatus;
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.success = model.success;
            this.tokenUsage = model.tokenUsage;
        } 

        /**
         * audioUsage.
         */
        public Builder audioUsage(Integer audioUsage) {
            this.audioUsage = audioUsage;
            return this;
        }

        /**
         * deductionStatus.
         */
        public Builder deductionStatus(Integer deductionStatus) {
            this.deductionStatus = deductionStatus;
            return this;
        }

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
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>4D902811-B75C-5D1B-8882-D515F8E2F977</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * tokenUsage.
         */
        public Builder tokenUsage(Integer tokenUsage) {
            this.tokenUsage = tokenUsage;
            return this;
        }

        public GetAICoachTaskSessionResourceUsageResponseBody build() {
            return new GetAICoachTaskSessionResourceUsageResponseBody(this);
        } 

    } 

}
