// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDefenseRuleResponse} extends {@link TeaModel}
 *
 * <p>DeleteDefenseRuleResponse</p>
 */
public class DeleteDefenseRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteDefenseRuleResponseBody body;

    private DeleteDefenseRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteDefenseRuleResponse create() {
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
    public DeleteDefenseRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteDefenseRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteDefenseRuleResponseBody body);

        @Override
        DeleteDefenseRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteDefenseRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteDefenseRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteDefenseRuleResponse response) {
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
        public Builder body(DeleteDefenseRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteDefenseRuleResponse build() {
            return new DeleteDefenseRuleResponse(this);
        } 

    } 

}
