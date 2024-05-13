// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTaskFlowsByPageRequest} extends {@link RequestModel}
 *
 * <p>ListTaskFlowsByPageRequest</p>
 */
public class ListTaskFlowsByPageRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DagIdList")
    private java.util.List < Long > dagIdList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageIndex")
    private Integer pageIndex;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScenarioId")
    private Long scenarioId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SearchKey")
    private String searchKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tid")
    @com.aliyun.core.annotation.Validation(minimum = 1)
    private Long tid;

    private ListTaskFlowsByPageRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.dagIdList = builder.dagIdList;
        this.pageIndex = builder.pageIndex;
        this.pageSize = builder.pageSize;
        this.scenarioId = builder.scenarioId;
        this.searchKey = builder.searchKey;
        this.tid = builder.tid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTaskFlowsByPageRequest create() {
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
     * @return dagIdList
     */
    public java.util.List < Long > getDagIdList() {
        return this.dagIdList;
    }

    /**
     * @return pageIndex
     */
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return scenarioId
     */
    public Long getScenarioId() {
        return this.scenarioId;
    }

    /**
     * @return searchKey
     */
    public String getSearchKey() {
        return this.searchKey;
    }

    /**
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    public static final class Builder extends Request.Builder<ListTaskFlowsByPageRequest, Builder> {
        private String regionId; 
        private java.util.List < Long > dagIdList; 
        private Integer pageIndex; 
        private Integer pageSize; 
        private Long scenarioId; 
        private String searchKey; 
        private Long tid; 

        private Builder() {
            super();
        } 

        private Builder(ListTaskFlowsByPageRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.dagIdList = request.dagIdList;
            this.pageIndex = request.pageIndex;
            this.pageSize = request.pageSize;
            this.scenarioId = request.scenarioId;
            this.searchKey = request.searchKey;
            this.tid = request.tid;
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
         * Filter condition, task flow ID list.
         */
        public Builder dagIdList(java.util.List < Long > dagIdList) {
            String dagIdListShrink = shrink(dagIdList, "DagIdList", "json");
            this.putQueryParameter("DagIdList", dagIdListShrink);
            this.dagIdList = dagIdList;
            return this;
        }

        /**
         * The number of the page to return.
         */
        public Builder pageIndex(Integer pageIndex) {
            this.putQueryParameter("PageIndex", pageIndex);
            this.pageIndex = pageIndex;
            return this;
        }

        /**
         * The number of entries to return on each page.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Filter condition, application scenario ID.
         */
        public Builder scenarioId(Long scenarioId) {
            this.putQueryParameter("ScenarioId", scenarioId);
            this.scenarioId = scenarioId;
            return this;
        }

        /**
         * The keyword that is used to search for task flow names.
         */
        public Builder searchKey(String searchKey) {
            this.putQueryParameter("SearchKey", searchKey);
            this.searchKey = searchKey;
            return this;
        }

        /**
         * The ID of the tenant.
         * <p>
         * 
         * > : To view the ID of the tenant, go to the Data Management (DMS) console and move the pointer over the profile picture in the upper-right corner. For more information, see [View information about the current tenant](~~181330~~).
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        @Override
        public ListTaskFlowsByPageRequest build() {
            return new ListTaskFlowsByPageRequest(this);
        } 

    } 

}
