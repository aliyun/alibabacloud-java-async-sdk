// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CancelQueryResponse} extends {@link TeaModel}
 *
 * <p>CancelQueryResponse</p>
 */
public class CancelQueryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CancelQueryResponseBody body;

    private CancelQueryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CancelQueryResponse create() {
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
    public CancelQueryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CancelQueryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CancelQueryResponseBody body);

        @Override
        CancelQueryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CancelQueryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CancelQueryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CancelQueryResponse response) {
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
        public Builder body(CancelQueryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CancelQueryResponse build() {
            return new CancelQueryResponse(this);
        } 

    } 

}
