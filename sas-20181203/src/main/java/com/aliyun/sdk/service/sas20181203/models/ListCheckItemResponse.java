// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCheckItemResponse} extends {@link TeaModel}
 *
 * <p>ListCheckItemResponse</p>
 */
public class ListCheckItemResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListCheckItemResponseBody body;

    private ListCheckItemResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListCheckItemResponse create() {
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
    public ListCheckItemResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListCheckItemResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListCheckItemResponseBody body);

        @Override
        ListCheckItemResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListCheckItemResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListCheckItemResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListCheckItemResponse response) {
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
        public Builder body(ListCheckItemResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListCheckItemResponse build() {
            return new ListCheckItemResponse(this);
        } 

    } 

}
