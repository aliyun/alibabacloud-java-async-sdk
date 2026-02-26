// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.websitebuild20250429.models;

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
 * {@link QuerySupabaseInstanceInfoForAdminResponseBody} extends {@link TeaModel}
 *
 * <p>QuerySupabaseInstanceInfoForAdminResponseBody</p>
 */
public class QuerySupabaseInstanceInfoForAdminResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("AllowRetry")
    private Boolean allowRetry;

    @com.aliyun.core.annotation.NameInMap("AppName")
    private String appName;

    @com.aliyun.core.annotation.NameInMap("DynamicCode")
    private String dynamicCode;

    @com.aliyun.core.annotation.NameInMap("DynamicMessage")
    private String dynamicMessage;

    @com.aliyun.core.annotation.NameInMap("ErrorArgs")
    private java.util.List<?> errorArgs;

    @com.aliyun.core.annotation.NameInMap("Module")
    private Module module;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RootErrorCode")
    private String rootErrorCode;

    @com.aliyun.core.annotation.NameInMap("RootErrorMsg")
    private String rootErrorMsg;

    @com.aliyun.core.annotation.NameInMap("Synchro")
    private Boolean synchro;

    private QuerySupabaseInstanceInfoForAdminResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.allowRetry = builder.allowRetry;
        this.appName = builder.appName;
        this.dynamicCode = builder.dynamicCode;
        this.dynamicMessage = builder.dynamicMessage;
        this.errorArgs = builder.errorArgs;
        this.module = builder.module;
        this.requestId = builder.requestId;
        this.rootErrorCode = builder.rootErrorCode;
        this.rootErrorMsg = builder.rootErrorMsg;
        this.synchro = builder.synchro;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySupabaseInstanceInfoForAdminResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return allowRetry
     */
    public Boolean getAllowRetry() {
        return this.allowRetry;
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
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
     * @return errorArgs
     */
    public java.util.List<?> getErrorArgs() {
        return this.errorArgs;
    }

    /**
     * @return module
     */
    public Module getModule() {
        return this.module;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return rootErrorCode
     */
    public String getRootErrorCode() {
        return this.rootErrorCode;
    }

    /**
     * @return rootErrorMsg
     */
    public String getRootErrorMsg() {
        return this.rootErrorMsg;
    }

    /**
     * @return synchro
     */
    public Boolean getSynchro() {
        return this.synchro;
    }

    public static final class Builder {
        private String accessDeniedDetail; 
        private Boolean allowRetry; 
        private String appName; 
        private String dynamicCode; 
        private String dynamicMessage; 
        private java.util.List<?> errorArgs; 
        private Module module; 
        private String requestId; 
        private String rootErrorCode; 
        private String rootErrorMsg; 
        private Boolean synchro; 

        private Builder() {
        } 

        private Builder(QuerySupabaseInstanceInfoForAdminResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.allowRetry = model.allowRetry;
            this.appName = model.appName;
            this.dynamicCode = model.dynamicCode;
            this.dynamicMessage = model.dynamicMessage;
            this.errorArgs = model.errorArgs;
            this.module = model.module;
            this.requestId = model.requestId;
            this.rootErrorCode = model.rootErrorCode;
            this.rootErrorMsg = model.rootErrorMsg;
            this.synchro = model.synchro;
        } 

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * AllowRetry.
         */
        public Builder allowRetry(Boolean allowRetry) {
            this.allowRetry = allowRetry;
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
         * DynamicCode.
         */
        public Builder dynamicCode(String dynamicCode) {
            this.dynamicCode = dynamicCode;
            return this;
        }

        /**
         * DynamicMessage.
         */
        public Builder dynamicMessage(String dynamicMessage) {
            this.dynamicMessage = dynamicMessage;
            return this;
        }

        /**
         * ErrorArgs.
         */
        public Builder errorArgs(java.util.List<?> errorArgs) {
            this.errorArgs = errorArgs;
            return this;
        }

        /**
         * Module.
         */
        public Builder module(Module module) {
            this.module = module;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>6C6B99AC-39EC-5350-874C-204128C905E6</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * RootErrorCode.
         */
        public Builder rootErrorCode(String rootErrorCode) {
            this.rootErrorCode = rootErrorCode;
            return this;
        }

        /**
         * RootErrorMsg.
         */
        public Builder rootErrorMsg(String rootErrorMsg) {
            this.rootErrorMsg = rootErrorMsg;
            return this;
        }

        /**
         * Synchro.
         */
        public Builder synchro(Boolean synchro) {
            this.synchro = synchro;
            return this;
        }

        public QuerySupabaseInstanceInfoForAdminResponseBody build() {
            return new QuerySupabaseInstanceInfoForAdminResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QuerySupabaseInstanceInfoForAdminResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySupabaseInstanceInfoForAdminResponseBody</p>
     */
    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AnonKey")
        private String anonKey;

        @com.aliyun.core.annotation.NameInMap("BizId")
        private String bizId;

        @com.aliyun.core.annotation.NameInMap("DbInstanceCreateTime")
        private String dbInstanceCreateTime;

        @com.aliyun.core.annotation.NameInMap("DbInstanceId")
        private String dbInstanceId;

        @com.aliyun.core.annotation.NameInMap("DbPublicUrl")
        private String dbPublicUrl;

        @com.aliyun.core.annotation.NameInMap("DbType")
        private String dbType;

        @com.aliyun.core.annotation.NameInMap("Extra")
        private String extra;

        @com.aliyun.core.annotation.NameInMap("InstanceCreateFinishedTime")
        private String instanceCreateFinishedTime;

        @com.aliyun.core.annotation.NameInMap("InstanceCreateStatus")
        private String instanceCreateStatus;

        @com.aliyun.core.annotation.NameInMap("IsDeleted")
        private Integer isDeleted;

        @com.aliyun.core.annotation.NameInMap("RdsDatabasePassword")
        private String rdsDatabasePassword;

        @com.aliyun.core.annotation.NameInMap("ServiceKey")
        private String serviceKey;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("SupabaseDashboardPassword")
        private String supabaseDashboardPassword;

        @com.aliyun.core.annotation.NameInMap("SupabaseDashboardUserName")
        private String supabaseDashboardUserName;

        @com.aliyun.core.annotation.NameInMap("SupabaseInstanceCreateTime")
        private String supabaseInstanceCreateTime;

        @com.aliyun.core.annotation.NameInMap("SupabaseInstanceId")
        private String supabaseInstanceId;

        @com.aliyun.core.annotation.NameInMap("SupabaseKongUrl")
        private String supabaseKongUrl;

        @com.aliyun.core.annotation.NameInMap("SupabasePrivateIp")
        private String supabasePrivateIp;

        @com.aliyun.core.annotation.NameInMap("SupabasePublicIp")
        private String supabasePublicIp;

        @com.aliyun.core.annotation.NameInMap("SupabasePublicUrl")
        private String supabasePublicUrl;

        @com.aliyun.core.annotation.NameInMap("TenantId")
        private String tenantId;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private Module(Builder builder) {
            this.anonKey = builder.anonKey;
            this.bizId = builder.bizId;
            this.dbInstanceCreateTime = builder.dbInstanceCreateTime;
            this.dbInstanceId = builder.dbInstanceId;
            this.dbPublicUrl = builder.dbPublicUrl;
            this.dbType = builder.dbType;
            this.extra = builder.extra;
            this.instanceCreateFinishedTime = builder.instanceCreateFinishedTime;
            this.instanceCreateStatus = builder.instanceCreateStatus;
            this.isDeleted = builder.isDeleted;
            this.rdsDatabasePassword = builder.rdsDatabasePassword;
            this.serviceKey = builder.serviceKey;
            this.status = builder.status;
            this.supabaseDashboardPassword = builder.supabaseDashboardPassword;
            this.supabaseDashboardUserName = builder.supabaseDashboardUserName;
            this.supabaseInstanceCreateTime = builder.supabaseInstanceCreateTime;
            this.supabaseInstanceId = builder.supabaseInstanceId;
            this.supabaseKongUrl = builder.supabaseKongUrl;
            this.supabasePrivateIp = builder.supabasePrivateIp;
            this.supabasePublicIp = builder.supabasePublicIp;
            this.supabasePublicUrl = builder.supabasePublicUrl;
            this.tenantId = builder.tenantId;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return anonKey
         */
        public String getAnonKey() {
            return this.anonKey;
        }

        /**
         * @return bizId
         */
        public String getBizId() {
            return this.bizId;
        }

        /**
         * @return dbInstanceCreateTime
         */
        public String getDbInstanceCreateTime() {
            return this.dbInstanceCreateTime;
        }

        /**
         * @return dbInstanceId
         */
        public String getDbInstanceId() {
            return this.dbInstanceId;
        }

        /**
         * @return dbPublicUrl
         */
        public String getDbPublicUrl() {
            return this.dbPublicUrl;
        }

        /**
         * @return dbType
         */
        public String getDbType() {
            return this.dbType;
        }

        /**
         * @return extra
         */
        public String getExtra() {
            return this.extra;
        }

        /**
         * @return instanceCreateFinishedTime
         */
        public String getInstanceCreateFinishedTime() {
            return this.instanceCreateFinishedTime;
        }

        /**
         * @return instanceCreateStatus
         */
        public String getInstanceCreateStatus() {
            return this.instanceCreateStatus;
        }

        /**
         * @return isDeleted
         */
        public Integer getIsDeleted() {
            return this.isDeleted;
        }

        /**
         * @return rdsDatabasePassword
         */
        public String getRdsDatabasePassword() {
            return this.rdsDatabasePassword;
        }

        /**
         * @return serviceKey
         */
        public String getServiceKey() {
            return this.serviceKey;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return supabaseDashboardPassword
         */
        public String getSupabaseDashboardPassword() {
            return this.supabaseDashboardPassword;
        }

        /**
         * @return supabaseDashboardUserName
         */
        public String getSupabaseDashboardUserName() {
            return this.supabaseDashboardUserName;
        }

        /**
         * @return supabaseInstanceCreateTime
         */
        public String getSupabaseInstanceCreateTime() {
            return this.supabaseInstanceCreateTime;
        }

        /**
         * @return supabaseInstanceId
         */
        public String getSupabaseInstanceId() {
            return this.supabaseInstanceId;
        }

        /**
         * @return supabaseKongUrl
         */
        public String getSupabaseKongUrl() {
            return this.supabaseKongUrl;
        }

        /**
         * @return supabasePrivateIp
         */
        public String getSupabasePrivateIp() {
            return this.supabasePrivateIp;
        }

        /**
         * @return supabasePublicIp
         */
        public String getSupabasePublicIp() {
            return this.supabasePublicIp;
        }

        /**
         * @return supabasePublicUrl
         */
        public String getSupabasePublicUrl() {
            return this.supabasePublicUrl;
        }

        /**
         * @return tenantId
         */
        public String getTenantId() {
            return this.tenantId;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String anonKey; 
            private String bizId; 
            private String dbInstanceCreateTime; 
            private String dbInstanceId; 
            private String dbPublicUrl; 
            private String dbType; 
            private String extra; 
            private String instanceCreateFinishedTime; 
            private String instanceCreateStatus; 
            private Integer isDeleted; 
            private String rdsDatabasePassword; 
            private String serviceKey; 
            private Integer status; 
            private String supabaseDashboardPassword; 
            private String supabaseDashboardUserName; 
            private String supabaseInstanceCreateTime; 
            private String supabaseInstanceId; 
            private String supabaseKongUrl; 
            private String supabasePrivateIp; 
            private String supabasePublicIp; 
            private String supabasePublicUrl; 
            private String tenantId; 
            private String userId; 

            private Builder() {
            } 

            private Builder(Module model) {
                this.anonKey = model.anonKey;
                this.bizId = model.bizId;
                this.dbInstanceCreateTime = model.dbInstanceCreateTime;
                this.dbInstanceId = model.dbInstanceId;
                this.dbPublicUrl = model.dbPublicUrl;
                this.dbType = model.dbType;
                this.extra = model.extra;
                this.instanceCreateFinishedTime = model.instanceCreateFinishedTime;
                this.instanceCreateStatus = model.instanceCreateStatus;
                this.isDeleted = model.isDeleted;
                this.rdsDatabasePassword = model.rdsDatabasePassword;
                this.serviceKey = model.serviceKey;
                this.status = model.status;
                this.supabaseDashboardPassword = model.supabaseDashboardPassword;
                this.supabaseDashboardUserName = model.supabaseDashboardUserName;
                this.supabaseInstanceCreateTime = model.supabaseInstanceCreateTime;
                this.supabaseInstanceId = model.supabaseInstanceId;
                this.supabaseKongUrl = model.supabaseKongUrl;
                this.supabasePrivateIp = model.supabasePrivateIp;
                this.supabasePublicIp = model.supabasePublicIp;
                this.supabasePublicUrl = model.supabasePublicUrl;
                this.tenantId = model.tenantId;
                this.userId = model.userId;
            } 

            /**
             * AnonKey.
             */
            public Builder anonKey(String anonKey) {
                this.anonKey = anonKey;
                return this;
            }

            /**
             * BizId.
             */
            public Builder bizId(String bizId) {
                this.bizId = bizId;
                return this;
            }

            /**
             * DbInstanceCreateTime.
             */
            public Builder dbInstanceCreateTime(String dbInstanceCreateTime) {
                this.dbInstanceCreateTime = dbInstanceCreateTime;
                return this;
            }

            /**
             * DbInstanceId.
             */
            public Builder dbInstanceId(String dbInstanceId) {
                this.dbInstanceId = dbInstanceId;
                return this;
            }

            /**
             * DbPublicUrl.
             */
            public Builder dbPublicUrl(String dbPublicUrl) {
                this.dbPublicUrl = dbPublicUrl;
                return this;
            }

            /**
             * DbType.
             */
            public Builder dbType(String dbType) {
                this.dbType = dbType;
                return this;
            }

            /**
             * Extra.
             */
            public Builder extra(String extra) {
                this.extra = extra;
                return this;
            }

            /**
             * InstanceCreateFinishedTime.
             */
            public Builder instanceCreateFinishedTime(String instanceCreateFinishedTime) {
                this.instanceCreateFinishedTime = instanceCreateFinishedTime;
                return this;
            }

            /**
             * InstanceCreateStatus.
             */
            public Builder instanceCreateStatus(String instanceCreateStatus) {
                this.instanceCreateStatus = instanceCreateStatus;
                return this;
            }

            /**
             * IsDeleted.
             */
            public Builder isDeleted(Integer isDeleted) {
                this.isDeleted = isDeleted;
                return this;
            }

            /**
             * RdsDatabasePassword.
             */
            public Builder rdsDatabasePassword(String rdsDatabasePassword) {
                this.rdsDatabasePassword = rdsDatabasePassword;
                return this;
            }

            /**
             * ServiceKey.
             */
            public Builder serviceKey(String serviceKey) {
                this.serviceKey = serviceKey;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * SupabaseDashboardPassword.
             */
            public Builder supabaseDashboardPassword(String supabaseDashboardPassword) {
                this.supabaseDashboardPassword = supabaseDashboardPassword;
                return this;
            }

            /**
             * SupabaseDashboardUserName.
             */
            public Builder supabaseDashboardUserName(String supabaseDashboardUserName) {
                this.supabaseDashboardUserName = supabaseDashboardUserName;
                return this;
            }

            /**
             * SupabaseInstanceCreateTime.
             */
            public Builder supabaseInstanceCreateTime(String supabaseInstanceCreateTime) {
                this.supabaseInstanceCreateTime = supabaseInstanceCreateTime;
                return this;
            }

            /**
             * SupabaseInstanceId.
             */
            public Builder supabaseInstanceId(String supabaseInstanceId) {
                this.supabaseInstanceId = supabaseInstanceId;
                return this;
            }

            /**
             * <p>Supabase Kong URL</p>
             * 
             * <strong>example:</strong>
             * <p>111</p>
             */
            public Builder supabaseKongUrl(String supabaseKongUrl) {
                this.supabaseKongUrl = supabaseKongUrl;
                return this;
            }

            /**
             * SupabasePrivateIp.
             */
            public Builder supabasePrivateIp(String supabasePrivateIp) {
                this.supabasePrivateIp = supabasePrivateIp;
                return this;
            }

            /**
             * SupabasePublicIp.
             */
            public Builder supabasePublicIp(String supabasePublicIp) {
                this.supabasePublicIp = supabasePublicIp;
                return this;
            }

            /**
             * SupabasePublicUrl.
             */
            public Builder supabasePublicUrl(String supabasePublicUrl) {
                this.supabasePublicUrl = supabasePublicUrl;
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
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
