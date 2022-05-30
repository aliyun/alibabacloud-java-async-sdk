// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetFileLastCommitResponse} extends {@link TeaModel}
 *
 * <p>GetFileLastCommitResponse</p>
 */
public class GetFileLastCommitResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetFileLastCommitResponseBody body;

    private GetFileLastCommitResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetFileLastCommitResponse create() {
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
    public GetFileLastCommitResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetFileLastCommitResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetFileLastCommitResponseBody body);

        @Override
        GetFileLastCommitResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetFileLastCommitResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetFileLastCommitResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetFileLastCommitResponse response) {
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
        public Builder body(GetFileLastCommitResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetFileLastCommitResponse build() {
            return new GetFileLastCommitResponse(this);
        } 

    } 

}
