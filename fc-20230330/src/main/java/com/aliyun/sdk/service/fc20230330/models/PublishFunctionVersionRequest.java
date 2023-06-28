// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PublishFunctionVersionRequest} extends {@link RequestModel}
 *
 * <p>PublishFunctionVersionRequest</p>
 */
public class PublishFunctionVersionRequest extends Request {
    @Path
    @NameInMap("functionName")
    @Validation(required = true)
    private String functionName;

    @Body
    @NameInMap("request")
    @Validation(required = true)
    private PublishVersionInput request;

    private PublishFunctionVersionRequest(Builder builder) {
        super(builder);
        this.functionName = builder.functionName;
        this.request = builder.request;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PublishFunctionVersionRequest create() {
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
     * @return request
     */
    public PublishVersionInput getRequest() {
        return this.request;
    }

    public static final class Builder extends Request.Builder<PublishFunctionVersionRequest, Builder> {
        private String functionName; 
        private PublishVersionInput request; 

        private Builder() {
            super();
        } 

        private Builder(PublishFunctionVersionRequest request) {
            super(request);
            this.functionName = request.functionName;
            this.request = request.request;
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
         * request.
         */
        public Builder request(PublishVersionInput request) {
            this.putBodyParameter("request", request);
            this.request = request;
            return this;
        }

        @Override
        public PublishFunctionVersionRequest build() {
            return new PublishFunctionVersionRequest(this);
        } 

    } 

}
