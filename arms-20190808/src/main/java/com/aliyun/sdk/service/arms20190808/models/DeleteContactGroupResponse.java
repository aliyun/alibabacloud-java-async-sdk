// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteContactGroupResponse} extends {@link TeaModel}
 *
 * <p>DeleteContactGroupResponse</p>
 */
public class DeleteContactGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteContactGroupResponseBody body;

    private DeleteContactGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteContactGroupResponse create() {
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
    public DeleteContactGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteContactGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteContactGroupResponseBody body);

        @Override
        DeleteContactGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteContactGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteContactGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteContactGroupResponse response) {
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
        public Builder body(DeleteContactGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteContactGroupResponse build() {
            return new DeleteContactGroupResponse(this);
        } 

    } 

}
