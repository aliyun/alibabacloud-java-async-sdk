// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iacservice20210806.models;

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
 * {@link ListStacksResponseBody} extends {@link TeaModel}
 *
 * <p>ListStacksResponseBody</p>
 */
public class ListStacksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("stacks")
    private java.util.List<Stacks> stacks;

    @com.aliyun.core.annotation.NameInMap("totalCount")
    private Integer totalCount;

    private ListStacksResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.stacks = builder.stacks;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListStacksResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return stacks
     */
    public java.util.List<Stacks> getStacks() {
        return this.stacks;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private java.util.List<Stacks> stacks; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListStacksResponseBody model) {
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.stacks = model.stacks;
            this.totalCount = model.totalCount;
        } 

        /**
         * maxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * nextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * stacks.
         */
        public Builder stacks(java.util.List<Stacks> stacks) {
            this.stacks = stacks;
            return this;
        }

        /**
         * totalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListStacksResponseBody build() {
            return new ListStacksResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListStacksResponseBody} extends {@link TeaModel}
     *
     * <p>ListStacksResponseBody</p>
     */
    public static class Stacks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("createTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("sourcePath")
        private String sourcePath;

        @com.aliyun.core.annotation.NameInMap("stackDescription")
        private String stackDescription;

        @com.aliyun.core.annotation.NameInMap("stackId")
        private String stackId;

        @com.aliyun.core.annotation.NameInMap("stackName")
        private String stackName;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        private Stacks(Builder builder) {
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.name = builder.name;
            this.source = builder.source;
            this.sourcePath = builder.sourcePath;
            this.stackDescription = builder.stackDescription;
            this.stackId = builder.stackId;
            this.stackName = builder.stackName;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Stacks create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
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
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return sourcePath
         */
        public String getSourcePath() {
            return this.sourcePath;
        }

        /**
         * @return stackDescription
         */
        public String getStackDescription() {
            return this.stackDescription;
        }

        /**
         * @return stackId
         */
        public String getStackId() {
            return this.stackId;
        }

        /**
         * @return stackName
         */
        public String getStackName() {
            return this.stackName;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String createTime; 
            private String description; 
            private String name; 
            private String source; 
            private String sourcePath; 
            private String stackDescription; 
            private String stackId; 
            private String stackName; 
            private String status; 

            private Builder() {
            } 

            private Builder(Stacks model) {
                this.createTime = model.createTime;
                this.description = model.description;
                this.name = model.name;
                this.source = model.source;
                this.sourcePath = model.sourcePath;
                this.stackDescription = model.stackDescription;
                this.stackId = model.stackId;
                this.stackName = model.stackName;
                this.status = model.status;
            } 

            /**
             * createTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * source.
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * sourcePath.
             */
            public Builder sourcePath(String sourcePath) {
                this.sourcePath = sourcePath;
                return this;
            }

            /**
             * stackDescription.
             */
            public Builder stackDescription(String stackDescription) {
                this.stackDescription = stackDescription;
                return this;
            }

            /**
             * stackId.
             */
            public Builder stackId(String stackId) {
                this.stackId = stackId;
                return this;
            }

            /**
             * stackName.
             */
            public Builder stackName(String stackName) {
                this.stackName = stackName;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Stacks build() {
                return new Stacks(this);
            } 

        } 

    }
}
