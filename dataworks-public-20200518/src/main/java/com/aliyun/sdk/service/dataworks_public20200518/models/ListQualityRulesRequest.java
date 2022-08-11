// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListQualityRulesRequest} extends {@link RequestModel}
 *
 * <p>ListQualityRulesRequest</p>
 */
public class ListQualityRulesRequest extends Request {
    @Body
    @NameInMap("EntityId")
    @Validation(required = true)
    private Long entityId;

    @Body
    @NameInMap("PageNumber")
    @Validation(required = true, minimum = 1)
    private Integer pageNumber;

    @Body
    @NameInMap("PageSize")
    @Validation(required = true, maximum = 20, minimum = 1)
    private Integer pageSize;

    @Body
    @NameInMap("ProjectName")
    @Validation(required = true)
    private String projectName;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private ListQualityRulesRequest(Builder builder) {
        super(builder);
        this.entityId = builder.entityId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.projectName = builder.projectName;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListQualityRulesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return entityId
     */
    public Long getEntityId() {
        return this.entityId;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return projectName
     */
    public String getProjectName() {
        return this.projectName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ListQualityRulesRequest, Builder> {
        private Long entityId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String projectName; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ListQualityRulesRequest request) {
            super(request);
            this.entityId = request.entityId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.projectName = request.projectName;
            this.regionId = request.regionId;
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
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
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
         * ProjectName.
         */
        public Builder projectName(String projectName) {
            this.putBodyParameter("ProjectName", projectName);
            this.projectName = projectName;
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
        public ListQualityRulesRequest build() {
            return new ListQualityRulesRequest(this);
        } 

    } 

}
