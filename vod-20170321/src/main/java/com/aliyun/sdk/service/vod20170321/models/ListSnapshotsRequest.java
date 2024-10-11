// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListSnapshotsRequest} extends {@link RequestModel}
 *
 * <p>ListSnapshotsRequest</p>
 */
public class ListSnapshotsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthTimeout")
    private String authTimeout;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNo")
    private String pageNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private String pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SnapshotType")
    private String snapshotType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VideoId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String videoId;

    private ListSnapshotsRequest(Builder builder) {
        super(builder);
        this.authTimeout = builder.authTimeout;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.snapshotType = builder.snapshotType;
        this.videoId = builder.videoId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSnapshotsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authTimeout
     */
    public String getAuthTimeout() {
        return this.authTimeout;
    }

    /**
     * @return pageNo
     */
    public String getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return snapshotType
     */
    public String getSnapshotType() {
        return this.snapshotType;
    }

    /**
     * @return videoId
     */
    public String getVideoId() {
        return this.videoId;
    }

    public static final class Builder extends Request.Builder<ListSnapshotsRequest, Builder> {
        private String authTimeout; 
        private String pageNo; 
        private String pageSize; 
        private String snapshotType; 
        private String videoId; 

        private Builder() {
            super();
        } 

        private Builder(ListSnapshotsRequest request) {
            super(request);
            this.authTimeout = request.authTimeout;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.snapshotType = request.snapshotType;
            this.videoId = request.videoId;
        } 

        /**
         * <p>The validity period of the snapshot URL. Default value: <strong>3600</strong>. Minimum value: <strong>3600</strong>. Unit: seconds.</p>
         * <ul>
         * <li>This parameter takes effect only when you enable URL signing. For more information, see <a href="https://help.aliyun.com/document_detail/57007.html">Configure URL signing</a>.</li>
         * <li>If you specify a value smaller than <strong>3,600 seconds</strong>, <strong>3600</strong> is used by default.</li>
         * <li>If the snapshot URL is an Object Storage Service (OSS) URL, the maximum value for this parameter is <strong>2592000</strong> (30 days). This reduces risks on the origin.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>3600</p>
         */
        public Builder authTimeout(String authTimeout) {
            this.putQueryParameter("AuthTimeout", authTimeout);
            this.authTimeout = authTimeout;
            return this;
        }

        /**
         * <p>The page number. Default value: <strong>1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNo(String pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * <p>The number of entries per page. Default value: <strong>20</strong>. Maximum value: <strong>100</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The type of snapshots to return. Valid values:</p>
         * <ul>
         * <li><strong>CoverSnapshot</strong>: thumbnail snapshot</li>
         * <li><strong>NormalSnapshot</strong>: regular snapshot</li>
         * <li><strong>SpriteSnapshot</strong>: sprite snapshot</li>
         * <li><strong>SpriteOriginSnapshot</strong>: sprite source snapshot</li>
         * <li><strong>WebVttSnapshot</strong>: WebVTT snapshot</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CoverSnapshot</p>
         */
        public Builder snapshotType(String snapshotType) {
            this.putQueryParameter("SnapshotType", snapshotType);
            this.snapshotType = snapshotType;
            return this;
        }

        /**
         * <p>The ID of the video. You can use one of the following methods to obtain the ID:</p>
         * <ul>
         * <li>Log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD console</a>. In the left-side navigation pane, choose <strong>Media Files</strong> &gt; <strong>Audio/Video</strong> to view the video ID.</li>
         * <li>Obtain the video ID from the response to the <a href="~~CreateUploadVideo~~">CreateUploadVideo</a> operation that you call to obtain the upload URL and credential.</li>
         * <li>Obtain the video ID from the response to the <a href="~~SearchMedia~~">SearchMedia</a> operation that you call to query videos.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>d3e680e618708fbf2cae7cc931****</p>
         */
        public Builder videoId(String videoId) {
            this.putQueryParameter("VideoId", videoId);
            this.videoId = videoId;
            return this;
        }

        @Override
        public ListSnapshotsRequest build() {
            return new ListSnapshotsRequest(this);
        } 

    } 

}
