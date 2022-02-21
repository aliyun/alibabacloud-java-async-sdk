// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetCasterSyncGroupResponse} extends {@link TeaModel}
 *
 * <p>SetCasterSyncGroupResponse</p>
 */
public class SetCasterSyncGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetCasterSyncGroupResponseBody body;

    private SetCasterSyncGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetCasterSyncGroupResponse create() {
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
    public SetCasterSyncGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetCasterSyncGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetCasterSyncGroupResponseBody body);

        @Override
        SetCasterSyncGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetCasterSyncGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetCasterSyncGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetCasterSyncGroupResponse response) {
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
        public Builder body(SetCasterSyncGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetCasterSyncGroupResponse build() {
            return new SetCasterSyncGroupResponse(this);
        } 

    } 

}
