// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListJobsResponse} extends {@link TeaModel}
 *
 * <p>ListJobsResponse</p>
 */
public class ListJobsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListJobsResponseBody body;

    private ListJobsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListJobsResponse create() {
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
    public ListJobsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListJobsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListJobsResponseBody body);

        @Override
        ListJobsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListJobsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListJobsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListJobsResponse response) {
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
        public Builder body(ListJobsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListJobsResponse build() {
            return new ListJobsResponse(this);
        } 

    } 

}
