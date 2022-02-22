// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateInlinePolicyForAccessConfigurationResponse} extends {@link TeaModel}
 *
 * <p>UpdateInlinePolicyForAccessConfigurationResponse</p>
 */
public class UpdateInlinePolicyForAccessConfigurationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateInlinePolicyForAccessConfigurationResponseBody body;

    private UpdateInlinePolicyForAccessConfigurationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateInlinePolicyForAccessConfigurationResponse create() {
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
    public UpdateInlinePolicyForAccessConfigurationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateInlinePolicyForAccessConfigurationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateInlinePolicyForAccessConfigurationResponseBody body);

        @Override
        UpdateInlinePolicyForAccessConfigurationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateInlinePolicyForAccessConfigurationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateInlinePolicyForAccessConfigurationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateInlinePolicyForAccessConfigurationResponse response) {
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
        public Builder body(UpdateInlinePolicyForAccessConfigurationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateInlinePolicyForAccessConfigurationResponse build() {
            return new UpdateInlinePolicyForAccessConfigurationResponse(this);
        } 

    } 

}
