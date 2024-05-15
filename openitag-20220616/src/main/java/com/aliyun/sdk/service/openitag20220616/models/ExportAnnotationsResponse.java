// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.openitag20220616.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExportAnnotationsResponse} extends {@link TeaModel}
 *
 * <p>ExportAnnotationsResponse</p>
 */
public class ExportAnnotationsResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ExportAnnotationsResponseBody body;

    private ExportAnnotationsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ExportAnnotationsResponse create() {
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
    public ExportAnnotationsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ExportAnnotationsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(ExportAnnotationsResponseBody body);

        @Override
        ExportAnnotationsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ExportAnnotationsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private ExportAnnotationsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ExportAnnotationsResponse response) {
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
        public Builder body(ExportAnnotationsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ExportAnnotationsResponse build() {
            return new ExportAnnotationsResponse(this);
        } 

    } 

}
