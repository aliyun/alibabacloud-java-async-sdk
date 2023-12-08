// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tag20180828.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSupportResourceTypesResponse} extends {@link TeaModel}
 *
 * <p>ListSupportResourceTypesResponse</p>
 */
public class ListSupportResourceTypesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListSupportResourceTypesResponseBody body;

    private ListSupportResourceTypesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListSupportResourceTypesResponse create() {
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
    public ListSupportResourceTypesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListSupportResourceTypesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListSupportResourceTypesResponseBody body);

        @Override
        ListSupportResourceTypesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListSupportResourceTypesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListSupportResourceTypesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListSupportResourceTypesResponse response) {
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
        public Builder body(ListSupportResourceTypesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListSupportResourceTypesResponse build() {
            return new ListSupportResourceTypesResponse(this);
        } 

    } 

}
