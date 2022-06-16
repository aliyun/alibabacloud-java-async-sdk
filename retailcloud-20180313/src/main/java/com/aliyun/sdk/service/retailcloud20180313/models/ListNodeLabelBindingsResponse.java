// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListNodeLabelBindingsResponse} extends {@link TeaModel}
 *
 * <p>ListNodeLabelBindingsResponse</p>
 */
public class ListNodeLabelBindingsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListNodeLabelBindingsResponseBody body;

    private ListNodeLabelBindingsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListNodeLabelBindingsResponse create() {
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
    public ListNodeLabelBindingsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListNodeLabelBindingsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListNodeLabelBindingsResponseBody body);

        @Override
        ListNodeLabelBindingsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListNodeLabelBindingsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListNodeLabelBindingsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListNodeLabelBindingsResponse response) {
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
        public Builder body(ListNodeLabelBindingsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListNodeLabelBindingsResponse build() {
            return new ListNodeLabelBindingsResponse(this);
        } 

    } 

}
