// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSwimLaneListResponse} extends {@link TeaModel}
 *
 * <p>GetSwimLaneListResponse</p>
 */
public class GetSwimLaneListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetSwimLaneListResponseBody body;

    private GetSwimLaneListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetSwimLaneListResponse create() {
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
    public GetSwimLaneListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetSwimLaneListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetSwimLaneListResponseBody body);

        @Override
        GetSwimLaneListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetSwimLaneListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetSwimLaneListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetSwimLaneListResponse response) {
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
        public Builder body(GetSwimLaneListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetSwimLaneListResponse build() {
            return new GetSwimLaneListResponse(this);
        } 

    } 

}
