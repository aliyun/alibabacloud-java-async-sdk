// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

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
 * {@link ListAllSwimmingLaneGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>ListAllSwimmingLaneGroupsResponseBody</p>
 */
public class ListAllSwimmingLaneGroupsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TraceId")
    private String traceId;

    private ListAllSwimmingLaneGroupsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.traceId = builder.traceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAllSwimmingLaneGroupsResponseBody create() {
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
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
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

    /**
     * @return traceId
     */
    public String getTraceId() {
        return this.traceId;
    }

    public static final class Builder {
        private String code; 
        private java.util.List<Data> data; 
        private String errorCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private String traceId; 

        private Builder() {
        } 

        private Builder(ListAllSwimmingLaneGroupsResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.errorCode = model.errorCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
            this.traceId = model.traceId;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * TraceId.
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public ListAllSwimmingLaneGroupsResponseBody build() {
            return new ListAllSwimmingLaneGroupsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAllSwimmingLaneGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAllSwimmingLaneGroupsResponseBody</p>
     */
    public static class Apps extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("MseAppId")
        private String mseAppId;

        @com.aliyun.core.annotation.NameInMap("MseAppName")
        private String mseAppName;

        @com.aliyun.core.annotation.NameInMap("MseNamespaceId")
        private String mseNamespaceId;

        private Apps(Builder builder) {
            this.appId = builder.appId;
            this.appName = builder.appName;
            this.mseAppId = builder.mseAppId;
            this.mseAppName = builder.mseAppName;
            this.mseNamespaceId = builder.mseNamespaceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Apps create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return mseAppId
         */
        public String getMseAppId() {
            return this.mseAppId;
        }

        /**
         * @return mseAppName
         */
        public String getMseAppName() {
            return this.mseAppName;
        }

        /**
         * @return mseNamespaceId
         */
        public String getMseNamespaceId() {
            return this.mseNamespaceId;
        }

        public static final class Builder {
            private String appId; 
            private String appName; 
            private String mseAppId; 
            private String mseAppName; 
            private String mseNamespaceId; 

            private Builder() {
            } 

            private Builder(Apps model) {
                this.appId = model.appId;
                this.appName = model.appName;
                this.mseAppId = model.mseAppId;
                this.mseAppName = model.mseAppName;
                this.mseNamespaceId = model.mseNamespaceId;
            } 

            /**
             * AppId.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * AppName.
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * MseAppId.
             */
            public Builder mseAppId(String mseAppId) {
                this.mseAppId = mseAppId;
                return this;
            }

            /**
             * MseAppName.
             */
            public Builder mseAppName(String mseAppName) {
                this.mseAppName = mseAppName;
                return this;
            }

            /**
             * MseNamespaceId.
             */
            public Builder mseNamespaceId(String mseNamespaceId) {
                this.mseNamespaceId = mseNamespaceId;
                return this;
            }

            public Apps build() {
                return new Apps(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAllSwimmingLaneGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAllSwimmingLaneGroupsResponseBody</p>
     */
    public static class EntryApp extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("AppType")
        private String appType;

        @com.aliyun.core.annotation.NameInMap("MseAppId")
        private String mseAppId;

        @com.aliyun.core.annotation.NameInMap("MseAppName")
        private String mseAppName;

        @com.aliyun.core.annotation.NameInMap("MseNamespaceId")
        private String mseNamespaceId;

        private EntryApp(Builder builder) {
            this.appId = builder.appId;
            this.appName = builder.appName;
            this.appType = builder.appType;
            this.mseAppId = builder.mseAppId;
            this.mseAppName = builder.mseAppName;
            this.mseNamespaceId = builder.mseNamespaceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EntryApp create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return appType
         */
        public String getAppType() {
            return this.appType;
        }

        /**
         * @return mseAppId
         */
        public String getMseAppId() {
            return this.mseAppId;
        }

        /**
         * @return mseAppName
         */
        public String getMseAppName() {
            return this.mseAppName;
        }

        /**
         * @return mseNamespaceId
         */
        public String getMseNamespaceId() {
            return this.mseNamespaceId;
        }

        public static final class Builder {
            private String appId; 
            private String appName; 
            private String appType; 
            private String mseAppId; 
            private String mseAppName; 
            private String mseNamespaceId; 

            private Builder() {
            } 

            private Builder(EntryApp model) {
                this.appId = model.appId;
                this.appName = model.appName;
                this.appType = model.appType;
                this.mseAppId = model.mseAppId;
                this.mseAppName = model.mseAppName;
                this.mseNamespaceId = model.mseNamespaceId;
            } 

            /**
             * AppId.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * AppName.
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * AppType.
             */
            public Builder appType(String appType) {
                this.appType = appType;
                return this;
            }

            /**
             * MseAppId.
             */
            public Builder mseAppId(String mseAppId) {
                this.mseAppId = mseAppId;
                return this;
            }

            /**
             * MseAppName.
             */
            public Builder mseAppName(String mseAppName) {
                this.mseAppName = mseAppName;
                return this;
            }

            /**
             * MseNamespaceId.
             */
            public Builder mseNamespaceId(String mseNamespaceId) {
                this.mseNamespaceId = mseNamespaceId;
                return this;
            }

            public EntryApp build() {
                return new EntryApp(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAllSwimmingLaneGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAllSwimmingLaneGroupsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppIds")
        private java.util.List<String> appIds;

        @com.aliyun.core.annotation.NameInMap("Apps")
        private java.util.List<Apps> apps;

        @com.aliyun.core.annotation.NameInMap("CanaryModel")
        private Integer canaryModel;

        @com.aliyun.core.annotation.NameInMap("EntryApp")
        private EntryApp entryApp;

        @com.aliyun.core.annotation.NameInMap("EntryAppId")
        private String entryAppId;

        @com.aliyun.core.annotation.NameInMap("EntryAppType")
        private String entryAppType;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private Long groupId;

        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("MseNamespaceId")
        private String mseNamespaceId;

        @com.aliyun.core.annotation.NameInMap("NamespaceId")
        private String namespaceId;

        @com.aliyun.core.annotation.NameInMap("SwimVersion")
        private String swimVersion;

        private Data(Builder builder) {
            this.appIds = builder.appIds;
            this.apps = builder.apps;
            this.canaryModel = builder.canaryModel;
            this.entryApp = builder.entryApp;
            this.entryAppId = builder.entryAppId;
            this.entryAppType = builder.entryAppType;
            this.groupId = builder.groupId;
            this.groupName = builder.groupName;
            this.mseNamespaceId = builder.mseNamespaceId;
            this.namespaceId = builder.namespaceId;
            this.swimVersion = builder.swimVersion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return appIds
         */
        public java.util.List<String> getAppIds() {
            return this.appIds;
        }

        /**
         * @return apps
         */
        public java.util.List<Apps> getApps() {
            return this.apps;
        }

        /**
         * @return canaryModel
         */
        public Integer getCanaryModel() {
            return this.canaryModel;
        }

        /**
         * @return entryApp
         */
        public EntryApp getEntryApp() {
            return this.entryApp;
        }

        /**
         * @return entryAppId
         */
        public String getEntryAppId() {
            return this.entryAppId;
        }

        /**
         * @return entryAppType
         */
        public String getEntryAppType() {
            return this.entryAppType;
        }

        /**
         * @return groupId
         */
        public Long getGroupId() {
            return this.groupId;
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return mseNamespaceId
         */
        public String getMseNamespaceId() {
            return this.mseNamespaceId;
        }

        /**
         * @return namespaceId
         */
        public String getNamespaceId() {
            return this.namespaceId;
        }

        /**
         * @return swimVersion
         */
        public String getSwimVersion() {
            return this.swimVersion;
        }

        public static final class Builder {
            private java.util.List<String> appIds; 
            private java.util.List<Apps> apps; 
            private Integer canaryModel; 
            private EntryApp entryApp; 
            private String entryAppId; 
            private String entryAppType; 
            private Long groupId; 
            private String groupName; 
            private String mseNamespaceId; 
            private String namespaceId; 
            private String swimVersion; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.appIds = model.appIds;
                this.apps = model.apps;
                this.canaryModel = model.canaryModel;
                this.entryApp = model.entryApp;
                this.entryAppId = model.entryAppId;
                this.entryAppType = model.entryAppType;
                this.groupId = model.groupId;
                this.groupName = model.groupName;
                this.mseNamespaceId = model.mseNamespaceId;
                this.namespaceId = model.namespaceId;
                this.swimVersion = model.swimVersion;
            } 

            /**
             * AppIds.
             */
            public Builder appIds(java.util.List<String> appIds) {
                this.appIds = appIds;
                return this;
            }

            /**
             * Apps.
             */
            public Builder apps(java.util.List<Apps> apps) {
                this.apps = apps;
                return this;
            }

            /**
             * CanaryModel.
             */
            public Builder canaryModel(Integer canaryModel) {
                this.canaryModel = canaryModel;
                return this;
            }

            /**
             * EntryApp.
             */
            public Builder entryApp(EntryApp entryApp) {
                this.entryApp = entryApp;
                return this;
            }

            /**
             * EntryAppId.
             */
            public Builder entryAppId(String entryAppId) {
                this.entryAppId = entryAppId;
                return this;
            }

            /**
             * EntryAppType.
             */
            public Builder entryAppType(String entryAppType) {
                this.entryAppType = entryAppType;
                return this;
            }

            /**
             * GroupId.
             */
            public Builder groupId(Long groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * GroupName.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * MseNamespaceId.
             */
            public Builder mseNamespaceId(String mseNamespaceId) {
                this.mseNamespaceId = mseNamespaceId;
                return this;
            }

            /**
             * NamespaceId.
             */
            public Builder namespaceId(String namespaceId) {
                this.namespaceId = namespaceId;
                return this;
            }

            /**
             * SwimVersion.
             */
            public Builder swimVersion(String swimVersion) {
                this.swimVersion = swimVersion;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
