// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchOmsOpenAPIProjectsRequest} extends {@link RequestModel}
 *
 * <p>SearchOmsOpenAPIProjectsRequest</p>
 */
public class SearchOmsOpenAPIProjectsRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("DestDbTypes")
    private java.util.List < String > destDbTypes;

    @Body
    @NameInMap("LabelIds")
    private java.util.List < String > labelIds;

    @Body
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Body
    @NameInMap("PageSize")
    private Integer pageSize;

    @Body
    @NameInMap("SearchKey")
    private String searchKey;

    @Body
    @NameInMap("SourceDbTypes")
    private java.util.List < String > sourceDbTypes;

    @Body
    @NameInMap("StatusList")
    private java.util.List < String > statusList;

    @Body
    @NameInMap("WorkerGradeId")
    private String workerGradeId;

    private SearchOmsOpenAPIProjectsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.destDbTypes = builder.destDbTypes;
        this.labelIds = builder.labelIds;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.searchKey = builder.searchKey;
        this.sourceDbTypes = builder.sourceDbTypes;
        this.statusList = builder.statusList;
        this.workerGradeId = builder.workerGradeId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchOmsOpenAPIProjectsRequest create() {
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
     * @return destDbTypes
     */
    public java.util.List < String > getDestDbTypes() {
        return this.destDbTypes;
    }

    /**
     * @return labelIds
     */
    public java.util.List < String > getLabelIds() {
        return this.labelIds;
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
     * @return sourceDbTypes
     */
    public java.util.List < String > getSourceDbTypes() {
        return this.sourceDbTypes;
    }

    /**
     * @return statusList
     */
    public java.util.List < String > getStatusList() {
        return this.statusList;
    }

    /**
     * @return workerGradeId
     */
    public String getWorkerGradeId() {
        return this.workerGradeId;
    }

    public static final class Builder extends Request.Builder<SearchOmsOpenAPIProjectsRequest, Builder> {
        private String regionId; 
        private java.util.List < String > destDbTypes; 
        private java.util.List < String > labelIds; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String searchKey; 
        private java.util.List < String > sourceDbTypes; 
        private java.util.List < String > statusList; 
        private String workerGradeId; 

        private Builder() {
            super();
        } 

        private Builder(SearchOmsOpenAPIProjectsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.destDbTypes = request.destDbTypes;
            this.labelIds = request.labelIds;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.searchKey = request.searchKey;
            this.sourceDbTypes = request.sourceDbTypes;
            this.statusList = request.statusList;
            this.workerGradeId = request.workerGradeId;
        } 

        /**
         * 实例所属的地域ID。您可以调用DescribeRegions查看最新的阿里云地域列表。
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The types of destination data sources.
         */
        public Builder destDbTypes(java.util.List < String > destDbTypes) {
            String destDbTypesShrink = shrink(destDbTypes, "DestDbTypes", "json");
            this.putBodyParameter("DestDbTypes", destDbTypesShrink);
            this.destDbTypes = destDbTypes;
            return this;
        }

        /**
         * The list of labels.
         */
        public Builder labelIds(java.util.List < String > labelIds) {
            String labelIdsShrink = shrink(labelIds, "LabelIds", "json");
            this.putBodyParameter("LabelIds", labelIdsShrink);
            this.labelIds = labelIds;
            return this;
        }

        /**
         * The page number, which takes effect in a pagination query.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The page size, which takes effect in a pagination query.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The keyword for fuzzy search. A fuzzy search is performed based on the project ID and name.
         */
        public Builder searchKey(String searchKey) {
            this.putBodyParameter("SearchKey", searchKey);
            this.searchKey = searchKey;
            return this;
        }

        /**
         * The types of source data sources.
         */
        public Builder sourceDbTypes(java.util.List < String > sourceDbTypes) {
            String sourceDbTypesShrink = shrink(sourceDbTypes, "SourceDbTypes", "json");
            this.putBodyParameter("SourceDbTypes", sourceDbTypesShrink);
            this.sourceDbTypes = sourceDbTypes;
            return this;
        }

        /**
         * The list of project statuses.
         */
        public Builder statusList(java.util.List < String > statusList) {
            String statusListShrink = shrink(statusList, "StatusList", "json");
            this.putBodyParameter("StatusList", statusListShrink);
            this.statusList = statusList;
            return this;
        }

        /**
         * The ID of the migration instance. Generally, if you want to create a project on a public cloud, you must first purchase a migration instance.
         */
        public Builder workerGradeId(String workerGradeId) {
            this.putBodyParameter("WorkerGradeId", workerGradeId);
            this.workerGradeId = workerGradeId;
            return this;
        }

        @Override
        public SearchOmsOpenAPIProjectsRequest build() {
            return new SearchOmsOpenAPIProjectsRequest(this);
        } 

    } 

}
