// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListInstancesResponse} extends {@link TeaModel}
 *
 * <p>ListInstancesResponse</p>
 */
public class ListInstancesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListInstancesResponseBody body;

    private ListInstancesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListInstancesResponse create() {
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
    public ListInstancesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListInstancesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListInstancesResponseBody body);

        @Override
        ListInstancesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListInstancesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListInstancesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListInstancesResponse response) {
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
        public Builder body(ListInstancesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListInstancesResponse build() {
            return new ListInstancesResponse(this);
        } 

    } 

}
