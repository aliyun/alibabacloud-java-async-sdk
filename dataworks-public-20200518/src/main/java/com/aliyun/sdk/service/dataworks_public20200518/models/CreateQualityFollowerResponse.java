// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateQualityFollowerResponse} extends {@link TeaModel}
 *
 * <p>CreateQualityFollowerResponse</p>
 */
public class CreateQualityFollowerResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private CreateQualityFollowerResponseBody body;

    private CreateQualityFollowerResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static CreateQualityFollowerResponse create() {
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
    public CreateQualityFollowerResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateQualityFollowerResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(CreateQualityFollowerResponseBody body);

        @Override
        CreateQualityFollowerResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateQualityFollowerResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private CreateQualityFollowerResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateQualityFollowerResponse response) {
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
        public Builder body(CreateQualityFollowerResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateQualityFollowerResponse build() {
            return new CreateQualityFollowerResponse(this);
        } 

    } 

}
