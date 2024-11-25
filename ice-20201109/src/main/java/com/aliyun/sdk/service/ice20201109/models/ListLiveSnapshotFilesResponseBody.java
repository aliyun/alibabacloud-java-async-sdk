// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The list of files.</p>
         */
        public Builder fileList(java.util.List < FileList> fileList) {
            this.fileList = fileList;
            return this;
        }

        /**
         * <p>The start time of the next page. If no value is returned, the pagination ends.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-02-02T22:22:22Z</p>
         */
        public Builder nextStartTime(String nextStartTime) {
            this.nextStartTime = nextStartTime;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong><strong>11-DB8D-4A9A-875B-275798</strong></strong></strong></p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListLiveSnapshotFilesResponseBody build() {
            return new ListLiveSnapshotFilesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListLiveSnapshotFilesResponseBody} extends {@link TeaModel}
     *
     * <p>ListLiveSnapshotFilesResponseBody</p>
     */
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
             * <p>The time when the template was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-02-02T22:22:22Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The creation timestamp that is used as an input parameter for a delete API operation.</p>
             * 
             * <strong>example:</strong>
             * <p>1619503516000</p>
             */
            public Builder createTimestamp(Long createTimestamp) {
                this.createTimestamp = createTimestamp;
                return this;
            }

            /**
             * <p>Specifies whether to overlay snapshots.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isOverlay(Boolean isOverlay) {
                this.isOverlay = isOverlay;
                return this;
            }

            /**
             * <p>The OSS bucket.</p>
             * 
             * <strong>example:</strong>
             * <p>testbucket</p>
             */
            public Builder ossBucket(String ossBucket) {
                this.ossBucket = ossBucket;
                return this;
            }

            /**
             * <p>The Object Storage Service (OSS) domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>oss-cn-shanghai.aliyuncs.com</p>
             */
            public Builder ossEndpoint(String ossEndpoint) {
                this.ossEndpoint = ossEndpoint;
                return this;
            }

            /**
             * <p>The location in which the OSS object is stored.</p>
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
