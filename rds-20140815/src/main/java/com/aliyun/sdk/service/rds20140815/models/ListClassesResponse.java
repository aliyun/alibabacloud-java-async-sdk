// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListClassesResponse} extends {@link TeaModel}
 *
 * <p>ListClassesResponse</p>
 */
public class ListClassesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListClassesResponseBody body;

    private ListClassesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListClassesResponse create() {
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
    public ListClassesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListClassesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListClassesResponseBody body);

        @Override
        ListClassesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListClassesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListClassesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListClassesResponse response) {
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
        public Builder body(ListClassesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListClassesResponse build() {
            return new ListClassesResponse(this);
        } 

    } 

}
