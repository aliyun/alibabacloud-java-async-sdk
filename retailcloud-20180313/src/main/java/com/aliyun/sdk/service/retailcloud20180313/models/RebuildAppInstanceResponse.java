// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RebuildAppInstanceResponse} extends {@link TeaModel}
 *
 * <p>RebuildAppInstanceResponse</p>
 */
public class RebuildAppInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RebuildAppInstanceResponseBody body;

    private RebuildAppInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RebuildAppInstanceResponse create() {
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
    public RebuildAppInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RebuildAppInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RebuildAppInstanceResponseBody body);

        @Override
        RebuildAppInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RebuildAppInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RebuildAppInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RebuildAppInstanceResponse response) {
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
        public Builder body(RebuildAppInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RebuildAppInstanceResponse build() {
            return new RebuildAppInstanceResponse(this);
        } 

    } 

}
