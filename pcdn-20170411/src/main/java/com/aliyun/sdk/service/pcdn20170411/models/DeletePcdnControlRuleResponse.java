// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pcdn20170411.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeletePcdnControlRuleResponse} extends {@link TeaModel}
 *
 * <p>DeletePcdnControlRuleResponse</p>
 */
public class DeletePcdnControlRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeletePcdnControlRuleResponseBody body;

    private DeletePcdnControlRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeletePcdnControlRuleResponse create() {
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
    public DeletePcdnControlRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeletePcdnControlRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeletePcdnControlRuleResponseBody body);

        @Override
        DeletePcdnControlRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeletePcdnControlRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeletePcdnControlRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeletePcdnControlRuleResponse response) {
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
        public Builder body(DeletePcdnControlRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeletePcdnControlRuleResponse build() {
            return new DeletePcdnControlRuleResponse(this);
        } 

    } 

}
