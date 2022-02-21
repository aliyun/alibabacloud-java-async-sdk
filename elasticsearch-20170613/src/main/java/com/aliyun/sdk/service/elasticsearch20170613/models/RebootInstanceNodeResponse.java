// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RebootInstanceNodeResponse} extends {@link TeaModel}
 *
 * <p>RebootInstanceNodeResponse</p>
 */
public class RebootInstanceNodeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RebootInstanceNodeResponseBody body;

    private RebootInstanceNodeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RebootInstanceNodeResponse create() {
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
    public RebootInstanceNodeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RebootInstanceNodeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RebootInstanceNodeResponseBody body);

        @Override
        RebootInstanceNodeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RebootInstanceNodeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RebootInstanceNodeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RebootInstanceNodeResponse response) {
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
        public Builder body(RebootInstanceNodeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RebootInstanceNodeResponse build() {
            return new RebootInstanceNodeResponse(this);
        } 

    } 

}
