// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link GetAppliedMachineGroupsResponse} extends {@link TeaModel}
 *
 * <p>GetAppliedMachineGroupsResponse</p>
 */
public class GetAppliedMachineGroupsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetAppliedMachineGroupsResponseBody body;

    private GetAppliedMachineGroupsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetAppliedMachineGroupsResponse create() {
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
    public GetAppliedMachineGroupsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetAppliedMachineGroupsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetAppliedMachineGroupsResponseBody body);

        @Override
        GetAppliedMachineGroupsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetAppliedMachineGroupsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetAppliedMachineGroupsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetAppliedMachineGroupsResponse response) {
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
        public Builder body(GetAppliedMachineGroupsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetAppliedMachineGroupsResponse build() {
            return new GetAppliedMachineGroupsResponse(this);
        } 

    } 

}
