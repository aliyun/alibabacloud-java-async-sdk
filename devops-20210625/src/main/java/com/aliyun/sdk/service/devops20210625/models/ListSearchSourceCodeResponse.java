// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSearchSourceCodeResponse} extends {@link TeaModel}
 *
 * <p>ListSearchSourceCodeResponse</p>
 */
public class ListSearchSourceCodeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListSearchSourceCodeResponseBody body;

    private ListSearchSourceCodeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListSearchSourceCodeResponse create() {
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
    public ListSearchSourceCodeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListSearchSourceCodeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListSearchSourceCodeResponseBody body);

        @Override
        ListSearchSourceCodeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListSearchSourceCodeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListSearchSourceCodeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListSearchSourceCodeResponse response) {
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
        public Builder body(ListSearchSourceCodeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListSearchSourceCodeResponse build() {
            return new ListSearchSourceCodeResponse(this);
        } 

    } 

}
