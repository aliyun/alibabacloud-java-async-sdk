// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAlertsWithEntityRequest} extends {@link RequestModel}
 *
 * <p>DescribeAlertsWithEntityRequest</p>
 */
public class DescribeAlertsWithEntityRequest extends Request {
    @Body
    @NameInMap("CurrentPage")
    @Validation(required = true, minimum = 1)
    private Integer currentPage;

    @Body
    @NameInMap("EntityId")
    private Long entityId;

    @Body
    @NameInMap("IncidentUuid")
    private String incidentUuid;

    @Body
    @NameInMap("PageSize")
    @Validation(required = true, maximum = 100, minimum = 1)
    private Integer pageSize;

    @Body
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("SophonTaskId")
    private String sophonTaskId;

    private DescribeAlertsWithEntityRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.entityId = builder.entityId;
        this.incidentUuid = builder.incidentUuid;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.sophonTaskId = builder.sophonTaskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAlertsWithEntityRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return entityId
     */
    public Long getEntityId() {
        return this.entityId;
    }

    /**
     * @return incidentUuid
     */
    public String getIncidentUuid() {
        return this.incidentUuid;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return sophonTaskId
     */
    public String getSophonTaskId() {
        return this.sophonTaskId;
    }

    public static final class Builder extends Request.Builder<DescribeAlertsWithEntityRequest, Builder> {
        private Integer currentPage; 
        private Long entityId; 
        private String incidentUuid; 
        private Integer pageSize; 
        private String regionId; 
        private String sophonTaskId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAlertsWithEntityRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.entityId = request.entityId;
            this.incidentUuid = request.incidentUuid;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.sophonTaskId = request.sophonTaskId;
        } 

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.putBodyParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * EntityId.
         */
        public Builder entityId(Long entityId) {
            this.putBodyParameter("EntityId", entityId);
            this.entityId = entityId;
            return this;
        }

        /**
         * IncidentUuid.
         */
        public Builder incidentUuid(String incidentUuid) {
            this.putBodyParameter("IncidentUuid", incidentUuid);
            this.incidentUuid = incidentUuid;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * SophonTaskId.
         */
        public Builder sophonTaskId(String sophonTaskId) {
            this.putBodyParameter("SophonTaskId", sophonTaskId);
            this.sophonTaskId = sophonTaskId;
            return this;
        }

        @Override
        public DescribeAlertsWithEntityRequest build() {
            return new DescribeAlertsWithEntityRequest(this);
        } 

    } 

}
