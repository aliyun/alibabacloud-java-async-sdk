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
 * {@link DescribeImageBuildRiskListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeImageBuildRiskListResponseBody</p>
 */
public class DescribeImageBuildRiskListResponseBody extends TeaModel {
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

    private DescribeImageBuildRiskListResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeImageBuildRiskListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeImageBuildRiskListResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The response code. The status code <strong>200</strong> indicates that the request was successful. Other status codes indicate that the request failed. You can identify the cause of the failure based on the status code.</p>
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
         * <p>BE120DAB-F4E7-4C53-ADC3-A97578AB****</p>
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

        public DescribeImageBuildRiskListResponseBody build() {
            return new DescribeImageBuildRiskListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeImageBuildRiskListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeImageBuildRiskListResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("FirstScanTime")
        private Long firstScanTime;

        @com.aliyun.core.annotation.NameInMap("LastScanTime")
        private Long lastScanTime;

        @com.aliyun.core.annotation.NameInMap("RiskClass")
        private String riskClass;

        @com.aliyun.core.annotation.NameInMap("RiskClassName")
        private String riskClassName;

        @com.aliyun.core.annotation.NameInMap("RiskKey")
        private String riskKey;

        @com.aliyun.core.annotation.NameInMap("RiskKeyName")
        private String riskKeyName;

        @com.aliyun.core.annotation.NameInMap("RiskLevel")
        private String riskLevel;

        @com.aliyun.core.annotation.NameInMap("UnprocessedNum")
        private Integer unprocessedNum;

        private List(Builder builder) {
            this.count = builder.count;
            this.firstScanTime = builder.firstScanTime;
            this.lastScanTime = builder.lastScanTime;
            this.riskClass = builder.riskClass;
            this.riskClassName = builder.riskClassName;
            this.riskKey = builder.riskKey;
            this.riskKeyName = builder.riskKeyName;
            this.riskLevel = builder.riskLevel;
            this.unprocessedNum = builder.unprocessedNum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return firstScanTime
         */
        public Long getFirstScanTime() {
            return this.firstScanTime;
        }

        /**
         * @return lastScanTime
         */
        public Long getLastScanTime() {
            return this.lastScanTime;
        }

        /**
         * @return riskClass
         */
        public String getRiskClass() {
            return this.riskClass;
        }

        /**
         * @return riskClassName
         */
        public String getRiskClassName() {
            return this.riskClassName;
        }

        /**
         * @return riskKey
         */
        public String getRiskKey() {
            return this.riskKey;
        }

        /**
         * @return riskKeyName
         */
        public String getRiskKeyName() {
            return this.riskKeyName;
        }

        /**
         * @return riskLevel
         */
        public String getRiskLevel() {
            return this.riskLevel;
        }

        /**
         * @return unprocessedNum
         */
        public Integer getUnprocessedNum() {
            return this.unprocessedNum;
        }

        public static final class Builder {
            private Integer count; 
            private Long firstScanTime; 
            private Long lastScanTime; 
            private String riskClass; 
            private String riskClassName; 
            private String riskKey; 
            private String riskKeyName; 
            private String riskLevel; 
            private Integer unprocessedNum; 

            private Builder() {
            } 

            private Builder(List model) {
                this.count = model.count;
                this.firstScanTime = model.firstScanTime;
                this.lastScanTime = model.lastScanTime;
                this.riskClass = model.riskClass;
                this.riskClassName = model.riskClassName;
                this.riskKey = model.riskKey;
                this.riskKeyName = model.riskKeyName;
                this.riskLevel = model.riskLevel;
                this.unprocessedNum = model.unprocessedNum;
            } 

            /**
             * <p>The number of affected images.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder count(Integer count) {
                this.count = count;
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
             * <p>The type key of the risk.</p>
             * 
             * <strong>example:</strong>
             * <p>other</p>
             */
            public Builder riskClass(String riskClass) {
                this.riskClass = riskClass;
                return this;
            }

            /**
             * <p>The type name of the risk.</p>
             * 
             * <strong>example:</strong>
             * <p>other</p>
             */
            public Builder riskClassName(String riskClassName) {
                this.riskClassName = riskClassName;
                return this;
            }

            /**
             * <p>The key of the risk. You can call the <a href="~~~~">DescribeImageBuildRiskList</a> operation to obtain the value of <strong>RiskKey</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>no_user</p>
             */
            public Builder riskKey(String riskKey) {
                this.riskKey = riskKey;
                return this;
            }

            /**
             * <p>The rule name of the risk.</p>
             * 
             * <strong>example:</strong>
             * <p>no_user</p>
             */
            public Builder riskKeyName(String riskKeyName) {
                this.riskKeyName = riskKeyName;
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
             * <p>The number of unprocessed images.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder unprocessedNum(Integer unprocessedNum) {
                this.unprocessedNum = unprocessedNum;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeImageBuildRiskListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeImageBuildRiskListResponseBody</p>
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
     * {@link DescribeImageBuildRiskListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeImageBuildRiskListResponseBody</p>
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.list = model.list;
                this.pageInfo = model.pageInfo;
            } 

            /**
             * <p>The risks.</p>
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
