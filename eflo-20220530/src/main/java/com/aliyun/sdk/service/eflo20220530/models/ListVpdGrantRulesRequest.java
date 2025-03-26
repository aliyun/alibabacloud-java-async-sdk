// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo20220530.models;

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
 * {@link ListVpdGrantRulesRequest} extends {@link RequestModel}
 *
 * <p>ListVpdGrantRulesRequest</p>
 */
public class ListVpdGrantRulesRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EnablePage")
    private Boolean enablePage;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ErId")
    private String erId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ForSelect")
    private Boolean forSelect;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("GrantRuleId")
    private String grantRuleId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("GrantTenantId")
    private String grantTenantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceName")
    private String instanceName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    private ListVpdGrantRulesRequest(Builder builder) {
        super(builder);
        this.enablePage = builder.enablePage;
        this.erId = builder.erId;
        this.forSelect = builder.forSelect;
        this.grantRuleId = builder.grantRuleId;
        this.grantTenantId = builder.grantTenantId;
        this.instanceId = builder.instanceId;
        this.instanceName = builder.instanceName;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListVpdGrantRulesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return enablePage
     */
    public Boolean getEnablePage() {
        return this.enablePage;
    }

    /**
     * @return erId
     */
    public String getErId() {
        return this.erId;
    }

    /**
     * @return forSelect
     */
    public Boolean getForSelect() {
        return this.forSelect;
    }

    /**
     * @return grantRuleId
     */
    public String getGrantRuleId() {
        return this.grantRuleId;
    }

    /**
     * @return grantTenantId
     */
    public String getGrantTenantId() {
        return this.grantTenantId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public static final class Builder extends Request.Builder<ListVpdGrantRulesRequest, Builder> {
        private Boolean enablePage; 
        private String erId; 
        private Boolean forSelect; 
        private String grantRuleId; 
        private String grantTenantId; 
        private String instanceId; 
        private String instanceName; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private String resourceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(ListVpdGrantRulesRequest request) {
            super(request);
            this.enablePage = request.enablePage;
            this.erId = request.erId;
            this.forSelect = request.forSelect;
            this.grantRuleId = request.grantRuleId;
            this.grantTenantId = request.grantTenantId;
            this.instanceId = request.instanceId;
            this.instanceName = request.instanceName;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
        } 

        /**
         * <p>Specifies whether to enable pagination query.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder enablePage(Boolean enablePage) {
            this.putBodyParameter("EnablePage", enablePage);
            this.enablePage = enablePage;
            return this;
        }

        /**
         * <p>Lingjun HUB Instance ID</p>
         * 
         * <strong>example:</strong>
         * <p>er-kkopgtne</p>
         */
        public Builder erId(String erId) {
            this.putBodyParameter("ErId", erId);
            this.erId = erId;
            return this;
        }

        /**
         * <p>Use the drop-down box</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder forSelect(Boolean forSelect) {
            this.putBodyParameter("ForSelect", forSelect);
            this.forSelect = forSelect;
            return this;
        }

        /**
         * <p>Authorization Entry ID</p>
         * 
         * <strong>example:</strong>
         * <p>grant-rule-8rgvqazb</p>
         */
        public Builder grantRuleId(String grantRuleId) {
            this.putBodyParameter("GrantRuleId", grantRuleId);
            this.grantRuleId = grantRuleId;
            return this;
        }

        /**
         * <p>Authorized Tenant ID</p>
         * 
         * <strong>example:</strong>
         * <p>1620939556166279</p>
         */
        public Builder grantTenantId(String grantTenantId) {
            this.putBodyParameter("GrantTenantId", grantTenantId);
            this.grantTenantId = grantTenantId;
            return this;
        }

        /**
         * <p>The ID of the network instance that you want to query.</p>
         * 
         * <strong>example:</strong>
         * <p>vpd-8rgvqazb</p>
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>Instance name</p>
         * 
         * <strong>example:</strong>
         * <p>vpd-1</p>
         */
        public Builder instanceName(String instanceName) {
            this.putBodyParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * <p>The page number of the page to return. Pages start from page 1. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries to return on each page. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-wulanchabu</p>
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>Resource group instance ID</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aek2l4sq6l7unhi</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putBodyParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        @Override
        public ListVpdGrantRulesRequest build() {
            return new ListVpdGrantRulesRequest(this);
        } 

    } 

}
