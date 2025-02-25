// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosbgp20180720.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribePackIpListRequest} extends {@link RequestModel}
 *
 * <p>DescribePackIpListRequest</p>
 */
public class DescribePackIpListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ip")
    private String ip;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MemberUid")
    private String memberUid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNo")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductName")
    private String productName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    private DescribePackIpListRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.ip = builder.ip;
        this.memberUid = builder.memberUid;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.productName = builder.productName;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePackIpListRequest create() {
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
     * @return ip
     */
    public String getIp() {
        return this.ip;
    }

    /**
     * @return memberUid
     */
    public String getMemberUid() {
        return this.memberUid;
    }

    /**
     * @return pageNo
     */
    public Integer getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return productName
     */
    public String getProductName() {
        return this.productName;
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

    public static final class Builder extends Request.Builder<DescribePackIpListRequest, Builder> {
        private String instanceId; 
        private String ip; 
        private String memberUid; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String productName; 
        private String regionId; 
        private String resourceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(DescribePackIpListRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.ip = request.ip;
            this.memberUid = request.memberUid;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.productName = request.productName;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
        } 

        /**
         * <p>The ID of the Anti-DDoS Origin instance to query.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/118698.html">DescribeInstanceList</a> operation to query the IDs of all Anti-DDoS Origin instances.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ddosbgp-cn-n6w1r7nz****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The protected IP address to query.</p>
         * 
         * <strong>example:</strong>
         * <p>47.98.XX.XX</p>
         */
        public Builder ip(String ip) {
            this.putQueryParameter("Ip", ip);
            this.ip = ip;
            return this;
        }

        /**
         * <p>The ID of the member.</p>
         * 
         * <strong>example:</strong>
         * <p>170858869679****</p>
         */
        public Builder memberUid(String memberUid) {
            this.putQueryParameter("MemberUid", memberUid);
            this.memberUid = memberUid;
            return this;
        }

        /**
         * <p>The number of the page to return.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNo(Integer pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * <p>The number of entries to return on each page.</p>
         * <p>This parameter is required.</p>
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
         * <p>The type of the cloud asset to which the protected IP address to query belongs. Valid values:</p>
         * <ul>
         * <li><strong>ECS</strong>: an Elastic Compute Service (ECS) instance.</li>
         * <li><strong>SLB</strong>: a Classic Load Balancer (CLB) instance, originally called a Server Load Balancer (SLB) instance.</li>
         * <li><strong>EIP</strong>: an elastic IP address (EIP). An Internet-facing Application Load Balancer (ALB) instance uses an EIP. If the IP address belongs to the Internet-facing ALB instance, set this parameter to EIP.</li>
         * <li><strong>WAF</strong>: a Web Application Firewall (WAF) instance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ECS</p>
         */
        public Builder productName(String productName) {
            this.putQueryParameter("ProductName", productName);
            this.productName = productName;
            return this;
        }

        /**
         * <p>The ID of the region where the Anti-DDoS Origin instance resides.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/118703.html">DescribeRegions</a> operation to query the most recent region list.</p>
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
         * <p>The ID of the resource group to which the Anti-DDoS Origin instance belongs in Resource Management.</p>
         * <p>If you do not specify this parameter, the instance belongs to the default resource group.</p>
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
        public DescribePackIpListRequest build() {
            return new DescribePackIpListRequest(this);
        } 

    } 

}
