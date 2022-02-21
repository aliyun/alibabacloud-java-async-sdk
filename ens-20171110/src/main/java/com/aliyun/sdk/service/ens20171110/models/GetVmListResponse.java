// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetVmListResponse} extends {@link TeaModel}
 *
 * <p>GetVmListResponse</p>
 */
public class GetVmListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetVmListResponseBody body;

    private GetVmListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetVmListResponse create() {
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
    public GetVmListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetVmListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetVmListResponseBody body);

        @Override
        GetVmListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetVmListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetVmListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetVmListResponse response) {
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
        public Builder body(GetVmListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetVmListResponse build() {
            return new GetVmListResponse(this);
        } 

    } 

}
