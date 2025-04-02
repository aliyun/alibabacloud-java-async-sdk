// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

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
 * {@link QueryMinutesResponseBody} extends {@link TeaModel}
 *
 * <p>QueryMinutesResponseBody</p>
 */
public class QueryMinutesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("audioList")
    private java.util.List<AudioList> audioList;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("vendorRequestId")
    private String vendorRequestId;

    @com.aliyun.core.annotation.NameInMap("vendorType")
    private String vendorType;

    private QueryMinutesResponseBody(Builder builder) {
        this.audioList = builder.audioList;
        this.requestId = builder.requestId;
        this.vendorRequestId = builder.vendorRequestId;
        this.vendorType = builder.vendorType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryMinutesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return audioList
     */
    public java.util.List<AudioList> getAudioList() {
        return this.audioList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return vendorRequestId
     */
    public String getVendorRequestId() {
        return this.vendorRequestId;
    }

    /**
     * @return vendorType
     */
    public String getVendorType() {
        return this.vendorType;
    }

    public static final class Builder {
        private java.util.List<AudioList> audioList; 
        private String requestId; 
        private String vendorRequestId; 
        private String vendorType; 

        private Builder() {
        } 

        private Builder(QueryMinutesResponseBody model) {
            this.audioList = model.audioList;
            this.requestId = model.requestId;
            this.vendorRequestId = model.vendorRequestId;
            this.vendorType = model.vendorType;
        } 

        /**
         * audioList.
         */
        public Builder audioList(java.util.List<AudioList> audioList) {
            this.audioList = audioList;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * vendorRequestId.
         */
        public Builder vendorRequestId(String vendorRequestId) {
            this.vendorRequestId = vendorRequestId;
            return this;
        }

        /**
         * vendorType.
         */
        public Builder vendorType(String vendorType) {
            this.vendorType = vendorType;
            return this;
        }

        public QueryMinutesResponseBody build() {
            return new QueryMinutesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryMinutesResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMinutesResponseBody</p>
     */
    public static class AudioList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Duration")
        private Long duration;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("FileSize")
        private Long fileSize;

        @com.aliyun.core.annotation.NameInMap("PlayUrl")
        private String playUrl;

        @com.aliyun.core.annotation.NameInMap("RecordId")
        private String recordId;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private AudioList(Builder builder) {
            this.duration = builder.duration;
            this.endTime = builder.endTime;
            this.fileSize = builder.fileSize;
            this.playUrl = builder.playUrl;
            this.recordId = builder.recordId;
            this.startTime = builder.startTime;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AudioList create() {
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
         * @return playUrl
         */
        public String getPlayUrl() {
            return this.playUrl;
        }

        /**
         * @return recordId
         */
        public String getRecordId() {
            return this.recordId;
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
            private String playUrl; 
            private String recordId; 
            private Long startTime; 
            private String userId; 

            private Builder() {
            } 

            private Builder(AudioList model) {
                this.duration = model.duration;
                this.endTime = model.endTime;
                this.fileSize = model.fileSize;
                this.playUrl = model.playUrl;
                this.recordId = model.recordId;
                this.startTime = model.startTime;
                this.userId = model.userId;
            } 

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
             * PlayUrl.
             */
            public Builder playUrl(String playUrl) {
                this.playUrl = playUrl;
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

            public AudioList build() {
                return new AudioList(this);
            } 

        } 

    }
}
