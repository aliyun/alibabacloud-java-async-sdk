// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiabtest20240119.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetExperimentVersionResponse} extends {@link TeaModel}
 *
 * <p>GetExperimentVersionResponse</p>
 */
public class GetExperimentVersionResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private GetExperimentVersionResponseBody body;

    private GetExperimentVersionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GetExperimentVersionResponse create() {
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
    public GetExperimentVersionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetExperimentVersionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(GetExperimentVersionResponseBody body);

        @Override
        GetExperimentVersionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetExperimentVersionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private GetExperimentVersionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetExperimentVersionResponse response) {
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
        public Builder body(GetExperimentVersionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetExperimentVersionResponse build() {
            return new GetExperimentVersionResponse(this);
        } 

    } 

}
