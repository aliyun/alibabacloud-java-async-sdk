// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListProjectWorkitemTypesResponse} extends {@link TeaModel}
 *
 * <p>ListProjectWorkitemTypesResponse</p>
 */
public class ListProjectWorkitemTypesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListProjectWorkitemTypesResponseBody body;

    private ListProjectWorkitemTypesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListProjectWorkitemTypesResponse create() {
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
    public ListProjectWorkitemTypesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListProjectWorkitemTypesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListProjectWorkitemTypesResponseBody body);

        @Override
        ListProjectWorkitemTypesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListProjectWorkitemTypesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListProjectWorkitemTypesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListProjectWorkitemTypesResponse response) {
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
        public Builder body(ListProjectWorkitemTypesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListProjectWorkitemTypesResponse build() {
            return new ListProjectWorkitemTypesResponse(this);
        } 

    } 

}
