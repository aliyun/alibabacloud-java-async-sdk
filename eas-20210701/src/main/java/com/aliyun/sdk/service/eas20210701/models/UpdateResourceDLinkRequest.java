// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

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
 * {@link UpdateResourceDLinkRequest} extends {@link RequestModel}
 *
 * <p>UpdateResourceDLinkRequest</p>
 */
public class UpdateResourceDLinkRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ResourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DestinationCIDRs")
    private String destinationCIDRs;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String securityGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vSwitchId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VSwitchIdList")
    private java.util.List<String> vSwitchIdList;

    private UpdateResourceDLinkRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.resourceId = builder.resourceId;
        this.destinationCIDRs = builder.destinationCIDRs;
        this.securityGroupId = builder.securityGroupId;
        this.vSwitchId = builder.vSwitchId;
        this.vSwitchIdList = builder.vSwitchIdList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateResourceDLinkRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return resourceId
     */
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * @return destinationCIDRs
     */
    public String getDestinationCIDRs() {
        return this.destinationCIDRs;
    }

    /**
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    /**
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    /**
     * @return vSwitchIdList
     */
    public java.util.List<String> getVSwitchIdList() {
        return this.vSwitchIdList;
    }

    public static final class Builder extends Request.Builder<UpdateResourceDLinkRequest, Builder> {
        private String clusterId; 
        private String resourceId; 
        private String destinationCIDRs; 
        private String securityGroupId; 
        private String vSwitchId; 
        private java.util.List<String> vSwitchIdList; 

        private Builder() {
            super();
        } 

        private Builder(UpdateResourceDLinkRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.resourceId = request.resourceId;
            this.destinationCIDRs = request.destinationCIDRs;
            this.securityGroupId = request.securityGroupId;
            this.vSwitchId = request.vSwitchId;
            this.vSwitchIdList = request.vSwitchIdList;
        } 

        /**
         * <p>The ID of the region to which the resource group belongs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The ID of the resource group. For more information about how to query the ID of a resource group, see <a href="https://help.aliyun.com/document_detail/412133.html">ListResources</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>iot</p>
         */
        public Builder resourceId(String resourceId) {
            this.putPathParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * <p>The CIDR blocks of the clients that you want to connect to. After this parameter is specified, the CIDR blocks are added to the back-to-origin route of the server. Either this parameter or the VSwitchIdList parameter can be used to determine CIDR blocks.</p>
         * 
         * <strong>example:</strong>
         * <p>72.16.0.0/16</p>
         */
        public Builder destinationCIDRs(String destinationCIDRs) {
            this.putBodyParameter("DestinationCIDRs", destinationCIDRs);
            this.destinationCIDRs = destinationCIDRs;
            return this;
        }

        /**
         * <p>The ID of the security group to which the Elastic Compute Service (ECS) instance belongs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-bp149cedsfx2rfspd2d</p>
         */
        public Builder securityGroupId(String securityGroupId) {
            this.putBodyParameter("SecurityGroupId", securityGroupId);
            this.securityGroupId = securityGroupId;
            return this;
        }

        /**
         * <p>The ID of the peer primary vSwitch. After this parameter is specified, an elastic network interface (ENI) is created in the VSwitch.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-uf66uio7md****</p>
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putBodyParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * <p>The vSwitches of the clients that you want to connect to. After this parameter is specified, the CIDR blocks of these vSwitches are added to the back-to-origin route of the server.</p>
         */
        public Builder vSwitchIdList(java.util.List<String> vSwitchIdList) {
            this.putBodyParameter("VSwitchIdList", vSwitchIdList);
            this.vSwitchIdList = vSwitchIdList;
            return this;
        }

        @Override
        public UpdateResourceDLinkRequest build() {
            return new UpdateResourceDLinkRequest(this);
        } 

    } 

}
