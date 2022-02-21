// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.onsmqtt20200420.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListGroupIdResponse} extends {@link TeaModel}
 *
 * <p>ListGroupIdResponse</p>
 */
public class ListGroupIdResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListGroupIdResponseBody body;

    private ListGroupIdResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListGroupIdResponse create() {
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
    public ListGroupIdResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListGroupIdResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListGroupIdResponseBody body);

        @Override
        ListGroupIdResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListGroupIdResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListGroupIdResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListGroupIdResponse response) {
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
        public Builder body(ListGroupIdResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListGroupIdResponse build() {
            return new ListGroupIdResponse(this);
        } 

    } 

}
