// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

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
 * {@link DescribeCdnLinkageRulesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCdnLinkageRulesResponseBody</p>
 */
public class DescribeCdnLinkageRulesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SchedulerRules")
    private java.util.List<SchedulerRules> schedulerRules;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private String totalCount;

    private DescribeCdnLinkageRulesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.schedulerRules = builder.schedulerRules;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCdnLinkageRulesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return schedulerRules
     */
    public java.util.List<SchedulerRules> getSchedulerRules() {
        return this.schedulerRules;
    }

    /**
     * @return totalCount
     */
    public String getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<SchedulerRules> schedulerRules; 
        private String totalCount; 

        private Builder() {
        } 

        private Builder(DescribeCdnLinkageRulesResponseBody model) {
            this.requestId = model.requestId;
            this.schedulerRules = model.schedulerRules;
            this.totalCount = model.totalCount;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SchedulerRules.
         */
        public Builder schedulerRules(java.util.List<SchedulerRules> schedulerRules) {
            this.schedulerRules = schedulerRules;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeCdnLinkageRulesResponseBody build() {
            return new DescribeCdnLinkageRulesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCdnLinkageRulesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCdnLinkageRulesResponseBody</p>
     */
    public static class ParamData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessQps")
        private Long accessQps;

        @com.aliyun.core.annotation.NameInMap("UpstreamQps")
        private Long upstreamQps;

        private ParamData(Builder builder) {
            this.accessQps = builder.accessQps;
            this.upstreamQps = builder.upstreamQps;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ParamData create() {
            return builder().build();
        }

        /**
         * @return accessQps
         */
        public Long getAccessQps() {
            return this.accessQps;
        }

        /**
         * @return upstreamQps
         */
        public Long getUpstreamQps() {
            return this.upstreamQps;
        }

        public static final class Builder {
            private Long accessQps; 
            private Long upstreamQps; 

            private Builder() {
            } 

            private Builder(ParamData model) {
                this.accessQps = model.accessQps;
                this.upstreamQps = model.upstreamQps;
            } 

            /**
             * AccessQps.
             */
            public Builder accessQps(Long accessQps) {
                this.accessQps = accessQps;
                return this;
            }

            /**
             * UpstreamQps.
             */
            public Builder upstreamQps(Long upstreamQps) {
                this.upstreamQps = upstreamQps;
                return this;
            }

            public ParamData build() {
                return new ParamData(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCdnLinkageRulesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCdnLinkageRulesResponseBody</p>
     */
    public static class Param extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ParamData")
        private ParamData paramData;

        @com.aliyun.core.annotation.NameInMap("ParamType")
        private String paramType;

        private Param(Builder builder) {
            this.paramData = builder.paramData;
            this.paramType = builder.paramType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Param create() {
            return builder().build();
        }

        /**
         * @return paramData
         */
        public ParamData getParamData() {
            return this.paramData;
        }

        /**
         * @return paramType
         */
        public String getParamType() {
            return this.paramType;
        }

        public static final class Builder {
            private ParamData paramData; 
            private String paramType; 

            private Builder() {
            } 

            private Builder(Param model) {
                this.paramData = model.paramData;
                this.paramType = model.paramType;
            } 

            /**
             * ParamData.
             */
            public Builder paramData(ParamData paramData) {
                this.paramData = paramData;
                return this;
            }

            /**
             * ParamType.
             */
            public Builder paramType(String paramType) {
                this.paramType = paramType;
                return this;
            }

            public Param build() {
                return new Param(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCdnLinkageRulesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCdnLinkageRulesResponseBody</p>
     */
    public static class Rules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Priority")
        private Integer priority;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        @com.aliyun.core.annotation.NameInMap("ValueType")
        private Integer valueType;

        private Rules(Builder builder) {
            this.priority = builder.priority;
            this.regionId = builder.regionId;
            this.status = builder.status;
            this.type = builder.type;
            this.value = builder.value;
            this.valueType = builder.valueType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Rules create() {
            return builder().build();
        }

        /**
         * @return priority
         */
        public Integer getPriority() {
            return this.priority;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        /**
         * @return valueType
         */
        public Integer getValueType() {
            return this.valueType;
        }

        public static final class Builder {
            private Integer priority; 
            private String regionId; 
            private Integer status; 
            private String type; 
            private String value; 
            private Integer valueType; 

            private Builder() {
            } 

            private Builder(Rules model) {
                this.priority = model.priority;
                this.regionId = model.regionId;
                this.status = model.status;
                this.type = model.type;
                this.value = model.value;
                this.valueType = model.valueType;
            } 

            /**
             * Priority.
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            /**
             * ValueType.
             */
            public Builder valueType(Integer valueType) {
                this.valueType = valueType;
                return this;
            }

            public Rules build() {
                return new Rules(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCdnLinkageRulesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCdnLinkageRulesResponseBody</p>
     */
    public static class CdnLinkageRule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cname")
        private String cname;

        @com.aliyun.core.annotation.NameInMap("Param")
        private Param param;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("Rules")
        private java.util.List<Rules> rules;

        private CdnLinkageRule(Builder builder) {
            this.cname = builder.cname;
            this.param = builder.param;
            this.ruleName = builder.ruleName;
            this.rules = builder.rules;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CdnLinkageRule create() {
            return builder().build();
        }

        /**
         * @return cname
         */
        public String getCname() {
            return this.cname;
        }

        /**
         * @return param
         */
        public Param getParam() {
            return this.param;
        }

        /**
         * @return ruleName
         */
        public String getRuleName() {
            return this.ruleName;
        }

        /**
         * @return rules
         */
        public java.util.List<Rules> getRules() {
            return this.rules;
        }

        public static final class Builder {
            private String cname; 
            private Param param; 
            private String ruleName; 
            private java.util.List<Rules> rules; 

            private Builder() {
            } 

            private Builder(CdnLinkageRule model) {
                this.cname = model.cname;
                this.param = model.param;
                this.ruleName = model.ruleName;
                this.rules = model.rules;
            } 

            /**
             * Cname.
             */
            public Builder cname(String cname) {
                this.cname = cname;
                return this;
            }

            /**
             * Param.
             */
            public Builder param(Param param) {
                this.param = param;
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
             * Rules.
             */
            public Builder rules(java.util.List<Rules> rules) {
                this.rules = rules;
                return this;
            }

            public CdnLinkageRule build() {
                return new CdnLinkageRule(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCdnLinkageRulesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCdnLinkageRulesResponseBody</p>
     */
    public static class SchedulerRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CdnLinkageEnable")
        private Integer cdnLinkageEnable;

        @com.aliyun.core.annotation.NameInMap("CdnLinkageRule")
        private CdnLinkageRule cdnLinkageRule;

        @com.aliyun.core.annotation.NameInMap("Domain")
        private String domain;

        private SchedulerRules(Builder builder) {
            this.cdnLinkageEnable = builder.cdnLinkageEnable;
            this.cdnLinkageRule = builder.cdnLinkageRule;
            this.domain = builder.domain;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SchedulerRules create() {
            return builder().build();
        }

        /**
         * @return cdnLinkageEnable
         */
        public Integer getCdnLinkageEnable() {
            return this.cdnLinkageEnable;
        }

        /**
         * @return cdnLinkageRule
         */
        public CdnLinkageRule getCdnLinkageRule() {
            return this.cdnLinkageRule;
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        public static final class Builder {
            private Integer cdnLinkageEnable; 
            private CdnLinkageRule cdnLinkageRule; 
            private String domain; 

            private Builder() {
            } 

            private Builder(SchedulerRules model) {
                this.cdnLinkageEnable = model.cdnLinkageEnable;
                this.cdnLinkageRule = model.cdnLinkageRule;
                this.domain = model.domain;
            } 

            /**
             * CdnLinkageEnable.
             */
            public Builder cdnLinkageEnable(Integer cdnLinkageEnable) {
                this.cdnLinkageEnable = cdnLinkageEnable;
                return this;
            }

            /**
             * CdnLinkageRule.
             */
            public Builder cdnLinkageRule(CdnLinkageRule cdnLinkageRule) {
                this.cdnLinkageRule = cdnLinkageRule;
                return this;
            }

            /**
             * Domain.
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            public SchedulerRules build() {
                return new SchedulerRules(this);
            } 

        } 

    }
}
