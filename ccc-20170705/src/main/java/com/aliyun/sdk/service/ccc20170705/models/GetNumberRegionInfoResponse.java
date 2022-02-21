// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetNumberRegionInfoResponse} extends {@link TeaModel}
 *
 * <p>GetNumberRegionInfoResponse</p>
 */
public class GetNumberRegionInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetNumberRegionInfoResponseBody body;

    private GetNumberRegionInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetNumberRegionInfoResponse create() {
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
    public GetNumberRegionInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetNumberRegionInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetNumberRegionInfoResponseBody body);

        @Override
        GetNumberRegionInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetNumberRegionInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetNumberRegionInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetNumberRegionInfoResponse response) {
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
        public Builder body(GetNumberRegionInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetNumberRegionInfoResponse build() {
            return new GetNumberRegionInfoResponse(this);
        } 

    } 

}
