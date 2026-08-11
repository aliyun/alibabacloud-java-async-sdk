// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20241212.models;

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
 * {@link ListAlertAggregationsResponseBody} extends {@link TeaModel}
 *
 * <p>ListAlertAggregationsResponseBody</p>
 */
public class ListAlertAggregationsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AlertAggregations")
    private java.util.List<AlertAggregations> alertAggregations;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListAlertAggregationsResponseBody(Builder builder) {
        this.alertAggregations = builder.alertAggregations;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAlertAggregationsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alertAggregations
     */
    public java.util.List<AlertAggregations> getAlertAggregations() {
        return this.alertAggregations;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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
        private java.util.List<AlertAggregations> alertAggregations; 
        private Integer maxResults; 
        private String nextToken; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListAlertAggregationsResponseBody model) {
            this.alertAggregations = model.alertAggregations;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * AlertAggregations.
         */
        public Builder alertAggregations(java.util.List<AlertAggregations> alertAggregations) {
            this.alertAggregations = alertAggregations;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
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

        public ListAlertAggregationsResponseBody build() {
            return new ListAlertAggregationsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAlertAggregationsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAlertAggregationsResponseBody</p>
     */
    public static class DefenseActionCounts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Long value;

        private DefenseActionCounts(Builder builder) {
            this.name = builder.name;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DefenseActionCounts create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return value
         */
        public Long getValue() {
            return this.value;
        }

        public static final class Builder {
            private String name; 
            private Long value; 

            private Builder() {
            } 

            private Builder(DefenseActionCounts model) {
                this.name = model.name;
                this.value = model.value;
            } 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(Long value) {
                this.value = value;
                return this;
            }

            public DefenseActionCounts build() {
                return new DefenseActionCounts(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAlertAggregationsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAlertAggregationsResponseBody</p>
     */
    public static class StatusCounts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Long value;

        private StatusCounts(Builder builder) {
            this.name = builder.name;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StatusCounts create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return value
         */
        public Long getValue() {
            return this.value;
        }

        public static final class Builder {
            private String name; 
            private Long value; 

            private Builder() {
            } 

            private Builder(StatusCounts model) {
                this.name = model.name;
                this.value = model.value;
            } 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(Long value) {
                this.value = value;
                return this;
            }

            public StatusCounts build() {
                return new StatusCounts(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAlertAggregationsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAlertAggregationsResponseBody</p>
     */
    public static class AlertAggregations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountDisplayValues")
        private java.util.List<String> accountDisplayValues;

        @com.aliyun.core.annotation.NameInMap("AccountIds")
        private java.util.List<String> accountIds;

        @com.aliyun.core.annotation.NameInMap("AggregationKey")
        private String aggregationKey;

        @com.aliyun.core.annotation.NameInMap("AggregationType")
        private String aggregationType;

        @com.aliyun.core.annotation.NameInMap("AlertCount")
        private Long alertCount;

        @com.aliyun.core.annotation.NameInMap("AttackStages")
        private java.util.List<String> attackStages;

        @com.aliyun.core.annotation.NameInMap("DefenseActionCounts")
        private java.util.List<DefenseActionCounts> defenseActionCounts;

        @com.aliyun.core.annotation.NameInMap("FirstTime")
        private Long firstTime;

        @com.aliyun.core.annotation.NameInMap("LatestTime")
        private Long latestTime;

        @com.aliyun.core.annotation.NameInMap("PrimaryDisplayValue")
        private String primaryDisplayValue;

        @com.aliyun.core.annotation.NameInMap("PrimaryValue")
        private String primaryValue;

        @com.aliyun.core.annotation.NameInMap("SecondaryValue")
        private String secondaryValue;

        @com.aliyun.core.annotation.NameInMap("SourceCodes")
        private java.util.List<String> sourceCodes;

        @com.aliyun.core.annotation.NameInMap("StatusCounts")
        private java.util.List<StatusCounts> statusCounts;

        private AlertAggregations(Builder builder) {
            this.accountDisplayValues = builder.accountDisplayValues;
            this.accountIds = builder.accountIds;
            this.aggregationKey = builder.aggregationKey;
            this.aggregationType = builder.aggregationType;
            this.alertCount = builder.alertCount;
            this.attackStages = builder.attackStages;
            this.defenseActionCounts = builder.defenseActionCounts;
            this.firstTime = builder.firstTime;
            this.latestTime = builder.latestTime;
            this.primaryDisplayValue = builder.primaryDisplayValue;
            this.primaryValue = builder.primaryValue;
            this.secondaryValue = builder.secondaryValue;
            this.sourceCodes = builder.sourceCodes;
            this.statusCounts = builder.statusCounts;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AlertAggregations create() {
            return builder().build();
        }

        /**
         * @return accountDisplayValues
         */
        public java.util.List<String> getAccountDisplayValues() {
            return this.accountDisplayValues;
        }

        /**
         * @return accountIds
         */
        public java.util.List<String> getAccountIds() {
            return this.accountIds;
        }

        /**
         * @return aggregationKey
         */
        public String getAggregationKey() {
            return this.aggregationKey;
        }

        /**
         * @return aggregationType
         */
        public String getAggregationType() {
            return this.aggregationType;
        }

        /**
         * @return alertCount
         */
        public Long getAlertCount() {
            return this.alertCount;
        }

        /**
         * @return attackStages
         */
        public java.util.List<String> getAttackStages() {
            return this.attackStages;
        }

        /**
         * @return defenseActionCounts
         */
        public java.util.List<DefenseActionCounts> getDefenseActionCounts() {
            return this.defenseActionCounts;
        }

        /**
         * @return firstTime
         */
        public Long getFirstTime() {
            return this.firstTime;
        }

        /**
         * @return latestTime
         */
        public Long getLatestTime() {
            return this.latestTime;
        }

        /**
         * @return primaryDisplayValue
         */
        public String getPrimaryDisplayValue() {
            return this.primaryDisplayValue;
        }

        /**
         * @return primaryValue
         */
        public String getPrimaryValue() {
            return this.primaryValue;
        }

        /**
         * @return secondaryValue
         */
        public String getSecondaryValue() {
            return this.secondaryValue;
        }

        /**
         * @return sourceCodes
         */
        public java.util.List<String> getSourceCodes() {
            return this.sourceCodes;
        }

        /**
         * @return statusCounts
         */
        public java.util.List<StatusCounts> getStatusCounts() {
            return this.statusCounts;
        }

        public static final class Builder {
            private java.util.List<String> accountDisplayValues; 
            private java.util.List<String> accountIds; 
            private String aggregationKey; 
            private String aggregationType; 
            private Long alertCount; 
            private java.util.List<String> attackStages; 
            private java.util.List<DefenseActionCounts> defenseActionCounts; 
            private Long firstTime; 
            private Long latestTime; 
            private String primaryDisplayValue; 
            private String primaryValue; 
            private String secondaryValue; 
            private java.util.List<String> sourceCodes; 
            private java.util.List<StatusCounts> statusCounts; 

            private Builder() {
            } 

            private Builder(AlertAggregations model) {
                this.accountDisplayValues = model.accountDisplayValues;
                this.accountIds = model.accountIds;
                this.aggregationKey = model.aggregationKey;
                this.aggregationType = model.aggregationType;
                this.alertCount = model.alertCount;
                this.attackStages = model.attackStages;
                this.defenseActionCounts = model.defenseActionCounts;
                this.firstTime = model.firstTime;
                this.latestTime = model.latestTime;
                this.primaryDisplayValue = model.primaryDisplayValue;
                this.primaryValue = model.primaryValue;
                this.secondaryValue = model.secondaryValue;
                this.sourceCodes = model.sourceCodes;
                this.statusCounts = model.statusCounts;
            } 

            /**
             * AccountDisplayValues.
             */
            public Builder accountDisplayValues(java.util.List<String> accountDisplayValues) {
                this.accountDisplayValues = accountDisplayValues;
                return this;
            }

            /**
             * AccountIds.
             */
            public Builder accountIds(java.util.List<String> accountIds) {
                this.accountIds = accountIds;
                return this;
            }

            /**
             * AggregationKey.
             */
            public Builder aggregationKey(String aggregationKey) {
                this.aggregationKey = aggregationKey;
                return this;
            }

            /**
             * AggregationType.
             */
            public Builder aggregationType(String aggregationType) {
                this.aggregationType = aggregationType;
                return this;
            }

            /**
             * AlertCount.
             */
            public Builder alertCount(Long alertCount) {
                this.alertCount = alertCount;
                return this;
            }

            /**
             * AttackStages.
             */
            public Builder attackStages(java.util.List<String> attackStages) {
                this.attackStages = attackStages;
                return this;
            }

            /**
             * DefenseActionCounts.
             */
            public Builder defenseActionCounts(java.util.List<DefenseActionCounts> defenseActionCounts) {
                this.defenseActionCounts = defenseActionCounts;
                return this;
            }

            /**
             * FirstTime.
             */
            public Builder firstTime(Long firstTime) {
                this.firstTime = firstTime;
                return this;
            }

            /**
             * LatestTime.
             */
            public Builder latestTime(Long latestTime) {
                this.latestTime = latestTime;
                return this;
            }

            /**
             * PrimaryDisplayValue.
             */
            public Builder primaryDisplayValue(String primaryDisplayValue) {
                this.primaryDisplayValue = primaryDisplayValue;
                return this;
            }

            /**
             * PrimaryValue.
             */
            public Builder primaryValue(String primaryValue) {
                this.primaryValue = primaryValue;
                return this;
            }

            /**
             * SecondaryValue.
             */
            public Builder secondaryValue(String secondaryValue) {
                this.secondaryValue = secondaryValue;
                return this;
            }

            /**
             * SourceCodes.
             */
            public Builder sourceCodes(java.util.List<String> sourceCodes) {
                this.sourceCodes = sourceCodes;
                return this;
            }

            /**
             * StatusCounts.
             */
            public Builder statusCounts(java.util.List<StatusCounts> statusCounts) {
                this.statusCounts = statusCounts;
                return this;
            }

            public AlertAggregations build() {
                return new AlertAggregations(this);
            } 

        } 

    }
}
