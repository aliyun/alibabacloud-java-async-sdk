// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReleasePrePaidInstanceResponse} extends {@link TeaModel}
 *
 * <p>ReleasePrePaidInstanceResponse</p>
 */
public class ReleasePrePaidInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ReleasePrePaidInstanceResponseBody body;

    private ReleasePrePaidInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ReleasePrePaidInstanceResponse create() {
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
    public ReleasePrePaidInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ReleasePrePaidInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ReleasePrePaidInstanceResponseBody body);

        @Override
        ReleasePrePaidInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ReleasePrePaidInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ReleasePrePaidInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ReleasePrePaidInstanceResponse response) {
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
        public Builder body(ReleasePrePaidInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ReleasePrePaidInstanceResponse build() {
            return new ReleasePrePaidInstanceResponse(this);
        } 

    } 

}
