// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AllocateReadWriteSplittingConnectionResponse} extends {@link TeaModel}
 *
 * <p>AllocateReadWriteSplittingConnectionResponse</p>
 */
public class AllocateReadWriteSplittingConnectionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AllocateReadWriteSplittingConnectionResponseBody body;

    private AllocateReadWriteSplittingConnectionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AllocateReadWriteSplittingConnectionResponse create() {
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
    public AllocateReadWriteSplittingConnectionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AllocateReadWriteSplittingConnectionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AllocateReadWriteSplittingConnectionResponseBody body);

        @Override
        AllocateReadWriteSplittingConnectionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AllocateReadWriteSplittingConnectionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AllocateReadWriteSplittingConnectionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AllocateReadWriteSplittingConnectionResponse response) {
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
        public Builder body(AllocateReadWriteSplittingConnectionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AllocateReadWriteSplittingConnectionResponse build() {
            return new AllocateReadWriteSplittingConnectionResponse(this);
        } 

    } 

}
