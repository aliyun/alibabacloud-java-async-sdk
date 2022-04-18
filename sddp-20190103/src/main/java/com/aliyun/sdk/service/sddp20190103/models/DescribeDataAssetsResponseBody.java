// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDataAssetsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDataAssetsResponseBody</p>
 */
public class DescribeDataAssetsResponseBody extends TeaModel {
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @NameInMap("Items")
    private java.util.List < Items> items;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeDataAssetsResponseBody(Builder builder) {
        this.currentPage = builder.currentPage;
        this.items = builder.items;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDataAssetsResponseBody create() {
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
    public java.util.List < Items> getItems() {
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
        private java.util.List < Items> items; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

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
        public Builder items(java.util.List < Items> items) {
            this.items = items;
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

        public DescribeDataAssetsResponseBody build() {
            return new DescribeDataAssetsResponseBody(this);
        } 

    } 

    public static class Items extends TeaModel {
        @NameInMap("Acl")
        private String acl;

        @NameInMap("CreationTime")
        private Long creationTime;

        @NameInMap("DataType")
        private String dataType;

        @NameInMap("Id")
        private String id;

        @NameInMap("Labelsec")
        private Boolean labelsec;

        @NameInMap("Name")
        private String name;

        @NameInMap("ObjectKey")
        private String objectKey;

        @NameInMap("OdpsRiskLevelName")
        private String odpsRiskLevelName;

        @NameInMap("Owner")
        private String owner;

        @NameInMap("ProductCode")
        private String productCode;

        @NameInMap("ProductId")
        private String productId;

        @NameInMap("Protection")
        private Boolean protection;

        @NameInMap("RiskLevelId")
        private Long riskLevelId;

        @NameInMap("RiskLevelName")
        private String riskLevelName;

        @NameInMap("RuleName")
        private String ruleName;

        @NameInMap("Sensitive")
        private Boolean sensitive;

        @NameInMap("SensitiveCount")
        private Integer sensitiveCount;

        @NameInMap("SensitiveRatio")
        private String sensitiveRatio;

        @NameInMap("TotalCount")
        private Integer totalCount;

        private Items(Builder builder) {
            this.acl = builder.acl;
            this.creationTime = builder.creationTime;
            this.dataType = builder.dataType;
            this.id = builder.id;
            this.labelsec = builder.labelsec;
            this.name = builder.name;
            this.objectKey = builder.objectKey;
            this.odpsRiskLevelName = builder.odpsRiskLevelName;
            this.owner = builder.owner;
            this.productCode = builder.productCode;
            this.productId = builder.productId;
            this.protection = builder.protection;
            this.riskLevelId = builder.riskLevelId;
            this.riskLevelName = builder.riskLevelName;
            this.ruleName = builder.ruleName;
            this.sensitive = builder.sensitive;
            this.sensitiveCount = builder.sensitiveCount;
            this.sensitiveRatio = builder.sensitiveRatio;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return acl
         */
        public String getAcl() {
            return this.acl;
        }

        /**
         * @return creationTime
         */
        public Long getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return dataType
         */
        public String getDataType() {
            return this.dataType;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return labelsec
         */
        public Boolean getLabelsec() {
            return this.labelsec;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return objectKey
         */
        public String getObjectKey() {
            return this.objectKey;
        }

        /**
         * @return odpsRiskLevelName
         */
        public String getOdpsRiskLevelName() {
            return this.odpsRiskLevelName;
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
         * @return productId
         */
        public String getProductId() {
            return this.productId;
        }

        /**
         * @return protection
         */
        public Boolean getProtection() {
            return this.protection;
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
         * @return ruleName
         */
        public String getRuleName() {
            return this.ruleName;
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
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private String acl; 
            private Long creationTime; 
            private String dataType; 
            private String id; 
            private Boolean labelsec; 
            private String name; 
            private String objectKey; 
            private String odpsRiskLevelName; 
            private String owner; 
            private String productCode; 
            private String productId; 
            private Boolean protection; 
            private Long riskLevelId; 
            private String riskLevelName; 
            private String ruleName; 
            private Boolean sensitive; 
            private Integer sensitiveCount; 
            private String sensitiveRatio; 
            private Integer totalCount; 

            /**
             * Acl.
             */
            public Builder acl(String acl) {
                this.acl = acl;
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
             * DataType.
             */
            public Builder dataType(String dataType) {
                this.dataType = dataType;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Labelsec.
             */
            public Builder labelsec(Boolean labelsec) {
                this.labelsec = labelsec;
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
             * ObjectKey.
             */
            public Builder objectKey(String objectKey) {
                this.objectKey = objectKey;
                return this;
            }

            /**
             * OdpsRiskLevelName.
             */
            public Builder odpsRiskLevelName(String odpsRiskLevelName) {
                this.odpsRiskLevelName = odpsRiskLevelName;
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
             * ProductId.
             */
            public Builder productId(String productId) {
                this.productId = productId;
                return this;
            }

            /**
             * Protection.
             */
            public Builder protection(Boolean protection) {
                this.protection = protection;
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
             * RuleName.
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
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
