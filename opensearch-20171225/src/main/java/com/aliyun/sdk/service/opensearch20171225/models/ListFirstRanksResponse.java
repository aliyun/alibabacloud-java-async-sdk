// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFirstRanksResponse} extends {@link TeaModel}
 *
 * <p>ListFirstRanksResponse</p>
 */
public class ListFirstRanksResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListFirstRanksResponseBody body;

    private ListFirstRanksResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListFirstRanksResponse create() {
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
    public ListFirstRanksResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListFirstRanksResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListFirstRanksResponseBody body);

        @Override
        ListFirstRanksResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListFirstRanksResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListFirstRanksResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListFirstRanksResponse response) {
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
        public Builder body(ListFirstRanksResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListFirstRanksResponse build() {
            return new ListFirstRanksResponse(this);
        } 

    } 

}
