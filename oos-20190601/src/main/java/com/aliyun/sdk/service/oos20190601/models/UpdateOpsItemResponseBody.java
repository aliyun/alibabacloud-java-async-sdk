// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateOpsItemResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateOpsItemResponseBody</p>
 */
public class UpdateOpsItemResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("OpsItem")
    private OpsItem opsItem;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The information about the O&amp;M item.</p>
         */
        public Builder opsItem(OpsItem opsItem) {
            this.opsItem = opsItem;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>C996DECB-3D2B-5321-B359-BE7031B6399E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateOpsItemResponseBody build() {
            return new UpdateOpsItemResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UpdateOpsItemResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateOpsItemResponseBody</p>
     */
    public static class OpsItem extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Attributes")
        private String attributes;

        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("CreateDate")
        private String createDate;

        @com.aliyun.core.annotation.NameInMap("CreatedBy")
        private String createdBy;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("LastModifiedBy")
        private String lastModifiedBy;

        @com.aliyun.core.annotation.NameInMap("OpsItemId")
        private String opsItemId;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private Integer priority;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("Resources")
        private java.util.List < String > resources;

        @com.aliyun.core.annotation.NameInMap("Severity")
        private String severity;

        @com.aliyun.core.annotation.NameInMap("Solutions")
        private java.util.List < String > solutions;

        @com.aliyun.core.annotation.NameInMap("Source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.Map < String, ? > tags;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("UpdateDate")
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
             * <p>The attributes of the O&amp;M item.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;Attribute&quot;: {&quot;Weight&quot;: 100}, &quot;RealServer&quot;: &quot;uaejc8hnqzqz5valyh8dibolpvza48ik.yundunwaf5.com&quot;}]</p>
             */
            public Builder attributes(String attributes) {
                this.attributes = attributes;
                return this;
            }

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
             * <p>2023-03-16T07:04Z</p>
             */
            public Builder createDate(String createDate) {
                this.createDate = createDate;
                return this;
            }

            /**
             * <p>The user who created the patch baseline.</p>
             * 
             * <strong>example:</strong>
             * <p>root(130900000)</p>
             */
            public Builder createdBy(String createdBy) {
                this.createdBy = createdBy;
                return this;
            }

            /**
             * <p>The description.</p>
             * 
             * <strong>example:</strong>
             * <p>test-update</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The user who modified the O&amp;M item.</p>
             * 
             * <strong>example:</strong>
             * <p>root(130900000)</p>
             */
            public Builder lastModifiedBy(String lastModifiedBy) {
                this.lastModifiedBy = lastModifiedBy;
                return this;
            }

            /**
             * <p>The ID of the O&amp;M item.</p>
             * 
             * <strong>example:</strong>
             * <p>oi-e2264dcf040c472598e9</p>
             */
            public Builder opsItemId(String opsItemId) {
                this.opsItemId = opsItemId;
                return this;
            }

            /**
             * <p>The priority.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>The ID of the resource group.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-acfmxsn4m4******</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The ARNs of the associated resources.</p>
             */
            public Builder resources(java.util.List < String > resources) {
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
             * <p>The solutions.</p>
             */
            public Builder solutions(java.util.List < String > solutions) {
                this.solutions = solutions;
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
             * <p>The status.</p>
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
             * <p>{
             *       &quot;k1&quot;: &quot;v1&quot;,
             *       &quot;k2&quot;: &quot;v2&quot;
             * }</p>
             */
            public Builder tags(java.util.Map < String, ? > tags) {
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
             * <p>2023-03-16T08:04Z</p>
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
