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
 * {@link CreatePatchBaselineResponseBody} extends {@link TeaModel}
 *
 * <p>CreatePatchBaselineResponseBody</p>
 */
public class CreatePatchBaselineResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PatchBaseline")
    private PatchBaseline patchBaseline;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreatePatchBaselineResponseBody(Builder builder) {
        this.patchBaseline = builder.patchBaseline;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePatchBaselineResponseBody create() {
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
         * <p>A5173FF6-D10D-5E8C-8F71-943C2A3E25C0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreatePatchBaselineResponseBody build() {
            return new CreatePatchBaselineResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreatePatchBaselineResponseBody} extends {@link TeaModel}
     *
     * <p>CreatePatchBaselineResponseBody</p>
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
     * {@link CreatePatchBaselineResponseBody} extends {@link TeaModel}
     *
     * <p>CreatePatchBaselineResponseBody</p>
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
             * <p>2021-09-08T06:25:41Z</p>
             */
            public Builder createdDate(String createdDate) {
                this.createdDate = createdDate;
                return this;
            }

            /**
             * <p>The description of the patch baseline.</p>
             * 
             * <strong>example:</strong>
             * <p>PatchBaseline</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The ID of the patch baseline.</p>
             * 
             * <strong>example:</strong>
             * <p>pb-0a0aeda72ed147eb97ea</p>
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
             * <p>The type of the operating system.</p>
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
             * <p>&quot;ALLOW_AS_DEPENDENCY&quot;</p>
             */
            public Builder rejectedPatchesAction(String rejectedPatchesAction) {
                this.rejectedPatchesAction = rejectedPatchesAction;
                return this;
            }

            /**
             * <p>The ID of the resource group.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-acfm3comlufxpva</p>
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
             * <p>The Alibaba Cloud account that last modified the information about the patch baseline.</p>
             * 
             * <strong>example:</strong>
             * <p>root(130900000)</p>
             */
            public Builder updatedBy(String updatedBy) {
                this.updatedBy = updatedBy;
                return this;
            }

            /**
             * <p>The time when the information about the patch baseline was last modified.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-09-08T06:25:41Z</p>
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
