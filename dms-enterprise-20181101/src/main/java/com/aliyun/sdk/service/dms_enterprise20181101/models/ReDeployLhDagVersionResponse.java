// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReDeployLhDagVersionResponse} extends {@link TeaModel}
 *
 * <p>ReDeployLhDagVersionResponse</p>
 */
public class ReDeployLhDagVersionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ReDeployLhDagVersionResponseBody body;

    private ReDeployLhDagVersionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ReDeployLhDagVersionResponse create() {
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
    public ReDeployLhDagVersionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ReDeployLhDagVersionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ReDeployLhDagVersionResponseBody body);

        @Override
        ReDeployLhDagVersionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ReDeployLhDagVersionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ReDeployLhDagVersionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ReDeployLhDagVersionResponse response) {
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
        public Builder body(ReDeployLhDagVersionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ReDeployLhDagVersionResponse build() {
            return new ReDeployLhDagVersionResponse(this);
        } 

    } 

}
