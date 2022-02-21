// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAppTemplatesResponseBody} extends {@link TeaModel}
 *
 * <p>ListAppTemplatesResponseBody</p>
 */
public class ListAppTemplatesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    private ListAppTemplatesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAppTemplatesResponseBody create() {
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
         * 返回结果
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public ListAppTemplatesResponseBody build() {
            return new ListAppTemplatesResponseBody(this);
        } 

    } 

    public static class ConfigList extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private ConfigList(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConfigList create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * 配置项
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * 配置项内容
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public ConfigList build() {
                return new ConfigList(this);
            } 

        } 

    }
    public static class AppTemplateInfoList extends TeaModel {
        @NameInMap("AppTemplateCreator")
        private String appTemplateCreator;

        @NameInMap("AppTemplateId")
        private String appTemplateId;

        @NameInMap("AppTemplateName")
        private String appTemplateName;

        @NameInMap("ComponentList")
        private java.util.List < String > componentList;

        @NameInMap("ConfigList")
        private java.util.List < ConfigList> configList;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("IntegrationMode")
        private String integrationMode;

        @NameInMap("Scene")
        private String scene;

        @NameInMap("SdkInfo")
        private String sdkInfo;

        @NameInMap("StandardRoomInfo")
        private String standardRoomInfo;

        @NameInMap("Status")
        private String status;

        private AppTemplateInfoList(Builder builder) {
            this.appTemplateCreator = builder.appTemplateCreator;
            this.appTemplateId = builder.appTemplateId;
            this.appTemplateName = builder.appTemplateName;
            this.componentList = builder.componentList;
            this.configList = builder.configList;
            this.createTime = builder.createTime;
            this.integrationMode = builder.integrationMode;
            this.scene = builder.scene;
            this.sdkInfo = builder.sdkInfo;
            this.standardRoomInfo = builder.standardRoomInfo;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AppTemplateInfoList create() {
            return builder().build();
        }

        /**
         * @return appTemplateCreator
         */
        public String getAppTemplateCreator() {
            return this.appTemplateCreator;
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
         * @return configList
         */
        public java.util.List < ConfigList> getConfigList() {
            return this.configList;
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
         * @return scene
         */
        public String getScene() {
            return this.scene;
        }

        /**
         * @return sdkInfo
         */
        public String getSdkInfo() {
            return this.sdkInfo;
        }

        /**
         * @return standardRoomInfo
         */
        public String getStandardRoomInfo() {
            return this.standardRoomInfo;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String appTemplateCreator; 
            private String appTemplateId; 
            private String appTemplateName; 
            private java.util.List < String > componentList; 
            private java.util.List < ConfigList> configList; 
            private String createTime; 
            private String integrationMode; 
            private String scene; 
            private String sdkInfo; 
            private String standardRoomInfo; 
            private String status; 

            /**
             * 应用模板创建者
             */
            public Builder appTemplateCreator(String appTemplateCreator) {
                this.appTemplateCreator = appTemplateCreator;
                return this;
            }

            /**
             * 应用模板唯一标识
             */
            public Builder appTemplateId(String appTemplateId) {
                this.appTemplateId = appTemplateId;
                return this;
            }

            /**
             * 应用模板名称
             */
            public Builder appTemplateName(String appTemplateName) {
                this.appTemplateName = appTemplateName;
                return this;
            }

            /**
             * 组件列表
             */
            public Builder componentList(java.util.List < String > componentList) {
                this.componentList = componentList;
                return this;
            }

            /**
             * 配置列表
             */
            public Builder configList(java.util.List < ConfigList> configList) {
                this.configList = configList;
                return this;
            }

            /**
             * 创建时间
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
             * 应用模板场景，电商business，课堂classroom
             */
            public Builder scene(String scene) {
                this.scene = scene;
                return this;
            }

            /**
             * SDK信息
             */
            public Builder sdkInfo(String sdkInfo) {
                this.sdkInfo = sdkInfo;
                return this;
            }

            /**
             * 样板间信息
             */
            public Builder standardRoomInfo(String standardRoomInfo) {
                this.standardRoomInfo = standardRoomInfo;
                return this;
            }

            /**
             * 应用模板使用状态
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public AppTemplateInfoList build() {
                return new AppTemplateInfoList(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @NameInMap("AppTemplateInfoList")
        private java.util.List < AppTemplateInfoList> appTemplateInfoList;

        @NameInMap("PageTotal")
        private Integer pageTotal;

        @NameInMap("TotalCount")
        private Integer totalCount;

        private Result(Builder builder) {
            this.appTemplateInfoList = builder.appTemplateInfoList;
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
         * @return appTemplateInfoList
         */
        public java.util.List < AppTemplateInfoList> getAppTemplateInfoList() {
            return this.appTemplateInfoList;
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
            private java.util.List < AppTemplateInfoList> appTemplateInfoList; 
            private Integer pageTotal; 
            private Integer totalCount; 

            /**
             * 应用模板信息列表
             */
            public Builder appTemplateInfoList(java.util.List < AppTemplateInfoList> appTemplateInfoList) {
                this.appTemplateInfoList = appTemplateInfoList;
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
