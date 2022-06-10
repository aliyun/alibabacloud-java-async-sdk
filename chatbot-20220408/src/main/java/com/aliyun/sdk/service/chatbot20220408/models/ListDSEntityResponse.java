// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDSEntityResponse} extends {@link TeaModel}
 *
 * <p>ListDSEntityResponse</p>
 */
public class ListDSEntityResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListDSEntityResponseBody body;

    private ListDSEntityResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListDSEntityResponse create() {
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
    public ListDSEntityResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListDSEntityResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListDSEntityResponseBody body);

        @Override
        ListDSEntityResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListDSEntityResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListDSEntityResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListDSEntityResponse response) {
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
        public Builder body(ListDSEntityResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListDSEntityResponse build() {
            return new ListDSEntityResponse(this);
        } 

    } 

}
