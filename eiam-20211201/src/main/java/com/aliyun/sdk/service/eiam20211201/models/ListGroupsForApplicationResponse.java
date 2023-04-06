// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListGroupsForApplicationResponse} extends {@link TeaModel}
 *
 * <p>ListGroupsForApplicationResponse</p>
 */
public class ListGroupsForApplicationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListGroupsForApplicationResponseBody body;

    private ListGroupsForApplicationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListGroupsForApplicationResponse create() {
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
    public ListGroupsForApplicationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListGroupsForApplicationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListGroupsForApplicationResponseBody body);

        @Override
        ListGroupsForApplicationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListGroupsForApplicationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListGroupsForApplicationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListGroupsForApplicationResponse response) {
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
        public Builder body(ListGroupsForApplicationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListGroupsForApplicationResponse build() {
            return new ListGroupsForApplicationResponse(this);
        } 

    } 

}
