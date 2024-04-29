// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListObjectScanEventResponseBody} extends {@link TeaModel}
 *
 * <p>ListObjectScanEventResponseBody</p>
 */
public class ListObjectScanEventResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List < Data> data;

    @com.aliyun.core.annotation.NameInMap("PageInfo")
    private PageInfo pageInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListObjectScanEventResponseBody(Builder builder) {
        this.data = builder.data;
        this.pageInfo = builder.pageInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListObjectScanEventResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Data> data; 
        private PageInfo pageInfo; 
        private String requestId; 

        /**
         * The data returned.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * The pagination information.
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListObjectScanEventResponseBody build() {
            return new ListObjectScanEventResponseBody(this);
        } 

    } 

    public static class Details extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NameDisplay")
        private String nameDisplay;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        @com.aliyun.core.annotation.NameInMap("ValueDisplay")
        private String valueDisplay;

        private Details(Builder builder) {
            this.name = builder.name;
            this.nameDisplay = builder.nameDisplay;
            this.type = builder.type;
            this.value = builder.value;
            this.valueDisplay = builder.valueDisplay;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Details create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return nameDisplay
         */
        public String getNameDisplay() {
            return this.nameDisplay;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        /**
         * @return valueDisplay
         */
        public String getValueDisplay() {
            return this.valueDisplay;
        }

        public static final class Builder {
            private String name; 
            private String nameDisplay; 
            private String type; 
            private String value; 
            private String valueDisplay; 

            /**
             * The name of the parameter in the file details.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The display name of the alert.
             */
            public Builder nameDisplay(String nameDisplay) {
                this.nameDisplay = nameDisplay;
                return this;
            }

            /**
             * The value type of the parameter in the file details.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The value of the parameter.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            /**
             * The value of the parameter.
             */
            public Builder valueDisplay(String valueDisplay) {
                this.valueDisplay = valueDisplay;
                return this;
            }

            public Details build() {
                return new Details(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BucketName")
        private String bucketName;

        @com.aliyun.core.annotation.NameInMap("Details")
        private java.util.List < Details> details;

        @com.aliyun.core.annotation.NameInMap("DisplaySandboxResult")
        private String displaySandboxResult;

        @com.aliyun.core.annotation.NameInMap("EventId")
        private Long eventId;

        @com.aliyun.core.annotation.NameInMap("EventName")
        private String eventName;

        @com.aliyun.core.annotation.NameInMap("FilePath")
        private String filePath;

        @com.aliyun.core.annotation.NameInMap("FirstTime")
        private Long firstTime;

        @com.aliyun.core.annotation.NameInMap("HasSubEvent")
        private Boolean hasSubEvent;

        @com.aliyun.core.annotation.NameInMap("LastTime")
        private Long lastTime;

        @com.aliyun.core.annotation.NameInMap("Md5")
        private String md5;

        @com.aliyun.core.annotation.NameInMap("OssKey")
        private String ossKey;

        @com.aliyun.core.annotation.NameInMap("RiskLevel")
        private String riskLevel;

        @com.aliyun.core.annotation.NameInMap("Sha1")
        private String sha1;

        @com.aliyun.core.annotation.NameInMap("Sha256")
        private String sha256;

        @com.aliyun.core.annotation.NameInMap("Source")
        private String source;

        private Data(Builder builder) {
            this.bucketName = builder.bucketName;
            this.details = builder.details;
            this.displaySandboxResult = builder.displaySandboxResult;
            this.eventId = builder.eventId;
            this.eventName = builder.eventName;
            this.filePath = builder.filePath;
            this.firstTime = builder.firstTime;
            this.hasSubEvent = builder.hasSubEvent;
            this.lastTime = builder.lastTime;
            this.md5 = builder.md5;
            this.ossKey = builder.ossKey;
            this.riskLevel = builder.riskLevel;
            this.sha1 = builder.sha1;
            this.sha256 = builder.sha256;
            this.source = builder.source;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return bucketName
         */
        public String getBucketName() {
            return this.bucketName;
        }

        /**
         * @return details
         */
        public java.util.List < Details> getDetails() {
            return this.details;
        }

        /**
         * @return displaySandboxResult
         */
        public String getDisplaySandboxResult() {
            return this.displaySandboxResult;
        }

        /**
         * @return eventId
         */
        public Long getEventId() {
            return this.eventId;
        }

        /**
         * @return eventName
         */
        public String getEventName() {
            return this.eventName;
        }

        /**
         * @return filePath
         */
        public String getFilePath() {
            return this.filePath;
        }

        /**
         * @return firstTime
         */
        public Long getFirstTime() {
            return this.firstTime;
        }

        /**
         * @return hasSubEvent
         */
        public Boolean getHasSubEvent() {
            return this.hasSubEvent;
        }

        /**
         * @return lastTime
         */
        public Long getLastTime() {
            return this.lastTime;
        }

        /**
         * @return md5
         */
        public String getMd5() {
            return this.md5;
        }

        /**
         * @return ossKey
         */
        public String getOssKey() {
            return this.ossKey;
        }

        /**
         * @return riskLevel
         */
        public String getRiskLevel() {
            return this.riskLevel;
        }

        /**
         * @return sha1
         */
        public String getSha1() {
            return this.sha1;
        }

        /**
         * @return sha256
         */
        public String getSha256() {
            return this.sha256;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        public static final class Builder {
            private String bucketName; 
            private java.util.List < Details> details; 
            private String displaySandboxResult; 
            private Long eventId; 
            private String eventName; 
            private String filePath; 
            private Long firstTime; 
            private Boolean hasSubEvent; 
            private Long lastTime; 
            private String md5; 
            private String ossKey; 
            private String riskLevel; 
            private String sha1; 
            private String sha256; 
            private String source; 

            /**
             * The name of the OSS bucket.
             */
            public Builder bucketName(String bucketName) {
                this.bucketName = bucketName;
                return this;
            }

            /**
             * The details of the file.
             */
            public Builder details(java.util.List < Details> details) {
                this.details = details;
                return this;
            }

            /**
             * Indicates whether the file can be detected by cloud sandbox. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder displaySandboxResult(String displaySandboxResult) {
                this.displaySandboxResult = displaySandboxResult;
                return this;
            }

            /**
             * The ID of the alert.
             */
            public Builder eventId(Long eventId) {
                this.eventId = eventId;
                return this;
            }

            /**
             * The name of the alert.
             */
            public Builder eventName(String eventName) {
                this.eventName = eventName;
                return this;
            }

            /**
             * The path to the file.
             */
            public Builder filePath(String filePath) {
                this.filePath = filePath;
                return this;
            }

            /**
             * The timestamp at which the alert was first detected.
             */
            public Builder firstTime(Long firstTime) {
                this.firstTime = firstTime;
                return this;
            }

            /**
             * HasSubEvent.
             */
            public Builder hasSubEvent(Boolean hasSubEvent) {
                this.hasSubEvent = hasSubEvent;
                return this;
            }

            /**
             * The timestamp at which the alert was last detected.
             */
            public Builder lastTime(Long lastTime) {
                this.lastTime = lastTime;
                return this;
            }

            /**
             * The MD5 hash value of the file.
             */
            public Builder md5(String md5) {
                this.md5 = md5;
                return this;
            }

            /**
             * The key of the file that is stored in the OSS bucket.
             */
            public Builder ossKey(String ossKey) {
                this.ossKey = ossKey;
                return this;
            }

            /**
             * The risk level of the alert. Valid values:
             * <p>
             * 
             * *   **high**
             * *   **medium**
             * *   **low**
             */
            public Builder riskLevel(String riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            /**
             * The SHA-1 hash value of the file.
             */
            public Builder sha1(String sha1) {
                this.sha1 = sha1;
                return this;
            }

            /**
             * The SHA-256 hash value of the file.
             */
            public Builder sha256(String sha256) {
                this.sha256 = sha256;
                return this;
            }

            /**
             * The method that is used to detect the malicious file. Valid values:
             * <p>
             * 
             * *   **API**: uses API operations.
             * *   **OSS**: uses OSS file check.
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
    public static class PageInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private PageInfo(Builder builder) {
            this.currentPage = builder.currentPage;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageInfo create() {
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
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Integer currentPage; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * The page number.
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * The number of entries per page.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * The total number of entries returned.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PageInfo build() {
                return new PageInfo(this);
            } 

        } 

    }
}
