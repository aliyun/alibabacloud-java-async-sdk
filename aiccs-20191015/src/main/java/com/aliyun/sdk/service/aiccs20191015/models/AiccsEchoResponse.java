// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AiccsEchoResponse} extends {@link TeaModel}
 *
 * <p>AiccsEchoResponse</p>
 */
public class AiccsEchoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AiccsEchoResponseBody body;

    private AiccsEchoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AiccsEchoResponse create() {
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
    public AiccsEchoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AiccsEchoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AiccsEchoResponseBody body);

        @Override
        AiccsEchoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AiccsEchoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AiccsEchoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AiccsEchoResponse response) {
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
        public Builder body(AiccsEchoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AiccsEchoResponse build() {
            return new AiccsEchoResponse(this);
        } 

    } 

}
