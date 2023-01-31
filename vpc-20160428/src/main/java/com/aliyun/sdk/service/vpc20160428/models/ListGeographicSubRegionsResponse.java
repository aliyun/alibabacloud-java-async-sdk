// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListGeographicSubRegionsResponse} extends {@link TeaModel}
 *
 * <p>ListGeographicSubRegionsResponse</p>
 */
public class ListGeographicSubRegionsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListGeographicSubRegionsResponseBody body;

    private ListGeographicSubRegionsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListGeographicSubRegionsResponse create() {
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
    public ListGeographicSubRegionsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListGeographicSubRegionsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListGeographicSubRegionsResponseBody body);

        @Override
        ListGeographicSubRegionsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListGeographicSubRegionsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListGeographicSubRegionsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListGeographicSubRegionsResponse response) {
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
        public Builder body(ListGeographicSubRegionsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListGeographicSubRegionsResponse build() {
            return new ListGeographicSubRegionsResponse(this);
        } 

    } 

}
