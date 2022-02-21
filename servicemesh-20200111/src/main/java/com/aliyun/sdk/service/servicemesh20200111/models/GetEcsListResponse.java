// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetEcsListResponse} extends {@link TeaModel}
 *
 * <p>GetEcsListResponse</p>
 */
public class GetEcsListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetEcsListResponseBody body;

    private GetEcsListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetEcsListResponse create() {
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
    public GetEcsListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetEcsListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetEcsListResponseBody body);

        @Override
        GetEcsListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetEcsListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetEcsListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetEcsListResponse response) {
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
        public Builder body(GetEcsListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetEcsListResponse build() {
            return new GetEcsListResponse(this);
        } 

    } 

}
