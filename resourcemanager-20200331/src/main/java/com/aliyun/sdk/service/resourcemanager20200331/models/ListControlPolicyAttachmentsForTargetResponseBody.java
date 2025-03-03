// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

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
 * {@link ListControlPolicyAttachmentsForTargetResponseBody} extends {@link TeaModel}
 *
 * <p>ListControlPolicyAttachmentsForTargetResponseBody</p>
 */
public class ListControlPolicyAttachmentsForTargetResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ControlPolicyAttachments")
    private ControlPolicyAttachments controlPolicyAttachments;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The attached access control policies.</p>
         */
        public Builder controlPolicyAttachments(ControlPolicyAttachments controlPolicyAttachments) {
            this.controlPolicyAttachments = controlPolicyAttachments;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>C276B600-7B7A-49E8-938C-E16CFA955A82</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListControlPolicyAttachmentsForTargetResponseBody build() {
            return new ListControlPolicyAttachmentsForTargetResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListControlPolicyAttachmentsForTargetResponseBody} extends {@link TeaModel}
     *
     * <p>ListControlPolicyAttachmentsForTargetResponseBody</p>
     */
    public static class ControlPolicyAttachment extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AttachDate")
        private String attachDate;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EffectScope")
        private String effectScope;

        @com.aliyun.core.annotation.NameInMap("PolicyId")
        private String policyId;

        @com.aliyun.core.annotation.NameInMap("PolicyName")
        private String policyName;

        @com.aliyun.core.annotation.NameInMap("PolicyType")
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
             * <p>The time when the access control policy was attached.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-03-19T02:56:24Z</p>
             */
            public Builder attachDate(String attachDate) {
                this.attachDate = attachDate;
                return this;
            }

            /**
             * <p>The description of the access control policy.</p>
             * 
             * <strong>example:</strong>
             * <p>ExampleControlPolicy</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The effective scope of the access control policy. Valid values:</p>
             * <ul>
             * <li>All: The access control policy is in effect for Alibaba Cloud accounts, RAM users, and RAM roles.</li>
             * <li>RAM: The access control policy is in effect only for RAM users and RAM roles.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>RAM</p>
             */
            public Builder effectScope(String effectScope) {
                this.effectScope = effectScope;
                return this;
            }

            /**
             * <p>The ID of the access control policy.</p>
             * 
             * <strong>example:</strong>
             * <p>cp-jExXAqIYkwHN****</p>
             */
            public Builder policyId(String policyId) {
                this.policyId = policyId;
                return this;
            }

            /**
             * <p>The name of the access control policy.</p>
             * 
             * <strong>example:</strong>
             * <p>ExampleControlPolicy</p>
             */
            public Builder policyName(String policyName) {
                this.policyName = policyName;
                return this;
            }

            /**
             * <p>The type of the access control policy. Valid values:</p>
             * <ul>
             * <li>System: system access control policy</li>
             * <li>Custom: custom access control policy</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Custom</p>
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
    /**
     * 
     * {@link ListControlPolicyAttachmentsForTargetResponseBody} extends {@link TeaModel}
     *
     * <p>ListControlPolicyAttachmentsForTargetResponseBody</p>
     */
    public static class ControlPolicyAttachments extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ControlPolicyAttachment")
        private java.util.List<ControlPolicyAttachment> controlPolicyAttachment;

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
        public java.util.List<ControlPolicyAttachment> getControlPolicyAttachment() {
            return this.controlPolicyAttachment;
        }

        public static final class Builder {
            private java.util.List<ControlPolicyAttachment> controlPolicyAttachment; 

            /**
             * ControlPolicyAttachment.
             */
            public Builder controlPolicyAttachment(java.util.List<ControlPolicyAttachment> controlPolicyAttachment) {
                this.controlPolicyAttachment = controlPolicyAttachment;
                return this;
            }

            public ControlPolicyAttachments build() {
                return new ControlPolicyAttachments(this);
            } 

        } 

    }
}
