// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateRepoSourceCodeRepoResponse} extends {@link TeaModel}
 *
 * <p>CreateRepoSourceCodeRepoResponse</p>
 */
public class CreateRepoSourceCodeRepoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    private Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    private CreateRepoSourceCodeRepoResponseBody body;

    private CreateRepoSourceCodeRepoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static CreateRepoSourceCodeRepoResponse create() {
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
    public CreateRepoSourceCodeRepoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateRepoSourceCodeRepoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(CreateRepoSourceCodeRepoResponseBody body);

        @Override
        CreateRepoSourceCodeRepoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateRepoSourceCodeRepoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private CreateRepoSourceCodeRepoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateRepoSourceCodeRepoResponse response) {
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
        public Builder body(CreateRepoSourceCodeRepoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateRepoSourceCodeRepoResponse build() {
            return new CreateRepoSourceCodeRepoResponse(this);
        } 

    } 

}
