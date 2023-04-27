// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BackFillRequest} extends {@link RequestModel}
 *
 * <p>BackFillRequest</p>
 */
public class BackFillRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Asc")
    private Boolean asc;

    @Query
    @NameInMap("BackFillDate")
    private String backFillDate;

    @Query
    @NameInMap("BackFillDateBegin")
    private String backFillDateBegin;

    @Query
    @NameInMap("BackFillDateEnd")
    private String backFillDateEnd;

    @Query
    @NameInMap("DagId")
    @Validation(required = true)
    private Long dagId;

    @Query
    @NameInMap("HistoryDagId")
    private Long historyDagId;

    @Query
    @NameInMap("Interval")
    private Integer interval;

    @Query
    @NameInMap("IsTriggerSubTree")
    private Boolean isTriggerSubTree;

    @Query
    @NameInMap("StartNodeIds")
    private java.util.List < Long > startNodeIds;

    @Query
    @NameInMap("Tid")
    @Validation(minimum = 1)
    private Long tid;

    private BackFillRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.asc = builder.asc;
        this.backFillDate = builder.backFillDate;
        this.backFillDateBegin = builder.backFillDateBegin;
        this.backFillDateEnd = builder.backFillDateEnd;
        this.dagId = builder.dagId;
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
    public java.util.List < Long > getStartNodeIds() {
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
        private Long historyDagId; 
        private Integer interval; 
        private Boolean isTriggerSubTree; 
        private java.util.List < Long > startNodeIds; 
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
         * The ID of the request.
         */
        public Builder asc(Boolean asc) {
            this.putQueryParameter("Asc", asc);
            this.asc = asc;
            return this;
        }

        /**
         * The start date of the date range for the data to be backfilled. This parameter is required if you specify a date range for data backfill.
         */
        public Builder backFillDate(String backFillDate) {
            this.putQueryParameter("BackFillDate", backFillDate);
            this.backFillDate = backFillDate;
            return this;
        }

        /**
         * The running sequence of task flows for data backfill. Valid values:
         * <p>
         * 
         * *   **0**: reverse chronological order.
         * *   **1**: chronological order. This is the default value.
         */
        public Builder backFillDateBegin(String backFillDateBegin) {
            this.putQueryParameter("BackFillDateBegin", backFillDateBegin);
            this.backFillDateBegin = backFillDateBegin;
            return this;
        }

        /**
         * The ID of the tenant.
         * <p>
         * 
         * >  To view the ID of the tenant, go to the Data Management (DMS) console and move the pointer over the profile picture in the upper-right corner. For more information, see [View information about the current tenant](~~181330~~).
         */
        public Builder backFillDateEnd(String backFillDateEnd) {
            this.putQueryParameter("BackFillDateEnd", backFillDateEnd);
            this.backFillDateEnd = backFillDateEnd;
            return this;
        }

        /**
         * The operation that you want to perform. Set the value to **BackFill**.
         */
        public Builder dagId(Long dagId) {
            this.putQueryParameter("DagId", dagId);
            this.dagId = dagId;
            return this;
        }

        /**
         * The BackFillDate parameter is required if you specify a date for data backfill.
         * <p>
         * 
         * The BackFillDateBegin and BackFillDateEnd parameters are required if you specify a date range for data backfill.
         */
        public Builder historyDagId(Long historyDagId) {
            this.putQueryParameter("HistoryDagId", historyDagId);
            this.historyDagId = historyDagId;
            return this;
        }

        /**
         * Specifies whether to run descendant nodes. Default value: true.
         */
        public Builder interval(Integer interval) {
            this.putQueryParameter("Interval", interval);
            this.interval = interval;
            return this;
        }

        /**
         * The error message returned if the request failed.
         */
        public Builder isTriggerSubTree(Boolean isTriggerSubTree) {
            this.putQueryParameter("IsTriggerSubTree", isTriggerSubTree);
            this.isTriggerSubTree = isTriggerSubTree;
            return this;
        }

        /**
         * The date for the data to be backfilled. This parameter is required if you specify a date for data backfill.
         */
        public Builder startNodeIds(java.util.List < Long > startNodeIds) {
            String startNodeIdsShrink = shrink(startNodeIds, "StartNodeIds", "json");
            this.putQueryParameter("StartNodeIds", startNodeIdsShrink);
            this.startNodeIds = startNodeIds;
            return this;
        }

        /**
         * The error code returned if the request failed.
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
