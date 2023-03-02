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
    @Host
    @NameInMap("RegionId")
    private String regionId;

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

    private ListQualityRulesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.entityId = builder.entityId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.projectName = builder.projectName;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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

    public static final class Builder extends Request.Builder<ListQualityRulesRequest, Builder> {
        private String regionId; 
        private Long entityId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String projectName; 

        private Builder() {
            super();
        } 

        private Builder(ListQualityRulesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.entityId = request.entityId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.projectName = request.projectName;
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
         * The ID of the partition filter expression. You can call the [GetQualityEntity](~~174003~~) operation to query the ID of the partition filter expression.
         */
        public Builder entityId(Long entityId) {
            this.putBodyParameter("EntityId", entityId);
            this.entityId = entityId;
            return this;
        }

        /**
         * The number of the page to return.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries to return on each page. Default value: 10. Maximum value: 20.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The name of the compute engine instance or data source. You can obtain the name from data source configurations.
         */
        public Builder projectName(String projectName) {
            this.putBodyParameter("ProjectName", projectName);
            this.projectName = projectName;
            return this;
        }

        @Override
        public ListQualityRulesRequest build() {
            return new ListQualityRulesRequest(this);
        } 

    } 

}
