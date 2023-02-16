// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcedirectorymaster20220419.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListControlPolicyAttachmentsForTargetResponseBody} extends {@link TeaModel}
 *
 * <p>ListControlPolicyAttachmentsForTargetResponseBody</p>
 */
public class ListControlPolicyAttachmentsForTargetResponseBody extends TeaModel {
    @NameInMap("ControlPolicyAttachments")
    private ControlPolicyAttachments controlPolicyAttachments;

    @NameInMap("RequestId")
    private String requestId;

    private ListControlPolicyAttachmentsForTargetResponseBody(Builder builder) {
        this.controlPolicyAttachments = builder.controlPolicyAttachments;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListControlPolicyAttachmentsForTargetResponseBody create() {
        return builder().build();
    }

    /**
     * @return controlPolicyAttachments
     */
    public ControlPolicyAttachments getControlPolicyAttachments() {
        return this.controlPolicyAttachments;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ControlPolicyAttachments controlPolicyAttachments; 
        private String requestId; 

        /**
         * ControlPolicyAttachments.
         */
        public Builder controlPolicyAttachments(ControlPolicyAttachments controlPolicyAttachments) {
            this.controlPolicyAttachments = controlPolicyAttachments;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListControlPolicyAttachmentsForTargetResponseBody build() {
            return new ListControlPolicyAttachmentsForTargetResponseBody(this);
        } 

    } 

    public static class ControlPolicyAttachment extends TeaModel {
        @NameInMap("AttachDate")
        private String attachDate;

        @NameInMap("Description")
        private String description;

        @NameInMap("EffectScope")
        private String effectScope;

        @NameInMap("PolicyId")
        private String policyId;

        @NameInMap("PolicyName")
        private String policyName;

        @NameInMap("PolicyType")
        private String policyType;

        private ControlPolicyAttachment(Builder builder) {
            this.attachDate = builder.attachDate;
            this.description = builder.description;
            this.effectScope = builder.effectScope;
            this.policyId = builder.policyId;
            this.policyName = builder.policyName;
            this.policyType = builder.policyType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ControlPolicyAttachment create() {
            return builder().build();
        }

        /**
         * @return attachDate
         */
        public String getAttachDate() {
            return this.attachDate;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return effectScope
         */
        public String getEffectScope() {
            return this.effectScope;
        }

        /**
         * @return policyId
         */
        public String getPolicyId() {
            return this.policyId;
        }

        /**
         * @return policyName
         */
        public String getPolicyName() {
            return this.policyName;
        }

        /**
         * @return policyType
         */
        public String getPolicyType() {
            return this.policyType;
        }

        public static final class Builder {
            private String attachDate; 
            private String description; 
            private String effectScope; 
            private String policyId; 
            private String policyName; 
            private String policyType; 

            /**
             * AttachDate.
             */
            public Builder attachDate(String attachDate) {
                this.attachDate = attachDate;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * EffectScope.
             */
            public Builder effectScope(String effectScope) {
                this.effectScope = effectScope;
                return this;
            }

            /**
             * PolicyId.
             */
            public Builder policyId(String policyId) {
                this.policyId = policyId;
                return this;
            }

            /**
             * PolicyName.
             */
            public Builder policyName(String policyName) {
                this.policyName = policyName;
                return this;
            }

            /**
             * PolicyType.
             */
            public Builder policyType(String policyType) {
                this.policyType = policyType;
                return this;
            }

            public ControlPolicyAttachment build() {
                return new ControlPolicyAttachment(this);
            } 

        } 

    }
    public static class ControlPolicyAttachments extends TeaModel {
        @NameInMap("ControlPolicyAttachment")
        private java.util.List < ControlPolicyAttachment> controlPolicyAttachment;

        private ControlPolicyAttachments(Builder builder) {
            this.controlPolicyAttachment = builder.controlPolicyAttachment;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ControlPolicyAttachments create() {
            return builder().build();
        }

        /**
         * @return controlPolicyAttachment
         */
        public java.util.List < ControlPolicyAttachment> getControlPolicyAttachment() {
            return this.controlPolicyAttachment;
        }

        public static final class Builder {
            private java.util.List < ControlPolicyAttachment> controlPolicyAttachment; 

            /**
             * ControlPolicyAttachment.
             */
            public Builder controlPolicyAttachment(java.util.List < ControlPolicyAttachment> controlPolicyAttachment) {
                this.controlPolicyAttachment = controlPolicyAttachment;
                return this;
            }

            public ControlPolicyAttachments build() {
                return new ControlPolicyAttachments(this);
            } 

        } 

    }
}
