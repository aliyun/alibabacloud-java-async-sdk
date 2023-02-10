// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ImportDTDataResponse} extends {@link TeaModel}
 *
 * <p>ImportDTDataResponse</p>
 */
public class ImportDTDataResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ImportDTDataResponseBody body;

    private ImportDTDataResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ImportDTDataResponse create() {
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
    public ImportDTDataResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ImportDTDataResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ImportDTDataResponseBody body);

        @Override
        ImportDTDataResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ImportDTDataResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ImportDTDataResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ImportDTDataResponse response) {
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
        public Builder body(ImportDTDataResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ImportDTDataResponse build() {
            return new ImportDTDataResponse(this);
        } 

    } 

}
