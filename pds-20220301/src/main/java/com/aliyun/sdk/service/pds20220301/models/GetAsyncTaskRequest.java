// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

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
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("domain_id")
    private String domainId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("async_task_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String asyncTaskId;

    private GetAsyncTaskRequest(Builder builder) {
        super(builder);
        this.domainId = builder.domainId;
        this.asyncTaskId = builder.asyncTaskId;
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
     * @return domainId
     */
    public String getDomainId() {
        return this.domainId;
    }

    /**
     * @return asyncTaskId
     */
    public String getAsyncTaskId() {
        return this.asyncTaskId;
    }

    public static final class Builder extends Request.Builder<GetAsyncTaskRequest, Builder> {
        private String domainId; 
        private String asyncTaskId; 

        private Builder() {
            super();
        } 

        private Builder(GetAsyncTaskRequest request) {
            super(request);
            this.domainId = request.domainId;
            this.asyncTaskId = request.asyncTaskId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder domainId(String domainId) {
            this.putHostParameter("domain_id", domainId);
            this.domainId = domainId;
            return this;
        }

        /**
         * <p>The ID of the asynchronous task.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>000e89fb-cf8f-11e9-8ab4-b6e980803a3b</p>
         */
        public Builder asyncTaskId(String asyncTaskId) {
            this.putBodyParameter("async_task_id", asyncTaskId);
            this.asyncTaskId = asyncTaskId;
            return this;
        }

        @Override
        public GetAsyncTaskRequest build() {
            return new GetAsyncTaskRequest(this);
        } 

    } 

}
