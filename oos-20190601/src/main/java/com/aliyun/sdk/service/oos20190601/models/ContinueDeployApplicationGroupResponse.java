// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ContinueDeployApplicationGroupResponse} extends {@link TeaModel}
 *
 * <p>ContinueDeployApplicationGroupResponse</p>
 */
public class ContinueDeployApplicationGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ContinueDeployApplicationGroupResponseBody body;

    private ContinueDeployApplicationGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ContinueDeployApplicationGroupResponse create() {
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
    public ContinueDeployApplicationGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ContinueDeployApplicationGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ContinueDeployApplicationGroupResponseBody body);

        @Override
        ContinueDeployApplicationGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ContinueDeployApplicationGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ContinueDeployApplicationGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ContinueDeployApplicationGroupResponse response) {
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
        public Builder body(ContinueDeployApplicationGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ContinueDeployApplicationGroupResponse build() {
            return new ContinueDeployApplicationGroupResponse(this);
        } 

    } 

}
