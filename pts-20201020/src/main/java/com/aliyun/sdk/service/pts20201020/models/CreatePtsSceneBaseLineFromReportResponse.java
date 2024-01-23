// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pts20201020.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreatePtsSceneBaseLineFromReportResponse} extends {@link TeaModel}
 *
 * <p>CreatePtsSceneBaseLineFromReportResponse</p>
 */
public class CreatePtsSceneBaseLineFromReportResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    private Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    private CreatePtsSceneBaseLineFromReportResponseBody body;

    private CreatePtsSceneBaseLineFromReportResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static CreatePtsSceneBaseLineFromReportResponse create() {
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
    public CreatePtsSceneBaseLineFromReportResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreatePtsSceneBaseLineFromReportResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(CreatePtsSceneBaseLineFromReportResponseBody body);

        @Override
        CreatePtsSceneBaseLineFromReportResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreatePtsSceneBaseLineFromReportResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private CreatePtsSceneBaseLineFromReportResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreatePtsSceneBaseLineFromReportResponse response) {
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
        public Builder body(CreatePtsSceneBaseLineFromReportResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreatePtsSceneBaseLineFromReportResponse build() {
            return new CreatePtsSceneBaseLineFromReportResponse(this);
        } 

    } 

}
