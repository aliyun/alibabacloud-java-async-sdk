// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreatePatchBaselineRequest} extends {@link RequestModel}
 *
 * <p>CreatePatchBaselineRequest</p>
 */
public class CreatePatchBaselineRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApprovalRules")
    @com.aliyun.core.annotation.Validation(required = true)
    private String approvalRules;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApprovedPatches")
    private java.util.List < String > approvedPatches;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApprovedPatchesEnableNonSecurity")
    private Boolean approvedPatchesEnableNonSecurity;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OperationSystem")
    @com.aliyun.core.annotation.Validation(required = true)
    private String operationSystem;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RejectedPatches")
    private java.util.List < String > rejectedPatches;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RejectedPatchesAction")
    private String rejectedPatchesAction;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Sources")
    private java.util.List < String > sources;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.List < Tags> tags;

    private CreatePatchBaselineRequest(Builder builder) {
        super(builder);
        this.approvalRules = builder.approvalRules;
        this.approvedPatches = builder.approvedPatches;
        this.approvedPatchesEnableNonSecurity = builder.approvedPatchesEnableNonSecurity;
        this.clientToken = builder.clientToken;
        this.description = builder.description;
        this.name = builder.name;
        this.operationSystem = builder.operationSystem;
        this.regionId = builder.regionId;
        this.rejectedPatches = builder.rejectedPatches;
        this.rejectedPatchesAction = builder.rejectedPatchesAction;
        this.resourceGroupId = builder.resourceGroupId;
        this.sources = builder.sources;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePatchBaselineRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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

    public static final class Builder extends Request.Builder<CreatePatchBaselineRequest, Builder> {
        private String approvalRules; 
        private java.util.List < String > approvedPatches; 
        private Boolean approvedPatchesEnableNonSecurity; 
        private String clientToken; 
        private String description; 
        private String name; 
        private String operationSystem; 
        private String regionId; 
        private java.util.List < String > rejectedPatches; 
        private String rejectedPatchesAction; 
        private String resourceGroupId; 
        private java.util.List < String > sources; 
        private java.util.List < Tags> tags; 

        private Builder() {
            super();
        } 

        private Builder(CreatePatchBaselineRequest request) {
            super(request);
            this.approvalRules = request.approvalRules;
            this.approvedPatches = request.approvedPatches;
            this.approvedPatchesEnableNonSecurity = request.approvedPatchesEnableNonSecurity;
            this.clientToken = request.clientToken;
            this.description = request.description;
            this.name = request.name;
            this.operationSystem = request.operationSystem;
            this.regionId = request.regionId;
            this.rejectedPatches = request.rejectedPatches;
            this.rejectedPatchesAction = request.rejectedPatchesAction;
            this.resourceGroupId = request.resourceGroupId;
            this.sources = request.sources;
            this.tags = request.tags;
        } 

        /**
         * The rules of scanning and installing patches for the specified operating system.
         */
        public Builder approvalRules(String approvalRules) {
            this.putQueryParameter("ApprovalRules", approvalRules);
            this.approvalRules = approvalRules;
            return this;
        }

        /**
         * The approved patches.
         */
        public Builder approvedPatches(java.util.List < String > approvedPatches) {
            String approvedPatchesShrink = shrink(approvedPatches, "ApprovedPatches", "json");
            this.putQueryParameter("ApprovedPatches", approvedPatchesShrink);
            this.approvedPatches = approvedPatches;
            return this;
        }

        /**
         * Specifies whether the approved patch involves updates other than security-related updates.
         */
        public Builder approvedPatchesEnableNonSecurity(Boolean approvedPatchesEnableNonSecurity) {
            this.putQueryParameter("ApprovedPatchesEnableNonSecurity", approvedPatchesEnableNonSecurity);
            this.approvedPatchesEnableNonSecurity = approvedPatchesEnableNonSecurity;
            return this;
        }

        /**
         * The client token that is used to ensure the idempotence of the request.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The description of the patch baseline.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The name of the patch baseline.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The type of the operating system. Valid values:
         * <p>
         * 
         * *   Windows
         * *   Ubuntu
         * *   CentOS
         * *   Debian
         * *   AliyunLinux
         * *   RedhatEnterpriseLinux
         * *   Anolis
         * *   AlmaLinux
         */
        public Builder operationSystem(String operationSystem) {
            this.putQueryParameter("OperationSystem", operationSystem);
            this.operationSystem = operationSystem;
            return this;
        }

        /**
         * The ID of the region in which you want to create a patch baseline.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The rejected patches.
         */
        public Builder rejectedPatches(java.util.List < String > rejectedPatches) {
            String rejectedPatchesShrink = shrink(rejectedPatches, "RejectedPatches", "json");
            this.putQueryParameter("RejectedPatches", rejectedPatchesShrink);
            this.rejectedPatches = rejectedPatches;
            return this;
        }

        /**
         * The action of the rejected patch.
         */
        public Builder rejectedPatchesAction(String rejectedPatchesAction) {
            this.putQueryParameter("RejectedPatchesAction", rejectedPatchesAction);
            this.rejectedPatchesAction = rejectedPatchesAction;
            return this;
        }

        /**
         * The ID of the resource group.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * The patch source configurations.
         */
        public Builder sources(java.util.List < String > sources) {
            String sourcesShrink = shrink(sources, "Sources", "json");
            this.putQueryParameter("Sources", sourcesShrink);
            this.sources = sources;
            return this;
        }

        /**
         * The tags.
         */
        public Builder tags(java.util.List < Tags> tags) {
            String tagsShrink = shrink(tags, "Tags", "json");
            this.putQueryParameter("Tags", tagsShrink);
            this.tags = tags;
            return this;
        }

        @Override
        public CreatePatchBaselineRequest build() {
            return new CreatePatchBaselineRequest(this);
        } 

    } 

    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * The key of the tag.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of the tag.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
}
