// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link GetCheckProcessRequest} extends {@link RequestModel}
 *
 * <p>GetCheckProcessRequest</p>
 */
public class GetCheckProcessRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    private GetCheckProcessRequest(Builder builder) {
        super(builder);
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCheckProcessRequest create() {
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

    public static final class Builder extends Request.Builder<GetCheckProcessRequest, Builder> {
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(GetCheckProcessRequest request) {
            super(request);
            this.taskId = request.taskId;
        } 

        /**
         * <p>The ID of the task.</p>
         * <blockquote>
         * <p>You can call the <a href="~~SubmitCheck~~">SubmitCheck</a> operation to query the ID.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>5347c7b6-c85c-4070-846a-3029e08e****</p>
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public GetCheckProcessRequest build() {
            return new GetCheckProcessRequest(this);
        } 

    } 

}
