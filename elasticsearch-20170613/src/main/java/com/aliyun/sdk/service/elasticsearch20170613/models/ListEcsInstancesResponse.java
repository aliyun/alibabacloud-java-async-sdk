// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListEcsInstancesResponse} extends {@link TeaModel}
 *
 * <p>ListEcsInstancesResponse</p>
 */
public class ListEcsInstancesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListEcsInstancesResponseBody body;

    private ListEcsInstancesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListEcsInstancesResponse create() {
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
    public ListEcsInstancesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListEcsInstancesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListEcsInstancesResponseBody body);

        @Override
        ListEcsInstancesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListEcsInstancesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListEcsInstancesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListEcsInstancesResponse response) {
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
        public Builder body(ListEcsInstancesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListEcsInstancesResponse build() {
            return new ListEcsInstancesResponse(this);
        } 

    } 

}
