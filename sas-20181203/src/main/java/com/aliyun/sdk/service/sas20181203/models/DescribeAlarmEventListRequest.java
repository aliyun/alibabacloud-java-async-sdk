// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAlarmEventListRequest} extends {@link RequestModel}
 *
 * <p>DescribeAlarmEventListRequest</p>
 */
public class DescribeAlarmEventListRequest extends Request {
    @Query
    @NameInMap("AlarmEventName")
    private String alarmEventName;

    @Query
    @NameInMap("AlarmEventType")
    private String alarmEventType;

    @Query
    @NameInMap("CurrentPage")
    @Validation(required = true)
    private Integer currentPage;

    @Query
    @NameInMap("Dealed")
    private String dealed;

    @Query
    @NameInMap("From")
    @Validation(required = true)
    private String from;

    @Query
    @NameInMap("GroupId")
    private String groupId;

    @Query
    @NameInMap("Id")
    private Long id;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("Levels")
    private String levels;

    @Query
    @NameInMap("OperateErrorCodeList")
    private java.util.List < String > operateErrorCodeList;

    @Query
    @NameInMap("OperateTimeEnd")
    private String operateTimeEnd;

    @Query
    @NameInMap("OperateTimeStart")
    private String operateTimeStart;

    @Query
    @NameInMap("PageSize")
    @Validation(required = true)
    private String pageSize;

    @Query
    @NameInMap("Remark")
    private String remark;

    @Query
    @NameInMap("SortColumn")
    private String sortColumn;

    @Query
    @NameInMap("SortType")
    private String sortType;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    @Query
    @NameInMap("TacticId")
    private String tacticId;

    @Query
    @NameInMap("TimeEnd")
    private String timeEnd;

    @Query
    @NameInMap("TimeStart")
    private String timeStart;

    @Query
    @NameInMap("UniqueInfo")
    private String uniqueInfo;

    @Query
    @NameInMap("Uuids")
    private String uuids;

