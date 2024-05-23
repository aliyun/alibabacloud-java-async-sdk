// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListLiveSnapshotFilesResponseBody} extends {@link TeaModel}
 *
 * <p>ListLiveSnapshotFilesResponseBody</p>
 */
public class ListLiveSnapshotFilesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FileList")
    private java.util.List < FileList> fileList;

    @com.aliyun.core.annotation.NameInMap("NextStartTime")
    private String nextStartTime;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListLiveSnapshotFilesResponseBody(Builder builder) {
        this.fileList = builder.fileList;
        this.nextStartTime = builder.nextStartTime;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListLiveSnapshotFilesResponseBody create() {
        return builder().build();
    }

    /**
     * @return fileList
     */
    public java.util.List < FileList> getFileList() {
        return this.fileList;
    }

    /**
     * @return nextStartTime
     */
    public String getNextStartTime() {
        return this.nextStartTime;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < FileList> fileList; 
        private String nextStartTime; 
        private String requestId; 

        /**
         * FileList.
         */
        public Builder fileList(java.util.List < FileList> fileList) {
            this.fileList = fileList;
            return this;
        }

        /**
         * NextStartTime.
         */
        public Builder nextStartTime(String nextStartTime) {
            this.nextStartTime = nextStartTime;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListLiveSnapshotFilesResponseBody build() {
            return new ListLiveSnapshotFilesResponseBody(this);
        } 

    } 

    public static class FileList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("CreateTimestamp")
        private Long createTimestamp;

        @com.aliyun.core.annotation.NameInMap("IsOverlay")
        private Boolean isOverlay;

        @com.aliyun.core.annotation.NameInMap("OssBucket")
        private String ossBucket;

        @com.aliyun.core.annotation.NameInMap("OssEndpoint")
        private String ossEndpoint;

        @com.aliyun.core.annotation.NameInMap("OssObject")
        private String ossObject;

        private FileList(Builder builder) {
            this.createTime = builder.createTime;
            this.createTimestamp = builder.createTimestamp;
            this.isOverlay = builder.isOverlay;
            this.ossBucket = builder.ossBucket;
            this.ossEndpoint = builder.ossEndpoint;
            this.ossObject = builder.ossObject;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FileList create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return createTimestamp
         */
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        /**
         * @return isOverlay
         */
        public Boolean getIsOverlay() {
            return this.isOverlay;
        }

        /**
         * @return ossBucket
         */
        public String getOssBucket() {
            return this.ossBucket;
        }

        /**
         * @return ossEndpoint
         */
        public String getOssEndpoint() {
            return this.ossEndpoint;
        }

        /**
         * @return ossObject
         */
        public String getOssObject() {
            return this.ossObject;
        }

        public static final class Builder {
            private String createTime; 
            private Long createTimestamp; 
            private Boolean isOverlay; 
            private String ossBucket; 
            private String ossEndpoint; 
            private String ossObject; 

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * CreateTimestamp.
             */
            public Builder createTimestamp(Long createTimestamp) {
                this.createTimestamp = createTimestamp;
                return this;
            }

            /**
             * IsOverlay.
             */
            public Builder isOverlay(Boolean isOverlay) {
                this.isOverlay = isOverlay;
                return this;
            }

            /**
             * OSS bucket。
             */
            public Builder ossBucket(String ossBucket) {
                this.ossBucket = ossBucket;
                return this;
            }

            /**
             * OssEndpoint.
             */
            public Builder ossEndpoint(String ossEndpoint) {
                this.ossEndpoint = ossEndpoint;
                return this;
            }

            /**
             * OssObject.
             */
            public Builder ossObject(String ossObject) {
                this.ossObject = ossObject;
                return this;
            }

            public FileList build() {
                return new FileList(this);
            } 

        } 

    }
}
