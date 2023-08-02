// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UnloadSampleDataResponse} extends {@link TeaModel}
 *
 * <p>UnloadSampleDataResponse</p>
 */
public class UnloadSampleDataResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UnloadSampleDataResponseBody body;

    private UnloadSampleDataResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UnloadSampleDataResponse create() {
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
    public UnloadSampleDataResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UnloadSampleDataResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UnloadSampleDataResponseBody body);

        @Override
        UnloadSampleDataResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UnloadSampleDataResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UnloadSampleDataResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UnloadSampleDataResponse response) {
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
        public Builder body(UnloadSampleDataResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UnloadSampleDataResponse build() {
            return new UnloadSampleDataResponse(this);
        } 

    } 

}
