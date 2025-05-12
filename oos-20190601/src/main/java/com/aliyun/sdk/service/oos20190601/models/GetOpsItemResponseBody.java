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
 * {@link GetOpsItemResponseBody} extends {@link TeaModel}
 *
 * <p>GetOpsItemResponseBody</p>
 */
public class GetOpsItemResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("OpsItem")
    private OpsItem opsItem;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetOpsItemResponseBody(Builder builder) {
        this.opsItem = builder.opsItem;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOpsItemResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetOpsItemResponseBody model) {
            this.opsItem = model.opsItem;
            this.requestId = model.requestId;
        } 

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
         * <p>8BED4C16-BD30-5E27-94D4-7EBCCECF70C1</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetOpsItemResponseBody build() {
            return new GetOpsItemResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetOpsItemResponseBody} extends {@link TeaModel}
     *
     * <p>GetOpsItemResponseBody</p>
     */
    public static class OpsItem extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Attributes")
        private java.util.Map<String, ?> attributes;

        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("CreateBy")
        private String createBy;

        @com.aliyun.core.annotation.NameInMap("CreateDate")
        private String createDate;

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
        private java.util.List<String> resources;

        @com.aliyun.core.annotation.NameInMap("Severity")
        private String severity;

        @com.aliyun.core.annotation.NameInMap("Solutions")
        private java.util.List<java.util.Map<String, ?>> solutions;

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

        private OpsItem(Builder builder) {
            this.attributes = builder.attributes;
            this.category = builder.category;
            this.createBy = builder.createBy;
            this.createDate = builder.createDate;
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
        public java.util.Map<String, ?> getAttributes() {
            return this.attributes;
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return createBy
         */
        public String getCreateBy() {
            return this.createBy;
        }

        /**
         * @return createDate
         */
        public String getCreateDate() {
            return this.createDate;
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
         * @return solutions
         */
        public java.util.List<java.util.Map<String, ?>> getSolutions() {
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
            private java.util.Map<String, ?> attributes; 
            private String category; 
            private String createBy; 
            private String createDate; 
            private String description; 
            private String lastModifiedBy; 
            private String opsItemId; 
            private Integer priority; 
            private String resourceGroupId; 
            private java.util.List<String> resources; 
            private String severity; 
            private java.util.List<java.util.Map<String, ?>> solutions; 
            private String source; 
            private String status; 
            private java.util.Map<String, ?> tags; 
            private String title; 
            private String updateDate; 

            private Builder() {
            } 

            private Builder(OpsItem model) {
                this.attributes = model.attributes;
                this.category = model.category;
                this.createBy = model.createBy;
                this.createDate = model.createDate;
                this.description = model.description;
                this.lastModifiedBy = model.lastModifiedBy;
                this.opsItemId = model.opsItemId;
                this.priority = model.priority;
                this.resourceGroupId = model.resourceGroupId;
                this.resources = model.resources;
                this.severity = model.severity;
                this.solutions = model.solutions;
                this.source = model.source;
                this.status = model.status;
                this.tags = model.tags;
                this.title = model.title;
                this.updateDate = model.updateDate;
            } 

            /**
             * <p>The information about the attributes of the O&amp;M item.</p>
             */
            public Builder attributes(java.util.Map<String, ?> attributes) {
                this.attributes = attributes;
                return this;
            }

            /**
             * <p>The category of the O&amp;M item.</p>
             * 
             * <strong>example:</strong>
             * <p>Security</p>
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * <p>The user who created the O&amp;M item.</p>
             * 
             * <strong>example:</strong>
             * <p>root(130900000)</p>
             */
            public Builder createBy(String createBy) {
                this.createBy = createBy;
                return this;
            }

            /**
             * <p>The time when the O&amp;M item was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-04-10T06:15Z</p>
             */
            public Builder createDate(String createDate) {
                this.createDate = createDate;
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
             * <p>The user who last modified the O&amp;M item.</p>
             * 
             * <strong>example:</strong>
             * <p>modifiedBy</p>
             */
            public Builder lastModifiedBy(String lastModifiedBy) {
                this.lastModifiedBy = lastModifiedBy;
                return this;
            }

            /**
             * <p>The O&amp;M item ID.</p>
             * 
             * <strong>example:</strong>
             * <p>oi-d52b08695e2b46ae8413</p>
             */
            public Builder opsItemId(String opsItemId) {
                this.opsItemId = opsItemId;
                return this;
            }

            /**
             * <p>The priority of the O&amp;M item.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>The ID of the resource group.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-aekzxkofnlxtn2i</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The Alibaba Cloud Resource Names (ARNs) of the associated resources.</p>
             */
            public Builder resources(java.util.List<String> resources) {
                this.resources = resources;
                return this;
            }

            /**
             * <p>The severity level of the O&amp;M item.</p>
             * 
             * <strong>example:</strong>
             * <p>Medium</p>
             */
            public Builder severity(String severity) {
                this.severity = severity;
                return this;
            }

            /**
             * <p>The solutions to the O&amp;M item.</p>
             */
            public Builder solutions(java.util.List<java.util.Map<String, ?>> solutions) {
                this.solutions = solutions;
                return this;
            }

            /**
             * <p>The source business of the O&amp;M item.</p>
             * 
             * <strong>example:</strong>
             * <p>/aliyun/appManager</p>
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
             * <p>The tags attached to the O&amp;M item.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;K1&quot;:&quot;V1&quot;}</p>
             */
            public Builder tags(java.util.Map<String, ?> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The title of the O&amp;M item.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * <p>The time when the O&amp;M item was updated.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-04-10T06:15Z</p>
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
