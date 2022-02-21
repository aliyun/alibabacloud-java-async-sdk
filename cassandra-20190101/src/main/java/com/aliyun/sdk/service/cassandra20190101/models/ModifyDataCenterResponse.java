// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cassandra20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDataCenterResponse} extends {@link TeaModel}
 *
 * <p>ModifyDataCenterResponse</p>
 */
public class ModifyDataCenterResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyDataCenterResponseBody body;

    private ModifyDataCenterResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyDataCenterResponse create() {
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
    public ModifyDataCenterResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyDataCenterResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyDataCenterResponseBody body);

        @Override
        ModifyDataCenterResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyDataCenterResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyDataCenterResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyDataCenterResponse response) {
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
        public Builder body(ModifyDataCenterResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyDataCenterResponse build() {
            return new ModifyDataCenterResponse(this);
        } 

    } 

}
