// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.governance20210120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetEnrolledAccountResponseBody} extends {@link TeaModel}
 *
 * <p>GetEnrolledAccountResponseBody</p>
 */
public class GetEnrolledAccountResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccountUid")
    private Long accountUid;

    @com.aliyun.core.annotation.NameInMap("BaselineId")
    private String baselineId;

    @com.aliyun.core.annotation.NameInMap("BaselineItems")
    private java.util.List < BaselineItems> baselineItems;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("DisplayName")
    private String displayName;

    @com.aliyun.core.annotation.NameInMap("ErrorInfo")
    private ErrorInfo errorInfo;

    @com.aliyun.core.annotation.NameInMap("FolderId")
    private String folderId;

    @com.aliyun.core.annotation.NameInMap("Initialized")
    private Boolean initialized;

    @com.aliyun.core.annotation.NameInMap("Inputs")
    private Inputs inputs;

    @com.aliyun.core.annotation.NameInMap("MasterAccountUid")
    private Long masterAccountUid;

    @com.aliyun.core.annotation.NameInMap("PayerAccountUid")
    private Long payerAccountUid;

    @com.aliyun.core.annotation.NameInMap("Progress")
    private java.util.List < Progress> progress;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("UpdateTime")
    private String updateTime;

    private GetEnrolledAccountResponseBody(Builder builder) {
        this.accountUid = builder.accountUid;
        this.baselineId = builder.baselineId;
        this.baselineItems = builder.baselineItems;
        this.createTime = builder.createTime;
        this.displayName = builder.displayName;
        this.errorInfo = builder.errorInfo;
        this.folderId = builder.folderId;
        this.initialized = builder.initialized;
        this.inputs = builder.inputs;
        this.masterAccountUid = builder.masterAccountUid;
        this.payerAccountUid = builder.payerAccountUid;
        this.progress = builder.progress;
        this.requestId = builder.requestId;
        this.status = builder.status;
        this.updateTime = builder.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetEnrolledAccountResponseBody create() {
        return builder().build();
    }

    /**
     * @return accountUid
     */
    public Long getAccountUid() {
        return this.accountUid;
    }

    /**
     * @return baselineId
     */
    public String getBaselineId() {
        return this.baselineId;
    }

    /**
     * @return baselineItems
     */
    public java.util.List < BaselineItems> getBaselineItems() {
        return this.baselineItems;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return displayName
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * @return errorInfo
     */
    public ErrorInfo getErrorInfo() {
        return this.errorInfo;
    }

    /**
     * @return folderId
     */
    public String getFolderId() {
        return this.folderId;
    }

    /**
     * @return initialized
     */
    public Boolean getInitialized() {
        return this.initialized;
    }

    /**
     * @return inputs
     */
    public Inputs getInputs() {
        return this.inputs;
    }

    /**
     * @return masterAccountUid
     */
    public Long getMasterAccountUid() {
        return this.masterAccountUid;
    }

    /**
     * @return payerAccountUid
     */
    public Long getPayerAccountUid() {
        return this.payerAccountUid;
    }

    /**
     * @return progress
     */
    public java.util.List < Progress> getProgress() {
        return this.progress;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return updateTime
     */
    public String getUpdateTime() {
        return this.updateTime;
    }

    public static final class Builder {
        private Long accountUid; 
        private String baselineId; 
        private java.util.List < BaselineItems> baselineItems; 
        private String createTime; 
        private String displayName; 
        private ErrorInfo errorInfo; 
        private String folderId; 
        private Boolean initialized; 
        private Inputs inputs; 
        private Long masterAccountUid; 
        private Long payerAccountUid; 
        private java.util.List < Progress> progress; 
        private String requestId; 
        private String status; 
        private String updateTime; 

        /**
         * The account ID.
         */
        public Builder accountUid(Long accountUid) {
            this.accountUid = accountUid;
            return this;
        }

        /**
         * The ID of the baseline that is implemented.
         */
        public Builder baselineId(String baselineId) {
            this.baselineId = baselineId;
            return this;
        }

        /**
         * An array that contains baseline items.
         */
        public Builder baselineItems(java.util.List < BaselineItems> baselineItems) {
            this.baselineItems = baselineItems;
            return this;
        }

        /**
         * The time when the account was created.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * The display name of the account.
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * The error message.
         * <p>
         * 
         * >  This parameter is returned if the value of `Status` is `Failed` or `ScheduleFailed`.
         */
        public Builder errorInfo(ErrorInfo errorInfo) {
            this.errorInfo = errorInfo;
            return this;
        }

        /**
         * The ID of the parent folder.
         */
        public Builder folderId(String folderId) {
            this.folderId = folderId;
            return this;
        }

        /**
         * Indicates whether the initialization is complete. Valid values:
         * <p>
         * 
         * *   false
         * *   true
         */
        public Builder initialized(Boolean initialized) {
            this.initialized = initialized;
            return this;
        }

        /**
         * The input parameters that are used when the account was registered.
         */
        public Builder inputs(Inputs inputs) {
            this.inputs = inputs;
            return this;
        }

        /**
         * The ID of the management account of the resource directory to which the account belongs.
         */
        public Builder masterAccountUid(Long masterAccountUid) {
            this.masterAccountUid = masterAccountUid;
            return this;
        }

        /**
         * The ID of the settlement account.
         */
        public Builder payerAccountUid(Long payerAccountUid) {
            this.payerAccountUid = payerAccountUid;
            return this;
        }

        /**
         * The progress of the applying the baseline to the account.
         */
        public Builder progress(java.util.List < Progress> progress) {
            this.progress = progress;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The status of the account. Valid values:
         * <p>
         * 
         * *   Pending: The account is pending to be created.
         * *   Running: The account is being created.
         * *   Finished: The account is created.
         * *   Failed: The account fails to be created.
         * *   Scheduling: The account is being scheduled.
         * *   ScheduleFailed: The account fails to be scheduled.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * The time when the information about the account was updated.
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        public GetEnrolledAccountResponseBody build() {
            return new GetEnrolledAccountResponseBody(this);
        } 

    } 

    public static class BaselineItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Config")
        private String config;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Skip")
        private Boolean skip;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        private BaselineItems(Builder builder) {
            this.config = builder.config;
            this.name = builder.name;
            this.skip = builder.skip;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BaselineItems create() {
            return builder().build();
        }

        /**
         * @return config
         */
        public String getConfig() {
            return this.config;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return skip
         */
        public Boolean getSkip() {
            return this.skip;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String config; 
            private String name; 
            private Boolean skip; 
            private String version; 

            /**
             * The configurations of the baseline item.
             */
            public Builder config(String config) {
                this.config = config;
                return this;
            }

            /**
             * The name of the baseline item.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Indicates whether baseline item is skipped. Valid values:
             * <p>
             * 
             * *   false
             * *   true
             */
            public Builder skip(Boolean skip) {
                this.skip = skip;
                return this;
            }

            /**
             * The version of the baseline item.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public BaselineItems build() {
                return new BaselineItems(this);
            } 

        } 

    }
    public static class ErrorInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("Recommend")
        private String recommend;

        @com.aliyun.core.annotation.NameInMap("RequestId")
        private String requestId;

        private ErrorInfo(Builder builder) {
            this.code = builder.code;
            this.message = builder.message;
            this.recommend = builder.recommend;
            this.requestId = builder.requestId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ErrorInfo create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return recommend
         */
        public String getRecommend() {
            return this.recommend;
        }

        /**
         * @return requestId
         */
        public String getRequestId() {
            return this.requestId;
        }

        public static final class Builder {
            private String code; 
            private String message; 
            private String recommend; 
            private String requestId; 

            /**
             * The error code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * The error message.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * The recommended solution.
             */
            public Builder recommend(String recommend) {
                this.recommend = recommend;
                return this;
            }

            /**
             * The request ID.
             */
            public Builder requestId(String requestId) {
                this.requestId = requestId;
                return this;
            }

            public ErrorInfo build() {
                return new ErrorInfo(this);
            } 

        } 

    }
    public static class InputsBaselineItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Config")
        private String config;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Skip")
        private Boolean skip;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        private InputsBaselineItems(Builder builder) {
            this.config = builder.config;
            this.name = builder.name;
            this.skip = builder.skip;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InputsBaselineItems create() {
            return builder().build();
        }

        /**
         * @return config
         */
        public String getConfig() {
            return this.config;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return skip
         */
        public Boolean getSkip() {
            return this.skip;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String config; 
            private String name; 
            private Boolean skip; 
            private String version; 

            /**
             * The configurations of the baseline item.
             */
            public Builder config(String config) {
                this.config = config;
                return this;
            }

            /**
             * The name of the baseline item.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Indicates whether baseline item is skipped. Valid values:
             * <p>
             * 
             * *   false
             * *   true
             */
            public Builder skip(Boolean skip) {
                this.skip = skip;
                return this;
            }

            /**
             * The version of the baseline item.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public InputsBaselineItems build() {
                return new InputsBaselineItems(this);
            } 

        } 

    }
    public static class Inputs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountNamePrefix")
        private String accountNamePrefix;

        @com.aliyun.core.annotation.NameInMap("AccountUid")
        private Long accountUid;

        @com.aliyun.core.annotation.NameInMap("BaselineItems")
        private java.util.List < InputsBaselineItems> baselineItems;

        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("FolderId")
        private String folderId;

        @com.aliyun.core.annotation.NameInMap("PayerAccountUid")
        private Long payerAccountUid;

        private Inputs(Builder builder) {
            this.accountNamePrefix = builder.accountNamePrefix;
            this.accountUid = builder.accountUid;
            this.baselineItems = builder.baselineItems;
            this.displayName = builder.displayName;
            this.folderId = builder.folderId;
            this.payerAccountUid = builder.payerAccountUid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Inputs create() {
            return builder().build();
        }

        /**
         * @return accountNamePrefix
         */
        public String getAccountNamePrefix() {
            return this.accountNamePrefix;
        }

        /**
         * @return accountUid
         */
        public Long getAccountUid() {
            return this.accountUid;
        }

        /**
         * @return baselineItems
         */
        public java.util.List < InputsBaselineItems> getBaselineItems() {
            return this.baselineItems;
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return folderId
         */
        public String getFolderId() {
            return this.folderId;
        }

        /**
         * @return payerAccountUid
         */
        public Long getPayerAccountUid() {
            return this.payerAccountUid;
        }

        public static final class Builder {
            private String accountNamePrefix; 
            private Long accountUid; 
            private java.util.List < InputsBaselineItems> baselineItems; 
            private String displayName; 
            private String folderId; 
            private Long payerAccountUid; 

            /**
             * The prefix of the account name.
             */
            public Builder accountNamePrefix(String accountNamePrefix) {
                this.accountNamePrefix = accountNamePrefix;
                return this;
            }

            /**
             * The account ID.
             */
            public Builder accountUid(Long accountUid) {
                this.accountUid = accountUid;
                return this;
            }

            /**
             * The baseline items.
             */
            public Builder baselineItems(java.util.List < InputsBaselineItems> baselineItems) {
                this.baselineItems = baselineItems;
                return this;
            }

            /**
             * The display name of the account.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * The ID of the parent folder.
             */
            public Builder folderId(String folderId) {
                this.folderId = folderId;
                return this;
            }

            /**
             * The ID of the settlement account.
             */
            public Builder payerAccountUid(Long payerAccountUid) {
                this.payerAccountUid = payerAccountUid;
                return this;
            }

            public Inputs build() {
                return new Inputs(this);
            } 

        } 

    }
    public static class Progress extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Progress(Builder builder) {
            this.name = builder.name;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Progress create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String name; 
            private String status; 

            /**
             * The name of the baseline item.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The status of applying the baseline to the account. Valid values:
             * <p>
             * 
             * *   Pending: The baseline is pending to be applied to the account.
             * *   Running: The baseline is being applied to the account.
             * *   Finished: : The baseline is applied to the account.
             * *   Failed: : The baseline fails to be applied to the account.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Progress build() {
                return new Progress(this);
            } 

        } 

    }
}
