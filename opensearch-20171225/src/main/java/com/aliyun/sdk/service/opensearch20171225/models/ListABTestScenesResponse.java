// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListABTestScenesResponse} extends {@link TeaModel}
 *
 * <p>ListABTestScenesResponse</p>
 */
public class ListABTestScenesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListABTestScenesResponseBody body;

    private ListABTestScenesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListABTestScenesResponse create() {
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
    public ListABTestScenesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListABTestScenesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListABTestScenesResponseBody body);

        @Override
        ListABTestScenesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListABTestScenesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListABTestScenesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListABTestScenesResponse response) {
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
        public Builder body(ListABTestScenesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListABTestScenesResponse build() {
            return new ListABTestScenesResponse(this);
        } 

    } 

}
