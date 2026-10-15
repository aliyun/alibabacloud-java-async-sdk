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
 * {@link AllocateSupabaseForAdminResponseBody} extends {@link TeaModel}
 *
 * <p>AllocateSupabaseForAdminResponseBody</p>
 */
public class AllocateSupabaseForAdminResponseBody extends TeaModel {
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

    private AllocateSupabaseForAdminResponseBody(Builder builder) {
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

    public static AllocateSupabaseForAdminResponseBody create() {
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

        private Builder(AllocateSupabaseForAdminResponseBody model) {
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
         * <p>The details of the permission verification failure.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>Indicates whether retry is allowed.</p>
         * 
         * <strong>example:</strong>
         * <p>False</p>
         */
        public Builder allowRetry(Boolean allowRetry) {
            this.allowRetry = allowRetry;
            return this;
        }

        /**
         * <p>The application name.</p>
         * 
         * <strong>example:</strong>
         * <p>or</p>
         */
        public Builder appName(String appName) {
            this.appName = appName;
            return this;
        }

        /**
         * <p>The dynamic error code.</p>
         * 
         * <strong>example:</strong>
         * <p>ERROR-oo1</p>
         */
        public Builder dynamicCode(String dynamicCode) {
            this.dynamicCode = dynamicCode;
            return this;
        }

        /**
         * <p>The dynamic error message.</p>
         * 
         * <strong>example:</strong>
         * <p>SYSTEM_ERROR</p>
         */
        public Builder dynamicMessage(String dynamicMessage) {
            this.dynamicMessage = dynamicMessage;
            return this;
        }

        /**
         * <p>The error parameters.</p>
         */
        public Builder errorArgs(java.util.List<?> errorArgs) {
            this.errorArgs = errorArgs;
            return this;
        }

        /**
         * <p>The response data.</p>
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
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>SYSTEM.ERROR</p>
         */
        public Builder rootErrorCode(String rootErrorCode) {
            this.rootErrorCode = rootErrorCode;
            return this;
        }

        /**
         * <p>The root error message.</p>
         * 
         * <strong>example:</strong>
         * <p>System exception</p>
         */
        public Builder rootErrorMsg(String rootErrorMsg) {
            this.rootErrorMsg = rootErrorMsg;
            return this;
        }

        /**
         * <p>Indicates whether the request is synchronously processed.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder synchro(Boolean synchro) {
            this.synchro = synchro;
            return this;
        }

        public AllocateSupabaseForAdminResponseBody build() {
            return new AllocateSupabaseForAdminResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link AllocateSupabaseForAdminResponseBody} extends {@link TeaModel}
     *
     * <p>AllocateSupabaseForAdminResponseBody</p>
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
             * <p>The anonymous key.</p>
             * 
             * <strong>example:</strong>
             * <p>1111</p>
             */
            public Builder anonKey(String anonKey) {
                this.anonKey = anonKey;
                return this;
            }

            /**
             * <p>The business ID.</p>
             * 
             * <strong>example:</strong>
             * <p>WS20250915163734000001</p>
             */
            public Builder bizId(String bizId) {
                this.bizId = bizId;
                return this;
            }

            /**
             * <p>The time when the database instance was created.</p>
             * 
             * <strong>example:</strong>
             * <p>111</p>
             */
            public Builder dbInstanceCreateTime(String dbInstanceCreateTime) {
                this.dbInstanceCreateTime = dbInstanceCreateTime;
                return this;
            }

            /**
             * <p>The database instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>selectdb-cn-2bl4djolb02</p>
             */
            public Builder dbInstanceId(String dbInstanceId) {
                this.dbInstanceId = dbInstanceId;
                return this;
            }

            /**
             * <p>The public URL of the database.</p>
             * 
             * <strong>example:</strong>
             * <p>111</p>
             */
            public Builder dbPublicUrl(String dbPublicUrl) {
                this.dbPublicUrl = dbPublicUrl;
                return this;
            }

            /**
             * <p>The database type.</p>
             * 
             * <strong>example:</strong>
             * <p>ORACLE</p>
             */
            public Builder dbType(String dbType) {
                this.dbType = dbType;
                return this;
            }

            /**
             * <p>The extra information.</p>
             * 
             * <strong>example:</strong>
             * <p>{\&quot;appId\&quot;:\&quot;APP_NTJAK8P11SNZDJ3M6BWC\&quot;}</p>
             */
            public Builder extra(String extra) {
                this.extra = extra;
                return this;
            }

            /**
             * <p>The time when the instance creation was completed.</p>
             * 
             * <strong>example:</strong>
             * <p>111</p>
             */
            public Builder instanceCreateFinishedTime(String instanceCreateFinishedTime) {
                this.instanceCreateFinishedTime = instanceCreateFinishedTime;
                return this;
            }

            /**
             * <p>The instance creation status.</p>
             * 
             * <strong>example:</strong>
             * <p>1111</p>
             */
            public Builder instanceCreateStatus(String instanceCreateStatus) {
                this.instanceCreateStatus = instanceCreateStatus;
                return this;
            }

            /**
             * <p>The deletion flag.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isDeleted(Integer isDeleted) {
                this.isDeleted = isDeleted;
                return this;
            }

            /**
             * <p>The password used to access the ApsaraDB RDS database.</p>
             * 
             * <strong>example:</strong>
             * <p>111</p>
             */
            public Builder rdsDatabasePassword(String rdsDatabasePassword) {
                this.rdsDatabasePassword = rdsDatabasePassword;
                return this;
            }

            /**
             * <p>The service key.</p>
             * 
             * <strong>example:</strong>
             * <p>e80f5a7a08514709a2fb</p>
             */
            public Builder serviceKey(String serviceKey) {
                this.serviceKey = serviceKey;
                return this;
            }

            /**
             * <p>The instance status. Valid values:</p>
             * <ul>
             * <li>0: Paused.</li>
             * <li>1: Running.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NORMAL</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The password for the Supabase Dashboard.</p>
             * 
             * <strong>example:</strong>
             * <p>1111</p>
             */
            public Builder supabaseDashboardPassword(String supabaseDashboardPassword) {
                this.supabaseDashboardPassword = supabaseDashboardPassword;
                return this;
            }

            /**
             * <p>The username for the Supabase Dashboard.</p>
             * 
             * <strong>example:</strong>
             * <p>111</p>
             */
            public Builder supabaseDashboardUserName(String supabaseDashboardUserName) {
                this.supabaseDashboardUserName = supabaseDashboardUserName;
                return this;
            }

            /**
             * <p>The time when the Supabase instance was created.</p>
             * 
             * <strong>example:</strong>
             * <p>111</p>
             */
            public Builder supabaseInstanceCreateTime(String supabaseInstanceCreateTime) {
                this.supabaseInstanceCreateTime = supabaseInstanceCreateTime;
                return this;
            }

            /**
             * <p>The Supabase instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1111</p>
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
             * <p>The private endpoint of the Supabase instance.</p>
             * 
             * <strong>example:</strong>
             * <p>1111</p>
             */
            public Builder supabasePrivateIp(String supabasePrivateIp) {
                this.supabasePrivateIp = supabasePrivateIp;
                return this;
            }

            /**
             * <p>The public endpoint of the Supabase instance.</p>
             * 
             * <strong>example:</strong>
             * <p>111</p>
             */
            public Builder supabasePublicIp(String supabasePublicIp) {
                this.supabasePublicIp = supabasePublicIp;
                return this;
            }

            /**
             * <p>The public URL of the Supabase instance.</p>
             * 
             * <strong>example:</strong>
             * <p>111</p>
             */
            public Builder supabasePublicUrl(String supabasePublicUrl) {
                this.supabasePublicUrl = supabasePublicUrl;
                return this;
            }

            /**
             * <p>The tenant ID.</p>
             * 
             * <strong>example:</strong>
             * <p>GFCBAMJH-zh_CN</p>
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            /**
             * <p>The user ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1111</p>
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
