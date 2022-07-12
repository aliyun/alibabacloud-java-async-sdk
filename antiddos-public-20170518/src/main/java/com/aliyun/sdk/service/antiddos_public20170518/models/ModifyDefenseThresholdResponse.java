// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.antiddos_public20170518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDefenseThresholdResponse} extends {@link TeaModel}
 *
 * <p>ModifyDefenseThresholdResponse</p>
 */
public class ModifyDefenseThresholdResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyDefenseThresholdResponseBody body;

    private ModifyDefenseThresholdResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyDefenseThresholdResponse create() {
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
    public ModifyDefenseThresholdResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyDefenseThresholdResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyDefenseThresholdResponseBody body);

        @Override
        ModifyDefenseThresholdResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyDefenseThresholdResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyDefenseThresholdResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyDefenseThresholdResponse response) {
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
        public Builder body(ModifyDefenseThresholdResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyDefenseThresholdResponse build() {
            return new ModifyDefenseThresholdResponse(this);
        } 

    } 

}
