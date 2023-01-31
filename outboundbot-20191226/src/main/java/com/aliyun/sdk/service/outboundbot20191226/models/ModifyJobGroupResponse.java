// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyJobGroupResponse} extends {@link TeaModel}
 *
 * <p>ModifyJobGroupResponse</p>
 */
public class ModifyJobGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyJobGroupResponseBody body;

    private ModifyJobGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyJobGroupResponse create() {
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
    public ModifyJobGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyJobGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyJobGroupResponseBody body);

        @Override
        ModifyJobGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyJobGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyJobGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyJobGroupResponse response) {
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
        public Builder body(ModifyJobGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyJobGroupResponse build() {
            return new ModifyJobGroupResponse(this);
        } 

    } 

}
