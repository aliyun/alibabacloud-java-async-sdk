// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateSLARulesRequest} extends {@link RequestModel}
 *
 * <p>UpdateSLARulesRequest</p>
 */
public class UpdateSLARulesRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("DagId")
    @Validation(required = true)
    private Long dagId;

    @Query
    @NameInMap("SlaRuleList")
    private java.util.List < SlaRuleList> slaRuleList;

    @Query
    @NameInMap("Tid")
    @Validation(minimum = 1)
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
         * DagId.
         */
        public Builder dagId(Long dagId) {
            this.putQueryParameter("DagId", dagId);
            this.dagId = dagId;
            return this;
        }

        /**
         * SlaRuleList.
         */
        public Builder slaRuleList(java.util.List < SlaRuleList> slaRuleList) {
            String slaRuleListShrink = shrink(slaRuleList, "SlaRuleList", "json");
            this.putQueryParameter("SlaRuleList", slaRuleListShrink);
            this.slaRuleList = slaRuleList;
            return this;
        }

        /**
         * Tid.
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
        @NameInMap("DagId")
        @Validation(required = true)
        private Long dagId;

        @NameInMap("IntervalMinutes")
        @Validation(required = true)
        private Integer intervalMinutes;

        @NameInMap("NodeId")
        private Long nodeId;

        @NameInMap("Type")
        @Validation(required = true)
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
             * DagId.
             */
            public Builder dagId(Long dagId) {
                this.dagId = dagId;
                return this;
            }

            /**
             * IntervalMinutes.
             */
            public Builder intervalMinutes(Integer intervalMinutes) {
                this.intervalMinutes = intervalMinutes;
                return this;
            }

            /**
             * NodeId.
             */
            public Builder nodeId(Long nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * Type.
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
