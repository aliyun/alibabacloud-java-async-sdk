// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListImportedLogsByProdResponse} extends {@link TeaModel}
 *
 * <p>ListImportedLogsByProdResponse</p>
 */
public class ListImportedLogsByProdResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private ListImportedLogsByProdResponseBody body;

    private ListImportedLogsByProdResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ListImportedLogsByProdResponse create() {
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
    public ListImportedLogsByProdResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListImportedLogsByProdResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(ListImportedLogsByProdResponseBody body);

        @Override
        ListImportedLogsByProdResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListImportedLogsByProdResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private ListImportedLogsByProdResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListImportedLogsByProdResponse response) {
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
        public Builder body(ListImportedLogsByProdResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListImportedLogsByProdResponse build() {
            return new ListImportedLogsByProdResponse(this);
        } 

    } 

}
