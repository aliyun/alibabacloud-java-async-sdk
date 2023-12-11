// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SuspendInstanceResponse} extends {@link TeaModel}
 *
 * <p>SuspendInstanceResponse</p>
 */
public class SuspendInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SuspendInstanceResponseBody body;

    private SuspendInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SuspendInstanceResponse create() {
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
    public SuspendInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SuspendInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SuspendInstanceResponseBody body);

        @Override
        SuspendInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SuspendInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SuspendInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SuspendInstanceResponse response) {
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
        public Builder body(SuspendInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SuspendInstanceResponse build() {
            return new SuspendInstanceResponse(this);
        } 

    } 

}
