// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220302.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ImageBatchModerationResponse} extends {@link TeaModel}
 *
 * <p>ImageBatchModerationResponse</p>
 */
public class ImageBatchModerationResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ImageBatchModerationResponseBody body;

    private ImageBatchModerationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ImageBatchModerationResponse create() {
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
    public ImageBatchModerationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ImageBatchModerationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(ImageBatchModerationResponseBody body);

        @Override
        ImageBatchModerationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ImageBatchModerationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private ImageBatchModerationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ImageBatchModerationResponse response) {
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
        public Builder body(ImageBatchModerationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ImageBatchModerationResponse build() {
            return new ImageBatchModerationResponse(this);
        } 

    } 

}
