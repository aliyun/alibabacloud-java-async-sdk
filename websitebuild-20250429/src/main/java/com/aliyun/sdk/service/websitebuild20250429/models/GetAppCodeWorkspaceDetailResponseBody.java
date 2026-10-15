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
 * {@link GetAppCodeWorkspaceDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetAppCodeWorkspaceDetailResponseBody</p>
 */
public class GetAppCodeWorkspaceDetailResponseBody extends TeaModel {
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

    private GetAppCodeWorkspaceDetailResponseBody(Builder builder) {
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

    public static GetAppCodeWorkspaceDetailResponseBody create() {
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

        private Builder(GetAppCodeWorkspaceDetailResponseBody model) {
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
         * <p>The detailed reason why access is denied.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>Specifies whether retry is allowed. Valid values:</p>
         * <ul>
         * <li>false: Retry is not allowed.</li>
         * <li>true: Retry is allowed.</li>
         * </ul>
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
         * <p>spring-cloud-b</p>
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
         * <p>The dynamic error message. This value is used to replace the <code>%s</code> placeholder in the error message returned in the <strong>ErrMessage</strong> parameter.</p>
         * <blockquote>
         * <p>If <strong>ErrMessage</strong> returns <strong>The Value of Input Parameter %s is not valid</strong> and <strong>DynamicMessage</strong> returns <strong>DtsJobId</strong>, the request parameter <strong>DtsJobId</strong> is invalid.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>abc</p>
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
         * <p>The application module.</p>
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
         * <p>The reserved parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder synchro(Boolean synchro) {
            this.synchro = synchro;
            return this;
        }

        public GetAppCodeWorkspaceDetailResponseBody build() {
            return new GetAppCodeWorkspaceDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAppCodeWorkspaceDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetAppCodeWorkspaceDetailResponseBody</p>
     */
    public static class Snapshots extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChangeLog")
        private String changeLog;

        @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
        private String gmtCreateTime;

        @com.aliyun.core.annotation.NameInMap("LogicalNumber")
        private Integer logicalNumber;

        private Snapshots(Builder builder) {
            this.changeLog = builder.changeLog;
            this.gmtCreateTime = builder.gmtCreateTime;
            this.logicalNumber = builder.logicalNumber;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Snapshots create() {
            return builder().build();
        }

        /**
         * @return changeLog
         */
        public String getChangeLog() {
            return this.changeLog;
        }

        /**
         * @return gmtCreateTime
         */
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        /**
         * @return logicalNumber
         */
        public Integer getLogicalNumber() {
            return this.logicalNumber;
        }

        public static final class Builder {
            private String changeLog; 
            private String gmtCreateTime; 
            private Integer logicalNumber; 

            private Builder() {
            } 

            private Builder(Snapshots model) {
                this.changeLog = model.changeLog;
                this.gmtCreateTime = model.gmtCreateTime;
                this.logicalNumber = model.logicalNumber;
            } 

            /**
             * <p>The SDK change log.</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li>Add Params.</li>
             * </ul>
             */
            public Builder changeLog(String changeLog) {
                this.changeLog = changeLog;
                return this;
            }

            /**
             * <p>The creation time in UTC. The time follows the ISO 8601 standard.</p>
             * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ss.SSSZ</p>
             * 
             * <strong>example:</strong>
             * <p>2025-06-10T09:40:36.562Z</p>
             */
            public Builder gmtCreateTime(String gmtCreateTime) {
                this.gmtCreateTime = gmtCreateTime;
                return this;
            }

            /**
             * <p>The logical value.</p>
             * 
             * <strong>example:</strong>
             * <p>111</p>
             */
            public Builder logicalNumber(Integer logicalNumber) {
                this.logicalNumber = logicalNumber;
                return this;
            }

            public Snapshots build() {
                return new Snapshots(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAppCodeWorkspaceDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetAppCodeWorkspaceDetailResponseBody</p>
     */
    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActiveLogicalNumber")
        private Integer activeLogicalNumber;

        @com.aliyun.core.annotation.NameInMap("CommitHash")
        private String commitHash;

        @com.aliyun.core.annotation.NameInMap("IsDirty")
        private Boolean isDirty;

        @com.aliyun.core.annotation.NameInMap("MaxLogicalNumber")
        private Integer maxLogicalNumber;

        @com.aliyun.core.annotation.NameInMap("SiteId")
        private String siteId;

        @com.aliyun.core.annotation.NameInMap("Snapshots")
        private java.util.List<Snapshots> snapshots;

        private Module(Builder builder) {
            this.activeLogicalNumber = builder.activeLogicalNumber;
            this.commitHash = builder.commitHash;
            this.isDirty = builder.isDirty;
            this.maxLogicalNumber = builder.maxLogicalNumber;
            this.siteId = builder.siteId;
            this.snapshots = builder.snapshots;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return activeLogicalNumber
         */
        public Integer getActiveLogicalNumber() {
            return this.activeLogicalNumber;
        }

        /**
         * @return commitHash
         */
        public String getCommitHash() {
            return this.commitHash;
        }

        /**
         * @return isDirty
         */
        public Boolean getIsDirty() {
            return this.isDirty;
        }

        /**
         * @return maxLogicalNumber
         */
        public Integer getMaxLogicalNumber() {
            return this.maxLogicalNumber;
        }

        /**
         * @return siteId
         */
        public String getSiteId() {
            return this.siteId;
        }

        /**
         * @return snapshots
         */
        public java.util.List<Snapshots> getSnapshots() {
            return this.snapshots;
        }

        public static final class Builder {
            private Integer activeLogicalNumber; 
            private String commitHash; 
            private Boolean isDirty; 
            private Integer maxLogicalNumber; 
            private String siteId; 
            private java.util.List<Snapshots> snapshots; 

            private Builder() {
            } 

            private Builder(Module model) {
                this.activeLogicalNumber = model.activeLogicalNumber;
                this.commitHash = model.commitHash;
                this.isDirty = model.isDirty;
                this.maxLogicalNumber = model.maxLogicalNumber;
                this.siteId = model.siteId;
                this.snapshots = model.snapshots;
            } 

            /**
             * <p>11111</p>
             * 
             * <strong>example:</strong>
             * <p>111</p>
             */
            public Builder activeLogicalNumber(Integer activeLogicalNumber) {
                this.activeLogicalNumber = activeLogicalNumber;
                return this;
            }

            /**
             * <p>The code commit hash value.</p>
             */
            public Builder commitHash(String commitHash) {
                this.commitHash = commitHash;
                return this;
            }

            /**
             * <p>true</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder isDirty(Boolean isDirty) {
                this.isDirty = isDirty;
                return this;
            }

            /**
             * <p>1111</p>
             * 
             * <strong>example:</strong>
             * <p>111</p>
             */
            public Builder maxLogicalNumber(Integer maxLogicalNumber) {
                this.maxLogicalNumber = maxLogicalNumber;
                return this;
            }

            /**
             * <p>The site ID. You can call <a href="~~ListSites~~">ListSites</a> to retrieve the site ID.</p>
             * 
             * <strong>example:</strong>
             * <p>865181640657408</p>
             */
            public Builder siteId(String siteId) {
                this.siteId = siteId;
                return this;
            }

            /**
             * <p>The operation description information.</p>
             */
            public Builder snapshots(java.util.List<Snapshots> snapshots) {
                this.snapshots = snapshots;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
