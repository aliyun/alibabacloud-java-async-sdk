// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudcallcenter20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ImportAdminsResponse} extends {@link TeaModel}
 *
 * <p>ImportAdminsResponse</p>
 */
public class ImportAdminsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ImportAdminsResponseBody body;

    private ImportAdminsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ImportAdminsResponse create() {
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
    public ImportAdminsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ImportAdminsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ImportAdminsResponseBody body);

        @Override
        ImportAdminsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ImportAdminsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ImportAdminsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ImportAdminsResponse response) {
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
        public Builder body(ImportAdminsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ImportAdminsResponse build() {
            return new ImportAdminsResponse(this);
        } 

    } 

}
