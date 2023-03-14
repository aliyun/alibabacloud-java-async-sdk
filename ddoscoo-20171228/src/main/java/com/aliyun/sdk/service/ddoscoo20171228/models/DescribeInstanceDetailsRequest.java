// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20171228.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstanceDetailsRequest} extends {@link RequestModel}
 *
 * <p>DescribeInstanceDetailsRequest</p>
 */
public class DescribeInstanceDetailsRequest extends Request {
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

    private DescribeInstanceDetailsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.instanceIds = builder.instanceIds;
        this.sourceIp = builder.sourceIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceDetailsRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeInstanceDetailsRequest, Builder> {
        private String regionId; 
        private String instanceIds; 
        private String sourceIp; 

        private Builder() {
            super();
        } 

        private Builder(DescribeInstanceDetailsRequest request) {
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
        public DescribeInstanceDetailsRequest build() {
            return new DescribeInstanceDetailsRequest(this);
        } 

    } 

}
