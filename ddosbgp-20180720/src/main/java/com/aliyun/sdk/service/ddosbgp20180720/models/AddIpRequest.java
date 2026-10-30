// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosbgp20180720.models;

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
 * {@link AddIpRequest} extends {@link RequestModel}
 *
 * <p>AddIpRequest</p>
 */
public class AddIpRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpList")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ipList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    @Deprecated
    private String resourceGroupId;

    private AddIpRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.ipList = builder.ipList;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddIpRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return ipList
     */
    public String getIpList() {
        return this.ipList;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public static final class Builder extends Request.Builder<AddIpRequest, Builder> {
        private String instanceId; 
        private String ipList; 
        private String regionId; 
        private String resourceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(AddIpRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.ipList = request.ipList;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
        } 

        /**
         * <p>Instance ID of the Anti-DDoS Origin instance.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/118698.html">DescribeInstanceList</a> operation to query instance IDs of all Anti-DDoS Origin instances.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ddosbgp-cn-npk1z7t9****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The list of IP addresses to add to the Anti-DDoS Origin instance for protection. The list is represented in a character string format converted from a JSON array. Each element in the JSON array is a structure that contains the following fields:</p>
         * <ul>
         * <li><p><strong>ip</strong>: String | Required | The IP address to add.</p>
         * </li>
         * <li><p><strong>member_uid</strong>: String | Optional | The member accounts to which the asset belongs. This field is required only when you add an asset under member accounts. Example: [{&quot;ip&quot;:&quot;121.41.XX.XX&quot;,&quot;member_uid&quot;:&quot;120100811162****&quot;}]</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;ip&quot;:&quot;121.41.XX.XX&quot;},{&quot;ip&quot;:&quot;121.42.XX.XX&quot;}]</p>
         */
        public Builder ipList(String ipList) {
            this.putQueryParameter("IpList", ipList);
            this.ipList = ipList;
            return this;
        }

        /**
         * <p>The region ID of the Anti-DDoS Origin instance.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/118703.html">DescribeRegions</a> operation to query all regions supported by Anti-DDoS Origin.</p>
         * </blockquote>
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
         * <p>The ID of the resource group to which the Anti-DDoS Origin instance belongs in Resource Management. Default value: empty, which indicates the default resource group.</p>
         * <p>For more information about resource groups, see <a href="https://help.aliyun.com/document_detail/94485.html">Create a resource group</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfm2pz25js****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        @Override
        public AddIpRequest build() {
            return new AddIpRequest(this);
        } 

    } 

}
