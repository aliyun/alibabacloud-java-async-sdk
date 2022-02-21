// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteVideoSummaryTaskRequest} extends {@link RequestModel}
 *
 * <p>DeleteVideoSummaryTaskRequest</p>
 */
public class DeleteVideoSummaryTaskRequest extends Request {
    @Body
    @NameInMap("CorpId")
    @Validation(required = true)
    private String corpId;

    @Body
    @NameInMap("TaskId")
    @Validation(required = true)
    private String taskId;

    private DeleteVideoSummaryTaskRequest(Builder builder) {
        super(builder);
        this.corpId = builder.corpId;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteVideoSummaryTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return corpId
     */
    public String getCorpId() {
        return this.corpId;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<DeleteVideoSummaryTaskRequest, Builder> {
        private String corpId; 
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteVideoSummaryTaskRequest response) {
            super(response);
            this.corpId = response.corpId;
            this.taskId = response.taskId;
        } 

        /**
         * CorpId.
         */
        public Builder corpId(String corpId) {
            this.putBodyParameter("CorpId", corpId);
            this.corpId = corpId;
            return this;
        }

        /**
         * TaskId.
         */
        public Builder taskId(String taskId) {
            this.putBodyParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public DeleteVideoSummaryTaskRequest build() {
            return new DeleteVideoSummaryTaskRequest(this);
        } 

    } 

}
