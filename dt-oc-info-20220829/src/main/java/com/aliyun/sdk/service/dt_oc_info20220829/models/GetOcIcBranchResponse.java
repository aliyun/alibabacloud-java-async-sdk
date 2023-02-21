// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dt_oc_info20220829.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOcIcBranchResponse} extends {@link TeaModel}
 *
 * <p>GetOcIcBranchResponse</p>
 */
public class GetOcIcBranchResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetOcIcBranchResponseBody body;

    private GetOcIcBranchResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetOcIcBranchResponse create() {
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
    public GetOcIcBranchResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetOcIcBranchResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetOcIcBranchResponseBody body);

        @Override
        GetOcIcBranchResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetOcIcBranchResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetOcIcBranchResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetOcIcBranchResponse response) {
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
        public Builder body(GetOcIcBranchResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetOcIcBranchResponse build() {
            return new GetOcIcBranchResponse(this);
        } 

    } 

}
