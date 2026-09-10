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
 * {@link SyntaxCheckAndTransformSqlConversionTaskRequest} extends {@link RequestModel}
 *
 * <p>SyntaxCheckAndTransformSqlConversionTaskRequest</p>
 */
public class SyntaxCheckAndTransformSqlConversionTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("taskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long taskId;

    private SyntaxCheckAndTransformSqlConversionTaskRequest(Builder builder) {
        super(builder);
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SyntaxCheckAndTransformSqlConversionTaskRequest create() {
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

    public static final class Builder extends Request.Builder<SyntaxCheckAndTransformSqlConversionTaskRequest, Builder> {
        private Long taskId; 

        private Builder() {
            super();
        } 

        private Builder(SyntaxCheckAndTransformSqlConversionTaskRequest request) {
            super(request);
            this.taskId = request.taskId;
        } 

        /**
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
        public SyntaxCheckAndTransformSqlConversionTaskRequest build() {
            return new SyntaxCheckAndTransformSqlConversionTaskRequest(this);
        } 

    } 

}
