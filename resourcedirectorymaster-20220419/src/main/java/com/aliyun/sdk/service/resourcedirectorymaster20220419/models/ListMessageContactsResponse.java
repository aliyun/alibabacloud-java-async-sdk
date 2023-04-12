// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcedirectorymaster20220419.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListMessageContactsResponse} extends {@link TeaModel}
 *
 * <p>ListMessageContactsResponse</p>
 */
public class ListMessageContactsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListMessageContactsResponseBody body;

    private ListMessageContactsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListMessageContactsResponse create() {
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
    public ListMessageContactsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListMessageContactsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListMessageContactsResponseBody body);

        @Override
        ListMessageContactsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListMessageContactsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListMessageContactsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListMessageContactsResponse response) {
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
        public Builder body(ListMessageContactsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListMessageContactsResponse build() {
            return new ListMessageContactsResponse(this);
        } 

    } 

}
