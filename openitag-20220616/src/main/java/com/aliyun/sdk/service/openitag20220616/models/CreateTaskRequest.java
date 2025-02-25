// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.openitag20220616.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateTaskRequest</p>
 */
public class CreateTaskRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("TenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tenantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    @com.aliyun.core.annotation.Validation(required = true)
    private CreateTaskDetail body;

    private CreateTaskRequest(Builder builder) {
        super(builder);
        this.tenantId = builder.tenantId;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @return body
     */
    public CreateTaskDetail getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<CreateTaskRequest, Builder> {
        private String tenantId; 
        private CreateTaskDetail body; 

        private Builder() {
            super();
        } 

        private Builder(CreateTaskRequest request) {
            super(request);
            this.tenantId = request.tenantId;
            this.body = request.body;
        } 

        /**
         * TenantId.
         */
        public Builder tenantId(String tenantId) {
            this.putPathParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        /**
         * body.
         */
        public Builder body(CreateTaskDetail body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public CreateTaskRequest build() {
            return new CreateTaskRequest(this);
        } 

    } 

}
