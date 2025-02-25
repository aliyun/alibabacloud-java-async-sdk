// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateK8sConfigMapResponse} extends {@link TeaModel}
 *
 * <p>UpdateK8sConfigMapResponse</p>
 */
public class UpdateK8sConfigMapResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private UpdateK8sConfigMapResponseBody body;

    private UpdateK8sConfigMapResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static UpdateK8sConfigMapResponse create() {
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
    public UpdateK8sConfigMapResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateK8sConfigMapResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(UpdateK8sConfigMapResponseBody body);

        @Override
        UpdateK8sConfigMapResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateK8sConfigMapResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private UpdateK8sConfigMapResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateK8sConfigMapResponse response) {
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
        public Builder body(UpdateK8sConfigMapResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateK8sConfigMapResponse build() {
            return new UpdateK8sConfigMapResponse(this);
        } 

    } 

}
