// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTableLevelRequest} extends {@link RequestModel}
 *
 * <p>ListTableLevelRequest</p>
 */
public class ListTableLevelRequest extends Request {
    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("LevelType")
    @Validation(required = true, maximum = 10)
    private Integer levelType;

    @Query
    @NameInMap("PageNum")
    private Integer pageNum;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("ProjectId")
    @Validation(required = true, minimum = 1)
    private Long projectId;

    private ListTableLevelRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.levelType = builder.levelType;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.projectId = builder.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTableLevelRequest create() {
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
     * @return levelType
     */
    public Integer getLevelType() {
        return this.levelType;
    }

    /**
     * @return pageNum
     */
    public Integer getPageNum() {
        return this.pageNum;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    public static final class Builder extends Request.Builder<ListTableLevelRequest, Builder> {
        private String regionId; 
        private Integer levelType; 
        private Integer pageNum; 
        private Integer pageSize; 
        private Long projectId; 

        private Builder() {
            super();
        } 

        private Builder(ListTableLevelRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.levelType = request.levelType;
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
            this.projectId = request.projectId;
        } 

        /**
         * The ID of the region where the service is activated. For example, the ID of the China (Shanghai) region is cn-shanghai, and that of the China (Zhangjiakou) region is cn-zhangjiakou. The system automatically determines the value of this parameter based on the endpoint used to call the operation.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The type of the table level. Valid values: 1 and 2. A value of 1 indicates the logical level. A value of 2 indicates the physical level.
         */
        public Builder levelType(Integer levelType) {
            this.putQueryParameter("LevelType", levelType);
            this.levelType = levelType;
            return this;
        }

        /**
         * The number of the page to return. Default value: 1.
         */
        public Builder pageNum(Integer pageNum) {
            this.putQueryParameter("PageNum", pageNum);
            this.pageNum = pageNum;
            return this;
        }

        /**
         * The number of entries to return on each page. Default value: 10.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the DataWorks workspace. You can log on to the DataWorks console to obtain the ID.
         */
        public Builder projectId(Long projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        @Override
        public ListTableLevelRequest build() {
            return new ListTableLevelRequest(this);
        } 

    } 

}
