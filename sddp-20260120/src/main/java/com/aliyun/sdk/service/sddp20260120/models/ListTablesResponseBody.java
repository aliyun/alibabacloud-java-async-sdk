// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20260120.models;

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
 * {@link ListTablesResponseBody} extends {@link TeaModel}
 *
 * <p>ListTablesResponseBody</p>
 */
public class ListTablesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("Marker")
    private String marker;

    @com.aliyun.core.annotation.NameInMap("NextMarker")
    private String nextMarker;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("Truncated")
    private String truncated;

    private ListTablesResponseBody(Builder builder) {
        this.currentPage = builder.currentPage;
        this.items = builder.items;
        this.marker = builder.marker;
        this.nextMarker = builder.nextMarker;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.truncated = builder.truncated;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTablesResponseBody create() {
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
     * @return marker
     */
    public String getMarker() {
        return this.marker;
    }

    /**
     * @return nextMarker
     */
    public String getNextMarker() {
        return this.nextMarker;
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

    /**
     * @return truncated
     */
    public String getTruncated() {
        return this.truncated;
    }

    public static final class Builder {
        private Integer currentPage; 
        private java.util.List<Items> items; 
        private String marker; 
        private String nextMarker; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 
        private String truncated; 

        private Builder() {
        } 

        private Builder(ListTablesResponseBody model) {
            this.currentPage = model.currentPage;
            this.items = model.items;
            this.marker = model.marker;
            this.nextMarker = model.nextMarker;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
            this.truncated = model.truncated;
        } 

        /**
         * <p>The page number of the returned data.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The list of records returned by the query.</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The pagination cursor used for the current query.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder marker(String marker) {
            this.marker = marker;
            return this;
        }

        /**
         * <p>The cursor used to query the next page.</p>
         * 
         * <strong>example:</strong>
         * <p>1001</p>
         */
        public Builder nextMarker(String nextMarker) {
            this.nextMarker = nextMarker;
            return this;
        }

        /**
         * <p>The number of entries returned per page for the current query.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request. You can use the ID to locate the API call.</p>
         * 
         * <strong>example:</strong>
         * <p>7C6D8E9F-1234-5678-ABCD-0123456789AB</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries that meet the current statistical or query scope.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>Indicates whether more pages exist. A value of true indicates that more data exists. A value of false indicates that no more data exists.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder truncated(String truncated) {
            this.truncated = truncated;
            return this;
        }

        public ListTablesResponseBody build() {
            return new ListTablesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListTablesResponseBody} extends {@link TeaModel}
     *
     * <p>ListTablesResponseBody</p>
     */
    public static class RuleList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Long count;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("RiskLevelId")
        private Long riskLevelId;

        private RuleList(Builder builder) {
            this.count = builder.count;
            this.name = builder.name;
            this.riskLevelId = builder.riskLevelId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RuleList create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Long getCount() {
            return this.count;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return riskLevelId
         */
        public Long getRiskLevelId() {
            return this.riskLevelId;
        }

        public static final class Builder {
            private Long count; 
            private String name; 
            private Long riskLevelId; 

            private Builder() {
            } 

            private Builder(RuleList model) {
                this.count = model.count;
                this.name = model.name;
                this.riskLevelId = model.riskLevelId;
            } 

            /**
             * <p>The number of hits for the detection rule.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The name of the detection model or rule.</p>
             * 
             * <strong>example:</strong>
             * <p>Phone number</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The ID of the sensitivity level.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder riskLevelId(Long riskLevelId) {
                this.riskLevelId = riskLevelId;
                return this;
            }

            public RuleList build() {
                return new RuleList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListTablesResponseBody} extends {@link TeaModel}
     *
     * <p>ListTablesResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Comment")
        private String comment;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private Long creationTime;

        @com.aliyun.core.annotation.NameInMap("DataAssetSourceId")
        private String dataAssetSourceId;

        @com.aliyun.core.annotation.NameInMap("DataSourceName")
        private String dataSourceName;

        @com.aliyun.core.annotation.NameInMap("InstanceDescription")
        private String instanceDescription;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Owner")
        private String owner;

        @com.aliyun.core.annotation.NameInMap("ProductCode")
        private String productCode;

        @com.aliyun.core.annotation.NameInMap("RiskLevelId")
        private Long riskLevelId;

        @com.aliyun.core.annotation.NameInMap("RiskLevelName")
        private String riskLevelName;

        @com.aliyun.core.annotation.NameInMap("RuleList")
        private java.util.List<RuleList> ruleList;

        @com.aliyun.core.annotation.NameInMap("Sensitive")
        private Boolean sensitive;

        @com.aliyun.core.annotation.NameInMap("SensitiveCount")
        private Integer sensitiveCount;

        @com.aliyun.core.annotation.NameInMap("SensitiveRatio")
        private String sensitiveRatio;

        @com.aliyun.core.annotation.NameInMap("TenantName")
        private String tenantName;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private Items(Builder builder) {
            this.comment = builder.comment;
            this.creationTime = builder.creationTime;
            this.dataAssetSourceId = builder.dataAssetSourceId;
            this.dataSourceName = builder.dataSourceName;
            this.instanceDescription = builder.instanceDescription;
            this.name = builder.name;
            this.owner = builder.owner;
            this.productCode = builder.productCode;
            this.riskLevelId = builder.riskLevelId;
            this.riskLevelName = builder.riskLevelName;
            this.ruleList = builder.ruleList;
            this.sensitive = builder.sensitive;
            this.sensitiveCount = builder.sensitiveCount;
            this.sensitiveRatio = builder.sensitiveRatio;
            this.tenantName = builder.tenantName;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return comment
         */
        public String getComment() {
            return this.comment;
        }

        /**
         * @return creationTime
         */
        public Long getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return dataAssetSourceId
         */
        public String getDataAssetSourceId() {
            return this.dataAssetSourceId;
        }

        /**
         * @return dataSourceName
         */
        public String getDataSourceName() {
            return this.dataSourceName;
        }

        /**
         * @return instanceDescription
         */
        public String getInstanceDescription() {
            return this.instanceDescription;
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
         * @return productCode
         */
        public String getProductCode() {
            return this.productCode;
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
         * @return ruleList
         */
        public java.util.List<RuleList> getRuleList() {
            return this.ruleList;
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
         * @return sensitiveRatio
         */
        public String getSensitiveRatio() {
            return this.sensitiveRatio;
        }

        /**
         * @return tenantName
         */
        public String getTenantName() {
            return this.tenantName;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private String comment; 
            private Long creationTime; 
            private String dataAssetSourceId; 
            private String dataSourceName; 
            private String instanceDescription; 
            private String name; 
            private String owner; 
            private String productCode; 
            private Long riskLevelId; 
            private String riskLevelName; 
            private java.util.List<RuleList> ruleList; 
            private Boolean sensitive; 
            private Integer sensitiveCount; 
            private String sensitiveRatio; 
            private String tenantName; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.comment = model.comment;
                this.creationTime = model.creationTime;
                this.dataAssetSourceId = model.dataAssetSourceId;
                this.dataSourceName = model.dataSourceName;
                this.instanceDescription = model.instanceDescription;
                this.name = model.name;
                this.owner = model.owner;
                this.productCode = model.productCode;
                this.riskLevelId = model.riskLevelId;
                this.riskLevelName = model.riskLevelName;
                this.ruleList = model.ruleList;
                this.sensitive = model.sensitive;
                this.sensitiveCount = model.sensitiveCount;
                this.sensitiveRatio = model.sensitiveRatio;
                this.tenantName = model.tenantName;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The description of the database table.</p>
             * 
             * <strong>example:</strong>
             * <p>Customer contact information</p>
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * <p>The time when the data object was created. The value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1788566400000</p>
             */
            public Builder creationTime(Long creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The instance identity of the cloud instance.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-2ze1abcdefgh****</p>
             */
            public Builder dataAssetSourceId(String dataAssetSourceId) {
                this.dataAssetSourceId = dataAssetSourceId;
                return this;
            }

            /**
             * <p>The name of the database.</p>
             * 
             * <strong>example:</strong>
             * <p>business_db</p>
             */
            public Builder dataSourceName(String dataSourceName) {
                this.dataSourceName = dataSourceName;
                return this;
            }

            /**
             * <p>The description of the database instance.</p>
             * 
             * <strong>example:</strong>
             * <p>Business database instance</p>
             */
            public Builder instanceDescription(String instanceDescription) {
                this.instanceDescription = instanceDescription;
                return this;
            }

            /**
             * <p>The name of the database table. Some engines return the name in the schema.table format.</p>
             * 
             * <strong>example:</strong>
             * <p>customer</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account that owns the database table.</p>
             * 
             * <strong>example:</strong>
             * <p>123456789012****</p>
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * <p>The code of the cloud service.</p>
             * 
             * <strong>example:</strong>
             * <p>RDS</p>
             */
            public Builder productCode(String productCode) {
                this.productCode = productCode;
                return this;
            }

            /**
             * <p>The ID of the sensitivity level.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder riskLevelId(Long riskLevelId) {
                this.riskLevelId = riskLevelId;
                return this;
            }

            /**
             * <p>The name of the sensitivity level.</p>
             * 
             * <strong>example:</strong>
             * <p>S2</p>
             */
            public Builder riskLevelName(String riskLevelName) {
                this.riskLevelName = riskLevelName;
                return this;
            }

            /**
             * <p>The list of detection models or rules.</p>
             */
            public Builder ruleList(java.util.List<RuleList> ruleList) {
                this.ruleList = ruleList;
                return this;
            }

            /**
             * <p>Indicates whether the data is detected as sensitive data.</p>
             */
            public Builder sensitive(Boolean sensitive) {
                this.sensitive = sensitive;
                return this;
            }

            /**
             * <p>The number of sensitive data entries within the current statistical scope.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder sensitiveCount(Integer sensitiveCount) {
                this.sensitiveCount = sensitiveCount;
                return this;
            }

            /**
             * <p>The proportion of sensitive data.</p>
             * 
             * <strong>example:</strong>
             * <p>0.2</p>
             */
            public Builder sensitiveRatio(String sensitiveRatio) {
                this.sensitiveRatio = sensitiveRatio;
                return this;
            }

            /**
             * <p>The name of the tenant to which the data asset belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>Business tenant</p>
             */
            public Builder tenantName(String tenantName) {
                this.tenantName = tenantName;
                return this;
            }

            /**
             * <p>The total number of entries that meet the current statistical or query scope.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
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
