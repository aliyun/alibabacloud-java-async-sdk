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
 * {@link ListMediaExportJobsResponseBody} extends {@link TeaModel}
 *
 * <p>ListMediaExportJobsResponseBody</p>
 */
public class ListMediaExportJobsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MediaExportJobList")
    private java.util.List<MediaExportJobList> mediaExportJobList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Long total;

    private ListMediaExportJobsResponseBody(Builder builder) {
        this.mediaExportJobList = builder.mediaExportJobList;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMediaExportJobsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return mediaExportJobList
     */
    public java.util.List<MediaExportJobList> getMediaExportJobList() {
        return this.mediaExportJobList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    public static final class Builder {
        private java.util.List<MediaExportJobList> mediaExportJobList; 
        private String requestId; 
        private Long total; 

        private Builder() {
        } 

        private Builder(ListMediaExportJobsResponseBody model) {
            this.mediaExportJobList = model.mediaExportJobList;
            this.requestId = model.requestId;
            this.total = model.total;
        } 

        /**
         * MediaExportJobList.
         */
        public Builder mediaExportJobList(java.util.List<MediaExportJobList> mediaExportJobList) {
            this.mediaExportJobList = mediaExportJobList;
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
         * Total.
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public ListMediaExportJobsResponseBody build() {
            return new ListMediaExportJobsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListMediaExportJobsResponseBody} extends {@link TeaModel}
     *
     * <p>ListMediaExportJobsResponseBody</p>
     */
    public static class MediaExportJobList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("FileURL")
        private String fileURL;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("JobName")
        private String jobName;

        @com.aliyun.core.annotation.NameInMap("Match")
        private String match;

        @com.aliyun.core.annotation.NameInMap("MediaType")
        private String mediaType;

        @com.aliyun.core.annotation.NameInMap("ModificationTime")
        private String modificationTime;

        @com.aliyun.core.annotation.NameInMap("SortBy")
        private String sortBy;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private MediaExportJobList(Builder builder) {
            this.appId = builder.appId;
            this.creationTime = builder.creationTime;
            this.errorCode = builder.errorCode;
            this.errorMessage = builder.errorMessage;
            this.fileURL = builder.fileURL;
            this.jobId = builder.jobId;
            this.jobName = builder.jobName;
            this.match = builder.match;
            this.mediaType = builder.mediaType;
            this.modificationTime = builder.modificationTime;
            this.sortBy = builder.sortBy;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MediaExportJobList create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return fileURL
         */
        public String getFileURL() {
            return this.fileURL;
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return jobName
         */
        public String getJobName() {
            return this.jobName;
        }

        /**
         * @return match
         */
        public String getMatch() {
            return this.match;
        }

        /**
         * @return mediaType
         */
        public String getMediaType() {
            return this.mediaType;
        }

        /**
         * @return modificationTime
         */
        public String getModificationTime() {
            return this.modificationTime;
        }

        /**
         * @return sortBy
         */
        public String getSortBy() {
            return this.sortBy;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String appId; 
            private String creationTime; 
            private String errorCode; 
            private String errorMessage; 
            private String fileURL; 
            private String jobId; 
            private String jobName; 
            private String match; 
            private String mediaType; 
            private String modificationTime; 
            private String sortBy; 
            private String status; 

            private Builder() {
            } 

            private Builder(MediaExportJobList model) {
                this.appId = model.appId;
                this.creationTime = model.creationTime;
                this.errorCode = model.errorCode;
                this.errorMessage = model.errorMessage;
                this.fileURL = model.fileURL;
                this.jobId = model.jobId;
                this.jobName = model.jobName;
                this.match = model.match;
                this.mediaType = model.mediaType;
                this.modificationTime = model.modificationTime;
                this.sortBy = model.sortBy;
                this.status = model.status;
            } 

            /**
             * AppId.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * CreationTime.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * ErrorCode.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
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
             * FileURL.
             */
            public Builder fileURL(String fileURL) {
                this.fileURL = fileURL;
                return this;
            }

            /**
             * JobId.
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * JobName.
             */
            public Builder jobName(String jobName) {
                this.jobName = jobName;
                return this;
            }

            /**
             * Match.
             */
            public Builder match(String match) {
                this.match = match;
                return this;
            }

            /**
             * MediaType.
             */
            public Builder mediaType(String mediaType) {
                this.mediaType = mediaType;
                return this;
            }

            /**
             * ModificationTime.
             */
            public Builder modificationTime(String modificationTime) {
                this.modificationTime = modificationTime;
                return this;
            }

            /**
             * SortBy.
             */
            public Builder sortBy(String sortBy) {
                this.sortBy = sortBy;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public MediaExportJobList build() {
                return new MediaExportJobList(this);
            } 

        } 

    }
}
