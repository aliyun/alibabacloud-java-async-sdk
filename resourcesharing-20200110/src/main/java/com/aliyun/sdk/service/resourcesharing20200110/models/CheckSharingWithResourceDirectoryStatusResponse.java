// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcesharing20200110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckSharingWithResourceDirectoryStatusResponse} extends {@link TeaModel}
 *
 * <p>CheckSharingWithResourceDirectoryStatusResponse</p>
 */
public class CheckSharingWithResourceDirectoryStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CheckSharingWithResourceDirectoryStatusResponseBody body;

    private CheckSharingWithResourceDirectoryStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CheckSharingWithResourceDirectoryStatusResponse create() {
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
     * @return body
     */
    public CheckSharingWithResourceDirectoryStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CheckSharingWithResourceDirectoryStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CheckSharingWithResourceDirectoryStatusResponseBody body);

        @Override
        CheckSharingWithResourceDirectoryStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CheckSharingWithResourceDirectoryStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CheckSharingWithResourceDirectoryStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CheckSharingWithResourceDirectoryStatusResponse response) {
            super(response);
            this.headers = response.headers;
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
         * body.
         */
        @Override
        public Builder body(CheckSharingWithResourceDirectoryStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CheckSharingWithResourceDirectoryStatusResponse build() {
            return new CheckSharingWithResourceDirectoryStatusResponse(this);
        } 

    } 

}
