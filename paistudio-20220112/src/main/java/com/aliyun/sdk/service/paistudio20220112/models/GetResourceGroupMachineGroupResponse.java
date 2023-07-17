// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetResourceGroupMachineGroupResponse} extends {@link TeaModel}
 *
 * <p>GetResourceGroupMachineGroupResponse</p>
 */
public class GetResourceGroupMachineGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetResourceGroupMachineGroupResponseBody body;

    private GetResourceGroupMachineGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetResourceGroupMachineGroupResponse create() {
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
    public GetResourceGroupMachineGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetResourceGroupMachineGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetResourceGroupMachineGroupResponseBody body);

        @Override
        GetResourceGroupMachineGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetResourceGroupMachineGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetResourceGroupMachineGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetResourceGroupMachineGroupResponse response) {
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
        public Builder body(GetResourceGroupMachineGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetResourceGroupMachineGroupResponse build() {
            return new GetResourceGroupMachineGroupResponse(this);
        } 

    } 

}
