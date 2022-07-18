// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateResourceDLinkRequest} extends {@link RequestModel}
 *
 * <p>UpdateResourceDLinkRequest</p>
 */
public class UpdateResourceDLinkRequest extends Request {
    @Path
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Path
    @NameInMap("ResourceId")
    @Validation(required = true)
    private String resourceId;

    @Body
    @NameInMap("DestinationCIDRs")
    private String destinationCIDRs;

    @Body
    @NameInMap("SecurityGroupId")
    @Validation(required = true)
    private String securityGroupId;

    @Body
    @NameInMap("VSwitchId")
    @Validation(required = true)
    private String vSwitchId;

    @Body
    @NameInMap("VSwitchIdList")
    private java.util.List < String > vSwitchIdList;

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
    public java.util.List < String > getVSwitchIdList() {
        return this.vSwitchIdList;
    }

    public static final class Builder extends Request.Builder<UpdateResourceDLinkRequest, Builder> {
        private String clusterId; 
        private String resourceId; 
        private String destinationCIDRs; 
        private String securityGroupId; 
        private String vSwitchId; 
        private java.util.List < String > vSwitchIdList; 

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
         * 资源组所在的集群ID
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * 资源组的Id
         */
        public Builder resourceId(String resourceId) {
            this.putPathParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * 要打通的客户端的网段信息，会将该网段加入到服务端的回包路由中，与VSwitchIdList可二选一
         */
        public Builder destinationCIDRs(String destinationCIDRs) {
            this.putBodyParameter("DestinationCIDRs", destinationCIDRs);
            this.destinationCIDRs = destinationCIDRs;
            return this;
        }

        /**
         * 客户端ECS归属的安全组
         */
        public Builder securityGroupId(String securityGroupId) {
            this.putBodyParameter("SecurityGroupId", securityGroupId);
            this.securityGroupId = securityGroupId;
            return this;
        }

        /**
         * 对端的主VSwitchID，会在该vswitch中创建ENI
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putBodyParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * 要打通的客户端的vswitch列表，会将这些vswitch对应的网段加入到服务端的回包路由中
         */
        public Builder vSwitchIdList(java.util.List < String > vSwitchIdList) {
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
