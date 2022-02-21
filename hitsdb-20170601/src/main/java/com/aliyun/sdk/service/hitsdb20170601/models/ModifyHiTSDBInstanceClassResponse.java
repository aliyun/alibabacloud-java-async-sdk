// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hitsdb20170601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyHiTSDBInstanceClassResponse} extends {@link TeaModel}
 *
 * <p>ModifyHiTSDBInstanceClassResponse</p>
 */
public class ModifyHiTSDBInstanceClassResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyHiTSDBInstanceClassResponseBody body;

    private ModifyHiTSDBInstanceClassResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyHiTSDBInstanceClassResponse create() {
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
    public ModifyHiTSDBInstanceClassResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyHiTSDBInstanceClassResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyHiTSDBInstanceClassResponseBody body);

        @Override
        ModifyHiTSDBInstanceClassResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyHiTSDBInstanceClassResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyHiTSDBInstanceClassResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyHiTSDBInstanceClassResponse response) {
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
        public Builder body(ModifyHiTSDBInstanceClassResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyHiTSDBInstanceClassResponse build() {
            return new ModifyHiTSDBInstanceClassResponse(this);
        } 

    } 

}
