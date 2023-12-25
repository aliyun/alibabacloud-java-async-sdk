// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryCloudRecordVideoResponseBody} extends {@link TeaModel}
 *
 * <p>QueryCloudRecordVideoResponseBody</p>
 */
public class QueryCloudRecordVideoResponseBody extends TeaModel {
    @NameInMap("requestId")
    private String requestId;

    @NameInMap("videoList")
    private java.util.List < VideoList> videoList;

    private QueryCloudRecordVideoResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.videoList = builder.videoList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryCloudRecordVideoResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return videoList
     */
    public java.util.List < VideoList> getVideoList() {
        return this.videoList;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < VideoList> videoList; 

        /**
         * requestId
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * videoList.
         */
        public Builder videoList(java.util.List < VideoList> videoList) {
            this.videoList = videoList;
            return this;
        }

        public QueryCloudRecordVideoResponseBody build() {
            return new QueryCloudRecordVideoResponseBody(this);
        } 

    } 

    public static class VideoList extends TeaModel {
        @NameInMap("Duration")
        private Long duration;

        @NameInMap("EndTime")
        private Long endTime;

        @NameInMap("FileSize")
        private Long fileSize;

        @NameInMap("MediaId")
        private String mediaId;

        @NameInMap("RecordId")
        private String recordId;

        @NameInMap("RecordType")
        private Long recordType;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("StartTime")
        private Long startTime;

        @NameInMap("UserId")
        private String userId;

        private VideoList(Builder builder) {
            this.duration = builder.duration;
            this.endTime = builder.endTime;
            this.fileSize = builder.fileSize;
            this.mediaId = builder.mediaId;
            this.recordId = builder.recordId;
            this.recordType = builder.recordType;
            this.regionId = builder.regionId;
            this.startTime = builder.startTime;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VideoList create() {
            return builder().build();
        }

        /**
         * @return duration
         */
        public Long getDuration() {
            return this.duration;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return fileSize
         */
        public Long getFileSize() {
            return this.fileSize;
        }

        /**
         * @return mediaId
         */
        public String getMediaId() {
            return this.mediaId;
        }

        /**
         * @return recordId
         */
        public String getRecordId() {
            return this.recordId;
        }

        /**
         * @return recordType
         */
        public Long getRecordType() {
            return this.recordType;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private Long duration; 
            private Long endTime; 
            private Long fileSize; 
            private String mediaId; 
            private String recordId; 
            private Long recordType; 
            private String regionId; 
            private Long startTime; 
            private String userId; 

            /**
             * Duration.
             */
            public Builder duration(Long duration) {
                this.duration = duration;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * FileSize.
             */
            public Builder fileSize(Long fileSize) {
                this.fileSize = fileSize;
                return this;
            }

            /**
             * MediaId.
             */
            public Builder mediaId(String mediaId) {
                this.mediaId = mediaId;
                return this;
            }

            /**
             * RecordId.
             */
            public Builder recordId(String recordId) {
                this.recordId = recordId;
                return this;
            }

            /**
             * RecordType.
             */
            public Builder recordType(Long recordType) {
                this.recordType = recordType;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public VideoList build() {
                return new VideoList(this);
            } 

        } 

    }
}
