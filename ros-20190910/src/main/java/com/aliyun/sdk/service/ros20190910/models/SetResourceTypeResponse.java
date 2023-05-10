// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetResourceTypeResponse} extends {@link TeaModel}
 *
 * <p>SetResourceTypeResponse</p>
 */
public class SetResourceTypeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetResourceTypeResponseBody body;

    private SetResourceTypeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetResourceTypeResponse create() {
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
    public SetResourceTypeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetResourceTypeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetResourceTypeResponseBody body);

        @Override
        SetResourceTypeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetResourceTypeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetResourceTypeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetResourceTypeResponse response) {
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
        public Builder body(SetResourceTypeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetResourceTypeResponse build() {
            return new SetResourceTypeResponse(this);
        } 

    } 

}
