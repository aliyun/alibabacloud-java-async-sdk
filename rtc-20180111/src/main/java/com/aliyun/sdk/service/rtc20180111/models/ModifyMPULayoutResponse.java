// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyMPULayoutResponse} extends {@link TeaModel}
 *
 * <p>ModifyMPULayoutResponse</p>
 */
public class ModifyMPULayoutResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyMPULayoutResponseBody body;

    private ModifyMPULayoutResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyMPULayoutResponse create() {
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
    public ModifyMPULayoutResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyMPULayoutResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyMPULayoutResponseBody body);

        @Override
        ModifyMPULayoutResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyMPULayoutResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyMPULayoutResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyMPULayoutResponse response) {
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
        public Builder body(ModifyMPULayoutResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyMPULayoutResponse build() {
            return new ModifyMPULayoutResponse(this);
        } 

    } 

}
