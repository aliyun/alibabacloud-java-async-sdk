// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOriginLayoutDataResponse} extends {@link TeaModel}
 *
 * <p>GetOriginLayoutDataResponse</p>
 */
public class GetOriginLayoutDataResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetOriginLayoutDataResponseBody body;

    private GetOriginLayoutDataResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetOriginLayoutDataResponse create() {
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
    public GetOriginLayoutDataResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetOriginLayoutDataResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetOriginLayoutDataResponseBody body);

        @Override
        GetOriginLayoutDataResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetOriginLayoutDataResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetOriginLayoutDataResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetOriginLayoutDataResponse response) {
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
        public Builder body(GetOriginLayoutDataResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetOriginLayoutDataResponse build() {
            return new GetOriginLayoutDataResponse(this);
        } 

    } 

}
