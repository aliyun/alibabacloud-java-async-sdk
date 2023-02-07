// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.avatar20220130.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DuplexDecisionResponse} extends {@link TeaModel}
 *
 * <p>DuplexDecisionResponse</p>
 */
public class DuplexDecisionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DuplexDecisionResponseBody body;

    private DuplexDecisionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DuplexDecisionResponse create() {
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
    public DuplexDecisionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DuplexDecisionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DuplexDecisionResponseBody body);

        @Override
        DuplexDecisionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DuplexDecisionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DuplexDecisionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DuplexDecisionResponse response) {
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
        public Builder body(DuplexDecisionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DuplexDecisionResponse build() {
            return new DuplexDecisionResponse(this);
        } 

    } 

}
