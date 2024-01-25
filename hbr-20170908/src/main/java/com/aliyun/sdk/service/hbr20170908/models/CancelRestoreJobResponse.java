// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CancelRestoreJobResponse} extends {@link TeaModel}
 *
 * <p>CancelRestoreJobResponse</p>
 */
public class CancelRestoreJobResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private CancelRestoreJobResponseBody body;

    private CancelRestoreJobResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static CancelRestoreJobResponse create() {
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
    public CancelRestoreJobResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CancelRestoreJobResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(CancelRestoreJobResponseBody body);

        @Override
        CancelRestoreJobResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CancelRestoreJobResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private CancelRestoreJobResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CancelRestoreJobResponse response) {
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
        public Builder body(CancelRestoreJobResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CancelRestoreJobResponse build() {
            return new CancelRestoreJobResponse(this);
        } 

    } 

}
