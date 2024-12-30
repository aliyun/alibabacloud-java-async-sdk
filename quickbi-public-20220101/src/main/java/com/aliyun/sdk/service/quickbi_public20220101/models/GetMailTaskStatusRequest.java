// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

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
 * {@link GetMailTaskStatusRequest} extends {@link RequestModel}
 *
 * <p>GetMailTaskStatusRequest</p>
 */
public class GetMailTaskStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MailId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String mailId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskId")
    private Long taskId;

    private GetMailTaskStatusRequest(Builder builder) {
        super(builder);
        this.mailId = builder.mailId;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMailTaskStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return mailId
     */
    public String getMailId() {
        return this.mailId;
    }

    /**
     * @return taskId
     */
    public Long getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<GetMailTaskStatusRequest, Builder> {
        private String mailId; 
        private Long taskId; 

        private Builder() {
            super();
        } 

        private Builder(GetMailTaskStatusRequest request) {
            super(request);
            this.mailId = request.mailId;
            this.taskId = request.taskId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>d5a59a898b634d75be5584f8dc159c62</p>
         */
        public Builder mailId(String mailId) {
            this.putQueryParameter("MailId", mailId);
            this.mailId = mailId;
            return this;
        }

        /**
         * TaskId.
         */
        public Builder taskId(Long taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public GetMailTaskStatusRequest build() {
            return new GetMailTaskStatusRequest(this);
        } 

    } 

}
