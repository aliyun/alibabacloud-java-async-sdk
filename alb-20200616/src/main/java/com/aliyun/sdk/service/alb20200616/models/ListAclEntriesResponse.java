// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAclEntriesResponse} extends {@link TeaModel}
 *
 * <p>ListAclEntriesResponse</p>
 */
public class ListAclEntriesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListAclEntriesResponseBody body;

    private ListAclEntriesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListAclEntriesResponse create() {
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
    public ListAclEntriesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListAclEntriesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListAclEntriesResponseBody body);

        @Override
        ListAclEntriesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListAclEntriesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListAclEntriesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListAclEntriesResponse response) {
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
        public Builder body(ListAclEntriesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListAclEntriesResponse build() {
            return new ListAclEntriesResponse(this);
        } 

    } 

}
