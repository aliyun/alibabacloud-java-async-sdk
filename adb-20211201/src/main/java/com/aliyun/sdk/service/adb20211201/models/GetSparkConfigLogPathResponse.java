// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSparkConfigLogPathResponse} extends {@link TeaModel}
 *
 * <p>GetSparkConfigLogPathResponse</p>
 */
public class GetSparkConfigLogPathResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetSparkConfigLogPathResponseBody body;

    private GetSparkConfigLogPathResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetSparkConfigLogPathResponse create() {
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
    public GetSparkConfigLogPathResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetSparkConfigLogPathResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetSparkConfigLogPathResponseBody body);

        @Override
        GetSparkConfigLogPathResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetSparkConfigLogPathResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetSparkConfigLogPathResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetSparkConfigLogPathResponse response) {
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
        public Builder body(GetSparkConfigLogPathResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetSparkConfigLogPathResponse build() {
            return new GetSparkConfigLogPathResponse(this);
        } 

    } 

}
