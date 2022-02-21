// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.openanalytics_open20180619.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSparkJobAttemptResponse} extends {@link TeaModel}
 *
 * <p>ListSparkJobAttemptResponse</p>
 */
public class ListSparkJobAttemptResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListSparkJobAttemptResponseBody body;

    private ListSparkJobAttemptResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListSparkJobAttemptResponse create() {
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
    public ListSparkJobAttemptResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListSparkJobAttemptResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListSparkJobAttemptResponseBody body);

        @Override
        ListSparkJobAttemptResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListSparkJobAttemptResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListSparkJobAttemptResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListSparkJobAttemptResponse response) {
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
        public Builder body(ListSparkJobAttemptResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListSparkJobAttemptResponse build() {
            return new ListSparkJobAttemptResponse(this);
        } 

    } 

}
