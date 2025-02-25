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
 * {@link ListPatchBaselinesResponseBody} extends {@link TeaModel}
 *
 * <p>ListPatchBaselinesResponseBody</p>
 */
public class ListPatchBaselinesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("PatchBaselines")
    private java.util.List<PatchBaselines> patchBaselines;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListPatchBaselinesResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.patchBaselines = builder.patchBaselines;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPatchBaselinesResponseBody create() {
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
     * @return patchBaselines
     */
    public java.util.List<PatchBaselines> getPatchBaselines() {
        return this.patchBaselines;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private java.util.List<PatchBaselines> patchBaselines; 
        private String requestId; 

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The token that is used to retrieve the next page of results.</p>
         * 
         * <strong>example:</strong>
         * <p>The number of entries returned on each page.</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The patch baselines.</p>
         */
        public Builder patchBaselines(java.util.List<PatchBaselines> patchBaselines) {
            this.patchBaselines = patchBaselines;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>432996A1-03C0-5C4C-A8E6-66C4110765B8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListPatchBaselinesResponseBody build() {
            return new ListPatchBaselinesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListPatchBaselinesResponseBody} extends {@link TeaModel}
     *
     * <p>ListPatchBaselinesResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TagKey")
        private String tagKey;

        @com.aliyun.core.annotation.NameInMap("TagValue")
        private String tagValue;

        private Tags(Builder builder) {
            this.tagKey = builder.tagKey;
            this.tagValue = builder.tagValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return tagKey
         */
        public String getTagKey() {
            return this.tagKey;
        }

        /**
         * @return tagValue
         */
        public String getTagValue() {
            return this.tagValue;
        }

        public static final class Builder {
            private String tagKey; 
            private String tagValue; 

            /**
             * <p>The key of the tag.</p>
             * 
             * <strong>example:</strong>
             * <p>key</p>
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * <p>The value of the tag.</p>
             * 
             * <strong>example:</strong>
             * <p>value</p>
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListPatchBaselinesResponseBody} extends {@link TeaModel}
     *
     * <p>ListPatchBaselinesResponseBody</p>
     */
    public static class PatchBaselines extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApprovedPatches")
        private java.util.List<String> approvedPatches;

        @com.aliyun.core.annotation.NameInMap("ApprovedPatchesEnableNonSecurity")
        private Boolean approvedPatchesEnableNonSecurity;

        @com.aliyun.core.annotation.NameInMap("CreatedBy")
        private String createdBy;

        @com.aliyun.core.annotation.NameInMap("CreatedDate")
        private String createdDate;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("IsDefault")
        private Boolean isDefault;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("OperationSystem")
        private String operationSystem;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("ShareType")
        private String shareType;

        @com.aliyun.core.annotation.NameInMap("Sources")
        private java.util.List<String> sources;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<Tags> tags;

        @com.aliyun.core.annotation.NameInMap("UpdatedBy")
        private String updatedBy;

        @com.aliyun.core.annotation.NameInMap("UpdatedDate")
        private String updatedDate;

        private PatchBaselines(Builder builder) {
            this.approvedPatches = builder.approvedPatches;
            this.approvedPatchesEnableNonSecurity = builder.approvedPatchesEnableNonSecurity;
            this.createdBy = builder.createdBy;
            this.createdDate = builder.createdDate;
            this.description = builder.description;
            this.id = builder.id;
            this.isDefault = builder.isDefault;
            this.name = builder.name;
            this.operationSystem = builder.operationSystem;
            this.resourceGroupId = builder.resourceGroupId;
            this.shareType = builder.shareType;
            this.sources = builder.sources;
            this.tags = builder.tags;
            this.updatedBy = builder.updatedBy;
            this.updatedDate = builder.updatedDate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PatchBaselines create() {
            return builder().build();
        }

        /**
         * @return approvedPatches
         */
        public java.util.List<String> getApprovedPatches() {
            return this.approvedPatches;
        }

        /**
         * @return approvedPatchesEnableNonSecurity
         */
        public Boolean getApprovedPatchesEnableNonSecurity() {
            return this.approvedPatchesEnableNonSecurity;
        }

        /**
         * @return createdBy
         */
        public String getCreatedBy() {
            return this.createdBy;
        }

        /**
         * @return createdDate
         */
        public String getCreatedDate() {
            return this.createdDate;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return isDefault
         */
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return operationSystem
         */
        public String getOperationSystem() {
            return this.operationSystem;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return shareType
         */
        public String getShareType() {
            return this.shareType;
        }

        /**
         * @return sources
         */
        public java.util.List<String> getSources() {
            return this.sources;
        }

        /**
         * @return tags
         */
        public java.util.List<Tags> getTags() {
            return this.tags;
        }

        /**
         * @return updatedBy
         */
        public String getUpdatedBy() {
            return this.updatedBy;
        }

        /**
         * @return updatedDate
         */
        public String getUpdatedDate() {
            return this.updatedDate;
        }

        public static final class Builder {
            private java.util.List<String> approvedPatches; 
            private Boolean approvedPatchesEnableNonSecurity; 
            private String createdBy; 
            private String createdDate; 
            private String description; 
            private String id; 
            private Boolean isDefault; 
            private String name; 
            private String operationSystem; 
            private String resourceGroupId; 
            private String shareType; 
            private java.util.List<String> sources; 
            private java.util.List<Tags> tags; 
            private String updatedBy; 
            private String updatedDate; 

            /**
             * <p>The approved patches.</p>
             */
            public Builder approvedPatches(java.util.List<String> approvedPatches) {
                this.approvedPatches = approvedPatches;
                return this;
            }

            /**
             * <p>Indicates whether the approved patch involves updates other than security-related updates.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder approvedPatchesEnableNonSecurity(Boolean approvedPatchesEnableNonSecurity) {
                this.approvedPatchesEnableNonSecurity = approvedPatchesEnableNonSecurity;
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
             * <p>The time when the patch baseline was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-09-08T03:41:23Z</p>
             */
            public Builder createdDate(String createdDate) {
                this.createdDate = createdDate;
                return this;
            }

            /**
             * <p>The description of the patch baseline.</p>
             * 
             * <strong>example:</strong>
             * <p>ListPatchBaseline</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The ID of the patch baseline.</p>
             * 
             * <strong>example:</strong>
             * <p>pb-c2838b5d89b540e19ee6</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Indicates whether the patch baseline is set as the default patch baseline.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isDefault(Boolean isDefault) {
                this.isDefault = isDefault;
                return this;
            }

            /**
             * <p>The name of the patch baseline.</p>
             * 
             * <strong>example:</strong>
             * <p>MyPatchBaseline</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The type of the operating system.</p>
             * 
             * <strong>example:</strong>
             * <p>AliyunLinux</p>
             */
            public Builder operationSystem(String operationSystem) {
                this.operationSystem = operationSystem;
                return this;
            }

            /**
             * <p>The ID of the resource group.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-aek256ia6vhsndy</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The share type of the patch baseline.</p>
             * 
             * <strong>example:</strong>
             * <p>Private</p>
             */
            public Builder shareType(String shareType) {
                this.shareType = shareType;
                return this;
            }

            /**
             * <p>The configurations of patch sources.</p>
             */
            public Builder sources(java.util.List<String> sources) {
                this.sources = sources;
                return this;
            }

            /**
             * <p>The tags of the patch baseline.</p>
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The user who last updated the patch baseline.</p>
             * 
             * <strong>example:</strong>
             * <p>root(130900000)</p>
             */
            public Builder updatedBy(String updatedBy) {
                this.updatedBy = updatedBy;
                return this;
            }

            /**
             * <p>The time when the patch baseline was updated.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-09-08T03:44:34Z</p>
             */
            public Builder updatedDate(String updatedDate) {
                this.updatedDate = updatedDate;
                return this;
            }

            public PatchBaselines build() {
                return new PatchBaselines(this);
            } 

        } 

    }
}
