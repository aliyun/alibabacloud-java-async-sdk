// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetResourceGroupResponse} extends {@link TeaModel}
 *
 * <p>GetResourceGroupResponse</p>
 */
public class GetResourceGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetResourceGroupResponseBody body;

    private GetResourceGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetResourceGroupResponse create() {
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
    public GetResourceGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetResourceGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetResourceGroupResponseBody body);

        @Override
        GetResourceGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetResourceGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetResourceGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetResourceGroupResponse response) {
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
        public Builder body(GetResourceGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetResourceGroupResponse build() {
            return new GetResourceGroupResponse(this);
        } 

    } 

}
