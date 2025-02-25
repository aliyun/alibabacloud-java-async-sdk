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
 * {@link DescribeImageListByBuildRiskResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeImageListByBuildRiskResponseBody</p>
 */
public class DescribeImageListByBuildRiskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeImageListByBuildRiskResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeImageListByBuildRiskResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * <p>The response code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>52870893-48A7-5A9E-9E05-6253E5B6****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeImageListByBuildRiskResponseBody build() {
            return new DescribeImageListByBuildRiskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeImageListByBuildRiskResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeImageListByBuildRiskResponseBody</p>
     */
    public static class List extends TeaModel {
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
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("Tag")
        private String tag;

        @com.aliyun.core.annotation.NameInMap("Uuid")
        private String uuid;

        private List(Builder builder) {
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

        public static List create() {
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
        public Integer getStatus() {
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
            private Integer status; 
            private String tag; 
            private String uuid; 

            /**
             * <p>The digest value of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>a5ccdd9b166b67e02954aa9b618fe19b7968bd56a15463d2ad7f2643ba5b****</p>
             */
            public Builder digest(String digest) {
                this.digest = digest;
                return this;
            }

            /**
             * <p>The timestamp generated when the first scan was performed. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1723710827000</p>
             */
            public Builder firstScanTime(Long firstScanTime) {
                this.firstScanTime = firstScanTime;
                return this;
            }

            /**
             * <p>The instance ID of the image repository.</p>
             * 
             * <strong>example:</strong>
             * <p>39010****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The timestamp generated when the last scan was performed. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1723710827999</p>
             */
            public Builder lastScanTime(Long lastScanTime) {
                this.lastScanTime = lastScanTime;
                return this;
            }

            /**
             * <p>The ID of the region.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The name of the image repository.</p>
             * 
             * <strong>example:</strong>
             * <p>test-tepo</p>
             */
            public Builder repoName(String repoName) {
                this.repoName = repoName;
                return this;
            }

            /**
             * <p>The namespace to which the image repository belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>namespace</p>
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
             * <p>medium</p>
             */
            public Builder riskLevel(String riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            /**
             * <p>The status of the alert event. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: unhandled.</li>
             * <li><strong>1</strong>: ignored.</li>
             * <li><strong>2</strong>: false positive.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The tag of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>v1</p>
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            /**
             * <p>The UUID of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>6ec898e6274f942e0e4a053eff1c****</p>
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeImageListByBuildRiskResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeImageListByBuildRiskResponseBody</p>
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

            /**
             * <p>The page number. Default value: <strong>1</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * <p>The number of entries per page. Default value: 20. If you leave this parameter empty, 20 entries are returned on each page.</p>
             * <blockquote>
             * <p> We recommend that you do not leave this parameter empty.</p>
             * </blockquote>
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
             * <p>109</p>
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
    /**
     * 
     * {@link DescribeImageListByBuildRiskResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeImageListByBuildRiskResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("List")
        private java.util.List<List> list;

        @com.aliyun.core.annotation.NameInMap("PageInfo")
        private PageInfo pageInfo;

        private Data(Builder builder) {
            this.list = builder.list;
            this.pageInfo = builder.pageInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return list
         */
        public java.util.List<List> getList() {
            return this.list;
        }

        /**
         * @return pageInfo
         */
        public PageInfo getPageInfo() {
            return this.pageInfo;
        }

        public static final class Builder {
            private java.util.List<List> list; 
            private PageInfo pageInfo; 

            /**
             * <p>The images.</p>
             */
            public Builder list(java.util.List<List> list) {
                this.list = list;
                return this;
            }

            /**
             * <p>The pagination information.</p>
             */
            public Builder pageInfo(PageInfo pageInfo) {
                this.pageInfo = pageInfo;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
