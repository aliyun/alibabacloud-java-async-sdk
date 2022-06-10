// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link NluResponse} extends {@link TeaModel}
 *
 * <p>NluResponse</p>
 */
public class NluResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private NluResponseBody body;

    private NluResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static NluResponse create() {
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
    public NluResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<NluResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(NluResponseBody body);

        @Override
        NluResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<NluResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private NluResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(NluResponse response) {
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
        public Builder body(NluResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public NluResponse build() {
            return new NluResponse(this);
        } 

    } 

}
