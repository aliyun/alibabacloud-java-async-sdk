// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddi20200617.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link KillFlowJobResponse} extends {@link TeaModel}
 *
 * <p>KillFlowJobResponse</p>
 */
public class KillFlowJobResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private KillFlowJobResponseBody body;

    private KillFlowJobResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static KillFlowJobResponse create() {
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
    public KillFlowJobResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<KillFlowJobResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(KillFlowJobResponseBody body);

        @Override
        KillFlowJobResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<KillFlowJobResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private KillFlowJobResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(KillFlowJobResponse response) {
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
        public Builder body(KillFlowJobResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public KillFlowJobResponse build() {
            return new KillFlowJobResponse(this);
        } 

    } 

}
