// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgw20180511.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UploadCSGClientLogResponse} extends {@link TeaModel}
 *
 * <p>UploadCSGClientLogResponse</p>
 */
public class UploadCSGClientLogResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private UploadCSGClientLogResponseBody body;

    private UploadCSGClientLogResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static UploadCSGClientLogResponse create() {
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
    public UploadCSGClientLogResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UploadCSGClientLogResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(UploadCSGClientLogResponseBody body);

        @Override
        UploadCSGClientLogResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UploadCSGClientLogResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private UploadCSGClientLogResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UploadCSGClientLogResponse response) {
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
        public Builder body(UploadCSGClientLogResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UploadCSGClientLogResponse build() {
            return new UploadCSGClientLogResponse(this);
        } 

    } 

}
