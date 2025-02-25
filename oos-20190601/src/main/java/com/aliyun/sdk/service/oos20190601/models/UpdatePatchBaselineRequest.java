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
 * {@link UpdatePatchBaselineRequest} extends {@link RequestModel}
 *
 * <p>UpdatePatchBaselineRequest</p>
 */
public class UpdatePatchBaselineRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApprovalRules")
    private String approvalRules;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApprovedPatches")
    private java.util.List<String> approvedPatches;

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
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RejectedPatches")
    private java.util.List<String> rejectedPatches;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RejectedPatchesAction")
    private String rejectedPatchesAction;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Sources")
    private java.util.List<String> sources;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.List<Tags> tags;

    private UpdatePatchBaselineRequest(Builder builder) {
        super(builder);
        this.approvalRules = builder.approvalRules;
        this.approvedPatches = builder.approvedPatches;
        this.approvedPatchesEnableNonSecurity = builder.approvedPatchesEnableNonSecurity;
        this.clientToken = builder.clientToken;
        this.description = builder.description;
        this.name = builder.name;
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

    public static UpdatePatchBaselineRequest create() {
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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

    public static final class Builder extends Request.Builder<UpdatePatchBaselineRequest, Builder> {
        private String approvalRules; 
        private java.util.List<String> approvedPatches; 
        private Boolean approvedPatchesEnableNonSecurity; 
        private String clientToken; 
        private String description; 
        private String name; 
        private String regionId; 
        private java.util.List<String> rejectedPatches; 
        private String rejectedPatchesAction; 
        private String resourceGroupId; 
        private java.util.List<String> sources; 
        private java.util.List<Tags> tags; 

        private Builder() {
            super();
        } 

        private Builder(UpdatePatchBaselineRequest request) {
            super(request);
            this.approvalRules = request.approvalRules;
            this.approvedPatches = request.approvedPatches;
            this.approvedPatchesEnableNonSecurity = request.approvedPatchesEnableNonSecurity;
            this.clientToken = request.clientToken;
            this.description = request.description;
            this.name = request.name;
            this.regionId = request.regionId;
            this.rejectedPatches = request.rejectedPatches;
            this.rejectedPatchesAction = request.rejectedPatchesAction;
            this.resourceGroupId = request.resourceGroupId;
            this.sources = request.sources;
            this.tags = request.tags;
        } 

        /**
         * <p>The rules of scanning and installing patches for the specified operating system.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;PatchRules&quot;:[{&quot;PatchFilterGroup&quot;:[{&quot;Key&quot;:&quot;PatchSet&quot;,&quot;Values&quot;:[&quot;OS&quot;]},{&quot;Key&quot;:&quot;ProductFamily&quot;,&quot;Values&quot;:[&quot;Windows&quot;]},{&quot;Key&quot;:&quot;Product&quot;,&quot;Values&quot;:[&quot;Windows 10&quot;,&quot;Windows 7&quot;]},{&quot;Key&quot;:&quot;Classification&quot;,&quot;Values&quot;:[&quot;Security Updates&quot;,&quot;Updates&quot;,&quot;Update Rollups&quot;,&quot;Critical Updates&quot;]},{&quot;Key&quot;:&quot;Severity&quot;,&quot;Values&quot;:[&quot;Critical&quot;,&quot;Important&quot;,&quot;Moderate&quot;]}],&quot;ApproveAfterDays&quot;:7,&quot;ApproveUntilDate&quot;:&quot;&quot;,&quot;EnableNonSecurity&quot;:true,&quot;ComplianceLevel&quot;:&quot;Medium&quot;}]}</p>
         */
        public Builder approvalRules(String approvalRules) {
            this.putQueryParameter("ApprovalRules", approvalRules);
            this.approvalRules = approvalRules;
            return this;
        }

        /**
         * <p>The approved patches.</p>
         */
        public Builder approvedPatches(java.util.List<String> approvedPatches) {
            String approvedPatchesShrink = shrink(approvedPatches, "ApprovedPatches", "json");
            this.putQueryParameter("ApprovedPatches", approvedPatchesShrink);
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
            this.putQueryParameter("ApprovedPatchesEnableNonSecurity", approvedPatchesEnableNonSecurity);
            this.approvedPatchesEnableNonSecurity = approvedPatchesEnableNonSecurity;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The description of the patch baseline.</p>
         * 
         * <strong>example:</strong>
         * <p>UpdatePatchBaseline</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The name of the patch baseline.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MyPatchBaseline</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The ID of the region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The rejected patches.</p>
         */
        public Builder rejectedPatches(java.util.List<String> rejectedPatches) {
            String rejectedPatchesShrink = shrink(rejectedPatches, "RejectedPatches", "json");
            this.putQueryParameter("RejectedPatches", rejectedPatchesShrink);
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
            this.putQueryParameter("RejectedPatchesAction", rejectedPatchesAction);
            this.rejectedPatchesAction = rejectedPatchesAction;
            return this;
        }

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmxsn4m4******</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The patch source configurations.</p>
         */
        public Builder sources(java.util.List<String> sources) {
            String sourcesShrink = shrink(sources, "Sources", "json");
            this.putQueryParameter("Sources", sourcesShrink);
            this.sources = sources;
            return this;
        }

        /**
         * <p>The tags.</p>
         */
        public Builder tags(java.util.List<Tags> tags) {
            String tagsShrink = shrink(tags, "Tags", "json");
            this.putQueryParameter("Tags", tagsShrink);
            this.tags = tags;
            return this;
        }

        @Override
        public UpdatePatchBaselineRequest build() {
            return new UpdatePatchBaselineRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdatePatchBaselineRequest} extends {@link TeaModel}
     *
     * <p>UpdatePatchBaselineRequest</p>
     */
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
             * <p>The key of the tag.</p>
             * 
             * <strong>example:</strong>
             * <p>key</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the tag.</p>
             * 
             * <strong>example:</strong>
             * <p>value</p>
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
