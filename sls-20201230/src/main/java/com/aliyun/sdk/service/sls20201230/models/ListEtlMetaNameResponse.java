// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link ListEtlMetaNameResponse} extends {@link TeaModel}
 *
 * <p>ListEtlMetaNameResponse</p>
 */
public class ListEtlMetaNameResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListEtlMetaNameResponseBody body;

    private ListEtlMetaNameResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListEtlMetaNameResponse create() {
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
    public ListEtlMetaNameResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListEtlMetaNameResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListEtlMetaNameResponseBody body);

        @Override
        ListEtlMetaNameResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListEtlMetaNameResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListEtlMetaNameResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListEtlMetaNameResponse response) {
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
        public Builder body(ListEtlMetaNameResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListEtlMetaNameResponse build() {
            return new ListEtlMetaNameResponse(this);
        } 

    } 

}
