// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAppsResponseBody} extends {@link TeaModel}
 *
 * <p>ListAppsResponseBody</p>
 */
public class ListAppsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    private ListAppsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAppsResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private Result result; 

        /**
         * 请求ID
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 返回结果体
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public ListAppsResponseBody build() {
            return new ListAppsResponseBody(this);
        } 

    } 

    public static class AppInfoList extends TeaModel {
        @NameInMap("AppConfigStatus")
        private String appConfigStatus;

        @NameInMap("AppId")
        private String appId;

        @NameInMap("AppKey")
        private String appKey;

        @NameInMap("AppName")
        private String appName;

        @NameInMap("AppStatus")
        private String appStatus;

        @NameInMap("AppTemplateId")
        private String appTemplateId;

        @NameInMap("AppTemplateName")
        private String appTemplateName;

        @NameInMap("ComponentList")
        private java.util.List < String > componentList;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("IntegrationMode")
        private String integrationMode;

        @NameInMap("StandardRoomInfo")
        private String standardRoomInfo;

        private AppInfoList(Builder builder) {
            this.appConfigStatus = builder.appConfigStatus;
            this.appId = builder.appId;
            this.appKey = builder.appKey;
            this.appName = builder.appName;
            this.appStatus = builder.appStatus;
            this.appTemplateId = builder.appTemplateId;
            this.appTemplateName = builder.appTemplateName;
            this.componentList = builder.componentList;
            this.createTime = builder.createTime;
            this.integrationMode = builder.integrationMode;
            this.standardRoomInfo = builder.standardRoomInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AppInfoList create() {
            return builder().build();
        }

        /**
         * @return appConfigStatus
         */
        public String getAppConfigStatus() {
            return this.appConfigStatus;
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return appKey
         */
        public String getAppKey() {
            return this.appKey;
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return appStatus
         */
        public String getAppStatus() {
            return this.appStatus;
        }

        /**
         * @return appTemplateId
         */
        public String getAppTemplateId() {
            return this.appTemplateId;
        }

        /**
         * @return appTemplateName
         */
        public String getAppTemplateName() {
            return this.appTemplateName;
        }

        /**
         * @return componentList
         */
        public java.util.List < String > getComponentList() {
            return this.componentList;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return integrationMode
         */
        public String getIntegrationMode() {
            return this.integrationMode;
        }

        /**
         * @return standardRoomInfo
         */
        public String getStandardRoomInfo() {
            return this.standardRoomInfo;
        }

        public static final class Builder {
            private String appConfigStatus; 
            private String appId; 
            private String appKey; 
            private String appName; 
            private String appStatus; 
            private String appTemplateId; 
            private String appTemplateName; 
            private java.util.List < String > componentList; 
            private String createTime; 
            private String integrationMode; 
            private String standardRoomInfo; 

            /**
             * 应用配置状态
             */
            public Builder appConfigStatus(String appConfigStatus) {
                this.appConfigStatus = appConfigStatus;
                return this;
            }

            /**
             * 应用唯一标识符
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * 应用Key
             */
            public Builder appKey(String appKey) {
                this.appKey = appKey;
                return this;
            }

            /**
             * 应用名称
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * 应用状态
             */
            public Builder appStatus(String appStatus) {
                this.appStatus = appStatus;
                return this;
            }

            /**
             * 模板唯一标识
             */
            public Builder appTemplateId(String appTemplateId) {
                this.appTemplateId = appTemplateId;
                return this;
            }

            /**
             * 模板名称
             */
            public Builder appTemplateName(String appTemplateName) {
                this.appTemplateName = appTemplateName;
                return this;
            }

            /**
             * 应用组件列表
             */
            public Builder componentList(java.util.List < String > componentList) {
                this.componentList = componentList;
                return this;
            }

            /**
             * 应用创建时间
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * 集成方式：- 一体化SDK：paasSDK - 样板间：standardRoom
             */
            public Builder integrationMode(String integrationMode) {
                this.integrationMode = integrationMode;
                return this;
            }

            /**
             * 样板间信息
             */
            public Builder standardRoomInfo(String standardRoomInfo) {
                this.standardRoomInfo = standardRoomInfo;
                return this;
            }

            public AppInfoList build() {
                return new AppInfoList(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @NameInMap("AppInfoList")
        private java.util.List < AppInfoList> appInfoList;

        @NameInMap("PageTotal")
        private Integer pageTotal;

        @NameInMap("TotalCount")
        private Integer totalCount;

        private Result(Builder builder) {
            this.appInfoList = builder.appInfoList;
            this.pageTotal = builder.pageTotal;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return appInfoList
         */
        public java.util.List < AppInfoList> getAppInfoList() {
            return this.appInfoList;
        }

        /**
         * @return pageTotal
         */
        public Integer getPageTotal() {
            return this.pageTotal;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List < AppInfoList> appInfoList; 
            private Integer pageTotal; 
            private Integer totalCount; 

            /**
             * App信息列表
             */
            public Builder appInfoList(java.util.List < AppInfoList> appInfoList) {
                this.appInfoList = appInfoList;
                return this;
            }

            /**
             * 总页数
             */
            public Builder pageTotal(Integer pageTotal) {
                this.pageTotal = pageTotal;
                return this;
            }

            /**
             * 总条目数
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
