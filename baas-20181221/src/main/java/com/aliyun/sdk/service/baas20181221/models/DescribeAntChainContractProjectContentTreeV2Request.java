// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAntChainContractProjectContentTreeV2Request} extends {@link RequestModel}
 *
 * <p>DescribeAntChainContractProjectContentTreeV2Request</p>
 */
public class DescribeAntChainContractProjectContentTreeV2Request extends Request {
    @Body
    @NameInMap("ConsortiumId")
    @Validation(required = true)
    private String consortiumId;

    @Body
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private DescribeAntChainContractProjectContentTreeV2Request(Builder builder) {
        super(builder);
        this.consortiumId = builder.consortiumId;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAntChainContractProjectContentTreeV2Request create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return consortiumId
     */
    public String getConsortiumId() {
        return this.consortiumId;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DescribeAntChainContractProjectContentTreeV2Request, Builder> {
        private String consortiumId; 
        private String projectId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAntChainContractProjectContentTreeV2Request response) {
            super(response);
            this.consortiumId = response.consortiumId;
            this.projectId = response.projectId;
            this.regionId = response.regionId;
        } 

        /**
         * ConsortiumId.
         */
        public Builder consortiumId(String consortiumId) {
            this.putBodyParameter("ConsortiumId", consortiumId);
            this.consortiumId = consortiumId;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(String projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DescribeAntChainContractProjectContentTreeV2Request build() {
            return new DescribeAntChainContractProjectContentTreeV2Request(this);
        } 

    } 

}
