// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RequestServiceOfCloudDBAResponse} extends {@link TeaModel}
 *
 * <p>RequestServiceOfCloudDBAResponse</p>
 */
public class RequestServiceOfCloudDBAResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RequestServiceOfCloudDBAResponseBody body;

    private RequestServiceOfCloudDBAResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RequestServiceOfCloudDBAResponse create() {
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
    public RequestServiceOfCloudDBAResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RequestServiceOfCloudDBAResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RequestServiceOfCloudDBAResponseBody body);

        @Override
        RequestServiceOfCloudDBAResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RequestServiceOfCloudDBAResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RequestServiceOfCloudDBAResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RequestServiceOfCloudDBAResponse response) {
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
        public Builder body(RequestServiceOfCloudDBAResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RequestServiceOfCloudDBAResponse build() {
            return new RequestServiceOfCloudDBAResponse(this);
        } 

    } 

}
