// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListMessageGroupUserResponse} extends {@link TeaModel}
 *
 * <p>ListMessageGroupUserResponse</p>
 */
public class ListMessageGroupUserResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListMessageGroupUserResponseBody body;

    private ListMessageGroupUserResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListMessageGroupUserResponse create() {
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
    public ListMessageGroupUserResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListMessageGroupUserResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListMessageGroupUserResponseBody body);

        @Override
        ListMessageGroupUserResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListMessageGroupUserResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListMessageGroupUserResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListMessageGroupUserResponse response) {
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
        public Builder body(ListMessageGroupUserResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListMessageGroupUserResponse build() {
            return new ListMessageGroupUserResponse(this);
        } 

    } 

}
