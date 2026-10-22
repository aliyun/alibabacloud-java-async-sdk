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
 * {@link ListAppConversationsRequest} extends {@link RequestModel}
 *
 * <p>ListAppConversationsRequest</p>
 */
public class ListAppConversationsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BotId")
    private String botId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndModifyTime")
    private String endModifyTime;

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
    @com.aliyun.core.annotation.NameInMap("SiteId")
    private String siteId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartModifyTime")
    private String startModifyTime;

    private ListAppConversationsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.botId = builder.botId;
        this.endModifyTime = builder.endModifyTime;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.siteId = builder.siteId;
        this.startModifyTime = builder.startModifyTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAppConversationsRequest create() {
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
     * @return botId
     */
    public String getBotId() {
        return this.botId;
    }

    /**
     * @return endModifyTime
     */
    public String getEndModifyTime() {
        return this.endModifyTime;
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
     * @return siteId
     */
    public String getSiteId() {
        return this.siteId;
    }

    /**
     * @return startModifyTime
     */
    public String getStartModifyTime() {
        return this.startModifyTime;
    }

    public static final class Builder extends Request.Builder<ListAppConversationsRequest, Builder> {
        private String regionId; 
        private String botId; 
        private String endModifyTime; 
        private Integer maxResults; 
        private String nextToken; 
        private Integer pageNum; 
        private Integer pageSize; 
        private String siteId; 
        private String startModifyTime; 

        private Builder() {
            super();
        } 

        private Builder(ListAppConversationsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.botId = request.botId;
            this.endModifyTime = request.endModifyTime;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
            this.siteId = request.siteId;
            this.startModifyTime = request.startModifyTime;
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
         * <p>The bot ID.</p>
         * 
         * <strong>example:</strong>
         * <p>Zero2</p>
         */
        public Builder botId(String botId) {
            this.putQueryParameter("BotId", botId);
            this.botId = botId;
            return this;
        }

        /**
         * <p>The end modification time in ISO 8601 format.</p>
         * 
         * <strong>example:</strong>
         * <p>20201212</p>
         */
        public Builder endModifyTime(String endModifyTime) {
            this.putQueryParameter("EndModifyTime", endModifyTime);
            this.endModifyTime = endModifyTime;
            return this;
        }

        /**
         * <p>The maximum number of results to return for a single query. Valid values: 10 to 100. Default value: 20.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The token that is used to start the next query. If no next query is available, this parameter is empty.</p>
         * 
         * <strong>example:</strong>
         * <p>0l45bkwM022Dt+rOvPi/oQ==</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNum(Integer pageNum) {
            this.putQueryParameter("PageNum", pageNum);
            this.pageNum = pageNum;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The site ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1168642640022064</p>
         */
        public Builder siteId(String siteId) {
            this.putQueryParameter("SiteId", siteId);
            this.siteId = siteId;
            return this;
        }

        /**
         * <p>The start modification time in ISO 8601 format.</p>
         * 
         * <strong>example:</strong>
         * <p>20200101</p>
         */
        public Builder startModifyTime(String startModifyTime) {
            this.putQueryParameter("StartModifyTime", startModifyTime);
            this.startModifyTime = startModifyTime;
            return this;
        }

        @Override
        public ListAppConversationsRequest build() {
            return new ListAppConversationsRequest(this);
        } 

    } 

}
