// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20161111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListParentsResponse} extends {@link TeaModel}
 *
 * <p>ListParentsResponse</p>
 */
public class ListParentsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListParentsResponseBody body;

    private ListParentsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListParentsResponse create() {
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
    public ListParentsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListParentsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListParentsResponseBody body);

        @Override
        ListParentsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListParentsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListParentsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListParentsResponse response) {
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
        public Builder body(ListParentsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListParentsResponse build() {
            return new ListParentsResponse(this);
        } 

    } 

}
