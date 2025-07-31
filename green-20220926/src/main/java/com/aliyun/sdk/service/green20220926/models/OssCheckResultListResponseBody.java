// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220926.models;

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
 * {@link OssCheckResultListResponseBody} extends {@link TeaModel}
 *
 * <p>OssCheckResultListResponseBody</p>
 */
public class OssCheckResultListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AuthStatus")
    private String authStatus;

    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private OssCheckResultListResponseBody(Builder builder) {
        this.authStatus = builder.authStatus;
        this.currentPage = builder.currentPage;
        this.items = builder.items;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OssCheckResultListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authStatus
     */
    public String getAuthStatus() {
        return this.authStatus;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return items
     */
    public java.util.List<Items> getItems() {
        return this.items;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
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
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String authStatus; 
        private Integer currentPage; 
        private java.util.List<Items> items; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(OssCheckResultListResponseBody model) {
            this.authStatus = model.authStatus;
            this.currentPage = model.currentPage;
            this.items = model.items;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * AuthStatus.
         */
        public Builder authStatus(String authStatus) {
            this.authStatus = authStatus;
            return this;
        }

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * Items.
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public OssCheckResultListResponseBody build() {
            return new OssCheckResultListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link OssCheckResultListResponseBody} extends {@link TeaModel}
     *
     * <p>OssCheckResultListResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bucket")
        private String bucket;

        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("ContentType")
        private String contentType;

        @com.aliyun.core.annotation.NameInMap("CopyFrom")
        private String copyFrom;

        @com.aliyun.core.annotation.NameInMap("ImageUrl")
        private String imageUrl;

        @com.aliyun.core.annotation.NameInMap("IsCopy")
        private Boolean isCopy;

        @com.aliyun.core.annotation.NameInMap("JobName")
        private String jobName;

        @com.aliyun.core.annotation.NameInMap("Labels")
        private java.util.List<String> labels;

        @com.aliyun.core.annotation.NameInMap("Labels2")
        private java.util.List<String> labels2;

        @com.aliyun.core.annotation.NameInMap("Md5")
        private String md5;

        @com.aliyun.core.annotation.NameInMap("Msg")
        private String msg;

        @com.aliyun.core.annotation.NameInMap("Object")
        private String object;

        @com.aliyun.core.annotation.NameInMap("ScanResult")
        private String scanResult;

        @com.aliyun.core.annotation.NameInMap("ServiceCode")
        private String serviceCode;

        @com.aliyun.core.annotation.NameInMap("ServiceName")
        private String serviceName;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private Items(Builder builder) {
            this.bucket = builder.bucket;
            this.code = builder.code;
            this.contentType = builder.contentType;
            this.copyFrom = builder.copyFrom;
            this.imageUrl = builder.imageUrl;
            this.isCopy = builder.isCopy;
            this.jobName = builder.jobName;
            this.labels = builder.labels;
            this.labels2 = builder.labels2;
            this.md5 = builder.md5;
            this.msg = builder.msg;
            this.object = builder.object;
            this.scanResult = builder.scanResult;
            this.serviceCode = builder.serviceCode;
            this.serviceName = builder.serviceName;
            this.taskId = builder.taskId;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return bucket
         */
        public String getBucket() {
            return this.bucket;
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return contentType
         */
        public String getContentType() {
            return this.contentType;
        }

        /**
         * @return copyFrom
         */
        public String getCopyFrom() {
            return this.copyFrom;
        }

        /**
         * @return imageUrl
         */
        public String getImageUrl() {
            return this.imageUrl;
        }

        /**
         * @return isCopy
         */
        public Boolean getIsCopy() {
            return this.isCopy;
        }

        /**
         * @return jobName
         */
        public String getJobName() {
            return this.jobName;
        }

        /**
         * @return labels
         */
        public java.util.List<String> getLabels() {
            return this.labels;
        }

        /**
         * @return labels2
         */
        public java.util.List<String> getLabels2() {
            return this.labels2;
        }

        /**
         * @return md5
         */
        public String getMd5() {
            return this.md5;
        }

        /**
         * @return msg
         */
        public String getMsg() {
            return this.msg;
        }

        /**
         * @return object
         */
        public String getObject() {
            return this.object;
        }

        /**
         * @return scanResult
         */
        public String getScanResult() {
            return this.scanResult;
        }

        /**
         * @return serviceCode
         */
        public String getServiceCode() {
            return this.serviceCode;
        }

        /**
         * @return serviceName
         */
        public String getServiceName() {
            return this.serviceName;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String bucket; 
            private String code; 
            private String contentType; 
            private String copyFrom; 
            private String imageUrl; 
            private Boolean isCopy; 
            private String jobName; 
            private java.util.List<String> labels; 
            private java.util.List<String> labels2; 
            private String md5; 
            private String msg; 
            private String object; 
            private String scanResult; 
            private String serviceCode; 
            private String serviceName; 
            private String taskId; 
            private String url; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.bucket = model.bucket;
                this.code = model.code;
                this.contentType = model.contentType;
                this.copyFrom = model.copyFrom;
                this.imageUrl = model.imageUrl;
                this.isCopy = model.isCopy;
                this.jobName = model.jobName;
                this.labels = model.labels;
                this.labels2 = model.labels2;
                this.md5 = model.md5;
                this.msg = model.msg;
                this.object = model.object;
                this.scanResult = model.scanResult;
                this.serviceCode = model.serviceCode;
                this.serviceName = model.serviceName;
                this.taskId = model.taskId;
                this.url = model.url;
            } 

            /**
             * Bucket.
             */
            public Builder bucket(String bucket) {
                this.bucket = bucket;
                return this;
            }

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * ContentType.
             */
            public Builder contentType(String contentType) {
                this.contentType = contentType;
                return this;
            }

            /**
             * CopyFrom.
             */
            public Builder copyFrom(String copyFrom) {
                this.copyFrom = copyFrom;
                return this;
            }

            /**
             * ImageUrl.
             */
            public Builder imageUrl(String imageUrl) {
                this.imageUrl = imageUrl;
                return this;
            }

            /**
             * IsCopy.
             */
            public Builder isCopy(Boolean isCopy) {
                this.isCopy = isCopy;
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
             * Labels.
             */
            public Builder labels(java.util.List<String> labels) {
                this.labels = labels;
                return this;
            }

            /**
             * Labels2.
             */
            public Builder labels2(java.util.List<String> labels2) {
                this.labels2 = labels2;
                return this;
            }

            /**
             * Md5.
             */
            public Builder md5(String md5) {
                this.md5 = md5;
                return this;
            }

            /**
             * Msg.
             */
            public Builder msg(String msg) {
                this.msg = msg;
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
             * ScanResult.
             */
            public Builder scanResult(String scanResult) {
                this.scanResult = scanResult;
                return this;
            }

            /**
             * ServiceCode.
             */
            public Builder serviceCode(String serviceCode) {
                this.serviceCode = serviceCode;
                return this;
            }

            /**
             * ServiceName.
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
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
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
