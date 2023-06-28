// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PutConcurrencyConfigRequest} extends {@link RequestModel}
 *
 * <p>PutConcurrencyConfigRequest</p>
 */
public class PutConcurrencyConfigRequest extends Request {
    @Path
    @NameInMap("functionName")
    @Validation(required = true)
    private String functionName;

    @Body
    @NameInMap("request")
    @Validation(required = true)
    private PutConcurrencyInput request;

    private PutConcurrencyConfigRequest(Builder builder) {
        super(builder);
        this.functionName = builder.functionName;
        this.request = builder.request;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutConcurrencyConfigRequest create() {
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
    public PutConcurrencyInput getRequest() {
        return this.request;
    }

    public static final class Builder extends Request.Builder<PutConcurrencyConfigRequest, Builder> {
        private String functionName; 
        private PutConcurrencyInput request; 

        private Builder() {
            super();
        } 

        private Builder(PutConcurrencyConfigRequest request) {
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
        public Builder request(PutConcurrencyInput request) {
            this.putBodyParameter("request", request);
            this.request = request;
            return this;
        }

        @Override
        public PutConcurrencyConfigRequest build() {
            return new PutConcurrencyConfigRequest(this);
        } 

    } 

}
