// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateMessageGroupResponse} extends {@link TeaModel}
 *
 * <p>UpdateMessageGroupResponse</p>
 */
public class UpdateMessageGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateMessageGroupResponseBody body;

    private UpdateMessageGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateMessageGroupResponse create() {
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
    public UpdateMessageGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateMessageGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateMessageGroupResponseBody body);

        @Override
        UpdateMessageGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateMessageGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateMessageGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateMessageGroupResponse response) {
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
        public Builder body(UpdateMessageGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateMessageGroupResponse build() {
            return new UpdateMessageGroupResponse(this);
        } 

    } 

}
