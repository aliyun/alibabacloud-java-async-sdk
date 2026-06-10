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
 * {@link ListAppPublishHistoryRequest} extends {@link RequestModel}
 *
 * <p>ListAppPublishHistoryRequest</p>
 */
public class ListAppPublishHistoryRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizId")
    private String bizId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeployChannel")
    private String deployChannel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Keyword")
    private String keyword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNum")
    private Integer pageNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PublishEnv")
    private String publishEnv;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Sort")
    private String sort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Subchannel")
    private String subchannel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WebsiteDomain")
    private String websiteDomain;

    private ListAppPublishHistoryRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.bizId = builder.bizId;
        this.deployChannel = builder.deployChannel;
        this.keyword = builder.keyword;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.publishEnv = builder.publishEnv;
        this.sort = builder.sort;
        this.status = builder.status;
        this.subchannel = builder.subchannel;
        this.websiteDomain = builder.websiteDomain;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAppPublishHistoryRequest create() {
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
     * @return deployChannel
     */
    public String getDeployChannel() {
        return this.deployChannel;
    }

    /**
     * @return keyword
     */
    public String getKeyword() {
        return this.keyword;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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
     * @return publishEnv
     */
    public String getPublishEnv() {
        return this.publishEnv;
    }

    /**
     * @return sort
     */
    public String getSort() {
        return this.sort;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return subchannel
     */
    public String getSubchannel() {
        return this.subchannel;
    }

    /**
     * @return websiteDomain
     */
    public String getWebsiteDomain() {
        return this.websiteDomain;
    }

    public static final class Builder extends Request.Builder<ListAppPublishHistoryRequest, Builder> {
        private String regionId; 
        private String bizId; 
        private String deployChannel; 
        private String keyword; 
        private Integer maxResults; 
        private String nextToken; 
        private Integer pageNum; 
        private Integer pageSize; 
        private String publishEnv; 
        private String sort; 
        private String status; 
        private String subchannel; 
        private String websiteDomain; 

        private Builder() {
            super();
        } 

        private Builder(ListAppPublishHistoryRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.bizId = request.bizId;
            this.deployChannel = request.deployChannel;
            this.keyword = request.keyword;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
            this.publishEnv = request.publishEnv;
            this.sort = request.sort;
            this.status = request.status;
            this.subchannel = request.subchannel;
            this.websiteDomain = request.websiteDomain;
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
         * BizId.
         */
        public Builder bizId(String bizId) {
            this.putQueryParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * DeployChannel.
         */
        public Builder deployChannel(String deployChannel) {
            this.putQueryParameter("DeployChannel", deployChannel);
            this.deployChannel = deployChannel;
            return this;
        }

        /**
         * Keyword.
         */
        public Builder keyword(String keyword) {
            this.putQueryParameter("Keyword", keyword);
            this.keyword = keyword;
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
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
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
         * PublishEnv.
         */
        public Builder publishEnv(String publishEnv) {
            this.putQueryParameter("PublishEnv", publishEnv);
            this.publishEnv = publishEnv;
            return this;
        }

        /**
         * Sort.
         */
        public Builder sort(String sort) {
            this.putQueryParameter("Sort", sort);
            this.sort = sort;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * Subchannel.
         */
        public Builder subchannel(String subchannel) {
            this.putQueryParameter("Subchannel", subchannel);
            this.subchannel = subchannel;
            return this;
        }

        /**
         * WebsiteDomain.
         */
        public Builder websiteDomain(String websiteDomain) {
            this.putQueryParameter("WebsiteDomain", websiteDomain);
            this.websiteDomain = websiteDomain;
            return this;
        }

        @Override
        public ListAppPublishHistoryRequest build() {
            return new ListAppPublishHistoryRequest(this);
        } 

    } 

}
