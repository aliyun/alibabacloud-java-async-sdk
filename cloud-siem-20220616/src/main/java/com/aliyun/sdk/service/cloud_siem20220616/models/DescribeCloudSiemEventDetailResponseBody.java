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
 * {@link DescribeCloudSiemEventDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCloudSiemEventDetailResponseBody</p>
 */
public class DescribeCloudSiemEventDetailResponseBody extends TeaModel {
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

    private DescribeCloudSiemEventDetailResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCloudSiemEventDetailResponseBody create() {
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

        private Builder(DescribeCloudSiemEventDetailResponseBody model) {
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

        public DescribeCloudSiemEventDetailResponseBody build() {
            return new DescribeCloudSiemEventDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCloudSiemEventDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCloudSiemEventDetailResponseBody</p>
     */
    public static class AttckStages extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlertNum")
        private Integer alertNum;

        @com.aliyun.core.annotation.NameInMap("TacticId")
        private String tacticId;

        @com.aliyun.core.annotation.NameInMap("TacticName")
        private String tacticName;

        private AttckStages(Builder builder) {
            this.alertNum = builder.alertNum;
            this.tacticId = builder.tacticId;
            this.tacticName = builder.tacticName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AttckStages create() {
            return builder().build();
        }

        /**
         * @return alertNum
         */
        public Integer getAlertNum() {
            return this.alertNum;
        }

        /**
         * @return tacticId
         */
        public String getTacticId() {
            return this.tacticId;
        }

        /**
         * @return tacticName
         */
        public String getTacticName() {
            return this.tacticName;
        }

        public static final class Builder {
            private Integer alertNum; 
            private String tacticId; 
            private String tacticName; 

            private Builder() {
            } 

            private Builder(AttckStages model) {
                this.alertNum = model.alertNum;
                this.tacticId = model.tacticId;
                this.tacticName = model.tacticName;
            } 

            /**
             * AlertNum.
             */
            public Builder alertNum(Integer alertNum) {
                this.alertNum = alertNum;
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
             * TacticName.
             */
            public Builder tacticName(String tacticName) {
                this.tacticName = tacticName;
                return this;
            }

            public AttckStages build() {
                return new AttckStages(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCloudSiemEventDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCloudSiemEventDetailResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlertNum")
        private Integer alertNum;

        @com.aliyun.core.annotation.NameInMap("Aliuid")
        private Long aliuid;

        @com.aliyun.core.annotation.NameInMap("AssetNum")
        private Integer assetNum;

        @com.aliyun.core.annotation.NameInMap("AttCkLabels")
        private java.util.List<String> attCkLabels;

        @com.aliyun.core.annotation.NameInMap("AttckStages")
        private java.util.List<AttckStages> attckStages;

        @com.aliyun.core.annotation.NameInMap("DataSources")
        private java.util.List<String> dataSources;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DescriptionEn")
        private String descriptionEn;

        @com.aliyun.core.annotation.NameInMap("ExtContent")
        private String extContent;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("IncidentName")
        private String incidentName;

        @com.aliyun.core.annotation.NameInMap("IncidentNameEn")
        private String incidentNameEn;

        @com.aliyun.core.annotation.NameInMap("IncidentType")
        private String incidentType;

        @com.aliyun.core.annotation.NameInMap("IncidentUuid")
        private String incidentUuid;

        @com.aliyun.core.annotation.NameInMap("ReferAccount")
        private String referAccount;

        @com.aliyun.core.annotation.NameInMap("Remark")
        private String remark;

        @com.aliyun.core.annotation.NameInMap("RuleId")
        private String ruleId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("ThreatLevel")
        private String threatLevel;

        @com.aliyun.core.annotation.NameInMap("ThreatScore")
        private Float threatScore;

        private Data(Builder builder) {
            this.alertNum = builder.alertNum;
            this.aliuid = builder.aliuid;
            this.assetNum = builder.assetNum;
            this.attCkLabels = builder.attCkLabels;
            this.attckStages = builder.attckStages;
            this.dataSources = builder.dataSources;
            this.description = builder.description;
            this.descriptionEn = builder.descriptionEn;
            this.extContent = builder.extContent;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.incidentName = builder.incidentName;
            this.incidentNameEn = builder.incidentNameEn;
            this.incidentType = builder.incidentType;
            this.incidentUuid = builder.incidentUuid;
            this.referAccount = builder.referAccount;
            this.remark = builder.remark;
            this.ruleId = builder.ruleId;
            this.status = builder.status;
            this.threatLevel = builder.threatLevel;
            this.threatScore = builder.threatScore;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return alertNum
         */
        public Integer getAlertNum() {
            return this.alertNum;
        }

        /**
         * @return aliuid
         */
        public Long getAliuid() {
            return this.aliuid;
        }

        /**
         * @return assetNum
         */
        public Integer getAssetNum() {
            return this.assetNum;
        }

        /**
         * @return attCkLabels
         */
        public java.util.List<String> getAttCkLabels() {
            return this.attCkLabels;
        }

        /**
         * @return attckStages
         */
        public java.util.List<AttckStages> getAttckStages() {
            return this.attckStages;
        }

        /**
         * @return dataSources
         */
        public java.util.List<String> getDataSources() {
            return this.dataSources;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return descriptionEn
         */
        public String getDescriptionEn() {
            return this.descriptionEn;
        }

        /**
         * @return extContent
         */
        public String getExtContent() {
            return this.extContent;
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
         * @return incidentName
         */
        public String getIncidentName() {
            return this.incidentName;
        }

        /**
         * @return incidentNameEn
         */
        public String getIncidentNameEn() {
            return this.incidentNameEn;
        }

        /**
         * @return incidentType
         */
        public String getIncidentType() {
            return this.incidentType;
        }

        /**
         * @return incidentUuid
         */
        public String getIncidentUuid() {
            return this.incidentUuid;
        }

        /**
         * @return referAccount
         */
        public String getReferAccount() {
            return this.referAccount;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        /**
         * @return ruleId
         */
        public String getRuleId() {
            return this.ruleId;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return threatLevel
         */
        public String getThreatLevel() {
            return this.threatLevel;
        }

        /**
         * @return threatScore
         */
        public Float getThreatScore() {
            return this.threatScore;
        }

        public static final class Builder {
            private Integer alertNum; 
            private Long aliuid; 
            private Integer assetNum; 
            private java.util.List<String> attCkLabels; 
            private java.util.List<AttckStages> attckStages; 
            private java.util.List<String> dataSources; 
            private String description; 
            private String descriptionEn; 
            private String extContent; 
            private String gmtCreate; 
            private String gmtModified; 
            private String incidentName; 
            private String incidentNameEn; 
            private String incidentType; 
            private String incidentUuid; 
            private String referAccount; 
            private String remark; 
            private String ruleId; 
            private Integer status; 
            private String threatLevel; 
            private Float threatScore; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.alertNum = model.alertNum;
                this.aliuid = model.aliuid;
                this.assetNum = model.assetNum;
                this.attCkLabels = model.attCkLabels;
                this.attckStages = model.attckStages;
                this.dataSources = model.dataSources;
                this.description = model.description;
                this.descriptionEn = model.descriptionEn;
                this.extContent = model.extContent;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.incidentName = model.incidentName;
                this.incidentNameEn = model.incidentNameEn;
                this.incidentType = model.incidentType;
                this.incidentUuid = model.incidentUuid;
                this.referAccount = model.referAccount;
                this.remark = model.remark;
                this.ruleId = model.ruleId;
                this.status = model.status;
                this.threatLevel = model.threatLevel;
                this.threatScore = model.threatScore;
            } 

            /**
             * <p>The number of alerts that are associated with the event.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder alertNum(Integer alertNum) {
                this.alertNum = alertNum;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account to which the event belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>127608589417****</p>
             */
            public Builder aliuid(Long aliuid) {
                this.aliuid = aliuid;
                return this;
            }

            /**
             * <p>The number of assets that are associated with the event.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder assetNum(Integer assetNum) {
                this.assetNum = assetNum;
                return this;
            }

            /**
             * <p>The tags of the ATT&amp;CK attacks.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;T1595.002 Vulnerability Scanning&quot;]</p>
             */
            public Builder attCkLabels(java.util.List<String> attCkLabels) {
                this.attCkLabels = attCkLabels;
                return this;
            }

            /**
             * AttckStages.
             */
            public Builder attckStages(java.util.List<AttckStages> attckStages) {
                this.attckStages = attckStages;
                return this;
            }

            /**
             * <p>The source of the alert.</p>
             * 
             * <strong>example:</strong>
             * <p>[sas,waf]</p>
             */
            public Builder dataSources(java.util.List<String> dataSources) {
                this.dataSources = dataSources;
                return this;
            }

            /**
             * <p>The description of the event.</p>
             * 
             * <strong>example:</strong>
             * <p>The threat event contains 13 Miner Network,1 Execute suspicious encoded commands on Linux, etc</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The description of the event in English.</p>
             * 
             * <strong>example:</strong>
             * <p>The threat event contains 13 Miner Network,1 Execute suspicious encoded commands on Linux, etc</p>
             */
            public Builder descriptionEn(String descriptionEn) {
                this.descriptionEn = descriptionEn;
                return this;
            }

            /**
             * <p>The extended information of the event in the JSON format.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;event_transfer_type&quot;:&quot;customize_rule&quot;}</p>
             */
            public Builder extContent(String extContent) {
                this.extContent = extContent;
                return this;
            }

            /**
             * <p>The time when the event occurred.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-01-06 16:37:29</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The time when the event was last updated.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-01-06 16:37:29</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The name of the event.</p>
             * 
             * <strong>example:</strong>
             * <p>Multiple type of alerts, including Miner Network, Command line download and run malicious files, Backdoor Process, etc</p>
             */
            public Builder incidentName(String incidentName) {
                this.incidentName = incidentName;
                return this;
            }

            /**
             * <p>The name of the event in English.</p>
             * 
             * <strong>example:</strong>
             * <p>Multiple type of alerts, including Miner Network, Command line download and run malicious files, Backdoor Process, etc</p>
             */
            public Builder incidentNameEn(String incidentNameEn) {
                this.incidentNameEn = incidentNameEn;
                return this;
            }

            /**
             * IncidentType.
             */
            public Builder incidentType(String incidentType) {
                this.incidentType = incidentType;
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
             * <p>Users associated with the event.</p>
             */
            public Builder referAccount(String referAccount) {
                this.referAccount = referAccount;
                return this;
            }

            /**
             * <p>The remarks of the event.</p>
             * 
             * <strong>example:</strong>
             * <p>dealed</p>
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * RuleId.
             */
            public Builder ruleId(String ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * <p>The status of the event. Valid values:</p>
             * <ul>
             * <li>0: not handled</li>
             * <li>1: handing</li>
             * <li>5: handling failed</li>
             * <li>10: handled</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The risk level. Valid values:</p>
             * <ul>
             * <li>serious: high</li>
             * <li>suspicious: medium</li>
             * <li>remind: low</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>remind</p>
             */
            public Builder threatLevel(String threatLevel) {
                this.threatLevel = threatLevel;
                return this;
            }

            /**
             * <p>The risk score of the event. The score ranges from 0 to 100. A higher score indicates a higher risk level.</p>
             * 
             * <strong>example:</strong>
             * <p>90.2</p>
             */
            public Builder threatScore(Float threatScore) {
                this.threatScore = threatScore;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
