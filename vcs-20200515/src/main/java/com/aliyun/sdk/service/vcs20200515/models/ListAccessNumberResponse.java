// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAccessNumberResponse} extends {@link TeaModel}
 *
 * <p>ListAccessNumberResponse</p>
 */
public class ListAccessNumberResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListAccessNumberResponseBody body;

    private ListAccessNumberResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListAccessNumberResponse create() {
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
    public ListAccessNumberResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListAccessNumberResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListAccessNumberResponseBody body);

        @Override
        ListAccessNumberResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListAccessNumberResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListAccessNumberResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListAccessNumberResponse response) {
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
        public Builder body(ListAccessNumberResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListAccessNumberResponse build() {
            return new ListAccessNumberResponse(this);
        } 

    } 

}
