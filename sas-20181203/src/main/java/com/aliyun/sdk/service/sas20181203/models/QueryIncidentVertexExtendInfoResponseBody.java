// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryIncidentVertexExtendInfoResponseBody} extends {@link TeaModel}
 *
 * <p>QueryIncidentVertexExtendInfoResponseBody</p>
 */
public class QueryIncidentVertexExtendInfoResponseBody extends TeaModel {
    @NameInMap("Count")
    private String count;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("VertexExtendInfo")
    private java.util.List < VertexExtendInfo> vertexExtendInfo;

    private QueryIncidentVertexExtendInfoResponseBody(Builder builder) {
        this.count = builder.count;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.vertexExtendInfo = builder.vertexExtendInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryIncidentVertexExtendInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return count
     */
    public String getCount() {
        return this.count;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return vertexExtendInfo
     */
    public java.util.List < VertexExtendInfo> getVertexExtendInfo() {
        return this.vertexExtendInfo;
    }

    public static final class Builder {
        private String count; 
        private String requestId; 
        private Boolean success; 
        private java.util.List < VertexExtendInfo> vertexExtendInfo; 

        /**
         * The total number of entries returned.
         */
        public Builder count(String count) {
            this.count = count;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false**
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * The returned extended information about the node.
         */
        public Builder vertexExtendInfo(java.util.List < VertexExtendInfo> vertexExtendInfo) {
            this.vertexExtendInfo = vertexExtendInfo;
            return this;
        }

        public QueryIncidentVertexExtendInfoResponseBody build() {
            return new QueryIncidentVertexExtendInfoResponseBody(this);
        } 

    } 

    public static class DisplayInfo extends TeaModel {
        @NameInMap("Name")
        private String name;

        @NameInMap("Value")
        private String value;

        private DisplayInfo(Builder builder) {
            this.name = builder.name;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DisplayInfo create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String name; 
            private String value; 

            /**
             * The display name of the property.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The display value of the property.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public DisplayInfo build() {
                return new DisplayInfo(this);
            } 

        } 

    }
    public static class NeighborList extends TeaModel {
        @NameInMap("Count")
        private Integer count;

        @NameInMap("HasMore")
        private Boolean hasMore;

        @NameInMap("Type")
        private String type;

        private NeighborList(Builder builder) {
            this.count = builder.count;
            this.hasMore = builder.hasMore;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NeighborList create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return hasMore
         */
        public Boolean getHasMore() {
            return this.hasMore;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Integer count; 
            private Boolean hasMore; 
            private String type; 

            /**
             * The number of nodes.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * Indicates whether more neighboring nodes exist. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder hasMore(Boolean hasMore) {
                this.hasMore = hasMore;
                return this;
            }

            /**
             * The node type. Valid values include but are not limited to:
             * <p>
             * 
             * *   **process**
             * *   **file**
             * *   **alert**
             * *   **ip**
             * *   **domain**
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public NeighborList build() {
                return new NeighborList(this);
            } 

        } 

    }
    public static class Property extends TeaModel {
        @NameInMap("AlertDesc")
        private String alertDesc;

        @NameInMap("AlertDetail")
        private String alertDetail;

        @NameInMap("AlertLevel")
        private String alertLevel;

        @NameInMap("AlertName")
        private String alertName;

        @NameInMap("AlertNameCode")
        private String alertNameCode;

        @NameInMap("AlertNameEn")
        private String alertNameEn;

        @NameInMap("AlertSrcProd")
        private String alertSrcProd;

        @NameInMap("AlertSrcProdModule")
        private String alertSrcProdModule;

        @NameInMap("AlertTitle")
        private String alertTitle;

        @NameInMap("AlertType")
        private String alertType;

        @NameInMap("AlertTypeCode")
        private String alertTypeCode;

        @NameInMap("AlertTypeEn")
        private String alertTypeEn;

        @NameInMap("AlertUuid")
        private String alertUuid;

        @NameInMap("AssetList")
        private String assetList;

        @NameInMap("AttCk")
        private String attCk;

        @NameInMap("CloudCode")
        private String cloudCode;

        @NameInMap("EntityList")
        private String entityList;

        @NameInMap("GmtCreate")
        private String gmtCreate;

        @NameInMap("GmtModified")
        private String gmtModified;

        @NameInMap("LogTime")
        private String logTime;

        @NameInMap("LogUuid")
        private String logUuid;

        @NameInMap("MainUserId")
        private String mainUserId;

        @NameInMap("OccurTime")
        private String occurTime;

        @NameInMap("SubUserId")
        private String subUserId;

        private Property(Builder builder) {
            this.alertDesc = builder.alertDesc;
            this.alertDetail = builder.alertDetail;
            this.alertLevel = builder.alertLevel;
            this.alertName = builder.alertName;
            this.alertNameCode = builder.alertNameCode;
            this.alertNameEn = builder.alertNameEn;
            this.alertSrcProd = builder.alertSrcProd;
            this.alertSrcProdModule = builder.alertSrcProdModule;
            this.alertTitle = builder.alertTitle;
            this.alertType = builder.alertType;
            this.alertTypeCode = builder.alertTypeCode;
            this.alertTypeEn = builder.alertTypeEn;
            this.alertUuid = builder.alertUuid;
            this.assetList = builder.assetList;
            this.attCk = builder.attCk;
            this.cloudCode = builder.cloudCode;
            this.entityList = builder.entityList;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.logTime = builder.logTime;
            this.logUuid = builder.logUuid;
            this.mainUserId = builder.mainUserId;
            this.occurTime = builder.occurTime;
            this.subUserId = builder.subUserId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Property create() {
            return builder().build();
        }

        /**
         * @return alertDesc
         */
        public String getAlertDesc() {
            return this.alertDesc;
        }

        /**
         * @return alertDetail
         */
        public String getAlertDetail() {
            return this.alertDetail;
        }

        /**
         * @return alertLevel
         */
        public String getAlertLevel() {
            return this.alertLevel;
        }

        /**
         * @return alertName
         */
        public String getAlertName() {
            return this.alertName;
        }

        /**
         * @return alertNameCode
         */
        public String getAlertNameCode() {
            return this.alertNameCode;
        }

        /**
         * @return alertNameEn
         */
        public String getAlertNameEn() {
            return this.alertNameEn;
        }

        /**
         * @return alertSrcProd
         */
        public String getAlertSrcProd() {
            return this.alertSrcProd;
        }

        /**
         * @return alertSrcProdModule
         */
        public String getAlertSrcProdModule() {
            return this.alertSrcProdModule;
        }

        /**
         * @return alertTitle
         */
        public String getAlertTitle() {
            return this.alertTitle;
        }

        /**
         * @return alertType
         */
        public String getAlertType() {
            return this.alertType;
        }

        /**
         * @return alertTypeCode
         */
        public String getAlertTypeCode() {
            return this.alertTypeCode;
        }

        /**
         * @return alertTypeEn
         */
        public String getAlertTypeEn() {
            return this.alertTypeEn;
        }

        /**
         * @return alertUuid
         */
        public String getAlertUuid() {
            return this.alertUuid;
        }

        /**
         * @return assetList
         */
        public String getAssetList() {
            return this.assetList;
        }

        /**
         * @return attCk
         */
        public String getAttCk() {
            return this.attCk;
        }

        /**
         * @return cloudCode
         */
        public String getCloudCode() {
            return this.cloudCode;
        }

        /**
         * @return entityList
         */
        public String getEntityList() {
            return this.entityList;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return logTime
         */
        public String getLogTime() {
            return this.logTime;
        }

        /**
         * @return logUuid
         */
        public String getLogUuid() {
            return this.logUuid;
        }

        /**
         * @return mainUserId
         */
        public String getMainUserId() {
            return this.mainUserId;
        }

        /**
         * @return occurTime
         */
        public String getOccurTime() {
            return this.occurTime;
        }

        /**
         * @return subUserId
         */
        public String getSubUserId() {
            return this.subUserId;
        }

        public static final class Builder {
            private String alertDesc; 
            private String alertDetail; 
            private String alertLevel; 
            private String alertName; 
            private String alertNameCode; 
            private String alertNameEn; 
            private String alertSrcProd; 
            private String alertSrcProdModule; 
            private String alertTitle; 
            private String alertType; 
            private String alertTypeCode; 
            private String alertTypeEn; 
            private String alertUuid; 
            private String assetList; 
            private String attCk; 
            private String cloudCode; 
            private String entityList; 
            private String gmtCreate; 
            private String gmtModified; 
            private String logTime; 
            private String logUuid; 
            private String mainUserId; 
            private String occurTime; 
            private String subUserId; 

            /**
             * The alert description.
             */
            public Builder alertDesc(String alertDesc) {
                this.alertDesc = alertDesc;
                return this;
            }

            /**
             * The details of the alert.
             */
            public Builder alertDetail(String alertDetail) {
                this.alertDetail = alertDetail;
                return this;
            }

            /**
             * The alert level. Valid values:
             * <p>
             * 
             * *   **serious**
             * *   **suspicious**
             * *   **remind**
             */
            public Builder alertLevel(String alertLevel) {
                this.alertLevel = alertLevel;
                return this;
            }

            /**
             * The alert name.
             */
            public Builder alertName(String alertName) {
                this.alertName = alertName;
                return this;
            }

            /**
             * The code of the alert name.
             */
            public Builder alertNameCode(String alertNameCode) {
                this.alertNameCode = alertNameCode;
                return this;
            }

            /**
             * The alert name. The value is in English.
             */
            public Builder alertNameEn(String alertNameEn) {
                this.alertNameEn = alertNameEn;
                return this;
            }

            /**
             * The service that generates the alert.
             */
            public Builder alertSrcProd(String alertSrcProd) {
                this.alertSrcProd = alertSrcProd;
                return this;
            }

            /**
             * The module of the service that generates the alert.
             */
            public Builder alertSrcProdModule(String alertSrcProdModule) {
                this.alertSrcProdModule = alertSrcProdModule;
                return this;
            }

            /**
             * The alert title.
             */
            public Builder alertTitle(String alertTitle) {
                this.alertTitle = alertTitle;
                return this;
            }

            /**
             * The alert type.
             */
            public Builder alertType(String alertType) {
                this.alertType = alertType;
                return this;
            }

            /**
             * The code of the alert type.
             */
            public Builder alertTypeCode(String alertTypeCode) {
                this.alertTypeCode = alertTypeCode;
                return this;
            }

            /**
             * The alert type. The value is in English.
             */
            public Builder alertTypeEn(String alertTypeEn) {
                this.alertTypeEn = alertTypeEn;
                return this;
            }

            /**
             * The alert ID.
             */
            public Builder alertUuid(String alertUuid) {
                this.alertUuid = alertUuid;
                return this;
            }

            /**
             * The assets.
             */
            public Builder assetList(String assetList) {
                this.assetList = assetList;
                return this;
            }

            /**
             * ATT\&CK
             */
            public Builder attCk(String attCk) {
                this.attCk = attCk;
                return this;
            }

            /**
             * The code of the cloud service provider.
             */
            public Builder cloudCode(String cloudCode) {
                this.cloudCode = cloudCode;
                return this;
            }

            /**
             * The instance.
             */
            public Builder entityList(String entityList) {
                this.entityList = entityList;
                return this;
            }

            /**
             * The creation time.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * The modification time.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * The time when the log was generated.
             */
            public Builder logTime(String logTime) {
                this.logTime = logTime;
                return this;
            }

            /**
             * The log ID.
             */
            public Builder logUuid(String logUuid) {
                this.logUuid = logUuid;
                return this;
            }

            /**
             * The ID of the master account.
             */
            public Builder mainUserId(String mainUserId) {
                this.mainUserId = mainUserId;
                return this;
            }

            /**
             * The time when the alert was generated.
             */
            public Builder occurTime(String occurTime) {
                this.occurTime = occurTime;
                return this;
            }

            /**
             * The ID of the sub-account.
             */
            public Builder subUserId(String subUserId) {
                this.subUserId = subUserId;
                return this;
            }

            public Property build() {
                return new Property(this);
            } 

        } 

    }
    public static class VertexExtendInfo extends TeaModel {
        @NameInMap("Aliuid")
        private String aliuid;

        @NameInMap("DisplayInfo")
        private java.util.List < DisplayInfo> displayInfo;

        @NameInMap("Id")
        private String id;

        @NameInMap("Lang")
        private String lang;

        @NameInMap("Name")
        private String name;

        @NameInMap("NeighborList")
        private java.util.List < NeighborList> neighborList;

        @NameInMap("Properties")
        private String properties;

        @NameInMap("Property")
        private Property property;

        @NameInMap("RuleId")
        private String ruleId;

        @NameInMap("Time")
        private String time;

        @NameInMap("Timestamp")
        private Long timestamp;

        @NameInMap("Type")
        private String type;

        @NameInMap("Uuid")
        private String uuid;

        private VertexExtendInfo(Builder builder) {
            this.aliuid = builder.aliuid;
            this.displayInfo = builder.displayInfo;
            this.id = builder.id;
            this.lang = builder.lang;
            this.name = builder.name;
            this.neighborList = builder.neighborList;
            this.properties = builder.properties;
            this.property = builder.property;
            this.ruleId = builder.ruleId;
            this.time = builder.time;
            this.timestamp = builder.timestamp;
            this.type = builder.type;
            this.uuid = builder.uuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VertexExtendInfo create() {
            return builder().build();
        }

        /**
         * @return aliuid
         */
        public String getAliuid() {
            return this.aliuid;
        }

        /**
         * @return displayInfo
         */
        public java.util.List < DisplayInfo> getDisplayInfo() {
            return this.displayInfo;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return lang
         */
        public String getLang() {
            return this.lang;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return neighborList
         */
        public java.util.List < NeighborList> getNeighborList() {
            return this.neighborList;
        }

        /**
         * @return properties
         */
        public String getProperties() {
            return this.properties;
        }

        /**
         * @return property
         */
        public Property getProperty() {
            return this.property;
        }

        /**
         * @return ruleId
         */
        public String getRuleId() {
            return this.ruleId;
        }

        /**
         * @return time
         */
        public String getTime() {
            return this.time;
        }

        /**
         * @return timestamp
         */
        public Long getTimestamp() {
            return this.timestamp;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        public static final class Builder {
            private String aliuid; 
            private java.util.List < DisplayInfo> displayInfo; 
            private String id; 
            private String lang; 
            private String name; 
            private java.util.List < NeighborList> neighborList; 
            private String properties; 
            private Property property; 
            private String ruleId; 
            private String time; 
            private Long timestamp; 
            private String type; 
            private String uuid; 

            /**
             * The ID of the Alibaba Cloud account.
             */
            public Builder aliuid(String aliuid) {
                this.aliuid = aliuid;
                return this;
            }

            /**
             * The display information.
             */
            public Builder displayInfo(java.util.List < DisplayInfo> displayInfo) {
                this.displayInfo = displayInfo;
                return this;
            }

            /**
             * The node ID.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * The language of the content within the response. Valid values:
             * <p>
             * 
             * *   **zh**: Chinese
             * *   **en**: English
             */
            public Builder lang(String lang) {
                this.lang = lang;
                return this;
            }

            /**
             * The node name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The neighboring nodes.
             */
            public Builder neighborList(java.util.List < NeighborList> neighborList) {
                this.neighborList = neighborList;
                return this;
            }

            /**
             * The node properties. The value is in the text format.
             */
            public Builder properties(String properties) {
                this.properties = properties;
                return this;
            }

            /**
             * The node property.
             */
            public Builder property(Property property) {
                this.property = property;
                return this;
            }

            /**
             * The ID of the rule for which the node was created.
             */
            public Builder ruleId(String ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * The time when the node was created.
             */
            public Builder time(String time) {
                this.time = time;
                return this;
            }

            /**
             * The UNIX timestamp when the node was created. Unit: milliseconds.
             */
            public Builder timestamp(Long timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            /**
             * The node type. Valid values include but are not limited to:
             * <p>
             * 
             * *   **process**
             * *   **file**
             * *   **alert**
             * *   **ip**
             * *   **domain**
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The node UUID.
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            public VertexExtendInfo build() {
                return new VertexExtendInfo(this);
            } 

        } 

    }
}
