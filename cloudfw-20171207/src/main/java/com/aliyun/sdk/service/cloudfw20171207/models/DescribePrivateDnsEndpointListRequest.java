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
         * AccessInstanceId.
         */
        public Builder accessInstanceId(String accessInstanceId) {
            this.putQueryParameter("AccessInstanceId", accessInstanceId);
            this.accessInstanceId = accessInstanceId;
            return this;
        }

        /**
         * AccessInstanceName.
         */
        public Builder accessInstanceName(String accessInstanceName) {
            this.putQueryParameter("AccessInstanceName", accessInstanceName);
            this.accessInstanceName = accessInstanceName;
            return this;
        }

        /**
         * FirewallType.
         */
        public Builder firewallType(String firewallType) {
            this.putQueryParameter("FirewallType", firewallType);
            this.firewallType = firewallType;
            return this;
        }

        /**
         * MemberUid.
         */
        public Builder memberUid(Long memberUid) {
            this.putQueryParameter("MemberUid", memberUid);
            this.memberUid = memberUid;
            return this;
        }

        /**
         * PageNo.
         */
        public Builder pageNo(Integer pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RegionNo.
         */
        public Builder regionNo(String regionNo) {
            this.putQueryParameter("RegionNo", regionNo);
            this.regionNo = regionNo;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * VpcId.
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
