// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDeployOrdersResponse} extends {@link TeaModel}
 *
 * <p>ListDeployOrdersResponse</p>
 */
public class ListDeployOrdersResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListDeployOrdersResponseBody body;

    private ListDeployOrdersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListDeployOrdersResponse create() {
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
    public ListDeployOrdersResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListDeployOrdersResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListDeployOrdersResponseBody body);

        @Override
        ListDeployOrdersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListDeployOrdersResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListDeployOrdersResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListDeployOrdersResponse response) {
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
        public Builder body(ListDeployOrdersResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListDeployOrdersResponse build() {
            return new ListDeployOrdersResponse(this);
        } 

    } 

}
