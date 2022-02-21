// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateClusterHostGroupResponse} extends {@link TeaModel}
 *
 * <p>CreateClusterHostGroupResponse</p>
 */
public class CreateClusterHostGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateClusterHostGroupResponseBody body;

    private CreateClusterHostGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateClusterHostGroupResponse create() {
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
    public CreateClusterHostGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateClusterHostGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateClusterHostGroupResponseBody body);

        @Override
        CreateClusterHostGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateClusterHostGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateClusterHostGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateClusterHostGroupResponse response) {
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
        public Builder body(CreateClusterHostGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateClusterHostGroupResponse build() {
            return new CreateClusterHostGroupResponse(this);
        } 

    } 

}
