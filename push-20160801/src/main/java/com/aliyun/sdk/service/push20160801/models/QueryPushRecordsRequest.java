// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.push20160801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryPushRecordsRequest} extends {@link RequestModel}
 *
 * <p>QueryPushRecordsRequest</p>
 */
public class QueryPushRecordsRequest extends Request {
    @Query
    @NameInMap("AppKey")
    @Validation(required = true)
    private Long appKey;

    @Query
    @NameInMap("EndTime")
    @Validation(required = true)
    private String endTime;

    @Query
    @NameInMap("Keyword")
    private String keyword;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("Page")
    @Validation(maximum = 10000, minimum = 1)
    private Integer page;

    @Query
    @NameInMap("PageSize")
    @Validation(maximum = 100, minimum = 1)
    private Integer pageSize;

    @Query
    @NameInMap("PushType")
    private String pushType;

    @Query
    @NameInMap("Source")
    private String source;

    @Query
    @NameInMap("StartTime")
    @Validation(required = true)
    private String startTime;

    @Query
    @NameInMap("Target")
    private String target;

    private QueryPushRecordsRequest(Builder builder) {
        super(builder);
        this.appKey = builder.appKey;
        this.endTime = builder.endTime;
        this.keyword = builder.keyword;
        this.nextToken = builder.nextToken;
        this.page = builder.page;
        this.pageSize = builder.pageSize;
        this.pushType = builder.pushType;
        this.source = builder.source;
        this.startTime = builder.startTime;
        this.target = builder.target;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryPushRecordsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appKey
     */
    public Long getAppKey() {
        return this.appKey;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return keyword
     */
    public String getKeyword() {
        return this.keyword;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return page
     */
    public Integer getPage() {
        return this.page;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return pushType
     */
    public String getPushType() {
        return this.pushType;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return target
     */
    public String getTarget() {
        return this.target;
    }

    public static final class Builder extends Request.Builder<QueryPushRecordsRequest, Builder> {
        private Long appKey; 
        private String endTime; 
        private String keyword; 
        private String nextToken; 
        private Integer page; 
        private Integer pageSize; 
        private String pushType; 
        private String source; 
        private String startTime; 
        private String target; 

        private Builder() {
            super();
        } 

        private Builder(QueryPushRecordsRequest response) {
            super(response);
            this.appKey = response.appKey;
            this.endTime = response.endTime;
            this.keyword = response.keyword;
            this.nextToken = response.nextToken;
            this.page = response.page;
            this.pageSize = response.pageSize;
            this.pushType = response.pushType;
            this.source = response.source;
            this.startTime = response.startTime;
            this.target = response.target;
        } 

        /**
         * AppKey.
         */
        public Builder appKey(Long appKey) {
            this.putQueryParameter("AppKey", appKey);
            this.appKey = appKey;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
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
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * Page.
         */
        public Builder page(Integer page) {
            this.putQueryParameter("Page", page);
            this.page = page;
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
         * PushType.
         */
        public Builder pushType(String pushType) {
            this.putQueryParameter("PushType", pushType);
            this.pushType = pushType;
            return this;
        }

        /**
         * Source.
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * Target.
         */
        public Builder target(String target) {
            this.putQueryParameter("Target", target);
            this.target = target;
            return this;
        }

        @Override
        public QueryPushRecordsRequest build() {
            return new QueryPushRecordsRequest(this);
        } 

    } 

}
