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
 * {@link CreateAICoachTaskSessionRequest} extends {@link RequestModel}
 *
 * <p>CreateAICoachTaskSessionRequest</p>
 */
public class CreateAICoachTaskSessionRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("taskId")
    private String taskId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("uid")
    private String uid;

    private CreateAICoachTaskSessionRequest(Builder builder) {
        super(builder);
        this.taskId = builder.taskId;
        this.uid = builder.uid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAICoachTaskSessionRequest create() {
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
     * @return uid
     */
    public String getUid() {
        return this.uid;
    }

    public static final class Builder extends Request.Builder<CreateAICoachTaskSessionRequest, Builder> {
        private String taskId; 
        private String uid; 

        private Builder() {
            super();
        } 

        private Builder(CreateAICoachTaskSessionRequest request) {
            super(request);
            this.taskId = request.taskId;
            this.uid = request.uid;
        } 

        /**
         * taskId.
         */
        public Builder taskId(String taskId) {
            this.putBodyParameter("taskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * uid.
         */
        public Builder uid(String uid) {
            this.putBodyParameter("uid", uid);
            this.uid = uid;
            return this;
        }

        @Override
        public CreateAICoachTaskSessionRequest build() {
            return new CreateAICoachTaskSessionRequest(this);
        } 

    } 

}
