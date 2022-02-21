// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyFlowJobResponse} extends {@link TeaModel}
 *
 * <p>ModifyFlowJobResponse</p>
 */
public class ModifyFlowJobResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyFlowJobResponseBody body;

    private ModifyFlowJobResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyFlowJobResponse create() {
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
    public ModifyFlowJobResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyFlowJobResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyFlowJobResponseBody body);

        @Override
        ModifyFlowJobResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyFlowJobResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyFlowJobResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyFlowJobResponse response) {
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
        public Builder body(ModifyFlowJobResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyFlowJobResponse build() {
            return new ModifyFlowJobResponse(this);
        } 

    } 

}
