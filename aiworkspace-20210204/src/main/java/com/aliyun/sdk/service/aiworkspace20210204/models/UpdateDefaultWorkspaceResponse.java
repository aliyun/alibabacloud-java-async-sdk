// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateDefaultWorkspaceResponse} extends {@link TeaModel}
 *
 * <p>UpdateDefaultWorkspaceResponse</p>
 */
public class UpdateDefaultWorkspaceResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private UpdateDefaultWorkspaceResponseBody body;

    private UpdateDefaultWorkspaceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static UpdateDefaultWorkspaceResponse create() {
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
    public UpdateDefaultWorkspaceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateDefaultWorkspaceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(UpdateDefaultWorkspaceResponseBody body);

        @Override
        UpdateDefaultWorkspaceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateDefaultWorkspaceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private UpdateDefaultWorkspaceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateDefaultWorkspaceResponse response) {
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
        public Builder body(UpdateDefaultWorkspaceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateDefaultWorkspaceResponse build() {
            return new UpdateDefaultWorkspaceResponse(this);
        } 

    } 

}
