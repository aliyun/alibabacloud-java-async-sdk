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
 * {@link UpdatePatchBaselineResponseBody} extends {@link TeaModel}
 *
 * <p>UpdatePatchBaselineResponseBody</p>
 */
public class UpdatePatchBaselineResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PatchBaseline")
    private PatchBaseline patchBaseline;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private UpdatePatchBaselineResponseBody(Builder builder) {
        this.patchBaseline = builder.patchBaseline;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdatePatchBaselineResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(UpdatePatchBaselineResponseBody model) {
            this.patchBaseline = model.patchBaseline;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The details of the patch baseline.</p>
         */
        public Builder patchBaseline(PatchBaseline patchBaseline) {
            this.patchBaseline = patchBaseline;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>1457F46C-7AAE-59FA-BD12-0BDB3751E6F8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdatePatchBaselineResponseBody build() {
            return new UpdatePatchBaselineResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UpdatePatchBaselineResponseBody} extends {@link TeaModel}
     *
     * <p>UpdatePatchBaselineResponseBody</p>
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

            private Builder() {
            } 

            private Builder(Tags model) {
                this.tagKey = model.tagKey;
                this.tagValue = model.tagValue;
            } 

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
     * {@link UpdatePatchBaselineResponseBody} extends {@link TeaModel}
     *
     * <p>UpdatePatchBaselineResponseBody</p>
     */
    public static class PatchBaseline extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApprovalRules")
        private String approvalRules;

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

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("OperationSystem")
        private String operationSystem;

        @com.aliyun.core.annotation.NameInMap("RejectedPatches")
        private java.util.List<String> rejectedPatches;

        @com.aliyun.core.annotation.NameInMap("RejectedPatchesAction")
        private String rejectedPatchesAction;

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

        private PatchBaseline(Builder builder) {
            this.approvalRules = builder.approvalRules;
            this.approvedPatches = builder.approvedPatches;
            this.approvedPatchesEnableNonSecurity = builder.approvedPatchesEnableNonSecurity;
            this.createdBy = builder.createdBy;
            this.createdDate = builder.createdDate;
            this.description = builder.description;
            this.id = builder.id;
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
        public java.util.List<String> getRejectedPatches() {
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
            private String approvalRules; 
            private java.util.List<String> approvedPatches; 
            private Boolean approvedPatchesEnableNonSecurity; 
            private String createdBy; 
            private String createdDate; 
            private String description; 
            private String id; 
            private String name; 
            private String operationSystem; 
            private java.util.List<String> rejectedPatches; 
            private String rejectedPatchesAction; 
            private String resourceGroupId; 
            private String shareType; 
            private java.util.List<String> sources; 
            private java.util.List<Tags> tags; 
            private String updatedBy; 
            private String updatedDate; 

            private Builder() {
            } 

            private Builder(PatchBaseline model) {
                this.approvalRules = model.approvalRules;
                this.approvedPatches = model.approvedPatches;
                this.approvedPatchesEnableNonSecurity = model.approvedPatchesEnableNonSecurity;
                this.createdBy = model.createdBy;
                this.createdDate = model.createdDate;
                this.description = model.description;
                this.id = model.id;
                this.name = model.name;
                this.operationSystem = model.operationSystem;
                this.rejectedPatches = model.rejectedPatches;
                this.rejectedPatchesAction = model.rejectedPatchesAction;
                this.resourceGroupId = model.resourceGroupId;
                this.shareType = model.shareType;
                this.sources = model.sources;
                this.tags = model.tags;
                this.updatedBy = model.updatedBy;
                this.updatedDate = model.updatedDate;
            } 

            /**
             * <p>The rules of scanning and installing patches for the specified operating system.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;PatchRules&quot;:[{&quot;PatchFilterGroup&quot;:[{&quot;Key&quot;:&quot;PatchSet&quot;,&quot;Values&quot;:[&quot;OS&quot;]},{&quot;Key&quot;:&quot;ProductFamily&quot;,&quot;Values&quot;:[&quot;Windows&quot;]},{&quot;Key&quot;:&quot;Product&quot;,&quot;Values&quot;:[&quot;Windows 10&quot;,&quot;Windows 7&quot;]},{&quot;Key&quot;:&quot;Classification&quot;,&quot;Values&quot;:[&quot;Security Updates&quot;,&quot;Updates&quot;,&quot;Update Rollups&quot;,&quot;Critical Updates&quot;]},{&quot;Key&quot;:&quot;Severity&quot;,&quot;Values&quot;:[&quot;Critical&quot;,&quot;Important&quot;,&quot;Moderate&quot;]}],&quot;ApproveAfterDays&quot;:7,&quot;ApproveUntilDate&quot;:&quot;&quot;,&quot;EnableNonSecurity&quot;:true,&quot;ComplianceLevel&quot;:&quot;Medium&quot;}]}</p>
             */
            public Builder approvalRules(String approvalRules) {
                this.approvalRules = approvalRules;
                return this;
            }

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
             * <p>The creator of the patch baseline.</p>
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
             * <p>2021-09-07T03:42:56Z</p>
             */
            public Builder createdDate(String createdDate) {
                this.createdDate = createdDate;
                return this;
            }

            /**
             * <p>The description of the patch baseline.</p>
             * 
             * <strong>example:</strong>
             * <p>UpdatePatchBaseline</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The ID of the patch baseline.</p>
             * 
             * <strong>example:</strong>
             * <p>pb-445340b5c6504a85a300</p>
             */
            public Builder id(String id) {
                this.id = id;
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
             * <p>The operating system.</p>
             * 
             * <strong>example:</strong>
             * <p>Windows</p>
             */
            public Builder operationSystem(String operationSystem) {
                this.operationSystem = operationSystem;
                return this;
            }

            /**
             * <p>The rejected patches.</p>
             */
            public Builder rejectedPatches(java.util.List<String> rejectedPatches) {
                this.rejectedPatches = rejectedPatches;
                return this;
            }

            /**
             * <p>The action of the rejected patch.</p>
             * 
             * <strong>example:</strong>
             * <p>ALLOW_AS_DEPENDENCY</p>
             */
            public Builder rejectedPatchesAction(String rejectedPatchesAction) {
                this.rejectedPatchesAction = rejectedPatchesAction;
                return this;
            }

            /**
             * <p>The ID of the resource group.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-acfmy2zdbbjplii</p>
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
             * <p>The patch source configurations.</p>
             */
            public Builder sources(java.util.List<String> sources) {
                this.sources = sources;
                return this;
            }

            /**
             * <p>The tags.</p>
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The user who updated the patch baseline.</p>
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
             * <p>2021-09-08T07:26:37Z</p>
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
