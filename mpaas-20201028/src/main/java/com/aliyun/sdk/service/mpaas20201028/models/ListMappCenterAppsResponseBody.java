// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListMappCenterAppsResponseBody} extends {@link TeaModel}
 *
 * <p>ListMappCenterAppsResponseBody</p>
 */
public class ListMappCenterAppsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ListMappCenterAppResult")
    private ListMappCenterAppResult listMappCenterAppResult;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResultCode")
    private String resultCode;

    @com.aliyun.core.annotation.NameInMap("ResultMessage")
    private String resultMessage;

    private ListMappCenterAppsResponseBody(Builder builder) {
        this.listMappCenterAppResult = builder.listMappCenterAppResult;
        this.requestId = builder.requestId;
        this.resultCode = builder.resultCode;
        this.resultMessage = builder.resultMessage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMappCenterAppsResponseBody create() {
        return builder().build();
    }

    /**
     * @return listMappCenterAppResult
     */
    public ListMappCenterAppResult getListMappCenterAppResult() {
        return this.listMappCenterAppResult;
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
     * @return resultMessage
     */
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static final class Builder {
        private ListMappCenterAppResult listMappCenterAppResult; 
        private String requestId; 
        private String resultCode; 
        private String resultMessage; 

        /**
         * ListMappCenterAppResult.
         */
        public Builder listMappCenterAppResult(ListMappCenterAppResult listMappCenterAppResult) {
            this.listMappCenterAppResult = listMappCenterAppResult;
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
         * ResultCode.
         */
        public Builder resultCode(String resultCode) {
            this.resultCode = resultCode;
            return this;
        }

        /**
         * ResultMessage.
         */
        public Builder resultMessage(String resultMessage) {
            this.resultMessage = resultMessage;
            return this;
        }

        public ListMappCenterAppsResponseBody build() {
            return new ListMappCenterAppsResponseBody(this);
        } 

    } 

    public static class AndroidConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CertRSA")
        private String certRSA;

        @com.aliyun.core.annotation.NameInMap("PackageName")
        private String packageName;

        private AndroidConfig(Builder builder) {
            this.certRSA = builder.certRSA;
            this.packageName = builder.packageName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AndroidConfig create() {
            return builder().build();
        }

        /**
         * @return certRSA
         */
        public String getCertRSA() {
            return this.certRSA;
        }

        /**
         * @return packageName
         */
        public String getPackageName() {
            return this.packageName;
        }

        public static final class Builder {
            private String certRSA; 
            private String packageName; 

            /**
             * CertRSA.
             */
            public Builder certRSA(String certRSA) {
                this.certRSA = certRSA;
                return this;
            }

            /**
             * PackageName.
             */
            public Builder packageName(String packageName) {
                this.packageName = packageName;
                return this;
            }

            public AndroidConfig build() {
                return new AndroidConfig(this);
            } 

        } 

    }
    public static class IosConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BundleId")
        private String bundleId;

        private IosConfig(Builder builder) {
            this.bundleId = builder.bundleId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IosConfig create() {
            return builder().build();
        }

        /**
         * @return bundleId
         */
        public String getBundleId() {
            return this.bundleId;
        }

        public static final class Builder {
            private String bundleId; 

            /**
             * BundleId.
             */
            public Builder bundleId(String bundleId) {
                this.bundleId = bundleId;
                return this;
            }

            public IosConfig build() {
                return new IosConfig(this);
            } 

        } 

    }
    public static class MappCenterAppList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AndroidConfig")
        private AndroidConfig androidConfig;

        @com.aliyun.core.annotation.NameInMap("AppDesc")
        private String appDesc;

        @com.aliyun.core.annotation.NameInMap("AppIcon")
        private String appIcon;

        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("AppSecret")
        private String appSecret;

        @com.aliyun.core.annotation.NameInMap("Creator")
        private String creator;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("IosConfig")
        private IosConfig iosConfig;

        @com.aliyun.core.annotation.NameInMap("Modifier")
        private String modifier;

        @com.aliyun.core.annotation.NameInMap("MonitorJson")
        private String monitorJson;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Long status;

        @com.aliyun.core.annotation.NameInMap("TenantId")
        private String tenantId;

        @com.aliyun.core.annotation.NameInMap("Type")
        private Long type;

        private MappCenterAppList(Builder builder) {
            this.androidConfig = builder.androidConfig;
            this.appDesc = builder.appDesc;
            this.appIcon = builder.appIcon;
            this.appId = builder.appId;
            this.appName = builder.appName;
            this.appSecret = builder.appSecret;
            this.creator = builder.creator;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.iosConfig = builder.iosConfig;
            this.modifier = builder.modifier;
            this.monitorJson = builder.monitorJson;
            this.status = builder.status;
            this.tenantId = builder.tenantId;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MappCenterAppList create() {
            return builder().build();
        }

        /**
         * @return androidConfig
         */
        public AndroidConfig getAndroidConfig() {
            return this.androidConfig;
        }

        /**
         * @return appDesc
         */
        public String getAppDesc() {
            return this.appDesc;
        }

        /**
         * @return appIcon
         */
        public String getAppIcon() {
            return this.appIcon;
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
         * @return appSecret
         */
        public String getAppSecret() {
            return this.appSecret;
        }

        /**
         * @return creator
         */
        public String getCreator() {
            return this.creator;
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
         * @return iosConfig
         */
        public IosConfig getIosConfig() {
            return this.iosConfig;
        }

        /**
         * @return modifier
         */
        public String getModifier() {
            return this.modifier;
        }

        /**
         * @return monitorJson
         */
        public String getMonitorJson() {
            return this.monitorJson;
        }

        /**
         * @return status
         */
        public Long getStatus() {
            return this.status;
        }

        /**
         * @return tenantId
         */
        public String getTenantId() {
            return this.tenantId;
        }

        /**
         * @return type
         */
        public Long getType() {
            return this.type;
        }

        public static final class Builder {
            private AndroidConfig androidConfig; 
            private String appDesc; 
            private String appIcon; 
            private String appId; 
            private String appName; 
            private String appSecret; 
            private String creator; 
            private String gmtCreate; 
            private String gmtModified; 
            private Long id; 
            private IosConfig iosConfig; 
            private String modifier; 
            private String monitorJson; 
            private Long status; 
            private String tenantId; 
            private Long type; 

            /**
             * AndroidConfig.
             */
            public Builder androidConfig(AndroidConfig androidConfig) {
                this.androidConfig = androidConfig;
                return this;
            }

            /**
             * AppDesc.
             */
            public Builder appDesc(String appDesc) {
                this.appDesc = appDesc;
                return this;
            }

            /**
             * AppIcon.
             */
            public Builder appIcon(String appIcon) {
                this.appIcon = appIcon;
                return this;
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
             * AppSecret.
             */
            public Builder appSecret(String appSecret) {
                this.appSecret = appSecret;
                return this;
            }

            /**
             * Creator.
             */
            public Builder creator(String creator) {
                this.creator = creator;
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
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * IosConfig.
             */
            public Builder iosConfig(IosConfig iosConfig) {
                this.iosConfig = iosConfig;
                return this;
            }

            /**
             * Modifier.
             */
            public Builder modifier(String modifier) {
                this.modifier = modifier;
                return this;
            }

            /**
             * MonitorJson.
             */
            public Builder monitorJson(String monitorJson) {
                this.monitorJson = monitorJson;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Long status) {
                this.status = status;
                return this;
            }

            /**
             * TenantId.
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(Long type) {
                this.type = type;
                return this;
            }

            public MappCenterAppList build() {
                return new MappCenterAppList(this);
            } 

        } 

    }
    public static class ListMappCenterAppResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MappCenterAppList")
        private java.util.List < MappCenterAppList> mappCenterAppList;

        @com.aliyun.core.annotation.NameInMap("ResultMsg")
        private String resultMsg;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Boolean success;

        private ListMappCenterAppResult(Builder builder) {
            this.mappCenterAppList = builder.mappCenterAppList;
            this.resultMsg = builder.resultMsg;
            this.success = builder.success;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ListMappCenterAppResult create() {
            return builder().build();
        }

        /**
         * @return mappCenterAppList
         */
        public java.util.List < MappCenterAppList> getMappCenterAppList() {
            return this.mappCenterAppList;
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
            private java.util.List < MappCenterAppList> mappCenterAppList; 
            private String resultMsg; 
            private Boolean success; 

            /**
             * MappCenterAppList.
             */
            public Builder mappCenterAppList(java.util.List < MappCenterAppList> mappCenterAppList) {
                this.mappCenterAppList = mappCenterAppList;
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

            public ListMappCenterAppResult build() {
                return new ListMappCenterAppResult(this);
            } 

        } 

    }
}
