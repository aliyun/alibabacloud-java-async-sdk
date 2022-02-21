// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDeprecatedTemplatesResponse} extends {@link TeaModel}
 *
 * <p>ListDeprecatedTemplatesResponse</p>
 */
public class ListDeprecatedTemplatesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListDeprecatedTemplatesResponseBody body;

    private ListDeprecatedTemplatesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListDeprecatedTemplatesResponse create() {
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
    public ListDeprecatedTemplatesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListDeprecatedTemplatesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListDeprecatedTemplatesResponseBody body);

        @Override
        ListDeprecatedTemplatesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListDeprecatedTemplatesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListDeprecatedTemplatesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListDeprecatedTemplatesResponse response) {
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
        public Builder body(ListDeprecatedTemplatesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListDeprecatedTemplatesResponse build() {
            return new ListDeprecatedTemplatesResponse(this);
        } 

    } 

}
