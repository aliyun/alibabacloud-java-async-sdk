// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RebootDesktopsResponse} extends {@link TeaModel}
 *
 * <p>RebootDesktopsResponse</p>
 */
public class RebootDesktopsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RebootDesktopsResponseBody body;

    private RebootDesktopsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RebootDesktopsResponse create() {
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
    public RebootDesktopsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RebootDesktopsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RebootDesktopsResponseBody body);

        @Override
        RebootDesktopsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RebootDesktopsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RebootDesktopsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RebootDesktopsResponse response) {
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
        public Builder body(RebootDesktopsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RebootDesktopsResponse build() {
            return new RebootDesktopsResponse(this);
        } 

    } 

}
