// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDeviceDynamicGroupResponse} extends {@link TeaModel}
 *
 * <p>CreateDeviceDynamicGroupResponse</p>
 */
public class CreateDeviceDynamicGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateDeviceDynamicGroupResponseBody body;

    private CreateDeviceDynamicGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateDeviceDynamicGroupResponse create() {
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
    public CreateDeviceDynamicGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateDeviceDynamicGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateDeviceDynamicGroupResponseBody body);

        @Override
        CreateDeviceDynamicGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateDeviceDynamicGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateDeviceDynamicGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateDeviceDynamicGroupResponse response) {
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
        public Builder body(CreateDeviceDynamicGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateDeviceDynamicGroupResponse build() {
            return new CreateDeviceDynamicGroupResponse(this);
        } 

    } 

}
