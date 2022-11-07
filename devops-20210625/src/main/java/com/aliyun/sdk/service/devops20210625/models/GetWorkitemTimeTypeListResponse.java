// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetWorkitemTimeTypeListResponse} extends {@link TeaModel}
 *
 * <p>GetWorkitemTimeTypeListResponse</p>
 */
public class GetWorkitemTimeTypeListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetWorkitemTimeTypeListResponseBody body;

    private GetWorkitemTimeTypeListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetWorkitemTimeTypeListResponse create() {
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
    public GetWorkitemTimeTypeListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetWorkitemTimeTypeListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetWorkitemTimeTypeListResponseBody body);

        @Override
        GetWorkitemTimeTypeListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetWorkitemTimeTypeListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetWorkitemTimeTypeListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetWorkitemTimeTypeListResponse response) {
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
        public Builder body(GetWorkitemTimeTypeListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetWorkitemTimeTypeListResponse build() {
            return new GetWorkitemTimeTypeListResponse(this);
        } 

    } 

}
