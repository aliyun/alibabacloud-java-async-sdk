// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDtsJobDuLimitResponse} extends {@link TeaModel}
 *
 * <p>ModifyDtsJobDuLimitResponse</p>
 */
public class ModifyDtsJobDuLimitResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyDtsJobDuLimitResponseBody body;

    private ModifyDtsJobDuLimitResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyDtsJobDuLimitResponse create() {
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
    public ModifyDtsJobDuLimitResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyDtsJobDuLimitResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyDtsJobDuLimitResponseBody body);

        @Override
        ModifyDtsJobDuLimitResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyDtsJobDuLimitResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyDtsJobDuLimitResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyDtsJobDuLimitResponse response) {
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
        public Builder body(ModifyDtsJobDuLimitResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyDtsJobDuLimitResponse build() {
            return new ModifyDtsJobDuLimitResponse(this);
        } 

    } 

}
