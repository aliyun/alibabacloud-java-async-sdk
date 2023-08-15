// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPatchBaselineResponseBody} extends {@link TeaModel}
 *
 * <p>GetPatchBaselineResponseBody</p>
 */
public class GetPatchBaselineResponseBody extends TeaModel {
    @NameInMap("PatchBaseline")
    private PatchBaseline patchBaseline;

    @NameInMap("RequestId")
    private String requestId;

    private GetPatchBaselineResponseBody(Builder builder) {
        this.patchBaseline = builder.patchBaseline;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPatchBaselineResponseBody create() {
        return builder().build();
    }

    /**
     * @return patchBaseline
     */
    public PatchBaseline getPatchBaseline() {
        return this.patchBaseline;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private PatchBaseline patchBaseline; 
        private String requestId; 

        /**
         * The details of the patch baseline.
         */
        public Builder patchBaseline(PatchBaseline patchBaseline) {
            this.patchBaseline = patchBaseline;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetPatchBaselineResponseBody build() {
            return new GetPatchBaselineResponseBody(this);
        } 

    } 

    public static class Tags extends TeaModel {
        @NameInMap("TagKey")
        private String tagKey;

        @NameInMap("TagValue")
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
             * TagKey.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * TagValue.
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
    public static class PatchBaseline extends TeaModel {
        @NameInMap("ApprovalRules")
        private String approvalRules;

        @NameInMap("ApprovedPatches")
        private java.util.List < String > approvedPatches;

        @NameInMap("ApprovedPatchesEnableNonSecurity")
        private Boolean approvedPatchesEnableNonSecurity;

        @NameInMap("CreatedBy")
        private String createdBy;

        @NameInMap("CreatedDate")
        private String createdDate;

        @NameInMap("Description")
        private String description;

        @NameInMap("Id")
        private String id;

        @NameInMap("IsDefault")
        private Boolean isDefault;

        @NameInMap("Name")
        private String name;

        @NameInMap("OperationSystem")
        private String operationSystem;

        @NameInMap("RejectedPatches")
        private java.util.List < String > rejectedPatches;

        @NameInMap("RejectedPatchesAction")
        private String rejectedPatchesAction;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("ShareType")
        private String shareType;

        @NameInMap("Sources")
        private java.util.List < String > sources;

        @NameInMap("Tags")
        private java.util.List < Tags> tags;

        @NameInMap("UpdatedBy")
        private String updatedBy;

        @NameInMap("UpdatedDate")
        private String updatedDate;

        private PatchBaseline(Builder builder) {
            this.approvalRules = builder.approvalRules;
            this.approvedPatches = builder.approvedPatches;
            this.approvedPatchesEnableNonSecurity = builder.approvedPatchesEnableNonSecurity;
            this.createdBy = builder.createdBy;
            this.createdDate = builder.createdDate;
            this.description = builder.description;
            this.id = builder.id;
            this.isDefault = builder.isDefault;
            this.name = builder.name;
            this.operationSystem = builder.operationSystem;
            this.rejectedPatches = builder.rejectedPatches;
            this.rejectedPatchesAction = builder.rejectedPatchesAction;
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

        public static PatchBaseline create() {
            return builder().build();
        }

        /**
         * @return approvalRules
         */
        public String getApprovalRules() {
            return this.approvalRules;
        }

        /**
         * @return approvedPatches
         */
        public java.util.List < String > getApprovedPatches() {
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
         * @return rejectedPatches
         */
        public java.util.List < String > getRejectedPatches() {
            return this.rejectedPatches;
        }

        /**
         * @return rejectedPatchesAction
         */
        public String getRejectedPatchesAction() {
            return this.rejectedPatchesAction;
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
        public java.util.List < String > getSources() {
            return this.sources;
        }

        /**
         * @return tags
         */
        public java.util.List < Tags> getTags() {
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
            private String approvalRules; 
            private java.util.List < String > approvedPatches; 
            private Boolean approvedPatchesEnableNonSecurity; 
            private String createdBy; 
            private String createdDate; 
            private String description; 
            private String id; 
            private Boolean isDefault; 
            private String name; 
            private String operationSystem; 
            private java.util.List < String > rejectedPatches; 
            private String rejectedPatchesAction; 
            private String resourceGroupId; 
            private String shareType; 
            private java.util.List < String > sources; 
            private java.util.List < Tags> tags; 
            private String updatedBy; 
            private String updatedDate; 

            /**
             * The rules of scanning and installing patches for the specified operating system.
             */
            public Builder approvalRules(String approvalRules) {
                this.approvalRules = approvalRules;
                return this;
            }

            /**
             * ApprovedPatches.
             */
            public Builder approvedPatches(java.util.List < String > approvedPatches) {
                this.approvedPatches = approvedPatches;
                return this;
            }

            /**
             * ApprovedPatchesEnableNonSecurity.
             */
            public Builder approvedPatchesEnableNonSecurity(Boolean approvedPatchesEnableNonSecurity) {
                this.approvedPatchesEnableNonSecurity = approvedPatchesEnableNonSecurity;
                return this;
            }

            /**
             * The creator of the patch baseline.
             */
            public Builder createdBy(String createdBy) {
                this.createdBy = createdBy;
                return this;
            }

            /**
             * The time when the patch baseline was created.
             */
            public Builder createdDate(String createdDate) {
                this.createdDate = createdDate;
                return this;
            }

            /**
             * The description of the patch baseline.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The ID of the patch baseline.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Indicates whether the patch baseline is set as the default patch baseline.
             */
            public Builder isDefault(Boolean isDefault) {
                this.isDefault = isDefault;
                return this;
            }

            /**
             * The name of the patch baseline.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The type of the operating system.
             */
            public Builder operationSystem(String operationSystem) {
                this.operationSystem = operationSystem;
                return this;
            }

            /**
             * RejectedPatches.
             */
            public Builder rejectedPatches(java.util.List < String > rejectedPatches) {
                this.rejectedPatches = rejectedPatches;
                return this;
            }

            /**
             * RejectedPatchesAction.
             */
            public Builder rejectedPatchesAction(String rejectedPatchesAction) {
                this.rejectedPatchesAction = rejectedPatchesAction;
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
             * The share type of the patch baseline.
             */
            public Builder shareType(String shareType) {
                this.shareType = shareType;
                return this;
            }

            /**
             * Sources.
             */
            public Builder sources(java.util.List < String > sources) {
                this.sources = sources;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * The user who last modified the patch baseline.
             */
            public Builder updatedBy(String updatedBy) {
                this.updatedBy = updatedBy;
                return this;
            }

            /**
             * The time when the patch baseline was last modified.
             */
            public Builder updatedDate(String updatedDate) {
                this.updatedDate = updatedDate;
                return this;
            }

            public PatchBaseline build() {
                return new PatchBaseline(this);
            } 

        } 

    }
}
