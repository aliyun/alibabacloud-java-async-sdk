// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20161111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAncestorsResponse} extends {@link TeaModel}
 *
 * <p>ListAncestorsResponse</p>
 */
public class ListAncestorsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListAncestorsResponseBody body;

    private ListAncestorsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListAncestorsResponse create() {
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
    public ListAncestorsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListAncestorsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListAncestorsResponseBody body);

        @Override
        ListAncestorsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListAncestorsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListAncestorsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListAncestorsResponse response) {
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
        public Builder body(ListAncestorsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListAncestorsResponse build() {
            return new ListAncestorsResponse(this);
        } 

    } 

}
