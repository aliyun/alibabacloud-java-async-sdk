// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListABTestExperimentsResponse} extends {@link TeaModel}
 *
 * <p>ListABTestExperimentsResponse</p>
 */
public class ListABTestExperimentsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListABTestExperimentsResponseBody body;

    private ListABTestExperimentsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListABTestExperimentsResponse create() {
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
    public ListABTestExperimentsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListABTestExperimentsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListABTestExperimentsResponseBody body);

        @Override
        ListABTestExperimentsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListABTestExperimentsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListABTestExperimentsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListABTestExperimentsResponse response) {
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
        public Builder body(ListABTestExperimentsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListABTestExperimentsResponse build() {
            return new ListABTestExperimentsResponse(this);
        } 

    } 

}
