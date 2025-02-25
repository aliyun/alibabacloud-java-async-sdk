// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ScaleK8sApplicationResponse} extends {@link TeaModel}
 *
 * <p>ScaleK8sApplicationResponse</p>
 */
public class ScaleK8sApplicationResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private ScaleK8sApplicationResponseBody body;

    private ScaleK8sApplicationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ScaleK8sApplicationResponse create() {
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
    public ScaleK8sApplicationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ScaleK8sApplicationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(ScaleK8sApplicationResponseBody body);

        @Override
        ScaleK8sApplicationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ScaleK8sApplicationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private ScaleK8sApplicationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ScaleK8sApplicationResponse response) {
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
        public Builder body(ScaleK8sApplicationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ScaleK8sApplicationResponse build() {
            return new ScaleK8sApplicationResponse(this);
        } 

    } 

}
