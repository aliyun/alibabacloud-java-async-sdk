// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteMaskingRulesResponse} extends {@link TeaModel}
 *
 * <p>DeleteMaskingRulesResponse</p>
 */
public class DeleteMaskingRulesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteMaskingRulesResponseBody body;

    private DeleteMaskingRulesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteMaskingRulesResponse create() {
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
    public DeleteMaskingRulesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteMaskingRulesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteMaskingRulesResponseBody body);

        @Override
        DeleteMaskingRulesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteMaskingRulesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteMaskingRulesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteMaskingRulesResponse response) {
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
        public Builder body(DeleteMaskingRulesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteMaskingRulesResponse build() {
            return new DeleteMaskingRulesResponse(this);
        } 

    } 

}
