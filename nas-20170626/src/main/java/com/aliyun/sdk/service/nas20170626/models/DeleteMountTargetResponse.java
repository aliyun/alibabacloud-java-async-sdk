// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteMountTargetResponse} extends {@link TeaModel}
 *
 * <p>DeleteMountTargetResponse</p>
 */
public class DeleteMountTargetResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteMountTargetResponseBody body;

    private DeleteMountTargetResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteMountTargetResponse create() {
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
    public DeleteMountTargetResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteMountTargetResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteMountTargetResponseBody body);

        @Override
        DeleteMountTargetResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteMountTargetResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteMountTargetResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteMountTargetResponse response) {
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
        public Builder body(DeleteMountTargetResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteMountTargetResponse build() {
            return new DeleteMountTargetResponse(this);
        } 

    } 

}
