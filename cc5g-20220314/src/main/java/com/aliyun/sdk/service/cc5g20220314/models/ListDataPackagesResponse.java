// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cc5g20220314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDataPackagesResponse} extends {@link TeaModel}
 *
 * <p>ListDataPackagesResponse</p>
 */
public class ListDataPackagesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListDataPackagesResponseBody body;

    private ListDataPackagesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListDataPackagesResponse create() {
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
    public ListDataPackagesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListDataPackagesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListDataPackagesResponseBody body);

        @Override
        ListDataPackagesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListDataPackagesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListDataPackagesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListDataPackagesResponse response) {
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
        public Builder body(ListDataPackagesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListDataPackagesResponse build() {
            return new ListDataPackagesResponse(this);
        } 

    } 

}
