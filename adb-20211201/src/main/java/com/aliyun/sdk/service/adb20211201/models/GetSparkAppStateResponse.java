// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSparkAppStateResponse} extends {@link TeaModel}
 *
 * <p>GetSparkAppStateResponse</p>
 */
public class GetSparkAppStateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetSparkAppStateResponseBody body;

    private GetSparkAppStateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetSparkAppStateResponse create() {
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
    public GetSparkAppStateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetSparkAppStateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetSparkAppStateResponseBody body);

        @Override
        GetSparkAppStateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetSparkAppStateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetSparkAppStateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetSparkAppStateResponse response) {
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
        public Builder body(GetSparkAppStateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetSparkAppStateResponse build() {
            return new GetSparkAppStateResponse(this);
        } 

    } 

}
