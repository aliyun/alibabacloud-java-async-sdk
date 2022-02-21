// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link LaunchAppraiseResponse} extends {@link TeaModel}
 *
 * <p>LaunchAppraiseResponse</p>
 */
public class LaunchAppraiseResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private LaunchAppraiseResponseBody body;

    private LaunchAppraiseResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static LaunchAppraiseResponse create() {
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
    public LaunchAppraiseResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<LaunchAppraiseResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(LaunchAppraiseResponseBody body);

        @Override
        LaunchAppraiseResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<LaunchAppraiseResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private LaunchAppraiseResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(LaunchAppraiseResponse response) {
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
        public Builder body(LaunchAppraiseResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public LaunchAppraiseResponse build() {
            return new LaunchAppraiseResponse(this);
        } 

    } 

}
