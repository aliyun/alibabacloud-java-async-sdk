// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListComponentIndicesResponse} extends {@link TeaModel}
 *
 * <p>ListComponentIndicesResponse</p>
 */
public class ListComponentIndicesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListComponentIndicesResponseBody body;

    private ListComponentIndicesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListComponentIndicesResponse create() {
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
    public ListComponentIndicesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListComponentIndicesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListComponentIndicesResponseBody body);

        @Override
        ListComponentIndicesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListComponentIndicesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListComponentIndicesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListComponentIndicesResponse response) {
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
        public Builder body(ListComponentIndicesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListComponentIndicesResponse build() {
            return new ListComponentIndicesResponse(this);
        } 

    } 

}
