// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateGrafanaWorkspaceVersionResponse} extends {@link TeaModel}
 *
 * <p>UpdateGrafanaWorkspaceVersionResponse</p>
 */
public class UpdateGrafanaWorkspaceVersionResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private UpdateGrafanaWorkspaceVersionResponseBody body;

    private UpdateGrafanaWorkspaceVersionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static UpdateGrafanaWorkspaceVersionResponse create() {
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
    public UpdateGrafanaWorkspaceVersionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateGrafanaWorkspaceVersionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(UpdateGrafanaWorkspaceVersionResponseBody body);

        @Override
        UpdateGrafanaWorkspaceVersionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateGrafanaWorkspaceVersionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private UpdateGrafanaWorkspaceVersionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateGrafanaWorkspaceVersionResponse response) {
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
        public Builder body(UpdateGrafanaWorkspaceVersionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateGrafanaWorkspaceVersionResponse build() {
            return new UpdateGrafanaWorkspaceVersionResponse(this);
        } 

    } 

}
