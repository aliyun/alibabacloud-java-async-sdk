// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAppResponseBody} extends {@link TeaModel}
 *
 * <p>ListAppResponseBody</p>
 */
public class ListAppResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("ErrorMsg")
    private String errorMsg;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListAppResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMsg = builder.errorMsg;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAppResponseBody create() {
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
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return errorMsg
     */
    public String getErrorMsg() {
        return this.errorMsg;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer code; 
        private java.util.List < Data> data; 
        private String errorMsg; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * ErrorMsg.
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListAppResponseBody build() {
            return new ListAppResponseBody(this);
        } 

    } 

    public static class MiddleWareList extends TeaModel {
        @NameInMap("AppId")
        private Long appId;

        @NameInMap("Code")
        private Integer code;

        @NameInMap("Name")
        private String name;

        private MiddleWareList(Builder builder) {
            this.appId = builder.appId;
            this.code = builder.code;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MiddleWareList create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public Long getAppId() {
            return this.appId;
        }

        /**
         * @return code
         */
        public Integer getCode() {
            return this.code;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private Long appId; 
            private Integer code; 
            private String name; 

            /**
             * AppId.
             */
            public Builder appId(Long appId) {
                this.appId = appId;
                return this;
            }

            /**
             * Code.
             */
            public Builder code(Integer code) {
                this.code = code;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public MiddleWareList build() {
                return new MiddleWareList(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("AppId")
        private Long appId;

        @NameInMap("AppStateType")
        private String appStateType;

        @NameInMap("BizName")
        private String bizName;

        @NameInMap("BizTitle")
        private String bizTitle;

        @NameInMap("DeployType")
        private String deployType;

        @NameInMap("Description")
        private String description;

        @NameInMap("Language")
        private String language;

        @NameInMap("MiddleWareList")
        private java.util.List < MiddleWareList> middleWareList;

        @NameInMap("OperatingSystem")
        private String operatingSystem;

        @NameInMap("ServiceType")
        private String serviceType;

        @NameInMap("Title")
        private String title;

        private Data(Builder builder) {
            this.appId = builder.appId;
            this.appStateType = builder.appStateType;
            this.bizName = builder.bizName;
            this.bizTitle = builder.bizTitle;
            this.deployType = builder.deployType;
            this.description = builder.description;
            this.language = builder.language;
            this.middleWareList = builder.middleWareList;
            this.operatingSystem = builder.operatingSystem;
            this.serviceType = builder.serviceType;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public Long getAppId() {
            return this.appId;
        }

        /**
         * @return appStateType
         */
        public String getAppStateType() {
            return this.appStateType;
        }

        /**
         * @return bizName
         */
        public String getBizName() {
            return this.bizName;
        }

        /**
         * @return bizTitle
         */
        public String getBizTitle() {
            return this.bizTitle;
        }

        /**
         * @return deployType
         */
        public String getDeployType() {
            return this.deployType;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return language
         */
        public String getLanguage() {
            return this.language;
        }

        /**
         * @return middleWareList
         */
        public java.util.List < MiddleWareList> getMiddleWareList() {
            return this.middleWareList;
        }

        /**
         * @return operatingSystem
         */
        public String getOperatingSystem() {
            return this.operatingSystem;
        }

        /**
         * @return serviceType
         */
        public String getServiceType() {
            return this.serviceType;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private Long appId; 
            private String appStateType; 
            private String bizName; 
            private String bizTitle; 
            private String deployType; 
            private String description; 
            private String language; 
            private java.util.List < MiddleWareList> middleWareList; 
            private String operatingSystem; 
            private String serviceType; 
            private String title; 

            /**
             * AppId.
             */
            public Builder appId(Long appId) {
                this.appId = appId;
                return this;
            }

            /**
             * AppStateType.
             */
            public Builder appStateType(String appStateType) {
                this.appStateType = appStateType;
                return this;
            }

            /**
             * BizName.
             */
            public Builder bizName(String bizName) {
                this.bizName = bizName;
                return this;
            }

            /**
             * BizTitle.
             */
            public Builder bizTitle(String bizTitle) {
                this.bizTitle = bizTitle;
                return this;
            }

            /**
             * DeployType.
             */
            public Builder deployType(String deployType) {
                this.deployType = deployType;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Language.
             */
            public Builder language(String language) {
                this.language = language;
                return this;
            }

            /**
             * MiddleWareList.
             */
            public Builder middleWareList(java.util.List < MiddleWareList> middleWareList) {
                this.middleWareList = middleWareList;
                return this;
            }

            /**
             * OperatingSystem.
             */
            public Builder operatingSystem(String operatingSystem) {
                this.operatingSystem = operatingSystem;
                return this;
            }

            /**
             * ServiceType.
             */
            public Builder serviceType(String serviceType) {
                this.serviceType = serviceType;
                return this;
            }

            /**
             * Title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
