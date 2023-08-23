// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCustomQAResponse} extends {@link TeaModel}
 *
 * <p>ListCustomQAResponse</p>
 */
public class ListCustomQAResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListCustomQAResponseBody body;

    private ListCustomQAResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListCustomQAResponse create() {
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
    public ListCustomQAResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListCustomQAResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListCustomQAResponseBody body);

        @Override
        ListCustomQAResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListCustomQAResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListCustomQAResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListCustomQAResponse response) {
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
        public Builder body(ListCustomQAResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListCustomQAResponse build() {
            return new ListCustomQAResponse(this);
        } 

    } 

}
