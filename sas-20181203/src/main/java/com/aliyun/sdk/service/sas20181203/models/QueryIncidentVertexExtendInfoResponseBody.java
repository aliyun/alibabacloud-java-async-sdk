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
 * {@link QueryIncidentVertexExtendInfoResponseBody} extends {@link TeaModel}
 *
 * <p>QueryIncidentVertexExtendInfoResponseBody</p>
 */
public class QueryIncidentVertexExtendInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Count")
    private String count;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("VertexExtendInfo")
    private java.util.List<VertexExtendInfo> vertexExtendInfo;

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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<VertexExtendInfo> getVertexExtendInfo() {
        return this.vertexExtendInfo;
    }

    public static final class Builder {
        private String count; 
        private String requestId; 
        private Boolean success; 
        private java.util.List<VertexExtendInfo> vertexExtendInfo; 

        private Builder() {
        } 

        private Builder(QueryIncidentVertexExtendInfoResponseBody model) {
            this.count = model.count;
            this.requestId = model.requestId;
            this.success = model.success;
            this.vertexExtendInfo = model.vertexExtendInfo;
        } 

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder count(String count) {
            this.count = count;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0BCDBBF1-0048-535A-8529-67EA0CD1A807</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The returned extended information about the node.</p>
         */
        public Builder vertexExtendInfo(java.util.List<VertexExtendInfo> vertexExtendInfo) {
            this.vertexExtendInfo = vertexExtendInfo;
            return this;
        }

        public QueryIncidentVertexExtendInfoResponseBody build() {
            return new QueryIncidentVertexExtendInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryIncidentVertexExtendInfoResponseBody} extends {@link TeaModel}
     *
     * <p>QueryIncidentVertexExtendInfoResponseBody</p>
     */
    public static class DisplayInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Value")
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

            private Builder() {
            } 

            private Builder(DisplayInfo model) {
                this.name = model.name;
                this.value = model.value;
            } 

            /**
             * <p>The display name of the property.</p>
             * 
             * <strong>example:</strong>
             * <p>IDA</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The display value of the property.</p>
             * 
             * <strong>example:</strong>
             * <p>app:nxueo</p>
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
    /**
     * 
     * {@link QueryIncidentVertexExtendInfoResponseBody} extends {@link TeaModel}
     *
     * <p>QueryIncidentVertexExtendInfoResponseBody</p>
     */
    public static class NeighborList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("HasMore")
        private Boolean hasMore;

        @com.aliyun.core.annotation.NameInMap("Type")
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

            private Builder() {
            } 

            private Builder(NeighborList model) {
                this.count = model.count;
                this.hasMore = model.hasMore;
                this.type = model.type;
            } 

            /**
             * <p>The number of nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>Indicates whether more neighboring nodes exist. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>True</p>
             */
            public Builder hasMore(Boolean hasMore) {
                this.hasMore = hasMore;
                return this;
            }

            /**
             * <p>The node type. Valid values include but are not limited to:</p>
             * <ul>
             * <li><strong>process</strong></li>
             * <li><strong>file</strong></li>
             * <li><strong>alert</strong></li>
             * <li><strong>ip</strong></li>
             * <li><strong>domain</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>alidetect</p>
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
    /**
     * 
     * {@link QueryIncidentVertexExtendInfoResponseBody} extends {@link TeaModel}
     *
     * <p>QueryIncidentVertexExtendInfoResponseBody</p>
     */
    public static class Property extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlertDesc")
        private String alertDesc;

        @com.aliyun.core.annotation.NameInMap("AlertDetail")
        private String alertDetail;

        @com.aliyun.core.annotation.NameInMap("AlertLevel")
        private String alertLevel;

        @com.aliyun.core.annotation.NameInMap("AlertName")
        private String alertName;

        @com.aliyun.core.annotation.NameInMap("AlertNameCode")
        private String alertNameCode;

        @com.aliyun.core.annotation.NameInMap("AlertNameEn")
        private String alertNameEn;

        @com.aliyun.core.annotation.NameInMap("AlertSrcProd")
        private String alertSrcProd;

        @com.aliyun.core.annotation.NameInMap("AlertSrcProdModule")
        private String alertSrcProdModule;

        @com.aliyun.core.annotation.NameInMap("AlertTitle")
        private String alertTitle;

        @com.aliyun.core.annotation.NameInMap("AlertType")
        private String alertType;

        @com.aliyun.core.annotation.NameInMap("AlertTypeCode")
        private String alertTypeCode;

        @com.aliyun.core.annotation.NameInMap("AlertTypeEn")
        private String alertTypeEn;

        @com.aliyun.core.annotation.NameInMap("AlertUuid")
        private String alertUuid;

        @com.aliyun.core.annotation.NameInMap("AssetList")
        private String assetList;

        @com.aliyun.core.annotation.NameInMap("AttCk")
        private String attCk;

        @com.aliyun.core.annotation.NameInMap("CloudCode")
        private String cloudCode;

        @com.aliyun.core.annotation.NameInMap("EntityList")
        private String entityList;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("LogTime")
        private String logTime;

        @com.aliyun.core.annotation.NameInMap("LogUuid")
        private String logUuid;

        @com.aliyun.core.annotation.NameInMap("MainUserId")
        private String mainUserId;

        @com.aliyun.core.annotation.NameInMap("OccurTime")
        private String occurTime;

        @com.aliyun.core.annotation.NameInMap("SubUserId")
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

            private Builder() {
            } 

            private Builder(Property model) {
                this.alertDesc = model.alertDesc;
                this.alertDetail = model.alertDetail;
                this.alertLevel = model.alertLevel;
                this.alertName = model.alertName;
                this.alertNameCode = model.alertNameCode;
                this.alertNameEn = model.alertNameEn;
                this.alertSrcProd = model.alertSrcProd;
                this.alertSrcProdModule = model.alertSrcProdModule;
                this.alertTitle = model.alertTitle;
                this.alertType = model.alertType;
                this.alertTypeCode = model.alertTypeCode;
                this.alertTypeEn = model.alertTypeEn;
                this.alertUuid = model.alertUuid;
                this.assetList = model.assetList;
                this.attCk = model.attCk;
                this.cloudCode = model.cloudCode;
                this.entityList = model.entityList;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.logTime = model.logTime;
                this.logUuid = model.logUuid;
                this.mainUserId = model.mainUserId;
                this.occurTime = model.occurTime;
                this.subUserId = model.subUserId;
            } 

            /**
             * <p>The alert description.</p>
             * 
             * <strong>example:</strong>
             * <p>exploit</p>
             */
            public Builder alertDesc(String alertDesc) {
                this.alertDesc = alertDesc;
                return this;
            }

            /**
             * <p>The details of the alert.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder alertDetail(String alertDetail) {
                this.alertDetail = alertDetail;
                return this;
            }

            /**
             * <p>The alert level. Valid values:</p>
             * <ul>
             * <li><strong>serious</strong></li>
             * <li><strong>suspicious</strong></li>
             * <li><strong>remind</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>serious</p>
             */
            public Builder alertLevel(String alertLevel) {
                this.alertLevel = alertLevel;
                return this;
            }

            /**
             * <p>The alert name.</p>
             * 
             * <strong>example:</strong>
             * <p>pt_device_in_bps_down_alert</p>
             */
            public Builder alertName(String alertName) {
                this.alertName = alertName;
                return this;
            }

            /**
             * <p>The code of the alert name.</p>
             * 
             * <strong>example:</strong>
             * <p>6367</p>
             */
            public Builder alertNameCode(String alertNameCode) {
                this.alertNameCode = alertNameCode;
                return this;
            }

            /**
             * <p>The alert name. The value is in English.</p>
             * 
             * <strong>example:</strong>
             * <p>attack_alert</p>
             */
            public Builder alertNameEn(String alertNameEn) {
                this.alertNameEn = alertNameEn;
                return this;
            }

            /**
             * <p>The service that generates the alert.</p>
             * 
             * <strong>example:</strong>
             * <p>sas</p>
             */
            public Builder alertSrcProd(String alertSrcProd) {
                this.alertSrcProd = alertSrcProd;
                return this;
            }

            /**
             * <p>The module of the service that generates the alert.</p>
             * 
             * <strong>example:</strong>
             * <p>aegis</p>
             */
            public Builder alertSrcProdModule(String alertSrcProdModule) {
                this.alertSrcProdModule = alertSrcProdModule;
                return this;
            }

            /**
             * <p>The alert title.</p>
             * 
             * <strong>example:</strong>
             * <p>login_common_account</p>
             */
            public Builder alertTitle(String alertTitle) {
                this.alertTitle = alertTitle;
                return this;
            }

            /**
             * <p>The alert type.</p>
             * 
             * <strong>example:</strong>
             * <p>attack_alert</p>
             */
            public Builder alertType(String alertType) {
                this.alertType = alertType;
                return this;
            }

            /**
             * <p>The code of the alert type.</p>
             * 
             * <strong>example:</strong>
             * <p>112</p>
             */
            public Builder alertTypeCode(String alertTypeCode) {
                this.alertTypeCode = alertTypeCode;
                return this;
            }

            /**
             * <p>The alert type. The value is in English.</p>
             * 
             * <strong>example:</strong>
             * <p>attack_alert</p>
             */
            public Builder alertTypeEn(String alertTypeEn) {
                this.alertTypeEn = alertTypeEn;
                return this;
            }

            /**
             * <p>The alert ID.</p>
             * 
             * <strong>example:</strong>
             * <p>alert-abc4990f2e1948eb960a2bb7ac0****</p>
             */
            public Builder alertUuid(String alertUuid) {
                this.alertUuid = alertUuid;
                return this;
            }

            /**
             * <p>The assets.</p>
             * 
             * <strong>example:</strong>
             * <p>[]</p>
             */
            public Builder assetList(String assetList) {
                this.assetList = assetList;
                return this;
            }

            /**
             * <p>ATT&amp;CK</p>
             * 
             * <strong>example:</strong>
             * <p>Keychain</p>
             */
            public Builder attCk(String attCk) {
                this.attCk = attCk;
                return this;
            }

            /**
             * <p>The code of the cloud service provider.</p>
             * 
             * <strong>example:</strong>
             * <p>alibaba_cloud</p>
             */
            public Builder cloudCode(String cloudCode) {
                this.cloudCode = cloudCode;
                return this;
            }

            /**
             * <p>The instance.</p>
             * 
             * <strong>example:</strong>
             * <p>[
             *       &quot;003d544744249351****&quot;
             * ]</p>
             */
            public Builder entityList(String entityList) {
                this.entityList = entityList;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-11-24T10:13Z</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The modification time.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-05-08 20:06:07</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The time when the log was generated.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-11-24T10:13Z</p>
             */
            public Builder logTime(String logTime) {
                this.logTime = logTime;
                return this;
            }

            /**
             * <p>The log ID.</p>
             * 
             * <strong>example:</strong>
             * <p>abc4990f2e1948eb960a2bb7ac0f****</p>
             */
            public Builder logUuid(String logUuid) {
                this.logUuid = logUuid;
                return this;
            }

            /**
             * <p>The ID of the master account.</p>
             * 
             * <strong>example:</strong>
             * <p>168370268****</p>
             */
            public Builder mainUserId(String mainUserId) {
                this.mainUserId = mainUserId;
                return this;
            }

            /**
             * <p>The time when the alert was generated.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-11-24T10:13Z</p>
             */
            public Builder occurTime(String occurTime) {
                this.occurTime = occurTime;
                return this;
            }

            /**
             * <p>The ID of the sub-account.</p>
             * 
             * <strong>example:</strong>
             * <p>11689082709****</p>
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
    /**
     * 
     * {@link QueryIncidentVertexExtendInfoResponseBody} extends {@link TeaModel}
     *
     * <p>QueryIncidentVertexExtendInfoResponseBody</p>
     */
    public static class VertexExtendInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Aliuid")
        private String aliuid;

        @com.aliyun.core.annotation.NameInMap("DisplayInfo")
        private java.util.List<DisplayInfo> displayInfo;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Lang")
        private String lang;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NeighborList")
        private java.util.List<NeighborList> neighborList;

        @com.aliyun.core.annotation.NameInMap("Properties")
        private String properties;

        @com.aliyun.core.annotation.NameInMap("Property")
        private Property property;

        @com.aliyun.core.annotation.NameInMap("RuleId")
        private String ruleId;

        @com.aliyun.core.annotation.NameInMap("Time")
        private String time;

        @com.aliyun.core.annotation.NameInMap("Timestamp")
        private Long timestamp;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Uuid")
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
        public java.util.List<DisplayInfo> getDisplayInfo() {
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
        public java.util.List<NeighborList> getNeighborList() {
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
            private java.util.List<DisplayInfo> displayInfo; 
            private String id; 
            private String lang; 
            private String name; 
            private java.util.List<NeighborList> neighborList; 
            private String properties; 
            private Property property; 
            private String ruleId; 
            private String time; 
            private Long timestamp; 
            private String type; 
            private String uuid; 

            private Builder() {
            } 

            private Builder(VertexExtendInfo model) {
                this.aliuid = model.aliuid;
                this.displayInfo = model.displayInfo;
                this.id = model.id;
                this.lang = model.lang;
                this.name = model.name;
                this.neighborList = model.neighborList;
                this.properties = model.properties;
                this.property = model.property;
                this.ruleId = model.ruleId;
                this.time = model.time;
                this.timestamp = model.timestamp;
                this.type = model.type;
                this.uuid = model.uuid;
            } 

            /**
             * <p>The ID of the Alibaba Cloud account.</p>
             * 
             * <strong>example:</strong>
             * <p>1168908270980461</p>
             */
            public Builder aliuid(String aliuid) {
                this.aliuid = aliuid;
                return this;
            }

            /**
             * <p>The display information.</p>
             */
            public Builder displayInfo(java.util.List<DisplayInfo> displayInfo) {
                this.displayInfo = displayInfo;
                return this;
            }

            /**
             * <p>The node ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1377</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The language of the content within the response. Valid values:</p>
             * <ul>
             * <li><strong>zh</strong>: Chinese</li>
             * <li><strong>en</strong>: English</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>zh</p>
             */
            public Builder lang(String lang) {
                this.lang = lang;
                return this;
            }

            /**
             * <p>The node name.</p>
             * 
             * <strong>example:</strong>
             * <p>oval:com.redhat.rhsa:def:20193878</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The neighboring nodes.</p>
             */
            public Builder neighborList(java.util.List<NeighborList> neighborList) {
                this.neighborList = neighborList;
                return this;
            }

            /**
             * <p>The node properties. The value is in the text format.</p>
             * 
             * <strong>example:</strong>
             * <p>DIRECTORY</p>
             */
            public Builder properties(String properties) {
                this.properties = properties;
                return this;
            }

            /**
             * <p>The node property.</p>
             */
            public Builder property(Property property) {
                this.property = property;
                return this;
            }

            /**
             * <p>The ID of the rule for which the node was created.</p>
             * 
             * <strong>example:</strong>
             * <p>400035</p>
             */
            public Builder ruleId(String ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * <p>The time when the node was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-11-06 11:00:00</p>
             */
            public Builder time(String time) {
                this.time = time;
                return this;
            }

            /**
             * <p>The UNIX timestamp when the node was created. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1645168444</p>
             */
            public Builder timestamp(Long timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            /**
             * <p>The node type. Valid values include but are not limited to:</p>
             * <ul>
             * <li><strong>process</strong></li>
             * <li><strong>file</strong></li>
             * <li><strong>alert</strong></li>
             * <li><strong>ip</strong></li>
             * <li><strong>domain</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>cve</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The node UUID.</p>
             * 
             * <strong>example:</strong>
             * <p>678e29f4-d78f-4a7c-a2bc-38434a138538</p>
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
