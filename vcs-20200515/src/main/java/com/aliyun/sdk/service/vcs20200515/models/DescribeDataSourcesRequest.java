// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDataSourcesRequest} extends {@link RequestModel}
 *
 * <p>DescribeDataSourcesRequest</p>
 */
public class DescribeDataSourcesRequest extends Request {
    @Body
    @NameInMap("CorpIdList")
    private String corpIdList;

    @Body
    @NameInMap("DataSourceCategory")
    private String dataSourceCategory;

    @Body
    @NameInMap("DataSourceFilter")
    private String dataSourceFilter;

    @Body
    @NameInMap("DataSourceIdList")
    private String dataSourceIdList;

    @Body
    @NameInMap("DataSourceType")
    private String dataSourceType;

    @Body
    @NameInMap("PageNum")
    @Validation(required = true)
    private Long pageNum;

    @Body
    @NameInMap("PageSize")
    @Validation(required = true)
    private Long pageSize;

    @Body
    @NameInMap("StreamStatus")
    private String streamStatus;

    private DescribeDataSourcesRequest(Builder builder) {
        super(builder);
        this.corpIdList = builder.corpIdList;
        this.dataSourceCategory = builder.dataSourceCategory;
        this.dataSourceFilter = builder.dataSourceFilter;
        this.dataSourceIdList = builder.dataSourceIdList;
        this.dataSourceType = builder.dataSourceType;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.streamStatus = builder.streamStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDataSourcesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return corpIdList
     */
    public String getCorpIdList() {
        return this.corpIdList;
    }

    /**
     * @return dataSourceCategory
     */
    public String getDataSourceCategory() {
        return this.dataSourceCategory;
    }

    /**
     * @return dataSourceFilter
     */
    public String getDataSourceFilter() {
        return this.dataSourceFilter;
    }

    /**
     * @return dataSourceIdList
     */
    public String getDataSourceIdList() {
        return this.dataSourceIdList;
    }

    /**
     * @return dataSourceType
     */
    public String getDataSourceType() {
        return this.dataSourceType;
    }

    /**
     * @return pageNum
     */
    public Long getPageNum() {
        return this.pageNum;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return streamStatus
     */
    public String getStreamStatus() {
        return this.streamStatus;
    }

    public static final class Builder extends Request.Builder<DescribeDataSourcesRequest, Builder> {
        private String corpIdList; 
        private String dataSourceCategory; 
        private String dataSourceFilter; 
        private String dataSourceIdList; 
        private String dataSourceType; 
        private Long pageNum; 
        private Long pageSize; 
        private String streamStatus; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDataSourcesRequest response) {
            super(response);
            this.corpIdList = response.corpIdList;
            this.dataSourceCategory = response.dataSourceCategory;
            this.dataSourceFilter = response.dataSourceFilter;
            this.dataSourceIdList = response.dataSourceIdList;
            this.dataSourceType = response.dataSourceType;
            this.pageNum = response.pageNum;
            this.pageSize = response.pageSize;
            this.streamStatus = response.streamStatus;
        } 

        /**
         * CorpIdList.
         */
        public Builder corpIdList(String corpIdList) {
            this.putBodyParameter("CorpIdList", corpIdList);
            this.corpIdList = corpIdList;
            return this;
        }

        /**
         * DataSourceCategory.
         */
        public Builder dataSourceCategory(String dataSourceCategory) {
            this.putBodyParameter("DataSourceCategory", dataSourceCategory);
            this.dataSourceCategory = dataSourceCategory;
            return this;
        }

        /**
         * DataSourceFilter.
         */
        public Builder dataSourceFilter(String dataSourceFilter) {
            this.putBodyParameter("DataSourceFilter", dataSourceFilter);
            this.dataSourceFilter = dataSourceFilter;
            return this;
        }

        /**
         * DataSourceIdList.
         */
        public Builder dataSourceIdList(String dataSourceIdList) {
            this.putBodyParameter("DataSourceIdList", dataSourceIdList);
            this.dataSourceIdList = dataSourceIdList;
            return this;
        }

        /**
         * DataSourceType.
         */
        public Builder dataSourceType(String dataSourceType) {
            this.putBodyParameter("DataSourceType", dataSourceType);
            this.dataSourceType = dataSourceType;
            return this;
        }

        /**
         * PageNum.
         */
        public Builder pageNum(Long pageNum) {
            this.putBodyParameter("PageNum", pageNum);
            this.pageNum = pageNum;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * StreamStatus.
         */
        public Builder streamStatus(String streamStatus) {
            this.putBodyParameter("StreamStatus", streamStatus);
            this.streamStatus = streamStatus;
            return this;
        }

        @Override
        public DescribeDataSourcesRequest build() {
            return new DescribeDataSourcesRequest(this);
        } 

    } 

}
