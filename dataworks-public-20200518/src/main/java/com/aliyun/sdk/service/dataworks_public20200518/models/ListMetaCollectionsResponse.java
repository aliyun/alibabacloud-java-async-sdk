// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListMetaCollectionsResponse} extends {@link TeaModel}
 *
 * <p>ListMetaCollectionsResponse</p>
 */
public class ListMetaCollectionsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListMetaCollectionsResponseBody body;

    private ListMetaCollectionsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListMetaCollectionsResponse create() {
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
    public ListMetaCollectionsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListMetaCollectionsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListMetaCollectionsResponseBody body);

        @Override
        ListMetaCollectionsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListMetaCollectionsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListMetaCollectionsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListMetaCollectionsResponse response) {
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
        public Builder body(ListMetaCollectionsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListMetaCollectionsResponse build() {
            return new ListMetaCollectionsResponse(this);
        } 

    } 

}
