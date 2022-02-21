// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.batchcompute20151111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRegionsResponse} extends {@link TeaModel}
 *
 * <p>ListRegionsResponse</p>
 */
public class ListRegionsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    private ListRegionsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
    }

    public static ListRegionsResponse create() {
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

    public interface Builder extends Response.Builder<ListRegionsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        @Override
        ListRegionsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListRegionsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListRegionsResponse response) {
            super(response);
            this.headers = response.headers;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map < String, String > headers) {
            this.headers = headers;
            return this;
        }

        @Override
        public ListRegionsResponse build() {
            return new ListRegionsResponse(this);
        } 

    } 

}
