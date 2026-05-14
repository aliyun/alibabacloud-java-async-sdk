// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20230930.models;

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
 * {@link DescribeBudgetResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBudgetResponseBody</p>
 */
public class DescribeBudgetResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BudgetName")
    private String budgetName;

    @com.aliyun.core.annotation.NameInMap("BudgetType")
    private String budgetType;

    @com.aliyun.core.annotation.NameInMap("Comment")
    private String comment;

    @com.aliyun.core.annotation.NameInMap("CycleEndPeriod")
    private String cycleEndPeriod;

    @com.aliyun.core.annotation.NameInMap("CycleQuota")
    private java.util.List<CycleQuota> cycleQuota;

    @com.aliyun.core.annotation.NameInMap("CycleStartPeriod")
    private String cycleStartPeriod;

    @com.aliyun.core.annotation.NameInMap("CycleType")
    private String cycleType;

    @com.aliyun.core.annotation.NameInMap("EcIdAccountIdsFilter")
    private EcIdAccountIdsFilter ecIdAccountIdsFilter;

    @com.aliyun.core.annotation.NameInMap("Metadata")
    private Object metadata;

    @com.aliyun.core.annotation.NameInMap("Metric")
    private String metric;

    @com.aliyun.core.annotation.NameInMap("QueryFilter")
    private java.util.List<QueryFilter> queryFilter;

    @com.aliyun.core.annotation.NameInMap("Quota")
    private String quota;

    @com.aliyun.core.annotation.NameInMap("QuotaType")
    private String quotaType;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("WarnConfs")
    private java.util.List<WarnConfs> warnConfs;

    private DescribeBudgetResponseBody(Builder builder) {
        this.budgetName = builder.budgetName;
        this.budgetType = builder.budgetType;
        this.comment = builder.comment;
        this.cycleEndPeriod = builder.cycleEndPeriod;
        this.cycleQuota = builder.cycleQuota;
        this.cycleStartPeriod = builder.cycleStartPeriod;
        this.cycleType = builder.cycleType;
        this.ecIdAccountIdsFilter = builder.ecIdAccountIdsFilter;
        this.metadata = builder.metadata;
        this.metric = builder.metric;
        this.queryFilter = builder.queryFilter;
        this.quota = builder.quota;
        this.quotaType = builder.quotaType;
        this.requestId = builder.requestId;
        this.warnConfs = builder.warnConfs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBudgetResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return budgetName
     */
    public String getBudgetName() {
        return this.budgetName;
    }

    /**
     * @return budgetType
     */
    public String getBudgetType() {
        return this.budgetType;
    }

    /**
     * @return comment
     */
    public String getComment() {
        return this.comment;
    }

    /**
     * @return cycleEndPeriod
     */
    public String getCycleEndPeriod() {
        return this.cycleEndPeriod;
    }

    /**
     * @return cycleQuota
     */
    public java.util.List<CycleQuota> getCycleQuota() {
        return this.cycleQuota;
    }

    /**
     * @return cycleStartPeriod
     */
    public String getCycleStartPeriod() {
        return this.cycleStartPeriod;
    }

    /**
     * @return cycleType
     */
    public String getCycleType() {
        return this.cycleType;
    }

    /**
     * @return ecIdAccountIdsFilter
     */
    public EcIdAccountIdsFilter getEcIdAccountIdsFilter() {
        return this.ecIdAccountIdsFilter;
    }

    /**
     * @return metadata
     */
    public Object getMetadata() {
        return this.metadata;
    }

    /**
     * @return metric
     */
    public String getMetric() {
        return this.metric;
    }

    /**
     * @return queryFilter
     */
    public java.util.List<QueryFilter> getQueryFilter() {
        return this.queryFilter;
    }

    /**
     * @return quota
     */
    public String getQuota() {
        return this.quota;
    }

    /**
     * @return quotaType
     */
    public String getQuotaType() {
        return this.quotaType;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return warnConfs
     */
    public java.util.List<WarnConfs> getWarnConfs() {
        return this.warnConfs;
    }

    public static final class Builder {
        private String budgetName; 
        private String budgetType; 
        private String comment; 
        private String cycleEndPeriod; 
        private java.util.List<CycleQuota> cycleQuota; 
        private String cycleStartPeriod; 
        private String cycleType; 
        private EcIdAccountIdsFilter ecIdAccountIdsFilter; 
        private Object metadata; 
        private String metric; 
        private java.util.List<QueryFilter> queryFilter; 
        private String quota; 
        private String quotaType; 
        private String requestId; 
        private java.util.List<WarnConfs> warnConfs; 

        private Builder() {
        } 

        private Builder(DescribeBudgetResponseBody model) {
            this.budgetName = model.budgetName;
            this.budgetType = model.budgetType;
            this.comment = model.comment;
            this.cycleEndPeriod = model.cycleEndPeriod;
            this.cycleQuota = model.cycleQuota;
            this.cycleStartPeriod = model.cycleStartPeriod;
            this.cycleType = model.cycleType;
            this.ecIdAccountIdsFilter = model.ecIdAccountIdsFilter;
            this.metadata = model.metadata;
            this.metric = model.metric;
            this.queryFilter = model.queryFilter;
            this.quota = model.quota;
            this.quotaType = model.quotaType;
            this.requestId = model.requestId;
            this.warnConfs = model.warnConfs;
        } 

        /**
         * BudgetName.
         */
        public Builder budgetName(String budgetName) {
            this.budgetName = budgetName;
            return this;
        }

        /**
         * BudgetType.
         */
        public Builder budgetType(String budgetType) {
            this.budgetType = budgetType;
            return this;
        }

        /**
         * Comment.
         */
        public Builder comment(String comment) {
            this.comment = comment;
            return this;
        }

        /**
         * CycleEndPeriod.
         */
        public Builder cycleEndPeriod(String cycleEndPeriod) {
            this.cycleEndPeriod = cycleEndPeriod;
            return this;
        }

        /**
         * CycleQuota.
         */
        public Builder cycleQuota(java.util.List<CycleQuota> cycleQuota) {
            this.cycleQuota = cycleQuota;
            return this;
        }

        /**
         * CycleStartPeriod.
         */
        public Builder cycleStartPeriod(String cycleStartPeriod) {
            this.cycleStartPeriod = cycleStartPeriod;
            return this;
        }

        /**
         * CycleType.
         */
        public Builder cycleType(String cycleType) {
            this.cycleType = cycleType;
            return this;
        }

        /**
         * EcIdAccountIdsFilter.
         */
        public Builder ecIdAccountIdsFilter(EcIdAccountIdsFilter ecIdAccountIdsFilter) {
            this.ecIdAccountIdsFilter = ecIdAccountIdsFilter;
            return this;
        }

        /**
         * Metadata.
         */
        public Builder metadata(Object metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * Metric.
         */
        public Builder metric(String metric) {
            this.metric = metric;
            return this;
        }

        /**
         * QueryFilter.
         */
        public Builder queryFilter(java.util.List<QueryFilter> queryFilter) {
            this.queryFilter = queryFilter;
            return this;
        }

        /**
         * Quota.
         */
        public Builder quota(String quota) {
            this.quota = quota;
            return this;
        }

        /**
         * QuotaType.
         */
        public Builder quotaType(String quotaType) {
            this.quotaType = quotaType;
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
         * WarnConfs.
         */
        public Builder warnConfs(java.util.List<WarnConfs> warnConfs) {
            this.warnConfs = warnConfs;
            return this;
        }

        public DescribeBudgetResponseBody build() {
            return new DescribeBudgetResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeBudgetResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBudgetResponseBody</p>
     */
    public static class CycleQuota extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CyclePeriod")
        private String cyclePeriod;

        @com.aliyun.core.annotation.NameInMap("Quota")
        private String quota;

        private CycleQuota(Builder builder) {
            this.cyclePeriod = builder.cyclePeriod;
            this.quota = builder.quota;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CycleQuota create() {
            return builder().build();
        }

        /**
         * @return cyclePeriod
         */
        public String getCyclePeriod() {
            return this.cyclePeriod;
        }

        /**
         * @return quota
         */
        public String getQuota() {
            return this.quota;
        }

        public static final class Builder {
            private String cyclePeriod; 
            private String quota; 

            private Builder() {
            } 

            private Builder(CycleQuota model) {
                this.cyclePeriod = model.cyclePeriod;
                this.quota = model.quota;
            } 

            /**
             * CyclePeriod.
             */
            public Builder cyclePeriod(String cyclePeriod) {
                this.cyclePeriod = cyclePeriod;
                return this;
            }

            /**
             * Quota.
             */
            public Builder quota(String quota) {
                this.quota = quota;
                return this;
            }

            public CycleQuota build() {
                return new CycleQuota(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeBudgetResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBudgetResponseBody</p>
     */
    public static class EcIdAccountIdsFilter extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountIds")
        private java.util.List<Long> accountIds;

        @com.aliyun.core.annotation.NameInMap("EcId")
        private String ecId;

        private EcIdAccountIdsFilter(Builder builder) {
            this.accountIds = builder.accountIds;
            this.ecId = builder.ecId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EcIdAccountIdsFilter create() {
            return builder().build();
        }

        /**
         * @return accountIds
         */
        public java.util.List<Long> getAccountIds() {
            return this.accountIds;
        }

        /**
         * @return ecId
         */
        public String getEcId() {
            return this.ecId;
        }

        public static final class Builder {
            private java.util.List<Long> accountIds; 
            private String ecId; 

            private Builder() {
            } 

            private Builder(EcIdAccountIdsFilter model) {
                this.accountIds = model.accountIds;
                this.ecId = model.ecId;
            } 

            /**
             * AccountIds.
             */
            public Builder accountIds(java.util.List<Long> accountIds) {
                this.accountIds = accountIds;
                return this;
            }

            /**
             * EcId.
             */
            public Builder ecId(String ecId) {
                this.ecId = ecId;
                return this;
            }

            public EcIdAccountIdsFilter build() {
                return new EcIdAccountIdsFilter(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeBudgetResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBudgetResponseBody</p>
     */
    public static class QueryFilter extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("SelectType")
        private String selectType;

        @com.aliyun.core.annotation.NameInMap("Values")
        private java.util.List<String> values;

        private QueryFilter(Builder builder) {
            this.code = builder.code;
            this.selectType = builder.selectType;
            this.values = builder.values;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QueryFilter create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return selectType
         */
        public String getSelectType() {
            return this.selectType;
        }

        /**
         * @return values
         */
        public java.util.List<String> getValues() {
            return this.values;
        }

        public static final class Builder {
            private String code; 
            private String selectType; 
            private java.util.List<String> values; 

            private Builder() {
            } 

            private Builder(QueryFilter model) {
                this.code = model.code;
                this.selectType = model.selectType;
                this.values = model.values;
            } 

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * SelectType.
             */
            public Builder selectType(String selectType) {
                this.selectType = selectType;
                return this;
            }

            /**
             * Values.
             */
            public Builder values(java.util.List<String> values) {
                this.values = values;
                return this;
            }

            public QueryFilter build() {
                return new QueryFilter(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeBudgetResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeBudgetResponseBody</p>
     */
    public static class WarnConfs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Comment")
        private String comment;

        @com.aliyun.core.annotation.NameInMap("EventBridge")
        private Boolean eventBridge;

        @com.aliyun.core.annotation.NameInMap("MscChannels")
        private java.util.List<String> mscChannels;

        @com.aliyun.core.annotation.NameInMap("MscContacts")
        private java.util.List<String> mscContacts;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Sequence")
        private Integer sequence;

        @com.aliyun.core.annotation.NameInMap("ThresholdType")
        private String thresholdType;

        @com.aliyun.core.annotation.NameInMap("ThresholdValue")
        private String thresholdValue;

        @com.aliyun.core.annotation.NameInMap("WarnTarget")
        private String warnTarget;

        private WarnConfs(Builder builder) {
            this.comment = builder.comment;
            this.eventBridge = builder.eventBridge;
            this.mscChannels = builder.mscChannels;
            this.mscContacts = builder.mscContacts;
            this.name = builder.name;
            this.sequence = builder.sequence;
            this.thresholdType = builder.thresholdType;
            this.thresholdValue = builder.thresholdValue;
            this.warnTarget = builder.warnTarget;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WarnConfs create() {
            return builder().build();
        }

        /**
         * @return comment
         */
        public String getComment() {
            return this.comment;
        }

        /**
         * @return eventBridge
         */
        public Boolean getEventBridge() {
            return this.eventBridge;
        }

        /**
         * @return mscChannels
         */
        public java.util.List<String> getMscChannels() {
            return this.mscChannels;
        }

        /**
         * @return mscContacts
         */
        public java.util.List<String> getMscContacts() {
            return this.mscContacts;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return sequence
         */
        public Integer getSequence() {
            return this.sequence;
        }

        /**
         * @return thresholdType
         */
        public String getThresholdType() {
            return this.thresholdType;
        }

        /**
         * @return thresholdValue
         */
        public String getThresholdValue() {
            return this.thresholdValue;
        }

        /**
         * @return warnTarget
         */
        public String getWarnTarget() {
            return this.warnTarget;
        }

        public static final class Builder {
            private String comment; 
            private Boolean eventBridge; 
            private java.util.List<String> mscChannels; 
            private java.util.List<String> mscContacts; 
            private String name; 
            private Integer sequence; 
            private String thresholdType; 
            private String thresholdValue; 
            private String warnTarget; 

            private Builder() {
            } 

            private Builder(WarnConfs model) {
                this.comment = model.comment;
                this.eventBridge = model.eventBridge;
                this.mscChannels = model.mscChannels;
                this.mscContacts = model.mscContacts;
                this.name = model.name;
                this.sequence = model.sequence;
                this.thresholdType = model.thresholdType;
                this.thresholdValue = model.thresholdValue;
                this.warnTarget = model.warnTarget;
            } 

            /**
             * Comment.
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * EventBridge.
             */
            public Builder eventBridge(Boolean eventBridge) {
                this.eventBridge = eventBridge;
                return this;
            }

            /**
             * MscChannels.
             */
            public Builder mscChannels(java.util.List<String> mscChannels) {
                this.mscChannels = mscChannels;
                return this;
            }

            /**
             * MscContacts.
             */
            public Builder mscContacts(java.util.List<String> mscContacts) {
                this.mscContacts = mscContacts;
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
             * Sequence.
             */
            public Builder sequence(Integer sequence) {
                this.sequence = sequence;
                return this;
            }

            /**
             * ThresholdType.
             */
            public Builder thresholdType(String thresholdType) {
                this.thresholdType = thresholdType;
                return this;
            }

            /**
             * ThresholdValue.
             */
            public Builder thresholdValue(String thresholdValue) {
                this.thresholdValue = thresholdValue;
                return this;
            }

            /**
             * WarnTarget.
             */
            public Builder warnTarget(String warnTarget) {
                this.warnTarget = warnTarget;
                return this;
            }

            public WarnConfs build() {
                return new WarnConfs(this);
            } 

        } 

    }
}
