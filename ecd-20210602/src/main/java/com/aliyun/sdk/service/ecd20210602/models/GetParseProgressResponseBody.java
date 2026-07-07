// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20210602.models;

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
 * {@link GetParseProgressResponseBody} extends {@link TeaModel}
 *
 * <p>GetParseProgressResponseBody</p>
 */
public class GetParseProgressResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetParseProgressResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetParseProgressResponseBody create() {
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

        private Builder(GetParseProgressResponseBody model) {
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

        public GetParseProgressResponseBody build() {
            return new GetParseProgressResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetParseProgressResponseBody} extends {@link TeaModel}
     *
     * <p>GetParseProgressResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("RequiredEnvVars")
        private java.util.List<String> requiredEnvVars;

        @com.aliyun.core.annotation.NameInMap("RequiresApiKey")
        private Boolean requiresApiKey;

        @com.aliyun.core.annotation.NameInMap("SkillName")
        private String skillName;

        @com.aliyun.core.annotation.NameInMap("Slug")
        private String slug;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TaskKey")
        private String taskKey;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        private Data(Builder builder) {
            this.description = builder.description;
            this.errorCode = builder.errorCode;
            this.errorMessage = builder.errorMessage;
            this.requiredEnvVars = builder.requiredEnvVars;
            this.requiresApiKey = builder.requiresApiKey;
            this.skillName = builder.skillName;
            this.slug = builder.slug;
            this.status = builder.status;
            this.taskKey = builder.taskKey;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
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
         * @return requiredEnvVars
         */
        public java.util.List<String> getRequiredEnvVars() {
            return this.requiredEnvVars;
        }

        /**
         * @return requiresApiKey
         */
        public Boolean getRequiresApiKey() {
            return this.requiresApiKey;
        }

        /**
         * @return skillName
         */
        public String getSkillName() {
            return this.skillName;
        }

        /**
         * @return slug
         */
        public String getSlug() {
            return this.slug;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return taskKey
         */
        public String getTaskKey() {
            return this.taskKey;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String description; 
            private String errorCode; 
            private String errorMessage; 
            private java.util.List<String> requiredEnvVars; 
            private Boolean requiresApiKey; 
            private String skillName; 
            private String slug; 
            private String status; 
            private String taskKey; 
            private String version; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.description = model.description;
                this.errorCode = model.errorCode;
                this.errorMessage = model.errorMessage;
                this.requiredEnvVars = model.requiredEnvVars;
                this.requiresApiKey = model.requiresApiKey;
                this.skillName = model.skillName;
                this.slug = model.slug;
                this.status = model.status;
                this.taskKey = model.taskKey;
                this.version = model.version;
            } 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * ErrorCode.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * ErrorMessage.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * RequiredEnvVars.
             */
            public Builder requiredEnvVars(java.util.List<String> requiredEnvVars) {
                this.requiredEnvVars = requiredEnvVars;
                return this;
            }

            /**
             * RequiresApiKey.
             */
            public Builder requiresApiKey(Boolean requiresApiKey) {
                this.requiresApiKey = requiresApiKey;
                return this;
            }

            /**
             * SkillName.
             */
            public Builder skillName(String skillName) {
                this.skillName = skillName;
                return this;
            }

            /**
             * Slug.
             */
            public Builder slug(String slug) {
                this.slug = slug;
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
             * TaskKey.
             */
            public Builder taskKey(String taskKey) {
                this.taskKey = taskKey;
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
