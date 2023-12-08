// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailian20230601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFineTuneJobsResponse} extends {@link TeaModel}
 *
 * <p>ListFineTuneJobsResponse</p>
 */
public class ListFineTuneJobsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListFineTuneJobsResponseBody body;

    private ListFineTuneJobsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListFineTuneJobsResponse create() {
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
    public ListFineTuneJobsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListFineTuneJobsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListFineTuneJobsResponseBody body);

        @Override
        ListFineTuneJobsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListFineTuneJobsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListFineTuneJobsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListFineTuneJobsResponse response) {
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
        public Builder body(ListFineTuneJobsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListFineTuneJobsResponse build() {
            return new ListFineTuneJobsResponse(this);
        } 

    } 

}
