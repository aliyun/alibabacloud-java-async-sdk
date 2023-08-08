// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEdgeMachineActiveProcessRequest} extends {@link RequestModel}
 *
 * <p>DescribeEdgeMachineActiveProcessRequest</p>
 */
public class DescribeEdgeMachineActiveProcessRequest extends Request {
    @Path
    @NameInMap("edge_machineid")
    @Validation(required = true)
    private String edgeMachineid;

    private DescribeEdgeMachineActiveProcessRequest(Builder builder) {
        super(builder);
        this.edgeMachineid = builder.edgeMachineid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEdgeMachineActiveProcessRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return edgeMachineid
     */
    public String getEdgeMachineid() {
        return this.edgeMachineid;
    }

    public static final class Builder extends Request.Builder<DescribeEdgeMachineActiveProcessRequest, Builder> {
        private String edgeMachineid; 

        private Builder() {
            super();
        } 

        private Builder(DescribeEdgeMachineActiveProcessRequest request) {
            super(request);
            this.edgeMachineid = request.edgeMachineid;
        } 

        /**
         * edge_machineid.
         */
        public Builder edgeMachineid(String edgeMachineid) {
            this.putPathParameter("edge_machineid", edgeMachineid);
            this.edgeMachineid = edgeMachineid;
            return this;
        }

        @Override
        public DescribeEdgeMachineActiveProcessRequest build() {
            return new DescribeEdgeMachineActiveProcessRequest(this);
        } 

    } 

}
