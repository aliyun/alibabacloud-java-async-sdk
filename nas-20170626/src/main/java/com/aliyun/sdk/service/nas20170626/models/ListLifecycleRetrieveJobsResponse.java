// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListLifecycleRetrieveJobsResponse} extends {@link TeaModel}
 *
 * <p>ListLifecycleRetrieveJobsResponse</p>
 */
public class ListLifecycleRetrieveJobsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListLifecycleRetrieveJobsResponseBody body;

    private ListLifecycleRetrieveJobsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListLifecycleRetrieveJobsResponse create() {
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
    public ListLifecycleRetrieveJobsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListLifecycleRetrieveJobsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListLifecycleRetrieveJobsResponseBody body);

        @Override
        ListLifecycleRetrieveJobsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListLifecycleRetrieveJobsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListLifecycleRetrieveJobsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListLifecycleRetrieveJobsResponse response) {
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
        public Builder body(ListLifecycleRetrieveJobsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListLifecycleRetrieveJobsResponse build() {
            return new ListLifecycleRetrieveJobsResponse(this);
        } 

    } 

}
