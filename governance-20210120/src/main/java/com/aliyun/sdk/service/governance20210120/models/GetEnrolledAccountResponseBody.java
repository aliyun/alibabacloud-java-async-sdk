// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.governance20210120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetEnrolledAccountResponseBody} extends {@link TeaModel}
 *
 * <p>GetEnrolledAccountResponseBody</p>
 */
public class GetEnrolledAccountResponseBody extends TeaModel {
    @NameInMap("AccountUid")
    private Long accountUid;

    @NameInMap("CreateTime")
    private String createTime;

    @NameInMap("DisplayName")
    private String displayName;

    @NameInMap("ErrorInfo")
    private ErrorInfo errorInfo;

    @NameInMap("FolderId")
    private String folderId;

    @NameInMap("Initialized")
    private Boolean initialized;

    @NameInMap("Inputs")
    private Inputs inputs;

    @NameInMap("MasterAccountUid")
    private Long masterAccountUid;

    @NameInMap("PayerAccountUid")
    private Long payerAccountUid;

    @NameInMap("Progress")
    private java.util.List < Progress> progress;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Status")
    private String status;

    @NameInMap("UpdateTime")
    private String updateTime;

    private GetEnrolledAccountResponseBody(Builder builder) {
        this.accountUid = builder.accountUid;
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
         * ??????ID
         */
        public Builder accountUid(Long accountUid) {
            this.accountUid = accountUid;
            return this;
        }

        /**
         * ????????????
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * ??????????????????
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * ????????????
         */
        public Builder errorInfo(ErrorInfo errorInfo) {
            this.errorInfo = errorInfo;
            return this;
        }

        /**
         * ????????????ID
         */
        public Builder folderId(String folderId) {
            this.folderId = folderId;
            return this;
        }

        /**
         * ?????????????????????
         */
        public Builder initialized(Boolean initialized) {
            this.initialized = initialized;
            return this;
        }

        /**
         * ??????????????????????????????
         */
        public Builder inputs(Inputs inputs) {
            this.inputs = inputs;
            return this;
        }

        /**
         * ?????????Master??????ID
         */
        public Builder masterAccountUid(Long masterAccountUid) {
            this.masterAccountUid = masterAccountUid;
            return this;
        }

        /**
         * ????????????ID
         */
        public Builder payerAccountUid(Long payerAccountUid) {
            this.payerAccountUid = payerAccountUid;
            return this;
        }

        /**
         * ??????????????????
         */
        public Builder progress(java.util.List < Progress> progress) {
            this.progress = progress;
            return this;
        }

        /**
         * ??????ID
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ??????????????????
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * ????????????
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        public GetEnrolledAccountResponseBody build() {
            return new GetEnrolledAccountResponseBody(this);
        } 

    } 

    public static class ErrorInfo extends TeaModel {
        @NameInMap("Code")
        private String code;

        @NameInMap("Message")
        private String message;

        @NameInMap("Recommend")
        private String recommend;

        @NameInMap("RequestId")
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
             * ?????????
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * ????????????
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * ??????????????????
             */
            public Builder recommend(String recommend) {
                this.recommend = recommend;
                return this;
            }

            /**
             * ??????ID
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
    public static class BaselineItems extends TeaModel {
        @NameInMap("Config")
        private String config;

        @NameInMap("Name")
        private String name;

        @NameInMap("Skip")
        private Boolean skip;

        @NameInMap("Version")
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
             * ???????????????
             */
            public Builder config(String config) {
                this.config = config;
                return this;
            }

            /**
             * ???????????????
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * ?????????????????????
             */
            public Builder skip(Boolean skip) {
                this.skip = skip;
                return this;
            }

            /**
             * ???????????????
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
    public static class Inputs extends TeaModel {
        @NameInMap("AccountNamePrefix")
        private String accountNamePrefix;

        @NameInMap("AccountUid")
        private Long accountUid;

        @NameInMap("BaselineItems")
        private java.util.List < BaselineItems> baselineItems;

        @NameInMap("DisplayName")
        private String displayName;

        @NameInMap("FolderId")
        private String folderId;

        @NameInMap("PayerAccountUid")
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
        public java.util.List < BaselineItems> getBaselineItems() {
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
            private java.util.List < BaselineItems> baselineItems; 
            private String displayName; 
            private String folderId; 
            private Long payerAccountUid; 

            /**
             * ??????????????????
             */
            public Builder accountNamePrefix(String accountNamePrefix) {
                this.accountNamePrefix = accountNamePrefix;
                return this;
            }

            /**
             * ??????ID
             */
            public Builder accountUid(Long accountUid) {
                this.accountUid = accountUid;
                return this;
            }

            /**
             * ?????????????????????
             */
            public Builder baselineItems(java.util.List < BaselineItems> baselineItems) {
                this.baselineItems = baselineItems;
                return this;
            }

            /**
             * ??????????????????
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * ????????????ID
             */
            public Builder folderId(String folderId) {
                this.folderId = folderId;
                return this;
            }

            /**
             * ????????????ID
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
        @NameInMap("Name")
        private String name;

        @NameInMap("Status")
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
             * ???????????????
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * ?????????????????????
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
