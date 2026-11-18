// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
         * <p>The media ID, which is the audio or video ID (VideoId). Specify this parameter filtered query playback data for a specific media file. Only one media ID can be specified. You can obtain the media ID by using the following methods:</p>
         * <ul>
         * <li>For audio or video files uploaded through the console, log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD console</a> and choose <strong>Media Files</strong> &gt; <strong>Audio/Video</strong> to view the audio or video ID.</li>
         * <li>When you upload an audio or video file by calling the <a href="~~CreateUploadVideo~~">CreateUploadVideo</a> operation, the audio or video ID is the value of the VideoId response parameter.</li>
         * <li>After the audio or video file is uploaded, you can call the <a href="~~SearchMedia~~">SearchMedia</a> operation filtered query the audio or video ID, which is the value of the VideoId response parameter.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>9ae2af636ca6c10412f44891fc****</p>
         */
        public Builder mediaId(String mediaId) {
            this.putQueryParameter("MediaId", mediaId);
            this.mediaId = mediaId;
            return this;
        }

        /**
         * <p>The metric name. This parameter is used together with the <code>OrderType</code> parameter. Specify this parameter to sort the returned data in ascending or descending order by a specified metric. Valid values:</p>
         * <ul>
         * <li><strong>PlaySuccessVv</strong>: total plays.</li>
         * <li><strong>PlayPerVv</strong>: average plays per user.</li>
         * <li><strong>PlayDuration</strong>: total play duration.</li>
         * <li><strong>PlayDurationPerUv</strong>: average play duration per user.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PlaySuccessVv</p>
         */
        public Builder orderName(String orderName) {
            this.putQueryParameter("OrderName", orderName);
            this.orderName = orderName;
            return this;
        }

        /**
         * <p>The sort order. This parameter is used together with the <code>OrderName</code> parameter. Specify this parameter to sort the returned data in ascending or descending order by a specified metric. Valid values:</p>
         * <ul>
         * <li><strong>ASC</strong>: ascending order. The returned data is sorted from smallest to largest.</li>
         * <li><strong>DESC</strong>: descending order. The returned data is sorted from largest to smallest.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ASC</p>
         */
        public Builder orderType(String orderType) {
            this.putQueryParameter("OrderType", orderType);
            this.orderType = orderType;
            return this;
        }

        /**
         * <p>The operating system of the playback device. Specify this parameter to perform a filtered query for playback data of all audio and video files by operating system. Valid values:</p>
         * <ul>
         * <li><strong>Android</strong></li>
         * <li><strong>iOS</strong></li>
         * <li><strong>Windows</strong></li>
         * <li><strong>macOS</strong></li>
         * <li><strong>Linux</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Android</p>
         */
        public Builder os(String os) {
            this.putQueryParameter("Os", os);
            this.os = os;
            return this;
        }

        /**
         * <p>The page number of the data to return. Specify this parameter to set the page from which data starts to be returned.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNo(Long pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * <p>The number of entries per page. Specify this parameter to set the number of entries displayed on each page. Maximum value: 100.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The playback date. Unit: day. Format: yyyyMMdd.</p>
         * <blockquote>
         * <ul>
         * <li>Only daily queries are supported.</li>
         * <li>Only data within the last 30 days can be queried.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>20240322</p>
         */
        public Builder playDate(String playDate) {
            this.putQueryParameter("PlayDate", playDate);
            this.playDate = playDate;
            return this;
        }

        /**
         * <p>The service region. Specify this parameter to perform a filtered query for playback data of all audio and video files by service region. Valid values:</p>
         * <ul>
         * <li><strong>cn-beijing</strong>: China (Beijing)</li>
         * <li><strong>cn-shanghai</strong>: China (Shanghai)</li>
         * <li><strong>cn-shenzhen</strong>: China (Shenzhen)</li>
         * <li><strong>ap-northeast-1</strong>: Japan (Tokyo)</li>
         * <li><strong>ap-southeast-1</strong>: Singapore</li>
         * <li><strong>ap-southeast-5</strong>: Indonesia (Jakarta)</li>
         * <li><strong>eu-central-1</strong>: Germany (Frankfurt)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder region(String region) {
            this.putQueryParameter("Region", region);
            this.region = region;
            return this;
        }

        /**
         * <p>The terminal type of the Player SDK. Specify this parameter to perform a filtered query for playback data of all audio and video files by terminal type. Valid values:</p>
         * <ul>
         * <li><strong>Native</strong>: Android Player SDK or iOS Player SDK.</li>
         * <li><strong>Web</strong>: Web Player SDK.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Native</p>
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
