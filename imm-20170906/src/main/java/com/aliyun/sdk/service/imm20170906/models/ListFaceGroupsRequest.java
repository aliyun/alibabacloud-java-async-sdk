// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20170906.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFaceGroupsRequest} extends {@link RequestModel}
 *
 * <p>ListFaceGroupsRequest</p>
 */
public class ListFaceGroupsRequest extends Request {
    @Query
    @NameInMap("ExternalId")
    private String externalId;

    @Query
    @NameInMap("Limit")
    private Integer limit;

    @Query
    @NameInMap("Marker")
    private String marker;

    @Query
    @NameInMap("Order")
    private String order;

    @Query
    @NameInMap("OrderBy")
    private String orderBy;

    @Query
    @NameInMap("Project")
    @Validation(required = true)
    private String project;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("RemarksAQuery")
    private String remarksAQuery;

    @Query
    @NameInMap("RemarksArrayAQuery")
    private String remarksArrayAQuery;

    @Query
    @NameInMap("RemarksArrayBQuery")
    private String remarksArrayBQuery;

    @Query
    @NameInMap("RemarksBQuery")
    private String remarksBQuery;

    @Query
    @NameInMap("RemarksCQuery")
    private String remarksCQuery;

    @Query
    @NameInMap("RemarksDQuery")
    private String remarksDQuery;

    @Query
    @NameInMap("SetId")
    @Validation(required = true)
    private String setId;

    private ListFaceGroupsRequest(Builder builder) {
        super(builder);
        this.externalId = builder.externalId;
        this.limit = builder.limit;
        this.marker = builder.marker;
        this.order = builder.order;
        this.orderBy = builder.orderBy;
        this.project = builder.project;
        this.regionId = builder.regionId;
        this.remarksAQuery = builder.remarksAQuery;
        this.remarksArrayAQuery = builder.remarksArrayAQuery;
        this.remarksArrayBQuery = builder.remarksArrayBQuery;
        this.remarksBQuery = builder.remarksBQuery;
        this.remarksCQuery = builder.remarksCQuery;
        this.remarksDQuery = builder.remarksDQuery;
        this.setId = builder.setId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFaceGroupsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return externalId
     */
    public String getExternalId() {
        return this.externalId;
    }

    /**
     * @return limit
     */
    public Integer getLimit() {
        return this.limit;
    }

    /**
     * @return marker
     */
    public String getMarker() {
        return this.marker;
    }

    /**
     * @return order
     */
    public String getOrder() {
        return this.order;
    }

    /**
     * @return orderBy
     */
    public String getOrderBy() {
        return this.orderBy;
    }

    /**
     * @return project
     */
    public String getProject() {
        return this.project;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return remarksAQuery
     */
    public String getRemarksAQuery() {
        return this.remarksAQuery;
    }

    /**
     * @return remarksArrayAQuery
     */
    public String getRemarksArrayAQuery() {
        return this.remarksArrayAQuery;
    }

    /**
     * @return remarksArrayBQuery
     */
    public String getRemarksArrayBQuery() {
        return this.remarksArrayBQuery;
    }

    /**
     * @return remarksBQuery
     */
    public String getRemarksBQuery() {
        return this.remarksBQuery;
    }

    /**
     * @return remarksCQuery
     */
    public String getRemarksCQuery() {
        return this.remarksCQuery;
    }

    /**
     * @return remarksDQuery
     */
    public String getRemarksDQuery() {
        return this.remarksDQuery;
    }

    /**
     * @return setId
     */
    public String getSetId() {
        return this.setId;
    }

    public static final class Builder extends Request.Builder<ListFaceGroupsRequest, Builder> {
        private String externalId; 
        private Integer limit; 
        private String marker; 
        private String order; 
        private String orderBy; 
        private String project; 
        private String regionId; 
        private String remarksAQuery; 
        private String remarksArrayAQuery; 
        private String remarksArrayBQuery; 
        private String remarksBQuery; 
        private String remarksCQuery; 
        private String remarksDQuery; 
        private String setId; 

        private Builder() {
            super();
        } 

        private Builder(ListFaceGroupsRequest response) {
            super(response);
            this.externalId = response.externalId;
            this.limit = response.limit;
            this.marker = response.marker;
            this.order = response.order;
            this.orderBy = response.orderBy;
            this.project = response.project;
            this.regionId = response.regionId;
            this.remarksAQuery = response.remarksAQuery;
            this.remarksArrayAQuery = response.remarksArrayAQuery;
            this.remarksArrayBQuery = response.remarksArrayBQuery;
            this.remarksBQuery = response.remarksBQuery;
            this.remarksCQuery = response.remarksCQuery;
            this.remarksDQuery = response.remarksDQuery;
            this.setId = response.setId;
        } 

        /**
         * ExternalId.
         */
        public Builder externalId(String externalId) {
            this.putQueryParameter("ExternalId", externalId);
            this.externalId = externalId;
            return this;
        }

        /**
         * Limit.
         */
        public Builder limit(Integer limit) {
            this.putQueryParameter("Limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * Marker.
         */
        public Builder marker(String marker) {
            this.putQueryParameter("Marker", marker);
            this.marker = marker;
            return this;
        }

        /**
         * Order.
         */
        public Builder order(String order) {
            this.putQueryParameter("Order", order);
            this.order = order;
            return this;
        }

        /**
         * OrderBy.
         */
        public Builder orderBy(String orderBy) {
            this.putQueryParameter("OrderBy", orderBy);
            this.orderBy = orderBy;
            return this;
        }

        /**
         * Project.
         */
        public Builder project(String project) {
            this.putQueryParameter("Project", project);
            this.project = project;
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

        /**
         * RemarksAQuery.
         */
        public Builder remarksAQuery(String remarksAQuery) {
            this.putQueryParameter("RemarksAQuery", remarksAQuery);
            this.remarksAQuery = remarksAQuery;
            return this;
        }

        /**
         * RemarksArrayAQuery.
         */
        public Builder remarksArrayAQuery(String remarksArrayAQuery) {
            this.putQueryParameter("RemarksArrayAQuery", remarksArrayAQuery);
            this.remarksArrayAQuery = remarksArrayAQuery;
            return this;
        }

        /**
         * RemarksArrayBQuery.
         */
        public Builder remarksArrayBQuery(String remarksArrayBQuery) {
            this.putQueryParameter("RemarksArrayBQuery", remarksArrayBQuery);
            this.remarksArrayBQuery = remarksArrayBQuery;
            return this;
        }

        /**
         * RemarksBQuery.
         */
        public Builder remarksBQuery(String remarksBQuery) {
            this.putQueryParameter("RemarksBQuery", remarksBQuery);
            this.remarksBQuery = remarksBQuery;
            return this;
        }

        /**
         * RemarksCQuery.
         */
        public Builder remarksCQuery(String remarksCQuery) {
            this.putQueryParameter("RemarksCQuery", remarksCQuery);
            this.remarksCQuery = remarksCQuery;
            return this;
        }

        /**
         * RemarksDQuery.
         */
        public Builder remarksDQuery(String remarksDQuery) {
            this.putQueryParameter("RemarksDQuery", remarksDQuery);
            this.remarksDQuery = remarksDQuery;
            return this;
        }

        /**
         * SetId.
         */
        public Builder setId(String setId) {
            this.putQueryParameter("SetId", setId);
            this.setId = setId;
            return this;
        }

        @Override
        public ListFaceGroupsRequest build() {
            return new ListFaceGroupsRequest(this);
        } 

    } 

}
