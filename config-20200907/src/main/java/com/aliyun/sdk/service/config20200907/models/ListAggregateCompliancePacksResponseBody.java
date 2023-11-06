// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAggregateCompliancePacksResponseBody} extends {@link TeaModel}
 *
 * <p>ListAggregateCompliancePacksResponseBody</p>
 */
public class ListAggregateCompliancePacksResponseBody extends TeaModel {
    @NameInMap("CompliancePacksResult")
    private CompliancePacksResult compliancePacksResult;

    @NameInMap("RequestId")
    private String requestId;

    private ListAggregateCompliancePacksResponseBody(Builder builder) {
        this.compliancePacksResult = builder.compliancePacksResult;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAggregateCompliancePacksResponseBody create() {
        return builder().build();
    }

    /**
     * @return compliancePacksResult
     */
    public CompliancePacksResult getCompliancePacksResult() {
        return this.compliancePacksResult;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private CompliancePacksResult compliancePacksResult; 
        private String requestId; 

        /**
         * The information about the compliance packages.
         */
        public Builder compliancePacksResult(CompliancePacksResult compliancePacksResult) {
            this.compliancePacksResult = compliancePacksResult;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListAggregateCompliancePacksResponseBody build() {
            return new ListAggregateCompliancePacksResponseBody(this);
        } 

    } 

    public static class CompliancePacks extends TeaModel {
        @NameInMap("AccountId")
        private Long accountId;

        @NameInMap("AggregatorId")
        private String aggregatorId;

        @NameInMap("CompliancePackId")
        private String compliancePackId;

        @NameInMap("CompliancePackName")
        private String compliancePackName;

        @NameInMap("CompliancePackTemplateId")
        private String compliancePackTemplateId;

        @NameInMap("CreateTimestamp")
        private Long createTimestamp;

        @NameInMap("Description")
        private String description;

        @NameInMap("RiskLevel")
        private Integer riskLevel;

        @NameInMap("Status")
        private String status;

        private CompliancePacks(Builder builder) {
            this.accountId = builder.accountId;
            this.aggregatorId = builder.aggregatorId;
            this.compliancePackId = builder.compliancePackId;
            this.compliancePackName = builder.compliancePackName;
            this.compliancePackTemplateId = builder.compliancePackTemplateId;
            this.createTimestamp = builder.createTimestamp;
            this.description = builder.description;
            this.riskLevel = builder.riskLevel;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CompliancePacks create() {
            return builder().build();
        }

        /**
         * @return accountId
         */
        public Long getAccountId() {
            return this.accountId;
        }

        /**
         * @return aggregatorId
         */
        public String getAggregatorId() {
            return this.aggregatorId;
        }

        /**
         * @return compliancePackId
         */
        public String getCompliancePackId() {
            return this.compliancePackId;
        }

        /**
         * @return compliancePackName
         */
        public String getCompliancePackName() {
            return this.compliancePackName;
        }

        /**
         * @return compliancePackTemplateId
         */
        public String getCompliancePackTemplateId() {
            return this.compliancePackTemplateId;
        }

        /**
         * @return createTimestamp
         */
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return riskLevel
         */
        public Integer getRiskLevel() {
            return this.riskLevel;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Long accountId; 
            private String aggregatorId; 
            private String compliancePackId; 
            private String compliancePackName; 
            private String compliancePackTemplateId; 
            private Long createTimestamp; 
            private String description; 
            private Integer riskLevel; 
            private String status; 

            /**
             * The ID of the management account to which the compliance package belongs.
             */
            public Builder accountId(Long accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * The ID of the account group.
             */
            public Builder aggregatorId(String aggregatorId) {
                this.aggregatorId = aggregatorId;
                return this;
            }

            /**
             * The ID of the compliance package.
             */
            public Builder compliancePackId(String compliancePackId) {
                this.compliancePackId = compliancePackId;
                return this;
            }

            /**
             * The name of the compliance package.
             */
            public Builder compliancePackName(String compliancePackName) {
                this.compliancePackName = compliancePackName;
                return this;
            }

            /**
             * The ID of the compliance package template.
             */
            public Builder compliancePackTemplateId(String compliancePackTemplateId) {
                this.compliancePackTemplateId = compliancePackTemplateId;
                return this;
            }

            /**
             * The timestamp when the compliance package was created. Unit: milliseconds.
             */
            public Builder createTimestamp(Long createTimestamp) {
                this.createTimestamp = createTimestamp;
                return this;
            }

            /**
             * The description of the compliance package.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The risk level of the resources that are not compliant with the managed rules in the compliance package. Valid values:
             * <p>
             * 
             * *   1: high risk level.
             * *   2: medium risk level.
             * *   3: low risk level.
             */
            public Builder riskLevel(Integer riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            /**
             * The status of the compliance package. Valid values:
             * <p>
             * 
             * *   ACTIVE: The compliance package is available for use.
             * *   CREATING: The compliance package is being created.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public CompliancePacks build() {
                return new CompliancePacks(this);
            } 

        } 

    }
    public static class CompliancePacksResult extends TeaModel {
        @NameInMap("CompliancePacks")
        private java.util.List < CompliancePacks> compliancePacks;

        @NameInMap("PageNumber")
        private Integer pageNumber;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("TotalCount")
        private Long totalCount;

        private CompliancePacksResult(Builder builder) {
            this.compliancePacks = builder.compliancePacks;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CompliancePacksResult create() {
            return builder().build();
        }

        /**
         * @return compliancePacks
         */
        public java.util.List < CompliancePacks> getCompliancePacks() {
            return this.compliancePacks;
        }

        /**
         * @return pageNumber
         */
        public Integer getPageNumber() {
            return this.pageNumber;
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
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List < CompliancePacks> compliancePacks; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Long totalCount; 

            /**
             * The details of the compliance package.
             */
            public Builder compliancePacks(java.util.List < CompliancePacks> compliancePacks) {
                this.compliancePacks = compliancePacks;
                return this;
            }

            /**
             * The page number of the returned page.
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * The number of entries returned per page.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * The total number of compliance packages returned.
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public CompliancePacksResult build() {
                return new CompliancePacksResult(this);
            } 

        } 

    }
}
