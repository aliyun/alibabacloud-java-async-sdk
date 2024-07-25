// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateHttpApiOperationRequest} extends {@link RequestModel}
 *
 * <p>UpdateHttpApiOperationRequest</p>
 */
public class UpdateHttpApiOperationRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("httpApiId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String httpApiId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("operationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String operationId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("operation")
    private HttpApiOperation operation;

    private UpdateHttpApiOperationRequest(Builder builder) {
        super(builder);
        this.httpApiId = builder.httpApiId;
        this.operationId = builder.operationId;
        this.operation = builder.operation;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateHttpApiOperationRequest create() {
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

    /**
     * @return operation
     */
    public HttpApiOperation getOperation() {
        return this.operation;
    }

    public static final class Builder extends Request.Builder<UpdateHttpApiOperationRequest, Builder> {
        private String httpApiId; 
        private String operationId; 
        private HttpApiOperation operation; 

        private Builder() {
            super();
        } 

        private Builder(UpdateHttpApiOperationRequest request) {
            super(request);
            this.httpApiId = request.httpApiId;
            this.operationId = request.operationId;
            this.operation = request.operation;
        } 

        /**
         * httpApiId.
         */
        public Builder httpApiId(String httpApiId) {
            this.putPathParameter("httpApiId", httpApiId);
            this.httpApiId = httpApiId;
            return this;
        }

        /**
         * operationId.
         */
        public Builder operationId(String operationId) {
            this.putPathParameter("operationId", operationId);
            this.operationId = operationId;
            return this;
        }

        /**
         * operation.
         */
        public Builder operation(HttpApiOperation operation) {
            this.putBodyParameter("operation", operation);
            this.operation = operation;
            return this;
        }

        @Override
        public UpdateHttpApiOperationRequest build() {
            return new UpdateHttpApiOperationRequest(this);
        } 

    } 

}
