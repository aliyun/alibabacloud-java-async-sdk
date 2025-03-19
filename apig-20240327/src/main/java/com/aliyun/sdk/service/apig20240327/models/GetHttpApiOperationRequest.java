// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link GetHttpApiOperationRequest} extends {@link RequestModel}
 *
 * <p>GetHttpApiOperationRequest</p>
 */
public class GetHttpApiOperationRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("httpApiId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String httpApiId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("operationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String operationId;

    private GetHttpApiOperationRequest(Builder builder) {
        super(builder);
        this.httpApiId = builder.httpApiId;
        this.operationId = builder.operationId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetHttpApiOperationRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return httpApiId
     */
    public String getHttpApiId() {
        return this.httpApiId;
    }

    /**
     * @return operationId
     */
    public String getOperationId() {
        return this.operationId;
    }

    public static final class Builder extends Request.Builder<GetHttpApiOperationRequest, Builder> {
        private String httpApiId; 
        private String operationId; 

        private Builder() {
            super();
        } 

        private Builder(GetHttpApiOperationRequest request) {
            super(request);
            this.httpApiId = request.httpApiId;
            this.operationId = request.operationId;
        } 

        /**
         * <p>The HTTP API ID to which the operation belongs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>api-xxx</p>
         */
        public Builder httpApiId(String httpApiId) {
            this.putPathParameter("httpApiId", httpApiId);
            this.httpApiId = httpApiId;
            return this;
        }

        /**
         * <p>The operation ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>op-xxx</p>
         */
        public Builder operationId(String operationId) {
            this.putPathParameter("operationId", operationId);
            this.operationId = operationId;
            return this;
        }

        @Override
        public GetHttpApiOperationRequest build() {
            return new GetHttpApiOperationRequest(this);
        } 

    } 

}
