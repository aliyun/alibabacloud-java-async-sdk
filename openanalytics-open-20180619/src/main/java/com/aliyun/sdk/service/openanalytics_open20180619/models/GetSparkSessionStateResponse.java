// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.openanalytics_open20180619.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSparkSessionStateResponse} extends {@link TeaModel}
 *
 * <p>GetSparkSessionStateResponse</p>
 */
public class GetSparkSessionStateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetSparkSessionStateResponseBody body;

    private GetSparkSessionStateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetSparkSessionStateResponse create() {
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
    public GetSparkSessionStateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetSparkSessionStateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetSparkSessionStateResponseBody body);

        @Override
        GetSparkSessionStateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetSparkSessionStateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetSparkSessionStateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetSparkSessionStateResponse response) {
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
        public Builder body(GetSparkSessionStateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetSparkSessionStateResponse build() {
            return new GetSparkSessionStateResponse(this);
        } 

    } 

}
