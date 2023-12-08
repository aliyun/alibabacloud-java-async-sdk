// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListApplicationGroupsResponse} extends {@link TeaModel}
 *
 * <p>ListApplicationGroupsResponse</p>
 */
public class ListApplicationGroupsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListApplicationGroupsResponseBody body;

    private ListApplicationGroupsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListApplicationGroupsResponse create() {
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
    public ListApplicationGroupsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListApplicationGroupsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListApplicationGroupsResponseBody body);

        @Override
        ListApplicationGroupsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListApplicationGroupsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListApplicationGroupsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListApplicationGroupsResponse response) {
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
        public Builder body(ListApplicationGroupsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListApplicationGroupsResponse build() {
            return new ListApplicationGroupsResponse(this);
        } 

    } 

}
