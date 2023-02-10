// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListInstanceCatalogResponse} extends {@link TeaModel}
 *
 * <p>ListInstanceCatalogResponse</p>
 */
public class ListInstanceCatalogResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListInstanceCatalogResponseBody body;

    private ListInstanceCatalogResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListInstanceCatalogResponse create() {
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
    public ListInstanceCatalogResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListInstanceCatalogResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListInstanceCatalogResponseBody body);

        @Override
        ListInstanceCatalogResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListInstanceCatalogResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListInstanceCatalogResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListInstanceCatalogResponse response) {
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
        public Builder body(ListInstanceCatalogResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListInstanceCatalogResponse build() {
            return new ListInstanceCatalogResponse(this);
        } 

    } 

}
