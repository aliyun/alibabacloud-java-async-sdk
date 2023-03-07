// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcecenter20221201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListResourceTypesResponse} extends {@link TeaModel}
 *
 * <p>ListResourceTypesResponse</p>
 */
public class ListResourceTypesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListResourceTypesResponseBody body;

    private ListResourceTypesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListResourceTypesResponse create() {
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
    public ListResourceTypesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListResourceTypesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListResourceTypesResponseBody body);

        @Override
        ListResourceTypesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListResourceTypesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListResourceTypesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListResourceTypesResponse response) {
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
        public Builder body(ListResourceTypesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListResourceTypesResponse build() {
            return new ListResourceTypesResponse(this);
        } 

    } 

}
