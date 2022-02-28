// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateStackGroupResponse} extends {@link TeaModel}
 *
 * <p>UpdateStackGroupResponse</p>
 */
public class UpdateStackGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateStackGroupResponseBody body;

    private UpdateStackGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateStackGroupResponse create() {
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
    public UpdateStackGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateStackGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateStackGroupResponseBody body);

        @Override
        UpdateStackGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateStackGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateStackGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateStackGroupResponse response) {
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
        public Builder body(UpdateStackGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateStackGroupResponse build() {
            return new UpdateStackGroupResponse(this);
        } 

    } 

}
