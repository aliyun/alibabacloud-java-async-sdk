// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListInstancePatchesResponse} extends {@link TeaModel}
 *
 * <p>ListInstancePatchesResponse</p>
 */
public class ListInstancePatchesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListInstancePatchesResponseBody body;

    private ListInstancePatchesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListInstancePatchesResponse create() {
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
    public ListInstancePatchesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListInstancePatchesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListInstancePatchesResponseBody body);

        @Override
        ListInstancePatchesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListInstancePatchesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListInstancePatchesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListInstancePatchesResponse response) {
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
        public Builder body(ListInstancePatchesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListInstancePatchesResponse build() {
            return new ListInstancePatchesResponse(this);
        } 

    } 

}
