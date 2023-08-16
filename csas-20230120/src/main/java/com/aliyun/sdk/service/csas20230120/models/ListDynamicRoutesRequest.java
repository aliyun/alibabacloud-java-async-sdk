// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDynamicRoutesRequest} extends {@link RequestModel}
 *
 * <p>ListDynamicRoutesRequest</p>
 */
public class ListDynamicRoutesRequest extends Request {
    @Query
    @NameInMap("ApplicationId")
    private String applicationId;

    @Query
    @NameInMap("CurrentPage")
    @Validation(required = true)
    private Integer currentPage;

    @Query
    @NameInMap("DynamicRouteIds")
    private java.util.List < String > dynamicRouteIds;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("NextHop")
    private String nextHop;

    @Query
    @NameInMap("PageSize")
    @Validation(required = true)
    private Integer pageSize;

    @Query
    @NameInMap("RegionIds")
    private java.util.List < String > regionIds;

    @Query
    @NameInMap("Status")
    private String status;

    @Query
    @NameInMap("TagId")
    private String tagId;

    private ListDynamicRoutesRequest(Builder builder) {
        super(builder);
        this.applicationId = builder.applicationId;
        this.currentPage = builder.currentPage;
        this.dynamicRouteIds = builder.dynamicRouteIds;
        this.name = builder.name;
        this.nextHop = builder.nextHop;
        this.pageSize = builder.pageSize;
        this.regionIds = builder.regionIds;
        this.status = builder.status;
        this.tagId = builder.tagId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDynamicRoutesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return dynamicRouteIds
     */
    public java.util.List < String > getDynamicRouteIds() {
        return this.dynamicRouteIds;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return nextHop
     */
    public String getNextHop() {
        return this.nextHop;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return regionIds
     */
    public java.util.List < String > getRegionIds() {
        return this.regionIds;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return tagId
     */
    public String getTagId() {
        return this.tagId;
    }

    public static final class Builder extends Request.Builder<ListDynamicRoutesRequest, Builder> {
        private String applicationId; 
        private Integer currentPage; 
        private java.util.List < String > dynamicRouteIds; 
        private String name; 
        private String nextHop; 
        private Integer pageSize; 
        private java.util.List < String > regionIds; 
        private String status; 
        private String tagId; 

        private Builder() {
            super();
        } 

        private Builder(ListDynamicRoutesRequest request) {
            super(request);
            this.applicationId = request.applicationId;
            this.currentPage = request.currentPage;
            this.dynamicRouteIds = request.dynamicRouteIds;
            this.name = request.name;
            this.nextHop = request.nextHop;
            this.pageSize = request.pageSize;
            this.regionIds = request.regionIds;
            this.status = request.status;
            this.tagId = request.tagId;
        } 

        /**
         * ApplicationId.
         */
        public Builder applicationId(String applicationId) {
            this.putQueryParameter("ApplicationId", applicationId);
            this.applicationId = applicationId;
            return this;
        }

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * DynamicRouteIds.
         */
        public Builder dynamicRouteIds(java.util.List < String > dynamicRouteIds) {
            this.putQueryParameter("DynamicRouteIds", dynamicRouteIds);
            this.dynamicRouteIds = dynamicRouteIds;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * NextHop.
         */
        public Builder nextHop(String nextHop) {
            this.putQueryParameter("NextHop", nextHop);
            this.nextHop = nextHop;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RegionIds.
         */
        public Builder regionIds(java.util.List < String > regionIds) {
            this.putQueryParameter("RegionIds", regionIds);
            this.regionIds = regionIds;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * TagId.
         */
        public Builder tagId(String tagId) {
            this.putQueryParameter("TagId", tagId);
            this.tagId = tagId;
            return this;
        }

        @Override
        public ListDynamicRoutesRequest build() {
            return new ListDynamicRoutesRequest(this);
        } 

    } 

}
