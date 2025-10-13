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
 * {@link ListPoliciesRequest} extends {@link RequestModel}
 *
 * <p>ListPoliciesRequest</p>
 */
public class ListPoliciesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("attachResourceId")
    private String attachResourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("attachResourceType")
    private String attachResourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("environmentId")
    private String environmentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("gatewayId")
    private String gatewayId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("withAttachments")
    private Boolean withAttachments;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("withSystemPolicy")
    private Boolean withSystemPolicy;

    private ListPoliciesRequest(Builder builder) {
        super(builder);
        this.attachResourceId = builder.attachResourceId;
        this.attachResourceType = builder.attachResourceType;
        this.environmentId = builder.environmentId;
        this.gatewayId = builder.gatewayId;
        this.withAttachments = builder.withAttachments;
        this.withSystemPolicy = builder.withSystemPolicy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPoliciesRequest create() {
        return builder().build();
    }

@Override
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
     * @return withAttachments
     */
    public Boolean getWithAttachments() {
        return this.withAttachments;
    }

    /**
     * @return withSystemPolicy
     */
    public Boolean getWithSystemPolicy() {
        return this.withSystemPolicy;
    }

    public static final class Builder extends Request.Builder<ListPoliciesRequest, Builder> {
        private String attachResourceId; 
        private String attachResourceType; 
        private String environmentId; 
        private String gatewayId; 
        private Boolean withAttachments; 
        private Boolean withSystemPolicy; 

        private Builder() {
            super();
        } 

        private Builder(ListPoliciesRequest request) {
            super(request);
            this.attachResourceId = request.attachResourceId;
            this.attachResourceType = request.attachResourceType;
            this.environmentId = request.environmentId;
            this.gatewayId = request.gatewayId;
            this.withAttachments = request.withAttachments;
            this.withSystemPolicy = request.withSystemPolicy;
        } 

        /**
         * attachResourceId.
         */
        public Builder attachResourceId(String attachResourceId) {
            this.putQueryParameter("attachResourceId", attachResourceId);
            this.attachResourceId = attachResourceId;
            return this;
        }

        /**
         * attachResourceType.
         */
        public Builder attachResourceType(String attachResourceType) {
            this.putQueryParameter("attachResourceType", attachResourceType);
            this.attachResourceType = attachResourceType;
            return this;
        }

        /**
         * environmentId.
         */
        public Builder environmentId(String environmentId) {
            this.putQueryParameter("environmentId", environmentId);
            this.environmentId = environmentId;
            return this;
        }

        /**
         * gatewayId.
         */
        public Builder gatewayId(String gatewayId) {
            this.putQueryParameter("gatewayId", gatewayId);
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * withAttachments.
         */
        public Builder withAttachments(Boolean withAttachments) {
            this.putQueryParameter("withAttachments", withAttachments);
            this.withAttachments = withAttachments;
            return this;
        }

        /**
         * withSystemPolicy.
         */
        public Builder withSystemPolicy(Boolean withSystemPolicy) {
            this.putQueryParameter("withSystemPolicy", withSystemPolicy);
            this.withSystemPolicy = withSystemPolicy;
            return this;
        }

        @Override
        public ListPoliciesRequest build() {
            return new ListPoliciesRequest(this);
        } 

    } 

}
