// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link GetFileProtectClientRuleResponseBody} extends {@link TeaModel}
 *
 * <p>GetFileProtectClientRuleResponseBody</p>
 */
public class GetFileProtectClientRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetFileProtectClientRuleResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFileProtectClientRuleResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetFileProtectClientRuleResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>79CFF74D-E967-5407-8A78-EE03B925****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetFileProtectClientRuleResponseBody build() {
            return new GetFileProtectClientRuleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetFileProtectClientRuleResponseBody} extends {@link TeaModel}
     *
     * <p>GetFileProtectClientRuleResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlertLevel")
        private Integer alertLevel;

        @com.aliyun.core.annotation.NameInMap("ExcludeUsers")
        private java.util.List<String> excludeUsers;

        @com.aliyun.core.annotation.NameInMap("FileOps")
        private java.util.List<String> fileOps;

        @com.aliyun.core.annotation.NameInMap("FilePaths")
        private java.util.List<String> filePaths;

        @com.aliyun.core.annotation.NameInMap("FileTypes")
        private java.util.List<String> fileTypes;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Platform")
        private String platform;

        @com.aliyun.core.annotation.NameInMap("ProcPaths")
        private java.util.List<String> procPaths;

        @com.aliyun.core.annotation.NameInMap("RuleAction")
        private String ruleAction;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("SwitchId")
        private String switchId;

        private Data(Builder builder) {
            this.alertLevel = builder.alertLevel;
            this.excludeUsers = builder.excludeUsers;
            this.fileOps = builder.fileOps;
            this.filePaths = builder.filePaths;
            this.fileTypes = builder.fileTypes;
            this.id = builder.id;
            this.platform = builder.platform;
            this.procPaths = builder.procPaths;
            this.ruleAction = builder.ruleAction;
            this.ruleName = builder.ruleName;
            this.status = builder.status;
            this.switchId = builder.switchId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return alertLevel
         */
        public Integer getAlertLevel() {
            return this.alertLevel;
        }

        /**
         * @return excludeUsers
         */
        public java.util.List<String> getExcludeUsers() {
            return this.excludeUsers;
        }

        /**
         * @return fileOps
         */
        public java.util.List<String> getFileOps() {
            return this.fileOps;
        }

        /**
         * @return filePaths
         */
        public java.util.List<String> getFilePaths() {
            return this.filePaths;
        }

        /**
         * @return fileTypes
         */
        public java.util.List<String> getFileTypes() {
            return this.fileTypes;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return platform
         */
        public String getPlatform() {
            return this.platform;
        }

        /**
         * @return procPaths
         */
        public java.util.List<String> getProcPaths() {
            return this.procPaths;
        }

        /**
         * @return ruleAction
         */
        public String getRuleAction() {
            return this.ruleAction;
        }

        /**
         * @return ruleName
         */
        public String getRuleName() {
            return this.ruleName;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return switchId
         */
        public String getSwitchId() {
            return this.switchId;
        }

        public static final class Builder {
            private Integer alertLevel; 
            private java.util.List<String> excludeUsers; 
            private java.util.List<String> fileOps; 
            private java.util.List<String> filePaths; 
            private java.util.List<String> fileTypes; 
            private Long id; 
            private String platform; 
            private java.util.List<String> procPaths; 
            private String ruleAction; 
            private String ruleName; 
            private Integer status; 
            private String switchId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.alertLevel = model.alertLevel;
                this.excludeUsers = model.excludeUsers;
                this.fileOps = model.fileOps;
                this.filePaths = model.filePaths;
                this.fileTypes = model.fileTypes;
                this.id = model.id;
                this.platform = model.platform;
                this.procPaths = model.procPaths;
                this.ruleAction = model.ruleAction;
                this.ruleName = model.ruleName;
                this.status = model.status;
                this.switchId = model.switchId;
            } 

            /**
             * AlertLevel.
             */
            public Builder alertLevel(Integer alertLevel) {
                this.alertLevel = alertLevel;
                return this;
            }

            /**
             * ExcludeUsers.
             */
            public Builder excludeUsers(java.util.List<String> excludeUsers) {
                this.excludeUsers = excludeUsers;
                return this;
            }

            /**
             * FileOps.
             */
            public Builder fileOps(java.util.List<String> fileOps) {
                this.fileOps = fileOps;
                return this;
            }

            /**
             * FilePaths.
             */
            public Builder filePaths(java.util.List<String> filePaths) {
                this.filePaths = filePaths;
                return this;
            }

            /**
             * FileTypes.
             */
            public Builder fileTypes(java.util.List<String> fileTypes) {
                this.fileTypes = fileTypes;
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
             * Platform.
             */
            public Builder platform(String platform) {
                this.platform = platform;
                return this;
            }

            /**
             * ProcPaths.
             */
            public Builder procPaths(java.util.List<String> procPaths) {
                this.procPaths = procPaths;
                return this;
            }

            /**
             * RuleAction.
             */
            public Builder ruleAction(String ruleAction) {
                this.ruleAction = ruleAction;
                return this;
            }

            /**
             * RuleName.
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
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
             * SwitchId.
             */
            public Builder switchId(String switchId) {
                this.switchId = switchId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
