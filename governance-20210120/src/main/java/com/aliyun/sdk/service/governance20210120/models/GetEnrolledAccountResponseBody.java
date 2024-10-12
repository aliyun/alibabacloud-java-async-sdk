// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.governance20210120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The account ID.</p>
         * 
         * <strong>example:</strong>
         * <p>12868156179*****</p>
         */
        public Builder accountUid(Long accountUid) {
            this.accountUid = accountUid;
            return this;
        }

        /**
         * <p>The ID of the baseline that is implemented.</p>
         * 
         * <strong>example:</strong>
         * <p>afb-bp1adadfadsf***</p>
         */
        public Builder baselineId(String baselineId) {
            this.baselineId = baselineId;
            return this;
        }

        /**
         * <p>An array that contains baseline items.</p>
         */
        public Builder baselineItems(java.util.List < BaselineItems> baselineItems) {
            this.baselineItems = baselineItems;
            return this;
        }

        /**
         * <p>The time when the account was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-11-01T02:38:27Z</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The display name of the account.</p>
         * 
         * <strong>example:</strong>
         * <p>test-account</p>
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * <p>The error message.</p>
         * <blockquote>
         * <p> This parameter is returned if the value of <code>Status</code> is <code>Failed</code> or <code>ScheduleFailed</code>.</p>
         * </blockquote>
         */
        public Builder errorInfo(ErrorInfo errorInfo) {
            this.errorInfo = errorInfo;
            return this;
        }

        /**
         * <p>The ID of the parent folder.</p>
         * 
         * <strong>example:</strong>
         * <p>fd-5ESoku****</p>
         */
        public Builder folderId(String folderId) {
            this.folderId = folderId;
            return this;
        }

        /**
         * <p>Indicates whether the initialization is complete. Valid values:</p>
         * <ul>
         * <li>false</li>
         * <li>true</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder initialized(Boolean initialized) {
            this.initialized = initialized;
            return this;
        }

        /**
         * <p>The input parameters that are used when the account was registered.</p>
         */
        public Builder inputs(Inputs inputs) {
            this.inputs = inputs;
            return this;
        }

        /**
         * <p>The ID of the management account of the resource directory to which the account belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>19534534552*****</p>
         */
        public Builder masterAccountUid(Long masterAccountUid) {
            this.masterAccountUid = masterAccountUid;
            return this;
        }

        /**
         * <p>The ID of the settlement account.</p>
         * 
         * <strong>example:</strong>
         * <p>19534534552*****</p>
         */
        public Builder payerAccountUid(Long payerAccountUid) {
            this.payerAccountUid = payerAccountUid;
            return this;
        }

        /**
         * <p>The progress of the applying the baseline to the account.</p>
         */
        public Builder progress(java.util.List < Progress> progress) {
            this.progress = progress;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>768F908D-A66A-5A5D-816C-20C93CBBFEE3</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The status of the account. Valid values:</p>
         * <ul>
         * <li>Pending: The account is pending to be created.</li>
         * <li>Running: The account is being created.</li>
         * <li>Finished: The account is created.</li>
         * <li>Failed: The account fails to be created.</li>
         * <li>Scheduling: The account is being scheduled.</li>
         * <li>ScheduleFailed: The account fails to be scheduled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Finished</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The time when the information about the account was updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-11-01T02:38:27Z</p>
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        public GetEnrolledAccountResponseBody build() {
            return new GetEnrolledAccountResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetEnrolledAccountResponseBody} extends {@link TeaModel}
     *
     * <p>GetEnrolledAccountResponseBody</p>
     */
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
             * <p>The configurations of the baseline item.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;Notifications&quot;:[{&quot;GroupKey&quot;:&quot;account_msg&quot;,&quot;Contacts&quot;:[{&quot;Name&quot;:&quot;aa&quot;}],&quot;PmsgStatus&quot;:1,&quot;EmailStatus&quot;:1,&quot;SmsStatus&quot;:1}]}</p>
             */
            public Builder config(String config) {
                this.config = config;
                return this;
            }

            /**
             * <p>The name of the baseline item.</p>
             * 
             * <strong>example:</strong>
             * <p>ACS-BP_ACCOUNT_FACTORY_VPC</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Indicates whether baseline item is skipped. Valid values:</p>
             * <ul>
             * <li>false</li>
             * <li>true</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder skip(Boolean skip) {
                this.skip = skip;
                return this;
            }

            /**
             * <p>The version of the baseline item.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0</p>
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
    /**
     * 
     * {@link GetEnrolledAccountResponseBody} extends {@link TeaModel}
     *
     * <p>GetEnrolledAccountResponseBody</p>
     */
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
             * <p>The error code.</p>
             * 
             * <strong>example:</strong>
             * <p>CompliancePackExists</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The error message.</p>
             * 
             * <strong>example:</strong>
             * <p>The compliance pack already exists.</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The recommended solution.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://next.api.aliyun.com/troubleshoot?q=CompliancePackExists%5C%5Cu0026product=Config">https://next.api.aliyun.com/troubleshoot?q=CompliancePackExists\\u0026product=Config</a></p>
             */
            public Builder recommend(String recommend) {
                this.recommend = recommend;
                return this;
            }

            /**
             * <p>The request ID.</p>
             * 
             * <strong>example:</strong>
             * <p>6D5EAA86-2D41-5CB7-8DA7-B60093ACAA4E</p>
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
    /**
     * 
     * {@link GetEnrolledAccountResponseBody} extends {@link TeaModel}
     *
     * <p>GetEnrolledAccountResponseBody</p>
     */
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
             * <p>The configurations of the baseline item.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;Contacts&quot;:[{&quot;Name&quot;:&quot;governance&quot;,&quot;Email&quot;:&quot;wibud****@gmail.com&quot;,&quot;Mobile&quot;:&quot;1234&quot;,&quot;Position&quot;:&quot;Other&quot;}]}</p>
             */
            public Builder config(String config) {
                this.config = config;
                return this;
            }

            /**
             * <p>The name of the baseline item.</p>
             * 
             * <strong>example:</strong>
             * <p>ACS-BP_ACCOUNT_FACTORY_VPC</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Indicates whether baseline item is skipped. Valid values:</p>
             * <ul>
             * <li>false</li>
             * <li>true</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder skip(Boolean skip) {
                this.skip = skip;
                return this;
            }

            /**
             * <p>The version of the baseline item.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0</p>
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
    /**
     * 
     * {@link GetEnrolledAccountResponseBody} extends {@link TeaModel}
     *
     * <p>GetEnrolledAccountResponseBody</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetEnrolledAccountResponseBody} extends {@link TeaModel}
     *
     * <p>GetEnrolledAccountResponseBody</p>
     */
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

        @com.aliyun.core.annotation.NameInMap("Tag")
        private java.util.List < Tag> tag;

        private Inputs(Builder builder) {
            this.accountNamePrefix = builder.accountNamePrefix;
            this.accountUid = builder.accountUid;
            this.baselineItems = builder.baselineItems;
            this.displayName = builder.displayName;
            this.folderId = builder.folderId;
            this.payerAccountUid = builder.payerAccountUid;
            this.tag = builder.tag;
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

        /**
         * @return tag
         */
        public java.util.List < Tag> getTag() {
            return this.tag;
        }

        public static final class Builder {
            private String accountNamePrefix; 
            private Long accountUid; 
            private java.util.List < InputsBaselineItems> baselineItems; 
            private String displayName; 
            private String folderId; 
            private Long payerAccountUid; 
            private java.util.List < Tag> tag; 

            /**
             * <p>The prefix of the account name.</p>
             * 
             * <strong>example:</strong>
             * <p>test-account</p>
             */
            public Builder accountNamePrefix(String accountNamePrefix) {
                this.accountNamePrefix = accountNamePrefix;
                return this;
            }

            /**
             * <p>The account ID.</p>
             * 
             * <strong>example:</strong>
             * <p>12868156179*****</p>
             */
            public Builder accountUid(Long accountUid) {
                this.accountUid = accountUid;
                return this;
            }

            /**
             * <p>The baseline items.</p>
             */
            public Builder baselineItems(java.util.List < InputsBaselineItems> baselineItems) {
                this.baselineItems = baselineItems;
                return this;
            }

            /**
             * <p>The display name of the account.</p>
             * 
             * <strong>example:</strong>
             * <p>test-account</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * <p>The ID of the parent folder.</p>
             * 
             * <strong>example:</strong>
             * <p>fd-5ESoku****</p>
             */
            public Builder folderId(String folderId) {
                this.folderId = folderId;
                return this;
            }

            /**
             * <p>The ID of the settlement account.</p>
             * 
             * <strong>example:</strong>
             * <p>19534534552*****</p>
             */
            public Builder payerAccountUid(Long payerAccountUid) {
                this.payerAccountUid = payerAccountUid;
                return this;
            }

            /**
             * Tag.
             */
            public Builder tag(java.util.List < Tag> tag) {
                this.tag = tag;
                return this;
            }

            public Inputs build() {
                return new Inputs(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetEnrolledAccountResponseBody} extends {@link TeaModel}
     *
     * <p>GetEnrolledAccountResponseBody</p>
     */
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
             * <p>The name of the baseline item.</p>
             * 
             * <strong>example:</strong>
             * <p>ACS-BP_ACCOUNT_FACTORY_VPC</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The status of applying the baseline to the account. Valid values:</p>
             * <ul>
             * <li>Pending: The baseline is pending to be applied to the account.</li>
             * <li>Running: The baseline is being applied to the account.</li>
             * <li>Finished: : The baseline is applied to the account.</li>
             * <li>Failed: : The baseline fails to be applied to the account.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
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
