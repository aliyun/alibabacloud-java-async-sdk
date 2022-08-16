// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListHoneypotResponse} extends {@link TeaModel}
 *
 * <p>ListHoneypotResponse</p>
 */
public class ListHoneypotResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListHoneypotResponseBody body;

    private ListHoneypotResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListHoneypotResponse create() {
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
    public ListHoneypotResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListHoneypotResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListHoneypotResponseBody body);

        @Override
        ListHoneypotResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListHoneypotResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListHoneypotResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListHoneypotResponse response) {
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
        public Builder body(ListHoneypotResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListHoneypotResponse build() {
            return new ListHoneypotResponse(this);
        } 

    } 

}
