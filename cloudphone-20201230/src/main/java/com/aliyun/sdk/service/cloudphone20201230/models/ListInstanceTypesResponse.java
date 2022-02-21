// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudphone20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListInstanceTypesResponse} extends {@link TeaModel}
 *
 * <p>ListInstanceTypesResponse</p>
 */
public class ListInstanceTypesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListInstanceTypesResponseBody body;

    private ListInstanceTypesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListInstanceTypesResponse create() {
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
    public ListInstanceTypesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListInstanceTypesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListInstanceTypesResponseBody body);

        @Override
        ListInstanceTypesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListInstanceTypesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListInstanceTypesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListInstanceTypesResponse response) {
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
        public Builder body(ListInstanceTypesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListInstanceTypesResponse build() {
            return new ListInstanceTypesResponse(this);
        } 

    } 

}
