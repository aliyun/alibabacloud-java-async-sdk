// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link UpdateMachineGroupMachineResponse} extends {@link TeaModel}
 *
 * <p>UpdateMachineGroupMachineResponse</p>
 */
public class UpdateMachineGroupMachineResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    private UpdateMachineGroupMachineResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
    }

    public static UpdateMachineGroupMachineResponse create() {
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

    public interface Builder extends Response.Builder<UpdateMachineGroupMachineResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        @Override
        UpdateMachineGroupMachineResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateMachineGroupMachineResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateMachineGroupMachineResponse response) {
            super(response);
            this.headers = response.headers;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map < String, String > headers) {
            this.headers = headers;
            return this;
        }

        @Override
        public UpdateMachineGroupMachineResponse build() {
            return new UpdateMachineGroupMachineResponse(this);
        } 

    } 

}
