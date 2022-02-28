// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyRiskSingleResultStatusResponse} extends {@link TeaModel}
 *
 * <p>ModifyRiskSingleResultStatusResponse</p>
 */
public class ModifyRiskSingleResultStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyRiskSingleResultStatusResponseBody body;

    private ModifyRiskSingleResultStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyRiskSingleResultStatusResponse create() {
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
    public ModifyRiskSingleResultStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyRiskSingleResultStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyRiskSingleResultStatusResponseBody body);

        @Override
        ModifyRiskSingleResultStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyRiskSingleResultStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyRiskSingleResultStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyRiskSingleResultStatusResponse response) {
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
        public Builder body(ModifyRiskSingleResultStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyRiskSingleResultStatusResponse build() {
            return new ModifyRiskSingleResultStatusResponse(this);
        } 

    } 

}
