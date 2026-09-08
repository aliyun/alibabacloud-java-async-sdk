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
 * {@link ListTotalSensitiveInfoResponseBody} extends {@link TeaModel}
 *
 * <p>ListTotalSensitiveInfoResponseBody</p>
 */
public class ListTotalSensitiveInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataCountDOList")
    private java.util.List<DataCountDOList> dataCountDOList;

    @com.aliyun.core.annotation.NameInMap("DbCount")
    private Long dbCount;

    @com.aliyun.core.annotation.NameInMap("InstanceCount")
    private Long instanceCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RuleInfoList")
    private java.util.List<RuleInfoList> ruleInfoList;

    @com.aliyun.core.annotation.NameInMap("S0Count")
    private Long s0Count;

    @com.aliyun.core.annotation.NameInMap("S10Count")
    private Long s10Count;

    @com.aliyun.core.annotation.NameInMap("S1Count")
    private Long s1Count;

    @com.aliyun.core.annotation.NameInMap("S2Count")
    private Long s2Count;

    @com.aliyun.core.annotation.NameInMap("S3Count")
    private Long s3Count;

    @com.aliyun.core.annotation.NameInMap("S4Count")
    private Long s4Count;

    @com.aliyun.core.annotation.NameInMap("S5Count")
    private Long s5Count;

    @com.aliyun.core.annotation.NameInMap("S6Count")
    private Long s6Count;

    @com.aliyun.core.annotation.NameInMap("S7Count")
    private Long s7Count;

    @com.aliyun.core.annotation.NameInMap("S8Count")
    private Long s8Count;

    @com.aliyun.core.annotation.NameInMap("S9Count")
    private Long s9Count;

    @com.aliyun.core.annotation.NameInMap("SensitiveCount")
    private Long sensitiveCount;

    @com.aliyun.core.annotation.NameInMap("SensitiveDbCount")
    private Long sensitiveDbCount;

    @com.aliyun.core.annotation.NameInMap("SensitiveInstanceCount")
    private Long sensitiveInstanceCount;

    @com.aliyun.core.annotation.NameInMap("SensitiveUnStructSize")
    private Long sensitiveUnStructSize;

    @com.aliyun.core.annotation.NameInMap("SubSensitiveCount")
    private Long subSensitiveCount;

    @com.aliyun.core.annotation.NameInMap("SubTotalCount")
    private Long subTotalCount;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    @com.aliyun.core.annotation.NameInMap("UnStructSize")
    private Long unStructSize;

    private ListTotalSensitiveInfoResponseBody(Builder builder) {
        this.dataCountDOList = builder.dataCountDOList;
        this.dbCount = builder.dbCount;
        this.instanceCount = builder.instanceCount;
        this.requestId = builder.requestId;
        this.ruleInfoList = builder.ruleInfoList;
        this.s0Count = builder.s0Count;
        this.s10Count = builder.s10Count;
        this.s1Count = builder.s1Count;
        this.s2Count = builder.s2Count;
        this.s3Count = builder.s3Count;
        this.s4Count = builder.s4Count;
        this.s5Count = builder.s5Count;
        this.s6Count = builder.s6Count;
        this.s7Count = builder.s7Count;
        this.s8Count = builder.s8Count;
        this.s9Count = builder.s9Count;
        this.sensitiveCount = builder.sensitiveCount;
        this.sensitiveDbCount = builder.sensitiveDbCount;
        this.sensitiveInstanceCount = builder.sensitiveInstanceCount;
        this.sensitiveUnStructSize = builder.sensitiveUnStructSize;
        this.subSensitiveCount = builder.subSensitiveCount;
        this.subTotalCount = builder.subTotalCount;
        this.totalCount = builder.totalCount;
        this.unStructSize = builder.unStructSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTotalSensitiveInfoResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataCountDOList
     */
    public java.util.List<DataCountDOList> getDataCountDOList() {
        return this.dataCountDOList;
    }

    /**
     * @return dbCount
     */
    public Long getDbCount() {
        return this.dbCount;
    }

    /**
     * @return instanceCount
     */
    public Long getInstanceCount() {
        return this.instanceCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return ruleInfoList
     */
    public java.util.List<RuleInfoList> getRuleInfoList() {
        return this.ruleInfoList;
    }

    /**
     * @return s0Count
     */
    public Long getS0Count() {
        return this.s0Count;
    }

    /**
     * @return s10Count
     */
    public Long getS10Count() {
        return this.s10Count;
    }

    /**
     * @return s1Count
     */
    public Long getS1Count() {
        return this.s1Count;
    }

    /**
     * @return s2Count
     */
    public Long getS2Count() {
        return this.s2Count;
    }

    /**
     * @return s3Count
     */
    public Long getS3Count() {
        return this.s3Count;
    }

    /**
     * @return s4Count
     */
    public Long getS4Count() {
        return this.s4Count;
    }

    /**
     * @return s5Count
     */
    public Long getS5Count() {
        return this.s5Count;
    }

    /**
     * @return s6Count
     */
    public Long getS6Count() {
        return this.s6Count;
    }

    /**
     * @return s7Count
     */
    public Long getS7Count() {
        return this.s7Count;
    }

    /**
     * @return s8Count
     */
    public Long getS8Count() {
        return this.s8Count;
    }

    /**
     * @return s9Count
     */
    public Long getS9Count() {
        return this.s9Count;
    }

    /**
     * @return sensitiveCount
     */
    public Long getSensitiveCount() {
        return this.sensitiveCount;
    }

    /**
     * @return sensitiveDbCount
     */
    public Long getSensitiveDbCount() {
        return this.sensitiveDbCount;
    }

    /**
     * @return sensitiveInstanceCount
     */
    public Long getSensitiveInstanceCount() {
        return this.sensitiveInstanceCount;
    }

    /**
     * @return sensitiveUnStructSize
     */
    public Long getSensitiveUnStructSize() {
        return this.sensitiveUnStructSize;
    }

    /**
     * @return subSensitiveCount
     */
    public Long getSubSensitiveCount() {
        return this.subSensitiveCount;
    }

    /**
     * @return subTotalCount
     */
    public Long getSubTotalCount() {
        return this.subTotalCount;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return unStructSize
     */
    public Long getUnStructSize() {
        return this.unStructSize;
    }

    public static final class Builder {
        private java.util.List<DataCountDOList> dataCountDOList; 
        private Long dbCount; 
        private Long instanceCount; 
        private String requestId; 
        private java.util.List<RuleInfoList> ruleInfoList; 
        private Long s0Count; 
        private Long s10Count; 
        private Long s1Count; 
        private Long s2Count; 
        private Long s3Count; 
        private Long s4Count; 
        private Long s5Count; 
        private Long s6Count; 
        private Long s7Count; 
        private Long s8Count; 
        private Long s9Count; 
        private Long sensitiveCount; 
        private Long sensitiveDbCount; 
        private Long sensitiveInstanceCount; 
        private Long sensitiveUnStructSize; 
        private Long subSensitiveCount; 
        private Long subTotalCount; 
        private Long totalCount; 
        private Long unStructSize; 

        private Builder() {
        } 

        private Builder(ListTotalSensitiveInfoResponseBody model) {
            this.dataCountDOList = model.dataCountDOList;
            this.dbCount = model.dbCount;
            this.instanceCount = model.instanceCount;
            this.requestId = model.requestId;
            this.ruleInfoList = model.ruleInfoList;
            this.s0Count = model.s0Count;
            this.s10Count = model.s10Count;
            this.s1Count = model.s1Count;
            this.s2Count = model.s2Count;
            this.s3Count = model.s3Count;
            this.s4Count = model.s4Count;
            this.s5Count = model.s5Count;
            this.s6Count = model.s6Count;
            this.s7Count = model.s7Count;
            this.s8Count = model.s8Count;
            this.s9Count = model.s9Count;
            this.sensitiveCount = model.sensitiveCount;
            this.sensitiveDbCount = model.sensitiveDbCount;
            this.sensitiveInstanceCount = model.sensitiveInstanceCount;
            this.sensitiveUnStructSize = model.sensitiveUnStructSize;
            this.subSensitiveCount = model.subSensitiveCount;
            this.subTotalCount = model.subTotalCount;
            this.totalCount = model.totalCount;
            this.unStructSize = model.unStructSize;
        } 

        /**
         * DataCountDOList.
         */
        public Builder dataCountDOList(java.util.List<DataCountDOList> dataCountDOList) {
            this.dataCountDOList = dataCountDOList;
            return this;
        }

        /**
         * DbCount.
         */
        public Builder dbCount(Long dbCount) {
            this.dbCount = dbCount;
            return this;
        }

        /**
         * InstanceCount.
         */
        public Builder instanceCount(Long instanceCount) {
            this.instanceCount = instanceCount;
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
         * RuleInfoList.
         */
        public Builder ruleInfoList(java.util.List<RuleInfoList> ruleInfoList) {
            this.ruleInfoList = ruleInfoList;
            return this;
        }

        /**
         * S0Count.
         */
        public Builder s0Count(Long s0Count) {
            this.s0Count = s0Count;
            return this;
        }

        /**
         * S10Count.
         */
        public Builder s10Count(Long s10Count) {
            this.s10Count = s10Count;
            return this;
        }

        /**
         * S1Count.
         */
        public Builder s1Count(Long s1Count) {
            this.s1Count = s1Count;
            return this;
        }

        /**
         * S2Count.
         */
        public Builder s2Count(Long s2Count) {
            this.s2Count = s2Count;
            return this;
        }

        /**
         * S3Count.
         */
        public Builder s3Count(Long s3Count) {
            this.s3Count = s3Count;
            return this;
        }

        /**
         * S4Count.
         */
        public Builder s4Count(Long s4Count) {
            this.s4Count = s4Count;
            return this;
        }

        /**
         * S5Count.
         */
        public Builder s5Count(Long s5Count) {
            this.s5Count = s5Count;
            return this;
        }

        /**
         * S6Count.
         */
        public Builder s6Count(Long s6Count) {
            this.s6Count = s6Count;
            return this;
        }

        /**
         * S7Count.
         */
        public Builder s7Count(Long s7Count) {
            this.s7Count = s7Count;
            return this;
        }

        /**
         * S8Count.
         */
        public Builder s8Count(Long s8Count) {
            this.s8Count = s8Count;
            return this;
        }

        /**
         * S9Count.
         */
        public Builder s9Count(Long s9Count) {
            this.s9Count = s9Count;
            return this;
        }

        /**
         * SensitiveCount.
         */
        public Builder sensitiveCount(Long sensitiveCount) {
            this.sensitiveCount = sensitiveCount;
            return this;
        }

        /**
         * SensitiveDbCount.
         */
        public Builder sensitiveDbCount(Long sensitiveDbCount) {
            this.sensitiveDbCount = sensitiveDbCount;
            return this;
        }

        /**
         * SensitiveInstanceCount.
         */
        public Builder sensitiveInstanceCount(Long sensitiveInstanceCount) {
            this.sensitiveInstanceCount = sensitiveInstanceCount;
            return this;
        }

        /**
         * SensitiveUnStructSize.
         */
        public Builder sensitiveUnStructSize(Long sensitiveUnStructSize) {
            this.sensitiveUnStructSize = sensitiveUnStructSize;
            return this;
        }

        /**
         * SubSensitiveCount.
         */
        public Builder subSensitiveCount(Long subSensitiveCount) {
            this.subSensitiveCount = subSensitiveCount;
            return this;
        }

        /**
         * SubTotalCount.
         */
        public Builder subTotalCount(Long subTotalCount) {
            this.subTotalCount = subTotalCount;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * UnStructSize.
         */
        public Builder unStructSize(Long unStructSize) {
            this.unStructSize = unStructSize;
            return this;
        }

        public ListTotalSensitiveInfoResponseBody build() {
            return new ListTotalSensitiveInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListTotalSensitiveInfoResponseBody} extends {@link TeaModel}
     *
     * <p>ListTotalSensitiveInfoResponseBody</p>
     */
    public static class DataCountDOListDataCountDOList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Date")
        private Long date;

        @com.aliyun.core.annotation.NameInMap("SensitiveCount")
        private Long sensitiveCount;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Long totalCount;

        private DataCountDOListDataCountDOList(Builder builder) {
            this.date = builder.date;
            this.sensitiveCount = builder.sensitiveCount;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataCountDOListDataCountDOList create() {
            return builder().build();
        }

        /**
         * @return date
         */
        public Long getDate() {
            return this.date;
        }

        /**
         * @return sensitiveCount
         */
        public Long getSensitiveCount() {
            return this.sensitiveCount;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Long date; 
            private Long sensitiveCount; 
            private Long totalCount; 

            private Builder() {
            } 

            private Builder(DataCountDOListDataCountDOList model) {
                this.date = model.date;
                this.sensitiveCount = model.sensitiveCount;
                this.totalCount = model.totalCount;
            } 

            /**
             * Date.
             */
            public Builder date(Long date) {
                this.date = date;
                return this;
            }

            /**
             * SensitiveCount.
             */
            public Builder sensitiveCount(Long sensitiveCount) {
                this.sensitiveCount = sensitiveCount;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public DataCountDOListDataCountDOList build() {
                return new DataCountDOListDataCountDOList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListTotalSensitiveInfoResponseBody} extends {@link TeaModel}
     *
     * <p>ListTotalSensitiveInfoResponseBody</p>
     */
    public static class DataCountDOListRuleInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RuleCount")
        private Long ruleCount;

        @com.aliyun.core.annotation.NameInMap("RuleId")
        private Long ruleId;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        private DataCountDOListRuleInfoList(Builder builder) {
            this.ruleCount = builder.ruleCount;
            this.ruleId = builder.ruleId;
            this.ruleName = builder.ruleName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataCountDOListRuleInfoList create() {
            return builder().build();
        }

        /**
         * @return ruleCount
         */
        public Long getRuleCount() {
            return this.ruleCount;
        }

        /**
         * @return ruleId
         */
        public Long getRuleId() {
            return this.ruleId;
        }

        /**
         * @return ruleName
         */
        public String getRuleName() {
            return this.ruleName;
        }

        public static final class Builder {
            private Long ruleCount; 
            private Long ruleId; 
            private String ruleName; 

            private Builder() {
            } 

            private Builder(DataCountDOListRuleInfoList model) {
                this.ruleCount = model.ruleCount;
                this.ruleId = model.ruleId;
                this.ruleName = model.ruleName;
            } 

            /**
             * RuleCount.
             */
            public Builder ruleCount(Long ruleCount) {
                this.ruleCount = ruleCount;
                return this;
            }

            /**
             * RuleId.
             */
            public Builder ruleId(Long ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * RuleName.
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            public DataCountDOListRuleInfoList build() {
                return new DataCountDOListRuleInfoList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListTotalSensitiveInfoResponseBody} extends {@link TeaModel}
     *
     * <p>ListTotalSensitiveInfoResponseBody</p>
     */
    public static class DataCountDOList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataCountDOList")
        private java.util.List<DataCountDOListDataCountDOList> dataCountDOList;

        @com.aliyun.core.annotation.NameInMap("Date")
        private Long date;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("RuleInfoList")
        private java.util.List<DataCountDOListRuleInfoList> ruleInfoList;

        @com.aliyun.core.annotation.NameInMap("S0Count")
        private Long s0Count;

        @com.aliyun.core.annotation.NameInMap("S10Count")
        private Long s10Count;

        @com.aliyun.core.annotation.NameInMap("S1Count")
        private Long s1Count;

        @com.aliyun.core.annotation.NameInMap("S2Count")
        private Long s2Count;

        @com.aliyun.core.annotation.NameInMap("S3Count")
        private Long s3Count;

        @com.aliyun.core.annotation.NameInMap("S4Count")
        private Long s4Count;

        @com.aliyun.core.annotation.NameInMap("S5Count")
        private Long s5Count;

        @com.aliyun.core.annotation.NameInMap("S6Count")
        private Long s6Count;

        @com.aliyun.core.annotation.NameInMap("S7Count")
        private Long s7Count;

        @com.aliyun.core.annotation.NameInMap("S8Count")
        private Long s8Count;

        @com.aliyun.core.annotation.NameInMap("S9Count")
        private Long s9Count;

        @com.aliyun.core.annotation.NameInMap("SensitiveCount")
        private Long sensitiveCount;

        @com.aliyun.core.annotation.NameInMap("StructFlag")
        private Integer structFlag;

        @com.aliyun.core.annotation.NameInMap("TemplateId")
        private Long templateId;

        @com.aliyun.core.annotation.NameInMap("TemplateName")
        private String templateName;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Long totalCount;

        private DataCountDOList(Builder builder) {
            this.dataCountDOList = builder.dataCountDOList;
            this.date = builder.date;
            this.regionId = builder.regionId;
            this.ruleInfoList = builder.ruleInfoList;
            this.s0Count = builder.s0Count;
            this.s10Count = builder.s10Count;
            this.s1Count = builder.s1Count;
            this.s2Count = builder.s2Count;
            this.s3Count = builder.s3Count;
            this.s4Count = builder.s4Count;
            this.s5Count = builder.s5Count;
            this.s6Count = builder.s6Count;
            this.s7Count = builder.s7Count;
            this.s8Count = builder.s8Count;
            this.s9Count = builder.s9Count;
            this.sensitiveCount = builder.sensitiveCount;
            this.structFlag = builder.structFlag;
            this.templateId = builder.templateId;
            this.templateName = builder.templateName;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataCountDOList create() {
            return builder().build();
        }

        /**
         * @return dataCountDOList
         */
        public java.util.List<DataCountDOListDataCountDOList> getDataCountDOList() {
            return this.dataCountDOList;
        }

        /**
         * @return date
         */
        public Long getDate() {
            return this.date;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return ruleInfoList
         */
        public java.util.List<DataCountDOListRuleInfoList> getRuleInfoList() {
            return this.ruleInfoList;
        }

        /**
         * @return s0Count
         */
        public Long getS0Count() {
            return this.s0Count;
        }

        /**
         * @return s10Count
         */
        public Long getS10Count() {
            return this.s10Count;
        }

        /**
         * @return s1Count
         */
        public Long getS1Count() {
            return this.s1Count;
        }

        /**
         * @return s2Count
         */
        public Long getS2Count() {
            return this.s2Count;
        }

        /**
         * @return s3Count
         */
        public Long getS3Count() {
            return this.s3Count;
        }

        /**
         * @return s4Count
         */
        public Long getS4Count() {
            return this.s4Count;
        }

        /**
         * @return s5Count
         */
        public Long getS5Count() {
            return this.s5Count;
        }

        /**
         * @return s6Count
         */
        public Long getS6Count() {
            return this.s6Count;
        }

        /**
         * @return s7Count
         */
        public Long getS7Count() {
            return this.s7Count;
        }

        /**
         * @return s8Count
         */
        public Long getS8Count() {
            return this.s8Count;
        }

        /**
         * @return s9Count
         */
        public Long getS9Count() {
            return this.s9Count;
        }

        /**
         * @return sensitiveCount
         */
        public Long getSensitiveCount() {
            return this.sensitiveCount;
        }

        /**
         * @return structFlag
         */
        public Integer getStructFlag() {
            return this.structFlag;
        }

        /**
         * @return templateId
         */
        public Long getTemplateId() {
            return this.templateId;
        }

        /**
         * @return templateName
         */
        public String getTemplateName() {
            return this.templateName;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List<DataCountDOListDataCountDOList> dataCountDOList; 
            private Long date; 
            private String regionId; 
            private java.util.List<DataCountDOListRuleInfoList> ruleInfoList; 
            private Long s0Count; 
            private Long s10Count; 
            private Long s1Count; 
            private Long s2Count; 
            private Long s3Count; 
            private Long s4Count; 
            private Long s5Count; 
            private Long s6Count; 
            private Long s7Count; 
            private Long s8Count; 
            private Long s9Count; 
            private Long sensitiveCount; 
            private Integer structFlag; 
            private Long templateId; 
            private String templateName; 
            private Long totalCount; 

            private Builder() {
            } 

            private Builder(DataCountDOList model) {
                this.dataCountDOList = model.dataCountDOList;
                this.date = model.date;
                this.regionId = model.regionId;
                this.ruleInfoList = model.ruleInfoList;
                this.s0Count = model.s0Count;
                this.s10Count = model.s10Count;
                this.s1Count = model.s1Count;
                this.s2Count = model.s2Count;
                this.s3Count = model.s3Count;
                this.s4Count = model.s4Count;
                this.s5Count = model.s5Count;
                this.s6Count = model.s6Count;
                this.s7Count = model.s7Count;
                this.s8Count = model.s8Count;
                this.s9Count = model.s9Count;
                this.sensitiveCount = model.sensitiveCount;
                this.structFlag = model.structFlag;
                this.templateId = model.templateId;
                this.templateName = model.templateName;
                this.totalCount = model.totalCount;
            } 

            /**
             * DataCountDOList.
             */
            public Builder dataCountDOList(java.util.List<DataCountDOListDataCountDOList> dataCountDOList) {
                this.dataCountDOList = dataCountDOList;
                return this;
            }

            /**
             * Date.
             */
            public Builder date(Long date) {
                this.date = date;
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
             * RuleInfoList.
             */
            public Builder ruleInfoList(java.util.List<DataCountDOListRuleInfoList> ruleInfoList) {
                this.ruleInfoList = ruleInfoList;
                return this;
            }

            /**
             * S0Count.
             */
            public Builder s0Count(Long s0Count) {
                this.s0Count = s0Count;
                return this;
            }

            /**
             * S10Count.
             */
            public Builder s10Count(Long s10Count) {
                this.s10Count = s10Count;
                return this;
            }

            /**
             * S1Count.
             */
            public Builder s1Count(Long s1Count) {
                this.s1Count = s1Count;
                return this;
            }

            /**
             * S2Count.
             */
            public Builder s2Count(Long s2Count) {
                this.s2Count = s2Count;
                return this;
            }

            /**
             * S3Count.
             */
            public Builder s3Count(Long s3Count) {
                this.s3Count = s3Count;
                return this;
            }

            /**
             * S4Count.
             */
            public Builder s4Count(Long s4Count) {
                this.s4Count = s4Count;
                return this;
            }

            /**
             * S5Count.
             */
            public Builder s5Count(Long s5Count) {
                this.s5Count = s5Count;
                return this;
            }

            /**
             * S6Count.
             */
            public Builder s6Count(Long s6Count) {
                this.s6Count = s6Count;
                return this;
            }

            /**
             * S7Count.
             */
            public Builder s7Count(Long s7Count) {
                this.s7Count = s7Count;
                return this;
            }

            /**
             * S8Count.
             */
            public Builder s8Count(Long s8Count) {
                this.s8Count = s8Count;
                return this;
            }

            /**
             * S9Count.
             */
            public Builder s9Count(Long s9Count) {
                this.s9Count = s9Count;
                return this;
            }

            /**
             * SensitiveCount.
             */
            public Builder sensitiveCount(Long sensitiveCount) {
                this.sensitiveCount = sensitiveCount;
                return this;
            }

            /**
             * StructFlag.
             */
            public Builder structFlag(Integer structFlag) {
                this.structFlag = structFlag;
                return this;
            }

            /**
             * TemplateId.
             */
            public Builder templateId(Long templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * TemplateName.
             */
            public Builder templateName(String templateName) {
                this.templateName = templateName;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public DataCountDOList build() {
                return new DataCountDOList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListTotalSensitiveInfoResponseBody} extends {@link TeaModel}
     *
     * <p>ListTotalSensitiveInfoResponseBody</p>
     */
    public static class RuleInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RuleCount")
        private Long ruleCount;

        @com.aliyun.core.annotation.NameInMap("RuleId")
        private Integer ruleId;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        private RuleInfoList(Builder builder) {
            this.ruleCount = builder.ruleCount;
            this.ruleId = builder.ruleId;
            this.ruleName = builder.ruleName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RuleInfoList create() {
            return builder().build();
        }

        /**
         * @return ruleCount
         */
        public Long getRuleCount() {
            return this.ruleCount;
        }

        /**
         * @return ruleId
         */
        public Integer getRuleId() {
            return this.ruleId;
        }

        /**
         * @return ruleName
         */
        public String getRuleName() {
            return this.ruleName;
        }

        public static final class Builder {
            private Long ruleCount; 
            private Integer ruleId; 
            private String ruleName; 

            private Builder() {
            } 

            private Builder(RuleInfoList model) {
                this.ruleCount = model.ruleCount;
                this.ruleId = model.ruleId;
                this.ruleName = model.ruleName;
            } 

            /**
             * RuleCount.
             */
            public Builder ruleCount(Long ruleCount) {
                this.ruleCount = ruleCount;
                return this;
            }

            /**
             * RuleId.
             */
            public Builder ruleId(Integer ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * RuleName.
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            public RuleInfoList build() {
                return new RuleInfoList(this);
            } 

        } 

    }
}
