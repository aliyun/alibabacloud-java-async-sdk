// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20210422.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ImportCustomAlertRulesResponse} extends {@link TeaModel}
 *
 * <p>ImportCustomAlertRulesResponse</p>
 */
public class ImportCustomAlertRulesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ImportCustomAlertRulesResponseBody body;

    private ImportCustomAlertRulesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ImportCustomAlertRulesResponse create() {
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
    public ImportCustomAlertRulesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ImportCustomAlertRulesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ImportCustomAlertRulesResponseBody body);

        @Override
        ImportCustomAlertRulesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ImportCustomAlertRulesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ImportCustomAlertRulesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ImportCustomAlertRulesResponse response) {
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
        public Builder body(ImportCustomAlertRulesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ImportCustomAlertRulesResponse build() {
            return new ImportCustomAlertRulesResponse(this);
        } 

    } 

}
