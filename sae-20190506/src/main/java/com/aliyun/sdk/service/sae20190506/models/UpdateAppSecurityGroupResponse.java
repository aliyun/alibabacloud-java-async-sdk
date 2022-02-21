// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAppSecurityGroupResponse} extends {@link TeaModel}
 *
 * <p>UpdateAppSecurityGroupResponse</p>
 */
public class UpdateAppSecurityGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateAppSecurityGroupResponseBody body;

    private UpdateAppSecurityGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateAppSecurityGroupResponse create() {
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
    public UpdateAppSecurityGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateAppSecurityGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateAppSecurityGroupResponseBody body);

        @Override
        UpdateAppSecurityGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateAppSecurityGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateAppSecurityGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateAppSecurityGroupResponse response) {
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
        public Builder body(UpdateAppSecurityGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateAppSecurityGroupResponse build() {
            return new UpdateAppSecurityGroupResponse(this);
        } 

    } 

}
