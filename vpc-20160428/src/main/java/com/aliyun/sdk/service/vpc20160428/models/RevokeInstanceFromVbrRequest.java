// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

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
 * {@link RevokeInstanceFromVbrRequest} extends {@link RequestModel}
 *
 * <p>RevokeInstanceFromVbrRequest</p>
 */
public class RevokeInstanceFromVbrRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GrantType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String grantType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VbrInstanceIds")
    private java.util.List<String> vbrInstanceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VbrOwnerUid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vbrOwnerUid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VbrRegionNo")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vbrRegionNo;

    private RevokeInstanceFromVbrRequest(Builder builder) {
        super(builder);
        this.grantType = builder.grantType;
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
        this.vbrInstanceIds = builder.vbrInstanceIds;
        this.vbrOwnerUid = builder.vbrOwnerUid;
        this.vbrRegionNo = builder.vbrRegionNo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RevokeInstanceFromVbrRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return grantType
     */
    public String getGrantType() {
        return this.grantType;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return vbrInstanceIds
     */
    public java.util.List<String> getVbrInstanceIds() {
        return this.vbrInstanceIds;
    }

    /**
     * @return vbrOwnerUid
     */
    public String getVbrOwnerUid() {
        return this.vbrOwnerUid;
    }

    /**
     * @return vbrRegionNo
     */
    public String getVbrRegionNo() {
        return this.vbrRegionNo;
    }

    public static final class Builder extends Request.Builder<RevokeInstanceFromVbrRequest, Builder> {
        private String grantType; 
        private String instanceId; 
        private String regionId; 
        private java.util.List<String> vbrInstanceIds; 
        private String vbrOwnerUid; 
        private String vbrRegionNo; 

        private Builder() {
            super();
        } 

        private Builder(RevokeInstanceFromVbrRequest request) {
            super(request);
            this.grantType = request.grantType;
            this.instanceId = request.instanceId;
            this.regionId = request.regionId;
            this.vbrInstanceIds = request.vbrInstanceIds;
            this.vbrOwnerUid = request.vbrOwnerUid;
            this.vbrRegionNo = request.vbrRegionNo;
        } 

        /**
         * <p>The scope of VBR instances from which the authorization of the VPC-connected instance is revoked. Valid values:</p>
         * <ul>
         * <li><p><strong>ALL</strong>: revokes the authorization between the VPC-connected instance and all VBR instances in the specified region. In this case, the <strong>VbrInstanceIds</strong> parameter can be left empty.</p>
         * </li>
         * <li><p><strong>Specify</strong>: revokes the authorization between the VPC-connected instance and the specified VBR instances. In this case, the <strong>VbrInstanceIds</strong> parameter is required.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ALL</p>
         */
        public Builder grantType(String grantType) {
            this.putQueryParameter("GrantType", grantType);
            this.grantType = grantType;
            return this;
        }

        /**
         * <p>The VPC-connected instance ID for which you want to revoke the authorization.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp1brjuegjc88v3u9****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The region ID of the VPC-connected instance for which you want to revoke the authorization. You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query region IDs.</p>
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
         * <p>The list of VBR instance IDs from which the authorization of the VPC-connected instance is revoked.</p>
         */
        public Builder vbrInstanceIds(java.util.List<String> vbrInstanceIds) {
            String vbrInstanceIdsShrink = shrink(vbrInstanceIds, "VbrInstanceIds", "simple");
            this.putQueryParameter("VbrInstanceIds", vbrInstanceIdsShrink);
            this.vbrInstanceIds = vbrInstanceIds;
            return this;
        }

        /**
         * <p>The ID of the Alibaba Cloud account that owns the VBR instance from which the authorization is revoked.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1210123456123456</p>
         */
        public Builder vbrOwnerUid(String vbrOwnerUid) {
            this.putQueryParameter("VbrOwnerUid", vbrOwnerUid);
            this.vbrOwnerUid = vbrOwnerUid;
            return this;
        }

        /**
         * <p>The region ID of the VBR instance from which the authorization of the VPC-connected instance is revoked.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder vbrRegionNo(String vbrRegionNo) {
            this.putQueryParameter("VbrRegionNo", vbrRegionNo);
            this.vbrRegionNo = vbrRegionNo;
            return this;
        }

        @Override
        public RevokeInstanceFromVbrRequest build() {
            return new RevokeInstanceFromVbrRequest(this);
        } 

    } 

}
