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
         * Marker.
         */
        public Builder marker(String marker) {
            this.marker = marker;
            return this;
        }

        /**
         * NextMarker.
         */
        public Builder nextMarker(String nextMarker) {
            this.nextMarker = nextMarker;
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

        /**
         * Truncated.
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
             * Count.
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * RiskLevelId.
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
             * Comment.
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * CreationTime.
             */
            public Builder creationTime(Long creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * DataAssetSourceId.
             */
            public Builder dataAssetSourceId(String dataAssetSourceId) {
                this.dataAssetSourceId = dataAssetSourceId;
                return this;
            }

            /**
             * DataSourceName.
             */
            public Builder dataSourceName(String dataSourceName) {
                this.dataSourceName = dataSourceName;
                return this;
            }

            /**
             * InstanceDescription.
             */
            public Builder instanceDescription(String instanceDescription) {
                this.instanceDescription = instanceDescription;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Owner.
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * ProductCode.
             */
            public Builder productCode(String productCode) {
                this.productCode = productCode;
                return this;
            }

            /**
             * RiskLevelId.
             */
            public Builder riskLevelId(Long riskLevelId) {
                this.riskLevelId = riskLevelId;
                return this;
            }

            /**
             * RiskLevelName.
             */
            public Builder riskLevelName(String riskLevelName) {
                this.riskLevelName = riskLevelName;
                return this;
            }

            /**
             * RuleList.
             */
            public Builder ruleList(java.util.List<RuleList> ruleList) {
                this.ruleList = ruleList;
                return this;
            }

            /**
             * Sensitive.
             */
            public Builder sensitive(Boolean sensitive) {
                this.sensitive = sensitive;
                return this;
            }

            /**
             * SensitiveCount.
             */
            public Builder sensitiveCount(Integer sensitiveCount) {
                this.sensitiveCount = sensitiveCount;
                return this;
            }

            /**
             * SensitiveRatio.
             */
            public Builder sensitiveRatio(String sensitiveRatio) {
                this.sensitiveRatio = sensitiveRatio;
                return this;
            }

            /**
             * TenantName.
             */
            public Builder tenantName(String tenantName) {
                this.tenantName = tenantName;
                return this;
            }

            /**
             * TotalCount.
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
