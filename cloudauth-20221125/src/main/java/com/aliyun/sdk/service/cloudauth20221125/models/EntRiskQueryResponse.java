// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth20221125.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EntRiskQueryResponse} extends {@link TeaModel}
 *
 * <p>EntRiskQueryResponse</p>
 */
public class EntRiskQueryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private EntRiskQueryResponseBody body;

    private EntRiskQueryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static EntRiskQueryResponse create() {
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
    public EntRiskQueryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<EntRiskQueryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(EntRiskQueryResponseBody body);

        @Override
        EntRiskQueryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<EntRiskQueryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private EntRiskQueryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(EntRiskQueryResponse response) {
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
        public Builder body(EntRiskQueryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public EntRiskQueryResponse build() {
            return new EntRiskQueryResponse(this);
        } 

    } 

}