    private DescribeAlarmEventListRequest(Builder builder) {
        super(builder);
        this.alarmEventName = builder.alarmEventName;
        this.alarmEventType = builder.alarmEventType;
        this.currentPage = builder.currentPage;
        this.dealed = builder.dealed;
        this.from = builder.from;
        this.groupId = builder.groupId;
        this.id = builder.id;
        this.lang = builder.lang;
        this.levels = builder.levels;
        this.operateErrorCodeList = builder.operateErrorCodeList;
        this.operateTimeEnd = builder.operateTimeEnd;
        this.operateTimeStart = builder.operateTimeStart;
        this.pageSize = builder.pageSize;
        this.remark = builder.remark;
        this.sortColumn = builder.sortColumn;
        this.sortType = builder.sortType;
        this.sourceIp = builder.sourceIp;
        this.tacticId = builder.tacticId;
        this.timeEnd = builder.timeEnd;
        this.timeStart = builder.timeStart;
        this.uniqueInfo = builder.uniqueInfo;
        this.uuids = builder.uuids;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAlarmEventListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alarmEventName
     */
    public String getAlarmEventName() {
        return this.alarmEventName;
    }

    /**
     * @return alarmEventType
     */
    public String getAlarmEventType() {
        return this.alarmEventType;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return dealed
     */
    public String getDealed() {
        return this.dealed;
    }

    /**
     * @return from
     */
    public String getFrom() {
        return this.from;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return levels
     */
    public String getLevels() {
        return this.levels;
    }

    /**
     * @return operateErrorCodeList
     */
    public java.util.List < String > getOperateErrorCodeList() {
        return this.operateErrorCodeList;
    }

    /**
     * @return operateTimeEnd
     */
    public String getOperateTimeEnd() {
        return this.operateTimeEnd;
    }

    /**
     * @return operateTimeStart
     */
    public String getOperateTimeStart() {
        return this.operateTimeStart;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * @return sortColumn
     */
    public String getSortColumn() {
        return this.sortColumn;
    }

    /**
     * @return sortType
     */
    public String getSortType() {
        return this.sortType;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    /**
     * @return tacticId
     */
    public String getTacticId() {
        return this.tacticId;
    }

    /**
     * @return timeEnd
     */
    public String getTimeEnd() {
        return this.timeEnd;
    }

    /**
     * @return timeStart
     */
    public String getTimeStart() {
        return this.timeStart;
    }

    /**
     * @return uniqueInfo
     */
    public String getUniqueInfo() {
        return this.uniqueInfo;
    }

    /**
     * @return uuids
     */
    public String getUuids() {
        return this.uuids;
    }

    public static final class Builder extends Request.Builder<DescribeAlarmEventListRequest, Builder> {
        private String alarmEventName; 
        private String alarmEventType; 
        private Integer currentPage; 
        private String dealed; 
        private String from; 
        private String groupId; 
        private Long id; 
        private String lang; 
        private String levels; 
        private java.util.List < String > operateErrorCodeList; 
        private String operateTimeEnd; 
        private String operateTimeStart; 
        private String pageSize; 
        private String remark; 
        private String sortColumn; 
        private String sortType; 
        private String sourceIp; 
        private String tacticId; 
        private String timeEnd; 
        private String timeStart; 
        private String uniqueInfo; 
        private String uuids; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAlarmEventListRequest request) {
            super(request);
            this.alarmEventName = request.alarmEventName;
            this.alarmEventType = request.alarmEventType;
            this.currentPage = request.currentPage;
            this.dealed = request.dealed;
            this.from = request.from;
            this.groupId = request.groupId;
            this.id = request.id;
            this.lang = request.lang;
            this.levels = request.levels;
            this.operateErrorCodeList = request.operateErrorCodeList;
            this.operateTimeEnd = request.operateTimeEnd;
            this.operateTimeStart = request.operateTimeStart;
            this.pageSize = request.pageSize;
            this.remark = request.remark;
            this.sortColumn = request.sortColumn;
            this.sortType = request.sortType;
            this.sourceIp = request.sourceIp;
            this.tacticId = request.tacticId;
            this.timeEnd = request.timeEnd;
            this.timeStart = request.timeStart;
            this.uniqueInfo = request.uniqueInfo;
            this.uuids = request.uuids;
        } 

        /**
         * The name of the alert event.
         * <p>
         * 
         * >  You can call the [DescribeNsasSuspEventType](~~DescribeNsasSuspEventType~~) operation to query the names of alert events.
         */
        public Builder alarmEventName(String alarmEventName) {
            this.putQueryParameter("AlarmEventName", alarmEventName);
            this.alarmEventName = alarmEventName;
            return this;
        }

        /**
         * The type of the alert event.
         * <p>
         * 
         * >  You can call the [DescribeNsasSuspEventType](~~DescribeNsasSuspEventType~~) operation to query the types of alert events.
         */
        public Builder alarmEventType(String alarmEventType) {
            this.putQueryParameter("AlarmEventType", alarmEventType);
            this.alarmEventType = alarmEventType;
            return this;
        }

        /**
         * The number of the page to return. Pages start from page **1**. Default value: **1**.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * Specifies whether the alert event is handled. Valid values:
         * <p>
         * 
         * *   **N**: unhandled
         * *   **Y**: handled
         */
        public Builder dealed(String dealed) {
            this.putQueryParameter("Dealed", dealed);
            this.dealed = dealed;
            return this;
        }

        /**
         * The ID of the request source. Set the value to **sas**, which indicates that the request is sent from Security Center.
         */
        public Builder from(String from) {
            this.putQueryParameter("From", from);
            this.from = from;
            return this;
        }

        /**
         * The ID of the asset group to which the affected asset belongs.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * The ID of the alert event.
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * The language of the content within the request and response. Default value: **zh**. Valid values:
         * <p>
         * 
         * *   **zh**: Chinese
         * *   **en**: English
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The severity of the alert event. Separate multiple severities with commas (,). Valid values:
         * <p>
         * 
         * *   **serious**
         * *   **suspicious**
         * *   **remind**
         */
        public Builder levels(String levels) {
            this.putQueryParameter("Levels", levels);
            this.levels = levels;
            return this;
        }

        /**
         * An array that consists of the handling result codes of alert events.
         */
        public Builder operateErrorCodeList(java.util.List < String > operateErrorCodeList) {
            this.putQueryParameter("OperateErrorCodeList", operateErrorCodeList);
            this.operateErrorCodeList = operateErrorCodeList;
            return this;
        }

        /**
         * The time when the handling operation ends.
         */
        public Builder operateTimeEnd(String operateTimeEnd) {
            this.putQueryParameter("OperateTimeEnd", operateTimeEnd);
            this.operateTimeEnd = operateTimeEnd;
            return this;
        }

        /**
         * The time when the handing operation starts.
         */
        public Builder operateTimeStart(String operateTimeStart) {
            this.putQueryParameter("OperateTimeStart", operateTimeStart);
            this.operateTimeStart = operateTimeStart;
            return this;
        }

        /**
         * The number of entries to return on each page. Default value: **20**.
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The name of the alert or the information about the asset.
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        /**
         * The custom sorting field. Default value: **operateTime**. Valid values:
         * <p>
         * 
         * *   **lastTime**: the latest occurrence time
         * *   **operateTime**: the handling time
         * 
         * >  This parameter takes effect if you set the **Dealed** parameter to Y.
         */
        public Builder sortColumn(String sortColumn) {
            this.putQueryParameter("SortColumn", sortColumn);
            this.sortColumn = sortColumn;
            return this;
        }

        /**
         * The custom sorting order. Default value: **desc**. Valid values:
         * <p>
         * 
         * *   **asc**: the ascending order
         * *   **desc**: the descending order
         * 
         * >  This parameter takes effect if you set the **Dealed** parameter to Y.
         */
        public Builder sortType(String sortType) {
            this.putQueryParameter("SortType", sortType);
            this.sortType = sortType;
            return this;
        }

        /**
         * The source IP address of the request.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * The tactic ID of ATT\&CK.
         */
        public Builder tacticId(String tacticId) {
            this.putQueryParameter("TacticId", tacticId);
            this.tacticId = tacticId;
            return this;
        }

        /**
         * The end time when the alert event was last detected.
         */
        public Builder timeEnd(String timeEnd) {
            this.putQueryParameter("TimeEnd", timeEnd);
            this.timeEnd = timeEnd;
            return this;
        }

        /**
         * The start time when the alert event was last detected.
         */
        public Builder timeStart(String timeStart) {
            this.putQueryParameter("TimeStart", timeStart);
            this.timeStart = timeStart;
            return this;
        }

        /**
         * The ID of the alert event.
         */
        public Builder uniqueInfo(String uniqueInfo) {
            this.putQueryParameter("UniqueInfo", uniqueInfo);
            this.uniqueInfo = uniqueInfo;
            return this;
        }

        /**
         * The UUIDs of the assets. Separate multiple UUIDs with commas (,).
         */
        public Builder uuids(String uuids) {
            this.putQueryParameter("Uuids", uuids);
            this.uuids = uuids;
            return this;
        }

        @Override
        public DescribeAlarmEventListRequest build() {
            return new DescribeAlarmEventListRequest(this);
        } 

    } 

}
