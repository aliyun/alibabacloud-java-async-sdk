// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link GetAsyncTaskRequest} extends {@link RequestModel}
 *
 * <p>GetAsyncTaskRequest</p>
 */
public class GetAsyncTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AsyncTaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String asyncTaskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CdsId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String cdsId;

    private GetAsyncTaskRequest(Builder builder) {
        super(builder);
        this.asyncTaskId = builder.asyncTaskId;
        this.cdsId = builder.cdsId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAsyncTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return asyncTaskId
     */
    public String getAsyncTaskId() {
        return this.asyncTaskId;
    }

    /**
     * @return cdsId
     */
    public String getCdsId() {
        return this.cdsId;
    }

    public static final class Builder extends Request.Builder<GetAsyncTaskRequest, Builder> {
        private String asyncTaskId; 
        private String cdsId; 

        private Builder() {
            super();
        } 

        private Builder(GetAsyncTaskRequest request) {
            super(request);
            this.asyncTaskId = request.asyncTaskId;
            this.cdsId = request.cdsId;
        } 

        /**
         * <p>The asynchronous task ID. When you call the <a href="https://help.aliyun.com/document_detail/2247626.html">CopyCdsFile</a> operation to copy a folder, this field is returned because the copy is performed asynchronously in the background. Call this operation and pass in the asynchronous task ID to retrieve the task details.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>81a8a07a-aec4-4dd5-80da-ae69e482****</p>
         */
        public Builder asyncTaskId(String asyncTaskId) {
            this.putQueryParameter("AsyncTaskId", asyncTaskId);
            this.asyncTaskId = asyncTaskId;
            return this;
        }

        /**
         * <p>The enterprise network disk ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai+cds-135515****</p>
         */
        public Builder cdsId(String cdsId) {
            this.putQueryParameter("CdsId", cdsId);
            this.cdsId = cdsId;
            return this;
        }

        @Override
        public GetAsyncTaskRequest build() {
            return new GetAsyncTaskRequest(this);
        } 

    } 

}
