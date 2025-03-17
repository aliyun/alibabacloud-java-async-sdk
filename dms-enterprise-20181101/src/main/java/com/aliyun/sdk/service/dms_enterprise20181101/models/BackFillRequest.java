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
 * {@link BackFillRequest} extends {@link RequestModel}
 *
 * <p>BackFillRequest</p>
 */
public class BackFillRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Asc")
    private Boolean asc;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackFillDate")
    private String backFillDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackFillDateBegin")
    private String backFillDateBegin;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackFillDateEnd")
    private String backFillDateEnd;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DagId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long dagId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FilterNodeIds")
    private java.util.List<Long> filterNodeIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HistoryDagId")
    private Long historyDagId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Interval")
    private Integer interval;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsTriggerSubTree")
    private Boolean isTriggerSubTree;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartNodeIds")
    private java.util.List<Long> startNodeIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tid")
    @com.aliyun.core.annotation.Validation(minimum = 1)
    private Long tid;

    private BackFillRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.asc = builder.asc;
        this.backFillDate = builder.backFillDate;
        this.backFillDateBegin = builder.backFillDateBegin;
        this.backFillDateEnd = builder.backFillDateEnd;
        this.dagId = builder.dagId;
        this.filterNodeIds = builder.filterNodeIds;
        this.historyDagId = builder.historyDagId;
        this.interval = builder.interval;
        this.isTriggerSubTree = builder.isTriggerSubTree;
        this.startNodeIds = builder.startNodeIds;
        this.tid = builder.tid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BackFillRequest create() {
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
     * @return asc
     */
    public Boolean getAsc() {
        return this.asc;
    }

    /**
     * @return backFillDate
     */
    public String getBackFillDate() {
        return this.backFillDate;
    }

    /**
     * @return backFillDateBegin
     */
    public String getBackFillDateBegin() {
        return this.backFillDateBegin;
    }

    /**
     * @return backFillDateEnd
     */
    public String getBackFillDateEnd() {
        return this.backFillDateEnd;
    }

    /**
     * @return dagId
     */
    public Long getDagId() {
        return this.dagId;
    }

    /**
     * @return filterNodeIds
     */
    public java.util.List<Long> getFilterNodeIds() {
        return this.filterNodeIds;
    }

    /**
     * @return historyDagId
     */
    public Long getHistoryDagId() {
        return this.historyDagId;
    }

    /**
     * @return interval
     */
    public Integer getInterval() {
        return this.interval;
    }

    /**
     * @return isTriggerSubTree
     */
    public Boolean getIsTriggerSubTree() {
        return this.isTriggerSubTree;
    }

    /**
     * @return startNodeIds
     */
    public java.util.List<Long> getStartNodeIds() {
        return this.startNodeIds;
    }

    /**
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    public static final class Builder extends Request.Builder<BackFillRequest, Builder> {
        private String regionId; 
        private Boolean asc; 
        private String backFillDate; 
        private String backFillDateBegin; 
        private String backFillDateEnd; 
        private Long dagId; 
        private java.util.List<Long> filterNodeIds; 
        private Long historyDagId; 
        private Integer interval; 
        private Boolean isTriggerSubTree; 
        private java.util.List<Long> startNodeIds; 
        private Long tid; 

        private Builder() {
            super();
        } 

        private Builder(BackFillRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.asc = request.asc;
            this.backFillDate = request.backFillDate;
            this.backFillDateBegin = request.backFillDateBegin;
            this.backFillDateEnd = request.backFillDateEnd;
            this.dagId = request.dagId;
            this.filterNodeIds = request.filterNodeIds;
            this.historyDagId = request.historyDagId;
            this.interval = request.interval;
            this.isTriggerSubTree = request.isTriggerSubTree;
            this.startNodeIds = request.startNodeIds;
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
         * <p>The running sequence of task flows for data backfill. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: reverse chronological order.</li>
         * <li><strong>1</strong>: chronological order. This is the default value.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder asc(Boolean asc) {
            this.putQueryParameter("Asc", asc);
            this.asc = asc;
            return this;
        }

        /**
         * <p>The date for the data to be backfilled. This parameter is required if you specify a date for data backfill.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-01-14</p>
         */
        public Builder backFillDate(String backFillDate) {
            this.putQueryParameter("BackFillDate", backFillDate);
            this.backFillDate = backFillDate;
            return this;
        }

        /**
         * <p>The start date of the date range for the data to be backfilled. This parameter is required if you specify a date range for data backfill.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-01-14</p>
         */
        public Builder backFillDateBegin(String backFillDateBegin) {
            this.putQueryParameter("BackFillDateBegin", backFillDateBegin);
            this.backFillDateBegin = backFillDateBegin;
            return this;
        }

        /**
         * <p>The end date of the date range for the data to be backfilled. This parameter is required if you specify a date range for data backfill.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-09-29</p>
         */
        public Builder backFillDateEnd(String backFillDateEnd) {
            this.putQueryParameter("BackFillDateEnd", backFillDateEnd);
            this.backFillDateEnd = backFillDateEnd;
            return this;
        }

        /**
         * <p>The ID of the task flow. You can call the <a href="https://help.aliyun.com/document_detail/424565.html">ListTaskFlow</a> or <a href="https://help.aliyun.com/document_detail/426672.html">ListLhTaskFlowAndScenario</a> operation to query the task flow ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>15***</p>
         */
        public Builder dagId(Long dagId) {
            this.putQueryParameter("DagId", dagId);
            this.dagId = dagId;
            return this;
        }

        /**
         * <p>Filter condition, which specifies the list of node IDs in the task flow that do not need to supplement data.</p>
         */
        public Builder filterNodeIds(java.util.List<Long> filterNodeIds) {
            String filterNodeIdsShrink = shrink(filterNodeIds, "FilterNodeIds", "json");
            this.putQueryParameter("FilterNodeIds", filterNodeIdsShrink);
            this.filterNodeIds = filterNodeIds;
            return this;
        }

        /**
         * <p>The ID of the historical task flow.</p>
         * 
         * <strong>example:</strong>
         * <p>16***</p>
         */
        public Builder historyDagId(Long historyDagId) {
            this.putQueryParameter("HistoryDagId", historyDagId);
            this.historyDagId = historyDagId;
            return this;
        }

        /**
         * <p>The interval at which data backfill is performed. Unit: hours. Minimum value: 1. Default value: 24.</p>
         * 
         * <strong>example:</strong>
         * <p>24</p>
         */
        public Builder interval(Integer interval) {
            this.putQueryParameter("Interval", interval);
            this.interval = interval;
            return this;
        }

        /**
         * <p>Specifies whether to run descendant nodes. Default value: true.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isTriggerSubTree(Boolean isTriggerSubTree) {
            this.putQueryParameter("IsTriggerSubTree", isTriggerSubTree);
            this.isTriggerSubTree = isTriggerSubTree;
            return this;
        }

        /**
         * <p>The number of nodes for which you want to backfill data.</p>
         */
        public Builder startNodeIds(java.util.List<Long> startNodeIds) {
            String startNodeIdsShrink = shrink(startNodeIds, "StartNodeIds", "json");
            this.putQueryParameter("StartNodeIds", startNodeIdsShrink);
            this.startNodeIds = startNodeIds;
            return this;
        }

        /**
         * <p>The ID of the tenant.</p>
         * <blockquote>
         * <p> To view the ID of the tenant, go to the Data Management (DMS) console and move the pointer over the profile picture in the upper-right corner. For more information, see <a href="https://help.aliyun.com/document_detail/181330.html">View information about the current tenant</a>.</p>
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
        public BackFillRequest build() {
            return new BackFillRequest(this);
        } 

    } 

}
