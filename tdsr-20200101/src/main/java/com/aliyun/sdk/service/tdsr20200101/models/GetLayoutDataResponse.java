// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetLayoutDataResponse} extends {@link TeaModel}
 *
 * <p>GetLayoutDataResponse</p>
 */
public class GetLayoutDataResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetLayoutDataResponseBody body;

    private GetLayoutDataResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetLayoutDataResponse create() {
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
    public GetLayoutDataResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetLayoutDataResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetLayoutDataResponseBody body);

        @Override
        GetLayoutDataResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetLayoutDataResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetLayoutDataResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetLayoutDataResponse response) {
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
        public Builder body(GetLayoutDataResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetLayoutDataResponse build() {
            return new GetLayoutDataResponse(this);
        } 

    } 

}
