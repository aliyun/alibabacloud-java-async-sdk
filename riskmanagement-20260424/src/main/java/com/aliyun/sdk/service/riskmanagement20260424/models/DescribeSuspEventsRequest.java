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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * SdkRequest.
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
             * AlarmUniqueInfo.
             */
            public Builder alarmUniqueInfo(String alarmUniqueInfo) {
                this.alarmUniqueInfo = alarmUniqueInfo;
                return this;
            }

            /**
             * AssetsTypeList.
             */
            public Builder assetsTypeList(java.util.List<String> assetsTypeList) {
                this.assetsTypeList = assetsTypeList;
                return this;
            }

            /**
             * ClusterId.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * ContainerFieldName.
             */
            public Builder containerFieldName(String containerFieldName) {
                this.containerFieldName = containerFieldName;
                return this;
            }

            /**
             * ContainerFieldValue.
             */
            public Builder containerFieldValue(String containerFieldValue) {
                this.containerFieldValue = containerFieldValue;
                return this;
            }

            /**
             * CurrentPage.
             */
            public Builder currentPage(String currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * Dealed.
             */
            public Builder dealed(String dealed) {
                this.dealed = dealed;
                return this;
            }

            /**
             * DetectSource.
             */
            public Builder detectSource(String detectSource) {
                this.detectSource = detectSource;
                return this;
            }

            /**
             * EventNames.
             */
            public Builder eventNames(String eventNames) {
                this.eventNames = eventNames;
                return this;
            }

            /**
             * From.
             */
            public Builder from(String from) {
                this.from = from;
                return this;
            }

            /**
             * GroupId.
             */
            public Builder groupId(Long groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * Lang.
             */
            public Builder lang(String lang) {
                this.lang = lang;
                return this;
            }

            /**
             * Levels.
             */
            public Builder levels(String levels) {
                this.levels = levels;
                return this;
            }

            /**
             * MultiAccountActionType.
             */
            public Builder multiAccountActionType(Integer multiAccountActionType) {
                this.multiAccountActionType = multiAccountActionType;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * OperateErrorCodeList.
             */
            public Builder operateErrorCodeList(java.util.List<String> operateErrorCodeList) {
                this.operateErrorCodeList = operateErrorCodeList;
                return this;
            }

            /**
             * OperateTimeEnd.
             */
            public Builder operateTimeEnd(String operateTimeEnd) {
                this.operateTimeEnd = operateTimeEnd;
                return this;
            }

            /**
             * OperateTimeStart.
             */
            public Builder operateTimeStart(String operateTimeStart) {
                this.operateTimeStart = operateTimeStart;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(String pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * ParentEventTypes.
             */
            public Builder parentEventTypes(String parentEventTypes) {
                this.parentEventTypes = parentEventTypes;
                return this;
            }

            /**
             * Remark.
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * ResourceDirectoryAccountId.
             */
            public Builder resourceDirectoryAccountId(Long resourceDirectoryAccountId) {
                this.resourceDirectoryAccountId = resourceDirectoryAccountId;
                return this;
            }

            /**
             * SortColumn.
             */
            public Builder sortColumn(String sortColumn) {
                this.sortColumn = sortColumn;
                return this;
            }

            /**
             * SortType.
             */
            public Builder sortType(String sortType) {
                this.sortType = sortType;
                return this;
            }

            /**
             * Source.
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * SourceAliUids.
             */
            public Builder sourceAliUids(java.util.List<Long> sourceAliUids) {
                this.sourceAliUids = sourceAliUids;
                return this;
            }

            /**
             * SourceIp.
             */
            public Builder sourceIp(String sourceIp) {
                this.sourceIp = sourceIp;
                return this;
            }

            /**
             * StrictMode.
             */
            public Builder strictMode(String strictMode) {
                this.strictMode = strictMode;
                return this;
            }

            /**
             * SupportOperateCodeList.
             */
            public Builder supportOperateCodeList(java.util.List<String> supportOperateCodeList) {
                this.supportOperateCodeList = supportOperateCodeList;
                return this;
            }

            /**
             * TacticId.
             */
            public Builder tacticId(String tacticId) {
                this.tacticId = tacticId;
                return this;
            }

            /**
             * TargetType.
             */
            public Builder targetType(String targetType) {
                this.targetType = targetType;
                return this;
            }

            /**
             * TimeEnd.
             */
            public Builder timeEnd(String timeEnd) {
                this.timeEnd = timeEnd;
                return this;
            }

            /**
             * TimeStart.
             */
            public Builder timeStart(String timeStart) {
                this.timeStart = timeStart;
                return this;
            }

            /**
             * UniqueInfo.
             */
            public Builder uniqueInfo(String uniqueInfo) {
                this.uniqueInfo = uniqueInfo;
                return this;
            }

            /**
             * Uuids.
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
