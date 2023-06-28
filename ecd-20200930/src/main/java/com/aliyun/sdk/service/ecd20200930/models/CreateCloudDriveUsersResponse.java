// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCloudDriveUsersResponse} extends {@link TeaModel}
 *
 * <p>CreateCloudDriveUsersResponse</p>
 */
public class CreateCloudDriveUsersResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateCloudDriveUsersResponseBody body;

    private CreateCloudDriveUsersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateCloudDriveUsersResponse create() {
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
    public CreateCloudDriveUsersResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateCloudDriveUsersResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateCloudDriveUsersResponseBody body);

        @Override
        CreateCloudDriveUsersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateCloudDriveUsersResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateCloudDriveUsersResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateCloudDriveUsersResponse response) {
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
        public Builder body(CreateCloudDriveUsersResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateCloudDriveUsersResponse build() {
            return new CreateCloudDriveUsersResponse(this);
        } 

    } 

}
