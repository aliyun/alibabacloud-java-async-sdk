// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alikafka20190916.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAllowedIpListResponse} extends {@link TeaModel}
 *
 * <p>GetAllowedIpListResponse</p>
 */
public class GetAllowedIpListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetAllowedIpListResponseBody body;

    private GetAllowedIpListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetAllowedIpListResponse create() {
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
    public GetAllowedIpListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetAllowedIpListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetAllowedIpListResponseBody body);

        @Override
        GetAllowedIpListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetAllowedIpListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetAllowedIpListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetAllowedIpListResponse response) {
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
        public Builder body(GetAllowedIpListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetAllowedIpListResponse build() {
            return new GetAllowedIpListResponse(this);
        } 

    } 

}
