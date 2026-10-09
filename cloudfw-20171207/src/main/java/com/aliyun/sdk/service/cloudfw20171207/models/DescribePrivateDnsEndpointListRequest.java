// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link DescribePrivateDnsEndpointListRequest} extends {@link RequestModel}
 *
 * <p>DescribePrivateDnsEndpointListRequest</p>
 */
public class DescribePrivateDnsEndpointListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccessInstanceId")
    private String accessInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccessInstanceName")
    private String accessInstanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FirewallType")
    private String firewallType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MemberUid")
    private Long memberUid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Integer pageNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionNo")
    private String regionNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcId")
    private String vpcId;

    private DescribePrivateDnsEndpointListRequest(Builder builder) {
        super(builder);
        this.accessInstanceId = builder.accessInstanceId;
        this.accessInstanceName = builder.accessInstanceName;
        this.firewallType = builder.firewallType;
        this.memberUid = builder.memberUid;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.regionNo = builder.regionNo;
        this.status = builder.status;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePrivateDnsEndpointListRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessInstanceId
     */
    public String getAccessInstanceId() {
        return this.accessInstanceId;
    }

    /**
     * @return accessInstanceName
     */
    public String getAccessInstanceName() {
        return this.accessInstanceName;
    }

    /**
     * @return firewallType
     */
    public String getFirewallType() {
        return this.firewallType;
    }

    /**
     * @return memberUid
     */
    public Long getMemberUid() {
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
     * @return regionNo
     */
    public String getRegionNo() {
        return this.regionNo;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    public static final class Builder extends Request.Builder<DescribePrivateDnsEndpointListRequest, Builder> {
        private String accessInstanceId; 
        private String accessInstanceName; 
        private String firewallType; 
        private Long memberUid; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String regionNo; 
        private String status; 
        private String vpcId; 

        private Builder() {
            super();
        } 

        private Builder(DescribePrivateDnsEndpointListRequest request) {
            super(request);
            this.accessInstanceId = request.accessInstanceId;
            this.accessInstanceName = request.accessInstanceName;
            this.firewallType = request.firewallType;
            this.memberUid = request.memberUid;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.regionNo = request.regionNo;
            this.status = request.status;
            this.vpcId = request.vpcId;
        } 

        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>pd-12345</p>
         */
        public Builder accessInstanceId(String accessInstanceId) {
            this.putQueryParameter("AccessInstanceId", accessInstanceId);
            this.accessInstanceId = accessInstanceId;
            return this;
        }

        /**
         * <p>The name of the private instance.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder accessInstanceName(String accessInstanceName) {
            this.putQueryParameter("AccessInstanceName", accessInstanceName);
            this.accessInstanceName = accessInstanceName;
            return this;
        }

        /**
         * <p>The type of Cloud Firewall. Valid values:</p>
         * <ul>
         * <li><p><strong>internet</strong></p>
         * </li>
         * <li><p><strong>vpc</strong></p>
         * </li>
         * <li><p><strong>nat</strong></p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>vpc</p>
         */
        public Builder firewallType(String firewallType) {
            this.putQueryParameter("FirewallType", firewallType);
            this.firewallType = firewallType;
            return this;
        }

        /**
         * <p>The UID of the member account.</p>
         * 
         * <strong>example:</strong>
         * <p>135809047715****</p>
         */
        public Builder memberUid(Long memberUid) {
            this.putQueryParameter("MemberUid", memberUid);
            this.memberUid = memberUid;
            return this;
        }

        /**
         * <p>The page number.</p>
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
         * <p>The number of the page to return.</p>
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
         * <p>The ID of the region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionNo(String regionNo) {
            this.putQueryParameter("RegionNo", regionNo);
            this.regionNo = regionNo;
            return this;
        }

        /**
         * <p>The status of the instance. Valid values:</p>
         * <ul>
         * <li><p><strong>creating</strong>: The instance is being created.</p>
         * </li>
         * <li><p><strong>deleting</strong>: The instance is being deleted.</p>
         * </li>
         * <li><p><strong>normal</strong>: The instance is running as expected.</p>
         * </li>
         * <li><p><strong>updating</strong>: The instance is being updated.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The ID of the VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-8vbwbo90rq0anm6t****</p>
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        @Override
        public DescribePrivateDnsEndpointListRequest build() {
            return new DescribePrivateDnsEndpointListRequest(this);
        } 

    } 

}
