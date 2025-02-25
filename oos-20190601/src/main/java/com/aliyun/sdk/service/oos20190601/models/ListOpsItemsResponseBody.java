// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

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
 * {@link ListOpsItemsResponseBody} extends {@link TeaModel}
 *
 * <p>ListOpsItemsResponseBody</p>
 */
public class ListOpsItemsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("OpsItems")
    private java.util.List<OpsItems> opsItems;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListOpsItemsResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.opsItems = builder.opsItems;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListOpsItemsResponseBody create() {
        return builder().build();
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
     * @return opsItems
     */
    public java.util.List<OpsItems> getOpsItems() {
        return this.opsItems;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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
        private java.util.List<OpsItems> opsItems; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * <p>The number of entries returned on each page.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token that can be used in the next request to retrieve a new page of results.</p>
         * 
         * <strong>example:</strong>
         * <p>gAAAAABfTgv5ewUWmNdJ3g7JVLvX70sPH90GZOVGC6KPDUL0FIIb</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The list of O&amp;M items.</p>
         */
        public Builder opsItems(java.util.List<OpsItems> opsItems) {
            this.opsItems = opsItems;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>113DD533-389C-5F83-9C69-F64D5BAB10B2</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListOpsItemsResponseBody build() {
            return new ListOpsItemsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListOpsItemsResponseBody} extends {@link TeaModel}
     *
     * <p>ListOpsItemsResponseBody</p>
     */
    public static class OpsItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("CreateDate")
        private String createDate;

        @com.aliyun.core.annotation.NameInMap("OpsItemId")
        private String opsItemId;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private Integer priority;

        @com.aliyun.core.annotation.NameInMap("Resources")
        private java.util.List<String> resources;

        @com.aliyun.core.annotation.NameInMap("Severity")
        private String severity;

        @com.aliyun.core.annotation.NameInMap("Source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.Map<String, ?> tags;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("UpdateDate")
        private String updateDate;

        private OpsItems(Builder builder) {
            this.category = builder.category;
            this.createDate = builder.createDate;
            this.opsItemId = builder.opsItemId;
            this.priority = builder.priority;
            this.resources = builder.resources;
            this.severity = builder.severity;
            this.source = builder.source;
            this.status = builder.status;
            this.tags = builder.tags;
            this.title = builder.title;
            this.updateDate = builder.updateDate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OpsItems create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return createDate
         */
        public String getCreateDate() {
            return this.createDate;
        }

        /**
         * @return opsItemId
         */
        public String getOpsItemId() {
            return this.opsItemId;
        }

        /**
         * @return priority
         */
        public Integer getPriority() {
            return this.priority;
        }

        /**
         * @return resources
         */
        public java.util.List<String> getResources() {
            return this.resources;
        }

        /**
         * @return severity
         */
        public String getSeverity() {
            return this.severity;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tags
         */
        public java.util.Map<String, ?> getTags() {
            return this.tags;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return updateDate
         */
        public String getUpdateDate() {
            return this.updateDate;
        }

        public static final class Builder {
            private String category; 
            private String createDate; 
            private String opsItemId; 
            private Integer priority; 
            private java.util.List<String> resources; 
            private String severity; 
            private String source; 
            private String status; 
            private java.util.Map<String, ?> tags; 
            private String title; 
            private String updateDate; 

            /**
             * <p>The category.</p>
             * 
             * <strong>example:</strong>
             * <p>Security</p>
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * <p>The time when the O&amp;M item was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-07-09T10:01Z</p>
             */
            public Builder createDate(String createDate) {
                this.createDate = createDate;
                return this;
            }

            /**
             * <p>The ID of the O&amp;M item.</p>
             * 
             * <strong>example:</strong>
             * <p>oi-d52b08695e2b46ae8413</p>
             */
            public Builder opsItemId(String opsItemId) {
                this.opsItemId = opsItemId;
                return this;
            }

            /**
             * <p>The priority.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>The Alibaba Resource Names (ARNs) of the associated resources.</p>
             */
            public Builder resources(java.util.List<String> resources) {
                this.resources = resources;
                return this;
            }

            /**
             * <p>The severity level.</p>
             * 
             * <strong>example:</strong>
             * <p>Medium</p>
             */
            public Builder severity(String severity) {
                this.severity = severity;
                return this;
            }

            /**
             * <p>The source business.</p>
             * 
             * <strong>example:</strong>
             * <p>/aliyun/ecs</p>
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * <p>The status of the O&amp;M item.</p>
             * 
             * <strong>example:</strong>
             * <p>Open</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The tags.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;k1&quot;:&quot;v1&quot;}</p>
             */
            public Builder tags(java.util.Map<String, ?> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The title of the O&amp;M item.</p>
             * 
             * <strong>example:</strong>
             * <p>Test</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * <p>The time when the O&amp;M item was updated.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-07-09T10:01Z</p>
             */
            public Builder updateDate(String updateDate) {
                this.updateDate = updateDate;
                return this;
            }

            public OpsItems build() {
                return new OpsItems(this);
            } 

        } 

    }
}
