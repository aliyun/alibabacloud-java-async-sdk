// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSparkAppInfoResponse} extends {@link TeaModel}
 *
 * <p>GetSparkAppInfoResponse</p>
 */
public class GetSparkAppInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetSparkAppInfoResponseBody body;

    private GetSparkAppInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetSparkAppInfoResponse create() {
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
    public GetSparkAppInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetSparkAppInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetSparkAppInfoResponseBody body);

        @Override
        GetSparkAppInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetSparkAppInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetSparkAppInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetSparkAppInfoResponse response) {
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
        public Builder body(GetSparkAppInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetSparkAppInfoResponse build() {
            return new GetSparkAppInfoResponse(this);
        } 

    } 

}
