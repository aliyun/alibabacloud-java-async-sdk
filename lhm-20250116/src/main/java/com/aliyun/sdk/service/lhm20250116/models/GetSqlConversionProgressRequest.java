// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.lhm20250116.models;

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
 * {@link GetSqlConversionProgressRequest} extends {@link RequestModel}
 *
 * <p>GetSqlConversionProgressRequest</p>
 */
public class GetSqlConversionProgressRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("taskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long taskId;

    private GetSqlConversionProgressRequest(Builder builder) {
        super(builder);
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSqlConversionProgressRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return taskId
     */
    public Long getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<GetSqlConversionProgressRequest, Builder> {
        private Long taskId; 

        private Builder() {
            super();
        } 

        private Builder(GetSqlConversionProgressRequest request) {
            super(request);
            this.taskId = request.taskId;
        } 

        /**
         * <p>The task ID that uniquely identifies a task.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10001</p>
         */
        public Builder taskId(Long taskId) {
            this.putQueryParameter("taskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public GetSqlConversionProgressRequest build() {
            return new GetSqlConversionProgressRequest(this);
        } 

    } 

}
