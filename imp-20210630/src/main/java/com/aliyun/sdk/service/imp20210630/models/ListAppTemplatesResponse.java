// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAppTemplatesResponse} extends {@link TeaModel}
 *
 * <p>ListAppTemplatesResponse</p>
 */
public class ListAppTemplatesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListAppTemplatesResponseBody body;

    private ListAppTemplatesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListAppTemplatesResponse create() {
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
    public ListAppTemplatesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListAppTemplatesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListAppTemplatesResponseBody body);

        @Override
        ListAppTemplatesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListAppTemplatesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListAppTemplatesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListAppTemplatesResponse response) {
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
        public Builder body(ListAppTemplatesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListAppTemplatesResponse build() {
            return new ListAppTemplatesResponse(this);
        } 

    } 

}
