// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.market20151101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PushMeteringDataResponse} extends {@link TeaModel}
 *
 * <p>PushMeteringDataResponse</p>
 */
public class PushMeteringDataResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private PushMeteringDataResponseBody body;

    private PushMeteringDataResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static PushMeteringDataResponse create() {
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
    public PushMeteringDataResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PushMeteringDataResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(PushMeteringDataResponseBody body);

        @Override
        PushMeteringDataResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PushMeteringDataResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private PushMeteringDataResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PushMeteringDataResponse response) {
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
        public Builder body(PushMeteringDataResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PushMeteringDataResponse build() {
            return new PushMeteringDataResponse(this);
        } 

    } 

}
