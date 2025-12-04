// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

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
 * {@link AsyncDraftValidateResult} extends {@link TeaModel}
 *
 * <p>AsyncDraftValidateResult</p>
 */
public class AsyncDraftValidateResult extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("draftValidationDetail")
    private DraftValidationDetail draftValidationDetail;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("ticketStatus")
    private String ticketStatus;

    private AsyncDraftValidateResult(Builder builder) {
        this.draftValidationDetail = builder.draftValidationDetail;
        this.message = builder.message;
        this.success = builder.success;
        this.ticketStatus = builder.ticketStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AsyncDraftValidateResult create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return draftValidationDetail
     */
    public DraftValidationDetail getDraftValidationDetail() {
        return this.draftValidationDetail;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return ticketStatus
     */
    public String getTicketStatus() {
        return this.ticketStatus;
    }

    public static final class Builder {
        private DraftValidationDetail draftValidationDetail; 
        private String message; 
        private Boolean success; 
        private String ticketStatus; 

        private Builder() {
        } 

        private Builder(AsyncDraftValidateResult model) {
            this.draftValidationDetail = model.draftValidationDetail;
            this.message = model.message;
            this.success = model.success;
            this.ticketStatus = model.ticketStatus;
        } 

        /**
         * draftValidationDetail.
         */
        public Builder draftValidationDetail(DraftValidationDetail draftValidationDetail) {
            this.draftValidationDetail = draftValidationDetail;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
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
         * ticketStatus.
         */
        public Builder ticketStatus(String ticketStatus) {
            this.ticketStatus = ticketStatus;
            return this;
        }

        public AsyncDraftValidateResult build() {
            return new AsyncDraftValidateResult(this);
        } 

    } 

}
