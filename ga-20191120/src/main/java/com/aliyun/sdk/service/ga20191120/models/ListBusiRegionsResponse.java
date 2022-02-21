// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListBusiRegionsResponse} extends {@link TeaModel}
 *
 * <p>ListBusiRegionsResponse</p>
 */
public class ListBusiRegionsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListBusiRegionsResponseBody body;

    private ListBusiRegionsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListBusiRegionsResponse create() {
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
    public ListBusiRegionsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListBusiRegionsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListBusiRegionsResponseBody body);

        @Override
        ListBusiRegionsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListBusiRegionsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListBusiRegionsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListBusiRegionsResponse response) {
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
        public Builder body(ListBusiRegionsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListBusiRegionsResponse build() {
            return new ListBusiRegionsResponse(this);
        } 

    } 

}
