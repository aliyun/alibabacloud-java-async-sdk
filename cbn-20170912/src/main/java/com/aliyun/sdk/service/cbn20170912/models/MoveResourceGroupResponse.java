// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link MoveResourceGroupResponse} extends {@link TeaModel}
 *
 * <p>MoveResourceGroupResponse</p>
 */
public class MoveResourceGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private MoveResourceGroupResponseBody body;

    private MoveResourceGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static MoveResourceGroupResponse create() {
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
    public MoveResourceGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<MoveResourceGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(MoveResourceGroupResponseBody body);

        @Override
        MoveResourceGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<MoveResourceGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private MoveResourceGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(MoveResourceGroupResponse response) {
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
        public Builder body(MoveResourceGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public MoveResourceGroupResponse build() {
            return new MoveResourceGroupResponse(this);
        } 

    } 

}
