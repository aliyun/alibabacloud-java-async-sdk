// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyplsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BindBatchAxgResponse} extends {@link TeaModel}
 *
 * <p>BindBatchAxgResponse</p>
 */
public class BindBatchAxgResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private BindBatchAxgResponseBody body;

    private BindBatchAxgResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static BindBatchAxgResponse create() {
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
    public BindBatchAxgResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BindBatchAxgResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(BindBatchAxgResponseBody body);

        @Override
        BindBatchAxgResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BindBatchAxgResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private BindBatchAxgResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BindBatchAxgResponse response) {
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
        public Builder body(BindBatchAxgResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BindBatchAxgResponse build() {
            return new BindBatchAxgResponse(this);
        } 

    } 

}
