// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20201002.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartDesktopsResponse} extends {@link TeaModel}
 *
 * <p>StartDesktopsResponse</p>
 */
public class StartDesktopsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StartDesktopsResponseBody body;

    private StartDesktopsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StartDesktopsResponse create() {
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
    public StartDesktopsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StartDesktopsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StartDesktopsResponseBody body);

        @Override
        StartDesktopsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StartDesktopsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StartDesktopsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StartDesktopsResponse response) {
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
        public Builder body(StartDesktopsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StartDesktopsResponse build() {
            return new StartDesktopsResponse(this);
        } 

    } 

}
