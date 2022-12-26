// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteClientUserDefineRuleResponse} extends {@link TeaModel}
 *
 * <p>DeleteClientUserDefineRuleResponse</p>
 */
public class DeleteClientUserDefineRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteClientUserDefineRuleResponseBody body;

    private DeleteClientUserDefineRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteClientUserDefineRuleResponse create() {
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
    public DeleteClientUserDefineRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteClientUserDefineRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteClientUserDefineRuleResponseBody body);

        @Override
        DeleteClientUserDefineRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteClientUserDefineRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteClientUserDefineRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteClientUserDefineRuleResponse response) {
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
        public Builder body(DeleteClientUserDefineRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteClientUserDefineRuleResponse build() {
            return new DeleteClientUserDefineRuleResponse(this);
        } 

    } 

}
