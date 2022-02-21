// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAnsServiceClustersResponse} extends {@link TeaModel}
 *
 * <p>ListAnsServiceClustersResponse</p>
 */
public class ListAnsServiceClustersResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListAnsServiceClustersResponseBody body;

    private ListAnsServiceClustersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListAnsServiceClustersResponse create() {
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
    public ListAnsServiceClustersResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListAnsServiceClustersResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListAnsServiceClustersResponseBody body);

        @Override
        ListAnsServiceClustersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListAnsServiceClustersResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListAnsServiceClustersResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListAnsServiceClustersResponse response) {
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
        public Builder body(ListAnsServiceClustersResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListAnsServiceClustersResponse build() {
            return new ListAnsServiceClustersResponse(this);
        } 

    } 

}
