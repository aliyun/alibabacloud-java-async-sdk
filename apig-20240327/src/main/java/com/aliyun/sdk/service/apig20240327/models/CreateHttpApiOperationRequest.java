// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateHttpApiOperationRequest} extends {@link RequestModel}
 *
 * <p>CreateHttpApiOperationRequest</p>
 */
public class CreateHttpApiOperationRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("httpApiId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String httpApiId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("operations")
    private java.util.List < HttpApiOperation > operations;

    private CreateHttpApiOperationRequest(Builder builder) {
        super(builder);
        this.httpApiId = builder.httpApiId;
        this.operations = builder.operations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateHttpApiOperationRequest create() {
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
     * @return operations
     */
    public java.util.List < HttpApiOperation > getOperations() {
        return this.operations;
    }

    public static final class Builder extends Request.Builder<CreateHttpApiOperationRequest, Builder> {
        private String httpApiId; 
        private java.util.List < HttpApiOperation > operations; 

        private Builder() {
            super();
        } 

        private Builder(CreateHttpApiOperationRequest request) {
            super(request);
            this.httpApiId = request.httpApiId;
            this.operations = request.operations;
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
         * operations.
         */
        public Builder operations(java.util.List < HttpApiOperation > operations) {
            this.putBodyParameter("operations", operations);
            this.operations = operations;
            return this;
        }

        @Override
        public CreateHttpApiOperationRequest build() {
            return new CreateHttpApiOperationRequest(this);
        } 

    } 

}
