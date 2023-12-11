// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDagsResponse} extends {@link TeaModel}
 *
 * <p>ListDagsResponse</p>
 */
public class ListDagsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListDagsResponseBody body;

    private ListDagsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListDagsResponse create() {
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
    public ListDagsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListDagsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListDagsResponseBody body);

        @Override
        ListDagsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListDagsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListDagsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListDagsResponse response) {
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
        public Builder body(ListDagsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListDagsResponse build() {
            return new ListDagsResponse(this);
        } 

    } 

}
