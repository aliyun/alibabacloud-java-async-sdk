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
 * {@link BindAppDomainResponseBody} extends {@link TeaModel}
 *
 * <p>BindAppDomainResponseBody</p>
 */
public class BindAppDomainResponseBody extends TeaModel {
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

    private BindAppDomainResponseBody(Builder builder) {
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

    public static BindAppDomainResponseBody create() {
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

        private Builder(BindAppDomainResponseBody model) {
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
         * <p>The detailed reason why access was denied.</p>
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
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>ERROR-oo1</p>
         */
        public Builder dynamicCode(String dynamicCode) {
            this.dynamicCode = dynamicCode;
            return this;
        }

        /**
         * <p>The dynamic error message, which is used to replace the <strong>%s</strong> placeholder in the <strong>ErrMessage</strong> response parameter.</p>
         * <blockquote>
         * <p>For example, if <strong>ErrMessage</strong> returns <strong>The Value of Input Parameter %s is not valid</strong> and <strong>DynamicMessage</strong> returns <strong>DtsJobId</strong>, the request parameter <strong>DtsJobId</strong> is invalid.</p>
         * </blockquote>
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
         * <p>The data table module.</p>
         * <ul>
         * <li><p>ABTest: experiment data table</p>
         * </li>
         * <li><p>ExperimentTool: experiment tool table</p>
         * </li>
         * <li><p>DataDiagnosis: data diagnostics</p>
         * </li>
         * </ul>
         */
        public Builder module(Module module) {
            this.module = module;
            return this;
        }

        /**
         * <p>The unique ID of the request.</p>
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
         * <p>SYSTEM.EROR</p>
         */
        public Builder rootErrorCode(String rootErrorCode) {
            this.rootErrorCode = rootErrorCode;
            return this;
        }

        /**
         * <p>The exception message.</p>
         * 
         * <strong>example:</strong>
         * <p>System exception</p>
         */
        public Builder rootErrorMsg(String rootErrorMsg) {
            this.rootErrorMsg = rootErrorMsg;
            return this;
        }

        /**
         * <p>Indicates whether the request is processed synchronously.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder synchro(Boolean synchro) {
            this.synchro = synchro;
            return this;
        }

        public BindAppDomainResponseBody build() {
            return new BindAppDomainResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link BindAppDomainResponseBody} extends {@link TeaModel}
     *
     * <p>BindAppDomainResponseBody</p>
     */
    public static class Records extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Host")
        private String host;

        @com.aliyun.core.annotation.NameInMap("RecordType")
        private String recordType;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Records(Builder builder) {
            this.host = builder.host;
            this.recordType = builder.recordType;
            this.status = builder.status;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Records create() {
            return builder().build();
        }

        /**
         * @return host
         */
        public String getHost() {
            return this.host;
        }

        /**
         * @return recordType
         */
        public String getRecordType() {
            return this.recordType;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String host; 
            private String recordType; 
            private String status; 
            private String value; 

            private Builder() {
            } 

            private Builder(Records model) {
                this.host = model.host;
                this.recordType = model.recordType;
                this.status = model.status;
                this.value = model.value;
            } 

            /**
             * <p>The host record.</p>
             * 
             * <strong>example:</strong>
             * <p>www</p>
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * <p>The record type.</p>
             * 
             * <strong>example:</strong>
             * <p>A</p>
             */
            public Builder recordType(String recordType) {
                this.recordType = recordType;
                return this;
            }

            /**
             * <p>The status of the conflicting DNS record. A value of ENABLE indicates that the record is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>ENABLE</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The record value.</p>
             * 
             * <strong>example:</strong>
             * <p>192.0.2.1</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Records build() {
                return new Records(this);
            } 

        } 

    }
    /**
     * 
     * {@link BindAppDomainResponseBody} extends {@link TeaModel}
     *
     * <p>BindAppDomainResponseBody</p>
     */
    public static class DnsConflict extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CanAutoResolve")
        private Boolean canAutoResolve;

        @com.aliyun.core.annotation.NameInMap("HasConflict")
        private Boolean hasConflict;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("Records")
        private java.util.List<Records> records;

        private DnsConflict(Builder builder) {
            this.canAutoResolve = builder.canAutoResolve;
            this.hasConflict = builder.hasConflict;
            this.message = builder.message;
            this.records = builder.records;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DnsConflict create() {
            return builder().build();
        }

        /**
         * @return canAutoResolve
         */
        public Boolean getCanAutoResolve() {
            return this.canAutoResolve;
        }

        /**
         * @return hasConflict
         */
        public Boolean getHasConflict() {
            return this.hasConflict;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return records
         */
        public java.util.List<Records> getRecords() {
            return this.records;
        }

        public static final class Builder {
            private Boolean canAutoResolve; 
            private Boolean hasConflict; 
            private String message; 
            private java.util.List<Records> records; 

            private Builder() {
            } 

            private Builder(DnsConflict model) {
                this.canAutoResolve = model.canAutoResolve;
                this.hasConflict = model.hasConflict;
                this.message = model.message;
                this.records = model.records;
            } 

            /**
             * <p>Indicates whether automatic overwrite is supported. A value of true indicates the current Alibaba Cloud account, and a value of false indicates other accounts.</p>
             */
            public Builder canAutoResolve(Boolean canAutoResolve) {
                this.canAutoResolve = canAutoResolve;
                return this;
            }

            /**
             * <p>Indicates whether a conflict exists.</p>
             */
            public Builder hasConflict(Boolean hasConflict) {
                this.hasConflict = hasConflict;
                return this;
            }

            /**
             * <p>The user-facing prompt message. Different guidance text is generated based on the scenario.</p>
             * 
             * <strong>example:</strong>
             * <p>A conflicting DNS record (A 192.0.2.1) exists for the domain name <a href="http://www.example.com">www.example.com</a>. Delete the conflicting record from your DNS provider and try again</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The list of conflicting DNS records. This reuses the existing AppDomainDnsRecordDTO.</p>
             */
            public Builder records(java.util.List<Records> records) {
                this.records = records;
                return this;
            }

            public DnsConflict build() {
                return new DnsConflict(this);
            } 

        } 

    }
    /**
     * 
     * {@link BindAppDomainResponseBody} extends {@link TeaModel}
     *
     * <p>BindAppDomainResponseBody</p>
     */
    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DnsConflict")
        private DnsConflict dnsConflict;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Boolean success;

        private Module(Builder builder) {
            this.dnsConflict = builder.dnsConflict;
            this.success = builder.success;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return dnsConflict
         */
        public DnsConflict getDnsConflict() {
            return this.dnsConflict;
        }

        /**
         * @return success
         */
        public Boolean getSuccess() {
            return this.success;
        }

        public static final class Builder {
            private DnsConflict dnsConflict; 
            private Boolean success; 

            private Builder() {
            } 

            private Builder(Module model) {
                this.dnsConflict = model.dnsConflict;
                this.success = model.success;
            } 

            /**
             * <p>The DNS conflict information. This parameter is returned when a conflict is detected during synchronous verification.</p>
             */
            public Builder dnsConflict(DnsConflict dnsConflict) {
                this.dnsConflict = dnsConflict;
                return this;
            }

            /**
             * <p>Indicates whether the request was successful.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder success(Boolean success) {
                this.success = success;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
