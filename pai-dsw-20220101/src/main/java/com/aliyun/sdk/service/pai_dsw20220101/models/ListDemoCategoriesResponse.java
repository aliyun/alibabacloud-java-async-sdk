// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dsw20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDemoCategoriesResponse} extends {@link TeaModel}
 *
 * <p>ListDemoCategoriesResponse</p>
 */
public class ListDemoCategoriesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListDemoCategoriesResponseBody body;

    private ListDemoCategoriesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListDemoCategoriesResponse create() {
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
    public ListDemoCategoriesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListDemoCategoriesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListDemoCategoriesResponseBody body);

        @Override
        ListDemoCategoriesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListDemoCategoriesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListDemoCategoriesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListDemoCategoriesResponse response) {
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
        public Builder body(ListDemoCategoriesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListDemoCategoriesResponse build() {
            return new ListDemoCategoriesResponse(this);
        } 

    } 

}
