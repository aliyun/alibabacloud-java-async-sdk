// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link GetContextLogsResponse} extends {@link TeaModel}
 *
 * <p>GetContextLogsResponse</p>
 */
public class GetContextLogsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetContextLogsResponseBody body;

    private GetContextLogsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetContextLogsResponse create() {
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
    public GetContextLogsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetContextLogsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetContextLogsResponseBody body);

        @Override
        GetContextLogsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetContextLogsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetContextLogsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetContextLogsResponse response) {
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
        public Builder body(GetContextLogsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetContextLogsResponse build() {
            return new GetContextLogsResponse(this);
        } 

    } 

}
