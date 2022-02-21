// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateHostGroupResponse} extends {@link TeaModel}
 *
 * <p>UpdateHostGroupResponse</p>
 */
public class UpdateHostGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateHostGroupResponseBody body;

    private UpdateHostGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateHostGroupResponse create() {
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
    public UpdateHostGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateHostGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateHostGroupResponseBody body);

        @Override
        UpdateHostGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateHostGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateHostGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateHostGroupResponse response) {
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
        public Builder body(UpdateHostGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateHostGroupResponse build() {
            return new UpdateHostGroupResponse(this);
        } 

    } 

}
