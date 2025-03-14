// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link ListObjectScanEventResponseBody} extends {@link TeaModel}
 *
 * <p>ListObjectScanEventResponseBody</p>
 */
public class ListObjectScanEventResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
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
        private java.util.List<Data> data; 
        private PageInfo pageInfo; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListObjectScanEventResponseBody model) {
            this.data = model.data;
            this.pageInfo = model.pageInfo;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The data returned.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The pagination information.</p>
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7BC55C8F-226E-5AF5-9A2C-2EC43864****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListObjectScanEventResponseBody build() {
            return new ListObjectScanEventResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListObjectScanEventResponseBody} extends {@link TeaModel}
     *
     * <p>ListObjectScanEventResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Details model) {
                this.name = model.name;
                this.nameDisplay = model.nameDisplay;
                this.type = model.type;
                this.value = model.value;
                this.valueDisplay = model.valueDisplay;
            } 

            /**
             * <p>The name of the parameter in the file details.</p>
             * 
             * <strong>example:</strong>
             * <p>DownloadUrl</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The display name of the alert.</p>
             * 
             * <strong>example:</strong>
             * <p>DownloadUrl</p>
             */
            public Builder nameDisplay(String nameDisplay) {
                this.nameDisplay = nameDisplay;
                return this;
            }

            /**
             * <p>The value type of the parameter in the file details.</p>
             * 
             * <strong>example:</strong>
             * <p>html</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The value of the parameter.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://gcx.cn-hangzhou.aliyuncs.com/">http://gcx.cn-hangzhou.aliyuncs.com/</a>****</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            /**
             * <p>The value of the parameter.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://gcx.cn-hangzhou.aliyuncs.com/">http://gcx.cn-hangzhou.aliyuncs.com/</a>****</p>
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
    /**
     * 
     * {@link ListObjectScanEventResponseBody} extends {@link TeaModel}
     *
     * <p>ListObjectScanEventResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BucketName")
        private String bucketName;

        @com.aliyun.core.annotation.NameInMap("Details")
        private java.util.List<Details> details;

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
        public java.util.List<Details> getDetails() {
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
            private java.util.List<Details> details; 
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.bucketName = model.bucketName;
                this.details = model.details;
                this.displaySandboxResult = model.displaySandboxResult;
                this.eventId = model.eventId;
                this.eventName = model.eventName;
                this.filePath = model.filePath;
                this.firstTime = model.firstTime;
                this.hasSubEvent = model.hasSubEvent;
                this.lastTime = model.lastTime;
                this.md5 = model.md5;
                this.ossKey = model.ossKey;
                this.riskLevel = model.riskLevel;
                this.sha1 = model.sha1;
                this.sha256 = model.sha256;
                this.source = model.source;
            } 

            /**
             * <p>The name of the OSS bucket.</p>
             * 
             * <strong>example:</strong>
             * <p>hz-new01****</p>
             */
            public Builder bucketName(String bucketName) {
                this.bucketName = bucketName;
                return this;
            }

            /**
             * <p>The details of the file.</p>
             */
            public Builder details(java.util.List<Details> details) {
                this.details = details;
                return this;
            }

            /**
             * <p>Indicates whether the file can be detected by cloud sandbox. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder displaySandboxResult(String displaySandboxResult) {
                this.displaySandboxResult = displaySandboxResult;
                return this;
            }

            /**
             * <p>The ID of the alert.</p>
             * 
             * <strong>example:</strong>
             * <p>911273</p>
             */
            public Builder eventId(Long eventId) {
                this.eventId = eventId;
                return this;
            }

            /**
             * <p>The name of the alert.</p>
             * 
             * <strong>example:</strong>
             * <p>WebShell</p>
             */
            public Builder eventName(String eventName) {
                this.eventName = eventName;
                return this;
            }

            /**
             * <p>The path to the file.</p>
             * 
             * <strong>example:</strong>
             * <p>/usr/local****</p>
             */
            public Builder filePath(String filePath) {
                this.filePath = filePath;
                return this;
            }

            /**
             * <p>The timestamp at which the alert was first detected.</p>
             * 
             * <strong>example:</strong>
             * <p>1694576692000</p>
             */
            public Builder firstTime(Long firstTime) {
                this.firstTime = firstTime;
                return this;
            }

            /**
             * <p>Indicates whether an alert is generated for the file extracted from the package. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder hasSubEvent(Boolean hasSubEvent) {
                this.hasSubEvent = hasSubEvent;
                return this;
            }

            /**
             * <p>The timestamp at which the alert was last detected.</p>
             * 
             * <strong>example:</strong>
             * <p>1694576692000</p>
             */
            public Builder lastTime(Long lastTime) {
                this.lastTime = lastTime;
                return this;
            }

            /**
             * <p>The MD5 hash value of the file.</p>
             * 
             * <strong>example:</strong>
             * <p>5b394b54ca632fe51c4ab4a6dbaf****</p>
             */
            public Builder md5(String md5) {
                this.md5 = md5;
                return this;
            }

            /**
             * <p>The key of the file that is stored in the OSS bucket.</p>
             * 
             * <strong>example:</strong>
             * <p>1/2023/07/21/10/18/16899059356518bcf6c64-a04e-492d-a421-4ae8b888****</p>
             */
            public Builder ossKey(String ossKey) {
                this.ossKey = ossKey;
                return this;
            }

            /**
             * <p>The risk level of the alert. Valid values:</p>
             * <ul>
             * <li><strong>high</strong></li>
             * <li><strong>medium</strong></li>
             * <li><strong>low</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>medium</p>
             */
            public Builder riskLevel(String riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            /**
             * <p>The SHA-1 hash value of the file.</p>
             * 
             * <strong>example:</strong>
             * <p>3c01bdbb26f358bab27f267924aa2c9a03fc****</p>
             */
            public Builder sha1(String sha1) {
                this.sha1 = sha1;
                return this;
            }

            /**
             * <p>The SHA-256 hash value of the file.</p>
             * 
             * <strong>example:</strong>
             * <p>3a6fed5fc11392b3ee9f81caf017b48640d7458766a8eb0382899a605b41****</p>
             */
            public Builder sha256(String sha256) {
                this.sha256 = sha256;
                return this;
            }

            /**
             * <p>The method that is used to detect the malicious file. Valid values:</p>
             * <ul>
             * <li><strong>API</strong>: uses API operations.</li>
             * <li><strong>OSS</strong>: uses OSS file check.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>OSS</p>
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
    /**
     * 
     * {@link ListObjectScanEventResponseBody} extends {@link TeaModel}
     *
     * <p>ListObjectScanEventResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(PageInfo model) {
                this.currentPage = model.currentPage;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * <p>The number of entries per page.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>253</p>
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
