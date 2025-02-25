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
 * {@link DescribeRCClustersRequest} extends {@link RequestModel}
 *
 * <p>DescribeRCClustersRequest</p>
 */
public class DescribeRCClustersRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Profile")
    private String profile;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcId")
    private String vpcId;

    private DescribeRCClustersRequest(Builder builder) {
        super(builder);
        this.profile = builder.profile;
        this.regionId = builder.regionId;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRCClustersRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return profile
     */
    public String getProfile() {
        return this.profile;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    public static final class Builder extends Request.Builder<DescribeRCClustersRequest, Builder> {
        private String profile; 
        private String regionId; 
        private String vpcId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeRCClustersRequest request) {
            super(request);
            this.profile = request.profile;
            this.regionId = request.regionId;
            this.vpcId = request.vpcId;
        } 

        /**
         * Profile.
         */
        public Builder profile(String profile) {
            this.putQueryParameter("Profile", profile);
            this.profile = profile;
            return this;
        }

        /**
         * <p>The region ID.</p>
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
         * VpcId.
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        @Override
        public DescribeRCClustersRequest build() {
            return new DescribeRCClustersRequest(this);
        } 

    } 

}
