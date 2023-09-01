// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateVpcBindingRequest} extends {@link RequestModel}
 *
 * <p>CreateVpcBindingRequest</p>
 */
public class CreateVpcBindingRequest extends Request {
    @Path
    @NameInMap("functionName")
    @Validation(required = true)
    private String functionName;

    @Body
    @NameInMap("body")
    @Validation(required = true)
    private CreateVpcBindingInput body;

    private CreateVpcBindingRequest(Builder builder) {
        super(builder);
        this.functionName = builder.functionName;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateVpcBindingRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return functionName
     */
    public String getFunctionName() {
        return this.functionName;
    }

    /**
     * @return body
     */
    public CreateVpcBindingInput getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<CreateVpcBindingRequest, Builder> {
        private String functionName; 
        private CreateVpcBindingInput body; 

        private Builder() {
            super();
        } 

        private Builder(CreateVpcBindingRequest request) {
            super(request);
            this.functionName = request.functionName;
            this.body = request.body;
        } 

        /**
         * functionName.
         */
        public Builder functionName(String functionName) {
            this.putPathParameter("functionName", functionName);
            this.functionName = functionName;
            return this;
        }

        /**
         * body.
         */
        public Builder body(CreateVpcBindingInput body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public CreateVpcBindingRequest build() {
            return new CreateVpcBindingRequest(this);
        } 

    } 

}
