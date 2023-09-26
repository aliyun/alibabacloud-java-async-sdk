// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListOpsItemsResponseBody} extends {@link TeaModel}
 *
 * <p>ListOpsItemsResponseBody</p>
 */
public class ListOpsItemsResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    private Integer maxResults;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("OpsItems")
    private java.util.List < OpsItems> opsItems;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
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
    public java.util.List < OpsItems> getOpsItems() {
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
        private java.util.List < OpsItems> opsItems; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The number of entries returned on each page.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The pagination token that can be used in the next request to retrieve a new page of results.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The list of O\&M items.
         */
        public Builder opsItems(java.util.List < OpsItems> opsItems) {
            this.opsItems = opsItems;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListOpsItemsResponseBody build() {
            return new ListOpsItemsResponseBody(this);
        } 

    } 

    public static class OpsItems extends TeaModel {
        @NameInMap("Category")
        private String category;

        @NameInMap("CreateDate")
        private String createDate;

        @NameInMap("OpsItemId")
        private String opsItemId;

        @NameInMap("Priority")
        private Integer priority;

        @NameInMap("Resources")
        private java.util.List < String > resources;

        @NameInMap("Severity")
        private String severity;

        @NameInMap("Source")
        private String source;

        @NameInMap("Status")
        private String status;

        @NameInMap("Tags")
        private java.util.Map < String, ? > tags;

        @NameInMap("Title")
        private String title;

        @NameInMap("UpdateDate")
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
        public java.util.List < String > getResources() {
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
        public java.util.Map < String, ? > getTags() {
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
            private java.util.List < String > resources; 
            private String severity; 
            private String source; 
            private String status; 
            private java.util.Map < String, ? > tags; 
            private String title; 
            private String updateDate; 

            /**
             * The category.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * The time when the O\&M item was created.
             */
            public Builder createDate(String createDate) {
                this.createDate = createDate;
                return this;
            }

            /**
             * The ID of the O\&M item.
             */
            public Builder opsItemId(String opsItemId) {
                this.opsItemId = opsItemId;
                return this;
            }

            /**
             * The priority.
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * The Alibaba Resource Names (ARNs) of the associated resources.
             */
            public Builder resources(java.util.List < String > resources) {
                this.resources = resources;
                return this;
            }

            /**
             * The severity level.
             */
            public Builder severity(String severity) {
                this.severity = severity;
                return this;
            }

            /**
             * The source business.
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * The status of the O\&M item.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The tags.
             */
            public Builder tags(java.util.Map < String, ? > tags) {
                this.tags = tags;
                return this;
            }

            /**
             * The title of the O\&M item.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * The time when the O\&M item was updated.
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
