// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateSLARulesRequest} extends {@link RequestModel}
 *
 * <p>UpdateSLARulesRequest</p>
 */
public class UpdateSLARulesRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DagId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long dagId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SlaRuleList")
    private java.util.List < SlaRuleList> slaRuleList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tid")
    @com.aliyun.core.annotation.Validation(minimum = 1)
    private Long tid;

    private UpdateSLARulesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.dagId = builder.dagId;
        this.slaRuleList = builder.slaRuleList;
        this.tid = builder.tid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSLARulesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return dagId
     */
    public Long getDagId() {
        return this.dagId;
    }

    /**
     * @return slaRuleList
     */
    public java.util.List < SlaRuleList> getSlaRuleList() {
        return this.slaRuleList;
    }

    /**
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    public static final class Builder extends Request.Builder<UpdateSLARulesRequest, Builder> {
        private String regionId; 
        private Long dagId; 
        private java.util.List < SlaRuleList> slaRuleList; 
        private Long tid; 

        private Builder() {
            super();
        } 

        private Builder(UpdateSLARulesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.dagId = request.dagId;
            this.slaRuleList = request.slaRuleList;
            this.tid = request.tid;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the task flow. You can call the [ListTaskFlow](~~424565~~) or [ListLhTaskFlowAndScenario](~~426672~~) operation to query the task flow ID.
         */
        public Builder dagId(Long dagId) {
            this.putQueryParameter("DagId", dagId);
            this.dagId = dagId;
            return this;
        }

        /**
         * The list of SLA rules.
         */
        public Builder slaRuleList(java.util.List < SlaRuleList> slaRuleList) {
            String slaRuleListShrink = shrink(slaRuleList, "SlaRuleList", "json");
            this.putQueryParameter("SlaRuleList", slaRuleListShrink);
            this.slaRuleList = slaRuleList;
            return this;
        }

        /**
         * The ID of the tenant.
         * <p>
         * 
         * > :To view the ID of the tenant, go to the Data Management (DMS) console and move the pointer over the profile picture in the upper-right corner. For more information, see [View information about the current tenant](~~181330~~).
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        @Override
        public UpdateSLARulesRequest build() {
            return new UpdateSLARulesRequest(this);
        } 

    } 

    public static class SlaRuleList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DagId")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long dagId;

        @com.aliyun.core.annotation.NameInMap("IntervalMinutes")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer intervalMinutes;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private Long nodeId;

        @com.aliyun.core.annotation.NameInMap("Type")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer type;

        private SlaRuleList(Builder builder) {
            this.dagId = builder.dagId;
            this.intervalMinutes = builder.intervalMinutes;
            this.nodeId = builder.nodeId;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SlaRuleList create() {
            return builder().build();
        }

        /**
         * @return dagId
         */
        public Long getDagId() {
            return this.dagId;
        }

        /**
         * @return intervalMinutes
         */
        public Integer getIntervalMinutes() {
            return this.intervalMinutes;
        }

        /**
         * @return nodeId
         */
        public Long getNodeId() {
            return this.nodeId;
        }

        /**
         * @return type
         */
        public Integer getType() {
            return this.type;
        }

        public static final class Builder {
            private Long dagId; 
            private Integer intervalMinutes; 
            private Long nodeId; 
            private Integer type; 

            /**
             * The ID of the task flow.
             */
            public Builder dagId(Long dagId) {
                this.dagId = dagId;
                return this;
            }

            /**
             * The timeout period. Unit: minutes.
             */
            public Builder intervalMinutes(Integer intervalMinutes) {
                this.intervalMinutes = intervalMinutes;
                return this;
            }

            /**
             * The ID of the task node.
             */
            public Builder nodeId(Long nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * The rule type. Valid values:
             * <p>
             * 
             * *   **0**: SLA rules for task flows
             * *   **1**: SLA rules for nodes
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            public SlaRuleList build() {
                return new SlaRuleList(this);
            } 

        } 

    }
}
