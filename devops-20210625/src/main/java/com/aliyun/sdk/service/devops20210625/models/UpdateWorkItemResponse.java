// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateWorkItemResponse} extends {@link TeaModel}
 *
 * <p>UpdateWorkItemResponse</p>
 */
public class UpdateWorkItemResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateWorkItemResponseBody body;

    private UpdateWorkItemResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateWorkItemResponse create() {
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
    public UpdateWorkItemResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateWorkItemResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateWorkItemResponseBody body);

        @Override
        UpdateWorkItemResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateWorkItemResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateWorkItemResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateWorkItemResponse response) {
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
        public Builder body(UpdateWorkItemResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateWorkItemResponse build() {
            return new UpdateWorkItemResponse(this);
        } 

    } 

}
