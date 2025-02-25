// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240118.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitBulletQuestionsQAResult} extends {@link TeaModel}
 *
 * <p>SubmitBulletQuestionsQAResult</p>
 */
public class SubmitBulletQuestionsQAResult extends TeaModel {
    @NameInMap("errorCode")
    private String errorCode;

    @NameInMap("errorMessage")
    private String errorMessage;

    @NameInMap("success")
    private Boolean success;

    private SubmitBulletQuestionsQAResult(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitBulletQuestionsQAResult create() {
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String errorCode; 
        private String errorMessage; 
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
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public SubmitBulletQuestionsQAResult build() {
            return new SubmitBulletQuestionsQAResult(this);
        } 

    } 

}
