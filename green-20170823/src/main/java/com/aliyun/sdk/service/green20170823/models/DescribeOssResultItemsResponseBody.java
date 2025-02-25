// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20170823.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeOssResultItemsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeOssResultItemsResponseBody</p>
 */
public class DescribeOssResultItemsResponseBody extends TeaModel {
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("QueryId")
    private String queryId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ScanResultList")
    private java.util.List < ScanResultList> scanResultList;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeOssResultItemsResponseBody(Builder builder) {
        this.currentPage = builder.currentPage;
        this.pageSize = builder.pageSize;
        this.queryId = builder.queryId;
        this.requestId = builder.requestId;
        this.scanResultList = builder.scanResultList;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeOssResultItemsResponseBody create() {
        return builder().build();
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return queryId
     */
    public String getQueryId() {
        return this.queryId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return scanResultList
     */
    public java.util.List < ScanResultList> getScanResultList() {
        return this.scanResultList;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer currentPage; 
        private Integer pageSize; 
        private String queryId; 
        private String requestId; 
        private java.util.List < ScanResultList> scanResultList; 
        private Integer totalCount; 

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * QueryId.
         */
        public Builder queryId(String queryId) {
            this.queryId = queryId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ScanResultList.
         */
        public Builder scanResultList(java.util.List < ScanResultList> scanResultList) {
            this.scanResultList = scanResultList;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeOssResultItemsResponseBody build() {
            return new DescribeOssResultItemsResponseBody(this);
        } 

    } 

    public static class FrameResults extends TeaModel {
        @NameInMap("Offset")
        private Integer offset;

        @NameInMap("Thumbnail")
        private String thumbnail;

        @NameInMap("Url")
        private String url;

        private FrameResults(Builder builder) {
            this.offset = builder.offset;
            this.thumbnail = builder.thumbnail;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FrameResults create() {
            return builder().build();
        }

        /**
         * @return offset
         */
        public Integer getOffset() {
            return this.offset;
        }

        /**
         * @return thumbnail
         */
        public String getThumbnail() {
            return this.thumbnail;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private Integer offset; 
            private String thumbnail; 
            private String url; 

            /**
             * Offset.
             */
            public Builder offset(Integer offset) {
                this.offset = offset;
                return this;
            }

            /**
             * Thumbnail.
             */
            public Builder thumbnail(String thumbnail) {
                this.thumbnail = thumbnail;
                return this;
            }

            /**
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public FrameResults build() {
                return new FrameResults(this);
            } 

        } 

    }
    public static class VoiceSegmentAntispamResults extends TeaModel {
        @NameInMap("EndTime")
        private Integer endTime;

        @NameInMap("Label")
        private String label;

        @NameInMap("StartTime")
        private Integer startTime;

        @NameInMap("Text")
        private String text;

        private VoiceSegmentAntispamResults(Builder builder) {
            this.endTime = builder.endTime;
            this.label = builder.label;
            this.startTime = builder.startTime;
            this.text = builder.text;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VoiceSegmentAntispamResults create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public Integer getEndTime() {
            return this.endTime;
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        /**
         * @return startTime
         */
        public Integer getStartTime() {
            return this.startTime;
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
        }

        public static final class Builder {
            private Integer endTime; 
            private String label; 
            private Integer startTime; 
            private String text; 

            /**
             * EndTime.
             */
            public Builder endTime(Integer endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * Label.
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(Integer startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * Text.
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            public VoiceSegmentAntispamResults build() {
                return new VoiceSegmentAntispamResults(this);
            } 

        } 

    }
    public static class ScanResultList extends TeaModel {
        @NameInMap("Bucket")
        private String bucket;

        @NameInMap("Content")
        private String content;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("DataId")
        private String dataId;

        @NameInMap("FrameResults")
        private java.util.List < FrameResults> frameResults;

        @NameInMap("HandleStatus")
        private Integer handleStatus;

        @NameInMap("Id")
        private Long id;

        @NameInMap("NewUrl")
        private String newUrl;

        @NameInMap("Object")
        private String object;

        @NameInMap("RequestTime")
        private String requestTime;

        @NameInMap("ResourceStatus")
        private Integer resourceStatus;

        @NameInMap("ScanFinishedTime")
        private String scanFinishedTime;

        @NameInMap("Score")
        private String score;

        @NameInMap("Suggestion")
        private String suggestion;

        @NameInMap("TaskId")
        private String taskId;

        @NameInMap("Thumbnail")
        private String thumbnail;

        @NameInMap("VoiceSegmentAntispamResults")
        private java.util.List < VoiceSegmentAntispamResults> voiceSegmentAntispamResults;

        private ScanResultList(Builder builder) {
            this.bucket = builder.bucket;
            this.content = builder.content;
            this.createTime = builder.createTime;
            this.dataId = builder.dataId;
            this.frameResults = builder.frameResults;
            this.handleStatus = builder.handleStatus;
            this.id = builder.id;
            this.newUrl = builder.newUrl;
            this.object = builder.object;
            this.requestTime = builder.requestTime;
            this.resourceStatus = builder.resourceStatus;
            this.scanFinishedTime = builder.scanFinishedTime;
            this.score = builder.score;
            this.suggestion = builder.suggestion;
            this.taskId = builder.taskId;
            this.thumbnail = builder.thumbnail;
            this.voiceSegmentAntispamResults = builder.voiceSegmentAntispamResults;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScanResultList create() {
            return builder().build();
        }

        /**
         * @return bucket
         */
        public String getBucket() {
            return this.bucket;
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return dataId
         */
        public String getDataId() {
            return this.dataId;
        }

        /**
         * @return frameResults
         */
        public java.util.List < FrameResults> getFrameResults() {
            return this.frameResults;
        }

        /**
         * @return handleStatus
         */
        public Integer getHandleStatus() {
            return this.handleStatus;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return newUrl
         */
        public String getNewUrl() {
            return this.newUrl;
        }

        /**
         * @return object
         */
        public String getObject() {
            return this.object;
        }

        /**
         * @return requestTime
         */
        public String getRequestTime() {
            return this.requestTime;
        }

        /**
         * @return resourceStatus
         */
        public Integer getResourceStatus() {
            return this.resourceStatus;
        }

        /**
         * @return scanFinishedTime
         */
        public String getScanFinishedTime() {
            return this.scanFinishedTime;
        }

        /**
         * @return score
         */
        public String getScore() {
            return this.score;
        }

        /**
         * @return suggestion
         */
        public String getSuggestion() {
            return this.suggestion;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return thumbnail
         */
        public String getThumbnail() {
            return this.thumbnail;
        }

        /**
         * @return voiceSegmentAntispamResults
         */
        public java.util.List < VoiceSegmentAntispamResults> getVoiceSegmentAntispamResults() {
            return this.voiceSegmentAntispamResults;
        }

        public static final class Builder {
            private String bucket; 
            private String content; 
            private String createTime; 
            private String dataId; 
            private java.util.List < FrameResults> frameResults; 
            private Integer handleStatus; 
            private Long id; 
            private String newUrl; 
            private String object; 
            private String requestTime; 
            private Integer resourceStatus; 
            private String scanFinishedTime; 
            private String score; 
            private String suggestion; 
            private String taskId; 
            private String thumbnail; 
            private java.util.List < VoiceSegmentAntispamResults> voiceSegmentAntispamResults; 

            /**
             * Bucket.
             */
            public Builder bucket(String bucket) {
                this.bucket = bucket;
                return this;
            }

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * DataId.
             */
            public Builder dataId(String dataId) {
                this.dataId = dataId;
                return this;
            }

            /**
             * FrameResults.
             */
            public Builder frameResults(java.util.List < FrameResults> frameResults) {
                this.frameResults = frameResults;
                return this;
            }

            /**
             * HandleStatus.
             */
            public Builder handleStatus(Integer handleStatus) {
                this.handleStatus = handleStatus;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * NewUrl.
             */
            public Builder newUrl(String newUrl) {
                this.newUrl = newUrl;
                return this;
            }

            /**
             * Object.
             */
            public Builder object(String object) {
                this.object = object;
                return this;
            }

            /**
             * RequestTime.
             */
            public Builder requestTime(String requestTime) {
                this.requestTime = requestTime;
                return this;
            }

            /**
             * ResourceStatus.
             */
            public Builder resourceStatus(Integer resourceStatus) {
                this.resourceStatus = resourceStatus;
                return this;
            }

            /**
             * ScanFinishedTime.
             */
            public Builder scanFinishedTime(String scanFinishedTime) {
                this.scanFinishedTime = scanFinishedTime;
                return this;
            }

            /**
             * Score.
             */
            public Builder score(String score) {
                this.score = score;
                return this;
            }

            /**
             * Suggestion.
             */
            public Builder suggestion(String suggestion) {
                this.suggestion = suggestion;
                return this;
            }

            /**
             * TaskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * Thumbnail.
             */
            public Builder thumbnail(String thumbnail) {
                this.thumbnail = thumbnail;
                return this;
            }

            /**
             * VoiceSegmentAntispamResults.
             */
            public Builder voiceSegmentAntispamResults(java.util.List < VoiceSegmentAntispamResults> voiceSegmentAntispamResults) {
                this.voiceSegmentAntispamResults = voiceSegmentAntispamResults;
                return this;
            }

            public ScanResultList build() {
                return new ScanResultList(this);
            } 

        } 

    }
}
