// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateCloudGtmInstanceConfigBasicResponse} extends {@link TeaModel}
 *
 * <p>UpdateCloudGtmInstanceConfigBasicResponse</p>
 */
public class UpdateCloudGtmInstanceConfigBasicResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private UpdateCloudGtmInstanceConfigBasicResponseBody body;

    private UpdateCloudGtmInstanceConfigBasicResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static UpdateCloudGtmInstanceConfigBasicResponse create() {
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
    public UpdateCloudGtmInstanceConfigBasicResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateCloudGtmInstanceConfigBasicResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(UpdateCloudGtmInstanceConfigBasicResponseBody body);

        @Override
        UpdateCloudGtmInstanceConfigBasicResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateCloudGtmInstanceConfigBasicResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private UpdateCloudGtmInstanceConfigBasicResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateCloudGtmInstanceConfigBasicResponse response) {
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
        public Builder body(UpdateCloudGtmInstanceConfigBasicResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateCloudGtmInstanceConfigBasicResponse build() {
            return new UpdateCloudGtmInstanceConfigBasicResponse(this);
        } 

    } 

}
