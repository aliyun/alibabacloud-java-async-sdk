// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListClusterHealthCheckTaskResponseBody} extends {@link TeaModel}
 *
 * <p>ListClusterHealthCheckTaskResponseBody</p>
 */
public class ListClusterHealthCheckTaskResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("DynamicCode")
    private String dynamicCode;

    @NameInMap("DynamicMessage")
    private String dynamicMessage;

    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
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

        /**
         * The status code. A value of 200 is returned if the request was successful.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The details of the data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The dynamic part in the error message.
         */
        public Builder dynamicCode(String dynamicCode) {
            this.dynamicCode = dynamicCode;
            return this;
        }

        /**
         * The dynamic part in the error message. This parameter is used to replace the \*\*%s\*\* variable in the **ErrMessage** parameter.
         * <p>
         * 
         * > If the return value of the **ErrMessage** parameter is **The Value of Input Parameter %s is not valid** and the return value of the **DynamicMessage** parameter is **DtsJobId**, the specified **DtsJobId** parameter is invalid.
         */
        public Builder dynamicMessage(String dynamicMessage) {
            this.dynamicMessage = dynamicMessage;
            return this;
        }

        /**
         * The error code returned if the request failed. Take note of the following rules:
         * <p>
         * 
         * *   The **ErrorCode** parameter is not returned if the request is successful.
         * *   The **ErrorCode** parameter is returned if the request fails. For more information, see the **Error codes** section in this topic.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The HTTP status code returned.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * The message returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   `true`: The request was successful.
         * *   `false`: The request failed.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListClusterHealthCheckTaskResponseBody build() {
            return new ListClusterHealthCheckTaskResponseBody(this);
        } 

    } 

    public static class RiskList extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("Id")
        private Integer id;

        @NameInMap("Module")
        private String module;

        @NameInMap("Mute")
        private Boolean mute;

        @NameInMap("NoticeFeature")
        private Boolean noticeFeature;

        @NameInMap("PrimaryUser")
        private String primaryUser;

        @NameInMap("RiskCode")
        private String riskCode;

        @NameInMap("RiskLevel")
        private String riskLevel;

        @NameInMap("RiskName")
        private String riskName;

        @NameInMap("RiskType")
        private String riskType;

        @NameInMap("Situation")
        private String situation;

        @NameInMap("Suggestion")
        private String suggestion;

        @NameInMap("TaskId")
        private Long taskId;

        @NameInMap("Type")
        private Integer type;

        @NameInMap("Values")
        private String values;

        private RiskList(Builder builder) {
            this.description = builder.description;
            this.id = builder.id;
            this.module = builder.module;
            this.mute = builder.mute;
            this.noticeFeature = builder.noticeFeature;
            this.primaryUser = builder.primaryUser;
            this.riskCode = builder.riskCode;
            this.riskLevel = builder.riskLevel;
            this.riskName = builder.riskName;
            this.riskType = builder.riskType;
            this.situation = builder.situation;
            this.suggestion = builder.suggestion;
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
         * @return suggestion
         */
        public String getSuggestion() {
            return this.suggestion;
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
            private Integer id; 
            private String module; 
            private Boolean mute; 
            private Boolean noticeFeature; 
            private String primaryUser; 
            private String riskCode; 
            private String riskLevel; 
            private String riskName; 
            private String riskType; 
            private String situation; 
            private String suggestion; 
            private Long taskId; 
            private Integer type; 
            private String values; 

            /**
             * The description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The instance ID.
             */
            public Builder id(Integer id) {
                this.id = id;
                return this;
            }

            /**
             * A redundant parameter.
             */
            public Builder module(String module) {
                this.module = module;
                return this;
            }

            /**
             * Indicates whether the risk item notification feature is disabled. Valid values:
             * <p>
             * 
             * *   true: disabled
             * *   false: enabled
             */
            public Builder mute(Boolean mute) {
                this.mute = mute;
                return this;
            }

            /**
             * A redundant parameter.
             */
            public Builder noticeFeature(Boolean noticeFeature) {
                this.noticeFeature = noticeFeature;
                return this;
            }

            /**
             * The ID of the user to which the cluster belongs.
             */
            public Builder primaryUser(String primaryUser) {
                this.primaryUser = primaryUser;
                return this;
            }

            /**
             * The code of the risk.
             */
            public Builder riskCode(String riskCode) {
                this.riskCode = riskCode;
                return this;
            }

            /**
             * The severity of the risk. Valid values:
             * <p>
             * 
             * *   HIGH: high risk
             * *   MID: medium risk
             * *   LOW: low risk
             */
            public Builder riskLevel(String riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            /**
             * The name of the risk.
             */
            public Builder riskName(String riskName) {
                this.riskName = riskName;
                return this;
            }

            /**
             * The type of the risk.
             */
            public Builder riskType(String riskType) {
                this.riskType = riskType;
                return this;
            }

            /**
             * The situation.
             */
            public Builder situation(String situation) {
                this.situation = situation;
                return this;
            }

            /**
             * The suggestion.
             */
            public Builder suggestion(String suggestion) {
                this.suggestion = suggestion;
                return this;
            }

            /**
             * The ID of the associated parent task.
             */
            public Builder taskId(Long taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * A redundant parameter.
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            /**
             * A redundant parameter.
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
    public static class Result extends TeaModel {
        @NameInMap("AppVersion")
        private String appVersion;

        @NameInMap("ChargeType")
        private String chargeType;

        @NameInMap("ClusterType")
        private String clusterType;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("Id")
        private Integer id;

        @NameInMap("ImageVersion")
        private String imageVersion;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("PrimaryUser")
        private String primaryUser;

        @NameInMap("Replica")
        private String replica;

        @NameInMap("RiskList")
        private java.util.List < RiskList> riskList;

        @NameInMap("Score")
        private Integer score;

        @NameInMap("Spec")
        private String spec;

        @NameInMap("Status")
        private String status;

        @NameInMap("TotalItem")
        private Integer totalItem;

        @NameInMap("TotalRisk")
        private Integer totalRisk;

        @NameInMap("Type")
        private String type;

        @NameInMap("UpdateTime")
        private String updateTime;

        @NameInMap("VersionCode")
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
        public java.util.List < RiskList> getRiskList() {
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
            private java.util.List < RiskList> riskList; 
            private Integer score; 
            private String spec; 
            private String status; 
            private Integer totalItem; 
            private Integer totalRisk; 
            private String type; 
            private String updateTime; 
            private String versionCode; 

            /**
             * The complete version number.
             */
            public Builder appVersion(String appVersion) {
                this.appVersion = appVersion;
                return this;
            }

            /**
             * The billing method.
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * The type of the cluster.
             */
            public Builder clusterType(String clusterType) {
                this.clusterType = clusterType;
                return this;
            }

            /**
             * The time when the task was created.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The serial number.
             */
            public Builder id(Integer id) {
                this.id = id;
                return this;
            }

            /**
             * A redundant parameter.
             */
            public Builder imageVersion(String imageVersion) {
                this.imageVersion = imageVersion;
                return this;
            }

            /**
             * The instance ID.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The ID of the user to which the cluster belongs.
             */
            public Builder primaryUser(String primaryUser) {
                this.primaryUser = primaryUser;
                return this;
            }

            /**
             * The number of nodes in the cluster.
             */
            public Builder replica(String replica) {
                this.replica = replica;
                return this;
            }

            /**
             * The risk items.
             */
            public Builder riskList(java.util.List < RiskList> riskList) {
                this.riskList = riskList;
                return this;
            }

            /**
             * The total score.
             */
            public Builder score(Integer score) {
                this.score = score;
                return this;
            }

            /**
             * The specifications.
             */
            public Builder spec(String spec) {
                this.spec = spec;
                return this;
            }

            /**
             * The task state.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The total number of check items.
             */
            public Builder totalItem(Integer totalItem) {
                this.totalItem = totalItem;
                return this;
            }

            /**
             * The total number of risk items.
             */
            public Builder totalRisk(Integer totalRisk) {
                this.totalRisk = totalRisk;
                return this;
            }

            /**
             * A redundant parameter.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The time when the task was last updated.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * The version number.
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
    public static class Data extends TeaModel {
        @NameInMap("PageNumber")
        private Integer pageNumber;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("Result")
        private java.util.List < Result> result;

        @NameInMap("TotalSize")
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
        public java.util.List < Result> getResult() {
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
            private java.util.List < Result> result; 
            private Integer totalSize; 

            /**
             * The page number of the returned page.
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * The number of entries returned per page.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * The list of health check tasks.
             */
            public Builder result(java.util.List < Result> result) {
                this.result = result;
                return this;
            }

            /**
             * The total number of returned entries.
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
