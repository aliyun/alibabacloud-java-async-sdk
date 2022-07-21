// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopJobResponse} extends {@link TeaModel}
 *
 * <p>StopJobResponse</p>
 */
public class StopJobResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StopJobResponseBody body;

    private StopJobResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StopJobResponse create() {
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
    public StopJobResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StopJobResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StopJobResponseBody body);

        @Override
        StopJobResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StopJobResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StopJobResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StopJobResponse response) {
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
        public Builder body(StopJobResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StopJobResponse build() {
            return new StopJobResponse(this);
        } 

    } 

}
