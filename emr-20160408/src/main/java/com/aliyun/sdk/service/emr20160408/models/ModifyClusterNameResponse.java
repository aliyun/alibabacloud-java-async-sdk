// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyClusterNameResponse} extends {@link TeaModel}
 *
 * <p>ModifyClusterNameResponse</p>
 */
public class ModifyClusterNameResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyClusterNameResponseBody body;

    private ModifyClusterNameResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyClusterNameResponse create() {
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
    public ModifyClusterNameResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyClusterNameResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyClusterNameResponseBody body);

        @Override
        ModifyClusterNameResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyClusterNameResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyClusterNameResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyClusterNameResponse response) {
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
        public Builder body(ModifyClusterNameResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyClusterNameResponse build() {
            return new ModifyClusterNameResponse(this);
        } 

    } 

}
