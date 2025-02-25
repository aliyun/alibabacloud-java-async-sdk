// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

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
 * {@link GetMmsTaskRequest} extends {@link RequestModel}
 *
 * <p>GetMmsTaskRequest</p>
 */
public class GetMmsTaskRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("sourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long sourceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("taskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long taskId;

    private GetMmsTaskRequest(Builder builder) {
        super(builder);
        this.sourceId = builder.sourceId;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMmsTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sourceId
     */
    public Long getSourceId() {
        return this.sourceId;
    }

    /**
     * @return taskId
     */
    public Long getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<GetMmsTaskRequest, Builder> {
        private Long sourceId; 
        private Long taskId; 

        private Builder() {
            super();
        } 

        private Builder(GetMmsTaskRequest request) {
            super(request);
            this.sourceId = request.sourceId;
            this.taskId = request.taskId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2000015</p>
         */
        public Builder sourceId(Long sourceId) {
            this.putPathParameter("sourceId", sourceId);
            this.sourceId = sourceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>7680</p>
         */
        public Builder taskId(Long taskId) {
            this.putPathParameter("taskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public GetMmsTaskRequest build() {
            return new GetMmsTaskRequest(this);
        } 

    } 

}
