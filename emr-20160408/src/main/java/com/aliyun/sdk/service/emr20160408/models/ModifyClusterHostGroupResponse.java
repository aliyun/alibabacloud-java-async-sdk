// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyClusterHostGroupResponse} extends {@link TeaModel}
 *
 * <p>ModifyClusterHostGroupResponse</p>
 */
public class ModifyClusterHostGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyClusterHostGroupResponseBody body;

    private ModifyClusterHostGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyClusterHostGroupResponse create() {
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
    public ModifyClusterHostGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyClusterHostGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyClusterHostGroupResponseBody body);

        @Override
        ModifyClusterHostGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyClusterHostGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyClusterHostGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyClusterHostGroupResponse response) {
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
        public Builder body(ModifyClusterHostGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyClusterHostGroupResponse build() {
            return new ModifyClusterHostGroupResponse(this);
        } 

    } 

}
