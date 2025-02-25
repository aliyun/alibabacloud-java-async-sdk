// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcedirectorymaster20220419.models;

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
 * {@link GetControlPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>GetControlPolicyResponseBody</p>
 */
public class GetControlPolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ControlPolicy")
    private ControlPolicy controlPolicy;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetControlPolicyResponseBody(Builder builder) {
        this.controlPolicy = builder.controlPolicy;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetControlPolicyResponseBody create() {
        return builder().build();
    }

    /**
     * @return controlPolicy
     */
    public ControlPolicy getControlPolicy() {
        return this.controlPolicy;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ControlPolicy controlPolicy; 
        private String requestId; 

        /**
         * <p>The details of the access control policy.</p>
         */
        public Builder controlPolicy(ControlPolicy controlPolicy) {
            this.controlPolicy = controlPolicy;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>AB769936-CDFA-4D52-8CE2-A3581800044A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetControlPolicyResponseBody build() {
            return new GetControlPolicyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetControlPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>GetControlPolicyResponseBody</p>
     */
    public static class ControlPolicy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AttachmentCount")
        private String attachmentCount;

        @com.aliyun.core.annotation.NameInMap("CreateDate")
        private String createDate;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EffectScope")
        private String effectScope;

        @com.aliyun.core.annotation.NameInMap("PolicyDocument")
        private String policyDocument;

        @com.aliyun.core.annotation.NameInMap("PolicyId")
        private String policyId;

        @com.aliyun.core.annotation.NameInMap("PolicyName")
        private String policyName;

        @com.aliyun.core.annotation.NameInMap("PolicyType")
        private String policyType;

        @com.aliyun.core.annotation.NameInMap("UpdateDate")
        private String updateDate;

        private ControlPolicy(Builder builder) {
            this.attachmentCount = builder.attachmentCount;
            this.createDate = builder.createDate;
            this.description = builder.description;
            this.effectScope = builder.effectScope;
            this.policyDocument = builder.policyDocument;
            this.policyId = builder.policyId;
            this.policyName = builder.policyName;
            this.policyType = builder.policyType;
            this.updateDate = builder.updateDate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ControlPolicy create() {
            return builder().build();
        }

        /**
         * @return attachmentCount
         */
        public String getAttachmentCount() {
            return this.attachmentCount;
        }

        /**
         * @return createDate
         */
        public String getCreateDate() {
            return this.createDate;
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
         * @return policyDocument
         */
        public String getPolicyDocument() {
            return this.policyDocument;
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

        /**
         * @return updateDate
         */
        public String getUpdateDate() {
            return this.updateDate;
        }

        public static final class Builder {
            private String attachmentCount; 
            private String createDate; 
            private String description; 
            private String effectScope; 
            private String policyDocument; 
            private String policyId; 
            private String policyName; 
            private String policyType; 
            private String updateDate; 

            /**
             * <p>The number of times that the access control policy is referenced.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder attachmentCount(String attachmentCount) {
                this.attachmentCount = attachmentCount;
                return this;
            }

            /**
             * <p>The time when the access control policy was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-03-18T08:51:33Z</p>
             */
            public Builder createDate(String createDate) {
                this.createDate = createDate;
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
             * <p>The document of the access control policy.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;Version&quot;:&quot;1&quot;,&quot;Statement&quot;:[{&quot;Effect&quot;:&quot;Deny&quot;,&quot;Action&quot;:[&quot;ram:UpdateRole&quot;,&quot;ram:DeleteRole&quot;,&quot;ram:AttachPolicyToRole&quot;,&quot;ram:DetachPolicyFromRole&quot;],&quot;Resource&quot;:&quot;acs:ram:<em>:</em>:role/ResourceDirectoryAccountAccessRole&quot;}]}</p>
             */
            public Builder policyDocument(String policyDocument) {
                this.policyDocument = policyDocument;
                return this;
            }

            /**
             * <p>The ID of the access control policy.</p>
             * 
             * <strong>example:</strong>
             * <p>cp-SImPt8GCEwiq****</p>
             */
            public Builder policyId(String policyId) {
                this.policyId = policyId;
                return this;
            }

            /**
             * <p>The name of the access control policy.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
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

            /**
             * <p>The time when the access control policy was updated.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-03-18T08:51:33Z</p>
             */
            public Builder updateDate(String updateDate) {
                this.updateDate = updateDate;
                return this;
            }

            public ControlPolicy build() {
                return new ControlPolicy(this);
            } 

        } 

    }
}
