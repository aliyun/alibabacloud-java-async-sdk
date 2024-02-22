// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateABMetricResponse} extends {@link TeaModel}
 *
 * <p>CreateABMetricResponse</p>
 */
public class CreateABMetricResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private CreateABMetricResponseBody body;

    private CreateABMetricResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static CreateABMetricResponse create() {
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
    public CreateABMetricResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateABMetricResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(CreateABMetricResponseBody body);

        @Override
        CreateABMetricResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateABMetricResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private CreateABMetricResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateABMetricResponse response) {
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
        public Builder body(CreateABMetricResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateABMetricResponse build() {
            return new CreateABMetricResponse(this);
        } 

    } 

}
