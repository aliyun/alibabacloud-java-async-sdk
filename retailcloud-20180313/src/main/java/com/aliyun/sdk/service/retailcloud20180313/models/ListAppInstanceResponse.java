// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAppInstanceResponse} extends {@link TeaModel}
 *
 * <p>ListAppInstanceResponse</p>
 */
public class ListAppInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListAppInstanceResponseBody body;

    private ListAppInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListAppInstanceResponse create() {
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
    public ListAppInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListAppInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListAppInstanceResponseBody body);

        @Override
        ListAppInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListAppInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListAppInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListAppInstanceResponse response) {
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
        public Builder body(ListAppInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListAppInstanceResponse build() {
            return new ListAppInstanceResponse(this);
        } 

    } 

}
