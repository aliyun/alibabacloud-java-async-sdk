// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link DescribeCenterPolicyListRequest} extends {@link RequestModel}
 *
 * <p>DescribeCenterPolicyListRequest</p>
 */
public class DescribeCenterPolicyListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BusinessType")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer businessType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    @com.aliyun.core.annotation.Validation(maximum = 200, minimum = 1)
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyGroupId")
    private java.util.List<String> policyGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Scope")
    private String scope;

    private DescribeCenterPolicyListRequest(Builder builder) {
        super(builder);
        this.businessType = builder.businessType;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.policyGroupId = builder.policyGroupId;
        this.resourceType = builder.resourceType;
        this.scope = builder.scope;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCenterPolicyListRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return businessType
     */
    public Integer getBusinessType() {
        return this.businessType;
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
     * @return policyGroupId
     */
    public java.util.List<String> getPolicyGroupId() {
        return this.policyGroupId;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return scope
     */
    public String getScope() {
        return this.scope;
    }

    public static final class Builder extends Request.Builder<DescribeCenterPolicyListRequest, Builder> {
        private Integer businessType; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private java.util.List<String> policyGroupId; 
        private String resourceType; 
        private String scope; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCenterPolicyListRequest request) {
            super(request);
            this.businessType = request.businessType;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.policyGroupId = request.policyGroupId;
            this.resourceType = request.resourceType;
            this.scope = request.scope;
        } 

        /**
         * <p>The business type.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>1: public cloud</li>
         * <li>8: commercial edition.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder businessType(Integer businessType) {
            this.putQueryParameter("BusinessType", businessType);
            this.businessType = businessType;
            return this;
        }

        /**
         * <p>The page number.<br>Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The IDs of the cloud computer policies.</p>
         */
        public Builder policyGroupId(java.util.List<String> policyGroupId) {
            this.putQueryParameter("PolicyGroupId", policyGroupId);
            this.policyGroupId = policyGroupId;
            return this;
        }

        /**
         * <p>The resource type.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>app: cloud applications.</li>
         * <li>desktop: cloud computers.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>desktop</p>
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * <p>The effective scope of the cloud computer policy.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>IP: The policy applies to specific IP addresses.</li>
         * <li>GLOBAL: The policy applies globally.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>GLOBAL</p>
         */
        public Builder scope(String scope) {
            this.putQueryParameter("Scope", scope);
            this.scope = scope;
            return this;
        }

        @Override
        public DescribeCenterPolicyListRequest build() {
            return new DescribeCenterPolicyListRequest(this);
        } 

    } 

}
