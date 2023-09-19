// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteExecutionsRequest} extends {@link RequestModel}
 *
 * <p>DeleteExecutionsRequest</p>
 */
public class DeleteExecutionsRequest extends Request {
    @Query
    @NameInMap("ExecutionIds")
    @Validation(required = true)
    private String executionIds;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    private DeleteExecutionsRequest(Builder builder) {
        super(builder);
        this.executionIds = builder.executionIds;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteExecutionsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return executionIds
     */
    public String getExecutionIds() {
        return this.executionIds;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DeleteExecutionsRequest, Builder> {
        private String executionIds; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteExecutionsRequest request) {
            super(request);
            this.executionIds = request.executionIds;
            this.regionId = request.regionId;
        } 

        /**
         * The execution IDs.
         * <p>
         * 
         * You can specify multiple execution IDs in a JSON array in the format of `["xxxxxxxxx", "yyyyyyyyy", ... "zzzzzzzzz"]`. You can specify up to 100 execution IDs at a time. Separate multiple IDs with commas (,).
         */
        public Builder executionIds(String executionIds) {
            this.putQueryParameter("ExecutionIds", executionIds);
            this.executionIds = executionIds;
            return this;
        }

        /**
         * The region ID.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DeleteExecutionsRequest build() {
            return new DeleteExecutionsRequest(this);
        } 

    } 

}
