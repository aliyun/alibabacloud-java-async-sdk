// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

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
 * {@link DescribeSQLPlansResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSQLPlansResponseBody</p>
 */
public class DescribeSQLPlansResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SQLPlans")
    private java.util.List<SQLPlans> SQLPlans;

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
     * @return SQLPlans
     */
    public java.util.List<SQLPlans> getSQLPlans() {
        return this.SQLPlans;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<SQLPlans> SQLPlans; 

        private Builder() {
        } 

        private Builder(DescribeSQLPlansResponseBody model) {
            this.requestId = model.requestId;
            this.SQLPlans = model.SQLPlans;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>EE205C00-30E4-XXXX-XXXX-87E3A8A2AA0C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information about the execution plan.</p>
         */
        public Builder SQLPlans(java.util.List<SQLPlans> SQLPlans) {
            this.SQLPlans = SQLPlans;
            return this;
        }

        public DescribeSQLPlansResponseBody build() {
            return new DescribeSQLPlansResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSQLPlansResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSQLPlansResponseBody</p>
     */
    public static class SQLPlans extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AvgExecutionMS")
        private Float avgExecutionMS;

        @com.aliyun.core.annotation.NameInMap("AvgExecutionTimeMS")
        private Long avgExecutionTimeMS;

        @com.aliyun.core.annotation.NameInMap("FirstLoadTime")
        private Long firstLoadTime;

        @com.aliyun.core.annotation.NameInMap("FirstLoadTimeUTCString")
        private String firstLoadTimeUTCString;

        @com.aliyun.core.annotation.NameInMap("HitCount")
        private Integer hitCount;

        @com.aliyun.core.annotation.NameInMap("MergedVersion")
        private Integer mergedVersion;

        @com.aliyun.core.annotation.NameInMap("NodeIp")
        private String nodeIp;

        @com.aliyun.core.annotation.NameInMap("OutlineData")
        private String outlineData;

        @com.aliyun.core.annotation.NameInMap("OutlineId")
        private Long outlineId;

        @com.aliyun.core.annotation.NameInMap("OutlineTime")
        private Long outlineTime;

        @com.aliyun.core.annotation.NameInMap("OutlineTimeUTCString")
        private String outlineTimeUTCString;

        @com.aliyun.core.annotation.NameInMap("PlanFull")
        private String planFull;

        @com.aliyun.core.annotation.NameInMap("PlanId")
        private Integer planId;

        @com.aliyun.core.annotation.NameInMap("PlanInfo")
        private String planInfo;

        @com.aliyun.core.annotation.NameInMap("PlanUnionHash")
        private String planUnionHash;

        @com.aliyun.core.annotation.NameInMap("QuerySQL")
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

            private Builder() {
            } 

            private Builder(SQLPlans model) {
                this.avgExecutionMS = model.avgExecutionMS;
                this.avgExecutionTimeMS = model.avgExecutionTimeMS;
                this.firstLoadTime = model.firstLoadTime;
                this.firstLoadTimeUTCString = model.firstLoadTimeUTCString;
                this.hitCount = model.hitCount;
                this.mergedVersion = model.mergedVersion;
                this.nodeIp = model.nodeIp;
                this.outlineData = model.outlineData;
                this.outlineId = model.outlineId;
                this.outlineTime = model.outlineTime;
                this.outlineTimeUTCString = model.outlineTimeUTCString;
                this.planFull = model.planFull;
                this.planId = model.planId;
                this.planInfo = model.planInfo;
                this.planUnionHash = model.planUnionHash;
                this.querySQL = model.querySQL;
            } 

            /**
             * <p>The average execution duration, in ms.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder avgExecutionMS(Float avgExecutionMS) {
                this.avgExecutionMS = avgExecutionMS;
                return this;
            }

            /**
             * <p>The average execution duration when the database uses this execution plan, in ms.</p>
             * 
             * <strong>example:</strong>
             * <p>288</p>
             */
            public Builder avgExecutionTimeMS(Long avgExecutionTimeMS) {
                this.avgExecutionTimeMS = avgExecutionTimeMS;
                return this;
            }

            /**
             * <p>The time when the plan was loaded for the first time, .</p>
             * 
             * <strong>example:</strong>
             * <p>1641492303000</p>
             */
            public Builder firstLoadTime(Long firstLoadTime) {
                this.firstLoadTime = firstLoadTime;
                return this;
            }

            /**
             * <p>The time when the plan was loaded for the first time, in UTC +0.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-01-06T18:05:03Z</p>
             */
            public Builder firstLoadTimeUTCString(String firstLoadTimeUTCString) {
                this.firstLoadTimeUTCString = firstLoadTimeUTCString;
                return this;
            }

            /**
             * <p>The number of hits.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder hitCount(Integer hitCount) {
                this.hitCount = hitCount;
                return this;
            }

            /**
             * <p>The major compaction version.</p>
             * 
             * <strong>example:</strong>
             * <p>132</p>
             */
            public Builder mergedVersion(Integer mergedVersion) {
                this.mergedVersion = mergedVersion;
                return this;
            }

            /**
             * <p>The IP address of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>i-bp16niirq4zdmgvm****</p>
             */
            public Builder nodeIp(String nodeIp) {
                this.nodeIp = nodeIp;
                return this;
            }

            /**
             * <p>The outline data.</p>
             */
            public Builder outlineData(String outlineData) {
                this.outlineData = outlineData;
                return this;
            }

            /**
             * <p>OutlineID.</p>
             * 
             * <strong>example:</strong>
             * <p>-1</p>
             */
            public Builder outlineId(Long outlineId) {
                this.outlineId = outlineId;
                return this;
            }

            /**
             * <p>The time when the plan was bound.</p>
             * 
             * <strong>example:</strong>
             * <p>1641492303000</p>
             */
            public Builder outlineTime(Long outlineTime) {
                this.outlineTime = outlineTime;
                return this;
            }

            /**
             * <p>The time when the plan was bound, in UTC +0.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-01-06T18:05:03Z</p>
             */
            public Builder outlineTimeUTCString(String outlineTimeUTCString) {
                this.outlineTimeUTCString = outlineTimeUTCString;
                return this;
            }

            /**
             * <p>The complete execution plan of the SQL statement.</p>
             * 
             * <strong>example:</strong>
             * <p>PHY_TABLE_SCAN | bmsql_order_line | 40 ******</p>
             */
            public Builder planFull(String planFull) {
                this.planFull = planFull;
                return this;
            }

            /**
             * <p>The ID of the SQL execution plan in the database.</p>
             * 
             * <strong>example:</strong>
             * <p>9114</p>
             */
            public Builder planId(Integer planId) {
                this.planId = planId;
                return this;
            }

            /**
             * <p>The information about the plan.</p>
             * 
             * <strong>example:</strong>
             * <p>PHY_TABLE_SCAN</p>
             */
            public Builder planInfo(String planInfo) {
                this.planInfo = planInfo;
                return this;
            }

            /**
             * <p>The unique identifier of the SQL execution plan in the diagnostic system.</p>
             * 
             * <strong>example:</strong>
             * <p>859ef7ee<strong><strong>b23ac98cdeb2476f</strong></strong></p>
             */
            public Builder planUnionHash(String planUnionHash) {
                this.planUnionHash = planUnionHash;
                return this;
            }

            /**
             * <p>The query SQL statement.</p>
             * 
             * <strong>example:</strong>
             * <p>SELECT ol_i_id, ***, *** FROM aaa</p>
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
