// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.schedulerx220190430.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetWorkerListResponse} extends {@link TeaModel}
 *
 * <p>GetWorkerListResponse</p>
 */
public class GetWorkerListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetWorkerListResponseBody body;

    private GetWorkerListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetWorkerListResponse create() {
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
    public GetWorkerListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetWorkerListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetWorkerListResponseBody body);

        @Override
        GetWorkerListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetWorkerListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetWorkerListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetWorkerListResponse response) {
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
        public Builder body(GetWorkerListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetWorkerListResponse build() {
            return new GetWorkerListResponse(this);
        } 

    } 

}
