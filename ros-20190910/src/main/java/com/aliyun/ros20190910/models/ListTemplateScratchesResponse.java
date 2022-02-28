// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTemplateScratchesResponse} extends {@link TeaModel}
 *
 * <p>ListTemplateScratchesResponse</p>
 */
public class ListTemplateScratchesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListTemplateScratchesResponseBody body;

    private ListTemplateScratchesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListTemplateScratchesResponse create() {
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
    public ListTemplateScratchesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListTemplateScratchesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListTemplateScratchesResponseBody body);

        @Override
        ListTemplateScratchesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListTemplateScratchesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListTemplateScratchesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListTemplateScratchesResponse response) {
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
        public Builder body(ListTemplateScratchesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListTemplateScratchesResponse build() {
            return new ListTemplateScratchesResponse(this);
        } 

    } 

}
