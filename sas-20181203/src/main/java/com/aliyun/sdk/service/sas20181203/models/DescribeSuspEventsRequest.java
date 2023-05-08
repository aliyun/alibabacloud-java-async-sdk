// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSuspEventsRequest} extends {@link RequestModel}
 *
 * <p>DescribeSuspEventsRequest</p>
 */
public class DescribeSuspEventsRequest extends Request {
    @Query
    @NameInMap("AlarmUniqueInfo")
    private String alarmUniqueInfo;

    @Query
    @NameInMap("AssetsTypeList")
    private java.util.List < String > assetsTypeList;

    @Query
    @NameInMap("ClusterId")
    private String clusterId;

    @Query
    @NameInMap("ContainerFieldName")
    private String containerFieldName;

    @Query
    @NameInMap("ContainerFieldValue")
    private String containerFieldValue;

    @Query
    @NameInMap("CurrentPage")
    private String currentPage;

    @Query
    @NameInMap("Dealed")
    private String dealed;

    @Query
    @NameInMap("EventNames")
    private String eventNames;

    @Query
    @NameInMap("From")
    private String from;

    @Query
    @NameInMap("GroupId")
    private Long groupId;

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
    @NameInMap("Name")
    private String name;

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
    private String pageSize;

    @Query
    @NameInMap("ParentEventTypes")
    private String parentEventTypes;

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
    @NameInMap("Source")
    private String source;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    @Query
    @NameInMap("Status")
    private String status;

    @Body
    @NameInMap("TacticId")
    private String tacticId;

    @Query
    @NameInMap("TargetType")
    private String targetType;

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

