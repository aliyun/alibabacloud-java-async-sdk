// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResetDesktopsResponse} extends {@link TeaModel}
 *
 * <p>ResetDesktopsResponse</p>
 */
public class ResetDesktopsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ResetDesktopsResponseBody body;

    private ResetDesktopsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ResetDesktopsResponse create() {
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
    public ResetDesktopsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ResetDesktopsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ResetDesktopsResponseBody body);

        @Override
        ResetDesktopsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ResetDesktopsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ResetDesktopsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ResetDesktopsResponse response) {
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
        public Builder body(ResetDesktopsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ResetDesktopsResponse build() {
            return new ResetDesktopsResponse(this);
        } 

    } 

}
