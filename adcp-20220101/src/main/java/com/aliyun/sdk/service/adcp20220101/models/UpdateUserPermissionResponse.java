// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adcp20220101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateUserPermissionResponse} extends {@link TeaModel}
 *
 * <p>UpdateUserPermissionResponse</p>
 */
public class UpdateUserPermissionResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private UpdateUserPermissionResponseBody body;

    private UpdateUserPermissionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static UpdateUserPermissionResponse create() {
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
    public UpdateUserPermissionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateUserPermissionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(UpdateUserPermissionResponseBody body);

        @Override
        UpdateUserPermissionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateUserPermissionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private UpdateUserPermissionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateUserPermissionResponse response) {
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
        public Builder body(UpdateUserPermissionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateUserPermissionResponse build() {
            return new UpdateUserPermissionResponse(this);
        } 

    } 

}
