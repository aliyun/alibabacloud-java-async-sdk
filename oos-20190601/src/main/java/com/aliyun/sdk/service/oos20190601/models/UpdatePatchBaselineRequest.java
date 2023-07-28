// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdatePatchBaselineRequest} extends {@link RequestModel}
 *
 * <p>UpdatePatchBaselineRequest</p>
 */
public class UpdatePatchBaselineRequest extends Request {
    @Query
    @NameInMap("ApprovalRules")
    private String approvalRules;

    @Query
    @NameInMap("ApprovedPatches")
    private java.util.List < String > approvedPatches;

    @Query
    @NameInMap("ApprovedPatchesEnableNonSecurity")
    private Boolean approvedPatchesEnableNonSecurity;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("RejectedPatches")
    private java.util.List < String > rejectedPatches;

    @Query
    @NameInMap("RejectedPatchesAction")
    private String rejectedPatchesAction;

    @Query
    @NameInMap("Sources")
    private java.util.List < String > sources;

    @Query
    @NameInMap("Tags")
    private java.util.List < Tags> tags;

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

    public static final class Builder extends Request.Builder<UpdatePatchBaselineRequest, Builder> {
        private String approvalRules; 
        private java.util.List < String > approvedPatches; 
        private Boolean approvedPatchesEnableNonSecurity; 
        private String clientToken; 
        private String description; 
        private String name; 
        private String regionId; 
        private java.util.List < String > rejectedPatches; 
        private String rejectedPatchesAction; 
        private java.util.List < String > sources; 
        private java.util.List < Tags> tags; 

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
         * ApprovedPatches.
         */
        public Builder approvedPatches(java.util.List < String > approvedPatches) {
            String approvedPatchesShrink = shrink(approvedPatches, "ApprovedPatches", "json");
            this.putQueryParameter("ApprovedPatches", approvedPatchesShrink);
            this.approvedPatches = approvedPatches;
            return this;
        }

        /**
         * ApprovedPatchesEnableNonSecurity.
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
         * The ID of the region.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * RejectedPatches.
         */
        public Builder rejectedPatches(java.util.List < String > rejectedPatches) {
            String rejectedPatchesShrink = shrink(rejectedPatches, "RejectedPatches", "json");
            this.putQueryParameter("RejectedPatches", rejectedPatchesShrink);
            this.rejectedPatches = rejectedPatches;
            return this;
        }

        /**
         * RejectedPatchesAction.
         */
        public Builder rejectedPatchesAction(String rejectedPatchesAction) {
            this.putQueryParameter("RejectedPatchesAction", rejectedPatchesAction);
            this.rejectedPatchesAction = rejectedPatchesAction;
            return this;
        }

        /**
         * Sources.
         */
        public Builder sources(java.util.List < String > sources) {
            String sourcesShrink = shrink(sources, "Sources", "json");
            this.putQueryParameter("Sources", sourcesShrink);
            this.sources = sources;
            return this;
        }

        /**
         * Tags.
         */
        public Builder tags(java.util.List < Tags> tags) {
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

    public static class Tags extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
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
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
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
