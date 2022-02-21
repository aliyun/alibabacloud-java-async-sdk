// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20170906.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFaceGroupsResponse} extends {@link TeaModel}
 *
 * <p>ListFaceGroupsResponse</p>
 */
public class ListFaceGroupsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListFaceGroupsResponseBody body;

    private ListFaceGroupsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListFaceGroupsResponse create() {
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
    public ListFaceGroupsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListFaceGroupsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListFaceGroupsResponseBody body);

        @Override
        ListFaceGroupsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListFaceGroupsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListFaceGroupsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListFaceGroupsResponse response) {
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
        public Builder body(ListFaceGroupsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListFaceGroupsResponse build() {
            return new ListFaceGroupsResponse(this);
        } 

    } 

}
