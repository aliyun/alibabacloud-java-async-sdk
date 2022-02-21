// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetProjectInfoResponse} extends {@link TeaModel}
 *
 * <p>GetProjectInfoResponse</p>
 */
public class GetProjectInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetProjectInfoResponseBody body;

    private GetProjectInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetProjectInfoResponse create() {
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
    public GetProjectInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetProjectInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetProjectInfoResponseBody body);

        @Override
        GetProjectInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetProjectInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetProjectInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetProjectInfoResponse response) {
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
        public Builder body(GetProjectInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetProjectInfoResponse build() {
            return new GetProjectInfoResponse(this);
        } 

    } 

}
