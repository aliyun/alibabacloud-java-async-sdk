// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alimt20181012.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OpenAlimtServiceResponse} extends {@link TeaModel}
 *
 * <p>OpenAlimtServiceResponse</p>
 */
public class OpenAlimtServiceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private OpenAlimtServiceResponseBody body;

    private OpenAlimtServiceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static OpenAlimtServiceResponse create() {
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
    public OpenAlimtServiceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<OpenAlimtServiceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(OpenAlimtServiceResponseBody body);

        @Override
        OpenAlimtServiceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<OpenAlimtServiceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private OpenAlimtServiceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(OpenAlimtServiceResponse response) {
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
        public Builder body(OpenAlimtServiceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public OpenAlimtServiceResponse build() {
            return new OpenAlimtServiceResponse(this);
        } 

    } 

}
