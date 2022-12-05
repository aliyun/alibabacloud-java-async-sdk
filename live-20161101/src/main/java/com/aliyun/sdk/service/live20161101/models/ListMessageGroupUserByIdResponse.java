// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListMessageGroupUserByIdResponse} extends {@link TeaModel}
 *
 * <p>ListMessageGroupUserByIdResponse</p>
 */
public class ListMessageGroupUserByIdResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListMessageGroupUserByIdResponseBody body;

    private ListMessageGroupUserByIdResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListMessageGroupUserByIdResponse create() {
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
    public ListMessageGroupUserByIdResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListMessageGroupUserByIdResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListMessageGroupUserByIdResponseBody body);

        @Override
        ListMessageGroupUserByIdResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListMessageGroupUserByIdResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListMessageGroupUserByIdResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListMessageGroupUserByIdResponse response) {
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
        public Builder body(ListMessageGroupUserByIdResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListMessageGroupUserByIdResponse build() {
            return new ListMessageGroupUserByIdResponse(this);
        } 

    } 

}
