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
         * attachResourceId.
         */
        public Builder attachResourceId(String attachResourceId) {
            this.attachResourceId = attachResourceId;
            return this;
        }

        /**
         * attachResourceIds.
         */
        public Builder attachResourceIds(java.util.List<String> attachResourceIds) {
            this.attachResourceIds = attachResourceIds;
            return this;
        }

        /**
         * attachResourceParentIds.
         */
        public Builder attachResourceParentIds(java.util.List<String> attachResourceParentIds) {
            this.attachResourceParentIds = attachResourceParentIds;
            return this;
        }

        /**
         * attachResourceType.
         */
        public Builder attachResourceType(String attachResourceType) {
            this.attachResourceType = attachResourceType;
            return this;
        }

        /**
         * environmentId.
         */
        public Builder environmentId(String environmentId) {
            this.environmentId = environmentId;
            return this;
        }

        /**
         * gatewayId.
         */
        public Builder gatewayId(String gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * policyAttachmentId.
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
