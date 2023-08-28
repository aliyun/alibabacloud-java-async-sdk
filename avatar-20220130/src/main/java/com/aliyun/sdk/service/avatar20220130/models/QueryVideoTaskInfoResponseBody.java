// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.avatar20220130.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryVideoTaskInfoResponseBody} extends {@link TeaModel}
 *
 * <p>QueryVideoTaskInfoResponseBody</p>
 */
public class QueryVideoTaskInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private QueryVideoTaskInfoResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryVideoTaskInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryVideoTaskInfoResponseBody build() {
            return new QueryVideoTaskInfoResponseBody(this);
        } 

    } 

    public static class TaskResult extends TeaModel {
        @NameInMap("AlphaUrl")
        private String alphaUrl;

        @NameInMap("FailCode")
        private String failCode;

        @NameInMap("FailReason")
        private String failReason;

        @NameInMap("PreviewPic")
        private String previewPic;

        @NameInMap("SubtitlesUrl")
        private String subtitlesUrl;

        @NameInMap("VideoDuration")
        private Integer videoDuration;

        @NameInMap("VideoUrl")
        private String videoUrl;

        @NameInMap("WordSubtitlesUrl")
        private String wordSubtitlesUrl;

        private TaskResult(Builder builder) {
            this.alphaUrl = builder.alphaUrl;
            this.failCode = builder.failCode;
            this.failReason = builder.failReason;
            this.previewPic = builder.previewPic;
            this.subtitlesUrl = builder.subtitlesUrl;
            this.videoDuration = builder.videoDuration;
            this.videoUrl = builder.videoUrl;
            this.wordSubtitlesUrl = builder.wordSubtitlesUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TaskResult create() {
            return builder().build();
        }

        /**
         * @return alphaUrl
         */
        public String getAlphaUrl() {
            return this.alphaUrl;
        }

        /**
         * @return failCode
         */
        public String getFailCode() {
            return this.failCode;
        }

        /**
         * @return failReason
         */
        public String getFailReason() {
            return this.failReason;
        }

        /**
         * @return previewPic
         */
        public String getPreviewPic() {
            return this.previewPic;
        }

        /**
         * @return subtitlesUrl
         */
        public String getSubtitlesUrl() {
            return this.subtitlesUrl;
        }

        /**
         * @return videoDuration
         */
        public Integer getVideoDuration() {
            return this.videoDuration;
        }

        /**
         * @return videoUrl
         */
        public String getVideoUrl() {
            return this.videoUrl;
        }

        /**
         * @return wordSubtitlesUrl
         */
        public String getWordSubtitlesUrl() {
            return this.wordSubtitlesUrl;
        }

        public static final class Builder {
            private String alphaUrl; 
            private String failCode; 
            private String failReason; 
            private String previewPic; 
            private String subtitlesUrl; 
            private Integer videoDuration; 
            private String videoUrl; 
            private String wordSubtitlesUrl; 

            /**
             * AlphaUrl.
             */
            public Builder alphaUrl(String alphaUrl) {
                this.alphaUrl = alphaUrl;
                return this;
            }

            /**
             * FailCode.
             */
            public Builder failCode(String failCode) {
                this.failCode = failCode;
                return this;
            }

            /**
             * FailReason.
             */
            public Builder failReason(String failReason) {
                this.failReason = failReason;
                return this;
            }

            /**
             * PreviewPic.
             */
            public Builder previewPic(String previewPic) {
                this.previewPic = previewPic;
                return this;
            }

            /**
             * SubtitlesUrl.
             */
            public Builder subtitlesUrl(String subtitlesUrl) {
                this.subtitlesUrl = subtitlesUrl;
                return this;
            }

            /**
             * VideoDuration.
             */
            public Builder videoDuration(Integer videoDuration) {
                this.videoDuration = videoDuration;
                return this;
            }

            /**
             * VideoUrl.
             */
            public Builder videoUrl(String videoUrl) {
                this.videoUrl = videoUrl;
                return this;
            }

            /**
             * WordSubtitlesUrl.
             */
            public Builder wordSubtitlesUrl(String wordSubtitlesUrl) {
                this.wordSubtitlesUrl = wordSubtitlesUrl;
                return this;
            }

            public TaskResult build() {
                return new TaskResult(this);
            } 

        } 

    }
    public static class List extends TeaModel {
        @NameInMap("Status")
        private Integer status;

        @NameInMap("TaskResult")
        private TaskResult taskResult;

        @NameInMap("TaskUuid")
        private String taskUuid;

        @NameInMap("Title")
        private String title;

        @NameInMap("Type")
        private Integer type;

        private List(Builder builder) {
            this.status = builder.status;
            this.taskResult = builder.taskResult;
            this.taskUuid = builder.taskUuid;
            this.title = builder.title;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return taskResult
         */
        public TaskResult getTaskResult() {
            return this.taskResult;
        }

        /**
         * @return taskUuid
         */
        public String getTaskUuid() {
            return this.taskUuid;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return type
         */
        public Integer getType() {
            return this.type;
        }

        public static final class Builder {
            private Integer status; 
            private TaskResult taskResult; 
            private String taskUuid; 
            private String title; 
            private Integer type; 

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * TaskResult.
             */
            public Builder taskResult(TaskResult taskResult) {
                this.taskResult = taskResult;
                return this;
            }

            /**
             * TaskUuid.
             */
            public Builder taskUuid(String taskUuid) {
                this.taskUuid = taskUuid;
                return this;
            }

            /**
             * Title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("List")
        private java.util.List < List> list;

        @NameInMap("PageNo")
        private Integer pageNo;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("TotalCount")
        private Long totalCount;

        private Data(Builder builder) {
            this.list = builder.list;
            this.pageNo = builder.pageNo;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return list
         */
        public java.util.List < List> getList() {
            return this.list;
        }

        /**
         * @return pageNo
         */
        public Integer getPageNo() {
            return this.pageNo;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List < List> list; 
            private Integer pageNo; 
            private Integer pageSize; 
            private Long totalCount; 

            /**
             * List.
             */
            public Builder list(java.util.List < List> list) {
                this.list = list;
                return this;
            }

            /**
             * PageNo.
             */
            public Builder pageNo(Integer pageNo) {
                this.pageNo = pageNo;
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
             * TotalCount.
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
