// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryFaceUserGroupAndDeviceGroupRelationResponse} extends {@link TeaModel}
 *
 * <p>QueryFaceUserGroupAndDeviceGroupRelationResponse</p>
 */
public class QueryFaceUserGroupAndDeviceGroupRelationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryFaceUserGroupAndDeviceGroupRelationResponseBody body;

    private QueryFaceUserGroupAndDeviceGroupRelationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryFaceUserGroupAndDeviceGroupRelationResponse create() {
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
    public QueryFaceUserGroupAndDeviceGroupRelationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryFaceUserGroupAndDeviceGroupRelationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryFaceUserGroupAndDeviceGroupRelationResponseBody body);

        @Override
        QueryFaceUserGroupAndDeviceGroupRelationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryFaceUserGroupAndDeviceGroupRelationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryFaceUserGroupAndDeviceGroupRelationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryFaceUserGroupAndDeviceGroupRelationResponse response) {
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
        public Builder body(QueryFaceUserGroupAndDeviceGroupRelationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryFaceUserGroupAndDeviceGroupRelationResponse build() {
            return new QueryFaceUserGroupAndDeviceGroupRelationResponse(this);
        } 

    } 

}
