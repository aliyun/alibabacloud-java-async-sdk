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
         * The validity period of the snapshot URL. Unit: seconds. Default value: **3600**. Minimum value: **3600**.
         * <p>
         * 
         * *   This parameter only takes effect when [URL authentication](~~57007~~) is enabled.
         * *   If the specified validity period is less than **3600** seconds, the default value is **3600**.
         * *   If an Object Storage Service (OSS) URL is returned, the maximum validity period is limited to **2592000** seconds (30 days) to reduce security risks of the origin.
         */
        public Builder authTimeout(String authTimeout) {
            this.putQueryParameter("AuthTimeout", authTimeout);
            this.authTimeout = authTimeout;
            return this;
        }

        /**
         * The number of the page to turn. Default value: **1**.
         */
        public Builder pageNo(String pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * The number of entries to return on each page. Default value: **20**. Maximum value: **100**.
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The type of snapshots that are returned. Valid values:
         * <p>
         * 
         * *   **CoverSnapshot**: thumbnail snapshot
         * *   **NormalSnapshot**: normal snapshot
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
         * The ID of the video.
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
