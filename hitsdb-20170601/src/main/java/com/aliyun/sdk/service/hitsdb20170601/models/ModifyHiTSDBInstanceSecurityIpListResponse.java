// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hitsdb20170601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyHiTSDBInstanceSecurityIpListResponse} extends {@link TeaModel}
 *
 * <p>ModifyHiTSDBInstanceSecurityIpListResponse</p>
 */
public class ModifyHiTSDBInstanceSecurityIpListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyHiTSDBInstanceSecurityIpListResponseBody body;

    private ModifyHiTSDBInstanceSecurityIpListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyHiTSDBInstanceSecurityIpListResponse create() {
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
    public ModifyHiTSDBInstanceSecurityIpListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyHiTSDBInstanceSecurityIpListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyHiTSDBInstanceSecurityIpListResponseBody body);

        @Override
        ModifyHiTSDBInstanceSecurityIpListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyHiTSDBInstanceSecurityIpListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyHiTSDBInstanceSecurityIpListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyHiTSDBInstanceSecurityIpListResponse response) {
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
        public Builder body(ModifyHiTSDBInstanceSecurityIpListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyHiTSDBInstanceSecurityIpListResponse build() {
            return new ModifyHiTSDBInstanceSecurityIpListResponse(this);
        } 

    } 

}
