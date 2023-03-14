// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20171228.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstanceStatisticsRequest} extends {@link RequestModel}
 *
 * <p>DescribeInstanceStatisticsRequest</p>
 */
public class DescribeInstanceStatisticsRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("InstanceIds")
    @Validation(required = true)
    private String instanceIds;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    private DescribeInstanceStatisticsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.instanceIds = builder.instanceIds;
        this.sourceIp = builder.sourceIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceStatisticsRequest create() {
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
     * @return instanceIds
     */
    public String getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    public static final class Builder extends Request.Builder<DescribeInstanceStatisticsRequest, Builder> {
        private String regionId; 
        private String instanceIds; 
        private String sourceIp; 

        private Builder() {
            super();
        } 

        private Builder(DescribeInstanceStatisticsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.instanceIds = request.instanceIds;
            this.sourceIp = request.sourceIp;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * InstanceIds.
         */
        public Builder instanceIds(String instanceIds) {
            this.putQueryParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * SourceIp.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        @Override
        public DescribeInstanceStatisticsRequest build() {
            return new DescribeInstanceStatisticsRequest(this);
        } 

    } 

}
