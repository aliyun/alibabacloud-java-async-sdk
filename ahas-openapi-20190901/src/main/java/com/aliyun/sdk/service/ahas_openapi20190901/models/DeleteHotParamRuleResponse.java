// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ahas_openapi20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteHotParamRuleResponse} extends {@link TeaModel}
 *
 * <p>DeleteHotParamRuleResponse</p>
 */
public class DeleteHotParamRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteHotParamRuleResponseBody body;

    private DeleteHotParamRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteHotParamRuleResponse create() {
        return new BuilderImpl().build();
    }

    @Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return headers
     */
    public java.util.Map < String, String > getHeaders() {
        return this.headers;
    }

    /**
     * @return body
     */
    public DeleteHotParamRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteHotParamRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteHotParamRuleResponseBody body);

        @Override
        DeleteHotParamRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteHotParamRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteHotParamRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteHotParamRuleResponse response) {
            super(response);
            this.headers = response.headers;
            this.body = response.body;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map < String, String > headers) {
            this.headers = headers;
            return this;
        }

        /**
         * body.
         */
        @Override
        public Builder body(DeleteHotParamRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteHotParamRuleResponse build() {
            return new DeleteHotParamRuleResponse(this);
        } 

    } 

}
