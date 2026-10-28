// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quotas20200510.models;

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
 * {@link ListAlarmHistoriesRequest} extends {@link RequestModel}
 *
 * <p>ListAlarmHistoriesRequest</p>
 */
public class ListAlarmHistoriesRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AlarmId")
    private String alarmId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Long endTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Keyword")
    private String keyword;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProductCode")
    private String productCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private Long startTime;

    private ListAlarmHistoriesRequest(Builder builder) {
        super(builder);
        this.alarmId = builder.alarmId;
        this.endTime = builder.endTime;
        this.keyword = builder.keyword;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.productCode = builder.productCode;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAlarmHistoriesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alarmId
     */
    public String getAlarmId() {
        return this.alarmId;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
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
     * @return productCode
     */
    public String getProductCode() {
        return this.productCode;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<ListAlarmHistoriesRequest, Builder> {
        private String alarmId; 
        private Long endTime; 
        private String keyword; 
        private Integer maxResults; 
        private String nextToken; 
        private String productCode; 
        private Long startTime; 

        private Builder() {
            super();
        } 

        private Builder(ListAlarmHistoriesRequest request) {
            super(request);
            this.alarmId = request.alarmId;
            this.endTime = request.endTime;
            this.keyword = request.keyword;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.productCode = request.productCode;
            this.startTime = request.startTime;
        } 

        /**
         * <p>The alert ID.</p>
         * 
         * <strong>example:</strong>
         * <p>18b3be23-b7b0-4d45-91bc-d0c331aa****</p>
         */
        public Builder alarmId(String alarmId) {
            this.putBodyParameter("AlarmId", alarmId);
            this.alarmId = alarmId;
            return this;
        }

        /**
         * <p>The end time of the query.</p>
         * 
         * <strong>example:</strong>
         * <p>20201024</p>
         */
        public Builder endTime(Long endTime) {
            this.putBodyParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The search keyword.</p>
         * 
         * <strong>example:</strong>
         * <p>Quantity</p>
         */
        public Builder keyword(String keyword) {
            this.putBodyParameter("Keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * <p>The maximum number of entries to return for the current query.</p>
         * <p>Valid values: 1 to 200. Default value: 30.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putBodyParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The token that specifies the starting position of the query. An empty value indicates that the query starts from the beginning.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder nextToken(String nextToken) {
            this.putBodyParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The abbreviation of the cloud service name.</p>
         * <blockquote>
         * <p>For more information about the cloud services that support Quota Center, see <a href="https://help.aliyun.com/document_detail/182368.html">Cloud services that support Quota Center</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ecs</p>
         */
        public Builder productCode(String productCode) {
            this.putBodyParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        /**
         * <p>The start time of the query.</p>
         * 
         * <strong>example:</strong>
         * <p>20201020</p>
         */
        public Builder startTime(Long startTime) {
            this.putBodyParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public ListAlarmHistoriesRequest build() {
            return new ListAlarmHistoriesRequest(this);
        } 

    } 

}
