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
 * {@link ListOssCheckResultResponseBody} extends {@link TeaModel}
 *
 * <p>ListOssCheckResultResponseBody</p>
 */
public class ListOssCheckResultResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListOssCheckResultResponseBody(Builder builder) {
        this.currentPage = builder.currentPage;
        this.items = builder.items;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListOssCheckResultResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer currentPage; 
        private java.util.List<Items> items; 
        private Integer pageSize; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListOssCheckResultResponseBody model) {
            this.currentPage = model.currentPage;
            this.items = model.items;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>Current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>Data of the current page.</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>Page size.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>ID assigned by the backend, used to uniquely identify a request. Can be used for troubleshooting.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>13</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListOssCheckResultResponseBody build() {
            return new ListOssCheckResultResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListOssCheckResultResponseBody} extends {@link TeaModel}
     *
     * <p>ListOssCheckResultResponseBody</p>
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

        @com.aliyun.core.annotation.NameInMap("FreezeStatus")
        private String freezeStatus;

        @com.aliyun.core.annotation.NameInMap("FreezeType")
        private String freezeType;

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

        @com.aliyun.core.annotation.NameInMap("RiskLevel")
        private String riskLevel;

        @com.aliyun.core.annotation.NameInMap("RiskLevel0")
        private String riskLevel0;

        @com.aliyun.core.annotation.NameInMap("RiskLevel2")
        private String riskLevel2;

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
            this.freezeStatus = builder.freezeStatus;
            this.freezeType = builder.freezeType;
            this.imageUrl = builder.imageUrl;
            this.isCopy = builder.isCopy;
            this.jobName = builder.jobName;
            this.labels = builder.labels;
            this.labels2 = builder.labels2;
            this.md5 = builder.md5;
            this.msg = builder.msg;
            this.object = builder.object;
            this.riskLevel = builder.riskLevel;
            this.riskLevel0 = builder.riskLevel0;
            this.riskLevel2 = builder.riskLevel2;
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
         * @return freezeStatus
         */
        public String getFreezeStatus() {
            return this.freezeStatus;
        }

        /**
         * @return freezeType
         */
        public String getFreezeType() {
            return this.freezeType;
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
         * @return riskLevel
         */
        public String getRiskLevel() {
            return this.riskLevel;
        }

        /**
         * @return riskLevel0
         */
        public String getRiskLevel0() {
            return this.riskLevel0;
        }

        /**
         * @return riskLevel2
         */
        public String getRiskLevel2() {
            return this.riskLevel2;
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
            private String freezeStatus; 
            private String freezeType; 
            private String imageUrl; 
            private Boolean isCopy; 
            private String jobName; 
            private java.util.List<String> labels; 
            private java.util.List<String> labels2; 
            private String md5; 
            private String msg; 
            private String object; 
            private String riskLevel; 
            private String riskLevel0; 
            private String riskLevel2; 
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
                this.freezeStatus = model.freezeStatus;
                this.freezeType = model.freezeType;
                this.imageUrl = model.imageUrl;
                this.isCopy = model.isCopy;
                this.jobName = model.jobName;
                this.labels = model.labels;
                this.labels2 = model.labels2;
                this.md5 = model.md5;
                this.msg = model.msg;
                this.object = model.object;
                this.riskLevel = model.riskLevel;
                this.riskLevel0 = model.riskLevel0;
                this.riskLevel2 = model.riskLevel2;
                this.scanResult = model.scanResult;
                this.serviceCode = model.serviceCode;
                this.serviceName = model.serviceName;
                this.taskId = model.taskId;
                this.url = model.url;
            } 

            /**
             * <p>Storage space.</p>
             * 
             * <strong>example:</strong>
             * <p>tmp</p>
             */
            public Builder bucket(String bucket) {
                this.bucket = bucket;
                return this;
            }

            /**
             * <p>Error code, consistent with HTTP status.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>Audio and video detection type.</p>
             * 
             * <strong>example:</strong>
             * <p>audio</p>
             */
            public Builder contentType(String contentType) {
                this.contentType = contentType;
                return this;
            }

            /**
             * <p>Primary service.</p>
             * 
             * <strong>example:</strong>
             * <p>audio_media_detection</p>
             */
            public Builder copyFrom(String copyFrom) {
                this.copyFrom = copyFrom;
                return this;
            }

            /**
             * <p>Freeze status.</p>
             * 
             * <strong>example:</strong>
             * <p>FREEZED</p>
             */
            public Builder freezeStatus(String freezeStatus) {
                this.freezeStatus = freezeStatus;
                return this;
            }

            /**
             * <p>Freeze type.</p>
             * 
             * <strong>example:</strong>
             * <p>ACL</p>
             */
            public Builder freezeType(String freezeType) {
                this.freezeType = freezeType;
                return this;
            }

            /**
             * <p>Image URL address.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://www.aliyuncs.com/test.jpg">http://www.aliyuncs.com/test.jpg</a></p>
             */
            public Builder imageUrl(String imageUrl) {
                this.imageUrl = imageUrl;
                return this;
            }

            /**
             * <p>Whether to copy.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isCopy(Boolean isCopy) {
                this.isCopy = isCopy;
                return this;
            }

            /**
             * <p>Job name.</p>
             * 
             * <strong>example:</strong>
             * <p>dhT20X2310</p>
             */
            public Builder jobName(String jobName) {
                this.jobName = jobName;
                return this;
            }

            /**
             * <p>Image labels.</p>
             */
            public Builder labels(java.util.List<String> labels) {
                this.labels = labels;
                return this;
            }

            /**
             * <p>Text labels.</p>
             */
            public Builder labels2(java.util.List<String> labels2) {
                this.labels2 = labels2;
                return this;
            }

            /**
             * <p>File MD5.</p>
             * 
             * <strong>example:</strong>
             * <p>54416c9b159df4a60ae03c04ccb94cb5</p>
             */
            public Builder md5(String md5) {
                this.md5 = md5;
                return this;
            }

            /**
             * <p>Further description of the error code.</p>
             * 
             * <strong>example:</strong>
             * <p>OK</p>
             */
            public Builder msg(String msg) {
                this.msg = msg;
                return this;
            }

            /**
             * <p>Object name.</p>
             * 
             * <strong>example:</strong>
             * <p>1713014531569_958.png.jpeg</p>
             */
            public Builder object(String object) {
                this.object = object;
                return this;
            }

            /**
             * <p>Image risk level</p>
             * 
             * <strong>example:</strong>
             * <p>high</p>
             */
            public Builder riskLevel(String riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            /**
             * <p>Overall risk level</p>
             * 
             * <strong>example:</strong>
             * <p>low</p>
             */
            public Builder riskLevel0(String riskLevel0) {
                this.riskLevel0 = riskLevel0;
                return this;
            }

            /**
             * <p>Text risk level</p>
             * 
             * <strong>example:</strong>
             * <p>none</p>
             */
            public Builder riskLevel2(String riskLevel2) {
                this.riskLevel2 = riskLevel2;
                return this;
            }

            /**
             * <p>Details of the result.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder scanResult(String scanResult) {
                this.scanResult = scanResult;
                return this;
            }

            /**
             * <p>Service code.</p>
             * 
             * <strong>example:</strong>
             * <p>audio_media_detection_01</p>
             */
            public Builder serviceCode(String serviceCode) {
                this.serviceCode = serviceCode;
                return this;
            }

            /**
             * <p>Service name.</p>
             * 
             * <strong>example:</strong>
             * <p>服务名称</p>
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            /**
             * <p>Task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>EP6TI7_au_Zo25ITvCbkocNuF801QOQX</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>Task URL.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://www.aliyuncs.com/test.mp3">http://www.aliyuncs.com/test.mp3</a></p>
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
