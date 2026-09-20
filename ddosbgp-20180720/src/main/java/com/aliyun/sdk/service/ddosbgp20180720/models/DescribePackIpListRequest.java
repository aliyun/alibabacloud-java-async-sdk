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
    @Deprecated
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
         * <p>Call <a href="https://help.aliyun.com/document_detail/118698.html">DescribeInstanceList</a> to query the IDs of all Anti-DDoS Origin instances.</p>
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
         * <p>The UID of the member account.</p>
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
         * <p>The number of protected IP addresses to return on each page. The maximum value is 50.</p>
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
         * <p>The type of the cloud asset to which the protected IP address belongs. Valid values:</p>
         * <ul>
         * <li><p><strong>ECS</strong>: an Elastic Compute Service (ECS) instance.</p>
         * </li>
         * <li><p><strong>SLB</strong>: a Classic Load Balancer (CLB) instance.</p>
         * </li>
         * <li><p><strong>EIP</strong>: an Elastic IP Address (EIP) instance. Because Application Load Balancer (ALB) instances use EIPs, query the public IP address of an ALB instance using the EIP.</p>
         * </li>
         * <li><p><strong>WAF</strong>: a Web Application Firewall (WAF) instance.</p>
         * </li>
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
         * <p>The region ID of the Anti-DDoS Origin instance.</p>
         * <blockquote>
         * <p>Call <a href="https://help.aliyun.com/document_detail/118703.html">DescribeRegions</a> to query the IDs of all regions that Anti-DDoS Origin supports.</p>
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
         * <p>If you do not set this parameter, the instance belongs to the default resource group.</p>
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
