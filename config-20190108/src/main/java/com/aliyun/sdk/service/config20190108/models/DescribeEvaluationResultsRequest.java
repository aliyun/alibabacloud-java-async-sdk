// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20190108.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEvaluationResultsRequest} extends {@link RequestModel}
 *
 * <p>DescribeEvaluationResultsRequest</p>
 */
public class DescribeEvaluationResultsRequest extends Request {
    @Query
    @NameInMap("ComplianceType")
    private String complianceType;

    @Query
    @NameInMap("ConfigRuleId")
    private String configRuleId;

    @Query
    @NameInMap("MemberId")
    private Long memberId;

    @Query
    @NameInMap("MultiAccount")
    private Boolean multiAccount;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    @Validation(maximum = 100, minimum = 1)
    private Integer pageSize;

    @Query
    @NameInMap("ResourceId")
    private String resourceId;

    @Query
    @NameInMap("ResourceType")
    private String resourceType;

    private DescribeEvaluationResultsRequest(Builder builder) {
        super(builder);
        this.complianceType = builder.complianceType;
        this.configRuleId = builder.configRuleId;
        this.memberId = builder.memberId;
        this.multiAccount = builder.multiAccount;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.resourceId = builder.resourceId;
        this.resourceType = builder.resourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEvaluationResultsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return memberId
     */
    public Long getMemberId() {
        return this.memberId;
    }

    /**
     * @return multiAccount
     */
    public Boolean getMultiAccount() {
        return this.multiAccount;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return resourceId
     */
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    public static final class Builder extends Request.Builder<DescribeEvaluationResultsRequest, Builder> {
        private String complianceType; 
        private String configRuleId; 
        private Long memberId; 
        private Boolean multiAccount; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String resourceId; 
        private String resourceType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeEvaluationResultsRequest response) {
            super(response);
            this.complianceType = response.complianceType;
            this.configRuleId = response.configRuleId;
            this.memberId = response.memberId;
            this.multiAccount = response.multiAccount;
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
            this.resourceId = response.resourceId;
            this.resourceType = response.resourceType;
        } 

        /**
         * ComplianceType.
         */
        public Builder complianceType(String complianceType) {
            this.putQueryParameter("ComplianceType", complianceType);
            this.complianceType = complianceType;
            return this;
        }

        /**
         * ConfigRuleId.
         */
        public Builder configRuleId(String configRuleId) {
            this.putQueryParameter("ConfigRuleId", configRuleId);
            this.configRuleId = configRuleId;
            return this;
        }

        /**
         * MemberId.
         */
        public Builder memberId(Long memberId) {
            this.putQueryParameter("MemberId", memberId);
            this.memberId = memberId;
            return this;
        }

        /**
         * MultiAccount.
         */
        public Builder multiAccount(Boolean multiAccount) {
            this.putQueryParameter("MultiAccount", multiAccount);
            this.multiAccount = multiAccount;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * ResourceId.
         */
        public Builder resourceId(String resourceId) {
            this.putQueryParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * ResourceType.
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        @Override
        public DescribeEvaluationResultsRequest build() {
            return new DescribeEvaluationResultsRequest(this);
        } 

    } 

}
