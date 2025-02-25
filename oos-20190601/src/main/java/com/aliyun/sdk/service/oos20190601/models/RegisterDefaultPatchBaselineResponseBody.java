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
 * {@link RegisterDefaultPatchBaselineResponseBody} extends {@link TeaModel}
 *
 * <p>RegisterDefaultPatchBaselineResponseBody</p>
 */
public class RegisterDefaultPatchBaselineResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PatchBaseline")
    private PatchBaseline patchBaseline;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The details of the patch baseline.</p>
         */
        public Builder patchBaseline(PatchBaseline patchBaseline) {
            this.patchBaseline = patchBaseline;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D6850689-348D-59FC-AE13-BB0EDB7C4BE8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public RegisterDefaultPatchBaselineResponseBody build() {
            return new RegisterDefaultPatchBaselineResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link RegisterDefaultPatchBaselineResponseBody} extends {@link TeaModel}
     *
     * <p>RegisterDefaultPatchBaselineResponseBody</p>
     */
    public static class PatchBaseline extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApprovalRules")
        private String approvalRules;

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

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("ShareType")
        private String shareType;

        @com.aliyun.core.annotation.NameInMap("UpdatedBy")
        private String updatedBy;

        @com.aliyun.core.annotation.NameInMap("UpdatedDate")
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
             * <p>RegisterPatchBaseline</p>
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
             * <p>The ID of the resource group.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-acfm4dpaq2yox6q</p>
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
             * <p>The time when the patch baseline was last updated.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-09-07T03:42:56Z</p>
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
