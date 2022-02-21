// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListKeyVersionsResponse} extends {@link TeaModel}
 *
 * <p>ListKeyVersionsResponse</p>
 */
public class ListKeyVersionsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListKeyVersionsResponseBody body;

    private ListKeyVersionsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListKeyVersionsResponse create() {
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
    public ListKeyVersionsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListKeyVersionsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListKeyVersionsResponseBody body);

        @Override
        ListKeyVersionsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListKeyVersionsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListKeyVersionsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListKeyVersionsResponse response) {
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
        public Builder body(ListKeyVersionsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListKeyVersionsResponse build() {
            return new ListKeyVersionsResponse(this);
        } 

    } 

}
