// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyFlowProjectClusterSettingResponse} extends {@link TeaModel}
 *
 * <p>ModifyFlowProjectClusterSettingResponse</p>
 */
public class ModifyFlowProjectClusterSettingResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyFlowProjectClusterSettingResponseBody body;

    private ModifyFlowProjectClusterSettingResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyFlowProjectClusterSettingResponse create() {
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
    public ModifyFlowProjectClusterSettingResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyFlowProjectClusterSettingResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyFlowProjectClusterSettingResponseBody body);

        @Override
        ModifyFlowProjectClusterSettingResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyFlowProjectClusterSettingResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyFlowProjectClusterSettingResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyFlowProjectClusterSettingResponse response) {
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
        public Builder body(ModifyFlowProjectClusterSettingResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyFlowProjectClusterSettingResponse build() {
            return new ModifyFlowProjectClusterSettingResponse(this);
        } 

    } 

}
