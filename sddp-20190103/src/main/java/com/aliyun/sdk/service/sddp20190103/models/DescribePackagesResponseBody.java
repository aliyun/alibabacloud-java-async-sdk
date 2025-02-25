// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

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
 * {@link DescribePackagesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePackagesResponseBody</p>
 */
public class DescribePackagesResponseBody extends TeaModel {
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

    private DescribePackagesResponseBody(Builder builder) {
        this.currentPage = builder.currentPage;
        this.items = builder.items;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePackagesResponseBody create() {
        return builder().build();
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
        private Integer currentPage; 
        private java.util.List<Items> items; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

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
         * <p>An array that consists of the information about the packages.</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>769FB3C1-F4C9-42DF-9B72-7077A8989C13</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribePackagesResponseBody build() {
            return new DescribePackagesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribePackagesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePackagesResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private Long creationTime;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private Long instanceId;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Owner")
        private String owner;

        @com.aliyun.core.annotation.NameInMap("RiskLevelId")
        private Long riskLevelId;

        @com.aliyun.core.annotation.NameInMap("RiskLevelName")
        private String riskLevelName;

        @com.aliyun.core.annotation.NameInMap("Sensitive")
        private Boolean sensitive;

        @com.aliyun.core.annotation.NameInMap("SensitiveCount")
        private Integer sensitiveCount;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private Items(Builder builder) {
            this.creationTime = builder.creationTime;
            this.id = builder.id;
            this.instanceId = builder.instanceId;
            this.name = builder.name;
            this.owner = builder.owner;
            this.riskLevelId = builder.riskLevelId;
            this.riskLevelName = builder.riskLevelName;
            this.sensitive = builder.sensitive;
            this.sensitiveCount = builder.sensitiveCount;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return creationTime
         */
        public Long getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return instanceId
         */
        public Long getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return owner
         */
        public String getOwner() {
            return this.owner;
        }

        /**
         * @return riskLevelId
         */
        public Long getRiskLevelId() {
            return this.riskLevelId;
        }

        /**
         * @return riskLevelName
         */
        public String getRiskLevelName() {
            return this.riskLevelName;
        }

        /**
         * @return sensitive
         */
        public Boolean getSensitive() {
            return this.sensitive;
        }

        /**
         * @return sensitiveCount
         */
        public Integer getSensitiveCount() {
            return this.sensitiveCount;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Long creationTime; 
            private Long id; 
            private Long instanceId; 
            private String name; 
            private String owner; 
            private Long riskLevelId; 
            private String riskLevelName; 
            private Boolean sensitive; 
            private Integer sensitiveCount; 
            private Integer totalCount; 

            /**
             * <p>The point in time when the MaxCompute package was created. The value is a UNIX timestamp. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1536751124000</p>
             */
            public Builder creationTime(Long creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The ID of the package.</p>
             * 
             * <strong>example:</strong>
             * <p>111111</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The ID of the instance to which the package belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>223453332</p>
             */
            public Builder instanceId(Long instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The name of the package.</p>
             * 
             * <strong>example:</strong>
             * <p>gxdata</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The account of the user that owns the package.</p>
             * 
             * <strong>example:</strong>
             * <p>cou-2221</p>
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * <p>The sensitivity level of the package. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: N/A, which indicates that no sensitive data is detected.</li>
             * <li><strong>2</strong>: S1, which indicates the low sensitivity level.</li>
             * <li><strong>3</strong>: S2, which indicates the medium sensitivity level.</li>
             * <li><strong>4</strong>: S3, which indicates the high sensitivity level.</li>
             * <li><strong>5</strong>: S4, which indicates the highest sensitivity level.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder riskLevelId(Long riskLevelId) {
                this.riskLevelId = riskLevelId;
                return this;
            }

            /**
             * <p>The name of the sensitivity level for the package.</p>
             * 
             * <strong>example:</strong>
             * <p>Highest sensitivity level</p>
             */
            public Builder riskLevelName(String riskLevelName) {
                this.riskLevelName = riskLevelName;
                return this;
            }

            /**
             * <p>Indicates whether the package contains sensitive data. Valid values:</p>
             * <ul>
             * <li>true: yes</li>
             * <li>false: no</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder sensitive(Boolean sensitive) {
                this.sensitive = sensitive;
                return this;
            }

            /**
             * <p>The total volume of sensitive data in the package. For example, the value can be the total number of sensitive tables in the MaxCompute package.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder sensitiveCount(Integer sensitiveCount) {
                this.sensitiveCount = sensitiveCount;
                return this;
            }

            /**
             * <p>The total volume of data in the package. For example, the value can be the total number of tables in the MaxCompute package.</p>
             * 
             * <strong>example:</strong>
             * <p>321</p>
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
