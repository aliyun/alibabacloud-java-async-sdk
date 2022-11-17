// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSQLPlansResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSQLPlansResponseBody</p>
 */
public class DescribeSQLPlansResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SQLPlans")
    private java.util.List < SQLPlans> SQLPlans;

    private DescribeSQLPlansResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.SQLPlans = builder.SQLPlans;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSQLPlansResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return SQLPlans
     */
    public java.util.List < SQLPlans> getSQLPlans() {
        return this.SQLPlans;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < SQLPlans> SQLPlans; 

        /**
         * 请求ID
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 执行计划信息
         */
        public Builder SQLPlans(java.util.List < SQLPlans> SQLPlans) {
            this.SQLPlans = SQLPlans;
            return this;
        }

        public DescribeSQLPlansResponseBody build() {
            return new DescribeSQLPlansResponseBody(this);
        } 

    } 

    public static class SQLPlans extends TeaModel {
        @NameInMap("AvgExecutionMS")
        private Float avgExecutionMS;

        @NameInMap("AvgExecutionTimeMS")
        private Long avgExecutionTimeMS;

        @NameInMap("FirstLoadTime")
        private Long firstLoadTime;

        @NameInMap("FirstLoadTimeUTCString")
        private String firstLoadTimeUTCString;

        @NameInMap("HitCount")
        private Integer hitCount;

        @NameInMap("MergedVersion")
        private Integer mergedVersion;

        @NameInMap("NodeIp")
        private String nodeIp;

        @NameInMap("OutlineData")
        private String outlineData;

        @NameInMap("OutlineId")
        private Long outlineId;

        @NameInMap("OutlineTime")
        private Long outlineTime;

        @NameInMap("OutlineTimeUTCString")
        private String outlineTimeUTCString;

        @NameInMap("PlanFull")
        private String planFull;

        @NameInMap("PlanId")
        private Integer planId;

        @NameInMap("PlanInfo")
        private String planInfo;

        @NameInMap("PlanUnionHash")
        private String planUnionHash;

        @NameInMap("QuerySQL")
        private String querySQL;

        private SQLPlans(Builder builder) {
            this.avgExecutionMS = builder.avgExecutionMS;
            this.avgExecutionTimeMS = builder.avgExecutionTimeMS;
            this.firstLoadTime = builder.firstLoadTime;
            this.firstLoadTimeUTCString = builder.firstLoadTimeUTCString;
            this.hitCount = builder.hitCount;
            this.mergedVersion = builder.mergedVersion;
            this.nodeIp = builder.nodeIp;
            this.outlineData = builder.outlineData;
            this.outlineId = builder.outlineId;
            this.outlineTime = builder.outlineTime;
            this.outlineTimeUTCString = builder.outlineTimeUTCString;
            this.planFull = builder.planFull;
            this.planId = builder.planId;
            this.planInfo = builder.planInfo;
            this.planUnionHash = builder.planUnionHash;
            this.querySQL = builder.querySQL;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SQLPlans create() {
            return builder().build();
        }

        /**
         * @return avgExecutionMS
         */
        public Float getAvgExecutionMS() {
            return this.avgExecutionMS;
        }

        /**
         * @return avgExecutionTimeMS
         */
        public Long getAvgExecutionTimeMS() {
            return this.avgExecutionTimeMS;
        }

        /**
         * @return firstLoadTime
         */
        public Long getFirstLoadTime() {
            return this.firstLoadTime;
        }

        /**
         * @return firstLoadTimeUTCString
         */
        public String getFirstLoadTimeUTCString() {
            return this.firstLoadTimeUTCString;
        }

        /**
         * @return hitCount
         */
        public Integer getHitCount() {
            return this.hitCount;
        }

        /**
         * @return mergedVersion
         */
        public Integer getMergedVersion() {
            return this.mergedVersion;
        }

        /**
         * @return nodeIp
         */
        public String getNodeIp() {
            return this.nodeIp;
        }

        /**
         * @return outlineData
         */
        public String getOutlineData() {
            return this.outlineData;
        }

        /**
         * @return outlineId
         */
        public Long getOutlineId() {
            return this.outlineId;
        }

        /**
         * @return outlineTime
         */
        public Long getOutlineTime() {
            return this.outlineTime;
        }

        /**
         * @return outlineTimeUTCString
         */
        public String getOutlineTimeUTCString() {
            return this.outlineTimeUTCString;
        }

        /**
         * @return planFull
         */
        public String getPlanFull() {
            return this.planFull;
        }

        /**
         * @return planId
         */
        public Integer getPlanId() {
            return this.planId;
        }

        /**
         * @return planInfo
         */
        public String getPlanInfo() {
            return this.planInfo;
        }

        /**
         * @return planUnionHash
         */
        public String getPlanUnionHash() {
            return this.planUnionHash;
        }

        /**
         * @return querySQL
         */
        public String getQuerySQL() {
            return this.querySQL;
        }

        public static final class Builder {
            private Float avgExecutionMS; 
            private Long avgExecutionTimeMS; 
            private Long firstLoadTime; 
            private String firstLoadTimeUTCString; 
            private Integer hitCount; 
            private Integer mergedVersion; 
            private String nodeIp; 
            private String outlineData; 
            private Long outlineId; 
            private Long outlineTime; 
            private String outlineTimeUTCString; 
            private String planFull; 
            private Integer planId; 
            private String planInfo; 
            private String planUnionHash; 
            private String querySQL; 

            /**
             * 平均执行时间 (ms)
             */
            public Builder avgExecutionMS(Float avgExecutionMS) {
                this.avgExecutionMS = avgExecutionMS;
                return this;
            }

            /**
             * 平均执行时间
             */
            public Builder avgExecutionTimeMS(Long avgExecutionTimeMS) {
                this.avgExecutionTimeMS = avgExecutionTimeMS;
                return this;
            }

            /**
             * 首次加载时间
             */
            public Builder firstLoadTime(Long firstLoadTime) {
                this.firstLoadTime = firstLoadTime;
                return this;
            }

            /**
             * 首次加载时间(零时区)
             */
            public Builder firstLoadTimeUTCString(String firstLoadTimeUTCString) {
                this.firstLoadTimeUTCString = firstLoadTimeUTCString;
                return this;
            }

            /**
             * 命中次数
             */
            public Builder hitCount(Integer hitCount) {
                this.hitCount = hitCount;
                return this;
            }

            /**
             * 合并版本
             */
            public Builder mergedVersion(Integer mergedVersion) {
                this.mergedVersion = mergedVersion;
                return this;
            }

            /**
             * 节点ip
             */
            public Builder nodeIp(String nodeIp) {
                this.nodeIp = nodeIp;
                return this;
            }

            /**
             * Outline数据
             */
            public Builder outlineData(String outlineData) {
                this.outlineData = outlineData;
                return this;
            }

            /**
             * OutlineID
             */
            public Builder outlineId(Long outlineId) {
                this.outlineId = outlineId;
                return this;
            }

            /**
             * 绑定时间
             */
            public Builder outlineTime(Long outlineTime) {
                this.outlineTime = outlineTime;
                return this;
            }

            /**
             * 绑定时间(零时区)
             */
            public Builder outlineTimeUTCString(String outlineTimeUTCString) {
                this.outlineTimeUTCString = outlineTimeUTCString;
                return this;
            }

            /**
             * SQL的完整执行计划
             */
            public Builder planFull(String planFull) {
                this.planFull = planFull;
                return this;
            }

            /**
             * SQL执行计划在数据库内部的ID
             */
            public Builder planId(Integer planId) {
                this.planId = planId;
                return this;
            }

            /**
             * 计划信息
             */
            public Builder planInfo(String planInfo) {
                this.planInfo = planInfo;
                return this;
            }

            /**
             * SQL执行计划在诊断系统内部的唯一标识
             */
            public Builder planUnionHash(String planUnionHash) {
                this.planUnionHash = planUnionHash;
                return this;
            }

            /**
             * 查询sql
             */
            public Builder querySQL(String querySQL) {
                this.querySQL = querySQL;
                return this;
            }

            public SQLPlans build() {
                return new SQLPlans(this);
            } 

        } 

    }
}
