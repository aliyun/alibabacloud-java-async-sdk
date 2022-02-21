// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PickLocalNumberResponse} extends {@link TeaModel}
 *
 * <p>PickLocalNumberResponse</p>
 */
public class PickLocalNumberResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private PickLocalNumberResponseBody body;

    private PickLocalNumberResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static PickLocalNumberResponse create() {
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
    public PickLocalNumberResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PickLocalNumberResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(PickLocalNumberResponseBody body);

        @Override
        PickLocalNumberResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PickLocalNumberResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private PickLocalNumberResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PickLocalNumberResponse response) {
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
        public Builder body(PickLocalNumberResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PickLocalNumberResponse build() {
            return new PickLocalNumberResponse(this);
        } 

    } 

}
