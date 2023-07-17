// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20210422.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPromClustersResponse} extends {@link TeaModel}
 *
 * <p>ListPromClustersResponse</p>
 */
public class ListPromClustersResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListPromClustersResponseBody body;

    private ListPromClustersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListPromClustersResponse create() {
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
    public ListPromClustersResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListPromClustersResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListPromClustersResponseBody body);

        @Override
        ListPromClustersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListPromClustersResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListPromClustersResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListPromClustersResponse response) {
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
        public Builder body(ListPromClustersResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListPromClustersResponse build() {
            return new ListPromClustersResponse(this);
        } 

    } 

}
