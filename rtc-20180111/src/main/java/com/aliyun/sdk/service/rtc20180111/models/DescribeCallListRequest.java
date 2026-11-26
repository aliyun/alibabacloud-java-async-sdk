// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111.models;

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
 * {@link DescribeCallListRequest} extends {@link RequestModel}
 *
 * <p>DescribeCallListRequest</p>
 */
public class DescribeCallListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallStatus")
    private String callStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChannelId")
    private String channelId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTs")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long endTs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderBy")
    private String orderBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNo")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueryMode")
    private String queryMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTs")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long startTs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserId")
    private String userId;

    private DescribeCallListRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.callStatus = builder.callStatus;
        this.channelId = builder.channelId;
        this.endTs = builder.endTs;
        this.orderBy = builder.orderBy;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.queryMode = builder.queryMode;
        this.startTs = builder.startTs;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCallListRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return callStatus
     */
    public String getCallStatus() {
        return this.callStatus;
    }

    /**
     * @return channelId
     */
    public String getChannelId() {
        return this.channelId;
    }

    /**
     * @return endTs
     */
    public Long getEndTs() {
        return this.endTs;
    }

    /**
     * @return orderBy
     */
    public String getOrderBy() {
        return this.orderBy;
    }

    /**
     * @return pageNo
     */
    public Integer getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return queryMode
     */
    public String getQueryMode() {
        return this.queryMode;
    }

    /**
     * @return startTs
     */
    public Long getStartTs() {
        return this.startTs;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<DescribeCallListRequest, Builder> {
        private String appId; 
        private String callStatus; 
        private String channelId; 
        private Long endTs; 
        private String orderBy; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String queryMode; 
        private Long startTs; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCallListRequest request) {
            super(request);
            this.appId = request.appId;
            this.callStatus = request.callStatus;
            this.channelId = request.channelId;
            this.endTs = request.endTs;
            this.orderBy = request.orderBy;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.queryMode = request.queryMode;
            this.startTs = request.startTs;
            this.userId = request.userId;
        } 

        /**
         * <p>APP ID。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>testappid</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>Call status. Valid values:</p>
         * <ul>
         * <li><strong>IN</strong>: In progress.</li>
         * <li><strong>OUT</strong>: Ended.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OUT</p>
         */
        public Builder callStatus(String callStatus) {
            this.putQueryParameter("CallStatus", callStatus);
            this.callStatus = callStatus;
            return this;
        }

        /**
         * <p>Channel ID.</p>
         * 
         * <strong>example:</strong>
         * <p>311</p>
         */
        public Builder channelId(String channelId) {
            this.putQueryParameter("ChannelId", channelId);
            this.channelId = channelId;
            return this;
        }

        /**
         * <p>The end time of the query, expressed as a UNIX timestamp. Unit: seconds.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1615892596</p>
         */
        public Builder endTs(Long endTs) {
            this.putQueryParameter("EndTs", endTs);
            this.endTs = endTs;
            return this;
        }

        /**
         * <p>Sorting field. Valid values:</p>
         * <ul>
         * <li><strong>BAD_EXP_USER_COUNT_DESC</strong>: Sort by the number of users with poor experience in descending order.</li>
         * <li><strong>BAD_EXP_USER_COUNT_ASC</strong>: Sort by the number of users with poor experience in ascending order.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>BAD_EXP_USER_COUNT_DESC</p>
         */
        public Builder orderBy(String orderBy) {
            this.putQueryParameter("OrderBy", orderBy);
            this.orderBy = orderBy;
            return this;
        }

        /**
         * <p>Page number. Minimum value: 1. Maximum value: 200.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNo(Integer pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * <p>Quantity per page, minimum value is 1, maximum value is 200.</p>
         * <p>This parameter is required.</p>
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
         * <p>Query mode. Valid values:</p>
         * <ul>
         * <li><strong>ALL</strong>: All calls.</li>
         * <li><strong>FOLLOW</strong>: Followed calls.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ALL</p>
         */
        public Builder queryMode(String queryMode) {
            this.putQueryParameter("QueryMode", queryMode);
            this.queryMode = queryMode;
            return this;
        }

        /**
         * <p>Start Time of the query, represented as a UNIX timestamp in seconds.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1615806196</p>
         */
        public Builder startTs(Long startTs) {
            this.putQueryParameter("StartTs", startTs);
            this.startTs = startTs;
            return this;
        }

        /**
         * <p>User ID.</p>
         * 
         * <strong>example:</strong>
         * <p>c906531af5f9****</p>
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public DescribeCallListRequest build() {
            return new DescribeCallListRequest(this);
        } 

    } 

}
