// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops_rdc20200303.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDevopsProjectSprintInfoResponse} extends {@link TeaModel}
 *
 * <p>GetDevopsProjectSprintInfoResponse</p>
 */
public class GetDevopsProjectSprintInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetDevopsProjectSprintInfoResponseBody body;

    private GetDevopsProjectSprintInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetDevopsProjectSprintInfoResponse create() {
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
    public GetDevopsProjectSprintInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetDevopsProjectSprintInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetDevopsProjectSprintInfoResponseBody body);

        @Override
        GetDevopsProjectSprintInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetDevopsProjectSprintInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetDevopsProjectSprintInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetDevopsProjectSprintInfoResponse response) {
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
        public Builder body(GetDevopsProjectSprintInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetDevopsProjectSprintInfoResponse build() {
            return new GetDevopsProjectSprintInfoResponse(this);
        } 

    } 

}
