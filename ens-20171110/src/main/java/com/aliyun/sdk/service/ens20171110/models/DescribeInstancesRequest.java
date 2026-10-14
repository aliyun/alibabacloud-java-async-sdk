// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link DescribeInstancesRequest} extends {@link RequestModel}
 *
 * <p>DescribeInstancesRequest</p>
 */
public class DescribeInstancesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EipAddresses")
    private java.util.List<String> eipAddresses;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnsRegionId")
    private String ensRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnsRegionIds")
    private String ensRegionIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnsServiceId")
    private String ensServiceId;

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
    @com.aliyun.core.annotation.NameInMap("InstanceResourceType")
    private String instanceResourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceType")
    private String instanceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IntranetIp")
    private String intranetIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetworkId")
    private String networkId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderByParams")
    private String orderByParams;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private String pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SearchKey")
    private String searchKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
    private String securityGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceStatus")
    private java.util.List<String> serviceStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.List<Tags> tags;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    private String vSwitchId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpdId")
    private String vpdId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpdVSwitchId")
    private String vpdVSwitchId;

    private DescribeInstancesRequest(Builder builder) {
        super(builder);
        this.eipAddresses = builder.eipAddresses;
        this.ensRegionId = builder.ensRegionId;
        this.ensRegionIds = builder.ensRegionIds;
        this.ensServiceId = builder.ensServiceId;
        this.imageId = builder.imageId;
        this.instanceId = builder.instanceId;
        this.instanceIds = builder.instanceIds;
        this.instanceName = builder.instanceName;
        this.instanceResourceType = builder.instanceResourceType;
        this.instanceType = builder.instanceType;
        this.intranetIp = builder.intranetIp;
        this.networkId = builder.networkId;
        this.orderByParams = builder.orderByParams;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.searchKey = builder.searchKey;
        this.securityGroupId = builder.securityGroupId;
        this.serviceStatus = builder.serviceStatus;
        this.status = builder.status;
        this.tags = builder.tags;
        this.vSwitchId = builder.vSwitchId;
        this.vpdId = builder.vpdId;
        this.vpdVSwitchId = builder.vpdVSwitchId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstancesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return eipAddresses
     */
    public java.util.List<String> getEipAddresses() {
        return this.eipAddresses;
    }

    /**
     * @return ensRegionId
     */
    public String getEnsRegionId() {
        return this.ensRegionId;
    }

    /**
     * @return ensRegionIds
     */
    public String getEnsRegionIds() {
        return this.ensRegionIds;
    }

    /**
     * @return ensServiceId
     */
    public String getEnsServiceId() {
        return this.ensServiceId;
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
     * @return instanceResourceType
     */
    public String getInstanceResourceType() {
        return this.instanceResourceType;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return intranetIp
     */
    public String getIntranetIp() {
        return this.intranetIp;
    }

    /**
     * @return networkId
     */
    public String getNetworkId() {
        return this.networkId;
    }

    /**
     * @return orderByParams
     */
    public String getOrderByParams() {
        return this.orderByParams;
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
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return searchKey
     */
    public String getSearchKey() {
        return this.searchKey;
    }

    /**
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    /**
     * @return serviceStatus
     */
    public java.util.List<String> getServiceStatus() {
        return this.serviceStatus;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return tags
     */
    public java.util.List<Tags> getTags() {
        return this.tags;
    }

    /**
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    /**
     * @return vpdId
     */
    public String getVpdId() {
        return this.vpdId;
    }

    /**
     * @return vpdVSwitchId
     */
    public String getVpdVSwitchId() {
        return this.vpdVSwitchId;
    }

    public static final class Builder extends Request.Builder<DescribeInstancesRequest, Builder> {
        private java.util.List<String> eipAddresses; 
        private String ensRegionId; 
        private String ensRegionIds; 
        private String ensServiceId; 
        private String imageId; 
        private String instanceId; 
        private String instanceIds; 
        private String instanceName; 
        private String instanceResourceType; 
        private String instanceType; 
        private String intranetIp; 
        private String networkId; 
        private String orderByParams; 
        private Integer pageNumber; 
        private String pageSize; 
        private String searchKey; 
        private String securityGroupId; 
        private java.util.List<String> serviceStatus; 
        private String status; 
        private java.util.List<Tags> tags; 
        private String vSwitchId; 
        private String vpdId; 
        private String vpdVSwitchId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeInstancesRequest request) {
            super(request);
            this.eipAddresses = request.eipAddresses;
            this.ensRegionId = request.ensRegionId;
            this.ensRegionIds = request.ensRegionIds;
            this.ensServiceId = request.ensServiceId;
            this.imageId = request.imageId;
            this.instanceId = request.instanceId;
            this.instanceIds = request.instanceIds;
            this.instanceName = request.instanceName;
            this.instanceResourceType = request.instanceResourceType;
            this.instanceType = request.instanceType;
            this.intranetIp = request.intranetIp;
            this.networkId = request.networkId;
            this.orderByParams = request.orderByParams;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.searchKey = request.searchKey;
            this.securityGroupId = request.securityGroupId;
            this.serviceStatus = request.serviceStatus;
            this.status = request.status;
            this.tags = request.tags;
            this.vSwitchId = request.vSwitchId;
            this.vpdId = request.vpdId;
            this.vpdVSwitchId = request.vpdVSwitchId;
        } 

        /**
         * <p>The list of EIP addresses used to filter instances.</p>
         */
        public Builder eipAddresses(java.util.List<String> eipAddresses) {
            String eipAddressesShrink = shrink(eipAddresses, "EipAddresses", "json");
            this.putQueryParameter("EipAddresses", eipAddressesShrink);
            this.eipAddresses = eipAddresses;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing-cmcc</p>
         */
        public Builder ensRegionId(String ensRegionId) {
            this.putQueryParameter("EnsRegionId", ensRegionId);
            this.ensRegionId = ensRegionId;
            return this;
        }

        /**
         * <p>The list of edge zone IDs. This parameter is a formatted JSON array that contains up to 100 IDs separated by commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;cn-suzhou-telecom&quot;,&quot;cn-chengdu-telecom&quot;]</p>
         */
        public Builder ensRegionIds(String ensRegionIds) {
            this.putQueryParameter("EnsRegionIds", ensRegionIds);
            this.ensRegionIds = ensRegionIds;
            return this;
        }

        /**
         * <p>The Edge Node Service ID. You can use this ID to query the instances created under the edge service.</p>
         * 
         * <strong>example:</strong>
         * <p>ens-20190730202316s****</p>
         */
        public Builder ensServiceId(String ensServiceId) {
            this.putQueryParameter("EnsServiceId", ensServiceId);
            this.ensServiceId = ensServiceId;
            return this;
        }

        /**
         * <p>The image ID.</p>
         * 
         * <strong>example:</strong>
         * <p>centos_6_08_64_20G_alibase_****</p>
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>i-5iqczfxps7csjrxeca****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The list of instance IDs. This parameter is a formatted JSON array that contains up to 100 IDs separated by commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;i-5iqczfxps7csjrxeca07****&quot;, &quot;i-5iqczfxps7csjrxeca07****&quot;]</p>
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
         * <p>TestName</p>
         */
        public Builder instanceName(String instanceName) {
            this.putQueryParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * <p>The filter type. Valid values:</p>
         * 
         * <strong>example:</strong>
         * <p>EnsService</p>
         */
        public Builder instanceResourceType(String instanceResourceType) {
            this.putQueryParameter("InstanceResourceType", instanceResourceType);
            this.instanceResourceType = instanceResourceType;
            return this;
        }

        /**
         * <p>The instance type.</p>
         * 
         * <strong>example:</strong>
         * <p>ens.se1.tiny</p>
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * <p>The internal IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>47.100.XX.XX</p>
         */
        public Builder intranetIp(String intranetIp) {
            this.putQueryParameter("IntranetIp", intranetIp);
            this.intranetIp = intranetIp;
            return this;
        }

        /**
         * <p>The network ID.</p>
         * 
         * <strong>example:</strong>
         * <p>n-2zeuphj08tt7q3brd****</p>
         */
        public Builder networkId(String networkId) {
            this.putQueryParameter("NetworkId", networkId);
            this.networkId = networkId;
            return this;
        }

        /**
         * <p>The sorting parameter in JSON format.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;InstanceNameSort&quot;: &quot;asc&quot;,
         *     &quot;ExpireTimeSort&quot;: &quot;asc&quot;,
         *     &quot;CreationTimeSort&quot;: &quot;desc&quot;,
         *     &quot;EnsRegionId&quot;: &quot;desc&quot;
         * }</p>
         */
        public Builder orderByParams(String orderByParams) {
            this.putQueryParameter("OrderByParams", orderByParams);
            this.orderByParams = orderByParams;
            return this;
        }

        /**
         * <p>The page number of the instance status list. The value starts from <strong>1</strong>.</p>
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
         * <p>The number of entries per page for a paged query. Maximum value: <strong>100</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The search keyword. Supports parameters such as <strong>ip</strong>, <strong>InstanceName</strong>, and <strong>InstanceId</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>Joshua</p>
         */
        public Builder searchKey(String searchKey) {
            this.putQueryParameter("SearchKey", searchKey);
            this.searchKey = searchKey;
            return this;
        }

        /**
         * <p>The security group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-5kyicq2kfcapxrdds6tar7jqb</p>
         */
        public Builder securityGroupId(String securityGroupId) {
            this.putQueryParameter("SecurityGroupId", securityGroupId);
            this.securityGroupId = securityGroupId;
            return this;
        }

        /**
         * <p>The business status of the instance, which does not represent the actual running status of the instance.</p>
         */
        public Builder serviceStatus(java.util.List<String> serviceStatus) {
            String serviceStatusShrink = shrink(serviceStatus, "ServiceStatus", "json");
            this.putQueryParameter("ServiceStatus", serviceStatusShrink);
            this.serviceStatus = serviceStatus;
            return this;
        }

        /**
         * <p>The instance status. Valid values:</p>
         * <ul>
         * <li>Running: Running.</li>
         * <li>Stopped: Stopped.</li>
         * <li>Expired: Expired.</li>
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
         * <p>The resource tags. This operation does not return tag information. Use this parameter in combination with the APIs in the tag category.</p>
         */
        public Builder tags(java.util.List<Tags> tags) {
            String tagsShrink = shrink(tags, "Tags", "json");
            this.putQueryParameter("Tags", tagsShrink);
            this.tags = tags;
            return this;
        }

        /**
         * <p>The vSwitch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-2zeh0r1pabwtg6wcs****</p>
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * <p>The VPD network ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vpd-5s7xxxxxxx</p>
         */
        public Builder vpdId(String vpdId) {
            this.putQueryParameter("VpdId", vpdId);
            this.vpdId = vpdId;
            return this;
        }

        /**
         * <p>The VPD vSwitch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-5s7xxxxxxx</p>
         */
        public Builder vpdVSwitchId(String vpdVSwitchId) {
            this.putQueryParameter("VpdVSwitchId", vpdVSwitchId);
            this.vpdVSwitchId = vpdVSwitchId;
            return this;
        }

        @Override
        public DescribeInstancesRequest build() {
            return new DescribeInstancesRequest(this);
        } 

    } 

    /**
     * 
     * {@link DescribeInstancesRequest} extends {@link TeaModel}
     *
     * <p>DescribeInstancesRequest</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(Tags model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key of the instance. Valid values of N: 1 to 20.</p>
             * 
             * <strong>example:</strong>
             * <p>tag</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value of the instance. Valid values of N: 1 to 20.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
}
