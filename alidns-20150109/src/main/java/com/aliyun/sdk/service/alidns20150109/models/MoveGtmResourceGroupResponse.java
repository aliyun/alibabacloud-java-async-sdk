// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link MoveGtmResourceGroupResponse} extends {@link TeaModel}
 *
 * <p>MoveGtmResourceGroupResponse</p>
 */
public class MoveGtmResourceGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private MoveGtmResourceGroupResponseBody body;

    private MoveGtmResourceGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static MoveGtmResourceGroupResponse create() {
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
    public MoveGtmResourceGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<MoveGtmResourceGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(MoveGtmResourceGroupResponseBody body);

        @Override
        MoveGtmResourceGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<MoveGtmResourceGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private MoveGtmResourceGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(MoveGtmResourceGroupResponse response) {
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
        public Builder body(MoveGtmResourceGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public MoveGtmResourceGroupResponse build() {
            return new MoveGtmResourceGroupResponse(this);
        } 

    } 

}
