// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSwimLaneDetailResponse} extends {@link TeaModel}
 *
 * <p>GetSwimLaneDetailResponse</p>
 */
public class GetSwimLaneDetailResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetSwimLaneDetailResponseBody body;

    private GetSwimLaneDetailResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetSwimLaneDetailResponse create() {
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
    public GetSwimLaneDetailResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetSwimLaneDetailResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetSwimLaneDetailResponseBody body);

        @Override
        GetSwimLaneDetailResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetSwimLaneDetailResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetSwimLaneDetailResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetSwimLaneDetailResponse response) {
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
        public Builder body(GetSwimLaneDetailResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetSwimLaneDetailResponse build() {
            return new GetSwimLaneDetailResponse(this);
        } 

    } 

}
