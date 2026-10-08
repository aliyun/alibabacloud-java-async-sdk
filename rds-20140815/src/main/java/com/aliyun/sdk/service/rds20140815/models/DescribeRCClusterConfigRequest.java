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
 * {@link DescribeRCClusterConfigRequest} extends {@link RequestModel}
 *
 * <p>DescribeRCClusterConfigRequest</p>
 */
public class DescribeRCClusterConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemporaryDurationMinutes")
    private Integer temporaryDurationMinutes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcId")
    private String vpcId;

    private DescribeRCClusterConfigRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.temporaryDurationMinutes = builder.temporaryDurationMinutes;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRCClusterConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return temporaryDurationMinutes
     */
    public Integer getTemporaryDurationMinutes() {
        return this.temporaryDurationMinutes;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    public static final class Builder extends Request.Builder<DescribeRCClusterConfigRequest, Builder> {
        private String regionId; 
        private Integer temporaryDurationMinutes; 
        private String vpcId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeRCClusterConfigRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.temporaryDurationMinutes = request.temporaryDurationMinutes;
            this.vpcId = request.vpcId;
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
         * <p>The validity period of the temporary KubeConfig. Unit: minutes. Valid values: 15 (15 minutes) to 4320 (3 days).</p>
         * <blockquote>
         * <p>If this parameter is not specified, the system automatically determines a longer validity period. The specific expiration time is indicated by the value of the <code>expiration</code> field in the response.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder temporaryDurationMinutes(Integer temporaryDurationMinutes) {
            this.putQueryParameter("TemporaryDurationMinutes", temporaryDurationMinutes);
            this.temporaryDurationMinutes = temporaryDurationMinutes;
            return this;
        }

        /**
         * <p>The ID of the virtual private cloud (VPC).</p>
         * <blockquote>
         * <p>Reserved parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        @Override
        public DescribeRCClusterConfigRequest build() {
            return new DescribeRCClusterConfigRequest(this);
        } 

    } 

}
