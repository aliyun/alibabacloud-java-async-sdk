// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.thirdswaicall20251127.models;

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
 * {@link CreateCallOutboundInstantRequest} extends {@link RequestModel}
 *
 * <p>CreateCallOutboundInstantRequest</p>
 */
public class CreateCallOutboundInstantRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CalledNumber")
    private String calledNumber;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CallerUacAccountId")
    private String callerUacAccountId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CurrentWorkspaceId")
    private String currentWorkspaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CustomerName")
    private String customerName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EncryptCall")
    private Boolean encryptCall;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PromptVariables")
    private String promptVariables;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TaskId")
    private Long taskId;

    private CreateCallOutboundInstantRequest(Builder builder) {
        super(builder);
        this.calledNumber = builder.calledNumber;
        this.callerUacAccountId = builder.callerUacAccountId;
        this.currentWorkspaceId = builder.currentWorkspaceId;
        this.customerName = builder.customerName;
        this.encryptCall = builder.encryptCall;
        this.promptVariables = builder.promptVariables;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCallOutboundInstantRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return calledNumber
     */
    public String getCalledNumber() {
        return this.calledNumber;
    }

    /**
     * @return callerUacAccountId
     */
    public String getCallerUacAccountId() {
        return this.callerUacAccountId;
    }

    /**
     * @return currentWorkspaceId
     */
    public String getCurrentWorkspaceId() {
        return this.currentWorkspaceId;
    }

    /**
     * @return customerName
     */
    public String getCustomerName() {
        return this.customerName;
    }

    /**
     * @return encryptCall
     */
    public Boolean getEncryptCall() {
        return this.encryptCall;
    }

    /**
     * @return promptVariables
     */
    public String getPromptVariables() {
        return this.promptVariables;
    }

    /**
     * @return taskId
     */
    public Long getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<CreateCallOutboundInstantRequest, Builder> {
        private String calledNumber; 
        private String callerUacAccountId; 
        private String currentWorkspaceId; 
        private String customerName; 
        private Boolean encryptCall; 
        private String promptVariables; 
        private Long taskId; 

        private Builder() {
            super();
        } 

        private Builder(CreateCallOutboundInstantRequest request) {
            super(request);
            this.calledNumber = request.calledNumber;
            this.callerUacAccountId = request.callerUacAccountId;
            this.currentWorkspaceId = request.currentWorkspaceId;
            this.customerName = request.customerName;
            this.encryptCall = request.encryptCall;
            this.promptVariables = request.promptVariables;
            this.taskId = request.taskId;
        } 

        /**
         * CalledNumber.
         */
        public Builder calledNumber(String calledNumber) {
            this.putBodyParameter("CalledNumber", calledNumber);
            this.calledNumber = calledNumber;
            return this;
        }

        /**
         * CallerUacAccountId.
         */
        public Builder callerUacAccountId(String callerUacAccountId) {
            this.putBodyParameter("CallerUacAccountId", callerUacAccountId);
            this.callerUacAccountId = callerUacAccountId;
            return this;
        }

        /**
         * CurrentWorkspaceId.
         */
        public Builder currentWorkspaceId(String currentWorkspaceId) {
            this.putBodyParameter("CurrentWorkspaceId", currentWorkspaceId);
            this.currentWorkspaceId = currentWorkspaceId;
            return this;
        }

        /**
         * CustomerName.
         */
        public Builder customerName(String customerName) {
            this.putBodyParameter("CustomerName", customerName);
            this.customerName = customerName;
            return this;
        }

        /**
         * EncryptCall.
         */
        public Builder encryptCall(Boolean encryptCall) {
            this.putBodyParameter("EncryptCall", encryptCall);
            this.encryptCall = encryptCall;
            return this;
        }

        /**
         * PromptVariables.
         */
        public Builder promptVariables(String promptVariables) {
            this.putBodyParameter("PromptVariables", promptVariables);
            this.promptVariables = promptVariables;
            return this;
        }

        /**
         * TaskId.
         */
        public Builder taskId(Long taskId) {
            this.putBodyParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public CreateCallOutboundInstantRequest build() {
            return new CreateCallOutboundInstantRequest(this);
        } 

    } 

}
