// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

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
 * {@link CreateCustomEndpointRequest} extends {@link RequestModel}
 *
 * <p>CreateCustomEndpointRequest</p>
 */
public class CreateCustomEndpointRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeAutoEnter")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean nodeAutoEnter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String nodeIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeRole")
    private String nodeRole;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vSwitchId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vpcId;

    private CreateCustomEndpointRequest(Builder builder) {
        super(builder);
        this.DBInstanceName = builder.DBInstanceName;
        this.name = builder.name;
        this.nodeAutoEnter = builder.nodeAutoEnter;
        this.nodeIds = builder.nodeIds;
        this.nodeRole = builder.nodeRole;
        this.regionId = builder.regionId;
        this.vSwitchId = builder.vSwitchId;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCustomEndpointRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBInstanceName
     */
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return nodeAutoEnter
     */
    public Boolean getNodeAutoEnter() {
        return this.nodeAutoEnter;
    }

    /**
     * @return nodeIds
     */
    public String getNodeIds() {
        return this.nodeIds;
    }

    /**
     * @return nodeRole
     */
    public String getNodeRole() {
        return this.nodeRole;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    public static final class Builder extends Request.Builder<CreateCustomEndpointRequest, Builder> {
        private String DBInstanceName; 
        private String name; 
        private Boolean nodeAutoEnter; 
        private String nodeIds; 
        private String nodeRole; 
        private String regionId; 
        private String vSwitchId; 
        private String vpcId; 

        private Builder() {
            super();
        } 

        private Builder(CreateCustomEndpointRequest request) {
            super(request);
            this.DBInstanceName = request.DBInstanceName;
            this.name = request.name;
            this.nodeAutoEnter = request.nodeAutoEnter;
            this.nodeIds = request.nodeIds;
            this.nodeRole = request.nodeRole;
            this.regionId = request.regionId;
            this.vSwitchId = request.vSwitchId;
            this.vpcId = request.vpcId;
        } 

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pxc-hzjasd****</p>
         */
        public Builder DBInstanceName(String DBInstanceName) {
            this.putQueryParameter("DBInstanceName", DBInstanceName);
            this.DBInstanceName = DBInstanceName;
            return this;
        }

        /**
         * <p>The name of the access control instance. The name must be 2 to 128 characters in length and must start with a letter or a Chinese character. The name can contain digits, underscores (_), and hyphens (-).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ext-win-live-17</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>Specifies whether the node automatically joins the cluster and starts providing services after being added or recovered.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder nodeAutoEnter(Boolean nodeAutoEnter) {
            this.putQueryParameter("NodeAutoEnter", nodeAutoEnter);
            this.nodeAutoEnter = nodeAutoEnter;
            return this;
        }

        /**
         * <p>The IDs of the monitored nodes when RemindUnit (object type) is set to NODE (node). Separate multiple IDs with commas (,). A maximum of 50 nodes can be monitored by a single rule.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>r-bp1l5kfgw8****c3iv</p>
         */
        public Builder nodeIds(String nodeIds) {
            this.putQueryParameter("NodeIds", nodeIds);
            this.nodeIds = nodeIds;
            return this;
        }

        /**
         * <p>To query the metrics of a read-only node in a cloud-native read/write splitting architecture instance, specify <strong>READONLY</strong> for this parameter along with the specific <strong>NodeId</strong>.</p>
         * <blockquote>
         * <p> In other cases, you do not need to specify this parameter or you can specify <strong>MASTER</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>READONLY</p>
         */
        public Builder nodeRole(String nodeRole) {
            this.putQueryParameter("NodeRole", nodeRole);
            this.nodeRole = nodeRole;
            return this;
        }

        /**
         * <p>The region in which the instance resides.</p>
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
         * <p>The vSwitch ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-*********</p>
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * <p>The ID of the virtual private cloud (VPC) in which the endpoint resides.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp1ndoug37dtwoedlmru0</p>
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        @Override
        public CreateCustomEndpointRequest build() {
            return new CreateCustomEndpointRequest(this);
        } 

    } 

}
