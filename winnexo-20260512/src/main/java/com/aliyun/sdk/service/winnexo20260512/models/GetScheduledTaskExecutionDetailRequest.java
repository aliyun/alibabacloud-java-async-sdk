// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.winnexo20260512.models;

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
 * {@link GetScheduledTaskExecutionDetailRequest} extends {@link RequestModel}
 *
 * <p>GetScheduledTaskExecutionDetailRequest</p>
 */
public class GetScheduledTaskExecutionDetailRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("executionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String executionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    private GetScheduledTaskExecutionDetailRequest(Builder builder) {
        super(builder);
        this.executionId = builder.executionId;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetScheduledTaskExecutionDetailRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return executionId
     */
    public String getExecutionId() {
        return this.executionId;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<GetScheduledTaskExecutionDetailRequest, Builder> {
        private String executionId; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(GetScheduledTaskExecutionDetailRequest request) {
            super(request);
            this.executionId = request.executionId;
            this.tenantId = request.tenantId;
        } 

        /**
         * <p>执行记录 ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>exampleExecutionId</p>
         */
        public Builder executionId(String executionId) {
            this.putQueryParameter("executionId", executionId);
            this.executionId = executionId;
            return this;
        }

        /**
         * <p>租户ID，公共参数，缺省时使用调用方默认租户</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        public Builder tenantId(String tenantId) {
            this.putQueryParameter("tenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        @Override
        public GetScheduledTaskExecutionDetailRequest build() {
            return new GetScheduledTaskExecutionDetailRequest(this);
        } 

    } 

}
