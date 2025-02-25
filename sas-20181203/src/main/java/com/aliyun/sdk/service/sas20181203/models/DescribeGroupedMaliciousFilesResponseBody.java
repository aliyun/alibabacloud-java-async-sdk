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
 * {@link DescribeGroupedMaliciousFilesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeGroupedMaliciousFilesResponseBody</p>
 */
public class DescribeGroupedMaliciousFilesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("GroupedMaliciousFileResponse")
    private java.util.List<GroupedMaliciousFileResponse> groupedMaliciousFileResponse;

    @com.aliyun.core.annotation.NameInMap("PageInfo")
    private PageInfo pageInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeGroupedMaliciousFilesResponseBody(Builder builder) {
        this.groupedMaliciousFileResponse = builder.groupedMaliciousFileResponse;
        this.pageInfo = builder.pageInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGroupedMaliciousFilesResponseBody create() {
        return builder().build();
    }

    /**
     * @return groupedMaliciousFileResponse
     */
    public java.util.List<GroupedMaliciousFileResponse> getGroupedMaliciousFileResponse() {
        return this.groupedMaliciousFileResponse;
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
        private java.util.List<GroupedMaliciousFileResponse> groupedMaliciousFileResponse; 
        private PageInfo pageInfo; 
        private String requestId; 

        /**
         * <p>The details of the malicious image sample.</p>
         */
        public Builder groupedMaliciousFileResponse(java.util.List<GroupedMaliciousFileResponse> groupedMaliciousFileResponse) {
            this.groupedMaliciousFileResponse = groupedMaliciousFileResponse;
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
         * <p>8045E03E-6D91-4C53-9F22-5A1B84BB29D9</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeGroupedMaliciousFilesResponseBody build() {
            return new DescribeGroupedMaliciousFilesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeGroupedMaliciousFilesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGroupedMaliciousFilesResponseBody</p>
     */
    public static class GroupedMaliciousFileResponse extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FirstScanTimestamp")
        private Long firstScanTimestamp;

        @com.aliyun.core.annotation.NameInMap("ImageCount")
        private Long imageCount;

        @com.aliyun.core.annotation.NameInMap("LatestScanTimestamp")
        private Long latestScanTimestamp;

        @com.aliyun.core.annotation.NameInMap("Level")
        private String level;

        @com.aliyun.core.annotation.NameInMap("MaliciousKey")
        private String maliciousKey;

        @com.aliyun.core.annotation.NameInMap("MaliciousMd5")
        private String maliciousMd5;

        @com.aliyun.core.annotation.NameInMap("MaliciousName")
        private String maliciousName;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        private GroupedMaliciousFileResponse(Builder builder) {
            this.firstScanTimestamp = builder.firstScanTimestamp;
            this.imageCount = builder.imageCount;
            this.latestScanTimestamp = builder.latestScanTimestamp;
            this.level = builder.level;
            this.maliciousKey = builder.maliciousKey;
            this.maliciousMd5 = builder.maliciousMd5;
            this.maliciousName = builder.maliciousName;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GroupedMaliciousFileResponse create() {
            return builder().build();
        }

        /**
         * @return firstScanTimestamp
         */
        public Long getFirstScanTimestamp() {
            return this.firstScanTimestamp;
        }

        /**
         * @return imageCount
         */
        public Long getImageCount() {
            return this.imageCount;
        }

        /**
         * @return latestScanTimestamp
         */
        public Long getLatestScanTimestamp() {
            return this.latestScanTimestamp;
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        /**
         * @return maliciousKey
         */
        public String getMaliciousKey() {
            return this.maliciousKey;
        }

        /**
         * @return maliciousMd5
         */
        public String getMaliciousMd5() {
            return this.maliciousMd5;
        }

        /**
         * @return maliciousName
         */
        public String getMaliciousName() {
            return this.maliciousName;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Long firstScanTimestamp; 
            private Long imageCount; 
            private Long latestScanTimestamp; 
            private String level; 
            private String maliciousKey; 
            private String maliciousMd5; 
            private String maliciousName; 
            private Integer status; 

            /**
             * <p>The timestamp generated when the first scan was performed. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1594907349000</p>
             */
            public Builder firstScanTimestamp(Long firstScanTimestamp) {
                this.firstScanTimestamp = firstScanTimestamp;
                return this;
            }

            /**
             * <p>The number of affected images.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder imageCount(Long imageCount) {
                this.imageCount = imageCount;
                return this;
            }

            /**
             * <p>The timestamp generated when the last scan was performed. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1596533942000</p>
             */
            public Builder latestScanTimestamp(Long latestScanTimestamp) {
                this.latestScanTimestamp = latestScanTimestamp;
                return this;
            }

            /**
             * <p>The severity of the malicious image sample. Valid values:</p>
             * <ul>
             * <li><strong>serious</strong></li>
             * <li><strong>suspicious</strong></li>
             * <li><strong>remind</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>serious</p>
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * <p>The keyword of the malicious image sample.</p>
             * 
             * <strong>example:</strong>
             * <p>WEBSHELL_IMG</p>
             */
            public Builder maliciousKey(String maliciousKey) {
                this.maliciousKey = maliciousKey;
                return this;
            }

            /**
             * <p>The MD5 hash value of the malicious image sample.</p>
             * 
             * <strong>example:</strong>
             * <p>d836968041f7683b5459****</p>
             */
            public Builder maliciousMd5(String maliciousMd5) {
                this.maliciousMd5 = maliciousMd5;
                return this;
            }

            /**
             * <p>The name of the malicious image sample.</p>
             * 
             * <strong>example:</strong>
             * <p>testFile</p>
             */
            public Builder maliciousName(String maliciousName) {
                this.maliciousName = maliciousName;
                return this;
            }

            /**
             * <p>The handling status of the malicious image sample. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: unhandled</li>
             * <li><strong>1</strong>: handled</li>
             * <li><strong>2</strong>: verifying</li>
             * <li><strong>3</strong>: whitelisted</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            public GroupedMaliciousFileResponse build() {
                return new GroupedMaliciousFileResponse(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeGroupedMaliciousFilesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGroupedMaliciousFilesResponseBody</p>
     */
    public static class PageInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private PageInfo(Builder builder) {
            this.count = builder.count;
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
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * <p>The number of entries returned on the current page.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
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
             * <p>The number of entries returned per page. Default value: <strong>20</strong>.</p>
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
             * <p>2</p>
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
