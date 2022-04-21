// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iotcc20210513.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAPNsResponse} extends {@link TeaModel}
 *
 * <p>ListAPNsResponse</p>
 */
public class ListAPNsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListAPNsResponseBody body;

    private ListAPNsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListAPNsResponse create() {
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
    public ListAPNsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListAPNsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListAPNsResponseBody body);

        @Override
        ListAPNsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListAPNsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListAPNsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListAPNsResponse response) {
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
        public Builder body(ListAPNsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListAPNsResponse build() {
            return new ListAPNsResponse(this);
        } 

    } 

}
