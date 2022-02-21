// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResetNASDefaultMountTargetResponse} extends {@link TeaModel}
 *
 * <p>ResetNASDefaultMountTargetResponse</p>
 */
public class ResetNASDefaultMountTargetResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ResetNASDefaultMountTargetResponseBody body;

    private ResetNASDefaultMountTargetResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ResetNASDefaultMountTargetResponse create() {
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
    public ResetNASDefaultMountTargetResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ResetNASDefaultMountTargetResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ResetNASDefaultMountTargetResponseBody body);

        @Override
        ResetNASDefaultMountTargetResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ResetNASDefaultMountTargetResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ResetNASDefaultMountTargetResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ResetNASDefaultMountTargetResponse response) {
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
        public Builder body(ResetNASDefaultMountTargetResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ResetNASDefaultMountTargetResponse build() {
            return new ResetNASDefaultMountTargetResponse(this);
        } 

    } 

}
