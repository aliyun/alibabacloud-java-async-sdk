// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops_rdc20200303.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDevopsProjectTaskInfoResponse} extends {@link TeaModel}
 *
 * <p>GetDevopsProjectTaskInfoResponse</p>
 */
public class GetDevopsProjectTaskInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetDevopsProjectTaskInfoResponseBody body;

    private GetDevopsProjectTaskInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetDevopsProjectTaskInfoResponse create() {
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
    public GetDevopsProjectTaskInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetDevopsProjectTaskInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetDevopsProjectTaskInfoResponseBody body);

        @Override
        GetDevopsProjectTaskInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetDevopsProjectTaskInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetDevopsProjectTaskInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetDevopsProjectTaskInfoResponse response) {
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
        public Builder body(GetDevopsProjectTaskInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetDevopsProjectTaskInfoResponse build() {
            return new GetDevopsProjectTaskInfoResponse(this);
        } 

    } 

}
