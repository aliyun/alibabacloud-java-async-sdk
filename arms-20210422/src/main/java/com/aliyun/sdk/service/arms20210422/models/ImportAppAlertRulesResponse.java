// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20210422.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ImportAppAlertRulesResponse} extends {@link TeaModel}
 *
 * <p>ImportAppAlertRulesResponse</p>
 */
public class ImportAppAlertRulesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ImportAppAlertRulesResponseBody body;

    private ImportAppAlertRulesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ImportAppAlertRulesResponse create() {
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
    public ImportAppAlertRulesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ImportAppAlertRulesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ImportAppAlertRulesResponseBody body);

        @Override
        ImportAppAlertRulesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ImportAppAlertRulesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ImportAppAlertRulesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ImportAppAlertRulesResponse response) {
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
        public Builder body(ImportAppAlertRulesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ImportAppAlertRulesResponse build() {
            return new ImportAppAlertRulesResponse(this);
        } 

    } 

}
