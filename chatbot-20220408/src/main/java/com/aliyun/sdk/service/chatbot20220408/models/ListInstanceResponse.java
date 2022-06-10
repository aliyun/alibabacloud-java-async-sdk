// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListInstanceResponse} extends {@link TeaModel}
 *
 * <p>ListInstanceResponse</p>
 */
public class ListInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListInstanceResponseBody body;

    private ListInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListInstanceResponse create() {
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
    public ListInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListInstanceResponseBody body);

        @Override
        ListInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListInstanceResponse response) {
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
        public Builder body(ListInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListInstanceResponse build() {
            return new ListInstanceResponse(this);
        } 

    } 

}
