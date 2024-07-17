// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateTableColumnStatisticsRequest} extends {@link RequestModel}
 *
 * <p>UpdateTableColumnStatisticsRequest</p>
 */
public class UpdateTableColumnStatisticsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UpdateTablePartitionColumnStatisticsRequest")
    private UpdateTablePartitionColumnStatisticsRequest updateTablePartitionColumnStatisticsRequest;

    private UpdateTableColumnStatisticsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.updateTablePartitionColumnStatisticsRequest = builder.updateTablePartitionColumnStatisticsRequest;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateTableColumnStatisticsRequest create() {
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

    public static final class Builder extends Request.Builder<UpdateTableColumnStatisticsRequest, Builder> {
        private String regionId; 
        private UpdateTablePartitionColumnStatisticsRequest updateTablePartitionColumnStatisticsRequest; 

        private Builder() {
            super();
        } 

        private Builder(UpdateTableColumnStatisticsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.updateTablePartitionColumnStatisticsRequest = request.updateTablePartitionColumnStatisticsRequest;
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
         * UpdateTablePartitionColumnStatisticsRequest.
         */
        public Builder updateTablePartitionColumnStatisticsRequest(UpdateTablePartitionColumnStatisticsRequest updateTablePartitionColumnStatisticsRequest) {
            this.putBodyParameter("UpdateTablePartitionColumnStatisticsRequest", updateTablePartitionColumnStatisticsRequest);
            this.updateTablePartitionColumnStatisticsRequest = updateTablePartitionColumnStatisticsRequest;
            return this;
        }

        @Override
        public UpdateTableColumnStatisticsRequest build() {
            return new UpdateTableColumnStatisticsRequest(this);
        } 

    } 

}
