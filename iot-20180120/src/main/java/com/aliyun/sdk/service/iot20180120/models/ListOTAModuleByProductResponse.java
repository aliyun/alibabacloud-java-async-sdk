// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListOTAModuleByProductResponse} extends {@link TeaModel}
 *
 * <p>ListOTAModuleByProductResponse</p>
 */
public class ListOTAModuleByProductResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListOTAModuleByProductResponseBody body;

    private ListOTAModuleByProductResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListOTAModuleByProductResponse create() {
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
    public ListOTAModuleByProductResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListOTAModuleByProductResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListOTAModuleByProductResponseBody body);

        @Override
        ListOTAModuleByProductResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListOTAModuleByProductResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListOTAModuleByProductResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListOTAModuleByProductResponse response) {
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
        public Builder body(ListOTAModuleByProductResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListOTAModuleByProductResponse build() {
            return new ListOTAModuleByProductResponse(this);
        } 

    } 

}
