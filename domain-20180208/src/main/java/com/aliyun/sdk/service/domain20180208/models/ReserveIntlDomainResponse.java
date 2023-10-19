// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180208.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReserveIntlDomainResponse} extends {@link TeaModel}
 *
 * <p>ReserveIntlDomainResponse</p>
 */
public class ReserveIntlDomainResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    private Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    private ReserveIntlDomainResponseBody body;

    private ReserveIntlDomainResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ReserveIntlDomainResponse create() {
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
    public ReserveIntlDomainResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ReserveIntlDomainResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(ReserveIntlDomainResponseBody body);

        @Override
        ReserveIntlDomainResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ReserveIntlDomainResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private ReserveIntlDomainResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ReserveIntlDomainResponse response) {
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
        public Builder body(ReserveIntlDomainResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ReserveIntlDomainResponse build() {
            return new ReserveIntlDomainResponse(this);
        } 

    } 

}
