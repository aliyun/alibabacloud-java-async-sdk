// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAssistHistoriesRequest} extends {@link RequestModel}
 *
 * <p>ListAssistHistoriesRequest</p>
 */
public class ListAssistHistoriesRequest extends Request {
    @Query
    @NameInMap("Condition")
    private String condition;

    @Query
    @NameInMap("PageIndex")
    @Validation(required = true)
    private Integer pageIndex;

    @Query
    @NameInMap("PerPage")
    @Validation(required = true)
    private Integer perPage;

    @Query
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private ListAssistHistoriesRequest(Builder builder) {
        super(builder);
        this.condition = builder.condition;
        this.pageIndex = builder.pageIndex;
        this.perPage = builder.perPage;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAssistHistoriesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return condition
     */
    public String getCondition() {
        return this.condition;
    }

    /**
     * @return pageIndex
     */
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    /**
     * @return perPage
     */
    public Integer getPerPage() {
        return this.perPage;
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

    public static final class Builder extends Request.Builder<ListAssistHistoriesRequest, Builder> {
        private String condition; 
        private Integer pageIndex; 
        private Integer perPage; 
        private String projectId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ListAssistHistoriesRequest response) {
            super(response);
            this.condition = response.condition;
            this.pageIndex = response.pageIndex;
            this.perPage = response.perPage;
            this.projectId = response.projectId;
            this.regionId = response.regionId;
        } 

        /**
         * Condition.
         */
        public Builder condition(String condition) {
            this.putQueryParameter("Condition", condition);
            this.condition = condition;
            return this;
        }

        /**
         * PageIndex.
         */
        public Builder pageIndex(Integer pageIndex) {
            this.putQueryParameter("PageIndex", pageIndex);
            this.pageIndex = pageIndex;
            return this;
        }

        /**
         * PerPage.
         */
        public Builder perPage(Integer perPage) {
            this.putQueryParameter("PerPage", perPage);
            this.perPage = perPage;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(String projectId) {
            this.putQueryParameter("ProjectId", projectId);
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
        public ListAssistHistoriesRequest build() {
            return new ListAssistHistoriesRequest(this);
        } 

    } 

}
