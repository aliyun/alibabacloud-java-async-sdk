// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

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
    private java.util.List<SlaRuleList> slaRuleList;

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
    public java.util.List<SlaRuleList> getSlaRuleList() {
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
        private java.util.List<SlaRuleList> slaRuleList; 
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
         * <p>The ID of the task flow. You can call the <a href="https://help.aliyun.com/document_detail/424565.html">ListTaskFlow</a> or <a href="https://help.aliyun.com/document_detail/426672.html">ListLhTaskFlowAndScenario</a> operation to query the task flow ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>11****</p>
         */
        public Builder dagId(Long dagId) {
            this.putQueryParameter("DagId", dagId);
            this.dagId = dagId;
            return this;
        }

        /**
         * <p>The list of SLA rules.</p>
         */
        public Builder slaRuleList(java.util.List<SlaRuleList> slaRuleList) {
            String slaRuleListShrink = shrink(slaRuleList, "SlaRuleList", "json");
            this.putQueryParameter("SlaRuleList", slaRuleListShrink);
            this.slaRuleList = slaRuleList;
            return this;
        }

        /**
         * <p>The ID of the tenant.</p>
         * <blockquote>
         * <p>:To view the ID of the tenant, go to the Data Management (DMS) console and move the pointer over the profile picture in the upper-right corner. For more information, see <a href="https://help.aliyun.com/document_detail/181330.html">View information about the current tenant</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>3***</p>
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

    /**
     * 
     * {@link UpdateSLARulesRequest} extends {@link TeaModel}
     *
     * <p>UpdateSLARulesRequest</p>
     */
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

            private Builder() {
            } 

            private Builder(SlaRuleList model) {
                this.dagId = model.dagId;
                this.intervalMinutes = model.intervalMinutes;
                this.nodeId = model.nodeId;
                this.type = model.type;
            } 

            /**
             * <p>The ID of the task flow.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>15***</p>
             */
            public Builder dagId(Long dagId) {
                this.dagId = dagId;
                return this;
            }

            /**
             * <p>The timeout period. Unit: minutes.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1080</p>
             */
            public Builder intervalMinutes(Integer intervalMinutes) {
                this.intervalMinutes = intervalMinutes;
                return this;
            }

            /**
             * <p>The ID of the task node.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder nodeId(Long nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * <p>The rule type. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: SLA rules for task flows</li>
             * <li><strong>1</strong>: SLA rules for nodes</li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
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
