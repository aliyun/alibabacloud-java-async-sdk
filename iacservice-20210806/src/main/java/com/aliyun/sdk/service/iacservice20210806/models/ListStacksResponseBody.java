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
         * <p>The maximum number of results returned.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token. This parameter is empty if no more pages are available.</p>
         * 
         * <strong>example:</strong>
         * <p>LC4NJL3Ru2bIiRdnbADPQp4dD+2BRJj42DLT6GrZysw=</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3E49127A-BB65-5CCD-AB93-0EC0A43E5446</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The list of stacks.</p>
         */
        public Builder stacks(java.util.List<Stacks> stacks) {
            this.stacks = stacks;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
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
             * <p>The creation time in UTC. The time follows the ISO 8601 standard in the YYYY-MM-DDTHH:mm:ssZ format.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-05-07T02:21:28Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The description of the stack.</p>
             * 
             * <strong>example:</strong>
             * <p>description of stack</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The stack name.</p>
             * 
             * <strong>example:</strong>
             * <p>stack-test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The creation source. Valid values:</p>
             * <ul>
             * <li>OSS: a template stored in Object Storage Service (OSS).</li>
             * <li>IAC_SERVICE_MODULE: a template created in the automation service console.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>OSS</p>
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * <p>The path value of the configuration source. The value cannot exceed 1000 characters.</p>
             * <ul>
             * <li>If the source is OSS, the value is in the format oss::<file link> and must be a zip file. Example: oss::<a href="https://terraform-pipeline.oss-eu-central-1.aliyuncs.com/code.zip">https://terraform-pipeline.oss-eu-central-1.aliyuncs.com/code.zip</a></li>
             * <li>If the source is IAC_SERVICE_MODULE, the value is a template ID. Example: mod-xxxxx</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>oss::<a href="https://terraform-pipeline.oss-eu-central-1.aliyuncs.com/code.zip">https://terraform-pipeline.oss-eu-central-1.aliyuncs.com/code.zip</a></p>
             */
            public Builder sourcePath(String sourcePath) {
                this.sourcePath = sourcePath;
                return this;
            }

            /**
             * <p>The description of the stack.</p>
             * 
             * <strong>example:</strong>
             * <p>description of stack</p>
             */
            public Builder stackDescription(String stackDescription) {
                this.stackDescription = stackDescription;
                return this;
            }

            /**
             * <p>The stack ID, which is the unique identifier generated after the stack is created.</p>
             * 
             * <strong>example:</strong>
             * <p>stack-as1d4vld898ppnqxxxxxx</p>
             */
            public Builder stackId(String stackId) {
                this.stackId = stackId;
                return this;
            }

            /**
             * <p>The stack name (deprecated). Use name instead.</p>
             * 
             * <strong>example:</strong>
             * <p>stack-test</p>
             */
            public Builder stackName(String stackName) {
                this.stackName = stackName;
                return this;
            }

            /**
             * <p>The stack status.</p>
             * <table>
             * <thead>
             * <tr>
             * <th>Name</th>
             * <th>Description</th>
             * </tr>
             * </thead>
             * <tbody><tr>
             * <td>Creating</td>
             * <td>Being created.</td>
             * </tr>
             * <tr>
             * <td>Created</td>
             * <td>Created.</td>
             * </tr>
             * <tr>
             * <td>Waiting</td>
             * <td>Waiting for deployment.</td>
             * </tr>
             * <tr>
             * <td>Deploying</td>
             * <td>Being deployed.</td>
             * </tr>
             * <tr>
             * <td>Deployed</td>
             * <td>Deployed.</td>
             * </tr>
             * <tr>
             * <td>Errored</td>
             * <td>Deployment failed.</td>
             * </tr>
             * <tr>
             * <td>Deleting</td>
             * <td>Being deleted.</td>
             * </tr>
             * <tr>
             * <td>Deleted</td>
             * <td>Deleted.</td>
             * </tr>
             * <tr>
             * <td>DeleteFailed</td>
             * <td>Deletion failed.</td>
             * </tr>
             * </tbody></table>
             * 
             * <strong>example:</strong>
             * <p>Deployed</p>
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
