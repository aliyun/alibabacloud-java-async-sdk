// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

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
 * {@link DescribeAlertsWithEventResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAlertsWithEventResponseBody</p>
 */
public class DescribeAlertsWithEventResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeAlertsWithEventResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAlertsWithEventResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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

    public static final class Builder {
        private Integer code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(DescribeAlertsWithEventResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data returned.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9AAA9ED9-78F4-5021-86DC-D51C7511****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeAlertsWithEventResponseBody build() {
            return new DescribeAlertsWithEventResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAlertsWithEventResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAlertsWithEventResponseBody</p>
     */
    public static class PageInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Long totalCount;

        private PageInfo(Builder builder) {
            this.currentPage = builder.currentPage;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageInfo create() {
            return builder().build();
        }

        /**
         * @return currentPage
         */
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Integer currentPage; 
            private Integer pageSize; 
            private Long totalCount; 

            private Builder() {
            } 

            private Builder(PageInfo model) {
                this.currentPage = model.currentPage;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The current page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * <p>The number of entries per page.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PageInfo build() {
                return new PageInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAlertsWithEventResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAlertsWithEventResponseBody</p>
     */
    public static class AlertInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("KeyName")
        private String keyName;

        @com.aliyun.core.annotation.NameInMap("Values")
        private String values;

        private AlertInfoList(Builder builder) {
            this.key = builder.key;
            this.keyName = builder.keyName;
            this.values = builder.values;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AlertInfoList create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return keyName
         */
        public String getKeyName() {
            return this.keyName;
        }

        /**
         * @return values
         */
        public String getValues() {
            return this.values;
        }

        public static final class Builder {
            private String key; 
            private String keyName; 
            private String values; 

            private Builder() {
            } 

            private Builder(AlertInfoList model) {
                this.key = model.key;
                this.keyName = model.keyName;
                this.values = model.values;
            } 

            /**
             * <p>The attribute key.</p>
             * 
             * <strong>example:</strong>
             * <p>suspicious.wbd.wb.trojanpath</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The name of the key.</p>
             * 
             * <strong>example:</strong>
             * <p>Trojan Path</p>
             */
            public Builder keyName(String keyName) {
                this.keyName = keyName;
                return this;
            }

            /**
             * <p>The value of the key.</p>
             * 
             * <strong>example:</strong>
             * <p>/root/test33.php</p>
             */
            public Builder values(String values) {
                this.values = values;
                return this;
            }

            public AlertInfoList build() {
                return new AlertInfoList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAlertsWithEventResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAlertsWithEventResponseBody</p>
     */
    public static class ResponseData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlertDesc")
        private String alertDesc;

        @com.aliyun.core.annotation.NameInMap("AlertDescCode")
        private String alertDescCode;

        @com.aliyun.core.annotation.NameInMap("AlertDescEn")
        private String alertDescEn;

        @com.aliyun.core.annotation.NameInMap("AlertDetail")
        private String alertDetail;

        @com.aliyun.core.annotation.NameInMap("AlertInfoList")
        private java.util.List<AlertInfoList> alertInfoList;

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

        @com.aliyun.core.annotation.NameInMap("AlertTitleEn")
        private String alertTitleEn;

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

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("EntityList")
        private String entityList;

        @com.aliyun.core.annotation.NameInMap("ExtendContent")
        private String extendContent;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("IncidentUuid")
        private String incidentUuid;

        @com.aliyun.core.annotation.NameInMap("IsDefend")
        private String isDefend;

        @com.aliyun.core.annotation.NameInMap("LogTime")
        private String logTime;

        @com.aliyun.core.annotation.NameInMap("LogUuid")
        private String logUuid;

        @com.aliyun.core.annotation.NameInMap("MainUserId")
        private Long mainUserId;

        @com.aliyun.core.annotation.NameInMap("OccurTime")
        private String occurTime;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("SubUserId")
        private Long subUserId;

        @com.aliyun.core.annotation.NameInMap("SubUserName")
        private String subUserName;

        private ResponseData(Builder builder) {
            this.alertDesc = builder.alertDesc;
            this.alertDescCode = builder.alertDescCode;
            this.alertDescEn = builder.alertDescEn;
            this.alertDetail = builder.alertDetail;
            this.alertInfoList = builder.alertInfoList;
            this.alertLevel = builder.alertLevel;
            this.alertName = builder.alertName;
            this.alertNameCode = builder.alertNameCode;
            this.alertNameEn = builder.alertNameEn;
            this.alertSrcProd = builder.alertSrcProd;
            this.alertSrcProdModule = builder.alertSrcProdModule;
            this.alertTitle = builder.alertTitle;
            this.alertTitleEn = builder.alertTitleEn;
            this.alertType = builder.alertType;
            this.alertTypeCode = builder.alertTypeCode;
            this.alertTypeEn = builder.alertTypeEn;
            this.alertUuid = builder.alertUuid;
            this.assetList = builder.assetList;
            this.attCk = builder.attCk;
            this.cloudCode = builder.cloudCode;
            this.endTime = builder.endTime;
            this.entityList = builder.entityList;
            this.extendContent = builder.extendContent;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.incidentUuid = builder.incidentUuid;
            this.isDefend = builder.isDefend;
            this.logTime = builder.logTime;
            this.logUuid = builder.logUuid;
            this.mainUserId = builder.mainUserId;
            this.occurTime = builder.occurTime;
            this.startTime = builder.startTime;
            this.subUserId = builder.subUserId;
            this.subUserName = builder.subUserName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResponseData create() {
            return builder().build();
        }

        /**
         * @return alertDesc
         */
        public String getAlertDesc() {
            return this.alertDesc;
        }

        /**
         * @return alertDescCode
         */
        public String getAlertDescCode() {
            return this.alertDescCode;
        }

        /**
         * @return alertDescEn
         */
        public String getAlertDescEn() {
            return this.alertDescEn;
        }

        /**
         * @return alertDetail
         */
        public String getAlertDetail() {
            return this.alertDetail;
        }

        /**
         * @return alertInfoList
         */
        public java.util.List<AlertInfoList> getAlertInfoList() {
            return this.alertInfoList;
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
         * @return alertTitleEn
         */
        public String getAlertTitleEn() {
            return this.alertTitleEn;
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
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return entityList
         */
        public String getEntityList() {
            return this.entityList;
        }

        /**
         * @return extendContent
         */
        public String getExtendContent() {
            return this.extendContent;
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
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return incidentUuid
         */
        public String getIncidentUuid() {
            return this.incidentUuid;
        }

        /**
         * @return isDefend
         */
        public String getIsDefend() {
            return this.isDefend;
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
        public Long getMainUserId() {
            return this.mainUserId;
        }

        /**
         * @return occurTime
         */
        public String getOccurTime() {
            return this.occurTime;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return subUserId
         */
        public Long getSubUserId() {
            return this.subUserId;
        }

        /**
         * @return subUserName
         */
        public String getSubUserName() {
            return this.subUserName;
        }

        public static final class Builder {
            private String alertDesc; 
            private String alertDescCode; 
            private String alertDescEn; 
            private String alertDetail; 
            private java.util.List<AlertInfoList> alertInfoList; 
            private String alertLevel; 
            private String alertName; 
            private String alertNameCode; 
            private String alertNameEn; 
            private String alertSrcProd; 
            private String alertSrcProdModule; 
            private String alertTitle; 
            private String alertTitleEn; 
            private String alertType; 
            private String alertTypeCode; 
            private String alertTypeEn; 
            private String alertUuid; 
            private String assetList; 
            private String attCk; 
            private String cloudCode; 
            private String endTime; 
            private String entityList; 
            private String extendContent; 
            private String gmtCreate; 
            private String gmtModified; 
            private Long id; 
            private String incidentUuid; 
            private String isDefend; 
            private String logTime; 
            private String logUuid; 
            private Long mainUserId; 
            private String occurTime; 
            private String startTime; 
            private Long subUserId; 
            private String subUserName; 

            private Builder() {
            } 

            private Builder(ResponseData model) {
                this.alertDesc = model.alertDesc;
                this.alertDescCode = model.alertDescCode;
                this.alertDescEn = model.alertDescEn;
                this.alertDetail = model.alertDetail;
                this.alertInfoList = model.alertInfoList;
                this.alertLevel = model.alertLevel;
                this.alertName = model.alertName;
                this.alertNameCode = model.alertNameCode;
                this.alertNameEn = model.alertNameEn;
                this.alertSrcProd = model.alertSrcProd;
                this.alertSrcProdModule = model.alertSrcProdModule;
                this.alertTitle = model.alertTitle;
                this.alertTitleEn = model.alertTitleEn;
                this.alertType = model.alertType;
                this.alertTypeCode = model.alertTypeCode;
                this.alertTypeEn = model.alertTypeEn;
                this.alertUuid = model.alertUuid;
                this.assetList = model.assetList;
                this.attCk = model.attCk;
                this.cloudCode = model.cloudCode;
                this.endTime = model.endTime;
                this.entityList = model.entityList;
                this.extendContent = model.extendContent;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.id = model.id;
                this.incidentUuid = model.incidentUuid;
                this.isDefend = model.isDefend;
                this.logTime = model.logTime;
                this.logUuid = model.logUuid;
                this.mainUserId = model.mainUserId;
                this.occurTime = model.occurTime;
                this.startTime = model.startTime;
                this.subUserId = model.subUserId;
                this.subUserName = model.subUserName;
            } 

            /**
             * <p>The description of the alert.</p>
             * 
             * <strong>example:</strong>
             * <p>The detection model found a suspicious Webshell file on your server, which may be a backdoor file implanted to maintain permissions after the attacker successfully invaded the website.</p>
             */
            public Builder alertDesc(String alertDesc) {
                this.alertDesc = alertDesc;
                return this;
            }

            /**
             * <p>The internal code of the alert description.</p>
             * 
             * <strong>example:</strong>
             * <p>security_event_config.event_name.webshell</p>
             */
            public Builder alertDescCode(String alertDescCode) {
                this.alertDescCode = alertDescCode;
                return this;
            }

            /**
             * <p>The alert description in English.</p>
             * 
             * <strong>example:</strong>
             * <p>The detection model found a suspicious Webshell file on your server, which may be a backdoor file implanted to maintain permissions after the attacker successfully invaded the website.</p>
             */
            public Builder alertDescEn(String alertDescEn) {
                this.alertDescEn = alertDescEn;
                return this;
            }

            /**
             * <p>The details of the alert.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;main_user_id&quot;: &quot;165295629792****&quot;;&quot;log_uuid_count&quot;: &quot;99&quot;;&quot;attack_ip&quot;: &quot;21.92.<em>.</em>&quot;}</p>
             */
            public Builder alertDetail(String alertDetail) {
                this.alertDetail = alertDetail;
                return this;
            }

            /**
             * <p>The displayed details of the alert.</p>
             * 
             * <strong>example:</strong>
             * <p>aliyun</p>
             */
            public Builder alertInfoList(java.util.List<AlertInfoList> alertInfoList) {
                this.alertInfoList = alertInfoList;
                return this;
            }

            /**
             * <p>The risk level. Valid values:</p>
             * <ul>
             * <li>serious: high.</li>
             * <li>suspicious: medium.</li>
             * <li>remind: low.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>remind</p>
             */
            public Builder alertLevel(String alertLevel) {
                this.alertLevel = alertLevel;
                return this;
            }

            /**
             * <p>The name of the alert.</p>
             * 
             * <strong>example:</strong>
             * <p>Try SNMP weak password</p>
             */
            public Builder alertName(String alertName) {
                this.alertName = alertName;
                return this;
            }

            /**
             * <p>The internal code of the alert name.</p>
             * 
             * <strong>example:</strong>
             * <p>security_event_config.event_name.webshell</p>
             */
            public Builder alertNameCode(String alertNameCode) {
                this.alertNameCode = alertNameCode;
                return this;
            }

            /**
             * <p>The alert name in English.</p>
             * 
             * <strong>example:</strong>
             * <p>Try SNMP weak password</p>
             */
            public Builder alertNameEn(String alertNameEn) {
                this.alertNameEn = alertNameEn;
                return this;
            }

            /**
             * <p>The source of the alert.</p>
             * 
             * <strong>example:</strong>
             * <p>sas</p>
             */
            public Builder alertSrcProd(String alertSrcProd) {
                this.alertSrcProd = alertSrcProd;
                return this;
            }

            /**
             * <p>The sub-module of the alert source.</p>
             * 
             * <strong>example:</strong>
             * <p>waf</p>
             */
            public Builder alertSrcProdModule(String alertSrcProdModule) {
                this.alertSrcProdModule = alertSrcProdModule;
                return this;
            }

            /**
             * <p>The title of the alert.</p>
             * 
             * <strong>example:</strong>
             * <p>Scan-Try SNMP weak password</p>
             */
            public Builder alertTitle(String alertTitle) {
                this.alertTitle = alertTitle;
                return this;
            }

            /**
             * <p>The alert title in English.</p>
             * 
             * <strong>example:</strong>
             * <p>Scan-Try SNMP weak password</p>
             */
            public Builder alertTitleEn(String alertTitleEn) {
                this.alertTitleEn = alertTitleEn;
                return this;
            }

            /**
             * <p>The type of the alert.</p>
             * 
             * <strong>example:</strong>
             * <p>Scan</p>
             */
            public Builder alertType(String alertType) {
                this.alertType = alertType;
                return this;
            }

            /**
             * <p>The internal code of the alert type.</p>
             * 
             * <strong>example:</strong>
             * <p>security_event_config.event_name.webshellName</p>
             */
            public Builder alertTypeCode(String alertTypeCode) {
                this.alertTypeCode = alertTypeCode;
                return this;
            }

            /**
             * <p>The alert type in English.</p>
             * 
             * <strong>example:</strong>
             * <p>Scan</p>
             */
            public Builder alertTypeEn(String alertTypeEn) {
                this.alertTypeEn = alertTypeEn;
                return this;
            }

            /**
             * <p>The UUID of the alert.</p>
             * 
             * <strong>example:</strong>
             * <p>sas_71e24437d2797ce8fc59692905a4****</p>
             */
            public Builder alertUuid(String alertUuid) {
                this.alertUuid = alertUuid;
                return this;
            }

            /**
             * <p>The details of the asset.</p>
             * 
             * <strong>example:</strong>
             * <p>[
             *       {
             *             &quot;is_main_asset&quot;: &quot;1&quot;,
             *             &quot;asset_name&quot;: &quot;47.245.<em>&quot;,
             *             &quot;port&quot;: &quot;22&quot;,
             *             &quot;ip&quot;: &quot;47.245.</em>&quot;,
             *             &quot;asset_type&quot;: &quot;ip&quot;,
             *             &quot;location&quot;: &quot;ap-southeast-1&quot;,
             *             &quot;asset_id&quot;: &quot;47.245.*&quot;,
             *             &quot;net_connect_dir&quot;: &quot;in&quot;
             *       }
             * ]</p>
             */
            public Builder assetList(String assetList) {
                this.assetList = assetList;
                return this;
            }

            /**
             * <p>The tag of the ATT&amp;CK technique.</p>
             * 
             * <strong>example:</strong>
             * <p>T1595.002 Vulnerability Scanning</p>
             */
            public Builder attCk(String attCk) {
                this.attCk = attCk;
                return this;
            }

            /**
             * <p>The code of the cloud service provider. Valid values:</p>
             * <ul>
             * <li>aliyun: Alibaba Cloud.</li>
             * <li>qcloud: Tencent Cloud.</li>
             * <li>hcloud: Huawei Cloud.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>aliyun</p>
             */
            public Builder cloudCode(String cloudCode) {
                this.cloudCode = cloudCode;
                return this;
            }

            /**
             * <p>The time when the alert was closed.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-01-06 16:37:29</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The details of the entity.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;entity_user_id&quot;:&quot;198921674491****&quot;,&quot;entity_account_id&quot;:&quot;N/A&quot;,&quot;entity_uuid&quot;:&quot;6245f979d5dd9ef8dd19bdc72228****&quot;,&quot;entity_type&quot;:&quot;host&quot;,&quot;entity_name&quot;:&quot;zhh-test-20240409&quot;,&quot;is_comprised&quot;:&quot;1&quot;,&quot;os_type&quot;:&quot;linux&quot;,&quot;entity_id&quot;:&quot;a88f44dd-b8d4-4ded-831c-77a4835****&quot;,&quot;host_uuid&quot;:&quot;a88f44dd-b8d4-4ded-831c-77a4835****&quot;,&quot;host_name&quot;:&quot;zhh-test-2024****&quot;}]</p>
             */
            public Builder entityList(String entityList) {
                this.entityList = entityList;
                return this;
            }

            /**
             * ExtendContent.
             */
            public Builder extendContent(String extendContent) {
                this.extendContent = extendContent;
                return this;
            }

            /**
             * <p>The time when the alert was received.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-01-06 16:37:29</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The time when the alert was last updated.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-01-06 16:37:29</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The unique ID of the alert.</p>
             * 
             * <strong>example:</strong>
             * <p>123456789</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The UUID of the event.</p>
             * 
             * <strong>example:</strong>
             * <p>85ea4241-798f-4684-a876-65d4f0c3****</p>
             */
            public Builder incidentUuid(String incidentUuid) {
                this.incidentUuid = incidentUuid;
                return this;
            }

            /**
             * <p>Indicates whether an attack is defended against. Valid values:</p>
             * <ul>
             * <li>0: detected.</li>
             * <li>1: blocked.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder isDefend(String isDefend) {
                this.isDefend = isDefend;
                return this;
            }

            /**
             * <p>The time when the alert was recorded.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-01-06 16:37:29</p>
             */
            public Builder logTime(String logTime) {
                this.logTime = logTime;
                return this;
            }

            /**
             * <p>The UUID of the alert log.</p>
             * 
             * <strong>example:</strong>
             * <p>cfw_d12e285a-a042-4d7e-be89-f8a795ef****</p>
             */
            public Builder logUuid(String logUuid) {
                this.logUuid = logUuid;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account that is associated with the alert in SIEM.</p>
             * 
             * <strong>example:</strong>
             * <p>127608589417****</p>
             */
            public Builder mainUserId(Long mainUserId) {
                this.mainUserId = mainUserId;
                return this;
            }

            /**
             * <p>The time when the alert was triggered.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-01-06 16:37:29</p>
             */
            public Builder occurTime(String occurTime) {
                this.occurTime = occurTime;
                return this;
            }

            /**
             * <p>The time at which the alert was first generated.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-01-06 16:37:29</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account within which the alert is generated.</p>
             * 
             * <strong>example:</strong>
             * <p>176555323***</p>
             */
            public Builder subUserId(Long subUserId) {
                this.subUserId = subUserId;
                return this;
            }

            /**
             * SubUserName.
             */
            public Builder subUserName(String subUserName) {
                this.subUserName = subUserName;
                return this;
            }

            public ResponseData build() {
                return new ResponseData(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAlertsWithEventResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAlertsWithEventResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PageInfo")
        private PageInfo pageInfo;

        @com.aliyun.core.annotation.NameInMap("ResponseData")
        private java.util.List<ResponseData> responseData;

        private Data(Builder builder) {
            this.pageInfo = builder.pageInfo;
            this.responseData = builder.responseData;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return pageInfo
         */
        public PageInfo getPageInfo() {
            return this.pageInfo;
        }

        /**
         * @return responseData
         */
        public java.util.List<ResponseData> getResponseData() {
            return this.responseData;
        }

        public static final class Builder {
            private PageInfo pageInfo; 
            private java.util.List<ResponseData> responseData; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.pageInfo = model.pageInfo;
                this.responseData = model.responseData;
            } 

            /**
             * <p>The pagination information.</p>
             */
            public Builder pageInfo(PageInfo pageInfo) {
                this.pageInfo = pageInfo;
                return this;
            }

            /**
             * <p>The detailed data.</p>
             */
            public Builder responseData(java.util.List<ResponseData> responseData) {
                this.responseData = responseData;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
