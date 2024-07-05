// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFilePushStatusesResponseBody} extends {@link TeaModel}
 *
 * <p>ListFilePushStatusesResponseBody</p>
 */
public class ListFilePushStatusesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("PushStatuses")
    private java.util.List < PushStatuses> pushStatuses;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListFilePushStatusesResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.pushStatuses = builder.pushStatuses;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFilePushStatusesResponseBody create() {
        return builder().build();
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return pushStatuses
     */
    public java.util.List < PushStatuses> getPushStatuses() {
        return this.pushStatuses;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Long pageNumber; 
        private Long pageSize; 
        private java.util.List < PushStatuses> pushStatuses; 
        private String requestId; 
        private Long totalCount; 

        /**
         * PageNumber.
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * PushStatuses.
         */
        public Builder pushStatuses(java.util.List < PushStatuses> pushStatuses) {
            this.pushStatuses = pushStatuses;
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
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListFilePushStatusesResponseBody build() {
            return new ListFilePushStatusesResponseBody(this);
        } 

    } 

    public static class PushStatuses extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FileId")
        private String fileId;

        @com.aliyun.core.annotation.NameInMap("FileName")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("PushTime")
        private String pushTime;

        @com.aliyun.core.annotation.NameInMap("RenderingInstanceId")
        private String renderingInstanceId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StatusDescription")
        private String statusDescription;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        private PushStatuses(Builder builder) {
            this.fileId = builder.fileId;
            this.fileName = builder.fileName;
            this.pushTime = builder.pushTime;
            this.renderingInstanceId = builder.renderingInstanceId;
            this.status = builder.status;
            this.statusDescription = builder.statusDescription;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PushStatuses create() {
            return builder().build();
        }

        /**
         * @return fileId
         */
        public String getFileId() {
            return this.fileId;
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return pushTime
         */
        public String getPushTime() {
            return this.pushTime;
        }

        /**
         * @return renderingInstanceId
         */
        public String getRenderingInstanceId() {
            return this.renderingInstanceId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return statusDescription
         */
        public String getStatusDescription() {
            return this.statusDescription;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String fileId; 
            private String fileName; 
            private String pushTime; 
            private String renderingInstanceId; 
            private String status; 
            private String statusDescription; 
            private String updateTime; 

            /**
             * FileId.
             */
            public Builder fileId(String fileId) {
                this.fileId = fileId;
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
             * PushTime.
             */
            public Builder pushTime(String pushTime) {
                this.pushTime = pushTime;
                return this;
            }

            /**
             * RenderingInstanceId.
             */
            public Builder renderingInstanceId(String renderingInstanceId) {
                this.renderingInstanceId = renderingInstanceId;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * StatusDescription.
             */
            public Builder statusDescription(String statusDescription) {
                this.statusDescription = statusDescription;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public PushStatuses build() {
                return new PushStatuses(this);
            } 

        } 

    }
}
