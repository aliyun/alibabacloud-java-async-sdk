// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PutAsyncInvokeConfigRequest} extends {@link RequestModel}
 *
 * <p>PutAsyncInvokeConfigRequest</p>
 */
public class PutAsyncInvokeConfigRequest extends Request {
    @Path
    @NameInMap("functionName")
    @Validation(required = true)
    private String functionName;

    @Body
    @NameInMap("body")
    @Validation(required = true)
    private PutAsyncInvokeConfigInput body;

    @Query
    @NameInMap("qualifier")
    private String qualifier;

    private PutAsyncInvokeConfigRequest(Builder builder) {
        super(builder);
        this.functionName = builder.functionName;
        this.body = builder.body;
        this.qualifier = builder.qualifier;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutAsyncInvokeConfigRequest create() {
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
    public PutAsyncInvokeConfigInput getBody() {
        return this.body;
    }

    /**
     * @return qualifier
     */
    public String getQualifier() {
        return this.qualifier;
    }

    public static final class Builder extends Request.Builder<PutAsyncInvokeConfigRequest, Builder> {
        private String functionName; 
        private PutAsyncInvokeConfigInput body; 
        private String qualifier; 

        private Builder() {
            super();
        } 

        private Builder(PutAsyncInvokeConfigRequest request) {
            super(request);
            this.functionName = request.functionName;
            this.body = request.body;
            this.qualifier = request.qualifier;
        } 

        /**
         * The function name.
         */
        public Builder functionName(String functionName) {
            this.putPathParameter("functionName", functionName);
            this.functionName = functionName;
            return this;
        }

        /**
         * The configurations of asynchronous function invocation.
         */
        public Builder body(PutAsyncInvokeConfigInput body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        /**
         * The version or alias of the function.
         */
        public Builder qualifier(String qualifier) {
            this.putQueryParameter("qualifier", qualifier);
            this.qualifier = qualifier;
            return this;
        }

        @Override
        public PutAsyncInvokeConfigRequest build() {
            return new PutAsyncInvokeConfigRequest(this);
        } 

    } 

}
