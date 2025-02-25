// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdatePermissionsResponse} extends {@link TeaModel}
 *
 * <p>UpdatePermissionsResponse</p>
 */
public class UpdatePermissionsResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private UpdatePermissionsResponseBody body;

    private UpdatePermissionsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static UpdatePermissionsResponse create() {
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
    public UpdatePermissionsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdatePermissionsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(UpdatePermissionsResponseBody body);

        @Override
        UpdatePermissionsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdatePermissionsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private UpdatePermissionsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdatePermissionsResponse response) {
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
        public Builder body(UpdatePermissionsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdatePermissionsResponse build() {
            return new UpdatePermissionsResponse(this);
        } 

    } 

}
