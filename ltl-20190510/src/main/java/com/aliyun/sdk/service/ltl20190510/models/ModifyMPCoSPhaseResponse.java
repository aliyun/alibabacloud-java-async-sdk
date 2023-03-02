// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ltl20190510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyMPCoSPhaseResponse} extends {@link TeaModel}
 *
 * <p>ModifyMPCoSPhaseResponse</p>
 */
public class ModifyMPCoSPhaseResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyMPCoSPhaseResponseBody body;

    private ModifyMPCoSPhaseResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyMPCoSPhaseResponse create() {
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
    public ModifyMPCoSPhaseResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyMPCoSPhaseResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyMPCoSPhaseResponseBody body);

        @Override
        ModifyMPCoSPhaseResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyMPCoSPhaseResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyMPCoSPhaseResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyMPCoSPhaseResponse response) {
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
        public Builder body(ModifyMPCoSPhaseResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyMPCoSPhaseResponse build() {
            return new ModifyMPCoSPhaseResponse(this);
        } 

    } 

}
