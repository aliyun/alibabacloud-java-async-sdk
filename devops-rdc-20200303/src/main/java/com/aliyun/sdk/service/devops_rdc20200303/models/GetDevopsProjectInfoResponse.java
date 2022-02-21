// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops_rdc20200303.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDevopsProjectInfoResponse} extends {@link TeaModel}
 *
 * <p>GetDevopsProjectInfoResponse</p>
 */
public class GetDevopsProjectInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetDevopsProjectInfoResponseBody body;

    private GetDevopsProjectInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetDevopsProjectInfoResponse create() {
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
    public GetDevopsProjectInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetDevopsProjectInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetDevopsProjectInfoResponseBody body);

        @Override
        GetDevopsProjectInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetDevopsProjectInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetDevopsProjectInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetDevopsProjectInfoResponse response) {
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
        public Builder body(GetDevopsProjectInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetDevopsProjectInfoResponse build() {
            return new GetDevopsProjectInfoResponse(this);
        } 

    } 

}
