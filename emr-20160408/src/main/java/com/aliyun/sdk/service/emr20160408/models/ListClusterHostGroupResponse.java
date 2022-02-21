// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListClusterHostGroupResponse} extends {@link TeaModel}
 *
 * <p>ListClusterHostGroupResponse</p>
 */
public class ListClusterHostGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListClusterHostGroupResponseBody body;

    private ListClusterHostGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListClusterHostGroupResponse create() {
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
    public ListClusterHostGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListClusterHostGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListClusterHostGroupResponseBody body);

        @Override
        ListClusterHostGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListClusterHostGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListClusterHostGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListClusterHostGroupResponse response) {
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
        public Builder body(ListClusterHostGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListClusterHostGroupResponse build() {
            return new ListClusterHostGroupResponse(this);
        } 

    } 

}
