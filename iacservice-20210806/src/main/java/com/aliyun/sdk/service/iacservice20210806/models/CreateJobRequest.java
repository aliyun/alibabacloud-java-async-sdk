// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iacservice20210806.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateJobRequest} extends {@link RequestModel}
 *
 * <p>CreateJobRequest</p>
 */
public class CreateJobRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("taskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("clientToken")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    @com.aliyun.core.annotation.Validation(required = true)
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("executeType")
    private String executeType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("subCommand")
    private String subCommand;

    private CreateJobRequest(Builder builder) {
        super(builder);
        this.taskId = builder.taskId;
        this.clientToken = builder.clientToken;
        this.description = builder.description;
        this.executeType = builder.executeType;
        this.subCommand = builder.subCommand;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateJobRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return executeType
     */
    public String getExecuteType() {
        return this.executeType;
    }

    /**
     * @return subCommand
     */
    public String getSubCommand() {
        return this.subCommand;
    }

    public static final class Builder extends Request.Builder<CreateJobRequest, Builder> {
        private String taskId; 
        private String clientToken; 
        private String description; 
        private String executeType; 
        private String subCommand; 

        private Builder() {
            super();
        } 

        private Builder(CreateJobRequest request) {
            super(request);
            this.taskId = request.taskId;
            this.clientToken = request.clientToken;
            this.description = request.description;
            this.executeType = request.executeType;
            this.subCommand = request.subCommand;
        } 

        /**
         * taskId.
         */
        public Builder taskId(String taskId) {
            this.putPathParameter("taskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * clientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * executeType.
         */
        public Builder executeType(String executeType) {
            this.putBodyParameter("executeType", executeType);
            this.executeType = executeType;
            return this;
        }

        /**
         * subCommand.
         */
        public Builder subCommand(String subCommand) {
            this.putBodyParameter("subCommand", subCommand);
            this.subCommand = subCommand;
            return this;
        }

        @Override
        public CreateJobRequest build() {
            return new CreateJobRequest(this);
        } 

    } 

}
