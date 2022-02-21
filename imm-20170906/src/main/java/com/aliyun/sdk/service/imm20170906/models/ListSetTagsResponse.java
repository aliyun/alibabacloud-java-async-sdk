// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20170906.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSetTagsResponse} extends {@link TeaModel}
 *
 * <p>ListSetTagsResponse</p>
 */
public class ListSetTagsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListSetTagsResponseBody body;

    private ListSetTagsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListSetTagsResponse create() {
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
    public ListSetTagsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListSetTagsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListSetTagsResponseBody body);

        @Override
        ListSetTagsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListSetTagsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListSetTagsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListSetTagsResponse response) {
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
        public Builder body(ListSetTagsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListSetTagsResponse build() {
            return new ListSetTagsResponse(this);
        } 

    } 

}
