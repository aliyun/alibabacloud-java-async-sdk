// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link ListWuyingServerWorkloadTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>ListWuyingServerWorkloadTemplateResponseBody</p>
 */
public class ListWuyingServerWorkloadTemplateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("WorkloadTemplates")
    private java.util.List<WorkloadTemplates> workloadTemplates;

    private ListWuyingServerWorkloadTemplateResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.workloadTemplates = builder.workloadTemplates;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListWuyingServerWorkloadTemplateResponseBody create() {
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
     * @return workloadTemplates
     */
    public java.util.List<WorkloadTemplates> getWorkloadTemplates() {
        return this.workloadTemplates;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private java.util.List<WorkloadTemplates> workloadTemplates; 

        private Builder() {
        } 

        private Builder(ListWuyingServerWorkloadTemplateResponseBody model) {
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.workloadTemplates = model.workloadTemplates;
        } 

        /**
         * <p>The compatibility field. The current version does not use this field to indicate the number of returned entries.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The compatibility field. The current version does not generate a next page token.</p>
         * 
         * <strong>example:</strong>
         * <p>unused</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The unique identifier of the request. You can use this ID to troubleshoot request issues.</p>
         * 
         * <strong>example:</strong>
         * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The list of workload templates. The templates are returned in the configuration order, with a maximum of 100 entries.</p>
         */
        public Builder workloadTemplates(java.util.List<WorkloadTemplates> workloadTemplates) {
            this.workloadTemplates = workloadTemplates;
            return this;
        }

        public ListWuyingServerWorkloadTemplateResponseBody build() {
            return new ListWuyingServerWorkloadTemplateResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListWuyingServerWorkloadTemplateResponseBody} extends {@link TeaModel}
     *
     * <p>ListWuyingServerWorkloadTemplateResponseBody</p>
     */
    public static class WorkloadTemplates extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private WorkloadTemplates(Builder builder) {
            this.content = builder.content;
            this.description = builder.description;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WorkloadTemplates create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
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
            private String content; 
            private String description; 
            private String name; 

            private Builder() {
            } 

            private Builder(WorkloadTemplates model) {
                this.content = model.content;
                this.description = model.description;
                this.name = model.name;
            } 

            /**
             * <p>The rendered template content. The original text is Base64-encoded after being UTF-8 encoded. You must perform Base64 decoding before use.</p>
             * 
             * <strong>example:</strong>
             * <p>IyB3b3JrbG9hZCB0ZW1wbGF0ZQo=</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The description of the workload template.</p>
             * 
             * <strong>example:</strong>
             * <p>Used to submit general-purpose computing workloads</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the workload template.</p>
             * 
             * <strong>example:</strong>
             * <p>General-purpose computing task template</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public WorkloadTemplates build() {
                return new WorkloadTemplates(this);
            } 

        } 

    }
}
