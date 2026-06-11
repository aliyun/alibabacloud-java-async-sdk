// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airegistry20260317.models;

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
 * {@link GetPromptVersionResponseBody} extends {@link TeaModel}
 *
 * <p>GetPromptVersionResponseBody</p>
 */
public class GetPromptVersionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetPromptVersionResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPromptVersionResponseBody create() {
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

        private Builder(GetPromptVersionResponseBody model) {
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetPromptVersionResponseBody build() {
            return new GetPromptVersionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetPromptVersionResponseBody} extends {@link TeaModel}
     *
     * <p>GetPromptVersionResponseBody</p>
     */
    public static class Variables extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DefaultValue")
        private String defaultValue;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private Variables(Builder builder) {
            this.defaultValue = builder.defaultValue;
            this.description = builder.description;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Variables create() {
            return builder().build();
        }

        /**
         * @return defaultValue
         */
        public String getDefaultValue() {
            return this.defaultValue;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String defaultValue; 
            private String description; 
            private String name; 

            private Builder() {
            } 

            private Builder(Variables model) {
                this.defaultValue = model.defaultValue;
                this.description = model.description;
                this.name = model.name;
            } 

            /**
             * DefaultValue.
             */
            public Builder defaultValue(String defaultValue) {
                this.defaultValue = defaultValue;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Variables build() {
                return new Variables(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetPromptVersionResponseBody} extends {@link TeaModel}
     *
     * <p>GetPromptVersionResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CommitMsg")
        private String commitMsg;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private Long gmtModified;

        @com.aliyun.core.annotation.NameInMap("Md5")
        private String md5;

        @com.aliyun.core.annotation.NameInMap("PromptKey")
        private String promptKey;

        @com.aliyun.core.annotation.NameInMap("SrcUser")
        private String srcUser;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Template")
        private String template;

        @com.aliyun.core.annotation.NameInMap("Variables")
        private java.util.List<Variables> variables;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        private Data(Builder builder) {
            this.commitMsg = builder.commitMsg;
            this.gmtModified = builder.gmtModified;
            this.md5 = builder.md5;
            this.promptKey = builder.promptKey;
            this.srcUser = builder.srcUser;
            this.status = builder.status;
            this.template = builder.template;
            this.variables = builder.variables;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return commitMsg
         */
        public String getCommitMsg() {
            return this.commitMsg;
        }

        /**
         * @return gmtModified
         */
        public Long getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return md5
         */
        public String getMd5() {
            return this.md5;
        }

        /**
         * @return promptKey
         */
        public String getPromptKey() {
            return this.promptKey;
        }

        /**
         * @return srcUser
         */
        public String getSrcUser() {
            return this.srcUser;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return template
         */
        public String getTemplate() {
            return this.template;
        }

        /**
         * @return variables
         */
        public java.util.List<Variables> getVariables() {
            return this.variables;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String commitMsg; 
            private Long gmtModified; 
            private String md5; 
            private String promptKey; 
            private String srcUser; 
            private String status; 
            private String template; 
            private java.util.List<Variables> variables; 
            private String version; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.commitMsg = model.commitMsg;
                this.gmtModified = model.gmtModified;
                this.md5 = model.md5;
                this.promptKey = model.promptKey;
                this.srcUser = model.srcUser;
                this.status = model.status;
                this.template = model.template;
                this.variables = model.variables;
                this.version = model.version;
            } 

            /**
             * CommitMsg.
             */
            public Builder commitMsg(String commitMsg) {
                this.commitMsg = commitMsg;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * Md5.
             */
            public Builder md5(String md5) {
                this.md5 = md5;
                return this;
            }

            /**
             * PromptKey.
             */
            public Builder promptKey(String promptKey) {
                this.promptKey = promptKey;
                return this;
            }

            /**
             * SrcUser.
             */
            public Builder srcUser(String srcUser) {
                this.srcUser = srcUser;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Template.
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * Variables.
             */
            public Builder variables(java.util.List<Variables> variables) {
                this.variables = variables;
                return this;
            }

            /**
             * Version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
