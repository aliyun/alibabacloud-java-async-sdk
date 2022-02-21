// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListHBaseInstancesResponse} extends {@link TeaModel}
 *
 * <p>ListHBaseInstancesResponse</p>
 */
public class ListHBaseInstancesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListHBaseInstancesResponseBody body;

    private ListHBaseInstancesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListHBaseInstancesResponse create() {
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
    public ListHBaseInstancesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListHBaseInstancesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListHBaseInstancesResponseBody body);

        @Override
        ListHBaseInstancesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListHBaseInstancesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListHBaseInstancesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListHBaseInstancesResponse response) {
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
        public Builder body(ListHBaseInstancesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListHBaseInstancesResponse build() {
            return new ListHBaseInstancesResponse(this);
        } 

    } 

}
