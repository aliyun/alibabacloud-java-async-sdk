// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20180116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryAdvertisementSettleInfoRequest} extends {@link RequestModel}
 *
 * <p>QueryAdvertisementSettleInfoRequest</p>
 */
public class QueryAdvertisementSettleInfoRequest extends Request {
    @Query
    @NameInMap("BizId")
    private String bizId;

    @Query
    @NameInMap("ChannelId")
    private String channelId;

    @Query
    @NameInMap("EndTime")
    private String endTime;

    @Query
    @NameInMap("ExtInfo")
    private String extInfo;

    @Query
    @NameInMap("MediaSettleDetailId")
    private String mediaSettleDetailId;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("SettleNo")
    private String settleNo;

    @Query
    @NameInMap("StartTime")
    private String startTime;

    private QueryAdvertisementSettleInfoRequest(Builder builder) {
        super(builder);
        this.bizId = builder.bizId;
        this.channelId = builder.channelId;
        this.endTime = builder.endTime;
        this.extInfo = builder.extInfo;
        this.mediaSettleDetailId = builder.mediaSettleDetailId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.settleNo = builder.settleNo;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAdvertisementSettleInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return channelId
     */
    public String getChannelId() {
        return this.channelId;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return extInfo
     */
    public String getExtInfo() {
        return this.extInfo;
    }

    /**
     * @return mediaSettleDetailId
     */
    public String getMediaSettleDetailId() {
        return this.mediaSettleDetailId;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return settleNo
     */
    public String getSettleNo() {
        return this.settleNo;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<QueryAdvertisementSettleInfoRequest, Builder> {
        private String bizId; 
        private String channelId; 
        private String endTime; 
        private String extInfo; 
        private String mediaSettleDetailId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String settleNo; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(QueryAdvertisementSettleInfoRequest request) {
            super(request);
            this.bizId = request.bizId;
            this.channelId = request.channelId;
            this.endTime = request.endTime;
            this.extInfo = request.extInfo;
            this.mediaSettleDetailId = request.mediaSettleDetailId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.settleNo = request.settleNo;
            this.startTime = request.startTime;
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
         * ChannelId.
         */
        public Builder channelId(String channelId) {
            this.putQueryParameter("ChannelId", channelId);
            this.channelId = channelId;
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
         * ExtInfo.
         */
        public Builder extInfo(String extInfo) {
            this.putQueryParameter("ExtInfo", extInfo);
            this.extInfo = extInfo;
            return this;
        }

        /**
         * MediaSettleDetailId.
         */
        public Builder mediaSettleDetailId(String mediaSettleDetailId) {
            this.putQueryParameter("MediaSettleDetailId", mediaSettleDetailId);
            this.mediaSettleDetailId = mediaSettleDetailId;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
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
         * SettleNo.
         */
        public Builder settleNo(String settleNo) {
            this.putQueryParameter("SettleNo", settleNo);
            this.settleNo = settleNo;
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

        @Override
        public QueryAdvertisementSettleInfoRequest build() {
            return new QueryAdvertisementSettleInfoRequest(this);
        } 

    } 

}
