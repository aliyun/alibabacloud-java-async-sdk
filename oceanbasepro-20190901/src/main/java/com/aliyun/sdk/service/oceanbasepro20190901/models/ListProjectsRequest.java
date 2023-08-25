// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListProjectsRequest} extends {@link RequestModel}
 *
 * <p>ListProjectsRequest</p>
 */
public class ListProjectsRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("LabelIds")
    private java.util.List < String > labelIds;

    @Body
    @NameInMap("Order")
    private String order;

    @Body
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Body
    @NameInMap("PageSize")
    @Validation(maximum = 150, minimum = 1)
    private Integer pageSize;

    @Body
    @NameInMap("SearchKey")
    private String searchKey;

    @Body
    @NameInMap("SinkEndpointTypes")
    private java.util.List < String > sinkEndpointTypes;

    @Body
    @NameInMap("SortField")
    private String sortField;

    @Body
    @NameInMap("SourceEndpointTypes")
    private java.util.List < String > sourceEndpointTypes;

    @Body
    @NameInMap("Status")
    private java.util.List < String > status;

    @Body
    @NameInMap("Type")
    private String type;

    @Body
    @NameInMap("VisibleSubProject")
    private Boolean visibleSubProject;

    private ListProjectsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.labelIds = builder.labelIds;
        this.order = builder.order;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.searchKey = builder.searchKey;
        this.sinkEndpointTypes = builder.sinkEndpointTypes;
        this.sortField = builder.sortField;
        this.sourceEndpointTypes = builder.sourceEndpointTypes;
        this.status = builder.status;
        this.type = builder.type;
        this.visibleSubProject = builder.visibleSubProject;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProjectsRequest create() {
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
     * @return labelIds
     */
    public java.util.List < String > getLabelIds() {
        return this.labelIds;
    }

    /**
     * @return order
     */
    public String getOrder() {
        return this.order;
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
     * @return searchKey
     */
    public String getSearchKey() {
        return this.searchKey;
    }

    /**
     * @return sinkEndpointTypes
     */
    public java.util.List < String > getSinkEndpointTypes() {
        return this.sinkEndpointTypes;
    }

    /**
     * @return sortField
     */
    public String getSortField() {
        return this.sortField;
    }

    /**
     * @return sourceEndpointTypes
     */
    public java.util.List < String > getSourceEndpointTypes() {
        return this.sourceEndpointTypes;
    }

    /**
     * @return status
     */
    public java.util.List < String > getStatus() {
        return this.status;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return visibleSubProject
     */
    public Boolean getVisibleSubProject() {
        return this.visibleSubProject;
    }

    public static final class Builder extends Request.Builder<ListProjectsRequest, Builder> {
        private String regionId; 
        private java.util.List < String > labelIds; 
        private String order; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String searchKey; 
        private java.util.List < String > sinkEndpointTypes; 
        private String sortField; 
        private java.util.List < String > sourceEndpointTypes; 
        private java.util.List < String > status; 
        private String type; 
        private Boolean visibleSubProject; 

        private Builder() {
            super();
        } 

        private Builder(ListProjectsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.labelIds = request.labelIds;
            this.order = request.order;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.searchKey = request.searchKey;
            this.sinkEndpointTypes = request.sinkEndpointTypes;
            this.sortField = request.sortField;
            this.sourceEndpointTypes = request.sourceEndpointTypes;
            this.status = request.status;
            this.type = request.type;
            this.visibleSubProject = request.visibleSubProject;
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
         * LabelIds.
         */
        public Builder labelIds(java.util.List < String > labelIds) {
            String labelIdsShrink = shrink(labelIds, "LabelIds", "json");
            this.putBodyParameter("LabelIds", labelIdsShrink);
            this.labelIds = labelIds;
            return this;
        }

        /**
         * Order.
         */
        public Builder order(String order) {
            this.putBodyParameter("Order", order);
            this.order = order;
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
         * SearchKey.
         */
        public Builder searchKey(String searchKey) {
            this.putBodyParameter("SearchKey", searchKey);
            this.searchKey = searchKey;
            return this;
        }

        /**
         * SinkEndpointTypes.
         */
        public Builder sinkEndpointTypes(java.util.List < String > sinkEndpointTypes) {
            String sinkEndpointTypesShrink = shrink(sinkEndpointTypes, "SinkEndpointTypes", "json");
            this.putBodyParameter("SinkEndpointTypes", sinkEndpointTypesShrink);
            this.sinkEndpointTypes = sinkEndpointTypes;
            return this;
        }

        /**
         * SortField.
         */
        public Builder sortField(String sortField) {
            this.putBodyParameter("SortField", sortField);
            this.sortField = sortField;
            return this;
        }

        /**
         * SourceEndpointTypes.
         */
        public Builder sourceEndpointTypes(java.util.List < String > sourceEndpointTypes) {
            String sourceEndpointTypesShrink = shrink(sourceEndpointTypes, "SourceEndpointTypes", "json");
            this.putBodyParameter("SourceEndpointTypes", sourceEndpointTypesShrink);
            this.sourceEndpointTypes = sourceEndpointTypes;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(java.util.List < String > status) {
            String statusShrink = shrink(status, "Status", "json");
            this.putBodyParameter("Status", statusShrink);
            this.status = status;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putBodyParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * VisibleSubProject.
         */
        public Builder visibleSubProject(Boolean visibleSubProject) {
            this.putBodyParameter("VisibleSubProject", visibleSubProject);
            this.visibleSubProject = visibleSubProject;
            return this;
        }

        @Override
        public ListProjectsRequest build() {
            return new ListProjectsRequest(this);
        } 

    } 

}
