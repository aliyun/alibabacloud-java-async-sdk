// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVodMediaPlayDataRequest} extends {@link RequestModel}
 *
 * <p>DescribeVodMediaPlayDataRequest</p>
 */
public class DescribeVodMediaPlayDataRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MediaId")
    private String mediaId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderName")
    private String orderName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderType")
    private String orderType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Os")
    private String os;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNo")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long pageNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PlayDate")
    private String playDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Region")
    private String region;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TerminalType")
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
         * The ID of the media file (VideoId). You can specify this parameter to query all playback data of a media file. You can specify only one media ID. You can use one of the following methods to obtain the ID:
         * <p>
         * 
         * *   Log on to the [ApsaraVideo VOD console](https://vod.console.aliyun.com). In the left-side navigation pane, choose **Media Files** > **Audio/Video**. On the page that appears, view the media ID.
         * *   Obtain the value of the VideoId parameter in the response to the [CreateUploadVideo](~~CreateUploadVideo~~) operation that you called to upload the audio or video file.
         * *   Obtain the value of VideoId by calling the [SearchMedia](~~SearchMedia~~) operation. This method is applicable to files that have been uploaded.
         */
        public Builder mediaId(String mediaId) {
            this.putQueryParameter("MediaId", mediaId);
            this.mediaId = mediaId;
            return this;
        }

        /**
         * The name of the metric. This parameter must be specified together with the `OrderType` parameter. You can specify this parameter to sort the returned data in ascending or descending order based on specific metrics. Valid values:
         * <p>
         * 
         * *   **PlaySuccessVv**: the total number of views.
         * *   **PlayPerVv**: the average views per viewer.
         * *   **PlayDuration**: the total playback duration.
         * *   **PlayDurationPerUv**: the average playback duration per viewer.
         */
        public Builder orderName(String orderName) {
            this.putQueryParameter("OrderName", orderName);
            this.orderName = orderName;
            return this;
        }

        /**
         * The sort type. This parameter must be specified together with the `OrderName` parameter. You can specify this parameter to sort the returned data in ascending or descending order based on specific metrics. Valid values:
         * <p>
         * 
         * *   **ASC**: The returned data is sorted in ascending order.
         * *   **DESC**: The returned data is sorted in descending order.
         */
        public Builder orderType(String orderType) {
            this.putQueryParameter("OrderType", orderType);
            this.orderType = orderType;
            return this;
        }

        /**
         * The operating system of the player. You can specify this parameter to query all playback data generated on a specific operating system. Valid values:
         * <p>
         * 
         * *   **Android**
         * *   **iOS**
         * *   **Windows**
         * *   **macOS**
         * *   **Linux**
         */
        public Builder os(String os) {
            this.putQueryParameter("Os", os);
            this.os = os;
            return this;
        }

        /**
         * The number of the page. You can specify a page number to return data from the specified page.
         */
        public Builder pageNo(Long pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * The number of entries per page. Maximum value: 100.
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The playback time. Specify the value in the yyyyMMdd format.
         * <p>
         * 
         * > *   You can query data only by day.
         * > *   You can query only data within the last 30 days.
         */
        public Builder playDate(String playDate) {
            this.putQueryParameter("PlayDate", playDate);
            this.playDate = playDate;
            return this;
        }

        /**
         * The region in which ApsaraVideo VOD is activated. You can specify this parameter to query all playback data generated only in a specific region. Valid values:
         * <p>
         * 
         * *   **cn-beijing**: China (Beijing)
         * *   **cn-shanghai**: China (Shanghai)
         * *   **cn-shenzhen**: China (Shenzhen)
         * *   **ap-northeast-1**: Japan (Tokyo)
         * *   **ap-southeast-1**: Singapore
         * *   **ap-southeast-5**: Indonesia (Jakarta)
         * *   **eu-central-1**: Germany (Frankfurt)
         * *   **ap-south-1**: India (Mumbai) (disabled)
         */
        public Builder region(String region) {
            this.putQueryParameter("Region", region);
            this.region = region;
            return this;
        }

        /**
         * The type of the player SDK. You can specify this parameter to query all playback data generated by using a specific type of player SDK. Valid values:
         * <p>
         * 
         * *   **Native**: ApsaraVideo Player SDK for Android or ApsaraVideo Player SDK for iOS
         * *   **Web**: ApsaraVideo Player SDK for Web
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
