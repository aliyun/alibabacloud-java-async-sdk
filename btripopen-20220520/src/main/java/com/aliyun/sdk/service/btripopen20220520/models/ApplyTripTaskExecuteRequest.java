// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ApplyTripTaskExecuteRequest} extends {@link RequestModel}
 *
 * <p>ApplyTripTaskExecuteRequest</p>
 */
public class ApplyTripTaskExecuteRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("action_from")
    @com.aliyun.core.annotation.Validation(required = true)
    private String actionFrom;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("comment")
    private String comment;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("task_action")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskAction;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("task_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long taskId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("user_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("user_name")
    private String userName;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-btrip-so-corp-token")
    private String xAcsBtripSoCorpToken;

    private ApplyTripTaskExecuteRequest(Builder builder) {
        super(builder);
        this.actionFrom = builder.actionFrom;
        this.comment = builder.comment;
        this.taskAction = builder.taskAction;
        this.taskId = builder.taskId;
        this.userId = builder.userId;
        this.userName = builder.userName;
        this.xAcsBtripSoCorpToken = builder.xAcsBtripSoCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ApplyTripTaskExecuteRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return actionFrom
     */
    public String getActionFrom() {
        return this.actionFrom;
    }

    /**
     * @return comment
     */
    public String getComment() {
        return this.comment;
    }

    /**
     * @return taskAction
     */
    public String getTaskAction() {
        return this.taskAction;
    }

    /**
     * @return taskId
     */
    public Long getTaskId() {
        return this.taskId;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    /**
     * @return xAcsBtripSoCorpToken
     */
    public String getXAcsBtripSoCorpToken() {
        return this.xAcsBtripSoCorpToken;
    }

    public static final class Builder extends Request.Builder<ApplyTripTaskExecuteRequest, Builder> {
        private String actionFrom; 
        private String comment; 
        private String taskAction; 
        private Long taskId; 
        private String userId; 
        private String userName; 
        private String xAcsBtripSoCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(ApplyTripTaskExecuteRequest request) {
            super(request);
            this.actionFrom = request.actionFrom;
            this.comment = request.comment;
            this.taskAction = request.taskAction;
            this.taskId = request.taskId;
            this.userId = request.userId;
            this.userName = request.userName;
            this.xAcsBtripSoCorpToken = request.xAcsBtripSoCorpToken;
        } 

        /**
         * action_from.
         */
        public Builder actionFrom(String actionFrom) {
            this.putBodyParameter("action_from", actionFrom);
            this.actionFrom = actionFrom;
            return this;
        }

        /**
         * comment.
         */
        public Builder comment(String comment) {
            this.putBodyParameter("comment", comment);
            this.comment = comment;
            return this;
        }

        /**
         * task_action.
         */
        public Builder taskAction(String taskAction) {
            this.putBodyParameter("task_action", taskAction);
            this.taskAction = taskAction;
            return this;
        }

        /**
         * task_id.
         */
        public Builder taskId(Long taskId) {
            this.putBodyParameter("task_id", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * user_id.
         */
        public Builder userId(String userId) {
            this.putBodyParameter("user_id", userId);
            this.userId = userId;
            return this;
        }

        /**
         * user_name.
         */
        public Builder userName(String userName) {
            this.putBodyParameter("user_name", userName);
            this.userName = userName;
            return this;
        }

        /**
         * x-acs-btrip-so-corp-token.
         */
        public Builder xAcsBtripSoCorpToken(String xAcsBtripSoCorpToken) {
            this.putHeaderParameter("x-acs-btrip-so-corp-token", xAcsBtripSoCorpToken);
            this.xAcsBtripSoCorpToken = xAcsBtripSoCorpToken;
            return this;
        }

        @Override
        public ApplyTripTaskExecuteRequest build() {
            return new ApplyTripTaskExecuteRequest(this);
        } 

    } 

}
