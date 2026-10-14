// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aideepsign20260511.models;

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
 * {@link GetC2paSignResultRequest} extends {@link RequestModel}
 *
 * <p>GetC2paSignResultRequest</p>
 */
public class GetC2paSignResultRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskId;

    private GetC2paSignResultRequest(Builder builder) {
        super(builder);
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetC2paSignResultRequest create() {
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

    public static final class Builder extends Request.Builder<GetC2paSignResultRequest, Builder> {
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(GetC2paSignResultRequest request) {
            super(request);
            this.taskId = request.taskId;
        } 

        /**
         * <p>The opaque task ID returned by CreateC2paSignTask, up to 64 characters in length.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>7093c29e-f472-4e1e-91c6-a43df7c7382e</p>
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public GetC2paSignResultRequest build() {
            return new GetC2paSignResultRequest(this);
        } 

    } 

}
