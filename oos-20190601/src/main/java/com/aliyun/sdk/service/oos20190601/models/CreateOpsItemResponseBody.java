// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateOpsItemResponseBody} extends {@link TeaModel}
 *
 * <p>CreateOpsItemResponseBody</p>
 */
public class CreateOpsItemResponseBody extends TeaModel {
    @NameInMap("OpsItem")
    private OpsItem opsItem;

    @NameInMap("RequestId")
    private String requestId;

    private CreateOpsItemResponseBody(Builder builder) {
        this.opsItem = builder.opsItem;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateOpsItemResponseBody create() {
        return builder().build();
    }

    /**
     * @return opsItem
     */
    public OpsItem getOpsItem() {
        return this.opsItem;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private OpsItem opsItem; 
        private String requestId; 

        /**
         * The information about the O\&M item.
         */
        public Builder opsItem(OpsItem opsItem) {
            this.opsItem = opsItem;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateOpsItemResponseBody build() {
            return new CreateOpsItemResponseBody(this);
        } 

    } 

    public static class OpsItem extends TeaModel {
        @NameInMap("Attributes")
        private String attributes;

        @NameInMap("Category")
        private String category;

        @NameInMap("CreateDate")
        private String createDate;

        @NameInMap("CreatedBy")
        private String createdBy;

        @NameInMap("Description")
        private String description;

        @NameInMap("LastModifiedBy")
        private String lastModifiedBy;

        @NameInMap("OpsItemId")
        private String opsItemId;

        @NameInMap("Priority")
        private Integer priority;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("Resources")
        private String resources;

        @NameInMap("Severity")
        private String severity;

        @NameInMap("Solutions")
        private String solutions;

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

        private OpsItem(Builder builder) {
            this.attributes = builder.attributes;
            this.category = builder.category;
            this.createDate = builder.createDate;
            this.createdBy = builder.createdBy;
            this.description = builder.description;
            this.lastModifiedBy = builder.lastModifiedBy;
            this.opsItemId = builder.opsItemId;
            this.priority = builder.priority;
            this.resourceGroupId = builder.resourceGroupId;
            this.resources = builder.resources;
            this.severity = builder.severity;
            this.solutions = builder.solutions;
            this.source = builder.source;
            this.status = builder.status;
            this.tags = builder.tags;
            this.title = builder.title;
            this.updateDate = builder.updateDate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OpsItem create() {
            return builder().build();
        }

        /**
         * @return attributes
         */
        public String getAttributes() {
            return this.attributes;
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
         * @return createdBy
         */
        public String getCreatedBy() {
            return this.createdBy;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return lastModifiedBy
         */
        public String getLastModifiedBy() {
            return this.lastModifiedBy;
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
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return resources
         */
        public String getResources() {
            return this.resources;
        }

        /**
         * @return severity
         */
        public String getSeverity() {
            return this.severity;
        }

        /**
         * @return solutions
         */
        public String getSolutions() {
            return this.solutions;
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
            private String attributes; 
            private String category; 
            private String createDate; 
            private String createdBy; 
            private String description; 
            private String lastModifiedBy; 
            private String opsItemId; 
            private Integer priority; 
            private String resourceGroupId; 
            private String resources; 
            private String severity; 
            private String solutions; 
            private String source; 
            private String status; 
            private java.util.Map < String, ? > tags; 
            private String title; 
            private String updateDate; 

            /**
             * The attributes of the O\&M item.
             */
            public Builder attributes(String attributes) {
                this.attributes = attributes;
                return this;
            }

            /**
             * The category of the O\&M item.
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
             * The user who created the O\&M item.
             */
            public Builder createdBy(String createdBy) {
                this.createdBy = createdBy;
                return this;
            }

            /**
             * The description of the O\&M item.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The user who last modified the O\&M item.
             */
            public Builder lastModifiedBy(String lastModifiedBy) {
                this.lastModifiedBy = lastModifiedBy;
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
             * The priority of the O\&M item.
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * The ID of the resource group.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * The ARNs of the associated resources.
             */
            public Builder resources(String resources) {
                this.resources = resources;
                return this;
            }

            /**
             * The severity level of the O\&M item.
             */
            public Builder severity(String severity) {
                this.severity = severity;
                return this;
            }

            /**
             * The solutions.
             */
            public Builder solutions(String solutions) {
                this.solutions = solutions;
                return this;
            }

            /**
             * The source business of the O\&M item.
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * The state of the O\&M item.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The tags of the O\&M item.
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

            public OpsItem build() {
                return new OpsItem(this);
            } 

        } 

    }
}
