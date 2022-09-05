// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteCloudDriveUsersResponse} extends {@link TeaModel}
 *
 * <p>DeleteCloudDriveUsersResponse</p>
 */
public class DeleteCloudDriveUsersResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteCloudDriveUsersResponseBody body;

    private DeleteCloudDriveUsersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteCloudDriveUsersResponse create() {
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
    public DeleteCloudDriveUsersResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteCloudDriveUsersResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteCloudDriveUsersResponseBody body);

        @Override
        DeleteCloudDriveUsersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteCloudDriveUsersResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteCloudDriveUsersResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteCloudDriveUsersResponse response) {
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
        public Builder body(DeleteCloudDriveUsersResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteCloudDriveUsersResponse build() {
            return new DeleteCloudDriveUsersResponse(this);
        } 

    } 

}
