// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20170823.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeOssResultItemsRequest} extends {@link RequestModel}
 *
 * <p>DescribeOssResultItemsRequest</p>
 */
public class DescribeOssResultItemsRequest extends Request {
    @Query
    @NameInMap("Bucket")
    private String bucket;

    @Query
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @Query
    @NameInMap("EndDate")
    private String endDate;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("MaxScore")
    private Float maxScore;

    @Query
    @NameInMap("MinScore")
    private Float minScore;

    @Query
    @NameInMap("Object")
    private String object;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("QueryId")
    private String queryId;

    @Query
    @NameInMap("ResourceType")
    private String resourceType;

    @Query
    @NameInMap("Scene")
    private String scene;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    @Query
    @NameInMap("StartDate")
    private String startDate;

    @Query
    @NameInMap("Stock")
    @Validation(required = true)
    private Boolean stock;

    @Query
    @NameInMap("StockTaskId")
    private Long stockTaskId;

    @Query
    @NameInMap("Suggestion")
    private String suggestion;

    @Query
    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeOssResultItemsRequest(Builder builder) {
        super(builder);
        this.bucket = builder.bucket;
        this.currentPage = builder.currentPage;
        this.endDate = builder.endDate;
        this.lang = builder.lang;
        this.maxScore = builder.maxScore;
        this.minScore = builder.minScore;
        this.object = builder.object;
        this.pageSize = builder.pageSize;
        this.queryId = builder.queryId;
        this.resourceType = builder.resourceType;
        this.scene = builder.scene;
        this.sourceIp = builder.sourceIp;
        this.startDate = builder.startDate;
        this.stock = builder.stock;
        this.stockTaskId = builder.stockTaskId;
        this.suggestion = builder.suggestion;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeOssResultItemsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bucket
     */
    public String getBucket() {
        return this.bucket;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return endDate
     */
    public String getEndDate() {
        return this.endDate;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return maxScore
     */
    public Float getMaxScore() {
        return this.maxScore;
    }

    /**
     * @return minScore
     */
    public Float getMinScore() {
        return this.minScore;
    }

    /**
     * @return object
     */
    public String getObject() {
        return this.object;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return queryId
     */
    public String getQueryId() {
        return this.queryId;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return scene
     */
    public String getScene() {
        return this.scene;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    /**
     * @return startDate
     */
    public String getStartDate() {
        return this.startDate;
    }

    /**
     * @return stock
     */
    public Boolean getStock() {
        return this.stock;
    }

    /**
     * @return stockTaskId
     */
    public Long getStockTaskId() {
        return this.stockTaskId;
    }

    /**
     * @return suggestion
     */
    public String getSuggestion() {
        return this.suggestion;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder extends Request.Builder<DescribeOssResultItemsRequest, Builder> {
        private String bucket; 
        private Integer currentPage; 
        private String endDate; 
        private String lang; 
        private Float maxScore; 
        private Float minScore; 
        private String object; 
        private Integer pageSize; 
        private String queryId; 
        private String resourceType; 
        private String scene; 
        private String sourceIp; 
        private String startDate; 
        private Boolean stock; 
        private Long stockTaskId; 
        private String suggestion; 
        private Integer totalCount; 

        private Builder() {
            super();
        } 

        private Builder(DescribeOssResultItemsRequest request) {
            super(request);
            this.bucket = request.bucket;
            this.currentPage = request.currentPage;
            this.endDate = request.endDate;
            this.lang = request.lang;
            this.maxScore = request.maxScore;
            this.minScore = request.minScore;
            this.object = request.object;
            this.pageSize = request.pageSize;
            this.queryId = request.queryId;
            this.resourceType = request.resourceType;
            this.scene = request.scene;
            this.sourceIp = request.sourceIp;
            this.startDate = request.startDate;
            this.stock = request.stock;
            this.stockTaskId = request.stockTaskId;
            this.suggestion = request.suggestion;
            this.totalCount = request.totalCount;
        } 

        /**
         * Bucket.
         */
        public Builder bucket(String bucket) {
            this.putQueryParameter("Bucket", bucket);
            this.bucket = bucket;
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
         * EndDate.
         */
        public Builder endDate(String endDate) {
            this.putQueryParameter("EndDate", endDate);
            this.endDate = endDate;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * MaxScore.
         */
        public Builder maxScore(Float maxScore) {
            this.putQueryParameter("MaxScore", maxScore);
            this.maxScore = maxScore;
            return this;
        }

        /**
         * MinScore.
         */
        public Builder minScore(Float minScore) {
            this.putQueryParameter("MinScore", minScore);
            this.minScore = minScore;
            return this;
        }

        /**
         * Object.
         */
        public Builder object(String object) {
            this.putQueryParameter("Object", object);
            this.object = object;
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
         * QueryId.
         */
        public Builder queryId(String queryId) {
            this.putQueryParameter("QueryId", queryId);
            this.queryId = queryId;
            return this;
        }

        /**
         * ResourceType.
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * Scene.
         */
        public Builder scene(String scene) {
            this.putQueryParameter("Scene", scene);
            this.scene = scene;
            return this;
        }

        /**
         * SourceIp.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * StartDate.
         */
        public Builder startDate(String startDate) {
            this.putQueryParameter("StartDate", startDate);
            this.startDate = startDate;
            return this;
        }

        /**
         * Stock.
         */
        public Builder stock(Boolean stock) {
            this.putQueryParameter("Stock", stock);
            this.stock = stock;
            return this;
        }

        /**
         * StockTaskId.
         */
        public Builder stockTaskId(Long stockTaskId) {
            this.putQueryParameter("StockTaskId", stockTaskId);
            this.stockTaskId = stockTaskId;
            return this;
        }

        /**
         * Suggestion.
         */
        public Builder suggestion(String suggestion) {
            this.putQueryParameter("Suggestion", suggestion);
            this.suggestion = suggestion;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.putQueryParameter("TotalCount", totalCount);
            this.totalCount = totalCount;
            return this;
        }

        @Override
        public DescribeOssResultItemsRequest build() {
            return new DescribeOssResultItemsRequest(this);
        } 

    } 

}
