// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AllocateDirectConnectionResponse} extends {@link TeaModel}
 *
 * <p>AllocateDirectConnectionResponse</p>
 */
public class AllocateDirectConnectionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AllocateDirectConnectionResponseBody body;

    private AllocateDirectConnectionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AllocateDirectConnectionResponse create() {
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
    public AllocateDirectConnectionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AllocateDirectConnectionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AllocateDirectConnectionResponseBody body);

        @Override
        AllocateDirectConnectionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AllocateDirectConnectionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AllocateDirectConnectionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AllocateDirectConnectionResponse response) {
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
        public Builder body(AllocateDirectConnectionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AllocateDirectConnectionResponse build() {
            return new AllocateDirectConnectionResponse(this);
        } 

    } 

}
