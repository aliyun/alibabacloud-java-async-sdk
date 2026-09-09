// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

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
    private java.util.List<PushStatuses> pushStatuses;

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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<PushStatuses> getPushStatuses() {
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
        private java.util.List<PushStatuses> pushStatuses; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListFilePushStatusesResponseBody model) {
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.pushStatuses = model.pushStatuses;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The page number of the returned results.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page in a paged query.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The list of file push status records.</p>
         */
        public Builder pushStatuses(java.util.List<PushStatuses> pushStatuses) {
            this.pushStatuses = pushStatuses;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>BEA5625F-8FCF-48F4-851B-CA63946DA664</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of matching file push records.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListFilePushStatusesResponseBody build() {
            return new ListFilePushStatusesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListFilePushStatusesResponseBody} extends {@link TeaModel}
     *
     * <p>ListFilePushStatusesResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(PushStatuses model) {
                this.fileId = model.fileId;
                this.fileName = model.fileName;
                this.pushTime = model.pushTime;
                this.renderingInstanceId = model.renderingInstanceId;
                this.status = model.status;
                this.statusDescription = model.statusDescription;
                this.updateTime = model.updateTime;
            } 

            /**
             * <p>The file ID.</p>
             * 
             * <strong>example:</strong>
             * <p>f-1671accd4dafdag3er256cvgewt13f7141db2f7</p>
             */
            public Builder fileId(String fileId) {
                this.fileId = fileId;
                return this;
            }

            /**
             * <p>The file name.</p>
             * 
             * <strong>example:</strong>
             * <p>myfile</p>
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * <p>The scheduled push start time.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-03-26T16:32:20+08:00</p>
             */
            public Builder pushTime(String pushTime) {
                this.pushTime = pushTime;
                return this;
            }

            /**
             * <p>The cloud application service instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>render-9f8c57355d224ad7beaf95e145f22111</p>
             */
            public Builder renderingInstanceId(String renderingInstanceId) {
                this.renderingInstanceId = renderingInstanceId;
                return this;
            }

            /**
             * <p>The file push status. Valid values:</p>
             * <ol>
             * <li><p>Created</p>
             * </li>
             * <li><p>Doing</p>
             * </li>
             * <li><p>Success: desired state</p>
             * </li>
             * <li><p>Failed: desired state</p>
             * </li>
             * </ol>
             * 
             * <strong>example:</strong>
             * <p>Success</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The status description.</p>
             * 
             * <strong>example:</strong>
             * <p>push success</p>
             */
            public Builder statusDescription(String statusDescription) {
                this.statusDescription = statusDescription;
                return this;
            }

            /**
             * <p>The latest update time of the status.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-03-26T17:02:10+08:00</p>
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
