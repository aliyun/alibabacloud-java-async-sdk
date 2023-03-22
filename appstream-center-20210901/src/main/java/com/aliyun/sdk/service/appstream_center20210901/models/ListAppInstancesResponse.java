// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAppInstancesResponse} extends {@link TeaModel}
 *
 * <p>ListAppInstancesResponse</p>
 */
public class ListAppInstancesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListAppInstancesResponseBody body;

    private ListAppInstancesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListAppInstancesResponse create() {
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
    public ListAppInstancesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListAppInstancesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListAppInstancesResponseBody body);

        @Override
        ListAppInstancesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListAppInstancesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListAppInstancesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListAppInstancesResponse response) {
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
        public Builder body(ListAppInstancesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListAppInstancesResponse build() {
            return new ListAppInstancesResponse(this);
        } 

    } 

}
