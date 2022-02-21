// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbs20190306.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyBackupObjectsResponse} extends {@link TeaModel}
 *
 * <p>ModifyBackupObjectsResponse</p>
 */
public class ModifyBackupObjectsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyBackupObjectsResponseBody body;

    private ModifyBackupObjectsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyBackupObjectsResponse create() {
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
    public ModifyBackupObjectsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyBackupObjectsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyBackupObjectsResponseBody body);

        @Override
        ModifyBackupObjectsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyBackupObjectsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyBackupObjectsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyBackupObjectsResponse response) {
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
        public Builder body(ModifyBackupObjectsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyBackupObjectsResponse build() {
            return new ModifyBackupObjectsResponse(this);
        } 

    } 

}
