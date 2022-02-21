// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPhoneTagsResponse} extends {@link TeaModel}
 *
 * <p>ListPhoneTagsResponse</p>
 */
public class ListPhoneTagsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListPhoneTagsResponseBody body;

    private ListPhoneTagsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListPhoneTagsResponse create() {
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
    public ListPhoneTagsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListPhoneTagsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListPhoneTagsResponseBody body);

        @Override
        ListPhoneTagsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListPhoneTagsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListPhoneTagsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListPhoneTagsResponse response) {
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
        public Builder body(ListPhoneTagsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListPhoneTagsResponse build() {
            return new ListPhoneTagsResponse(this);
        } 

    } 

}
