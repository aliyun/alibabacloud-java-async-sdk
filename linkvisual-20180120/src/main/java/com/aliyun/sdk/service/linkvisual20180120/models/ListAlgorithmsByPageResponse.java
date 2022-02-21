// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAlgorithmsByPageResponse} extends {@link TeaModel}
 *
 * <p>ListAlgorithmsByPageResponse</p>
 */
public class ListAlgorithmsByPageResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListAlgorithmsByPageResponseBody body;

    private ListAlgorithmsByPageResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListAlgorithmsByPageResponse create() {
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
    public ListAlgorithmsByPageResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListAlgorithmsByPageResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListAlgorithmsByPageResponseBody body);

        @Override
        ListAlgorithmsByPageResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListAlgorithmsByPageResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListAlgorithmsByPageResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListAlgorithmsByPageResponse response) {
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
        public Builder body(ListAlgorithmsByPageResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListAlgorithmsByPageResponse build() {
            return new ListAlgorithmsByPageResponse(this);
        } 

    } 

}
