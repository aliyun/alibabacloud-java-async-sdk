// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReInitDiskResponse} extends {@link TeaModel}
 *
 * <p>ReInitDiskResponse</p>
 */
public class ReInitDiskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ReInitDiskResponseBody body;

    private ReInitDiskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ReInitDiskResponse create() {
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
    public ReInitDiskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ReInitDiskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ReInitDiskResponseBody body);

        @Override
        ReInitDiskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ReInitDiskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ReInitDiskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ReInitDiskResponse response) {
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
        public Builder body(ReInitDiskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ReInitDiskResponse build() {
            return new ReInitDiskResponse(this);
        } 

    } 

}
