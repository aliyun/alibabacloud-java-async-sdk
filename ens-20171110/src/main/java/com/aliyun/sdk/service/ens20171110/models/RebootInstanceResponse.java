// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RebootInstanceResponse} extends {@link TeaModel}
 *
 * <p>RebootInstanceResponse</p>
 */
public class RebootInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RebootInstanceResponseBody body;

    private RebootInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RebootInstanceResponse create() {
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
    public RebootInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RebootInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RebootInstanceResponseBody body);

        @Override
        RebootInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RebootInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RebootInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RebootInstanceResponse response) {
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
        public Builder body(RebootInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RebootInstanceResponse build() {
            return new RebootInstanceResponse(this);
        } 

    } 

}
