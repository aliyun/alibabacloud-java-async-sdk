// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateStackInstancesResponse} extends {@link TeaModel}
 *
 * <p>UpdateStackInstancesResponse</p>
 */
public class UpdateStackInstancesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateStackInstancesResponseBody body;

    private UpdateStackInstancesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateStackInstancesResponse create() {
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
    public UpdateStackInstancesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateStackInstancesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateStackInstancesResponseBody body);

        @Override
        UpdateStackInstancesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateStackInstancesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateStackInstancesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateStackInstancesResponse response) {
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
        public Builder body(UpdateStackInstancesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateStackInstancesResponse build() {
            return new UpdateStackInstancesResponse(this);
        } 

    } 

}
