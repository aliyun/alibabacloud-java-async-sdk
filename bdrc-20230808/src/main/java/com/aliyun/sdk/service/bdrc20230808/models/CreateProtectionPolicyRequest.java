// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bdrc20230808.models;

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
 * {@link CreateProtectionPolicyRequest} extends {@link RequestModel}
 *
 * <p>CreateProtectionPolicyRequest</p>
 */
public class CreateProtectionPolicyRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BoundResourceCategoryIds")
    private java.util.List<String> boundResourceCategoryIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProtectionPolicyName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String protectionPolicyName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProtectionPolicyRegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String protectionPolicyRegionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SubProtectionPolicies")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<SubProtectionPolicies> subProtectionPolicies;

    private CreateProtectionPolicyRequest(Builder builder) {
        super(builder);
        this.boundResourceCategoryIds = builder.boundResourceCategoryIds;
        this.clientToken = builder.clientToken;
        this.protectionPolicyName = builder.protectionPolicyName;
        this.protectionPolicyRegionId = builder.protectionPolicyRegionId;
        this.subProtectionPolicies = builder.subProtectionPolicies;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateProtectionPolicyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return boundResourceCategoryIds
     */
    public java.util.List<String> getBoundResourceCategoryIds() {
        return this.boundResourceCategoryIds;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return protectionPolicyName
     */
    public String getProtectionPolicyName() {
        return this.protectionPolicyName;
    }

    /**
     * @return protectionPolicyRegionId
     */
    public String getProtectionPolicyRegionId() {
        return this.protectionPolicyRegionId;
    }

    /**
     * @return subProtectionPolicies
     */
    public java.util.List<SubProtectionPolicies> getSubProtectionPolicies() {
        return this.subProtectionPolicies;
    }

    public static final class Builder extends Request.Builder<CreateProtectionPolicyRequest, Builder> {
        private java.util.List<String> boundResourceCategoryIds; 
        private String clientToken; 
        private String protectionPolicyName; 
        private String protectionPolicyRegionId; 
        private java.util.List<SubProtectionPolicies> subProtectionPolicies; 

        private Builder() {
            super();
        } 

        private Builder(CreateProtectionPolicyRequest request) {
            super(request);
            this.boundResourceCategoryIds = request.boundResourceCategoryIds;
            this.clientToken = request.clientToken;
            this.protectionPolicyName = request.protectionPolicyName;
            this.protectionPolicyRegionId = request.protectionPolicyRegionId;
            this.subProtectionPolicies = request.subProtectionPolicies;
        } 

        /**
         * BoundResourceCategoryIds.
         */
        public Builder boundResourceCategoryIds(java.util.List<String> boundResourceCategoryIds) {
            String boundResourceCategoryIdsShrink = shrink(boundResourceCategoryIds, "BoundResourceCategoryIds", "json");
            this.putBodyParameter("BoundResourceCategoryIds", boundResourceCategoryIdsShrink);
            this.boundResourceCategoryIds = boundResourceCategoryIds;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>My***Policy</p>
         */
        public Builder protectionPolicyName(String protectionPolicyName) {
            this.putBodyParameter("ProtectionPolicyName", protectionPolicyName);
            this.protectionPolicyName = protectionPolicyName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder protectionPolicyRegionId(String protectionPolicyRegionId) {
            this.putBodyParameter("ProtectionPolicyRegionId", protectionPolicyRegionId);
            this.protectionPolicyRegionId = protectionPolicyRegionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder subProtectionPolicies(java.util.List<SubProtectionPolicies> subProtectionPolicies) {
            String subProtectionPoliciesShrink = shrink(subProtectionPolicies, "SubProtectionPolicies", "json");
            this.putBodyParameter("SubProtectionPolicies", subProtectionPoliciesShrink);
            this.subProtectionPolicies = subProtectionPolicies;
            return this;
        }

        @Override
        public CreateProtectionPolicyRequest build() {
            return new CreateProtectionPolicyRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateProtectionPolicyRequest} extends {@link TeaModel}
     *
     * <p>CreateProtectionPolicyRequest</p>
     */
    public static class SubProtectionPolicies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Config")
        private String config;

        @com.aliyun.core.annotation.NameInMap("SubProtectionPolicyType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String subProtectionPolicyType;

        private SubProtectionPolicies(Builder builder) {
            this.config = builder.config;
            this.subProtectionPolicyType = builder.subProtectionPolicyType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubProtectionPolicies create() {
            return builder().build();
        }

        /**
         * @return config
         */
        public String getConfig() {
            return this.config;
        }

        /**
         * @return subProtectionPolicyType
         */
        public String getSubProtectionPolicyType() {
            return this.subProtectionPolicyType;
        }

        public static final class Builder {
            private String config; 
            private String subProtectionPolicyType; 

            private Builder() {
            } 

            private Builder(SubProtectionPolicies model) {
                this.config = model.config;
                this.subProtectionPolicyType = model.subProtectionPolicyType;
            } 

            /**
             * Config.
             */
            public Builder config(String config) {
                this.config = config;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>ECS_AUTO_SNAPSHOT_POLICY</p>
             */
            public Builder subProtectionPolicyType(String subProtectionPolicyType) {
                this.subProtectionPolicyType = subProtectionPolicyType;
                return this;
            }

            public SubProtectionPolicies build() {
                return new SubProtectionPolicies(this);
            } 

        } 

    }
}
