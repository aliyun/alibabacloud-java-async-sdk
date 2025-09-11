// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hsm20231113.models;

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
 * {@link QuickDeployClusterRequest} extends {@link RequestModel}
 *
 * <p>QuickDeployClusterRequest</p>
 */
public class QuickDeployClusterRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CertManaged")
    private Boolean certManaged;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> instanceList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VSwitchIdList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> vSwitchIdList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vpcId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WhiteList")
    private java.util.List<String> whiteList;

    private QuickDeployClusterRequest(Builder builder) {
        super(builder);
        this.certManaged = builder.certManaged;
        this.clusterName = builder.clusterName;
        this.instanceList = builder.instanceList;
        this.regionId = builder.regionId;
        this.vSwitchIdList = builder.vSwitchIdList;
        this.vpcId = builder.vpcId;
        this.whiteList = builder.whiteList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuickDeployClusterRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return certManaged
     */
    public Boolean getCertManaged() {
        return this.certManaged;
    }

    /**
     * @return clusterName
     */
    public String getClusterName() {
        return this.clusterName;
    }

    /**
     * @return instanceList
     */
    public java.util.List<String> getInstanceList() {
        return this.instanceList;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return vSwitchIdList
     */
    public java.util.List<String> getVSwitchIdList() {
        return this.vSwitchIdList;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * @return whiteList
     */
    public java.util.List<String> getWhiteList() {
        return this.whiteList;
    }

    public static final class Builder extends Request.Builder<QuickDeployClusterRequest, Builder> {
        private Boolean certManaged; 
        private String clusterName; 
        private java.util.List<String> instanceList; 
        private String regionId; 
        private java.util.List<String> vSwitchIdList; 
        private String vpcId; 
        private java.util.List<String> whiteList; 

        private Builder() {
            super();
        } 

        private Builder(QuickDeployClusterRequest request) {
            super(request);
            this.certManaged = request.certManaged;
            this.clusterName = request.clusterName;
            this.instanceList = request.instanceList;
            this.regionId = request.regionId;
            this.vSwitchIdList = request.vSwitchIdList;
            this.vpcId = request.vpcId;
            this.whiteList = request.whiteList;
        } 

        /**
         * CertManaged.
         */
        public Builder certManaged(Boolean certManaged) {
            this.putQueryParameter("CertManaged", certManaged);
            this.certManaged = certManaged;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cluster_on****</p>
         */
        public Builder clusterName(String clusterName) {
            this.putQueryParameter("ClusterName", clusterName);
            this.clusterName = clusterName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder instanceList(java.util.List<String> instanceList) {
            String instanceListShrink = shrink(instanceList, "InstanceList", "json");
            this.putQueryParameter("InstanceList", instanceListShrink);
            this.instanceList = instanceList;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder vSwitchIdList(java.util.List<String> vSwitchIdList) {
            String vSwitchIdListShrink = shrink(vSwitchIdList, "VSwitchIdList", "json");
            this.putQueryParameter("VSwitchIdList", vSwitchIdListShrink);
            this.vSwitchIdList = vSwitchIdList;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-7xvkh90cw39p0****</p>
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        /**
         * WhiteList.
         */
        public Builder whiteList(java.util.List<String> whiteList) {
            String whiteListShrink = shrink(whiteList, "WhiteList", "json");
            this.putQueryParameter("WhiteList", whiteListShrink);
            this.whiteList = whiteList;
            return this;
        }

        @Override
        public QuickDeployClusterRequest build() {
            return new QuickDeployClusterRequest(this);
        } 

    } 

}
