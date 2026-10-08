// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
 * {@link DescribeRCInstancesRequest} extends {@link RequestModel}
 *
 * <p>DescribeRCInstancesRequest</p>
 */
public class DescribeRCInstancesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DescriptionForFuzzy")
    private String descriptionForFuzzy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HostIp")
    private String hostIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageId")
    private String imageId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceIds")
    private String instanceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceName")
    private String instanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PublicIp")
    private String publicIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private String tag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcId")
    private String vpcId;

    private DescribeRCInstancesRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.description = builder.description;
        this.descriptionForFuzzy = builder.descriptionForFuzzy;
        this.hostIp = builder.hostIp;
        this.imageId = builder.imageId;
        this.instanceId = builder.instanceId;
        this.instanceIds = builder.instanceIds;
        this.instanceName = builder.instanceName;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.publicIp = builder.publicIp;
        this.regionId = builder.regionId;
        this.status = builder.status;
        this.tag = builder.tag;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRCInstancesRequest create() {
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
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return descriptionForFuzzy
     */
    public String getDescriptionForFuzzy() {
        return this.descriptionForFuzzy;
    }

    /**
     * @return hostIp
     */
    public String getHostIp() {
        return this.hostIp;
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return instanceIds
     */
    public String getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return publicIp
     */
    public String getPublicIp() {
        return this.publicIp;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return tag
     */
    public String getTag() {
        return this.tag;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    public static final class Builder extends Request.Builder<DescribeRCInstancesRequest, Builder> {
        private String clusterId; 
        private String description; 
        private String descriptionForFuzzy; 
        private String hostIp; 
        private String imageId; 
        private String instanceId; 
        private String instanceIds; 
        private String instanceName; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String publicIp; 
        private String regionId; 
        private String status; 
        private String tag; 
        private String vpcId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeRCInstancesRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.description = request.description;
            this.descriptionForFuzzy = request.descriptionForFuzzy;
            this.hostIp = request.hostIp;
            this.imageId = request.imageId;
            this.instanceId = request.instanceId;
            this.instanceIds = request.instanceIds;
            this.instanceName = request.instanceName;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.publicIp = request.publicIp;
            this.regionId = request.regionId;
            this.status = request.status;
            this.tag = request.tag;
            this.vpcId = request.vpcId;
        } 

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * DescriptionForFuzzy.
         */
        public Builder descriptionForFuzzy(String descriptionForFuzzy) {
            this.putQueryParameter("DescriptionForFuzzy", descriptionForFuzzy);
            this.descriptionForFuzzy = descriptionForFuzzy;
            return this;
        }

        /**
         * <p>Queries instances by host IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>172.16.XX.XX</p>
         */
        public Builder hostIp(String hostIp) {
            this.putQueryParameter("HostIp", hostIp);
            this.hostIp = hostIp;
            return this;
        }

        /**
         * ImageId.
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * <p>The instance ID. This parameter is used to query a single instance.</p>
         * <blockquote>
         * <p>If no instance ID is specified (neither <strong>InstanceId</strong> nor <strong>InstanceIds</strong> is passed), the operation returns detailed information about all RDS Custom instances in the specified region.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>rc-i2p26bde8bckf141****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The instance IDs.</p>
         * <p>This parameter is used to query multiple instances at a time. Separate multiple instance IDs with commas (,). A maximum of 100 IDs are supported. Input format: <code>[&quot;InstanceID1&quot;,&quot;InstanceID2&quot;]</code>.</p>
         * <blockquote>
         * <p>If both <strong>InstanceIds</strong> and <strong>InstanceId</strong> are specified, the value of <strong>InstanceIds</strong> takes precedence.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>[&quot;rc-i2p26bde8bckf141****&quot;,&quot;rc-l1753m982otq2s2m****&quot;]</p>
         */
        public Builder instanceIds(String instanceIds) {
            this.putQueryParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * <p>The instance name.</p>
         * 
         * <strong>example:</strong>
         * <p>k8s-node</p>
         */
        public Builder instanceName(String instanceName) {
            this.putQueryParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * <p>The page number of the instance status list.</p>
         * <p>Minimum value: 1. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page for a paged query.</p>
         * <p>Maximum value: 100. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Queries instances by public IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>121.89.XX.XX</p>
         */
        public Builder publicIp(String publicIp) {
            this.putQueryParameter("PublicIp", publicIp);
            this.publicIp = publicIp;
            return this;
        }

        /**
         * <p>The region ID. This parameter is required.</p>
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
         * <p>The instance status. Valid values:</p>
         * <ul>
         * <li><strong>Pending</strong>: Being created.</li>
         * <li><strong>Running</strong>: Running.</li>
         * <li><strong>Starting</strong>: Being started.</li>
         * <li><strong>Stopping</strong>: Being stopped.</li>
         * <li><strong>Stopped</strong>: Stopped.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>Queries instances by the specified tag. Input format: <code>{&quot;TagKey&quot;:&quot;TagValue&quot;}</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;testRC&quot;:&quot;test01&quot;}</p>
         */
        public Builder tag(String tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>The ID of the virtual private cloud (VPC).</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-uf6f7l4fg90****</p>
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        @Override
        public DescribeRCInstancesRequest build() {
            return new DescribeRCInstancesRequest(this);
        } 

    } 

}
