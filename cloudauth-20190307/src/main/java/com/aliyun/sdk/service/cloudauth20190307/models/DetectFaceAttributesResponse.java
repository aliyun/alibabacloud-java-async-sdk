// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth20190307.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DetectFaceAttributesResponse} extends {@link TeaModel}
 *
 * <p>DetectFaceAttributesResponse</p>
 */
public class DetectFaceAttributesResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private DetectFaceAttributesResponseBody body;

    private DetectFaceAttributesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DetectFaceAttributesResponse create() {
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
    public DetectFaceAttributesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DetectFaceAttributesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(DetectFaceAttributesResponseBody body);

        @Override
        DetectFaceAttributesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DetectFaceAttributesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private DetectFaceAttributesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DetectFaceAttributesResponse response) {
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
        public Builder body(DetectFaceAttributesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DetectFaceAttributesResponse build() {
            return new DetectFaceAttributesResponse(this);
        } 

    } 

}
