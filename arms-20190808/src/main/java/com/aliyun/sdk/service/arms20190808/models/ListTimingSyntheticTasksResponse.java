// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTimingSyntheticTasksResponse} extends {@link TeaModel}
 *
 * <p>ListTimingSyntheticTasksResponse</p>
 */
public class ListTimingSyntheticTasksResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListTimingSyntheticTasksResponseBody body;

    private ListTimingSyntheticTasksResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListTimingSyntheticTasksResponse create() {
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
    public ListTimingSyntheticTasksResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListTimingSyntheticTasksResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListTimingSyntheticTasksResponseBody body);

        @Override
        ListTimingSyntheticTasksResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListTimingSyntheticTasksResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListTimingSyntheticTasksResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListTimingSyntheticTasksResponse response) {
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
        public Builder body(ListTimingSyntheticTasksResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListTimingSyntheticTasksResponse build() {
            return new ListTimingSyntheticTasksResponse(this);
        } 

    } 

}
