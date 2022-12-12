// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ApplyLensServiceResponse} extends {@link TeaModel}
 *
 * <p>ApplyLensServiceResponse</p>
 */
public class ApplyLensServiceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ApplyLensServiceResponseBody body;

    private ApplyLensServiceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ApplyLensServiceResponse create() {
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
    public ApplyLensServiceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ApplyLensServiceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ApplyLensServiceResponseBody body);

        @Override
        ApplyLensServiceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ApplyLensServiceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ApplyLensServiceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ApplyLensServiceResponse response) {
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
        public Builder body(ApplyLensServiceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ApplyLensServiceResponse build() {
            return new ApplyLensServiceResponse(this);
        } 

    } 

}