    private DescribeSuspEventsRequest(Builder builder) {
        super(builder);
        this.alarmUniqueInfo = builder.alarmUniqueInfo;
        this.assetsTypeList = builder.assetsTypeList;
        this.clusterId = builder.clusterId;
        this.containerFieldName = builder.containerFieldName;
        this.containerFieldValue = builder.containerFieldValue;
        this.currentPage = builder.currentPage;
        this.dealed = builder.dealed;
        this.eventNames = builder.eventNames;
        this.from = builder.from;
        this.groupId = builder.groupId;
        this.id = builder.id;
        this.lang = builder.lang;
        this.levels = builder.levels;
        this.name = builder.name;
        this.operateErrorCodeList = builder.operateErrorCodeList;
        this.operateTimeEnd = builder.operateTimeEnd;
        this.operateTimeStart = builder.operateTimeStart;
        this.pageSize = builder.pageSize;
        this.parentEventTypes = builder.parentEventTypes;
        this.remark = builder.remark;
        this.sortColumn = builder.sortColumn;
        this.sortType = builder.sortType;
        this.source = builder.source;
        this.sourceIp = builder.sourceIp;
        this.status = builder.status;
        this.tacticId = builder.tacticId;
        this.targetType = builder.targetType;
        this.timeEnd = builder.timeEnd;
        this.timeStart = builder.timeStart;
        this.uniqueInfo = builder.uniqueInfo;
        this.uuids = builder.uuids;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSuspEventsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alarmUniqueInfo
     */
    public String getAlarmUniqueInfo() {
        return this.alarmUniqueInfo;
    }

    /**
     * @return assetsTypeList
     */
    public java.util.List < String > getAssetsTypeList() {
        return this.assetsTypeList;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return containerFieldName
     */
    public String getContainerFieldName() {
        return this.containerFieldName;
    }

    /**
     * @return containerFieldValue
     */
    public String getContainerFieldValue() {
        return this.containerFieldValue;
    }

    /**
     * @return currentPage
     */
    public String getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return dealed
     */
    public String getDealed() {
        return this.dealed;
    }

    /**
     * @return eventNames
     */
    public String getEventNames() {
        return this.eventNames;
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
    public Long getGroupId() {
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
     * @return name
     */
    public String getName() {
        return this.name;
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
     * @return parentEventTypes
     */
    public String getParentEventTypes() {
        return this.parentEventTypes;
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
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return tacticId
     */
    public String getTacticId() {
        return this.tacticId;
    }

    /**
     * @return targetType
     */
    public String getTargetType() {
        return this.targetType;
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

    public static final class Builder extends Request.Builder<DescribeSuspEventsRequest, Builder> {
        private String alarmUniqueInfo; 
        private java.util.List < String > assetsTypeList; 
        private String clusterId; 
        private String containerFieldName; 
        private String containerFieldValue; 
        private String currentPage; 
        private String dealed; 
        private String eventNames; 
        private String from; 
        private Long groupId; 
        private Long id; 
        private String lang; 
        private String levels; 
        private String name; 
        private java.util.List < String > operateErrorCodeList; 
        private String operateTimeEnd; 
        private String operateTimeStart; 
        private String pageSize; 
        private String parentEventTypes; 
        private String remark; 
        private String sortColumn; 
        private String sortType; 
        private String source; 
        private String sourceIp; 
        private String status; 
        private String tacticId; 
        private String targetType; 
        private String timeEnd; 
        private String timeStart; 
        private String uniqueInfo; 
        private String uuids; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSuspEventsRequest request) {
            super(request);
            this.alarmUniqueInfo = request.alarmUniqueInfo;
            this.assetsTypeList = request.assetsTypeList;
            this.clusterId = request.clusterId;
            this.containerFieldName = request.containerFieldName;
            this.containerFieldValue = request.containerFieldValue;
            this.currentPage = request.currentPage;
            this.dealed = request.dealed;
            this.eventNames = request.eventNames;
            this.from = request.from;
            this.groupId = request.groupId;
            this.id = request.id;
            this.lang = request.lang;
            this.levels = request.levels;
            this.name = request.name;
            this.operateErrorCodeList = request.operateErrorCodeList;
            this.operateTimeEnd = request.operateTimeEnd;
            this.operateTimeStart = request.operateTimeStart;
            this.pageSize = request.pageSize;
            this.parentEventTypes = request.parentEventTypes;
            this.remark = request.remark;
            this.sortColumn = request.sortColumn;
            this.sortType = request.sortType;
            this.source = request.source;
            this.sourceIp = request.sourceIp;
            this.status = request.status;
            this.tacticId = request.tacticId;
            this.targetType = request.targetType;
            this.timeEnd = request.timeEnd;
            this.timeStart = request.timeStart;
            this.uniqueInfo = request.uniqueInfo;
            this.uuids = request.uuids;
        } 

        /**
         * The ID of the alert event.
         * <p>
         * 
         * >  To query the details about the exceptions of an alert event, you must specify the ID of the alert event. You can call the [DescribeSuspEvents](~~DescribeSuspEvents~~) operation to query the IDs of alert events.
         */
        public Builder alarmUniqueInfo(String alarmUniqueInfo) {
            this.putQueryParameter("AlarmUniqueInfo", alarmUniqueInfo);
            this.alarmUniqueInfo = alarmUniqueInfo;
            return this;
        }

        /**
         * The types of assets.
         */
        public Builder assetsTypeList(java.util.List < String > assetsTypeList) {
            this.putQueryParameter("AssetsTypeList", assetsTypeList);
            this.assetsTypeList = assetsTypeList;
            return this;
        }

        /**
         * The ID of the cluster of whose alert events you want to query.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The key of the condition that is used to query alert events on containers. Valid values:
         * <p>
         * 
         * *   **instanceId**: the ID of the asset
         * *   **appName**: the name of the application
         * *   **clusterId**: the ID of the cluster
         * *   **regionId**: the ID of the region
         * *   **nodeName**: the name of the node
         * *   **namespace**: the namespace
         * *   **clusterName**: the name of the cluster
         * *   **image**: the name of the image
         * *   **imageRepoName**: the name of the image repository
         * *   **imageRepoNamespace**: the namespace to which the image repository belongs
         * *   **imageRepoTag**: the tag that is added to the image
         * *   **imageDigest**: the digest of the image
         */
        public Builder containerFieldName(String containerFieldName) {
            this.putQueryParameter("ContainerFieldName", containerFieldName);
            this.containerFieldName = containerFieldName;
            return this;
        }

        /**
         * The value of the condition that is used to query alert events on containers.
         */
        public Builder containerFieldValue(String containerFieldValue) {
            this.putQueryParameter("ContainerFieldValue", containerFieldValue);
            this.containerFieldValue = containerFieldValue;
            return this;
        }

        /**
         * The number of the page to return. Default value: **1**.
         */
        public Builder currentPage(String currentPage) {
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
         * The subtype of the alert event. Separate multiple subtypes with commas (,).
         */
        public Builder eventNames(String eventNames) {
            this.putQueryParameter("EventNames", eventNames);
            this.eventNames = eventNames;
            return this;
        }

        /**
         * The data source of the alert event. Set the value to sas.
         */
        public Builder from(String from) {
            this.putQueryParameter("From", from);
            this.from = from;
            return this;
        }

        /**
         * The ID of the asset group to which the affected asset belongs.
         */
        public Builder groupId(Long groupId) {
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
         * The name of the asset that is affected by the alert event.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
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
         * The timestamp when the handling operation ends.
         */
        public Builder operateTimeEnd(String operateTimeEnd) {
            this.putQueryParameter("OperateTimeEnd", operateTimeEnd);
            this.operateTimeEnd = operateTimeEnd;
            return this;
        }

        /**
         * The timestamp when the handling operation starts.
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
         * The alert type of the alert event. Valid values:
         * <p>
         * 
         * *   **Suspicious process**
         * *   **Webshell**
         * *   **Unusual logon**
         * *   **Exception**
         * *   **Sensitive file tampering**
         * *   **Malicious process (cloud threat detection)**
         * *   **Suspicious network connection**
         * *   **Suspicious account**
         * *   **Application intrusion event**
         * *   **Cloud threat detection**
         * *   **Precise defense**
         * *   **Application whitelist**
         * *   **Persistent webshell**
         * *   **Web application threat detection**
         * *   **Malicious script**
         * *   **Threat intelligence**
         * *   **Malicious network activity**
         * *   **Cluster exception**
         * *   **Webshell (on-premises threat detection)**
         * *   **Vulnerability exploitation**
         * *   **Malicious process (on-premises threat detection)**
         * *   **Trusted exception**
         * *   **Operations to manage other resources**
         */
        public Builder parentEventTypes(String parentEventTypes) {
            this.putQueryParameter("ParentEventTypes", parentEventTypes);
            this.parentEventTypes = parentEventTypes;
            return this;
        }

        /**
         * The name of the alert or the information about the asset.
         * <p>
         * 
         * >  Fuzzy search is supported. The asset information includes the name, public IP address, and private IP address of an asset.
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
         * *   **lastTime**: the latest occurrence time.
         * *   **operateTime**: the handling time.
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
         * The source of the alert.
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
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
         * The status of the alert event. Valid values:
         * <p>
         * 
         * *   **0**: all
         * *   **1**: pending handling
         * *   **2**: ignored
         * *   **4**: confirmed
         * *   **8**: marked as a false positive
         * *   **16**: being handled
         * *   **32**: handled
         * *   **64**: expired
         * *   **128**: deleted
         * *   **512**: being automatically blocked
         * *   **513**: automatically blocked
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * The tactic ID of ATT\&CK.
         */
        public Builder tacticId(String tacticId) {
            this.putBodyParameter("TacticId", tacticId);
            this.tacticId = tacticId;
            return this;
        }

        /**
         * The item that is used to search for the container. Valid values:
         * <p>
         * 
         * *   **containerId**: the ID of the container
         * *   **uuid**: the UUID of the server
         * *   **imageUuid**: the UUID of the image
         */
        public Builder targetType(String targetType) {
            this.putQueryParameter("TargetType", targetType);
            this.targetType = targetType;
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
         * The unique key of the alert.
         */
        public Builder uniqueInfo(String uniqueInfo) {
            this.putQueryParameter("UniqueInfo", uniqueInfo);
            this.uniqueInfo = uniqueInfo;
            return this;
        }

        /**
         * The UUID of the server on which the alert is detected. Separate multiple UUIDs with commas (,).
         */
        public Builder uuids(String uuids) {
            this.putQueryParameter("Uuids", uuids);
            this.uuids = uuids;
            return this;
        }

        @Override
        public DescribeSuspEventsRequest build() {
            return new DescribeSuspEventsRequest(this);
        } 

    } 

}
