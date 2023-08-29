// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMdsMiniConfigResponseBody} extends {@link TeaModel}
 *
 * <p>GetMdsMiniConfigResponseBody</p>
 */
public class GetMdsMiniConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResultCode")
    private String resultCode;

    @NameInMap("ResultContent")
    private ResultContent resultContent;

    @NameInMap("ResultMessage")
    private String resultMessage;

    private GetMdsMiniConfigResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resultCode = builder.resultCode;
        this.resultContent = builder.resultContent;
        this.resultMessage = builder.resultMessage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMdsMiniConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resultCode
     */
    public String getResultCode() {
        return this.resultCode;
    }

    /**
     * @return resultContent
     */
    public ResultContent getResultContent() {
        return this.resultContent;
    }

    /**
     * @return resultMessage
     */
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static final class Builder {
        private String requestId; 
        private String resultCode; 
        private ResultContent resultContent; 
        private String resultMessage; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ResultCode.
         */
        public Builder resultCode(String resultCode) {
            this.resultCode = resultCode;
            return this;
        }

        /**
         * ResultContent.
         */
        public Builder resultContent(ResultContent resultContent) {
            this.resultContent = resultContent;
            return this;
        }

        /**
         * ResultMessage.
         */
        public Builder resultMessage(String resultMessage) {
            this.resultMessage = resultMessage;
            return this;
        }

        public GetMdsMiniConfigResponseBody build() {
            return new GetMdsMiniConfigResponseBody(this);
        } 

    } 

    public static class ApiConfigList extends TeaModel {
        @NameInMap("AppCode")
        private String appCode;

        @NameInMap("ConfigStatus")
        private Long configStatus;

        @NameInMap("ConfigType")
        private String configType;

        @NameInMap("ConfigValue")
        private String configValue;

        @NameInMap("Description")
        private String description;

        @NameInMap("GmtCreate")
        private String gmtCreate;

        @NameInMap("GmtModified")
        private String gmtModified;

        @NameInMap("H5Id")
        private String h5Id;

        @NameInMap("H5Name")
        private String h5Name;

        @NameInMap("Id")
        private Long id;

        private ApiConfigList(Builder builder) {
            this.appCode = builder.appCode;
            this.configStatus = builder.configStatus;
            this.configType = builder.configType;
            this.configValue = builder.configValue;
            this.description = builder.description;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.h5Id = builder.h5Id;
            this.h5Name = builder.h5Name;
            this.id = builder.id;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApiConfigList create() {
            return builder().build();
        }

        /**
         * @return appCode
         */
        public String getAppCode() {
            return this.appCode;
        }

        /**
         * @return configStatus
         */
        public Long getConfigStatus() {
            return this.configStatus;
        }

        /**
         * @return configType
         */
        public String getConfigType() {
            return this.configType;
        }

        /**
         * @return configValue
         */
        public String getConfigValue() {
            return this.configValue;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
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
         * @return h5Id
         */
        public String getH5Id() {
            return this.h5Id;
        }

        /**
         * @return h5Name
         */
        public String getH5Name() {
            return this.h5Name;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        public static final class Builder {
            private String appCode; 
            private Long configStatus; 
            private String configType; 
            private String configValue; 
            private String description; 
            private String gmtCreate; 
            private String gmtModified; 
            private String h5Id; 
            private String h5Name; 
            private Long id; 

            /**
             * AppCode.
             */
            public Builder appCode(String appCode) {
                this.appCode = appCode;
                return this;
            }

            /**
             * ConfigStatus.
             */
            public Builder configStatus(Long configStatus) {
                this.configStatus = configStatus;
                return this;
            }

            /**
             * ConfigType.
             */
            public Builder configType(String configType) {
                this.configType = configType;
                return this;
            }

            /**
             * ConfigValue.
             */
            public Builder configValue(String configValue) {
                this.configValue = configValue;
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
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * H5Id.
             */
            public Builder h5Id(String h5Id) {
                this.h5Id = h5Id;
                return this;
            }

            /**
             * H5Name.
             */
            public Builder h5Name(String h5Name) {
                this.h5Name = h5Name;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            public ApiConfigList build() {
                return new ApiConfigList(this);
            } 

        } 

    }
    public static class PrivilegeSwitch extends TeaModel {
        @NameInMap("AppCode")
        private String appCode;

        @NameInMap("ConfigStatus")
        private Long configStatus;

        @NameInMap("ConfigType")
        private String configType;

        @NameInMap("ConfigValue")
        private String configValue;

        @NameInMap("Description")
        private String description;

        @NameInMap("GmtCreate")
        private String gmtCreate;

        @NameInMap("GmtModified")
        private String gmtModified;

        @NameInMap("H5Id")
        private String h5Id;

        @NameInMap("H5Name")
        private String h5Name;

        @NameInMap("Id")
        private Long id;

        private PrivilegeSwitch(Builder builder) {
            this.appCode = builder.appCode;
            this.configStatus = builder.configStatus;
            this.configType = builder.configType;
            this.configValue = builder.configValue;
            this.description = builder.description;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.h5Id = builder.h5Id;
            this.h5Name = builder.h5Name;
            this.id = builder.id;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PrivilegeSwitch create() {
            return builder().build();
        }

        /**
         * @return appCode
         */
        public String getAppCode() {
            return this.appCode;
        }

        /**
         * @return configStatus
         */
        public Long getConfigStatus() {
            return this.configStatus;
        }

        /**
         * @return configType
         */
        public String getConfigType() {
            return this.configType;
        }

        /**
         * @return configValue
         */
        public String getConfigValue() {
            return this.configValue;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
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
         * @return h5Id
         */
        public String getH5Id() {
            return this.h5Id;
        }

        /**
         * @return h5Name
         */
        public String getH5Name() {
            return this.h5Name;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        public static final class Builder {
            private String appCode; 
            private Long configStatus; 
            private String configType; 
            private String configValue; 
            private String description; 
            private String gmtCreate; 
            private String gmtModified; 
            private String h5Id; 
            private String h5Name; 
            private Long id; 

            /**
             * AppCode.
             */
            public Builder appCode(String appCode) {
                this.appCode = appCode;
                return this;
            }

            /**
             * ConfigStatus.
             */
            public Builder configStatus(Long configStatus) {
                this.configStatus = configStatus;
                return this;
            }

            /**
             * ConfigType.
             */
            public Builder configType(String configType) {
                this.configType = configType;
                return this;
            }

            /**
             * ConfigValue.
             */
            public Builder configValue(String configValue) {
                this.configValue = configValue;
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
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * H5Id.
             */
            public Builder h5Id(String h5Id) {
                this.h5Id = h5Id;
                return this;
            }

            /**
             * H5Name.
             */
            public Builder h5Name(String h5Name) {
                this.h5Name = h5Name;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            public PrivilegeSwitch build() {
                return new PrivilegeSwitch(this);
            } 

        } 

    }
    public static class ServerDomainConfigList extends TeaModel {
        @NameInMap("AppCode")
        private String appCode;

        @NameInMap("ConfigStatus")
        private Long configStatus;

        @NameInMap("ConfigType")
        private String configType;

        @NameInMap("ConfigValue")
        private String configValue;

        @NameInMap("Description")
        private String description;

        @NameInMap("GmtCreate")
        private String gmtCreate;

        @NameInMap("GmtModified")
        private String gmtModified;

        @NameInMap("H5Id")
        private String h5Id;

        @NameInMap("H5Name")
        private String h5Name;

        @NameInMap("Id")
        private Long id;

        private ServerDomainConfigList(Builder builder) {
            this.appCode = builder.appCode;
            this.configStatus = builder.configStatus;
            this.configType = builder.configType;
            this.configValue = builder.configValue;
            this.description = builder.description;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.h5Id = builder.h5Id;
            this.h5Name = builder.h5Name;
            this.id = builder.id;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServerDomainConfigList create() {
            return builder().build();
        }

        /**
         * @return appCode
         */
        public String getAppCode() {
            return this.appCode;
        }

        /**
         * @return configStatus
         */
        public Long getConfigStatus() {
            return this.configStatus;
        }

        /**
         * @return configType
         */
        public String getConfigType() {
            return this.configType;
        }

        /**
         * @return configValue
         */
        public String getConfigValue() {
            return this.configValue;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
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
         * @return h5Id
         */
        public String getH5Id() {
            return this.h5Id;
        }

        /**
         * @return h5Name
         */
        public String getH5Name() {
            return this.h5Name;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        public static final class Builder {
            private String appCode; 
            private Long configStatus; 
            private String configType; 
            private String configValue; 
            private String description; 
            private String gmtCreate; 
            private String gmtModified; 
            private String h5Id; 
            private String h5Name; 
            private Long id; 

            /**
             * AppCode.
             */
            public Builder appCode(String appCode) {
                this.appCode = appCode;
                return this;
            }

            /**
             * ConfigStatus.
             */
            public Builder configStatus(Long configStatus) {
                this.configStatus = configStatus;
                return this;
            }

            /**
             * ConfigType.
             */
            public Builder configType(String configType) {
                this.configType = configType;
                return this;
            }

            /**
             * ConfigValue.
             */
            public Builder configValue(String configValue) {
                this.configValue = configValue;
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
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * H5Id.
             */
            public Builder h5Id(String h5Id) {
                this.h5Id = h5Id;
                return this;
            }

            /**
             * H5Name.
             */
            public Builder h5Name(String h5Name) {
                this.h5Name = h5Name;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            public ServerDomainConfigList build() {
                return new ServerDomainConfigList(this);
            } 

        } 

    }
    public static class WebviewDomainConfigList extends TeaModel {
        @NameInMap("AppCode")
        private String appCode;

        @NameInMap("ConfigStatus")
        private Long configStatus;

        @NameInMap("ConfigType")
        private String configType;

        @NameInMap("ConfigValue")
        private String configValue;

        @NameInMap("Description")
        private String description;

        @NameInMap("GmtCreate")
        private String gmtCreate;

        @NameInMap("GmtModified")
        private String gmtModified;

        @NameInMap("H5Id")
        private String h5Id;

        @NameInMap("H5Name")
        private String h5Name;

        @NameInMap("Id")
        private Long id;

        private WebviewDomainConfigList(Builder builder) {
            this.appCode = builder.appCode;
            this.configStatus = builder.configStatus;
            this.configType = builder.configType;
            this.configValue = builder.configValue;
            this.description = builder.description;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.h5Id = builder.h5Id;
            this.h5Name = builder.h5Name;
            this.id = builder.id;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WebviewDomainConfigList create() {
            return builder().build();
        }

        /**
         * @return appCode
         */
        public String getAppCode() {
            return this.appCode;
        }

        /**
         * @return configStatus
         */
        public Long getConfigStatus() {
            return this.configStatus;
        }

        /**
         * @return configType
         */
        public String getConfigType() {
            return this.configType;
        }

        /**
         * @return configValue
         */
        public String getConfigValue() {
            return this.configValue;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
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
         * @return h5Id
         */
        public String getH5Id() {
            return this.h5Id;
        }

        /**
         * @return h5Name
         */
        public String getH5Name() {
            return this.h5Name;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        public static final class Builder {
            private String appCode; 
            private Long configStatus; 
            private String configType; 
            private String configValue; 
            private String description; 
            private String gmtCreate; 
            private String gmtModified; 
            private String h5Id; 
            private String h5Name; 
            private Long id; 

            /**
             * AppCode.
             */
            public Builder appCode(String appCode) {
                this.appCode = appCode;
                return this;
            }

            /**
             * ConfigStatus.
             */
            public Builder configStatus(Long configStatus) {
                this.configStatus = configStatus;
                return this;
            }

            /**
             * ConfigType.
             */
            public Builder configType(String configType) {
                this.configType = configType;
                return this;
            }

            /**
             * ConfigValue.
             */
            public Builder configValue(String configValue) {
                this.configValue = configValue;
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
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * H5Id.
             */
            public Builder h5Id(String h5Id) {
                this.h5Id = h5Id;
                return this;
            }

            /**
             * H5Name.
             */
            public Builder h5Name(String h5Name) {
                this.h5Name = h5Name;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            public WebviewDomainConfigList build() {
                return new WebviewDomainConfigList(this);
            } 

        } 

    }
    public static class Content extends TeaModel {
        @NameInMap("ApiConfigList")
        private java.util.List < ApiConfigList> apiConfigList;

        @NameInMap("AppCode")
        private String appCode;

        @NameInMap("EnableServerDomainCount")
        private String enableServerDomainCount;

        @NameInMap("H5Id")
        private String h5Id;

        @NameInMap("H5Name")
        private String h5Name;

        @NameInMap("PrivilegeSwitch")
        private PrivilegeSwitch privilegeSwitch;

        @NameInMap("ServerDomainConfigList")
        private java.util.List < ServerDomainConfigList> serverDomainConfigList;

        @NameInMap("WebviewDomainConfigList")
        private java.util.List < WebviewDomainConfigList> webviewDomainConfigList;

        private Content(Builder builder) {
            this.apiConfigList = builder.apiConfigList;
            this.appCode = builder.appCode;
            this.enableServerDomainCount = builder.enableServerDomainCount;
            this.h5Id = builder.h5Id;
            this.h5Name = builder.h5Name;
            this.privilegeSwitch = builder.privilegeSwitch;
            this.serverDomainConfigList = builder.serverDomainConfigList;
            this.webviewDomainConfigList = builder.webviewDomainConfigList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Content create() {
            return builder().build();
        }

        /**
         * @return apiConfigList
         */
        public java.util.List < ApiConfigList> getApiConfigList() {
            return this.apiConfigList;
        }

        /**
         * @return appCode
         */
        public String getAppCode() {
            return this.appCode;
        }

        /**
         * @return enableServerDomainCount
         */
        public String getEnableServerDomainCount() {
            return this.enableServerDomainCount;
        }

        /**
         * @return h5Id
         */
        public String getH5Id() {
            return this.h5Id;
        }

        /**
         * @return h5Name
         */
        public String getH5Name() {
            return this.h5Name;
        }

        /**
         * @return privilegeSwitch
         */
        public PrivilegeSwitch getPrivilegeSwitch() {
            return this.privilegeSwitch;
        }

        /**
         * @return serverDomainConfigList
         */
        public java.util.List < ServerDomainConfigList> getServerDomainConfigList() {
            return this.serverDomainConfigList;
        }

        /**
         * @return webviewDomainConfigList
         */
        public java.util.List < WebviewDomainConfigList> getWebviewDomainConfigList() {
            return this.webviewDomainConfigList;
        }

        public static final class Builder {
            private java.util.List < ApiConfigList> apiConfigList; 
            private String appCode; 
            private String enableServerDomainCount; 
            private String h5Id; 
            private String h5Name; 
            private PrivilegeSwitch privilegeSwitch; 
            private java.util.List < ServerDomainConfigList> serverDomainConfigList; 
            private java.util.List < WebviewDomainConfigList> webviewDomainConfigList; 

            /**
             * ApiConfigList.
             */
            public Builder apiConfigList(java.util.List < ApiConfigList> apiConfigList) {
                this.apiConfigList = apiConfigList;
                return this;
            }

            /**
             * AppCode.
             */
            public Builder appCode(String appCode) {
                this.appCode = appCode;
                return this;
            }

            /**
             * EnableServerDomainCount.
             */
            public Builder enableServerDomainCount(String enableServerDomainCount) {
                this.enableServerDomainCount = enableServerDomainCount;
                return this;
            }

            /**
             * H5Id.
             */
            public Builder h5Id(String h5Id) {
                this.h5Id = h5Id;
                return this;
            }

            /**
             * H5Name.
             */
            public Builder h5Name(String h5Name) {
                this.h5Name = h5Name;
                return this;
            }

            /**
             * PrivilegeSwitch.
             */
            public Builder privilegeSwitch(PrivilegeSwitch privilegeSwitch) {
                this.privilegeSwitch = privilegeSwitch;
                return this;
            }

            /**
             * ServerDomainConfigList.
             */
            public Builder serverDomainConfigList(java.util.List < ServerDomainConfigList> serverDomainConfigList) {
                this.serverDomainConfigList = serverDomainConfigList;
                return this;
            }

            /**
             * WebviewDomainConfigList.
             */
            public Builder webviewDomainConfigList(java.util.List < WebviewDomainConfigList> webviewDomainConfigList) {
                this.webviewDomainConfigList = webviewDomainConfigList;
                return this;
            }

            public Content build() {
                return new Content(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("Content")
        private Content content;

        @NameInMap("RequestId")
        private String requestId;

        @NameInMap("ResultMsg")
        private String resultMsg;

        @NameInMap("Success")
        private Boolean success;

        private Data(Builder builder) {
            this.content = builder.content;
            this.requestId = builder.requestId;
            this.resultMsg = builder.resultMsg;
            this.success = builder.success;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public Content getContent() {
            return this.content;
        }

        /**
         * @return requestId
         */
        public String getRequestId() {
            return this.requestId;
        }

        /**
         * @return resultMsg
         */
        public String getResultMsg() {
            return this.resultMsg;
        }

        /**
         * @return success
         */
        public Boolean getSuccess() {
            return this.success;
        }

        public static final class Builder {
            private Content content; 
            private String requestId; 
            private String resultMsg; 
            private Boolean success; 

            /**
             * Content.
             */
            public Builder content(Content content) {
                this.content = content;
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
             * ResultMsg.
             */
            public Builder resultMsg(String resultMsg) {
                this.resultMsg = resultMsg;
                return this;
            }

            /**
             * Success.
             */
            public Builder success(Boolean success) {
                this.success = success;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
    public static class ResultContent extends TeaModel {
        @NameInMap("Data")
        private Data data;

        @NameInMap("RequestId")
        private String requestId;

        private ResultContent(Builder builder) {
            this.data = builder.data;
            this.requestId = builder.requestId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultContent create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public Data getData() {
            return this.data;
        }

        /**
         * @return requestId
         */
        public String getRequestId() {
            return this.requestId;
        }

        public static final class Builder {
            private Data data; 
            private String requestId; 

            /**
             * Data.
             */
            public Builder data(Data data) {
                this.data = data;
                return this;
            }

            /**
             * RequestId.
             */
            public Builder requestId(String requestId) {
                this.requestId = requestId;
                return this;
            }

            public ResultContent build() {
                return new ResultContent(this);
            } 

        } 

    }
}
