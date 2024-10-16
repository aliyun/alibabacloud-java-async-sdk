// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ImportFpShotJobResponse} extends {@link TeaModel}
 *
 * <p>ImportFpShotJobResponse</p>
 */
public class ImportFpShotJobResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ImportFpShotJobResponseBody body;

    private ImportFpShotJobResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
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
     * @return statusCode
     */
    public Integer getStatusCode() {
        return this.statusCode;
    }

    /**
     * @return body
     */
    public ImportFpShotJobResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ImportFpShotJobResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(ImportFpShotJobResponseBody body);

        @Override
        ImportFpShotJobResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ImportFpShotJobResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private ImportFpShotJobResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ImportFpShotJobResponse response) {
            super(response);
            this.headers = response.headers;
            this.statusCode = response.statusCode;
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
         * statusCode.
         */
        @Override
        public Builder statusCode(Integer statusCode) {
            this.statusCode = statusCode;
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
