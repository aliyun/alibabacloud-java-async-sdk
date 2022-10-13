// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cc5g20220314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link LockCardsResponse} extends {@link TeaModel}
 *
 * <p>LockCardsResponse</p>
 */
public class LockCardsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private LockCardsResponseBody body;

    private LockCardsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static LockCardsResponse create() {
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
    public LockCardsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<LockCardsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(LockCardsResponseBody body);

        @Override
        LockCardsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<LockCardsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private LockCardsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(LockCardsResponse response) {
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
        public Builder body(LockCardsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public LockCardsResponse build() {
            return new LockCardsResponse(this);
        } 

    } 

}
