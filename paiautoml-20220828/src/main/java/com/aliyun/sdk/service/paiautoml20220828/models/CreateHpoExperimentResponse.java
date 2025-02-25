// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiautoml20220828.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateHpoExperimentResponse} extends {@link TeaModel}
 *
 * <p>CreateHpoExperimentResponse</p>
 */
public class CreateHpoExperimentResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private CreateHpoExperimentResponseBody body;

    private CreateHpoExperimentResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static CreateHpoExperimentResponse create() {
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
    public CreateHpoExperimentResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateHpoExperimentResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(CreateHpoExperimentResponseBody body);

        @Override
        CreateHpoExperimentResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateHpoExperimentResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private CreateHpoExperimentResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateHpoExperimentResponse response) {
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
        public Builder body(CreateHpoExperimentResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateHpoExperimentResponse build() {
            return new CreateHpoExperimentResponse(this);
        } 

    } 

}
