// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ltl20190510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyMPCoSPhaseGroupResponse} extends {@link TeaModel}
 *
 * <p>ModifyMPCoSPhaseGroupResponse</p>
 */
public class ModifyMPCoSPhaseGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyMPCoSPhaseGroupResponseBody body;

    private ModifyMPCoSPhaseGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyMPCoSPhaseGroupResponse create() {
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
    public ModifyMPCoSPhaseGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyMPCoSPhaseGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyMPCoSPhaseGroupResponseBody body);

        @Override
        ModifyMPCoSPhaseGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyMPCoSPhaseGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyMPCoSPhaseGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyMPCoSPhaseGroupResponse response) {
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
        public Builder body(ModifyMPCoSPhaseGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyMPCoSPhaseGroupResponse build() {
            return new ModifyMPCoSPhaseGroupResponse(this);
        } 

    } 

}
