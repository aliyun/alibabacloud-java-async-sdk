// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ImportDoNotCallNumbersResponse} extends {@link TeaModel}
 *
 * <p>ImportDoNotCallNumbersResponse</p>
 */
public class ImportDoNotCallNumbersResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ImportDoNotCallNumbersResponseBody body;

    private ImportDoNotCallNumbersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ImportDoNotCallNumbersResponse create() {
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
    public ImportDoNotCallNumbersResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ImportDoNotCallNumbersResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ImportDoNotCallNumbersResponseBody body);

        @Override
        ImportDoNotCallNumbersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ImportDoNotCallNumbersResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ImportDoNotCallNumbersResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ImportDoNotCallNumbersResponse response) {
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
        public Builder body(ImportDoNotCallNumbersResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ImportDoNotCallNumbersResponse build() {
            return new ImportDoNotCallNumbersResponse(this);
        } 

    } 

}
