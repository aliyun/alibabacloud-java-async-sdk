// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.push20160801.models;

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
 * {@link QueryPushRecordsRequest} extends {@link RequestModel}
 *
 * <p>QueryPushRecordsRequest</p>
 */
public class QueryPushRecordsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long appKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Keyword")
    private String keyword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Page")
    @com.aliyun.core.annotation.Validation(maximum = 10000, minimum = 1)
    private Integer page;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PushType")
    private String pushType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Source")
    private String source;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Target")
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

        private Builder(QueryPushRecordsRequest request) {
            super(request);
            this.appKey = request.appKey;
            this.endTime = request.endTime;
            this.keyword = request.keyword;
            this.nextToken = request.nextToken;
            this.page = request.page;
            this.pageSize = request.pageSize;
            this.pushType = request.pushType;
            this.source = request.source;
            this.startTime = request.startTime;
            this.target = request.target;
        } 

        /**
         * <p>The AppKey information.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>333526247</p>
         */
        public Builder appKey(Long appKey) {
            this.putQueryParameter("AppKey", appKey);
            this.appKey = appKey;
            return this;
        }

        /**
         * <p>The end time of the query. The time is in UTC and follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-09-29T06:24:58Z</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The query keyword. The query is performed based on the MessageId, Title, and Body fields. The system performs Chinese word segmentation on the title and body of the push, and uses the segmented words for the query instead of substring matching.</p>
         * 
         * <strong>example:</strong>
         * <p>Statistics data test notification 805</p>
         */
        public Builder keyword(String keyword) {
            this.putQueryParameter("Keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * <p><strong>[Deprecated]</strong> This parameter is deprecated and no longer used.</p>
         * 
         * <strong>example:</strong>
         * <p>FFPpkmhCPm*****************xjk=</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The current page number of the push records. Default value: 1. Maximum value: 10000.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        public Builder page(Integer page) {
            this.putQueryParameter("Page", page);
            this.page = page;
            return this;
        }

        /**
         * <p>The number of entries per page. Default value: 20. Maximum value: 100.</p>
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
         * <p>The push type. Valid values:</p>
         * <ul>
         * <li><p><strong>MESSAGE</strong>: message</p>
         * </li>
         * <li><p><strong>NOTICE</strong>: notification</p>
         * </li>
         * <li><p><strong>LIVE_ACTIVITY</strong>: live activity</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NOTICE</p>
         */
        public Builder pushType(String pushType) {
            this.putQueryParameter("PushType", pushType);
            this.pushType = pushType;
            return this;
        }

        /**
         * <p>The push source. Valid values:</p>
         * <ul>
         * <li><strong>API</strong>: push initiated by OpenAPI, including pushes initiated from the OpenAPI platform console</li>
         * <li><strong>CONSOLE</strong>: push initiated from the Mobile Push console</li>
         * <li><strong>OpenAPIExplorer</strong>: push initiated from the Alibaba Cloud OpenAPI Explorer platform</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>API</p>
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        /**
         * <p>The start time of the query. The time is in UTC and follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-09-15T02:05:24Z</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The push target. Valid values:</p>
         * <ul>
         * <li><p><strong>DEVICE</strong>: push by device</p>
         * </li>
         * <li><p><strong>ACCOUNT</strong>: push by account</p>
         * </li>
         * <li><p><strong>ALIAS</strong>: push by alias</p>
         * </li>
         * <li><p><strong>TAG</strong>: push by tag</p>
         * </li>
         * <li><p><strong>ALL</strong>: push to all devices</p>
         * </li>
         * <li><p><strong>TBD</strong>: initialize continuous push, where the push target is specified by the subsequent ContinuouslyPush operation</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DEVICE</p>
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
