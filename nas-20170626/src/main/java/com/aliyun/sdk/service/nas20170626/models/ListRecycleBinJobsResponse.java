// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRecycleBinJobsResponse} extends {@link TeaModel}
 *
 * <p>ListRecycleBinJobsResponse</p>
 */
public class ListRecycleBinJobsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListRecycleBinJobsResponseBody body;

    private ListRecycleBinJobsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListRecycleBinJobsResponse create() {
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
    public ListRecycleBinJobsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListRecycleBinJobsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListRecycleBinJobsResponseBody body);

        @Override
        ListRecycleBinJobsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListRecycleBinJobsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListRecycleBinJobsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListRecycleBinJobsResponse response) {
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
        public Builder body(ListRecycleBinJobsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListRecycleBinJobsResponse build() {
            return new ListRecycleBinJobsResponse(this);
        } 

    } 

}
