// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListScheduledTasksResponse} extends {@link TeaModel}
 *
 * <p>ListScheduledTasksResponse</p>
 */
public class ListScheduledTasksResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListScheduledTasksResponseBody body;

    private ListScheduledTasksResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListScheduledTasksResponse create() {
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
    public ListScheduledTasksResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListScheduledTasksResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListScheduledTasksResponseBody body);

        @Override
        ListScheduledTasksResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListScheduledTasksResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListScheduledTasksResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListScheduledTasksResponse response) {
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
        public Builder body(ListScheduledTasksResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListScheduledTasksResponse build() {
            return new ListScheduledTasksResponse(this);
        } 

    } 

}
