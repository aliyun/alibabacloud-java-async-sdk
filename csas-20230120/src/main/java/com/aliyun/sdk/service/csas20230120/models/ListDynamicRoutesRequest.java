// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListDynamicRoutesRequest} extends {@link RequestModel}
 *
 * <p>ListDynamicRoutesRequest</p>
 */
public class ListDynamicRoutesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    private String applicationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DynamicRouteIds")
    private java.util.List<String> dynamicRouteIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextHop")
    private String nextHop;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionIds")
    private java.util.List<String> regionIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TagId")
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
    public java.util.List<String> getDynamicRouteIds() {
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
    public java.util.List<String> getRegionIds() {
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
        private java.util.List<String> dynamicRouteIds; 
        private String name; 
        private String nextHop; 
        private Integer pageSize; 
        private java.util.List<String> regionIds; 
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
         * <p>The ID of the private access application for the dynamic route. You cannot filter by both the private access application ID and the private access tag ID. You can obtain the ID from the following sources:</p>
         * <ul>
         * <li><p><a href="~~ListPrivateAccessApplications~~">ListPrivateAccessApplications</a>: Queries multiple private access applications.</p>
         * </li>
         * <li><p><a href="~~CreatePrivateAccessApplication~~">CreatePrivateAccessApplication</a>: Creates a private access application.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>pa-application-e12860ef6c48****</p>
         */
        public Builder applicationId(String applicationId) {
            this.putQueryParameter("ApplicationId", applicationId);
            this.applicationId = applicationId;
            return this;
        }

        /**
         * <p>The number of the page to return for a paged query. Valid values: 1 to 10000.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The IDs of the dynamic routes. You can specify up to 100 dynamic route IDs.</p>
         */
        public Builder dynamicRouteIds(java.util.List<String> dynamicRouteIds) {
            this.putQueryParameter("DynamicRouteIds", dynamicRouteIds);
            this.dynamicRouteIds = dynamicRouteIds;
            return this;
        }

        /**
         * <p>The name of the dynamic route. The name must be 1 to 128 characters in length and can contain Chinese characters, letters, digits, periods (.), underscores (_), and hyphens (-).</p>
         * 
         * <strong>example:</strong>
         * <p>dynamic_route_name</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The ID of the next hop instance for the dynamic route. You can obtain the ID from the following source:</p>
         * <ul>
         * <li><a href="~~ListConnectors~~">ListConnectors</a>: Queries multiple connectors.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>connector-8ccb13b6f52c****</p>
         */
        public Builder nextHop(String nextHop) {
            this.putQueryParameter("NextHop", nextHop);
            this.nextHop = nextHop;
            return this;
        }

        /**
         * <p>The number of entries to return on each page for a paged query. Valid values: 1 to 1000.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The list of regions where the SASE POP cluster endpoint is supported.</p>
         */
        public Builder regionIds(java.util.List<String> regionIds) {
            this.putQueryParameter("RegionIds", regionIds);
            this.regionIds = regionIds;
            return this;
        }

        /**
         * <p>The status of the dynamic route. Valid values:</p>
         * <ul>
         * <li><p><strong>Enabled</strong>: The dynamic route is enabled.</p>
         * </li>
         * <li><p><strong>Disabled</strong>: The dynamic route is disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The ID of the private access tag for the dynamic route. You cannot filter by both the private access tag ID and the private access application ID. You can obtain the ID from the following sources:</p>
         * <ul>
         * <li><p><a href="~~ListPrivateAccessTags~~">ListPrivateAccessTags</a>: Queries multiple private access tags.</p>
         * </li>
         * <li><p><a href="~~CreatePrivateAccessTag~~">CreatePrivateAccessTag</a>: Creates a private access tag.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>tag-d3f64e8bdd4a****</p>
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
