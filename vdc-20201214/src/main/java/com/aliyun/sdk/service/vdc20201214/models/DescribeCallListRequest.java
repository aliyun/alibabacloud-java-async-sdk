// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vdc20201214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCallListRequest} extends {@link RequestModel}
 *
 * <p>DescribeCallListRequest</p>
 */
public class DescribeCallListRequest extends Request {
    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Query
    @NameInMap("CallStatus")
    private String callStatus;

    @Query
    @NameInMap("ChannelId")
    private String channelId;

    @Query
    @NameInMap("EndTs")
    @Validation(required = true)
    private Long endTs;

    @Query
    @NameInMap("OrderBy")
    private String orderBy;

    @Query
    @NameInMap("PageNo")
    @Validation(required = true)
    private Integer pageNo;

    @Query
    @NameInMap("PageSize")
    @Validation(required = true)
    private Integer pageSize;

    @Query
    @NameInMap("QueryMode")
    private String queryMode;

    @Query
    @NameInMap("StartTs")
    @Validation(required = true)
    private Long startTs;

    @Query
    @NameInMap("UserId")
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
         * AppId.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * CallStatus.
         */
        public Builder callStatus(String callStatus) {
            this.putQueryParameter("CallStatus", callStatus);
            this.callStatus = callStatus;
            return this;
        }

        /**
         * ChannelId.
         */
        public Builder channelId(String channelId) {
            this.putQueryParameter("ChannelId", channelId);
            this.channelId = channelId;
            return this;
        }

        /**
         * EndTs.
         */
        public Builder endTs(Long endTs) {
            this.putQueryParameter("EndTs", endTs);
            this.endTs = endTs;
            return this;
        }

        /**
         * OrderBy.
         */
        public Builder orderBy(String orderBy) {
            this.putQueryParameter("OrderBy", orderBy);
            this.orderBy = orderBy;
            return this;
        }

        /**
         * PageNo.
         */
        public Builder pageNo(Integer pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
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
         * QueryMode.
         */
        public Builder queryMode(String queryMode) {
            this.putQueryParameter("QueryMode", queryMode);
            this.queryMode = queryMode;
            return this;
        }

        /**
         * StartTs.
         */
        public Builder startTs(Long startTs) {
            this.putQueryParameter("StartTs", startTs);
            this.startTs = startTs;
            return this;
        }

        /**
         * UserId.
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
