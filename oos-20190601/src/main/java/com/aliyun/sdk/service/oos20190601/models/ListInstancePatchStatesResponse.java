// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListInstancePatchStatesResponse} extends {@link TeaModel}
 *
 * <p>ListInstancePatchStatesResponse</p>
 */
public class ListInstancePatchStatesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListInstancePatchStatesResponseBody body;

    private ListInstancePatchStatesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListInstancePatchStatesResponse create() {
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
    public ListInstancePatchStatesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListInstancePatchStatesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListInstancePatchStatesResponseBody body);

        @Override
        ListInstancePatchStatesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListInstancePatchStatesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListInstancePatchStatesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListInstancePatchStatesResponse response) {
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
        public Builder body(ListInstancePatchStatesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListInstancePatchStatesResponse build() {
            return new ListInstancePatchStatesResponse(this);
        } 

    } 

}
