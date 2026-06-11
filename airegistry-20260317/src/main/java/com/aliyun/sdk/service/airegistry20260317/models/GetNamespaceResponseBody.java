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
 * {@link GetNamespaceResponseBody} extends {@link TeaModel}
 *
 * <p>GetNamespaceResponseBody</p>
 */
public class GetNamespaceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetNamespaceResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetNamespaceResponseBody create() {
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

        private Builder(GetNamespaceResponseBody model) {
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

        public GetNamespaceResponseBody build() {
            return new GetNamespaceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetNamespaceResponseBody} extends {@link TeaModel}
     *
     * <p>GetNamespaceResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreatedTime")
        private String createdTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NamespaceId")
        private String namespaceId;

        @com.aliyun.core.annotation.NameInMap("PromptCount")
        private Integer promptCount;

        @com.aliyun.core.annotation.NameInMap("ScanPolicy")
        private String scanPolicy;

        @com.aliyun.core.annotation.NameInMap("SkillCount")
        private Integer skillCount;

        @com.aliyun.core.annotation.NameInMap("Source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("SourceIndex")
        private Integer sourceIndex;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private String tags;

        private Data(Builder builder) {
            this.createdTime = builder.createdTime;
            this.description = builder.description;
            this.name = builder.name;
            this.namespaceId = builder.namespaceId;
            this.promptCount = builder.promptCount;
            this.scanPolicy = builder.scanPolicy;
            this.skillCount = builder.skillCount;
            this.source = builder.source;
            this.sourceIndex = builder.sourceIndex;
            this.tags = builder.tags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return createdTime
         */
        public String getCreatedTime() {
            return this.createdTime;
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

        /**
         * @return namespaceId
         */
        public String getNamespaceId() {
            return this.namespaceId;
        }

        /**
         * @return promptCount
         */
        public Integer getPromptCount() {
            return this.promptCount;
        }

        /**
         * @return scanPolicy
         */
        public String getScanPolicy() {
            return this.scanPolicy;
        }

        /**
         * @return skillCount
         */
        public Integer getSkillCount() {
            return this.skillCount;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return sourceIndex
         */
        public Integer getSourceIndex() {
            return this.sourceIndex;
        }

        /**
         * @return tags
         */
        public String getTags() {
            return this.tags;
        }

        public static final class Builder {
            private String createdTime; 
            private String description; 
            private String name; 
            private String namespaceId; 
            private Integer promptCount; 
            private String scanPolicy; 
            private Integer skillCount; 
            private String source; 
            private Integer sourceIndex; 
            private String tags; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.createdTime = model.createdTime;
                this.description = model.description;
                this.name = model.name;
                this.namespaceId = model.namespaceId;
                this.promptCount = model.promptCount;
                this.scanPolicy = model.scanPolicy;
                this.skillCount = model.skillCount;
                this.source = model.source;
                this.sourceIndex = model.sourceIndex;
                this.tags = model.tags;
            } 

            /**
             * CreatedTime.
             */
            public Builder createdTime(String createdTime) {
                this.createdTime = createdTime;
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

            /**
             * NamespaceId.
             */
            public Builder namespaceId(String namespaceId) {
                this.namespaceId = namespaceId;
                return this;
            }

            /**
             * PromptCount.
             */
            public Builder promptCount(Integer promptCount) {
                this.promptCount = promptCount;
                return this;
            }

            /**
             * ScanPolicy.
             */
            public Builder scanPolicy(String scanPolicy) {
                this.scanPolicy = scanPolicy;
                return this;
            }

            /**
             * SkillCount.
             */
            public Builder skillCount(Integer skillCount) {
                this.skillCount = skillCount;
                return this;
            }

            /**
             * Source.
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * SourceIndex.
             */
            public Builder sourceIndex(Integer sourceIndex) {
                this.sourceIndex = sourceIndex;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(String tags) {
                this.tags = tags;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
