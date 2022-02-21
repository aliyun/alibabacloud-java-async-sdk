// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSecondRanksResponse} extends {@link TeaModel}
 *
 * <p>ListSecondRanksResponse</p>
 */
public class ListSecondRanksResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListSecondRanksResponseBody body;

    private ListSecondRanksResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListSecondRanksResponse create() {
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
    public ListSecondRanksResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListSecondRanksResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListSecondRanksResponseBody body);

        @Override
        ListSecondRanksResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListSecondRanksResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListSecondRanksResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListSecondRanksResponse response) {
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
        public Builder body(ListSecondRanksResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListSecondRanksResponse build() {
            return new ListSecondRanksResponse(this);
        } 

    } 

}
