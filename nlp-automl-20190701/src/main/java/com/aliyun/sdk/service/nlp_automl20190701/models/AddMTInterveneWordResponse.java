// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nlp_automl20190701.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddMTInterveneWordResponse} extends {@link TeaModel}
 *
 * <p>AddMTInterveneWordResponse</p>
 */
public class AddMTInterveneWordResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private AddMTInterveneWordResponseBody body;

    private AddMTInterveneWordResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static AddMTInterveneWordResponse create() {
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
    public AddMTInterveneWordResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddMTInterveneWordResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(AddMTInterveneWordResponseBody body);

        @Override
        AddMTInterveneWordResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddMTInterveneWordResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private AddMTInterveneWordResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddMTInterveneWordResponse response) {
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
        public Builder body(AddMTInterveneWordResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddMTInterveneWordResponse build() {
            return new AddMTInterveneWordResponse(this);
        } 

    } 

}
