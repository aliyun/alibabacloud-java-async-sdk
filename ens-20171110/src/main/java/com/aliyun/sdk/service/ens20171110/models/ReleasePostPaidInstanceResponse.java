// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReleasePostPaidInstanceResponse} extends {@link TeaModel}
 *
 * <p>ReleasePostPaidInstanceResponse</p>
 */
public class ReleasePostPaidInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ReleasePostPaidInstanceResponseBody body;

    private ReleasePostPaidInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ReleasePostPaidInstanceResponse create() {
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
    public ReleasePostPaidInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ReleasePostPaidInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ReleasePostPaidInstanceResponseBody body);

        @Override
        ReleasePostPaidInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ReleasePostPaidInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ReleasePostPaidInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ReleasePostPaidInstanceResponse response) {
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
        public Builder body(ReleasePostPaidInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ReleasePostPaidInstanceResponse build() {
            return new ReleasePostPaidInstanceResponse(this);
        } 

    } 

}
