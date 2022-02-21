// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListWorkflowInstantencesRequest} extends {@link RequestModel}
 *
 * <p>ListWorkflowInstantencesRequest</p>
 */
public class ListWorkflowInstantencesRequest extends Request {
    @Query
    @NameInMap("BlueprintInstanceId")
    private String blueprintInstanceId;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("StatusList")
    private String statusList;

    private ListWorkflowInstantencesRequest(Builder builder) {
        super(builder);
        this.blueprintInstanceId = builder.blueprintInstanceId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.statusList = builder.statusList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListWorkflowInstantencesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return blueprintInstanceId
     */
    public String getBlueprintInstanceId() {
        return this.blueprintInstanceId;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return statusList
     */
    public String getStatusList() {
        return this.statusList;
    }

    public static final class Builder extends Request.Builder<ListWorkflowInstantencesRequest, Builder> {
        private String blueprintInstanceId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private String statusList; 

        private Builder() {
            super();
        } 

        private Builder(ListWorkflowInstantencesRequest response) {
            super(response);
            this.blueprintInstanceId = response.blueprintInstanceId;
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
            this.regionId = response.regionId;
            this.statusList = response.statusList;
        } 

        /**
         * BlueprintInstanceId.
         */
        public Builder blueprintInstanceId(String blueprintInstanceId) {
            this.putQueryParameter("BlueprintInstanceId", blueprintInstanceId);
            this.blueprintInstanceId = blueprintInstanceId;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
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
         * RegionId
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * StatusList.
         */
        public Builder statusList(String statusList) {
            this.putQueryParameter("StatusList", statusList);
            this.statusList = statusList;
            return this;
        }

        @Override
        public ListWorkflowInstantencesRequest build() {
            return new ListWorkflowInstantencesRequest(this);
        } 

    } 

}
