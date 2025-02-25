// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryRecordResponseBody} extends {@link TeaModel}
 *
 * <p>QueryRecordResponseBody</p>
 */
public class QueryRecordResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private QueryRecordResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryRecordResponseBody create() {
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
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
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
        private String errorMessage; 
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
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryRecordResponseBody build() {
            return new QueryRecordResponseBody(this);
        } 

    } 

    public static class List extends TeaModel {
        @NameInMap("BeginTime")
        private String beginTime;

        @NameInMap("EndTime")
        private String endTime;

        @NameInMap("EventType")
        private Integer eventType;

        @NameInMap("FileName")
        private String fileName;

        @NameInMap("FileSize")
        private Integer fileSize;

        @NameInMap("RecordType")
        private Integer recordType;

        @NameInMap("SnapshotUrl")
        private String snapshotUrl;

        @NameInMap("StreamType")
        private Integer streamType;

        @NameInMap("VideoFrameNumber")
        private Integer videoFrameNumber;

        private List(Builder builder) {
            this.beginTime = builder.beginTime;
            this.endTime = builder.endTime;
            this.eventType = builder.eventType;
            this.fileName = builder.fileName;
            this.fileSize = builder.fileSize;
            this.recordType = builder.recordType;
            this.snapshotUrl = builder.snapshotUrl;
            this.streamType = builder.streamType;
            this.videoFrameNumber = builder.videoFrameNumber;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return beginTime
         */
        public String getBeginTime() {
            return this.beginTime;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return eventType
         */
        public Integer getEventType() {
            return this.eventType;
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return fileSize
         */
        public Integer getFileSize() {
            return this.fileSize;
        }

        /**
         * @return recordType
         */
        public Integer getRecordType() {
            return this.recordType;
        }

        /**
         * @return snapshotUrl
         */
        public String getSnapshotUrl() {
            return this.snapshotUrl;
        }

        /**
         * @return streamType
         */
        public Integer getStreamType() {
            return this.streamType;
        }

        /**
         * @return videoFrameNumber
         */
        public Integer getVideoFrameNumber() {
            return this.videoFrameNumber;
        }

        public static final class Builder {
            private String beginTime; 
            private String endTime; 
            private Integer eventType; 
            private String fileName; 
            private Integer fileSize; 
            private Integer recordType; 
            private String snapshotUrl; 
            private Integer streamType; 
            private Integer videoFrameNumber; 

            /**
             * BeginTime.
             */
            public Builder beginTime(String beginTime) {
                this.beginTime = beginTime;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * EventType.
             */
            public Builder eventType(Integer eventType) {
                this.eventType = eventType;
                return this;
            }

            /**
             * FileName.
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * FileSize.
             */
            public Builder fileSize(Integer fileSize) {
                this.fileSize = fileSize;
                return this;
            }

            /**
             * RecordType.
             */
            public Builder recordType(Integer recordType) {
                this.recordType = recordType;
                return this;
            }

            /**
             * SnapshotUrl.
             */
            public Builder snapshotUrl(String snapshotUrl) {
                this.snapshotUrl = snapshotUrl;
                return this;
            }

            /**
             * StreamType.
             */
            public Builder streamType(Integer streamType) {
                this.streamType = streamType;
                return this;
            }

            /**
             * VideoFrameNumber.
             */
            public Builder videoFrameNumber(Integer videoFrameNumber) {
                this.videoFrameNumber = videoFrameNumber;
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

        @NameInMap("Page")
        private Integer page;

        @NameInMap("PageSize")
        private Integer pageSize;

        private Data(Builder builder) {
            this.list = builder.list;
            this.page = builder.page;
            this.pageSize = builder.pageSize;
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
         * @return page
         */
        public Integer getPage() {
            return this.page;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        public static final class Builder {
            private java.util.List < List> list; 
            private Integer page; 
            private Integer pageSize; 

            /**
             * List.
             */
            public Builder list(java.util.List < List> list) {
                this.list = list;
                return this;
            }

            /**
             * Page.
             */
            public Builder page(Integer page) {
                this.page = page;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
