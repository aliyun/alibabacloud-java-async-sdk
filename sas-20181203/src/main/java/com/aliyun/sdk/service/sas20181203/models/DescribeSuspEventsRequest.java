// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link DescribeSuspEventsRequest} extends {@link RequestModel}
 *
 * <p>DescribeSuspEventsRequest</p>
 */
public class DescribeSuspEventsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AlarmUniqueInfo")
    private String alarmUniqueInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AssetsTypeList")
    private java.util.List<String> assetsTypeList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContainerFieldName")
    private String containerFieldName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContainerFieldValue")
    private String containerFieldValue;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private String currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Dealed")
    private String dealed;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DetectSource")
    private String detectSource;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventNames")
    private String eventNames;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("From")
    private String from;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    private Long groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    private Long id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Levels")
    private String levels;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MultiAccountActionType")
    private Integer multiAccountActionType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OperateErrorCodeList")
    private java.util.List<String> operateErrorCodeList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OperateTimeEnd")
    private String operateTimeEnd;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OperateTimeStart")
    private String operateTimeStart;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private String pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ParentEventTypes")
    private String parentEventTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Remark")
    private String remark;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceDirectoryAccountId")
    private Long resourceDirectoryAccountId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortColumn")
    private String sortColumn;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortType")
    private String sortType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Source")
    private String source;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceAliUids")
    private java.util.List<Long> sourceAliUids;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIp")
    private String sourceIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StrictMode")
    private String strictMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SupportOperateCodeList")
    private java.util.List<String> supportOperateCodeList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TacticId")
    private String tacticId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetType")
    private String targetType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TimeEnd")
    private String timeEnd;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TimeStart")
    private String timeStart;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UniqueInfo")
    private String uniqueInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Uuids")
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
        this.detectSource = builder.detectSource;
        this.eventNames = builder.eventNames;
        this.from = builder.from;
        this.groupId = builder.groupId;
        this.id = builder.id;
        this.lang = builder.lang;
        this.levels = builder.levels;
        this.multiAccountActionType = builder.multiAccountActionType;
        this.name = builder.name;
        this.operateErrorCodeList = builder.operateErrorCodeList;
        this.operateTimeEnd = builder.operateTimeEnd;
        this.operateTimeStart = builder.operateTimeStart;
        this.pageSize = builder.pageSize;
        this.parentEventTypes = builder.parentEventTypes;
        this.remark = builder.remark;
        this.resourceDirectoryAccountId = builder.resourceDirectoryAccountId;
        this.sortColumn = builder.sortColumn;
        this.sortType = builder.sortType;
        this.source = builder.source;
        this.sourceAliUids = builder.sourceAliUids;
        this.sourceIp = builder.sourceIp;
        this.status = builder.status;
        this.strictMode = builder.strictMode;
        this.supportOperateCodeList = builder.supportOperateCodeList;
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
    public java.util.List<String> getAssetsTypeList() {
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
     * @return detectSource
     */
    public String getDetectSource() {
        return this.detectSource;
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
     * @return multiAccountActionType
     */
    public Integer getMultiAccountActionType() {
        return this.multiAccountActionType;
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
    public java.util.List<String> getOperateErrorCodeList() {
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
     * @return resourceDirectoryAccountId
     */
    public Long getResourceDirectoryAccountId() {
        return this.resourceDirectoryAccountId;
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
     * @return sourceAliUids
     */
    public java.util.List<Long> getSourceAliUids() {
        return this.sourceAliUids;
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
     * @return strictMode
     */
    public String getStrictMode() {
        return this.strictMode;
    }

    /**
     * @return supportOperateCodeList
     */
    public java.util.List<String> getSupportOperateCodeList() {
        return this.supportOperateCodeList;
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
        private java.util.List<String> assetsTypeList; 
        private String clusterId; 
        private String containerFieldName; 
        private String containerFieldValue; 
        private String currentPage; 
        private String dealed; 
        private String detectSource; 
        private String eventNames; 
        private String from; 
        private Long groupId; 
        private Long id; 
        private String lang; 
        private String levels; 
        private Integer multiAccountActionType; 
        private String name; 
        private java.util.List<String> operateErrorCodeList; 
        private String operateTimeEnd; 
        private String operateTimeStart; 
        private String pageSize; 
        private String parentEventTypes; 
        private String remark; 
        private Long resourceDirectoryAccountId; 
        private String sortColumn; 
        private String sortType; 
        private String source; 
        private java.util.List<Long> sourceAliUids; 
        private String sourceIp; 
        private String status; 
        private String strictMode; 
        private java.util.List<String> supportOperateCodeList; 
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
            this.detectSource = request.detectSource;
            this.eventNames = request.eventNames;
            this.from = request.from;
            this.groupId = request.groupId;
            this.id = request.id;
            this.lang = request.lang;
            this.levels = request.levels;
            this.multiAccountActionType = request.multiAccountActionType;
            this.name = request.name;
            this.operateErrorCodeList = request.operateErrorCodeList;
            this.operateTimeEnd = request.operateTimeEnd;
            this.operateTimeStart = request.operateTimeStart;
            this.pageSize = request.pageSize;
            this.parentEventTypes = request.parentEventTypes;
            this.remark = request.remark;
            this.resourceDirectoryAccountId = request.resourceDirectoryAccountId;
            this.sortColumn = request.sortColumn;
            this.sortType = request.sortType;
            this.source = request.source;
            this.sourceAliUids = request.sourceAliUids;
            this.sourceIp = request.sourceIp;
            this.status = request.status;
            this.strictMode = request.strictMode;
            this.supportOperateCodeList = request.supportOperateCodeList;
            this.tacticId = request.tacticId;
            this.targetType = request.targetType;
            this.timeEnd = request.timeEnd;
            this.timeStart = request.timeStart;
            this.uniqueInfo = request.uniqueInfo;
            this.uuids = request.uuids;
        } 

        /**
         * <p>The unique ID of the alert event.</p>
         * <blockquote>
         * <p>To query the exception information of a single alert event, provide the unique ID of the alert event. You can obtain this ID by calling the <a href="~~DescribeSuspEvents~~">DescribeSuspEvents</a> operation.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>8df914418f4211fb****</p>
         */
        public Builder alarmUniqueInfo(String alarmUniqueInfo) {
            this.putQueryParameter("AlarmUniqueInfo", alarmUniqueInfo);
            this.alarmUniqueInfo = alarmUniqueInfo;
            return this;
        }

        /**
         * <p>The collection of asset types.</p>
         */
        public Builder assetsTypeList(java.util.List<String> assetsTypeList) {
            this.putQueryParameter("AssetsTypeList", assetsTypeList);
            this.assetsTypeList = assetsTypeList;
            return this;
        }

        /**
         * <p>The cluster ID for which you want to query alert events.</p>
         * 
         * <strong>example:</strong>
         * <p>c4af4fdf38a98496a9b63c2be5dae****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The container search field. Valid values:</p>
         * <ul>
         * <li><strong>instanceId</strong>: instance ID</li>
         * <li><strong>appName</strong>: application name</li>
         * <li><strong>clusterId</strong>: cluster ID</li>
         * <li><strong>regionId</strong>: region</li>
         * <li><strong>nodeName</strong>: node name</li>
         * <li><strong>namespace</strong>: namespace</li>
         * <li><strong>clusterName</strong>: cluster name</li>
         * <li><strong>image</strong>: image name</li>
         * <li><strong>imageRepoName</strong>: image repository name</li>
         * <li><strong>imageRepoNamespace</strong>: image repository namespace</li>
         * <li><strong>imageRepoTag</strong>: image tag</li>
         * <li><strong>imageDigest</strong>: image digest</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>instanceId</p>
         */
        public Builder containerFieldName(String containerFieldName) {
            this.putQueryParameter("ContainerFieldName", containerFieldName);
            this.containerFieldName = containerFieldName;
            return this;
        }

        /**
         * <p>The value of the container search field.</p>
         * 
         * <strong>example:</strong>
         * <p>ccf9769c22b844ff9b8d57417683b****</p>
         */
        public Builder containerFieldValue(String containerFieldValue) {
            this.putQueryParameter("ContainerFieldValue", containerFieldValue);
            this.containerFieldValue = containerFieldValue;
            return this;
        }

        /**
         * <p>The page number of the page to return in a paged query. Default value: <strong>1</strong>, which indicates that the results start from page 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(String currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>Specifies whether the alert events to query have been handled. Valid values:</p>
         * <ul>
         * <li><strong>N</strong>: Unhandled.</li>
         * <li><strong>Y</strong>: Handled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>N</p>
         */
        public Builder dealed(String dealed) {
            this.putQueryParameter("Dealed", dealed);
            this.dealed = dealed;
            return this;
        }

        /**
         * <p>The discovery source. This is an invalid field.</p>
         * 
         * <strong>example:</strong>
         * <p>linux</p>
         */
        public Builder detectSource(String detectSource) {
            this.putQueryParameter("DetectSource", detectSource);
            this.detectSource = detectSource;
            return this;
        }

        /**
         * <p>The subtypes of the alert events. Separate multiple subtypes with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>WEBSHELL</p>
         */
        public Builder eventNames(String eventNames) {
            this.putQueryParameter("EventNames", eventNames);
            this.eventNames = eventNames;
            return this;
        }

        /**
         * <p>The data source identifier of the alert event. The value is fixed as sas.</p>
         * 
         * <strong>example:</strong>
         * <p>sas</p>
         */
        public Builder from(String from) {
            this.putQueryParameter("From", from);
            this.from = from;
            return this;
        }

        /**
         * <p>The group ID of the asset affected by the alert event.</p>
         * 
         * <strong>example:</strong>
         * <p>18768</p>
         */
        public Builder groupId(Long groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The unique ID that identifies the alert event record.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * <p>The language of the request and response. Default value: <strong>zh</strong>. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese.</li>
         * <li><strong>en</strong>: English.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The severity levels of the alert events to query. Separate multiple severity levels with commas (,). The severity levels are listed in descending order. Valid values:</p>
         * <ul>
         * <li><strong>serious</strong>: Urgent.</li>
         * <li><strong>suspicious</strong>: Suspicious.</li>
         * <li><strong>remind</strong>: Reminder.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>serious</p>
         */
        public Builder levels(String levels) {
            this.putQueryParameter("Levels", levels);
            this.levels = levels;
            return this;
        }

        /**
         * <p>The multi-account query type. Default value: <strong>0</strong>. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Query data of the current account.</li>
         * <li><strong>1</strong>: Query data of all accounts.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder multiAccountActionType(Integer multiAccountActionType) {
            this.putQueryParameter("MultiAccountActionType", multiAccountActionType);
            this.multiAccountActionType = multiAccountActionType;
            return this;
        }

        /**
         * <p>The name of the asset affected by the alert event.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs-xxx</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The collection of alert event handling result codes.</p>
         */
        public Builder operateErrorCodeList(java.util.List<String> operateErrorCodeList) {
            this.putQueryParameter("OperateErrorCodeList", operateErrorCodeList);
            this.operateErrorCodeList = operateErrorCodeList;
            return this;
        }

        /**
         * <p>The end timestamp of the handling time.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-07-06 13:50:38</p>
         */
        public Builder operateTimeEnd(String operateTimeEnd) {
            this.putQueryParameter("OperateTimeEnd", operateTimeEnd);
            this.operateTimeEnd = operateTimeEnd;
            return this;
        }

        /**
         * <p>The start timestamp of the handling time.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-07-05 13:50:38</p>
         */
        public Builder operateTimeStart(String operateTimeStart) {
            this.putQueryParameter("OperateTimeStart", operateTimeStart);
            this.operateTimeStart = operateTimeStart;
            return this;
        }

        /**
         * <p>The number of alert events to display on each page in a paged query. Default value: <strong>20</strong>, which indicates that 20 alert events are displayed on each page. Maximum value: 100.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The alerting type of the alert events to query. Valid values:</p>
         * <ul>
         * <li><strong>Abnormal process behavior</strong></li>
         * <li><strong>Web shell</strong></li>
         * <li><strong>Unusual logon</strong></li>
         * <li><strong>Abnormal event</strong></li>
         * <li><strong>Sensitive file tampering</strong></li>
         * <li><strong>Malicious process (cloud scan)</strong></li>
         * <li><strong>Suspicious network connectivity</strong></li>
         * <li><strong>Abnormal account</strong></li>
         * <li><strong>Application intrusion event</strong></li>
         * <li><strong>Cloud service threat detection</strong></li>
         * <li><strong>Precise defense</strong></li>
         * <li><strong>Application whitelist</strong></li>
         * <li><strong>Persistent backdoor</strong></li>
         * <li><strong>Web application threat detection</strong></li>
         * <li><strong>Malicious script</strong></li>
         * <li><strong>Threat intelligence</strong></li>
         * <li><strong>Malicious network behavior</strong></li>
         * <li><strong>Container cluster exception</strong></li>
         * <li><strong>Web shell (local scan)</strong></li>
         * <li><strong>Vulnerability exploits</strong></li>
         * <li><strong>Malicious process (local scan)</strong></li>
         * <li><strong>Trusted exception</strong></li>
         * <li><strong>Other</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>other</p>
         */
        public Builder parentEventTypes(String parentEventTypes) {
            this.putQueryParameter("ParentEventTypes", parentEventTypes);
            this.parentEventTypes = parentEventTypes;
            return this;
        }

        /**
         * <p>The alert name or asset information to query.</p>
         * <blockquote>
         * <p>Fuzzy match is supported. Asset information includes the asset name, public IP address, and private IP address.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>192.168.XX.XX</p>
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        /**
         * <p>The Alibaba Cloud account ID of the member accounts in the resource directory.</p>
         * <blockquote>
         * <p>Call the <a href="~~DescribeMonitorAccounts~~">DescribeMonitorAccounts</a> operation to obtain this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>16670360956*****</p>
         */
        public Builder resourceDirectoryAccountId(Long resourceDirectoryAccountId) {
            this.putQueryParameter("ResourceDirectoryAccountId", resourceDirectoryAccountId);
            this.resourceDirectoryAccountId = resourceDirectoryAccountId;
            return this;
        }

        /**
         * <p>The custom sort field. Default value: <strong>operateTime</strong>. Valid values:</p>
         * <ul>
         * <li><strong>lastTime</strong>: Latest occurrence time.</li>
         * <li><strong>operateTime</strong>: Handling time.</li>
         * </ul>
         * <blockquote>
         * <p>This field takes effect only when <strong>Dealed</strong> is set to Y.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>operateTime</p>
         */
        public Builder sortColumn(String sortColumn) {
            this.putQueryParameter("SortColumn", sortColumn);
            this.sortColumn = sortColumn;
            return this;
        }

        /**
         * <p>The custom sort order. Default value: <strong>desc</strong>. Valid values:</p>
         * <ul>
         * <li><strong>asc</strong>: Ascending order.</li>
         * <li><strong>desc</strong>: Descending order.</li>
         * </ul>
         * <blockquote>
         * <p>This field takes effect only when <strong>Dealed</strong> is set to Y.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>desc</p>
         */
        public Builder sortType(String sortType) {
            this.putQueryParameter("SortType", sortType);
            this.sortType = sortType;
            return this;
        }

        /**
         * <p>The alert source.</p>
         * 
         * <strong>example:</strong>
         * <p>aegis_suspicious_file_v2</p>
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        /**
         * <p>The list of Alibaba Cloud account IDs that generated the alerts.</p>
         */
        public Builder sourceAliUids(java.util.List<Long> sourceAliUids) {
            String sourceAliUidsShrink = shrink(sourceAliUids, "SourceAliUids", "simple");
            this.putQueryParameter("SourceAliUids", sourceAliUidsShrink);
            this.sourceAliUids = sourceAliUids;
            return this;
        }

        /**
         * <p>The IP address of the access source.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.XX.XX</p>
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * <p>The status of the alert events to query. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: All.</li>
         * <li><strong>1</strong>: Unhandled.</li>
         * <li><strong>2</strong>: Ignored.</li>
         * <li><strong>4</strong>: Confirmed.</li>
         * <li><strong>8</strong>: Marked as false positive.</li>
         * <li><strong>16</strong>: Handling.</li>
         * <li><strong>32</strong>: Handled.</li>
         * <li><strong>64</strong>: Expired.</li>
         * <li><strong>128</strong>: Deleted.</li>
         * <li><strong>512</strong>: Automatic blocking in progress.</li>
         * <li><strong>513</strong>: Automatic blocking completed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>Specifies whether the alert is in strict mode. Valid values:</p>
         * <ul>
         * <li>N: No.</li>
         * <li>Y: Yes.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Y</p>
         */
        public Builder strictMode(String strictMode) {
            this.putQueryParameter("StrictMode", strictMode);
            this.strictMode = strictMode;
            return this;
        }

        /**
         * <p>The list of operation types supported by the alert.</p>
         */
        public Builder supportOperateCodeList(java.util.List<String> supportOperateCodeList) {
            this.putQueryParameter("SupportOperateCodeList", supportOperateCodeList);
            this.supportOperateCodeList = supportOperateCodeList;
            return this;
        }

        /**
         * <p>The ATT&amp;CK tactic ID.</p>
         * 
         * <strong>example:</strong>
         * <p>TA0001</p>
         */
        public Builder tacticId(String tacticId) {
            this.putBodyParameter("TacticId", tacticId);
            this.tacticId = tacticId;
            return this;
        }

        /**
         * <p>The target type for container search. Valid values:</p>
         * <ul>
         * <li><strong>containerId</strong>: container ID</li>
         * <li><strong>uuid</strong>: server UUID</li>
         * <li><strong>imageUuid</strong>: image UUID</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>containerId</p>
         */
        public Builder targetType(String targetType) {
            this.putQueryParameter("TargetType", targetType);
            this.targetType = targetType;
            return this;
        }

        /**
         * <p>The end time of the latest occurrence. Format: YYYY-MM-DD HH:mm:ss.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-07-06 13:50:38</p>
         */
        public Builder timeEnd(String timeEnd) {
            this.putQueryParameter("TimeEnd", timeEnd);
            this.timeEnd = timeEnd;
            return this;
        }

        /**
         * <p>The start time of the latest occurrence. Format: YYYY-MM-DD HH:mm:ss.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-07-05 13:50:38</p>
         */
        public Builder timeStart(String timeStart) {
            this.putQueryParameter("TimeStart", timeStart);
            this.timeStart = timeStart;
            return this;
        }

        /**
         * <p>The unique key of the security alert.</p>
         * 
         * <strong>example:</strong>
         * <p>73fc06fb175a7405697e402f52864****</p>
         */
        public Builder uniqueInfo(String uniqueInfo) {
            this.putQueryParameter("UniqueInfo", uniqueInfo);
            this.uniqueInfo = uniqueInfo;
            return this;
        }

        /**
         * <p>The UUIDs of the servers for which you want to query alerts. Separate multiple UUIDs with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>bb5d2484-f10e-450d-8917-3e79667e****,0e7c2fcd-7100-42c7-a21a-db6e4f32****</p>
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
