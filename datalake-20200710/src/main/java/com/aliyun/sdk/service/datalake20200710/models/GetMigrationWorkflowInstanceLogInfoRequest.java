// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMigrationWorkflowInstanceLogInfoRequest} extends {@link RequestModel}
 *
 * <p>GetMigrationWorkflowInstanceLogInfoRequest</p>
 */
public class GetMigrationWorkflowInstanceLogInfoRequest extends Request {
    @Query
    @NameInMap("FlowInstanceId")
    @Validation(required = true)
    private String flowInstanceId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private GetMigrationWorkflowInstanceLogInfoRequest(Builder builder) {
        super(builder);
        this.flowInstanceId = builder.flowInstanceId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMigrationWorkflowInstanceLogInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return flowInstanceId
     */
    public String getFlowInstanceId() {
        return this.flowInstanceId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<GetMigrationWorkflowInstanceLogInfoRequest, Builder> {
        private String flowInstanceId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetMigrationWorkflowInstanceLogInfoRequest response) {
            super(response);
            this.flowInstanceId = response.flowInstanceId;
            this.regionId = response.regionId;
        } 

        /**
         * FlowInstanceId.
         */
        public Builder flowInstanceId(String flowInstanceId) {
            this.putQueryParameter("FlowInstanceId", flowInstanceId);
            this.flowInstanceId = flowInstanceId;
            return this;
        }

        /**
         * RegionId
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public GetMigrationWorkflowInstanceLogInfoRequest build() {
            return new GetMigrationWorkflowInstanceLogInfoRequest(this);
        } 

    } 

}
