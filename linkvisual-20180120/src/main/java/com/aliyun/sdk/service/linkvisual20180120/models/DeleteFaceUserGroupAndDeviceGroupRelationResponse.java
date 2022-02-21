// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteFaceUserGroupAndDeviceGroupRelationResponse} extends {@link TeaModel}
 *
 * <p>DeleteFaceUserGroupAndDeviceGroupRelationResponse</p>
 */
public class DeleteFaceUserGroupAndDeviceGroupRelationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteFaceUserGroupAndDeviceGroupRelationResponseBody body;

    private DeleteFaceUserGroupAndDeviceGroupRelationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteFaceUserGroupAndDeviceGroupRelationResponse create() {
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
    public DeleteFaceUserGroupAndDeviceGroupRelationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteFaceUserGroupAndDeviceGroupRelationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteFaceUserGroupAndDeviceGroupRelationResponseBody body);

        @Override
        DeleteFaceUserGroupAndDeviceGroupRelationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteFaceUserGroupAndDeviceGroupRelationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteFaceUserGroupAndDeviceGroupRelationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteFaceUserGroupAndDeviceGroupRelationResponse response) {
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
        public Builder body(DeleteFaceUserGroupAndDeviceGroupRelationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteFaceUserGroupAndDeviceGroupRelationResponse build() {
            return new DeleteFaceUserGroupAndDeviceGroupRelationResponse(this);
        } 

    } 

}
