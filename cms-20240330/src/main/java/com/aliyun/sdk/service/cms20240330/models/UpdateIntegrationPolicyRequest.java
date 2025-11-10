// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link UpdateIntegrationPolicyRequest} extends {@link RequestModel}
 *
 * <p>UpdateIntegrationPolicyRequest</p>
 */
public class UpdateIntegrationPolicyRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("integrationPolicyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String integrationPolicyId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("feePackage")
    private String feePackage;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("policyName")
    private String policyName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("resourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("tags")
    private java.util.List<Tags> tags;

    private UpdateIntegrationPolicyRequest(Builder builder) {
        super(builder);
        this.integrationPolicyId = builder.integrationPolicyId;
        this.feePackage = builder.feePackage;
        this.policyName = builder.policyName;
        this.resourceGroupId = builder.resourceGroupId;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateIntegrationPolicyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return integrationPolicyId
     */
    public String getIntegrationPolicyId() {
        return this.integrationPolicyId;
    }

    /**
     * @return feePackage
     */
    public String getFeePackage() {
        return this.feePackage;
    }

    /**
     * @return policyName
     */
    public String getPolicyName() {
        return this.policyName;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return tags
     */
    public java.util.List<Tags> getTags() {
        return this.tags;
    }

    public static final class Builder extends Request.Builder<UpdateIntegrationPolicyRequest, Builder> {
        private String integrationPolicyId; 
        private String feePackage; 
        private String policyName; 
        private String resourceGroupId; 
        private java.util.List<Tags> tags; 

        private Builder() {
            super();
        } 

        private Builder(UpdateIntegrationPolicyRequest request) {
            super(request);
            this.integrationPolicyId = request.integrationPolicyId;
            this.feePackage = request.feePackage;
            this.policyName = request.policyName;
            this.resourceGroupId = request.resourceGroupId;
            this.tags = request.tags;
        } 

        /**
         * <p>Access center policy ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>polixy-xxxxxxxxx</p>
         */
        public Builder integrationPolicyId(String integrationPolicyId) {
            this.putPathParameter("integrationPolicyId", integrationPolicyId);
            this.integrationPolicyId = integrationPolicyId;
            return this;
        }

        /**
         * <p>Fee package type, CS_Pro/CS_Basic/empty.</p>
         * 
         * <strong>example:</strong>
         * <p>CS_Pro</p>
         */
        public Builder feePackage(String feePackage) {
            this.putBodyParameter("feePackage", feePackage);
            this.feePackage = feePackage;
            return this;
        }

        /**
         * <p>Rule name, minimum 3 characters, maximum 63 characters, must start with a letter.</p>
         * 
         * <strong>example:</strong>
         * <p>metrics-inner-manage</p>
         */
        public Builder policyName(String policyName) {
            this.putBodyParameter("policyName", policyName);
            this.policyName = policyName;
            return this;
        }

        /**
         * <p>Resource group ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aekzoiafjtr7zyq</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putBodyParameter("resourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>Resource tags.</p>
         */
        public Builder tags(java.util.List<Tags> tags) {
            this.putBodyParameter("tags", tags);
            this.tags = tags;
            return this;
        }

        @Override
        public UpdateIntegrationPolicyRequest build() {
            return new UpdateIntegrationPolicyRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateIntegrationPolicyRequest} extends {@link TeaModel}
     *
     * <p>UpdateIntegrationPolicyRequest</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("value")
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

            private Builder() {
            } 

            private Builder(Tags model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>Tag <code>key</code> value.</p>
             * 
             * <strong>example:</strong>
             * <p>algo_bhv_expose_in_airec_exposure</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>Tag <code>value</code> value.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;Id&quot;: &quot;kgqie6hm&quot;, &quot;Name&quot;: &quot;Sheet1&quot;}]</p>
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
