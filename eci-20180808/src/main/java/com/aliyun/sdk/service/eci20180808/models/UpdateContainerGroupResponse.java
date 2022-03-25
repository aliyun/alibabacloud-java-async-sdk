// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eci20180808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateContainerGroupResponse} extends {@link TeaModel}
 *
 * <p>UpdateContainerGroupResponse</p>
 */
public class UpdateContainerGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateContainerGroupResponseBody body;

    private UpdateContainerGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateContainerGroupResponse create() {
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
    public UpdateContainerGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateContainerGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateContainerGroupResponseBody body);

        @Override
        UpdateContainerGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateContainerGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateContainerGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateContainerGroupResponse response) {
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
        public Builder body(UpdateContainerGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateContainerGroupResponse build() {
            return new UpdateContainerGroupResponse(this);
        } 

    } 

}
