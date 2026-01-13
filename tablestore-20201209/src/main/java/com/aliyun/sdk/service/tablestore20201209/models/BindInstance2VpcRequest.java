// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tablestore20201209.models;

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
 * {@link BindInstance2VpcRequest} extends {@link RequestModel}
 *
 * <p>BindInstance2VpcRequest</p>
 */
public class BindInstance2VpcRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceVpcName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceVpcName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VirtualSwitchId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String virtualSwitchId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VpcId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vpcId;

    private BindInstance2VpcRequest(Builder builder) {
        super(builder);
        this.instanceName = builder.instanceName;
        this.instanceVpcName = builder.instanceVpcName;
        this.virtualSwitchId = builder.virtualSwitchId;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BindInstance2VpcRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return instanceVpcName
     */
    public String getInstanceVpcName() {
        return this.instanceVpcName;
    }

    /**
     * @return virtualSwitchId
     */
    public String getVirtualSwitchId() {
        return this.virtualSwitchId;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    public static final class Builder extends Request.Builder<BindInstance2VpcRequest, Builder> {
        private String instanceName; 
        private String instanceVpcName; 
        private String virtualSwitchId; 
        private String vpcId; 

        private Builder() {
            super();
        } 

        private Builder(BindInstance2VpcRequest request) {
            super(request);
            this.instanceName = request.instanceName;
            this.instanceVpcName = request.instanceVpcName;
            this.virtualSwitchId = request.virtualSwitchId;
            this.vpcId = request.vpcId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mkdd-test</p>
         */
        public Builder instanceName(String instanceName) {
            this.putBodyParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>xu6666</p>
         */
        public Builder instanceVpcName(String instanceVpcName) {
            this.putBodyParameter("InstanceVpcName", instanceVpcName);
            this.instanceVpcName = instanceVpcName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-uf6***********ez6ge</p>
         */
        public Builder virtualSwitchId(String virtualSwitchId) {
            this.putBodyParameter("VirtualSwitchId", virtualSwitchId);
            this.virtualSwitchId = virtualSwitchId;
            return this;
        }

        /**
         * <p>VPC ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-2ze***********g31n7</p>
         */
        public Builder vpcId(String vpcId) {
            this.putBodyParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        @Override
        public BindInstance2VpcRequest build() {
            return new BindInstance2VpcRequest(this);
        } 

    } 

}
