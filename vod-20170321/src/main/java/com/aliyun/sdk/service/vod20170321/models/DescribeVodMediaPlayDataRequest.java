// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
         * <p>The ID of the media file (VideoId). You can specify this parameter to query all playback data of a media file. You can specify only one media ID. You can use one of the following methods to obtain the ID:</p>
         * <ul>
         * <li>Log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD console</a>. In the left-side navigation pane, choose <strong>Media Files</strong> &gt; <strong>Audio/Video</strong>. On the page that appears, view the media ID.</li>
         * <li>Obtain the value of the VideoId parameter in the response to the <a href="~~CreateUploadVideo~~">CreateUploadVideo</a> operation that you called to upload the audio or video file.</li>
         * <li>Obtain the value of VideoId by calling the <a href="~~SearchMedia~~">SearchMedia</a> operation. This method is applicable to files that have been uploaded.</li>
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
         * <p>The name of the metric. This parameter must be specified together with the <code>OrderType</code> parameter. You can specify this parameter to sort the returned data in ascending or descending order based on specific metrics. Valid values:</p>
         * <ul>
         * <li><strong>PlaySuccessVv</strong>: the total number of views.</li>
         * <li><strong>PlayPerVv</strong>: the average views per viewer.</li>
         * <li><strong>PlayDuration</strong>: the total playback duration.</li>
         * <li><strong>PlayDurationPerUv</strong>: the average playback duration per viewer.</li>
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
         * <p>The sort type. This parameter must be specified together with the <code>OrderName</code> parameter. You can specify this parameter to sort the returned data in ascending or descending order based on specific metrics. Valid values:</p>
         * <ul>
         * <li><strong>ASC</strong>: The returned data is sorted in ascending order.</li>
         * <li><strong>DESC</strong>: The returned data is sorted in descending order.</li>
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
         * <p>The operating system of the player. You can specify this parameter to query all playback data generated on a specific operating system. Valid values:</p>
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
         * <p>The number of the page. You can specify a page number to return data from the specified page.</p>
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
         * <p>The number of entries per page. Maximum value: 100.</p>
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
         * <p>The playback time. Specify the value in the yyyyMMdd format.</p>
         * <blockquote>
         * <ul>
         * <li>You can query data only by day.</li>
         * <li>You can query only data within the last 30 days.</li>
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
         * <p>The region in which ApsaraVideo VOD is activated. You can specify this parameter to query all playback data generated only in a specific region. Valid values:</p>
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
         * <p>The type of the player SDK. You can specify this parameter to query all playback data generated by using a specific type of player SDK. Valid values:</p>
         * <ul>
         * <li><strong>Native</strong>: ApsaraVideo Player SDK for Android or ApsaraVideo Player SDK for iOS</li>
         * <li><strong>Web</strong>: ApsaraVideo Player SDK for Web</li>
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
