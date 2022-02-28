// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTemplatesResponse} extends {@link TeaModel}
 *
 * <p>ListTemplatesResponse</p>
 */
public class ListTemplatesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListTemplatesResponseBody body;

    private ListTemplatesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListTemplatesResponse create() {
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
    public ListTemplatesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListTemplatesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListTemplatesResponseBody body);

        @Override
        ListTemplatesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListTemplatesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListTemplatesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListTemplatesResponse response) {
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
        public Builder body(ListTemplatesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListTemplatesResponse build() {
            return new ListTemplatesResponse(this);
        } 

    } 

}
