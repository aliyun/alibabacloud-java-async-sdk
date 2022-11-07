// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateOpsItemResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateOpsItemResponseBody</p>
 */
public class UpdateOpsItemResponseBody extends TeaModel {
    @NameInMap("OpsItem")
    private OpsItem opsItem;

    @NameInMap("RequestId")
    private String requestId;

    private UpdateOpsItemResponseBody(Builder builder) {
        this.opsItem = builder.opsItem;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateOpsItemResponseBody create() {
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
         * OpsItem.
         */
        public Builder opsItem(OpsItem opsItem) {
            this.opsItem = opsItem;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateOpsItemResponseBody build() {
            return new UpdateOpsItemResponseBody(this);
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
        private java.util.List < String > resources;

        @NameInMap("Severity")
        private String severity;

        @NameInMap("Solutions")
        private java.util.List < String > solutions;

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
         * @return solutions
         */
        public java.util.List < String > getSolutions() {
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
            private java.util.List < String > resources; 
            private String severity; 
            private java.util.List < String > solutions; 
            private String source; 
            private String status; 
            private java.util.Map < String, ? > tags; 
            private String title; 
            private String updateDate; 

            /**
             * Attributes.
             */
            public Builder attributes(String attributes) {
                this.attributes = attributes;
                return this;
            }

            /**
             * Category.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * CreateDate.
             */
            public Builder createDate(String createDate) {
                this.createDate = createDate;
                return this;
            }

            /**
             * CreatedBy.
             */
            public Builder createdBy(String createdBy) {
                this.createdBy = createdBy;
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
             * LastModifiedBy.
             */
            public Builder lastModifiedBy(String lastModifiedBy) {
                this.lastModifiedBy = lastModifiedBy;
                return this;
            }

            /**
             * OpsItemId.
             */
            public Builder opsItemId(String opsItemId) {
                this.opsItemId = opsItemId;
                return this;
            }

            /**
             * Priority.
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * ResourceGroupId.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * Resources.
             */
            public Builder resources(java.util.List < String > resources) {
                this.resources = resources;
                return this;
            }

            /**
             * Severity.
             */
            public Builder severity(String severity) {
                this.severity = severity;
                return this;
            }

            /**
             * Solutions.
             */
            public Builder solutions(java.util.List < String > solutions) {
                this.solutions = solutions;
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
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(java.util.Map < String, ? > tags) {
                this.tags = tags;
                return this;
            }

            /**
             * Title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * UpdateDate.
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
