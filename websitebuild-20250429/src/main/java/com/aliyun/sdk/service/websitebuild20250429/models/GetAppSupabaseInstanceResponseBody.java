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
 * {@link GetAppSupabaseInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>GetAppSupabaseInstanceResponseBody</p>
 */
public class GetAppSupabaseInstanceResponseBody extends TeaModel {
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

    private GetAppSupabaseInstanceResponseBody(Builder builder) {
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

    public static GetAppSupabaseInstanceResponseBody create() {
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

        private Builder(GetAppSupabaseInstanceResponseBody model) {
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

        public GetAppSupabaseInstanceResponseBody build() {
            return new GetAppSupabaseInstanceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAppSupabaseInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>GetAppSupabaseInstanceResponseBody</p>
     */
    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AnonKey")
        private String anonKey;

        @com.aliyun.core.annotation.NameInMap("BizId")
        private String bizId;

        @com.aliyun.core.annotation.NameInMap("DbInstanceId")
        private String dbInstanceId;

        @com.aliyun.core.annotation.NameInMap("DbPublicUrl")
        private String dbPublicUrl;

        @com.aliyun.core.annotation.NameInMap("InstanceCreateStatus")
        private String instanceCreateStatus;

        @com.aliyun.core.annotation.NameInMap("ServiceKey")
        private String serviceKey;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("SupabaseInstanceId")
        private String supabaseInstanceId;

        @com.aliyun.core.annotation.NameInMap("SupabasePublicUrl")
        private String supabasePublicUrl;

        private Module(Builder builder) {
            this.anonKey = builder.anonKey;
            this.bizId = builder.bizId;
            this.dbInstanceId = builder.dbInstanceId;
            this.dbPublicUrl = builder.dbPublicUrl;
            this.instanceCreateStatus = builder.instanceCreateStatus;
            this.serviceKey = builder.serviceKey;
            this.status = builder.status;
            this.supabaseInstanceId = builder.supabaseInstanceId;
            this.supabasePublicUrl = builder.supabasePublicUrl;
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
         * @return instanceCreateStatus
         */
        public String getInstanceCreateStatus() {
            return this.instanceCreateStatus;
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
         * @return supabaseInstanceId
         */
        public String getSupabaseInstanceId() {
            return this.supabaseInstanceId;
        }

        /**
         * @return supabasePublicUrl
         */
        public String getSupabasePublicUrl() {
            return this.supabasePublicUrl;
        }

        public static final class Builder {
            private String anonKey; 
            private String bizId; 
            private String dbInstanceId; 
            private String dbPublicUrl; 
            private String instanceCreateStatus; 
            private String serviceKey; 
            private Integer status; 
            private String supabaseInstanceId; 
            private String supabasePublicUrl; 

            private Builder() {
            } 

            private Builder(Module model) {
                this.anonKey = model.anonKey;
                this.bizId = model.bizId;
                this.dbInstanceId = model.dbInstanceId;
                this.dbPublicUrl = model.dbPublicUrl;
                this.instanceCreateStatus = model.instanceCreateStatus;
                this.serviceKey = model.serviceKey;
                this.status = model.status;
                this.supabaseInstanceId = model.supabaseInstanceId;
                this.supabasePublicUrl = model.supabasePublicUrl;
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
             * InstanceCreateStatus.
             */
            public Builder instanceCreateStatus(String instanceCreateStatus) {
                this.instanceCreateStatus = instanceCreateStatus;
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
             * <p>trial,draft,live,refunded,expired,released</p>
             * 
             * <strong>example:</strong>
             * <p>NORMAL</p>
             */
            public Builder status(Integer status) {
                this.status = status;
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
             * SupabasePublicUrl.
             */
            public Builder supabasePublicUrl(String supabasePublicUrl) {
                this.supabasePublicUrl = supabasePublicUrl;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
