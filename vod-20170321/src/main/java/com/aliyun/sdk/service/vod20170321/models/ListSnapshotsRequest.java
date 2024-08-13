// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * The validity period of the snapshot URL. Default value: **3600**. Minimum value: **3600**. Unit: seconds.
         * <p>
         * 
         * *   This parameter takes effect only when you enable URL signing. For more information, see [Configure URL signing](~~57007~~).
         * *   If you specify a value smaller than **3,600 seconds**, **3600** is used by default.
         * *   If the snapshot URL is an Object Storage Service (OSS) URL, the maximum value for this parameter is **2592000** (30 days). This reduces risks on the origin.
         */
        public Builder authTimeout(String authTimeout) {
            this.putQueryParameter("AuthTimeout", authTimeout);
            this.authTimeout = authTimeout;
            return this;
        }

        /**
         * The page number. Default value: **1**.
         */
        public Builder pageNo(String pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * The number of entries per page. Default value: **20**. Maximum value: **100**.
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The type of snapshots to return. Valid values:
         * <p>
         * 
         * *   **CoverSnapshot**: thumbnail snapshot
         * *   **NormalSnapshot**: regular snapshot
         * *   **SpriteSnapshot**: sprite snapshot
         * *   **SpriteOriginSnapshot**: sprite source snapshot
         * *   **WebVttSnapshot**: WebVTT snapshot
         */
        public Builder snapshotType(String snapshotType) {
            this.putQueryParameter("SnapshotType", snapshotType);
            this.snapshotType = snapshotType;
            return this;
        }

        /**
         * The ID of the video. You can use one of the following methods to obtain the ID:
         * <p>
         * 
         * *   Log on to the [ApsaraVideo VOD console](https://vod.console.aliyun.com). In the left-side navigation pane, choose **Media Files** > **Audio/Video** to view the video ID.
         * *   Obtain the video ID from the response to the [CreateUploadVideo](~~CreateUploadVideo~~) operation that you call to obtain the upload URL and credential.
         * *   Obtain the video ID from the response to the [SearchMedia](~~SearchMedia~~) operation that you call to query videos.
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
