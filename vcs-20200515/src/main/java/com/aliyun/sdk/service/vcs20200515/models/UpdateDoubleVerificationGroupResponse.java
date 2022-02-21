// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateDoubleVerificationGroupResponse} extends {@link TeaModel}
 *
 * <p>UpdateDoubleVerificationGroupResponse</p>
 */
public class UpdateDoubleVerificationGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateDoubleVerificationGroupResponseBody body;

    private UpdateDoubleVerificationGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateDoubleVerificationGroupResponse create() {
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
    public UpdateDoubleVerificationGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateDoubleVerificationGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateDoubleVerificationGroupResponseBody body);

        @Override
        UpdateDoubleVerificationGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateDoubleVerificationGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateDoubleVerificationGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateDoubleVerificationGroupResponse response) {
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
        public Builder body(UpdateDoubleVerificationGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateDoubleVerificationGroupResponse build() {
            return new UpdateDoubleVerificationGroupResponse(this);
        } 

    } 

}
