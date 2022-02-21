// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAliasesByKeyIdResponse} extends {@link TeaModel}
 *
 * <p>ListAliasesByKeyIdResponse</p>
 */
public class ListAliasesByKeyIdResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListAliasesByKeyIdResponseBody body;

    private ListAliasesByKeyIdResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListAliasesByKeyIdResponse create() {
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
    public ListAliasesByKeyIdResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListAliasesByKeyIdResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListAliasesByKeyIdResponseBody body);

        @Override
        ListAliasesByKeyIdResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListAliasesByKeyIdResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListAliasesByKeyIdResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListAliasesByKeyIdResponse response) {
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
        public Builder body(ListAliasesByKeyIdResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListAliasesByKeyIdResponse build() {
            return new ListAliasesByKeyIdResponse(this);
        } 

    } 

}
