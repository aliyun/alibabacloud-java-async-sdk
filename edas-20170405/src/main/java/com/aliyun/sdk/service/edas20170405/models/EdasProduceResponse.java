// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170405.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EdasProduceResponse} extends {@link TeaModel}
 *
 * <p>EdasProduceResponse</p>
 */
public class EdasProduceResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private EdasProduceResponseBody body;

    private EdasProduceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static EdasProduceResponse create() {
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
    public EdasProduceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<EdasProduceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(EdasProduceResponseBody body);

        @Override
        EdasProduceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<EdasProduceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private EdasProduceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(EdasProduceResponse response) {
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
        public Builder body(EdasProduceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public EdasProduceResponse build() {
            return new EdasProduceResponse(this);
        } 

    } 

}
