// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateGroupResponse} extends {@link TeaModel}
 *
 * <p>UpdateGroupResponse</p>
 */
public class UpdateGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateGroupResponseBody body;

    private UpdateGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateGroupResponse create() {
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
    public UpdateGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateGroupResponseBody body);

        @Override
        UpdateGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateGroupResponse response) {
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
        public Builder body(UpdateGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateGroupResponse build() {
            return new UpdateGroupResponse(this);
        } 

    } 

}
