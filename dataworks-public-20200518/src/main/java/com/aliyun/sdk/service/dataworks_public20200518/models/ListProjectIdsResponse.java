// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListProjectIdsResponse} extends {@link TeaModel}
 *
 * <p>ListProjectIdsResponse</p>
 */
public class ListProjectIdsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListProjectIdsResponseBody body;

    private ListProjectIdsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListProjectIdsResponse create() {
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
    public ListProjectIdsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListProjectIdsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListProjectIdsResponseBody body);

        @Override
        ListProjectIdsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListProjectIdsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListProjectIdsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListProjectIdsResponse response) {
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
        public Builder body(ListProjectIdsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListProjectIdsResponse build() {
            return new ListProjectIdsResponse(this);
        } 

    } 

}
