// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieiap_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateReminderResponseBody} extends {@link TeaModel}
 *
 * <p>CreateReminderResponseBody</p>
 */
public class CreateReminderResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMsg")
    private String errorMsg;

    @NameInMap("Model")
    private Long model;

    @NameInMap("Success")
    private Boolean success;

    private CreateReminderResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMsg = builder.errorMsg;
        this.model = builder.model;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateReminderResponseBody create() {
        return builder().build();
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
     * @return model
     */
    public Long getModel() {
        return this.model;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String errorCode; 
        private String errorMsg; 
        private Long model; 
        private Boolean success; 

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
         * Model.
         */
        public Builder model(Long model) {
            this.model = model;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public CreateReminderResponseBody build() {
            return new CreateReminderResponseBody(this);
        } 

    } 

}
