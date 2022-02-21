// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveDrdsInstanceResponse} extends {@link TeaModel}
 *
 * <p>RemoveDrdsInstanceResponse</p>
 */
public class RemoveDrdsInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RemoveDrdsInstanceResponseBody body;

    private RemoveDrdsInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RemoveDrdsInstanceResponse create() {
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
    public RemoveDrdsInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RemoveDrdsInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RemoveDrdsInstanceResponseBody body);

        @Override
        RemoveDrdsInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RemoveDrdsInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RemoveDrdsInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RemoveDrdsInstanceResponse response) {
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
        public Builder body(RemoveDrdsInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RemoveDrdsInstanceResponse build() {
            return new RemoveDrdsInstanceResponse(this);
        } 

    } 

}
