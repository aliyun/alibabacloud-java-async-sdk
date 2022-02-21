// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20151123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRegionListResponse} extends {@link TeaModel}
 *
 * <p>GetRegionListResponse</p>
 */
public class GetRegionListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetRegionListResponseBody body;

    private GetRegionListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetRegionListResponse create() {
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
    public GetRegionListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetRegionListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetRegionListResponseBody body);

        @Override
        GetRegionListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetRegionListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetRegionListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetRegionListResponse response) {
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
        public Builder body(GetRegionListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetRegionListResponse build() {
            return new GetRegionListResponse(this);
        } 

    } 

}
