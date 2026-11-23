// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qweneduaisuite20261102.models;

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
 * {@link GetEduHomeworkCorrectionResultRequest} extends {@link RequestModel}
 *
 * <p>GetEduHomeworkCorrectionResultRequest</p>
 */
public class GetEduHomeworkCorrectionResultRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("taskId")
    private String taskId;

    private GetEduHomeworkCorrectionResultRequest(Builder builder) {
        super(builder);
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetEduHomeworkCorrectionResultRequest create() {
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

    public static final class Builder extends Request.Builder<GetEduHomeworkCorrectionResultRequest, Builder> {
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(GetEduHomeworkCorrectionResultRequest request) {
            super(request);
            this.taskId = request.taskId;
        } 

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>b18eabc4-5d84-40b0-ae20-e0eb2f585781</p>
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("taskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public GetEduHomeworkCorrectionResultRequest build() {
            return new GetEduHomeworkCorrectionResultRequest(this);
        } 

    } 

}
