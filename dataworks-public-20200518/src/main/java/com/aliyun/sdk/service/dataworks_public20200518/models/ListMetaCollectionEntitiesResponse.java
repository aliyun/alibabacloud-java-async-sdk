// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListMetaCollectionEntitiesResponse} extends {@link TeaModel}
 *
 * <p>ListMetaCollectionEntitiesResponse</p>
 */
public class ListMetaCollectionEntitiesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListMetaCollectionEntitiesResponseBody body;

    private ListMetaCollectionEntitiesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListMetaCollectionEntitiesResponse create() {
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
    public ListMetaCollectionEntitiesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListMetaCollectionEntitiesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListMetaCollectionEntitiesResponseBody body);

        @Override
        ListMetaCollectionEntitiesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListMetaCollectionEntitiesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListMetaCollectionEntitiesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListMetaCollectionEntitiesResponse response) {
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
        public Builder body(ListMetaCollectionEntitiesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListMetaCollectionEntitiesResponse build() {
            return new ListMetaCollectionEntitiesResponse(this);
        } 

    } 

}
