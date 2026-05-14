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
 * {@link CreateBudgetRequest} extends {@link RequestModel}
 *
 * <p>CreateBudgetRequest</p>
 */
public class CreateBudgetRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BudgetName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String budgetName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BudgetType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String budgetType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Comment")
    private String comment;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CycleEndPeriod")
    @com.aliyun.core.annotation.Validation(required = true)
    private String cycleEndPeriod;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CycleQuota")
    private java.util.List<CycleQuota> cycleQuota;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CycleStartPeriod")
    @com.aliyun.core.annotation.Validation(required = true)
    private String cycleStartPeriod;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CycleType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String cycleType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EcIdAccountIds")
    private java.util.List<EcIdAccountIds> ecIdAccountIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Metric")
    @com.aliyun.core.annotation.Validation(required = true)
    private String metric;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Nbid")
    private String nbid;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("QueryFilter")
    private java.util.List<QueryFilter> queryFilter;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Quota")
    private String quota;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("QuotaType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String quotaType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WarnConfs")
    private java.util.List<WarnConfs> warnConfs;

    private CreateBudgetRequest(Builder builder) {
        super(builder);
        this.budgetName = builder.budgetName;
        this.budgetType = builder.budgetType;
        this.comment = builder.comment;
        this.cycleEndPeriod = builder.cycleEndPeriod;
        this.cycleQuota = builder.cycleQuota;
        this.cycleStartPeriod = builder.cycleStartPeriod;
        this.cycleType = builder.cycleType;
        this.ecIdAccountIds = builder.ecIdAccountIds;
        this.metric = builder.metric;
        this.nbid = builder.nbid;
        this.queryFilter = builder.queryFilter;
        this.quota = builder.quota;
        this.quotaType = builder.quotaType;
        this.warnConfs = builder.warnConfs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateBudgetRequest create() {
        return builder().build();
    }

@Override
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
     * @return ecIdAccountIds
     */
    public java.util.List<EcIdAccountIds> getEcIdAccountIds() {
        return this.ecIdAccountIds;
    }

    /**
     * @return metric
     */
    public String getMetric() {
        return this.metric;
    }

    /**
     * @return nbid
     */
    public String getNbid() {
        return this.nbid;
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
     * @return warnConfs
     */
    public java.util.List<WarnConfs> getWarnConfs() {
        return this.warnConfs;
    }

    public static final class Builder extends Request.Builder<CreateBudgetRequest, Builder> {
        private String budgetName; 
        private String budgetType; 
        private String comment; 
        private String cycleEndPeriod; 
        private java.util.List<CycleQuota> cycleQuota; 
        private String cycleStartPeriod; 
        private String cycleType; 
        private java.util.List<EcIdAccountIds> ecIdAccountIds; 
        private String metric; 
        private String nbid; 
        private java.util.List<QueryFilter> queryFilter; 
        private String quota; 
        private String quotaType; 
        private java.util.List<WarnConfs> warnConfs; 

        private Builder() {
            super();
        } 

        private Builder(CreateBudgetRequest request) {
            super(request);
            this.budgetName = request.budgetName;
            this.budgetType = request.budgetType;
            this.comment = request.comment;
            this.cycleEndPeriod = request.cycleEndPeriod;
            this.cycleQuota = request.cycleQuota;
            this.cycleStartPeriod = request.cycleStartPeriod;
            this.cycleType = request.cycleType;
            this.ecIdAccountIds = request.ecIdAccountIds;
            this.metric = request.metric;
            this.nbid = request.nbid;
            this.queryFilter = request.queryFilter;
            this.quota = request.quota;
            this.quotaType = request.quotaType;
            this.warnConfs = request.warnConfs;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Department_dev_budget</p>
         */
        public Builder budgetName(String budgetName) {
            this.putBodyParameter("BudgetName", budgetName);
            this.budgetName = budgetName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CONSUME</p>
         */
        public Builder budgetType(String budgetType) {
            this.putBodyParameter("BudgetType", budgetType);
            this.budgetType = budgetType;
            return this;
        }

        /**
         * Comment.
         */
        public Builder comment(String comment) {
            this.putBodyParameter("Comment", comment);
            this.comment = comment;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-12</p>
         */
        public Builder cycleEndPeriod(String cycleEndPeriod) {
            this.putBodyParameter("CycleEndPeriod", cycleEndPeriod);
            this.cycleEndPeriod = cycleEndPeriod;
            return this;
        }

        /**
         * CycleQuota.
         */
        public Builder cycleQuota(java.util.List<CycleQuota> cycleQuota) {
            String cycleQuotaShrink = shrink(cycleQuota, "CycleQuota", "json");
            this.putBodyParameter("CycleQuota", cycleQuotaShrink);
            this.cycleQuota = cycleQuota;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01</p>
         */
        public Builder cycleStartPeriod(String cycleStartPeriod) {
            this.putBodyParameter("CycleStartPeriod", cycleStartPeriod);
            this.cycleStartPeriod = cycleStartPeriod;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MONTHLY</p>
         */
        public Builder cycleType(String cycleType) {
            this.putBodyParameter("CycleType", cycleType);
            this.cycleType = cycleType;
            return this;
        }

        /**
         * EcIdAccountIds.
         */
        public Builder ecIdAccountIds(java.util.List<EcIdAccountIds> ecIdAccountIds) {
            String ecIdAccountIdsShrink = shrink(ecIdAccountIds, "EcIdAccountIds", "json");
            this.putQueryParameter("EcIdAccountIds", ecIdAccountIdsShrink);
            this.ecIdAccountIds = ecIdAccountIds;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>REQUIRE_AMOUNT</p>
         */
        public Builder metric(String metric) {
            this.putBodyParameter("Metric", metric);
            this.metric = metric;
            return this;
        }

        /**
         * Nbid.
         */
        public Builder nbid(String nbid) {
            this.putQueryParameter("Nbid", nbid);
            this.nbid = nbid;
            return this;
        }

        /**
         * QueryFilter.
         */
        public Builder queryFilter(java.util.List<QueryFilter> queryFilter) {
            String queryFilterShrink = shrink(queryFilter, "QueryFilter", "json");
            this.putBodyParameter("QueryFilter", queryFilterShrink);
            this.queryFilter = queryFilter;
            return this;
        }

        /**
         * Quota.
         */
        public Builder quota(String quota) {
            this.putBodyParameter("Quota", quota);
            this.quota = quota;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>FIXED</p>
         */
        public Builder quotaType(String quotaType) {
            this.putBodyParameter("QuotaType", quotaType);
            this.quotaType = quotaType;
            return this;
        }

        /**
         * WarnConfs.
         */
        public Builder warnConfs(java.util.List<WarnConfs> warnConfs) {
            String warnConfsShrink = shrink(warnConfs, "WarnConfs", "json");
            this.putBodyParameter("WarnConfs", warnConfsShrink);
            this.warnConfs = warnConfs;
            return this;
        }

        @Override
        public CreateBudgetRequest build() {
            return new CreateBudgetRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateBudgetRequest} extends {@link TeaModel}
     *
     * <p>CreateBudgetRequest</p>
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
     * {@link CreateBudgetRequest} extends {@link TeaModel}
     *
     * <p>CreateBudgetRequest</p>
     */
    public static class EcIdAccountIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountIds")
        private java.util.List<Long> accountIds;

        @com.aliyun.core.annotation.NameInMap("EcId")
        private String ecId;

        private EcIdAccountIds(Builder builder) {
            this.accountIds = builder.accountIds;
            this.ecId = builder.ecId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EcIdAccountIds create() {
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

            private Builder(EcIdAccountIds model) {
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

            public EcIdAccountIds build() {
                return new EcIdAccountIds(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateBudgetRequest} extends {@link TeaModel}
     *
     * <p>CreateBudgetRequest</p>
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
     * {@link CreateBudgetRequest} extends {@link TeaModel}
     *
     * <p>CreateBudgetRequest</p>
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
