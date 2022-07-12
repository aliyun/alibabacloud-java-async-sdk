// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link ListEtlMetaResponse} extends {@link TeaModel}
 *
 * <p>ListEtlMetaResponse</p>
 */
public class ListEtlMetaResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListEtlMetaResponseBody body;

    private ListEtlMetaResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListEtlMetaResponse create() {
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
    public ListEtlMetaResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListEtlMetaResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListEtlMetaResponseBody body);

        @Override
        ListEtlMetaResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListEtlMetaResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListEtlMetaResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListEtlMetaResponse response) {
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
        public Builder body(ListEtlMetaResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListEtlMetaResponse build() {
            return new ListEtlMetaResponse(this);
        } 

    } 

}
