// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link UpdateMachineGroupResponse} extends {@link TeaModel}
 *
 * <p>UpdateMachineGroupResponse</p>
 */
public class UpdateMachineGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    private UpdateMachineGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
    }

    public static UpdateMachineGroupResponse create() {
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

    public interface Builder extends Response.Builder<UpdateMachineGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        @Override
        UpdateMachineGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateMachineGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateMachineGroupResponse response) {
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
        public UpdateMachineGroupResponse build() {
            return new UpdateMachineGroupResponse(this);
        } 

    } 

}
