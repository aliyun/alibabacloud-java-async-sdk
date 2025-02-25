// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeEdgeMachineActiveProcessRequest} extends {@link RequestModel}
 *
 * <p>DescribeEdgeMachineActiveProcessRequest</p>
 */
public class DescribeEdgeMachineActiveProcessRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("edge_machineid")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The ID of the cloud-native box.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cc0725ddf688744979cd98445f67e****</p>
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
