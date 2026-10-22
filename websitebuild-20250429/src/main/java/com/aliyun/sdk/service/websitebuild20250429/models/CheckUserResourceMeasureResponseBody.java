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
 * {@link CheckUserResourceMeasureResponseBody} extends {@link TeaModel}
 *
 * <p>CheckUserResourceMeasureResponseBody</p>
 */
public class CheckUserResourceMeasureResponseBody extends TeaModel {
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

    private CheckUserResourceMeasureResponseBody(Builder builder) {
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

    public static CheckUserResourceMeasureResponseBody create() {
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

        private Builder(CheckUserResourceMeasureResponseBody model) {
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
         * <p>The detailed reason for access denial.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>Specifies whether retries are allowed. Valid values:</p>
         * <ul>
         * <li>false: Retries are not allowed.</li>
         * <li>true: Retries are allowed.</li>
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
         * <p>The name of the application.</p>
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
         * <p>The dynamic error message, which is used to replace <code>%s</code> in the <strong>ErrMessage</strong> response parameter.</p>
         * <blockquote>
         * <p>If <strong>ErrMessage</strong> returns <strong>The Value of Input Parameter %s is not valid</strong> and <strong>DynamicMessage</strong> returns <strong>DtsJobId</strong>, it indicates that the <strong>DtsJobId</strong> request parameter is invalid.</p>
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
         * <p>The returned error arguments.</p>
         */
        public Builder errorArgs(java.util.List<?> errorArgs) {
            this.errorArgs = errorArgs;
            return this;
        }

        /**
         * <p>The returned object.</p>
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
         * <p>The root error code.</p>
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
         * <p>The backup parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder synchro(Boolean synchro) {
            this.synchro = synchro;
            return this;
        }

        public CheckUserResourceMeasureResponseBody build() {
            return new CheckUserResourceMeasureResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CheckUserResourceMeasureResponseBody} extends {@link TeaModel}
     *
     * <p>CheckUserResourceMeasureResponseBody</p>
     */
    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DesiredTotal")
        private Long desiredTotal;

        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("Limit")
        private Long limit;

        @com.aliyun.core.annotation.NameInMap("Passed")
        private Boolean passed;

        @com.aliyun.core.annotation.NameInMap("ResourceCode")
        private String resourceCode;

        @com.aliyun.core.annotation.NameInMap("UpgradeAvailable")
        private Boolean upgradeAvailable;

        private Module(Builder builder) {
            this.desiredTotal = builder.desiredTotal;
            this.errorCode = builder.errorCode;
            this.errorMessage = builder.errorMessage;
            this.limit = builder.limit;
            this.passed = builder.passed;
            this.resourceCode = builder.resourceCode;
            this.upgradeAvailable = builder.upgradeAvailable;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return desiredTotal
         */
        public Long getDesiredTotal() {
            return this.desiredTotal;
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return limit
         */
        public Long getLimit() {
            return this.limit;
        }

        /**
         * @return passed
         */
        public Boolean getPassed() {
            return this.passed;
        }

        /**
         * @return resourceCode
         */
        public String getResourceCode() {
            return this.resourceCode;
        }

        /**
         * @return upgradeAvailable
         */
        public Boolean getUpgradeAvailable() {
            return this.upgradeAvailable;
        }

        public static final class Builder {
            private Long desiredTotal; 
            private String errorCode; 
            private String errorMessage; 
            private Long limit; 
            private Boolean passed; 
            private String resourceCode; 
            private Boolean upgradeAvailable; 

            private Builder() {
            } 

            private Builder(Module model) {
                this.desiredTotal = model.desiredTotal;
                this.errorCode = model.errorCode;
                this.errorMessage = model.errorMessage;
                this.limit = model.limit;
                this.passed = model.passed;
                this.resourceCode = model.resourceCode;
                this.upgradeAvailable = model.upgradeAvailable;
            } 

            /**
             * <p>Returned only for APP_WORKSPACE: the target total for this check, which is the used quota in the saved configuration plus ResourceValue. If the compatible DesiredTotal is provided, this total is used directly. The used quota for questions is the sum of common and word-of-mouth questions in the saved configuration. The used quota for competitors is the number of competitors. This field is empty for APP and USER checks.</p>
             * 
             * <strong>example:</strong>
             * <p>21</p>
             */
            public Builder desiredTotal(Long desiredTotal) {
                this.desiredTotal = desiredTotal;
                return this;
            }

            /**
             * <p>The error code when the check fails. This field is null when the check passes.</p>
             * 
             * <strong>example:</strong>
             * <p>Success</p>
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>The error message when the check fails. This field is null when the check passes.</p>
             * 
             * <strong>example:</strong>
             * <p>stream push failed</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>Returned only for APP_WORKSPACE quantity dry runs: the maximum number of questions or competitors allowed by the current commodity edition, not the remaining quota. This field is empty for APP and USER checks or when the edition benefits cannot be determined.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder limit(Long limit) {
                this.limit = limit;
                return this;
            }

            /**
             * <p>Indicates whether the check is passed.</p>
             * 
             * <strong>example:</strong>
             * <p>False</p>
             */
            public Builder passed(Boolean passed) {
                this.passed = passed;
                return this;
            }

            /**
             * <p>The resource code.</p>
             * 
             * <strong>example:</strong>
             * <p>TransitRouterVpcAttachment</p>
             */
            public Builder resourceCode(String resourceCode) {
                this.resourceCode = resourceCode;
                return this;
            }

            /**
             * <p>Indicates whether a purchasable higher edition exists that can accommodate the DesiredTotal. This field is true only when the current edition capacity is insufficient and a higher edition meets the requirements. Otherwise, it is false. This field may be empty for APP and USER checks. This field does not indicate that an upgrade has been performed or an upgrade order has been created.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder upgradeAvailable(Boolean upgradeAvailable) {
                this.upgradeAvailable = upgradeAvailable;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
