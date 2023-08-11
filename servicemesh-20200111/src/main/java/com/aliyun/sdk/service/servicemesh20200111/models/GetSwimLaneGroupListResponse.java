// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSwimLaneGroupListResponse} extends {@link TeaModel}
 *
 * <p>GetSwimLaneGroupListResponse</p>
 */
public class GetSwimLaneGroupListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetSwimLaneGroupListResponseBody body;

    private GetSwimLaneGroupListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetSwimLaneGroupListResponse create() {
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
    public GetSwimLaneGroupListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetSwimLaneGroupListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetSwimLaneGroupListResponseBody body);

        @Override
        GetSwimLaneGroupListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetSwimLaneGroupListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetSwimLaneGroupListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetSwimLaneGroupListResponse response) {
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
        public Builder body(GetSwimLaneGroupListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetSwimLaneGroupListResponse build() {
            return new GetSwimLaneGroupListResponse(this);
        } 

    } 

}
