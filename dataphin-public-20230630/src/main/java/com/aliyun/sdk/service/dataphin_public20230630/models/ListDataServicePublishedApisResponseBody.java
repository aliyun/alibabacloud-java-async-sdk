// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

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
 * {@link ListDataServicePublishedApisResponseBody} extends {@link TeaModel}
 *
 * <p>ListDataServicePublishedApisResponseBody</p>
 */
public class ListDataServicePublishedApisResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageResult")
    private PageResult pageResult;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListDataServicePublishedApisResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.pageResult = builder.pageResult;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDataServicePublishedApisResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
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
     * @return pageResult
     */
    public PageResult getPageResult() {
        return this.pageResult;
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
        private String code; 
        private Integer httpStatusCode; 
        private String message; 
        private PageResult pageResult; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListDataServicePublishedApisResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.pageResult = model.pageResult;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>Backend response code.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>Backend exception details.</p>
         * 
         * <strong>example:</strong>
         * <p>internal error</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Paginated query result.</p>
         */
        public Builder pageResult(PageResult pageResult) {
            this.pageResult = pageResult;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>82E78D6B-AA8F-1FEF-8AA3-5C9DA2A79140</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListDataServicePublishedApisResponseBody build() {
            return new ListDataServicePublishedApisResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDataServicePublishedApisResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataServicePublishedApisResponseBody</p>
     */
    public static class AppInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private Integer appId;

        @com.aliyun.core.annotation.NameInMap("AppKey")
        @Deprecated
        private Long appKey;

        @com.aliyun.core.annotation.NameInMap("AppKeyStr")
        private String appKeyStr;

        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        private AppInfoList(Builder builder) {
            this.appId = builder.appId;
            this.appKey = builder.appKey;
            this.appKeyStr = builder.appKeyStr;
            this.appName = builder.appName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AppInfoList create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public Integer getAppId() {
            return this.appId;
        }

        /**
         * @return appKey
         */
        public Long getAppKey() {
            return this.appKey;
        }

        /**
         * @return appKeyStr
         */
        public String getAppKeyStr() {
            return this.appKeyStr;
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        public static final class Builder {
            private Integer appId; 
            private Long appKey; 
            private String appKeyStr; 
            private String appName; 

            private Builder() {
            } 

            private Builder(AppInfoList model) {
                this.appId = model.appId;
                this.appKey = model.appKey;
                this.appKeyStr = model.appKeyStr;
                this.appName = model.appName;
            } 

            /**
             * <p>Application ID.</p>
             * 
             * <strong>example:</strong>
             * <p>10211</p>
             */
            public Builder appId(Integer appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>Application key.</p>
             * <blockquote>
             * <p>Notice: Deprecated. Use AppKeyStr instead.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>200000000</p>
             */
            public Builder appKey(Long appKey) {
                this.appKey = appKey;
                return this;
            }

            /**
             * <p>Application key.</p>
             * 
             * <strong>example:</strong>
             * <p>APP_200000000</p>
             */
            public Builder appKeyStr(String appKeyStr) {
                this.appKeyStr = appKeyStr;
                return this;
            }

            /**
             * <p>Application name.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            public AppInfoList build() {
                return new AppInfoList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDataServicePublishedApisResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataServicePublishedApisResponseBody</p>
     */
    public static class ApiList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiId")
        private Long apiId;

        @com.aliyun.core.annotation.NameInMap("ApiName")
        private String apiName;

        @com.aliyun.core.annotation.NameInMap("AppCount")
        private Integer appCount;

        @com.aliyun.core.annotation.NameInMap("AppInfoList")
        private java.util.List<AppInfoList> appInfoList;

        @com.aliyun.core.annotation.NameInMap("ApplyStatus")
        private Integer applyStatus;

        @com.aliyun.core.annotation.NameInMap("CallCount")
        private Integer callCount;

        @com.aliyun.core.annotation.NameInMap("CreateType")
        private Integer createType;

        @com.aliyun.core.annotation.NameInMap("CustomUpdateRate")
        private String customUpdateRate;

        @com.aliyun.core.annotation.NameInMap("DeployTime")
        private String deployTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("ExecuteMode")
        private Integer executeMode;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private Integer groupId;

        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("LogicUnitNo")
        private Long logicUnitNo;

        @com.aliyun.core.annotation.NameInMap("Mode")
        private Integer mode;

        @com.aliyun.core.annotation.NameInMap("Owner")
        private String owner;

        @com.aliyun.core.annotation.NameInMap("OwnerUserName")
        private String ownerUserName;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private Integer projectId;

        @com.aliyun.core.annotation.NameInMap("ProjectName")
        private String projectName;

        @com.aliyun.core.annotation.NameInMap("UpdateRate")
        private Integer updateRate;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        private ApiList(Builder builder) {
            this.apiId = builder.apiId;
            this.apiName = builder.apiName;
            this.appCount = builder.appCount;
            this.appInfoList = builder.appInfoList;
            this.applyStatus = builder.applyStatus;
            this.callCount = builder.callCount;
            this.createType = builder.createType;
            this.customUpdateRate = builder.customUpdateRate;
            this.deployTime = builder.deployTime;
            this.description = builder.description;
            this.executeMode = builder.executeMode;
            this.groupId = builder.groupId;
            this.groupName = builder.groupName;
            this.logicUnitNo = builder.logicUnitNo;
            this.mode = builder.mode;
            this.owner = builder.owner;
            this.ownerUserName = builder.ownerUserName;
            this.projectId = builder.projectId;
            this.projectName = builder.projectName;
            this.updateRate = builder.updateRate;
            this.updateTime = builder.updateTime;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApiList create() {
            return builder().build();
        }

        /**
         * @return apiId
         */
        public Long getApiId() {
            return this.apiId;
        }

        /**
         * @return apiName
         */
        public String getApiName() {
            return this.apiName;
        }

        /**
         * @return appCount
         */
        public Integer getAppCount() {
            return this.appCount;
        }

        /**
         * @return appInfoList
         */
        public java.util.List<AppInfoList> getAppInfoList() {
            return this.appInfoList;
        }

        /**
         * @return applyStatus
         */
        public Integer getApplyStatus() {
            return this.applyStatus;
        }

        /**
         * @return callCount
         */
        public Integer getCallCount() {
            return this.callCount;
        }

        /**
         * @return createType
         */
        public Integer getCreateType() {
            return this.createType;
        }

        /**
         * @return customUpdateRate
         */
        public String getCustomUpdateRate() {
            return this.customUpdateRate;
        }

        /**
         * @return deployTime
         */
        public String getDeployTime() {
            return this.deployTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return executeMode
         */
        public Integer getExecuteMode() {
            return this.executeMode;
        }

        /**
         * @return groupId
         */
        public Integer getGroupId() {
            return this.groupId;
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return logicUnitNo
         */
        public Long getLogicUnitNo() {
            return this.logicUnitNo;
        }

        /**
         * @return mode
         */
        public Integer getMode() {
            return this.mode;
        }

        /**
         * @return owner
         */
        public String getOwner() {
            return this.owner;
        }

        /**
         * @return ownerUserName
         */
        public String getOwnerUserName() {
            return this.ownerUserName;
        }

        /**
         * @return projectId
         */
        public Integer getProjectId() {
            return this.projectId;
        }

        /**
         * @return projectName
         */
        public String getProjectName() {
            return this.projectName;
        }

        /**
         * @return updateRate
         */
        public Integer getUpdateRate() {
            return this.updateRate;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private Long apiId; 
            private String apiName; 
            private Integer appCount; 
            private java.util.List<AppInfoList> appInfoList; 
            private Integer applyStatus; 
            private Integer callCount; 
            private Integer createType; 
            private String customUpdateRate; 
            private String deployTime; 
            private String description; 
            private Integer executeMode; 
            private Integer groupId; 
            private String groupName; 
            private Long logicUnitNo; 
            private Integer mode; 
            private String owner; 
            private String ownerUserName; 
            private Integer projectId; 
            private String projectName; 
            private Integer updateRate; 
            private String updateTime; 
            private String version; 

            private Builder() {
            } 

            private Builder(ApiList model) {
                this.apiId = model.apiId;
                this.apiName = model.apiName;
                this.appCount = model.appCount;
                this.appInfoList = model.appInfoList;
                this.applyStatus = model.applyStatus;
                this.callCount = model.callCount;
                this.createType = model.createType;
                this.customUpdateRate = model.customUpdateRate;
                this.deployTime = model.deployTime;
                this.description = model.description;
                this.executeMode = model.executeMode;
                this.groupId = model.groupId;
                this.groupName = model.groupName;
                this.logicUnitNo = model.logicUnitNo;
                this.mode = model.mode;
                this.owner = model.owner;
                this.ownerUserName = model.ownerUserName;
                this.projectId = model.projectId;
                this.projectName = model.projectName;
                this.updateRate = model.updateRate;
                this.updateTime = model.updateTime;
                this.version = model.version;
            } 

            /**
             * <p>API ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1022</p>
             */
            public Builder apiId(Long apiId) {
                this.apiId = apiId;
                return this;
            }

            /**
             * <p>API name.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder apiName(String apiName) {
                this.apiName = apiName;
                return this;
            }

            /**
             * <p>Number of bound applications.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder appCount(Integer appCount) {
                this.appCount = appCount;
                return this;
            }

            /**
             * <p>List of referenced application information.</p>
             */
            public Builder appInfoList(java.util.List<AppInfoList> appInfoList) {
                this.appInfoList = appInfoList;
                return this;
            }

            /**
             * <p>Application status. Valid values: 0 (not all applied), 1 (applied), 2 (no app, need to apply for an app first).</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder applyStatus(Integer applyStatus) {
                this.applyStatus = applyStatus;
                return this;
            }

            /**
             * <p>Number of calls.</p>
             * 
             * <strong>example:</strong>
             * <p>21</p>
             */
            public Builder callCount(Integer callCount) {
                this.callCount = callCount;
                return this;
            }

            /**
             * <p>Creation type. Valid values: 0 (custom mode), 1 (wizard mode), 2 (direct connection API).</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder createType(Integer createType) {
                this.createType = createType;
                return this;
            }

            /**
             * <p>Custom update frequency content.</p>
             * 
             * <strong>example:</strong>
             * <p>0 0 0/1 * * *</p>
             */
            public Builder customUpdateRate(String customUpdateRate) {
                this.customUpdateRate = customUpdateRate;
                return this;
            }

            /**
             * <p>Publish time. Time format: yyyy-MM-dd HH:mm:ss.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-06-30 08:00:00</p>
             */
            public Builder deployTime(String deployTime) {
                this.deployTime = deployTime;
                return this;
            }

            /**
             * <p>API description.</p>
             * 
             * <strong>example:</strong>
             * <p>test xx</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Call type. Valid values: 1 (synchronous), 2 (asynchronous).</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder executeMode(Integer executeMode) {
                this.executeMode = executeMode;
                return this;
            }

            /**
             * <p>Group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>102131</p>
             */
            public Builder groupId(Integer groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>API group name.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * <p>Service unit number.</p>
             * 
             * <strong>example:</strong>
             * <p>1022</p>
             */
            public Builder logicUnitNo(Long logicUnitNo) {
                this.logicUnitNo = logicUnitNo;
                return this;
            }

            /**
             * <p>Mode. Valid values: 0 (basic), 1 (dev_prod).</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder mode(Integer mode) {
                this.mode = mode;
                return this;
            }

            /**
             * <p>Owner ID.</p>
             * 
             * <strong>example:</strong>
             * <p>30012011</p>
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * <p>Owner name.</p>
             * 
             * <strong>example:</strong>
             * <p>张三</p>
             */
            public Builder ownerUserName(String ownerUserName) {
                this.ownerUserName = ownerUserName;
                return this;
            }

            /**
             * <p>Data service project ID.</p>
             * 
             * <strong>example:</strong>
             * <p>102101</p>
             */
            public Builder projectId(Integer projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * <p>Service project name.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder projectName(String projectName) {
                this.projectName = projectName;
                return this;
            }

            /**
             * <p>Update frequency. Valid values: 0 (custom), 1 (daily), 2 (hourly), 3 (per minute).</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder updateRate(Integer updateRate) {
                this.updateRate = updateRate;
                return this;
            }

            /**
             * <p>Modification time. Time format: yyyy-MM-dd HH:mm:ss.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-06-30 08:00:00</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * <p>API version.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public ApiList build() {
                return new ApiList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDataServicePublishedApisResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataServicePublishedApisResponseBody</p>
     */
    public static class PageResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiList")
        private java.util.List<ApiList> apiList;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private PageResult(Builder builder) {
            this.apiList = builder.apiList;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageResult create() {
            return builder().build();
        }

        /**
         * @return apiList
         */
        public java.util.List<ApiList> getApiList() {
            return this.apiList;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List<ApiList> apiList; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(PageResult model) {
                this.apiList = model.apiList;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>Paginated API list.</p>
             */
            public Builder apiList(java.util.List<ApiList> apiList) {
                this.apiList = apiList;
                return this;
            }

            /**
             * <p>Total number of records.</p>
             * 
             * <strong>example:</strong>
             * <p>68</p>
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PageResult build() {
                return new PageResult(this);
            } 

        } 

    }
}
