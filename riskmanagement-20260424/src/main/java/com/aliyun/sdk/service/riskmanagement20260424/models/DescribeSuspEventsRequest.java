// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.riskmanagement20260424.models;

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
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SdkRequest")
    private SdkRequest sdkRequest;

    private DescribeSuspEventsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.sdkRequest = builder.sdkRequest;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return sdkRequest
     */
    public SdkRequest getSdkRequest() {
        return this.sdkRequest;
    }

    public static final class Builder extends Request.Builder<DescribeSuspEventsRequest, Builder> {
        private String regionId; 
        private SdkRequest sdkRequest; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSuspEventsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.sdkRequest = request.sdkRequest;
        } 

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-guangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The Security Center SDK request parameters.</p>
         */
        public Builder sdkRequest(SdkRequest sdkRequest) {
            String sdkRequestShrink = shrink(sdkRequest, "SdkRequest", "json");
            this.putQueryParameter("SdkRequest", sdkRequestShrink);
            this.sdkRequest = sdkRequest;
            return this;
        }

        @Override
        public DescribeSuspEventsRequest build() {
            return new DescribeSuspEventsRequest(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSuspEventsRequest} extends {@link TeaModel}
     *
     * <p>DescribeSuspEventsRequest</p>
     */
    public static class SdkRequest extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlarmUniqueInfo")
        private String alarmUniqueInfo;

        @com.aliyun.core.annotation.NameInMap("AssetsTypeList")
        private java.util.List<String> assetsTypeList;

        @com.aliyun.core.annotation.NameInMap("ClusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("ContainerFieldName")
        private String containerFieldName;

        @com.aliyun.core.annotation.NameInMap("ContainerFieldValue")
        private String containerFieldValue;

        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private String currentPage;

        @com.aliyun.core.annotation.NameInMap("Dealed")
        private String dealed;

        @com.aliyun.core.annotation.NameInMap("DetectSource")
        private String detectSource;

        @com.aliyun.core.annotation.NameInMap("EventNames")
        private String eventNames;

        @com.aliyun.core.annotation.NameInMap("From")
        private String from;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private Long groupId;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Lang")
        private String lang;

        @com.aliyun.core.annotation.NameInMap("Levels")
        private String levels;

        @com.aliyun.core.annotation.NameInMap("MultiAccountActionType")
        private Integer multiAccountActionType;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("OperateErrorCodeList")
        private java.util.List<String> operateErrorCodeList;

        @com.aliyun.core.annotation.NameInMap("OperateTimeEnd")
        private String operateTimeEnd;

        @com.aliyun.core.annotation.NameInMap("OperateTimeStart")
        private String operateTimeStart;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private String pageSize;

        @com.aliyun.core.annotation.NameInMap("ParentEventTypes")
        private String parentEventTypes;

        @com.aliyun.core.annotation.NameInMap("Remark")
        private String remark;

        @com.aliyun.core.annotation.NameInMap("ResourceDirectoryAccountId")
        private Long resourceDirectoryAccountId;

        @com.aliyun.core.annotation.NameInMap("SortColumn")
        private String sortColumn;

        @com.aliyun.core.annotation.NameInMap("SortType")
        private String sortType;

        @com.aliyun.core.annotation.NameInMap("Source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("SourceAliUids")
        private java.util.List<Long> sourceAliUids;

        @com.aliyun.core.annotation.NameInMap("SourceIp")
        private String sourceIp;

        @com.aliyun.core.annotation.NameInMap("StrictMode")
        private String strictMode;

        @com.aliyun.core.annotation.NameInMap("SupportOperateCodeList")
        private java.util.List<String> supportOperateCodeList;

        @com.aliyun.core.annotation.NameInMap("TacticId")
        private String tacticId;

        @com.aliyun.core.annotation.NameInMap("TargetType")
        private String targetType;

        @com.aliyun.core.annotation.NameInMap("TimeEnd")
        private String timeEnd;

        @com.aliyun.core.annotation.NameInMap("TimeStart")
        private String timeStart;

        @com.aliyun.core.annotation.NameInMap("UniqueInfo")
        private String uniqueInfo;

        @com.aliyun.core.annotation.NameInMap("Uuids")
        private String uuids;

        private SdkRequest(Builder builder) {
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

        public static SdkRequest create() {
            return builder().build();
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

        public static final class Builder {
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
            private String strictMode; 
            private java.util.List<String> supportOperateCodeList; 
            private String tacticId; 
            private String targetType; 
            private String timeEnd; 
            private String timeStart; 
            private String uniqueInfo; 
            private String uuids; 

            private Builder() {
            } 

            private Builder(SdkRequest model) {
                this.alarmUniqueInfo = model.alarmUniqueInfo;
                this.assetsTypeList = model.assetsTypeList;
                this.clusterId = model.clusterId;
                this.containerFieldName = model.containerFieldName;
                this.containerFieldValue = model.containerFieldValue;
                this.currentPage = model.currentPage;
                this.dealed = model.dealed;
                this.detectSource = model.detectSource;
                this.eventNames = model.eventNames;
                this.from = model.from;
                this.groupId = model.groupId;
                this.id = model.id;
                this.lang = model.lang;
                this.levels = model.levels;
                this.multiAccountActionType = model.multiAccountActionType;
                this.name = model.name;
                this.operateErrorCodeList = model.operateErrorCodeList;
                this.operateTimeEnd = model.operateTimeEnd;
                this.operateTimeStart = model.operateTimeStart;
                this.pageSize = model.pageSize;
                this.parentEventTypes = model.parentEventTypes;
                this.remark = model.remark;
                this.resourceDirectoryAccountId = model.resourceDirectoryAccountId;
                this.sortColumn = model.sortColumn;
                this.sortType = model.sortType;
                this.source = model.source;
                this.sourceAliUids = model.sourceAliUids;
                this.sourceIp = model.sourceIp;
                this.strictMode = model.strictMode;
                this.supportOperateCodeList = model.supportOperateCodeList;
                this.tacticId = model.tacticId;
                this.targetType = model.targetType;
                this.timeEnd = model.timeEnd;
                this.timeStart = model.timeStart;
                this.uniqueInfo = model.uniqueInfo;
                this.uuids = model.uuids;
            } 

            /**
             * <p>The unique ID of the alert event.</p>
             * 
             * <strong>example:</strong>
             * <p>6838133766c37077d0515b0b557e6510</p>
             */
            public Builder alarmUniqueInfo(String alarmUniqueInfo) {
                this.alarmUniqueInfo = alarmUniqueInfo;
                return this;
            }

            /**
             * <p>The list of asset types.</p>
             */
            public Builder assetsTypeList(java.util.List<String> assetsTypeList) {
                this.assetsTypeList = assetsTypeList;
                return this;
            }

            /**
             * <p>The cluster ID.</p>
             * 
             * <strong>example:</strong>
             * <p>xxljob-02f023138826b</p>
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * <p>The container search field. Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>instanceId</p>
             */
            public Builder containerFieldName(String containerFieldName) {
                this.containerFieldName = containerFieldName;
                return this;
            }

            /**
             * <p>The value of the container search field.</p>
             * 
             * <strong>example:</strong>
             * <p>ca9b91db58356b41af2932e8048310ab7daa415701fa62d823cf4f0406d5ce02</p>
             */
            public Builder containerFieldValue(String containerFieldValue) {
                this.containerFieldValue = containerFieldValue;
                return this;
            }

            /**
             * <p>The current page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder currentPage(String currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * <p>The status of the alert event.</p>
             * 
             * <strong>example:</strong>
             * <p>Y</p>
             */
            public Builder dealed(String dealed) {
                this.dealed = dealed;
                return this;
            }

            /**
             * <p>The detection source. This is an invalid field.</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder detectSource(String detectSource) {
                this.detectSource = detectSource;
                return this;
            }

            /**
             * <p>The subtypes of the alert event. Separate multiple subtypes with commas (,).</p>
             * 
             * <strong>example:</strong>
             * <p>WEBSHELL</p>
             */
            public Builder eventNames(String eventNames) {
                this.eventNames = eventNames;
                return this;
            }

            /**
             * <p>The request source identifier. Set the value to <strong>sas</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>sas</p>
             */
            public Builder from(String from) {
                this.from = from;
                return this;
            }

            /**
             * <p>The tag group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>18768</p>
             */
            public Builder groupId(Long groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>The unique ID that identifies the alert event record.</p>
             * 
             * <strong>example:</strong>
             * <p>3165</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The language type of the response. Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>zh</p>
             */
            public Builder lang(String lang) {
                this.lang = lang;
                return this;
            }

            /**
             * <p>The severity levels of the alert event. Separate multiple levels with commas (in descending order of severity).</p>
             * 
             * <strong>example:</strong>
             * <p>serious</p>
             */
            public Builder levels(String levels) {
                this.levels = levels;
                return this;
            }

            /**
             * <p>The multi-account query type. Default value: <strong>0</strong>. Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder multiAccountActionType(Integer multiAccountActionType) {
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
                this.name = name;
                return this;
            }

            /**
             * <p>The list of alert event handling result codes.</p>
             */
            public Builder operateErrorCodeList(java.util.List<String> operateErrorCodeList) {
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
                this.operateTimeEnd = operateTimeEnd;
                return this;
            }

            /**
             * <p>The start timestamp of the handling time.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-07-06 13:50:38</p>
             */
            public Builder operateTimeStart(String operateTimeStart) {
                this.operateTimeStart = operateTimeStart;
                return this;
            }

            /**
             * <p>The maximum number of entries per page in a paged query.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageSize(String pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The Alarm Metric of the alerting events to query. Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>Malicious Scripts.</p>
             */
            public Builder parentEventTypes(String parentEventTypes) {
                this.parentEventTypes = parentEventTypes;
                return this;
            }

            /**
             * <p>The alert name or asset information to query.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.XX.XX</p>
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * <p>The Alibaba Cloud account ID of the member accounts in the resource folder.</p>
             * 
             * <strong>example:</strong>
             * <p>5815612291408486</p>
             */
            public Builder resourceDirectoryAccountId(Long resourceDirectoryAccountId) {
                this.resourceDirectoryAccountId = resourceDirectoryAccountId;
                return this;
            }

            /**
             * <p>The custom sort field. Default value: <strong>operateTime</strong>. Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>lastTime</p>
             */
            public Builder sortColumn(String sortColumn) {
                this.sortColumn = sortColumn;
                return this;
            }

            /**
             * <p>The sort order based on certificate expiration time.</p>
             * 
             * <strong>example:</strong>
             * <p>asc</p>
             */
            public Builder sortType(String sortType) {
                this.sortType = sortType;
                return this;
            }

            /**
             * <p>The alert source.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * <p>The list of Alibaba Cloud account IDs that generated the alerts.</p>
             */
            public Builder sourceAliUids(java.util.List<Long> sourceAliUids) {
                this.sourceAliUids = sourceAliUids;
                return this;
            }

            /**
             * <p>The IP address of the access source.</p>
             * 
             * <strong>example:</strong>
             * <p>2409:8a55:3827:cb50:5ad9:d5ff:fe87:f48c</p>
             */
            public Builder sourceIp(String sourceIp) {
                this.sourceIp = sourceIp;
                return this;
            }

            /**
             * <p>Indicates whether the alert belongs to strict mode.</p>
             * 
             * <strong>example:</strong>
             * <p>N</p>
             */
            public Builder strictMode(String strictMode) {
                this.strictMode = strictMode;
                return this;
            }

            /**
             * <p>The list of operation types supported by the alert.</p>
             */
            public Builder supportOperateCodeList(java.util.List<String> supportOperateCodeList) {
                this.supportOperateCodeList = supportOperateCodeList;
                return this;
            }

            /**
             * <p>The ATT&amp;CK tactic ID.</p>
             * 
             * <strong>example:</strong>
             * <p>TA0003</p>
             */
            public Builder tacticId(String tacticId) {
                this.tacticId = tacticId;
                return this;
            }

            /**
             * <p>The container search target type. Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>containerId</p>
             */
            public Builder targetType(String targetType) {
                this.targetType = targetType;
                return this;
            }

            /**
             * <p>The end time of the latest occurrence time.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-07-06 13:50:38</p>
             */
            public Builder timeEnd(String timeEnd) {
                this.timeEnd = timeEnd;
                return this;
            }

            /**
             * <p>The start time of the latest occurrence time.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-07-06 13:50:38</p>
             */
            public Builder timeStart(String timeStart) {
                this.timeStart = timeStart;
                return this;
            }

            /**
             * <p>The unique key of the security alert.</p>
             * 
             * <strong>example:</strong>
             * <p>f82680d9fdcb74a520fa385b7e9105b7</p>
             */
            public Builder uniqueInfo(String uniqueInfo) {
                this.uniqueInfo = uniqueInfo;
                return this;
            }

            /**
             * <p>The UUIDs of the servers for which to query alerts. Separate multiple UUIDs with commas (,).</p>
             * 
             * <strong>example:</strong>
             * <p>inet-eae09bb8-32b1-413b-a8ff-23932e043209</p>
             */
            public Builder uuids(String uuids) {
                this.uuids = uuids;
                return this;
            }

            public SdkRequest build() {
                return new SdkRequest(this);
            } 

        } 

    }
}
