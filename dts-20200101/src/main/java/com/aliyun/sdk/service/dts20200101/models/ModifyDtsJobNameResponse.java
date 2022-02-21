// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDtsJobNameResponse} extends {@link TeaModel}
 *
 * <p>ModifyDtsJobNameResponse</p>
 */
public class ModifyDtsJobNameResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyDtsJobNameResponseBody body;

    private ModifyDtsJobNameResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyDtsJobNameResponse create() {
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
    public ModifyDtsJobNameResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyDtsJobNameResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyDtsJobNameResponseBody body);

        @Override
        ModifyDtsJobNameResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyDtsJobNameResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyDtsJobNameResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyDtsJobNameResponse response) {
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
        public Builder body(ModifyDtsJobNameResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyDtsJobNameResponse build() {
            return new ModifyDtsJobNameResponse(this);
        } 

    } 

}
