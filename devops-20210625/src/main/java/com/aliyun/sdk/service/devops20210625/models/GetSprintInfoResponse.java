// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSprintInfoResponse} extends {@link TeaModel}
 *
 * <p>GetSprintInfoResponse</p>
 */
public class GetSprintInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetSprintInfoResponseBody body;

    private GetSprintInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetSprintInfoResponse create() {
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
    public GetSprintInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetSprintInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetSprintInfoResponseBody body);

        @Override
        GetSprintInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetSprintInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetSprintInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetSprintInfoResponse response) {
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
        public Builder body(GetSprintInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetSprintInfoResponse build() {
            return new GetSprintInfoResponse(this);
        } 

    } 

}
