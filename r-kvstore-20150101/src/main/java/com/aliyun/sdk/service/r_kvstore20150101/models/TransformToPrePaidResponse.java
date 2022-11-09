// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TransformToPrePaidResponse} extends {@link TeaModel}
 *
 * <p>TransformToPrePaidResponse</p>
 */
public class TransformToPrePaidResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private TransformToPrePaidResponseBody body;

    private TransformToPrePaidResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static TransformToPrePaidResponse create() {
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
    public TransformToPrePaidResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<TransformToPrePaidResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(TransformToPrePaidResponseBody body);

        @Override
        TransformToPrePaidResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<TransformToPrePaidResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private TransformToPrePaidResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(TransformToPrePaidResponse response) {
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
        public Builder body(TransformToPrePaidResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public TransformToPrePaidResponse build() {
            return new TransformToPrePaidResponse(this);
        } 

    } 

}
