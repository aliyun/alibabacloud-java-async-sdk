// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbs20190306.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyBackupSetDownloadRulesResponse} extends {@link TeaModel}
 *
 * <p>ModifyBackupSetDownloadRulesResponse</p>
 */
public class ModifyBackupSetDownloadRulesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyBackupSetDownloadRulesResponseBody body;

    private ModifyBackupSetDownloadRulesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyBackupSetDownloadRulesResponse create() {
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
    public ModifyBackupSetDownloadRulesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyBackupSetDownloadRulesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyBackupSetDownloadRulesResponseBody body);

        @Override
        ModifyBackupSetDownloadRulesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyBackupSetDownloadRulesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyBackupSetDownloadRulesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyBackupSetDownloadRulesResponse response) {
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
        public Builder body(ModifyBackupSetDownloadRulesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyBackupSetDownloadRulesResponse build() {
            return new ModifyBackupSetDownloadRulesResponse(this);
        } 

    } 

}
