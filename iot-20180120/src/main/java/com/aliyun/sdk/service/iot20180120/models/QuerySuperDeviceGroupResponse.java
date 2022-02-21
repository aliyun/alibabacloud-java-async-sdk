// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QuerySuperDeviceGroupResponse} extends {@link TeaModel}
 *
 * <p>QuerySuperDeviceGroupResponse</p>
 */
public class QuerySuperDeviceGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QuerySuperDeviceGroupResponseBody body;

    private QuerySuperDeviceGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QuerySuperDeviceGroupResponse create() {
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
    public QuerySuperDeviceGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QuerySuperDeviceGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QuerySuperDeviceGroupResponseBody body);

        @Override
        QuerySuperDeviceGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QuerySuperDeviceGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QuerySuperDeviceGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QuerySuperDeviceGroupResponse response) {
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
        public Builder body(QuerySuperDeviceGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QuerySuperDeviceGroupResponse build() {
            return new QuerySuperDeviceGroupResponse(this);
        } 

    } 

}
