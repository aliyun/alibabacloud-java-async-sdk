// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hitsdb20170601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RenameHiTSDBInstanceAliasResponse} extends {@link TeaModel}
 *
 * <p>RenameHiTSDBInstanceAliasResponse</p>
 */
public class RenameHiTSDBInstanceAliasResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RenameHiTSDBInstanceAliasResponseBody body;

    private RenameHiTSDBInstanceAliasResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RenameHiTSDBInstanceAliasResponse create() {
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
    public RenameHiTSDBInstanceAliasResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RenameHiTSDBInstanceAliasResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RenameHiTSDBInstanceAliasResponseBody body);

        @Override
        RenameHiTSDBInstanceAliasResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RenameHiTSDBInstanceAliasResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RenameHiTSDBInstanceAliasResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RenameHiTSDBInstanceAliasResponse response) {
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
        public Builder body(RenameHiTSDBInstanceAliasResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RenameHiTSDBInstanceAliasResponse build() {
            return new RenameHiTSDBInstanceAliasResponse(this);
        } 

    } 

}
