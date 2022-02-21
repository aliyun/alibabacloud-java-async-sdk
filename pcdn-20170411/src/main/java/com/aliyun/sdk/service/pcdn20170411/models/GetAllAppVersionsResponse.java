// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pcdn20170411.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAllAppVersionsResponse} extends {@link TeaModel}
 *
 * <p>GetAllAppVersionsResponse</p>
 */
public class GetAllAppVersionsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetAllAppVersionsResponseBody body;

    private GetAllAppVersionsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetAllAppVersionsResponse create() {
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
    public GetAllAppVersionsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetAllAppVersionsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetAllAppVersionsResponseBody body);

        @Override
        GetAllAppVersionsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetAllAppVersionsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetAllAppVersionsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetAllAppVersionsResponse response) {
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
        public Builder body(GetAllAppVersionsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetAllAppVersionsResponse build() {
            return new GetAllAppVersionsResponse(this);
        } 

    } 

}
