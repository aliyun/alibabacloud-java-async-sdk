// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20170714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopJobsResponse} extends {@link TeaModel}
 *
 * <p>StopJobsResponse</p>
 */
public class StopJobsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StopJobsResponseBody body;

    private StopJobsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StopJobsResponse create() {
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
    public StopJobsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StopJobsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StopJobsResponseBody body);

        @Override
        StopJobsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StopJobsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StopJobsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StopJobsResponse response) {
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
        public Builder body(StopJobsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StopJobsResponse build() {
            return new StopJobsResponse(this);
        } 

    } 

}
