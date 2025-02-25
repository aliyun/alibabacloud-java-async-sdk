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
 * {@link DescribeImageListBySensitiveFileResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeImageListBySensitiveFileResponseBody</p>
 */
public class DescribeImageListBySensitiveFileResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("ImageInfos")
    private java.util.List<ImageInfos> imageInfos;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageInfo")
    private PageInfo pageInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeImageListBySensitiveFileResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.imageInfos = builder.imageInfos;
        this.message = builder.message;
        this.pageInfo = builder.pageInfo;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeImageListBySensitiveFileResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return imageInfos
     */
    public java.util.List<ImageInfos> getImageInfos() {
        return this.imageInfos;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Integer httpStatusCode; 
        private java.util.List<ImageInfos> imageInfos; 
        private String message; 
        private PageInfo pageInfo; 
        private String requestId; 
        private Boolean success; 

        /**
         * <p>The status code returned. The status code <strong>200</strong> indicates that the request was successful. Other status codes indicate that the request failed. You can identify the cause of the failure based on the status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The information about the images.</p>
         */
        public Builder imageInfos(java.util.List<ImageInfos> imageInfos) {
            this.imageInfos = imageInfos;
            return this;
        }

        /**
         * <p>The error message returned.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
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
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>E0C5C07F-1576-509A-AE44-1C36B8445B37</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The request was successful.</li>
         * <li><strong>false</strong>: The request failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeImageListBySensitiveFileResponseBody build() {
            return new DescribeImageListBySensitiveFileResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeImageListBySensitiveFileResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeImageListBySensitiveFileResponseBody</p>
     */
    public static class ImageInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Digest")
        private String digest;

        @com.aliyun.core.annotation.NameInMap("FirstScanTime")
        private Long firstScanTime;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("LastScanTime")
        private Long lastScanTime;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("RepoName")
        private String repoName;

        @com.aliyun.core.annotation.NameInMap("RepoNamespace")
        private String repoNamespace;

        @com.aliyun.core.annotation.NameInMap("RiskLevel")
        private String riskLevel;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Tag")
        private String tag;

        @com.aliyun.core.annotation.NameInMap("Uuid")
        private String uuid;

        private ImageInfos(Builder builder) {
            this.digest = builder.digest;
            this.firstScanTime = builder.firstScanTime;
            this.instanceId = builder.instanceId;
            this.lastScanTime = builder.lastScanTime;
            this.regionId = builder.regionId;
            this.repoName = builder.repoName;
            this.repoNamespace = builder.repoNamespace;
            this.riskLevel = builder.riskLevel;
            this.status = builder.status;
            this.tag = builder.tag;
            this.uuid = builder.uuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImageInfos create() {
            return builder().build();
        }

        /**
         * @return digest
         */
        public String getDigest() {
            return this.digest;
        }

        /**
         * @return firstScanTime
         */
        public Long getFirstScanTime() {
            return this.firstScanTime;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return lastScanTime
         */
        public Long getLastScanTime() {
            return this.lastScanTime;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return repoName
         */
        public String getRepoName() {
            return this.repoName;
        }

        /**
         * @return repoNamespace
         */
        public String getRepoNamespace() {
            return this.repoNamespace;
        }

        /**
         * @return riskLevel
         */
        public String getRiskLevel() {
            return this.riskLevel;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tag
         */
        public String getTag() {
            return this.tag;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        public static final class Builder {
            private String digest; 
            private Long firstScanTime; 
            private String instanceId; 
            private Long lastScanTime; 
            private String regionId; 
            private String repoName; 
            private String repoNamespace; 
            private String riskLevel; 
            private String status; 
            private String tag; 
            private String uuid; 

            /**
             * <p>The image digest.</p>
             * 
             * <strong>example:</strong>
             * <p>v005</p>
             */
            public Builder digest(String digest) {
                this.digest = digest;
                return this;
            }

            /**
             * <p>The timestamp generated when the first scan was performed. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1649814050000</p>
             */
            public Builder firstScanTime(Long firstScanTime) {
                this.firstScanTime = firstScanTime;
                return this;
            }

            /**
             * <p>The image instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cri-a595qp31knh9****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The timestamp when the last scan was performed. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1649814050000</p>
             */
            public Builder lastScanTime(Long lastScanTime) {
                this.lastScanTime = lastScanTime;
                return this;
            }

            /**
             * <p>The ID of the region in which the image instance resides.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The image repository name.</p>
             * 
             * <strong>example:</strong>
             * <p>opa-test</p>
             */
            public Builder repoName(String repoName) {
                this.repoName = repoName;
                return this;
            }

            /**
             * <p>The namespace to which the image repository belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>libssh2</p>
             */
            public Builder repoNamespace(String repoNamespace) {
                this.repoNamespace = repoNamespace;
                return this;
            }

            /**
             * <p>The risk level. Valid values:</p>
             * <ul>
             * <li><strong>high</strong></li>
             * <li><strong>medium</strong></li>
             * <li><strong>low</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>low</p>
             */
            public Builder riskLevel(String riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            /**
             * <p>The sensitive file status. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: unhandled</li>
             * <li><strong>1</strong>: ignored</li>
             * <li><strong>2</strong>: false positive</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The tag that is added to the image.</p>
             * 
             * <strong>example:</strong>
             * <p>nuxeo6</p>
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            /**
             * <p>The image UUID.</p>
             * 
             * <strong>example:</strong>
             * <p>f58681174f944623345379e23b7b****</p>
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            public ImageInfos build() {
                return new ImageInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeImageListBySensitiveFileResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeImageListBySensitiveFileResponseBody</p>
     */
    public static class PageInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("LastRowKey")
        private String lastRowKey;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private PageInfo(Builder builder) {
            this.count = builder.count;
            this.currentPage = builder.currentPage;
            this.lastRowKey = builder.lastRowKey;
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
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return currentPage
         */
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        /**
         * @return lastRowKey
         */
        public String getLastRowKey() {
            return this.lastRowKey;
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
            private Integer count; 
            private Integer currentPage; 
            private String lastRowKey; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * <p>The number of entries returned on the current page.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The page number of the returned page.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * <p>The key of the last data entry.</p>
             * 
             * <strong>example:</strong>
             * <p>CAESGgoSChAKDGNvbXBsZXRlVGltZRABCgQiAggAGAAiQAoJAGYXFWIAAAAACjMDLgAAADFTNzMyZDMwMzAzMDM1Mzc3Njc4MzA2ODY5NmI2YTY1Nzg2NTcxNjE2NDc4NjE=</p>
             */
            public Builder lastRowKey(String lastRowKey) {
                this.lastRowKey = lastRowKey;
                return this;
            }

            /**
             * <p>The number of entries returned per page. Default value: 20.</p>
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
             * <p>83</p>
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
