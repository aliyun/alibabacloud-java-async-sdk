// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDiagnosticReportsRequest} extends {@link RequestModel}
 *
 * <p>DeleteDiagnosticReportsRequest</p>
 */
public class DeleteDiagnosticReportsRequest extends Request {
    @Host
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ReportIds")
    @Validation(required = true)
    private java.util.List < String > reportIds;

    private DeleteDiagnosticReportsRequest(Builder builder) {
        super(builder);
        this.resourceOwnerId = builder.resourceOwnerId;
        this.regionId = builder.regionId;
        this.reportIds = builder.reportIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDiagnosticReportsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return reportIds
     */
    public java.util.List < String > getReportIds() {
        return this.reportIds;
    }

    public static final class Builder extends Request.Builder<DeleteDiagnosticReportsRequest, Builder> {
        private Long resourceOwnerId; 
        private String regionId; 
        private java.util.List < String > reportIds; 

        private Builder() {
            super();
        } 

        private Builder(DeleteDiagnosticReportsRequest request) {
            super(request);
            this.resourceOwnerId = request.resourceOwnerId;
            this.regionId = request.regionId;
            this.reportIds = request.reportIds;
        } 

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putHostParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ReportIds.
         */
        public Builder reportIds(java.util.List < String > reportIds) {
            this.putQueryParameter("ReportIds", reportIds);
            this.reportIds = reportIds;
            return this;
        }

        @Override
        public DeleteDiagnosticReportsRequest build() {
            return new DeleteDiagnosticReportsRequest(this);
        } 

    } 

}
