// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListOnlineConfigsResponse} extends {@link TeaModel}
 *
 * <p>ListOnlineConfigsResponse</p>
 */
public class ListOnlineConfigsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListOnlineConfigsResponseBody body;

    private ListOnlineConfigsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListOnlineConfigsResponse create() {
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
    public ListOnlineConfigsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListOnlineConfigsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListOnlineConfigsResponseBody body);

        @Override
        ListOnlineConfigsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListOnlineConfigsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListOnlineConfigsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListOnlineConfigsResponse response) {
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
        public Builder body(ListOnlineConfigsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListOnlineConfigsResponse build() {
            return new ListOnlineConfigsResponse(this);
        } 

    } 

}
