// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ImportFpShotJobResponse} extends {@link TeaModel}
 *
 * <p>ImportFpShotJobResponse</p>
 */
public class ImportFpShotJobResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ImportFpShotJobResponseBody body;

    private ImportFpShotJobResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ImportFpShotJobResponse create() {
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
    public ImportFpShotJobResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ImportFpShotJobResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ImportFpShotJobResponseBody body);

        @Override
        ImportFpShotJobResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ImportFpShotJobResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ImportFpShotJobResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ImportFpShotJobResponse response) {
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
        public Builder body(ImportFpShotJobResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ImportFpShotJobResponse build() {
            return new ImportFpShotJobResponse(this);
        } 

    } 

}
