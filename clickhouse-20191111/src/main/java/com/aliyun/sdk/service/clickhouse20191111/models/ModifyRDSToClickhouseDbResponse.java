// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20191111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyRDSToClickhouseDbResponse} extends {@link TeaModel}
 *
 * <p>ModifyRDSToClickhouseDbResponse</p>
 */
public class ModifyRDSToClickhouseDbResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyRDSToClickhouseDbResponseBody body;

    private ModifyRDSToClickhouseDbResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyRDSToClickhouseDbResponse create() {
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
    public ModifyRDSToClickhouseDbResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyRDSToClickhouseDbResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyRDSToClickhouseDbResponseBody body);

        @Override
        ModifyRDSToClickhouseDbResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyRDSToClickhouseDbResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyRDSToClickhouseDbResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyRDSToClickhouseDbResponse response) {
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
        public Builder body(ModifyRDSToClickhouseDbResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyRDSToClickhouseDbResponse build() {
            return new ModifyRDSToClickhouseDbResponse(this);
        } 

    } 

}
