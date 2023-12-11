// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDIJobsResponse} extends {@link TeaModel}
 *
 * <p>ListDIJobsResponse</p>
 */
public class ListDIJobsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListDIJobsResponseBody body;

    private ListDIJobsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListDIJobsResponse create() {
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
    public ListDIJobsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListDIJobsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListDIJobsResponseBody body);

        @Override
        ListDIJobsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListDIJobsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListDIJobsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListDIJobsResponse response) {
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
        public Builder body(ListDIJobsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListDIJobsResponse build() {
            return new ListDIJobsResponse(this);
        } 

    } 

}
