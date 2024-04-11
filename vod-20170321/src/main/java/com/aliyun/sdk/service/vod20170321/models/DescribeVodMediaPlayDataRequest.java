// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVodMediaPlayDataRequest} extends {@link RequestModel}
 *
 * <p>DescribeVodMediaPlayDataRequest</p>
 */
public class DescribeVodMediaPlayDataRequest extends Request {
    @Query
    @NameInMap("MediaId")
    private String mediaId;

    @Query
    @NameInMap("OrderName")
    private String orderName;

    @Query
    @NameInMap("OrderType")
    private String orderType;

    @Query
    @NameInMap("Os")
    private String os;

    @Query
    @NameInMap("PageNo")
    @Validation(required = true)
    private Long pageNo;

    @Query
    @NameInMap("PageSize")
    @Validation(required = true)
    private Long pageSize;

    @Query
    @NameInMap("PlayDate")
    private String playDate;

    @Query
    @NameInMap("Region")
    private String region;

    @Query
    @NameInMap("TerminalType")
    private String terminalType;

    private DescribeVodMediaPlayDataRequest(Builder builder) {
        super(builder);
        this.mediaId = builder.mediaId;
        this.orderName = builder.orderName;
        this.orderType = builder.orderType;
        this.os = builder.os;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.playDate = builder.playDate;
        this.region = builder.region;
        this.terminalType = builder.terminalType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVodMediaPlayDataRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return mediaId
     */
    public String getMediaId() {
        return this.mediaId;
    }

    /**
     * @return orderName
     */
    public String getOrderName() {
        return this.orderName;
    }

    /**
     * @return orderType
     */
    public String getOrderType() {
        return this.orderType;
    }

    /**
     * @return os
     */
    public String getOs() {
        return this.os;
    }

    /**
     * @return pageNo
     */
    public Long getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return playDate
     */
    public String getPlayDate() {
        return this.playDate;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return terminalType
     */
    public String getTerminalType() {
        return this.terminalType;
    }

    public static final class Builder extends Request.Builder<DescribeVodMediaPlayDataRequest, Builder> {
        private String mediaId; 
        private String orderName; 
        private String orderType; 
        private String os; 
        private Long pageNo; 
        private Long pageSize; 
        private String playDate; 
        private String region; 
        private String terminalType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeVodMediaPlayDataRequest request) {
            super(request);
            this.mediaId = request.mediaId;
            this.orderName = request.orderName;
            this.orderType = request.orderType;
            this.os = request.os;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.playDate = request.playDate;
            this.region = request.region;
            this.terminalType = request.terminalType;
        } 

        /**
         * MediaId.
         */
        public Builder mediaId(String mediaId) {
            this.putQueryParameter("MediaId", mediaId);
            this.mediaId = mediaId;
            return this;
        }

        /**
         * OrderName.
         */
        public Builder orderName(String orderName) {
            this.putQueryParameter("OrderName", orderName);
            this.orderName = orderName;
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
         * Os.
         */
        public Builder os(String os) {
            this.putQueryParameter("Os", os);
            this.os = os;
            return this;
        }

        /**
         * PageNo.
         */
        public Builder pageNo(Long pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * PlayDate.
         */
        public Builder playDate(String playDate) {
            this.putQueryParameter("PlayDate", playDate);
            this.playDate = playDate;
            return this;
        }

        /**
         * Region.
         */
        public Builder region(String region) {
            this.putQueryParameter("Region", region);
            this.region = region;
            return this;
        }

        /**
         * TerminalType.
         */
        public Builder terminalType(String terminalType) {
            this.putQueryParameter("TerminalType", terminalType);
            this.terminalType = terminalType;
            return this;
        }

        @Override
        public DescribeVodMediaPlayDataRequest build() {
            return new DescribeVodMediaPlayDataRequest(this);
        } 

    } 

}
