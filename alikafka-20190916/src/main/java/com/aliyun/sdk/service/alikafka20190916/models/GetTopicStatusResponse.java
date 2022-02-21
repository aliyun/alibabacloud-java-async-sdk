// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alikafka20190916.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTopicStatusResponse} extends {@link TeaModel}
 *
 * <p>GetTopicStatusResponse</p>
 */
public class GetTopicStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetTopicStatusResponseBody body;

    private GetTopicStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetTopicStatusResponse create() {
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
    public GetTopicStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetTopicStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetTopicStatusResponseBody body);

        @Override
        GetTopicStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetTopicStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetTopicStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetTopicStatusResponse response) {
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
        public Builder body(GetTopicStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetTopicStatusResponse build() {
            return new GetTopicStatusResponse(this);
        } 

    } 

}
