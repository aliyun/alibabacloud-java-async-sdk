// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFileTypeResponse} extends {@link TeaModel}
 *
 * <p>ListFileTypeResponse</p>
 */
public class ListFileTypeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListFileTypeResponseBody body;

    private ListFileTypeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListFileTypeResponse create() {
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
    public ListFileTypeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListFileTypeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListFileTypeResponseBody body);

        @Override
        ListFileTypeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListFileTypeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListFileTypeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListFileTypeResponse response) {
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
        public Builder body(ListFileTypeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListFileTypeResponse build() {
            return new ListFileTypeResponse(this);
        } 

    } 

}
