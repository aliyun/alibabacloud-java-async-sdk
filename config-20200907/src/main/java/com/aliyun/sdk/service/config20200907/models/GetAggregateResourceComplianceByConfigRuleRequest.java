// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

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
 * {@link GetAggregateResourceComplianceByConfigRuleRequest} extends {@link RequestModel}
 *
 * <p>GetAggregateResourceComplianceByConfigRuleRequest</p>
 */
public class GetAggregateResourceComplianceByConfigRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AggregatorId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String aggregatorId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ComplianceType")
    private String complianceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConfigRuleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String configRuleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceAccountId")
    private Long resourceAccountId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    @Deprecated
    private Long resourceOwnerId;

    private GetAggregateResourceComplianceByConfigRuleRequest(Builder builder) {
        super(builder);
        this.aggregatorId = builder.aggregatorId;
        this.complianceType = builder.complianceType;
        this.configRuleId = builder.configRuleId;
        this.resourceAccountId = builder.resourceAccountId;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAggregateResourceComplianceByConfigRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aggregatorId
     */
    public String getAggregatorId() {
        return this.aggregatorId;
    }

    /**
     * @return complianceType
     */
    public String getComplianceType() {
        return this.complianceType;
    }

    /**
     * @return configRuleId
     */
    public String getConfigRuleId() {
        return this.configRuleId;
    }

    /**
     * @return resourceAccountId
     */
    public Long getResourceAccountId() {
        return this.resourceAccountId;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static final class Builder extends Request.Builder<GetAggregateResourceComplianceByConfigRuleRequest, Builder> {
        private String aggregatorId; 
        private String complianceType; 
        private String configRuleId; 
        private Long resourceAccountId; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(GetAggregateResourceComplianceByConfigRuleRequest request) {
            super(request);
            this.aggregatorId = request.aggregatorId;
            this.complianceType = request.complianceType;
            this.configRuleId = request.configRuleId;
            this.resourceAccountId = request.resourceAccountId;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * <p>The ID of the account group.</p>
         * <p>For more information about how to obtain the ID of the account group, see <a href="https://help.aliyun.com/document_detail/255797.html">ListAggregators</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ca-a4e5626622af0079****</p>
         */
        public Builder aggregatorId(String aggregatorId) {
            this.putQueryParameter("AggregatorId", aggregatorId);
            this.aggregatorId = aggregatorId;
            return this;
        }

        /**
         * <p>The compliance evaluation result of the resources. Valid values:</p>
         * <ul>
         * <li>COMPLIANT: The resource is evaluated as compliant.</li>
         * <li>NON_COMPLIANT: The resource is evaluated as incompliant.</li>
         * <li>NOT_APPLICABLE: The rule does not apply to your resources.</li>
         * <li>INSUFFICIENT_DATA: No resource data is available.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>COMPLIANT</p>
         */
        public Builder complianceType(String complianceType) {
            this.putQueryParameter("ComplianceType", complianceType);
            this.complianceType = complianceType;
            return this;
        }

        /**
         * <p>The ID of the rule.</p>
         * <p>For more information about how to obtain the ID of a rule, see <a href="https://help.aliyun.com/document_detail/264148.html">ListAggregateConfigRules</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cr-d369626622af008e****</p>
         */
        public Builder configRuleId(String configRuleId) {
            this.putQueryParameter("ConfigRuleId", configRuleId);
            this.configRuleId = configRuleId;
            return this;
        }

        /**
         * <p>The ID of the Alibaba Cloud account to which the resources in the account group belong.</p>
         * <blockquote>
         * <p>You can use either the ResourceAccountId or ResourceOwnerId parameter. We recommend that you use the ResourceAccountId parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>100931896542****</p>
         */
        public Builder resourceAccountId(Long resourceAccountId) {
            this.putQueryParameter("ResourceAccountId", resourceAccountId);
            this.resourceAccountId = resourceAccountId;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        @Override
        public GetAggregateResourceComplianceByConfigRuleRequest build() {
            return new GetAggregateResourceComplianceByConfigRuleRequest(this);
        } 

    } 

}
