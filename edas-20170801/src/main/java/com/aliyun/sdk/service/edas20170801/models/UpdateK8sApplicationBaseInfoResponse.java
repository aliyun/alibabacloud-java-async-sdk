// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateK8sApplicationBaseInfoResponse} extends {@link TeaModel}
 *
 * <p>UpdateK8sApplicationBaseInfoResponse</p>
 */
public class UpdateK8sApplicationBaseInfoResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private UpdateK8sApplicationBaseInfoResponseBody body;

    private UpdateK8sApplicationBaseInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static UpdateK8sApplicationBaseInfoResponse create() {
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
    public UpdateK8sApplicationBaseInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateK8sApplicationBaseInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(UpdateK8sApplicationBaseInfoResponseBody body);

        @Override
        UpdateK8sApplicationBaseInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateK8sApplicationBaseInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private UpdateK8sApplicationBaseInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateK8sApplicationBaseInfoResponse response) {
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
        public Builder body(UpdateK8sApplicationBaseInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateK8sApplicationBaseInfoResponse build() {
            return new UpdateK8sApplicationBaseInfoResponse(this);
        } 

    } 

}
