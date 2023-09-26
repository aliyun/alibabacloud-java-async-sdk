// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RegisterDefaultPatchBaselineResponseBody} extends {@link TeaModel}
 *
 * <p>RegisterDefaultPatchBaselineResponseBody</p>
 */
public class RegisterDefaultPatchBaselineResponseBody extends TeaModel {
    @NameInMap("PatchBaseline")
    private PatchBaseline patchBaseline;

    @NameInMap("RequestId")
    private String requestId;

    private RegisterDefaultPatchBaselineResponseBody(Builder builder) {
        this.patchBaseline = builder.patchBaseline;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RegisterDefaultPatchBaselineResponseBody create() {
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
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public RegisterDefaultPatchBaselineResponseBody build() {
            return new RegisterDefaultPatchBaselineResponseBody(this);
        } 

    } 

    public static class PatchBaseline extends TeaModel {
        @NameInMap("ApprovalRules")
        private String approvalRules;

        @NameInMap("CreatedBy")
        private String createdBy;

        @NameInMap("CreatedDate")
        private String createdDate;

        @NameInMap("Description")
        private String description;

        @NameInMap("Id")
        private String id;

        @NameInMap("Name")
        private String name;

        @NameInMap("OperationSystem")
        private String operationSystem;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("ShareType")
        private String shareType;

        @NameInMap("UpdatedBy")
        private String updatedBy;

        @NameInMap("UpdatedDate")
        private String updatedDate;

        private PatchBaseline(Builder builder) {
            this.approvalRules = builder.approvalRules;
            this.createdBy = builder.createdBy;
            this.createdDate = builder.createdDate;
            this.description = builder.description;
            this.id = builder.id;
            this.name = builder.name;
            this.operationSystem = builder.operationSystem;
            this.resourceGroupId = builder.resourceGroupId;
            this.shareType = builder.shareType;
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
            private String createdBy; 
            private String createdDate; 
            private String description; 
            private String id; 
            private String name; 
            private String operationSystem; 
            private String resourceGroupId; 
            private String shareType; 
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
             * The user who created the patch baseline.
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
             * The name of the patch baseline.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The operating system.
             */
            public Builder operationSystem(String operationSystem) {
                this.operationSystem = operationSystem;
                return this;
            }

            /**
             * The ID of the resource group.
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
             * The user who last updated the patch baseline.
             */
            public Builder updatedBy(String updatedBy) {
                this.updatedBy = updatedBy;
                return this;
            }

            /**
             * The time when the patch baseline was last updated.
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
