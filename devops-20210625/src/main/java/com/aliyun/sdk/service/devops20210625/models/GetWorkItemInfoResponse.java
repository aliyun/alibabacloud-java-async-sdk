// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetWorkItemInfoResponse} extends {@link TeaModel}
 *
 * <p>GetWorkItemInfoResponse</p>
 */
public class GetWorkItemInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetWorkItemInfoResponseBody body;

    private GetWorkItemInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetWorkItemInfoResponse create() {
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
    public GetWorkItemInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetWorkItemInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetWorkItemInfoResponseBody body);

        @Override
        GetWorkItemInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetWorkItemInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetWorkItemInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetWorkItemInfoResponse response) {
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
        public Builder body(GetWorkItemInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetWorkItemInfoResponse build() {
            return new GetWorkItemInfoResponse(this);
        } 

    } 

}
