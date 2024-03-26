// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateUploadAttachedMediaResponse} extends {@link TeaModel}
 *
 * <p>CreateUploadAttachedMediaResponse</p>
 */
public class CreateUploadAttachedMediaResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private CreateUploadAttachedMediaResponseBody body;

    private CreateUploadAttachedMediaResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static CreateUploadAttachedMediaResponse create() {
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
    public CreateUploadAttachedMediaResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateUploadAttachedMediaResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(CreateUploadAttachedMediaResponseBody body);

        @Override
        CreateUploadAttachedMediaResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateUploadAttachedMediaResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private CreateUploadAttachedMediaResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateUploadAttachedMediaResponse response) {
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
        public Builder body(CreateUploadAttachedMediaResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateUploadAttachedMediaResponse build() {
            return new CreateUploadAttachedMediaResponse(this);
        } 

    } 

}
