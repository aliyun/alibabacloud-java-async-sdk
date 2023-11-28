// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReinstallCollectorResponse} extends {@link TeaModel}
 *
 * <p>ReinstallCollectorResponse</p>
 */
public class ReinstallCollectorResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    private Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    private ReinstallCollectorResponseBody body;

    private ReinstallCollectorResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ReinstallCollectorResponse create() {
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
    public ReinstallCollectorResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ReinstallCollectorResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(ReinstallCollectorResponseBody body);

        @Override
        ReinstallCollectorResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ReinstallCollectorResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private ReinstallCollectorResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ReinstallCollectorResponse response) {
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
        public Builder body(ReinstallCollectorResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ReinstallCollectorResponse build() {
            return new ReinstallCollectorResponse(this);
        } 

    } 

}
