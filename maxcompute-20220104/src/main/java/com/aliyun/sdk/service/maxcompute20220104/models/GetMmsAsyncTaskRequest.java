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
 * {@link GetMmsAsyncTaskRequest} extends {@link RequestModel}
 *
 * <p>GetMmsAsyncTaskRequest</p>
 */
public class GetMmsAsyncTaskRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("sourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long sourceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("asyncTaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long asyncTaskId;

    private GetMmsAsyncTaskRequest(Builder builder) {
        super(builder);
        this.sourceId = builder.sourceId;
        this.asyncTaskId = builder.asyncTaskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMmsAsyncTaskRequest create() {
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
     * @return asyncTaskId
     */
    public Long getAsyncTaskId() {
        return this.asyncTaskId;
    }

    public static final class Builder extends Request.Builder<GetMmsAsyncTaskRequest, Builder> {
        private Long sourceId; 
        private Long asyncTaskId; 

        private Builder() {
            super();
        } 

        private Builder(GetMmsAsyncTaskRequest request) {
            super(request);
            this.sourceId = request.sourceId;
            this.asyncTaskId = request.asyncTaskId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2000028</p>
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
         * <p>1000286</p>
         */
        public Builder asyncTaskId(Long asyncTaskId) {
            this.putPathParameter("asyncTaskId", asyncTaskId);
            this.asyncTaskId = asyncTaskId;
            return this;
        }

        @Override
        public GetMmsAsyncTaskRequest build() {
            return new GetMmsAsyncTaskRequest(this);
        } 

    } 

}
