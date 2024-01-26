// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableCustomInstanceBlockRecordResponse} extends {@link TeaModel}
 *
 * <p>EnableCustomInstanceBlockRecordResponse</p>
 */
public class EnableCustomInstanceBlockRecordResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private EnableCustomInstanceBlockRecordResponseBody body;

    private EnableCustomInstanceBlockRecordResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static EnableCustomInstanceBlockRecordResponse create() {
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
    public EnableCustomInstanceBlockRecordResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<EnableCustomInstanceBlockRecordResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(EnableCustomInstanceBlockRecordResponseBody body);

        @Override
        EnableCustomInstanceBlockRecordResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<EnableCustomInstanceBlockRecordResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private EnableCustomInstanceBlockRecordResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(EnableCustomInstanceBlockRecordResponse response) {
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
        public Builder body(EnableCustomInstanceBlockRecordResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public EnableCustomInstanceBlockRecordResponse build() {
            return new EnableCustomInstanceBlockRecordResponse(this);
        } 

    } 

}
