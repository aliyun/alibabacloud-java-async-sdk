// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPodLogsResponse} extends {@link TeaModel}
 *
 * <p>GetPodLogsResponse</p>
 */
public class GetPodLogsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetPodLogsResponseBody body;

    private GetPodLogsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetPodLogsResponse create() {
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
    public GetPodLogsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetPodLogsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetPodLogsResponseBody body);

        @Override
        GetPodLogsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetPodLogsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetPodLogsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetPodLogsResponse response) {
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
        public Builder body(GetPodLogsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetPodLogsResponse build() {
            return new GetPodLogsResponse(this);
        } 

    } 

}
