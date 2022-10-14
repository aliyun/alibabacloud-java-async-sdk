// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdatePartitionColumnStatisticsRequest} extends {@link RequestModel}
 *
 * <p>UpdatePartitionColumnStatisticsRequest</p>
 */
public class UpdatePartitionColumnStatisticsRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("UpdateTablePartitionColumnStatisticsRequest")
    private UpdateTablePartitionColumnStatisticsRequest updateTablePartitionColumnStatisticsRequest;

    private UpdatePartitionColumnStatisticsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.updateTablePartitionColumnStatisticsRequest = builder.updateTablePartitionColumnStatisticsRequest;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdatePartitionColumnStatisticsRequest create() {
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
     * @return updateTablePartitionColumnStatisticsRequest
     */
    public UpdateTablePartitionColumnStatisticsRequest getUpdateTablePartitionColumnStatisticsRequest() {
        return this.updateTablePartitionColumnStatisticsRequest;
    }

    public static final class Builder extends Request.Builder<UpdatePartitionColumnStatisticsRequest, Builder> {
        private String regionId; 
        private UpdateTablePartitionColumnStatisticsRequest updateTablePartitionColumnStatisticsRequest; 

        private Builder() {
            super();
        } 

        private Builder(UpdatePartitionColumnStatisticsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.updateTablePartitionColumnStatisticsRequest = request.updateTablePartitionColumnStatisticsRequest;
        } 

        /**
         * RegionId
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * UpdateTablePartitionColumnStatisticsRequest.
         */
        public Builder updateTablePartitionColumnStatisticsRequest(UpdateTablePartitionColumnStatisticsRequest updateTablePartitionColumnStatisticsRequest) {
            this.putBodyParameter("UpdateTablePartitionColumnStatisticsRequest", updateTablePartitionColumnStatisticsRequest);
            this.updateTablePartitionColumnStatisticsRequest = updateTablePartitionColumnStatisticsRequest;
            return this;
        }

        @Override
        public UpdatePartitionColumnStatisticsRequest build() {
            return new UpdatePartitionColumnStatisticsRequest(this);
        } 

    } 

}
