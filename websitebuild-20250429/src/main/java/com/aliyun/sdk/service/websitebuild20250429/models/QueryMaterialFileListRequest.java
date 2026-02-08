// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.websitebuild20250429.models;

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
 * {@link QueryMaterialFileListRequest} extends {@link RequestModel}
 *
 * <p>QueryMaterialFileListRequest</p>
 */
public class QueryMaterialFileListRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bizId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DirectoryId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String directoryId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxFileSize")
    private Long maxFileSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MinFileSize")
    private Long minFileSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderColumn")
    private String orderColumn;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderType")
    private String orderType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNum")
    private Integer pageNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StatusList")
    private java.util.List<String> statusList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SuffixList")
    private java.util.List<String> suffixList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TypeList")
    private java.util.List<String> typeList;

    private QueryMaterialFileListRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.bizId = builder.bizId;
        this.directoryId = builder.directoryId;
        this.maxFileSize = builder.maxFileSize;
        this.maxResults = builder.maxResults;
        this.minFileSize = builder.minFileSize;
        this.name = builder.name;
        this.nextToken = builder.nextToken;
        this.orderColumn = builder.orderColumn;
        this.orderType = builder.orderType;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.statusList = builder.statusList;
        this.suffixList = builder.suffixList;
        this.typeList = builder.typeList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryMaterialFileListRequest create() {
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
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return directoryId
     */
    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * @return maxFileSize
     */
    public Long getMaxFileSize() {
        return this.maxFileSize;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return minFileSize
     */
    public Long getMinFileSize() {
        return this.minFileSize;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return orderColumn
     */
    public String getOrderColumn() {
        return this.orderColumn;
    }

    /**
     * @return orderType
     */
    public String getOrderType() {
        return this.orderType;
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
     * @return statusList
     */
    public java.util.List<String> getStatusList() {
        return this.statusList;
    }

    /**
     * @return suffixList
     */
    public java.util.List<String> getSuffixList() {
        return this.suffixList;
    }

    /**
     * @return typeList
     */
    public java.util.List<String> getTypeList() {
        return this.typeList;
    }

    public static final class Builder extends Request.Builder<QueryMaterialFileListRequest, Builder> {
        private String regionId; 
        private String bizId; 
        private String directoryId; 
        private Long maxFileSize; 
        private Integer maxResults; 
        private Long minFileSize; 
        private String name; 
        private String nextToken; 
        private String orderColumn; 
        private String orderType; 
        private Integer pageNum; 
        private Integer pageSize; 
        private java.util.List<String> statusList; 
        private java.util.List<String> suffixList; 
        private java.util.List<String> typeList; 

        private Builder() {
            super();
        } 

        private Builder(QueryMaterialFileListRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.bizId = request.bizId;
            this.directoryId = request.directoryId;
            this.maxFileSize = request.maxFileSize;
            this.maxResults = request.maxResults;
            this.minFileSize = request.minFileSize;
            this.name = request.name;
            this.nextToken = request.nextToken;
            this.orderColumn = request.orderColumn;
            this.orderType = request.orderType;
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
            this.statusList = request.statusList;
            this.suffixList = request.suffixList;
            this.typeList = request.typeList;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>WD20250703155602000001</p>
         */
        public Builder bizId(String bizId) {
            this.putQueryParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>68157a0a-769a-4364-bbdc-a0e2cf3d5ad</p>
         */
        public Builder directoryId(String directoryId) {
            this.putQueryParameter("DirectoryId", directoryId);
            this.directoryId = directoryId;
            return this;
        }

        /**
         * MaxFileSize.
         */
        public Builder maxFileSize(Long maxFileSize) {
            this.putQueryParameter("MaxFileSize", maxFileSize);
            this.maxFileSize = maxFileSize;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * MinFileSize.
         */
        public Builder minFileSize(Long minFileSize) {
            this.putQueryParameter("MinFileSize", minFileSize);
            this.minFileSize = minFileSize;
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
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * OrderColumn.
         */
        public Builder orderColumn(String orderColumn) {
            this.putQueryParameter("OrderColumn", orderColumn);
            this.orderColumn = orderColumn;
            return this;
        }

        /**
         * OrderType.
         */
        public Builder orderType(String orderType) {
            this.putQueryParameter("OrderType", orderType);
            this.orderType = orderType;
            return this;
        }

        /**
         * PageNum.
         */
        public Builder pageNum(Integer pageNum) {
            this.putQueryParameter("PageNum", pageNum);
            this.pageNum = pageNum;
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
         * StatusList.
         */
        public Builder statusList(java.util.List<String> statusList) {
            String statusListShrink = shrink(statusList, "StatusList", "json");
            this.putQueryParameter("StatusList", statusListShrink);
            this.statusList = statusList;
            return this;
        }

        /**
         * SuffixList.
         */
        public Builder suffixList(java.util.List<String> suffixList) {
            String suffixListShrink = shrink(suffixList, "SuffixList", "json");
            this.putQueryParameter("SuffixList", suffixListShrink);
            this.suffixList = suffixList;
            return this;
        }

        /**
         * TypeList.
         */
        public Builder typeList(java.util.List<String> typeList) {
            String typeListShrink = shrink(typeList, "TypeList", "json");
            this.putQueryParameter("TypeList", typeListShrink);
            this.typeList = typeList;
            return this;
        }

        @Override
        public QueryMaterialFileListRequest build() {
            return new QueryMaterialFileListRequest(this);
        } 

    } 

}
