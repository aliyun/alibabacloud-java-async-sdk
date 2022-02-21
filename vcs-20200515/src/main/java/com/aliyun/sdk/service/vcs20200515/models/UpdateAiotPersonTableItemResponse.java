// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAiotPersonTableItemResponse} extends {@link TeaModel}
 *
 * <p>UpdateAiotPersonTableItemResponse</p>
 */
public class UpdateAiotPersonTableItemResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateAiotPersonTableItemResponseBody body;

    private UpdateAiotPersonTableItemResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateAiotPersonTableItemResponse create() {
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
    public UpdateAiotPersonTableItemResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateAiotPersonTableItemResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateAiotPersonTableItemResponseBody body);

        @Override
        UpdateAiotPersonTableItemResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateAiotPersonTableItemResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateAiotPersonTableItemResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateAiotPersonTableItemResponse response) {
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
        public Builder body(UpdateAiotPersonTableItemResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateAiotPersonTableItemResponse build() {
            return new UpdateAiotPersonTableItemResponse(this);
        } 

    } 

}
