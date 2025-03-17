// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

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
 * {@link ListClusterHealthCheckTaskResponseBody} extends {@link TeaModel}
 *
 * <p>ListClusterHealthCheckTaskResponseBody</p>
 */
public class ListClusterHealthCheckTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("DynamicCode")
    private String dynamicCode;

    @com.aliyun.core.annotation.NameInMap("DynamicMessage")
    private String dynamicMessage;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListClusterHealthCheckTaskResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.dynamicCode = builder.dynamicCode;
        this.dynamicMessage = builder.dynamicMessage;
        this.errorCode = builder.errorCode;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListClusterHealthCheckTaskResponseBody create() {
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
     * @return dynamicCode
     */
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    /**
     * @return dynamicMessage
     */
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
        private String dynamicCode; 
        private String dynamicMessage; 
        private String errorCode; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListClusterHealthCheckTaskResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.dynamicCode = model.dynamicCode;
            this.dynamicMessage = model.dynamicMessage;
            this.errorCode = model.errorCode;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The status code. A value of 200 is returned if the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The details of the data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The dynamic part in the error message.</p>
         * 
         * <strong>example:</strong>
         * <p>code</p>
         */
        public Builder dynamicCode(String dynamicCode) {
            this.dynamicCode = dynamicCode;
            return this;
        }

        /**
         * <p>The dynamic part in the error message. This parameter is used to replace the **%s** variable in the <strong>ErrMessage</strong> parameter.</p>
         * <blockquote>
         * <p>If the return value of the <strong>ErrMessage</strong> parameter is <strong>The Value of Input Parameter %s is not valid</strong> and the return value of the <strong>DynamicMessage</strong> parameter is <strong>DtsJobId</strong>, the specified <strong>DtsJobId</strong> parameter is invalid.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>The specified parameter is invalid.</p>
         */
        public Builder dynamicMessage(String dynamicMessage) {
            this.dynamicMessage = dynamicMessage;
            return this;
        }

        /**
         * <p>The error code returned if the request failed. Take note of the following rules:</p>
         * <ul>
         * <li>The <strong>ErrorCode</strong> parameter is not returned if the request is successful.</li>
         * <li>The <strong>ErrorCode</strong> parameter is returned if the request fails. For more information, see the <strong>Error codes</strong> section in this topic.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>mse-100-000</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The HTTP status code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The message returned.</p>
         * 
         * <strong>example:</strong>
         * <p>The request was successfully processed.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>4E9FDCFE-0738-493B-B801-82BDFBCB****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><code>true</code>: The request was successful.</li>
         * <li><code>false</code>: The request failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListClusterHealthCheckTaskResponseBody build() {
            return new ListClusterHealthCheckTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListClusterHealthCheckTaskResponseBody} extends {@link TeaModel}
     *
     * <p>ListClusterHealthCheckTaskResponseBody</p>
     */
    public static class RiskList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DescriptionEn")
        private String descriptionEn;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Integer id;

        @com.aliyun.core.annotation.NameInMap("Module")
        private String module;

        @com.aliyun.core.annotation.NameInMap("Mute")
        private Boolean mute;

        @com.aliyun.core.annotation.NameInMap("NoticeFeature")
        private Boolean noticeFeature;

        @com.aliyun.core.annotation.NameInMap("PrimaryUser")
        private String primaryUser;

        @com.aliyun.core.annotation.NameInMap("RiskCode")
        private String riskCode;

        @com.aliyun.core.annotation.NameInMap("RiskLevel")
        private String riskLevel;

        @com.aliyun.core.annotation.NameInMap("RiskName")
        private String riskName;

        @com.aliyun.core.annotation.NameInMap("RiskNameEn")
        private String riskNameEn;

        @com.aliyun.core.annotation.NameInMap("RiskType")
        private String riskType;

        @com.aliyun.core.annotation.NameInMap("Situation")
        private String situation;

        @com.aliyun.core.annotation.NameInMap("SituationEn")
        private String situationEn;

        @com.aliyun.core.annotation.NameInMap("Suggestion")
        private String suggestion;

        @com.aliyun.core.annotation.NameInMap("SuggestionEn")
        private String suggestionEn;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private Long taskId;

        @com.aliyun.core.annotation.NameInMap("Type")
        private Integer type;

        @com.aliyun.core.annotation.NameInMap("Values")
        private String values;

        private RiskList(Builder builder) {
            this.description = builder.description;
            this.descriptionEn = builder.descriptionEn;
            this.id = builder.id;
            this.module = builder.module;
            this.mute = builder.mute;
            this.noticeFeature = builder.noticeFeature;
            this.primaryUser = builder.primaryUser;
            this.riskCode = builder.riskCode;
            this.riskLevel = builder.riskLevel;
            this.riskName = builder.riskName;
            this.riskNameEn = builder.riskNameEn;
            this.riskType = builder.riskType;
            this.situation = builder.situation;
            this.situationEn = builder.situationEn;
            this.suggestion = builder.suggestion;
            this.suggestionEn = builder.suggestionEn;
            this.taskId = builder.taskId;
            this.type = builder.type;
            this.values = builder.values;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RiskList create() {
            return builder().build();
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
         * @return id
         */
        public Integer getId() {
            return this.id;
        }

        /**
         * @return module
         */
        public String getModule() {
            return this.module;
        }

        /**
         * @return mute
         */
        public Boolean getMute() {
            return this.mute;
        }

        /**
         * @return noticeFeature
         */
        public Boolean getNoticeFeature() {
            return this.noticeFeature;
        }

        /**
         * @return primaryUser
         */
        public String getPrimaryUser() {
            return this.primaryUser;
        }

        /**
         * @return riskCode
         */
        public String getRiskCode() {
            return this.riskCode;
        }

        /**
         * @return riskLevel
         */
        public String getRiskLevel() {
            return this.riskLevel;
        }

        /**
         * @return riskName
         */
        public String getRiskName() {
            return this.riskName;
        }

        /**
         * @return riskNameEn
         */
        public String getRiskNameEn() {
            return this.riskNameEn;
        }

        /**
         * @return riskType
         */
        public String getRiskType() {
            return this.riskType;
        }

        /**
         * @return situation
         */
        public String getSituation() {
            return this.situation;
        }

        /**
         * @return situationEn
         */
        public String getSituationEn() {
            return this.situationEn;
        }

        /**
         * @return suggestion
         */
        public String getSuggestion() {
            return this.suggestion;
        }

        /**
         * @return suggestionEn
         */
        public String getSuggestionEn() {
            return this.suggestionEn;
        }

        /**
         * @return taskId
         */
        public Long getTaskId() {
            return this.taskId;
        }

        /**
         * @return type
         */
        public Integer getType() {
            return this.type;
        }

        /**
         * @return values
         */
        public String getValues() {
            return this.values;
        }

        public static final class Builder {
            private String description; 
            private String descriptionEn; 
            private Integer id; 
            private String module; 
            private Boolean mute; 
            private Boolean noticeFeature; 
            private String primaryUser; 
            private String riskCode; 
            private String riskLevel; 
            private String riskName; 
            private String riskNameEn; 
            private String riskType; 
            private String situation; 
            private String situationEn; 
            private String suggestion; 
            private String suggestionEn; 
            private Long taskId; 
            private Integer type; 
            private String values; 

            private Builder() {
            } 

            private Builder(RiskList model) {
                this.description = model.description;
                this.descriptionEn = model.descriptionEn;
                this.id = model.id;
                this.module = model.module;
                this.mute = model.mute;
                this.noticeFeature = model.noticeFeature;
                this.primaryUser = model.primaryUser;
                this.riskCode = model.riskCode;
                this.riskLevel = model.riskLevel;
                this.riskName = model.riskName;
                this.riskNameEn = model.riskNameEn;
                this.riskType = model.riskType;
                this.situation = model.situation;
                this.situationEn = model.situationEn;
                this.suggestion = model.suggestion;
                this.suggestionEn = model.suggestionEn;
                this.taskId = model.taskId;
                this.type = model.type;
                this.values = model.values;
            } 

            /**
             * <p>The description.</p>
             * 
             * <strong>example:</strong>
             * <p>{\&quot;desc\&quot;:\&quot;The engine version is outdated and a large number of features are not supported. Upgrade the engine to the latest version at the earliest opportunity. \&quot;}</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * DescriptionEn.
             */
            public Builder descriptionEn(String descriptionEn) {
                this.descriptionEn = descriptionEn;
                return this;
            }

            /**
             * <p>The ID.</p>
             * 
             * <strong>example:</strong>
             * <p>3426</p>
             */
            public Builder id(Integer id) {
                this.id = id;
                return this;
            }

            /**
             * <p>A redundant parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder module(String module) {
                this.module = module;
                return this;
            }

            /**
             * <p>Indicates whether the risk item notification feature is disabled.</p>
             * <ul>
             * <li>true: disabled</li>
             * <li>false: enabled</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder mute(Boolean mute) {
                this.mute = mute;
                return this;
            }

            /**
             * <p>A redundant parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder noticeFeature(Boolean noticeFeature) {
                this.noticeFeature = noticeFeature;
                return this;
            }

            /**
             * <p>The ID of the user to which the cluster belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>123456</p>
             */
            public Builder primaryUser(String primaryUser) {
                this.primaryUser = primaryUser;
                return this;
            }

            /**
             * <p>The risk code.</p>
             * 
             * <strong>example:</strong>
             * <p>22020010001</p>
             */
            public Builder riskCode(String riskCode) {
                this.riskCode = riskCode;
                return this;
            }

            /**
             * <p>The severity of the risk. Valid values:</p>
             * <ul>
             * <li>HIGH: high risk</li>
             * <li>MID: medium risk</li>
             * <li>LOW: low risk</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>MID</p>
             */
            public Builder riskLevel(String riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            /**
             * <p>The name of the risk.</p>
             * 
             * <strong>example:</strong>
             * <p>The engine version is outdated.</p>
             */
            public Builder riskName(String riskName) {
                this.riskName = riskName;
                return this;
            }

            /**
             * RiskNameEn.
             */
            public Builder riskNameEn(String riskNameEn) {
                this.riskNameEn = riskNameEn;
                return this;
            }

            /**
             * <p>The type of the risk.</p>
             * 
             * <strong>example:</strong>
             * <p>Version risk</p>
             */
            public Builder riskType(String riskType) {
                this.riskType = riskType;
                return this;
            }

            /**
             * <p>The situation.</p>
             * 
             * <strong>example:</strong>
             * <p>{\&quot;desc\&quot;:\&quot;The engine version is outdated and a large number of features are not supported.\&quot;,\&quot;links\&quot;:[{\&quot;type\&quot;:\&quot;url\&quot;,\&quot;value\&quot;:\&quot;<a href="https://xxxx%22%5C%5C%22,%5C%5C%22desc%5C%5C%22:%5C%5C%22Release">https://xxxx&quot;\\&quot;,\\&quot;desc\\&quot;:\\&quot;Release</a> notes\&quot;}]}</p>
             */
            public Builder situation(String situation) {
                this.situation = situation;
                return this;
            }

            /**
             * SituationEn.
             */
            public Builder situationEn(String situationEn) {
                this.situationEn = situationEn;
                return this;
            }

            /**
             * <p>The suggestion.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;desc&quot;: &quot;Upgrade to the latest version at the earliest opportunity.&quot;, &quot;links&quot;:[{&quot;type&quot;: &quot;upgrade&quot;, &quot;desc&quot;: &quot;Click to upgrade&quot;}]}</p>
             */
            public Builder suggestion(String suggestion) {
                this.suggestion = suggestion;
                return this;
            }

            /**
             * SuggestionEn.
             */
            public Builder suggestionEn(String suggestionEn) {
                this.suggestionEn = suggestionEn;
                return this;
            }

            /**
             * <p>The ID of the associated parent task.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder taskId(Long taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>A redundant parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            /**
             * <p>A redundant parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder values(String values) {
                this.values = values;
                return this;
            }

            public RiskList build() {
                return new RiskList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListClusterHealthCheckTaskResponseBody} extends {@link TeaModel}
     *
     * <p>ListClusterHealthCheckTaskResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppVersion")
        private String appVersion;

        @com.aliyun.core.annotation.NameInMap("ChargeType")
        private String chargeType;

        @com.aliyun.core.annotation.NameInMap("ClusterType")
        private String clusterType;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Integer id;

        @com.aliyun.core.annotation.NameInMap("ImageVersion")
        private String imageVersion;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("PrimaryUser")
        private String primaryUser;

        @com.aliyun.core.annotation.NameInMap("Replica")
        private String replica;

        @com.aliyun.core.annotation.NameInMap("RiskList")
        private java.util.List<RiskList> riskList;

        @com.aliyun.core.annotation.NameInMap("Score")
        private Integer score;

        @com.aliyun.core.annotation.NameInMap("Spec")
        private String spec;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TotalItem")
        private Integer totalItem;

        @com.aliyun.core.annotation.NameInMap("TotalRisk")
        private Integer totalRisk;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        @com.aliyun.core.annotation.NameInMap("VersionCode")
        private String versionCode;

        private Result(Builder builder) {
            this.appVersion = builder.appVersion;
            this.chargeType = builder.chargeType;
            this.clusterType = builder.clusterType;
            this.createTime = builder.createTime;
            this.id = builder.id;
            this.imageVersion = builder.imageVersion;
            this.instanceId = builder.instanceId;
            this.primaryUser = builder.primaryUser;
            this.replica = builder.replica;
            this.riskList = builder.riskList;
            this.score = builder.score;
            this.spec = builder.spec;
            this.status = builder.status;
            this.totalItem = builder.totalItem;
            this.totalRisk = builder.totalRisk;
            this.type = builder.type;
            this.updateTime = builder.updateTime;
            this.versionCode = builder.versionCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return appVersion
         */
        public String getAppVersion() {
            return this.appVersion;
        }

        /**
         * @return chargeType
         */
        public String getChargeType() {
            return this.chargeType;
        }

        /**
         * @return clusterType
         */
        public String getClusterType() {
            return this.clusterType;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return id
         */
        public Integer getId() {
            return this.id;
        }

        /**
         * @return imageVersion
         */
        public String getImageVersion() {
            return this.imageVersion;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return primaryUser
         */
        public String getPrimaryUser() {
            return this.primaryUser;
        }

        /**
         * @return replica
         */
        public String getReplica() {
            return this.replica;
        }

        /**
         * @return riskList
         */
        public java.util.List<RiskList> getRiskList() {
            return this.riskList;
        }

        /**
         * @return score
         */
        public Integer getScore() {
            return this.score;
        }

        /**
         * @return spec
         */
        public String getSpec() {
            return this.spec;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return totalItem
         */
        public Integer getTotalItem() {
            return this.totalItem;
        }

        /**
         * @return totalRisk
         */
        public Integer getTotalRisk() {
            return this.totalRisk;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return versionCode
         */
        public String getVersionCode() {
            return this.versionCode;
        }

        public static final class Builder {
            private String appVersion; 
            private String chargeType; 
            private String clusterType; 
            private String createTime; 
            private Integer id; 
            private String imageVersion; 
            private String instanceId; 
            private String primaryUser; 
            private String replica; 
            private java.util.List<RiskList> riskList; 
            private Integer score; 
            private String spec; 
            private String status; 
            private Integer totalItem; 
            private Integer totalRisk; 
            private String type; 
            private String updateTime; 
            private String versionCode; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.appVersion = model.appVersion;
                this.chargeType = model.chargeType;
                this.clusterType = model.clusterType;
                this.createTime = model.createTime;
                this.id = model.id;
                this.imageVersion = model.imageVersion;
                this.instanceId = model.instanceId;
                this.primaryUser = model.primaryUser;
                this.replica = model.replica;
                this.riskList = model.riskList;
                this.score = model.score;
                this.spec = model.spec;
                this.status = model.status;
                this.totalItem = model.totalItem;
                this.totalRisk = model.totalRisk;
                this.type = model.type;
                this.updateTime = model.updateTime;
                this.versionCode = model.versionCode;
            } 

            /**
             * <p>The complete version number.</p>
             * 
             * <strong>example:</strong>
             * <p>1.2.1</p>
             */
            public Builder appVersion(String appVersion) {
                this.appVersion = appVersion;
                return this;
            }

            /**
             * <p>The billing method.</p>
             * 
             * <strong>example:</strong>
             * <p>PREPAY</p>
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * <p>The type of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>Nacos-Ans</p>
             */
            public Builder clusterType(String clusterType) {
                this.clusterType = clusterType;
                return this;
            }

            /**
             * <p>The time when the task was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-06-20T06:51:46Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder id(Integer id) {
                this.id = id;
                return this;
            }

            /**
             * <p>A redundant parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder imageVersion(String imageVersion) {
                this.imageVersion = imageVersion;
                return this;
            }

            /**
             * <p>The ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>mse_ingresspost-cn-0jbvrcex****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The ID of the user to which the instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>123456</p>
             */
            public Builder primaryUser(String primaryUser) {
                this.primaryUser = primaryUser;
                return this;
            }

            /**
             * <p>The number of nodes in the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder replica(String replica) {
                this.replica = replica;
                return this;
            }

            /**
             * <p>The list of risk items.</p>
             */
            public Builder riskList(java.util.List<RiskList> riskList) {
                this.riskList = riskList;
                return this;
            }

            /**
             * <p>The total score.</p>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder score(Integer score) {
                this.score = score;
                return this;
            }

            /**
             * <p>The specifications.</p>
             * 
             * <strong>example:</strong>
             * <p>MSE_SC_2_4_200_c</p>
             */
            public Builder spec(String spec) {
                this.spec = spec;
                return this;
            }

            /**
             * <p>The status of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>FINISH</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The total number of check items.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder totalItem(Integer totalItem) {
                this.totalItem = totalItem;
                return this;
            }

            /**
             * <p>The total number of risk items.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder totalRisk(Integer totalRisk) {
                this.totalRisk = totalRisk;
                return this;
            }

            /**
             * <p>A redundant parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The last update time.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-11-12 15:07:55</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * <p>The version number.</p>
             * 
             * <strong>example:</strong>
             * <p>NACOS_ANS_1_2_1_3</p>
             */
            public Builder versionCode(String versionCode) {
                this.versionCode = versionCode;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListClusterHealthCheckTaskResponseBody} extends {@link TeaModel}
     *
     * <p>ListClusterHealthCheckTaskResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("Result")
        private java.util.List<Result> result;

        @com.aliyun.core.annotation.NameInMap("TotalSize")
        private Integer totalSize;

        private Data(Builder builder) {
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.result = builder.result;
            this.totalSize = builder.totalSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return pageNumber
         */
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return result
         */
        public java.util.List<Result> getResult() {
            return this.result;
        }

        /**
         * @return totalSize
         */
        public Integer getTotalSize() {
            return this.totalSize;
        }

        public static final class Builder {
            private Integer pageNumber; 
            private Integer pageSize; 
            private java.util.List<Result> result; 
            private Integer totalSize; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.result = model.result;
                this.totalSize = model.totalSize;
            } 

            /**
             * <p>The page number of the returned page.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>The number of entries returned per page.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The list of health check tasks.</p>
             */
            public Builder result(java.util.List<Result> result) {
                this.result = result;
                return this;
            }

            /**
             * <p>The total number of returned entries.</p>
             * 
             * <strong>example:</strong>
             * <p>9</p>
             */
            public Builder totalSize(Integer totalSize) {
                this.totalSize = totalSize;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
