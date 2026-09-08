// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link Attachment} extends {@link TeaModel}
 *
 * <p>Attachment</p>
 */
public class Attachment extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("attachResourceId")
    private String attachResourceId;

    @com.aliyun.core.annotation.NameInMap("attachResourceIds")
    private java.util.List<String> attachResourceIds;

    @com.aliyun.core.annotation.NameInMap("attachResourceParentIds")
    private java.util.List<String> attachResourceParentIds;

    @com.aliyun.core.annotation.NameInMap("attachResourceType")
    private String attachResourceType;

    @com.aliyun.core.annotation.NameInMap("environmentId")
    private String environmentId;

    @com.aliyun.core.annotation.NameInMap("gatewayId")
    private String gatewayId;

    @com.aliyun.core.annotation.NameInMap("policyAttachmentId")
    private String policyAttachmentId;

    private Attachment(Builder builder) {
        this.attachResourceId = builder.attachResourceId;
        this.attachResourceIds = builder.attachResourceIds;
        this.attachResourceParentIds = builder.attachResourceParentIds;
        this.attachResourceType = builder.attachResourceType;
        this.environmentId = builder.environmentId;
        this.gatewayId = builder.gatewayId;
        this.policyAttachmentId = builder.policyAttachmentId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Attachment create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return attachResourceId
     */
    public String getAttachResourceId() {
        return this.attachResourceId;
    }

    /**
     * @return attachResourceIds
     */
    public java.util.List<String> getAttachResourceIds() {
        return this.attachResourceIds;
    }

    /**
     * @return attachResourceParentIds
     */
    public java.util.List<String> getAttachResourceParentIds() {
        return this.attachResourceParentIds;
    }

    /**
     * @return attachResourceType
     */
    public String getAttachResourceType() {
        return this.attachResourceType;
    }

    /**
     * @return environmentId
     */
    public String getEnvironmentId() {
        return this.environmentId;
    }

    /**
     * @return gatewayId
     */
    public String getGatewayId() {
        return this.gatewayId;
    }

    /**
     * @return policyAttachmentId
     */
    public String getPolicyAttachmentId() {
        return this.policyAttachmentId;
    }

    public static final class Builder {
        private String attachResourceId; 
        private java.util.List<String> attachResourceIds; 
        private java.util.List<String> attachResourceParentIds; 
        private String attachResourceType; 
        private String environmentId; 
        private String gatewayId; 
        private String policyAttachmentId; 

        private Builder() {
        } 

        private Builder(Attachment model) {
            this.attachResourceId = model.attachResourceId;
            this.attachResourceIds = model.attachResourceIds;
            this.attachResourceParentIds = model.attachResourceParentIds;
            this.attachResourceType = model.attachResourceType;
            this.environmentId = model.environmentId;
            this.gatewayId = model.gatewayId;
            this.policyAttachmentId = model.policyAttachmentId;
        } 

        /**
         * <p>attachResourceId</p>
         * 
         * <strong>example:</strong>
         * <p>gw-xxx</p>
         */
        public Builder attachResourceId(String attachResourceId) {
            this.attachResourceId = attachResourceId;
            return this;
        }

        /**
         * <p>The list of mounted resource IDs.</p>
         */
        public Builder attachResourceIds(java.util.List<String> attachResourceIds) {
            this.attachResourceIds = attachResourceIds;
            return this;
        }

        /**
         * <p>The list of parent IDs of the mounted resource.</p>
         */
        public Builder attachResourceParentIds(java.util.List<String> attachResourceParentIds) {
            this.attachResourceParentIds = attachResourceParentIds;
            return this;
        }

        /**
         * <p>The type of mount point supported by the policy. Valid values:</p>
         * <ul>
         * <li>HttpApi: HttpApi.</li>
         * <li>Operation: Operation of HttpApi.</li>
         * <li>GatewayRoute: gateway route.</li>
         * <li>GatewayService: gateway service.</li>
         * <li>GatewayServicePort: gateway service port.</li>
         * <li>Domain: gateway domain name.</li>
         * <li>Gateway: gateway.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>HttpApi</p>
         */
        public Builder attachResourceType(String attachResourceType) {
            this.attachResourceType = attachResourceType;
            return this;
        }

        /**
         * <p>The environment to which the mounted resource belongs. If the environment ID is *, the mounted resource of the policy is not associated with any environment.</p>
         * 
         * <strong>example:</strong>
         * <p>env-cq7l5s5lhtgi6qasrdc0</p>
         */
        public Builder environmentId(String environmentId) {
            this.environmentId = environmentId;
            return this;
        }

        /**
         * <p>The gateway to which the mounted resource belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-cpr4f9dlhtgq5ksfgmb0</p>
         */
        public Builder gatewayId(String gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * <p>The policy mount ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pr-cq7l5s5lhtgi6qasrdc0</p>
         */
        public Builder policyAttachmentId(String policyAttachmentId) {
            this.policyAttachmentId = policyAttachmentId;
            return this;
        }

        public Attachment build() {
            return new Attachment(this);
        } 

    } 

}
