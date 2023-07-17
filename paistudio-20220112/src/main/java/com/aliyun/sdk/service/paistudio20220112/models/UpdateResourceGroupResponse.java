// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateResourceGroupResponse} extends {@link TeaModel}
 *
 * <p>UpdateResourceGroupResponse</p>
 */
public class UpdateResourceGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateResourceGroupResponseBody body;

    private UpdateResourceGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateResourceGroupResponse create() {
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
    public UpdateResourceGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateResourceGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateResourceGroupResponseBody body);

        @Override
        UpdateResourceGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateResourceGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateResourceGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateResourceGroupResponse response) {
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
        public Builder body(UpdateResourceGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateResourceGroupResponse build() {
            return new UpdateResourceGroupResponse(this);
        } 

    } 

}
