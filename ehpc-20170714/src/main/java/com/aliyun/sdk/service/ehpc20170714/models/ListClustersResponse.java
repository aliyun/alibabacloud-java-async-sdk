// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20170714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListClustersResponse} extends {@link TeaModel}
 *
 * <p>ListClustersResponse</p>
 */
public class ListClustersResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListClustersResponseBody body;

    private ListClustersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListClustersResponse create() {
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
    public ListClustersResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListClustersResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListClustersResponseBody body);

        @Override
        ListClustersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListClustersResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListClustersResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListClustersResponse response) {
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
        public Builder body(ListClustersResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListClustersResponse build() {
            return new ListClustersResponse(this);
        } 

    } 

}
