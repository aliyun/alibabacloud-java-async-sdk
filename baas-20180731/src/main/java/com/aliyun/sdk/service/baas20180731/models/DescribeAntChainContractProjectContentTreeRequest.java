// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAntChainContractProjectContentTreeRequest} extends {@link RequestModel}
 *
 * <p>DescribeAntChainContractProjectContentTreeRequest</p>
 */
public class DescribeAntChainContractProjectContentTreeRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    private DescribeAntChainContractProjectContentTreeRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.projectId = builder.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAntChainContractProjectContentTreeRequest create() {
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
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    public static final class Builder extends Request.Builder<DescribeAntChainContractProjectContentTreeRequest, Builder> {
        private String regionId; 
        private String projectId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAntChainContractProjectContentTreeRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.projectId = request.projectId;
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
         * ProjectId.
         */
        public Builder projectId(String projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        @Override
        public DescribeAntChainContractProjectContentTreeRequest build() {
            return new DescribeAntChainContractProjectContentTreeRequest(this);
        } 

    } 

}
