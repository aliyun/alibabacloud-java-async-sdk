// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPolicesForPrivateAccessApplicationResponse} extends {@link TeaModel}
 *
 * <p>ListPolicesForPrivateAccessApplicationResponse</p>
 */
public class ListPolicesForPrivateAccessApplicationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListPolicesForPrivateAccessApplicationResponseBody body;

    private ListPolicesForPrivateAccessApplicationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListPolicesForPrivateAccessApplicationResponse create() {
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
    public ListPolicesForPrivateAccessApplicationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListPolicesForPrivateAccessApplicationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListPolicesForPrivateAccessApplicationResponseBody body);

        @Override
        ListPolicesForPrivateAccessApplicationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListPolicesForPrivateAccessApplicationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListPolicesForPrivateAccessApplicationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListPolicesForPrivateAccessApplicationResponse response) {
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
        public Builder body(ListPolicesForPrivateAccessApplicationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListPolicesForPrivateAccessApplicationResponse build() {
            return new ListPolicesForPrivateAccessApplicationResponse(this);
        } 

    } 

}
