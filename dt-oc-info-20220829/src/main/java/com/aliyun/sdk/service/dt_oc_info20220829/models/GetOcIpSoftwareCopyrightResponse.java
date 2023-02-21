// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dt_oc_info20220829.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOcIpSoftwareCopyrightResponse} extends {@link TeaModel}
 *
 * <p>GetOcIpSoftwareCopyrightResponse</p>
 */
public class GetOcIpSoftwareCopyrightResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetOcIpSoftwareCopyrightResponseBody body;

    private GetOcIpSoftwareCopyrightResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetOcIpSoftwareCopyrightResponse create() {
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
    public GetOcIpSoftwareCopyrightResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetOcIpSoftwareCopyrightResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetOcIpSoftwareCopyrightResponseBody body);

        @Override
        GetOcIpSoftwareCopyrightResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetOcIpSoftwareCopyrightResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetOcIpSoftwareCopyrightResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetOcIpSoftwareCopyrightResponse response) {
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
        public Builder body(GetOcIpSoftwareCopyrightResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetOcIpSoftwareCopyrightResponse build() {
            return new GetOcIpSoftwareCopyrightResponse(this);
        } 

    } 

}
