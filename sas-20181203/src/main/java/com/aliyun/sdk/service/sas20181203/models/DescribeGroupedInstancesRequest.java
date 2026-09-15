// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link DescribeGroupedInstancesRequest} extends {@link RequestModel}
 *
 * <p>DescribeGroupedInstancesRequest</p>
 */
public class DescribeGroupedInstancesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FieldValue")
    private String fieldValue;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupField")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupField;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MachineTypes")
    private String machineTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NoPage")
    private Boolean noPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceDirectoryAccountId")
    private Long resourceDirectoryAccountId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SaleVersionCheckCode")
    private String saleVersionCheckCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Vendor")
    private Integer vendor;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Vendors")
    private String vendors;

    private DescribeGroupedInstancesRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.fieldValue = builder.fieldValue;
        this.groupField = builder.groupField;
        this.lang = builder.lang;
        this.machineTypes = builder.machineTypes;
        this.noPage = builder.noPage;
        this.pageSize = builder.pageSize;
        this.resourceDirectoryAccountId = builder.resourceDirectoryAccountId;
        this.saleVersionCheckCode = builder.saleVersionCheckCode;
        this.vendor = builder.vendor;
        this.vendors = builder.vendors;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGroupedInstancesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return fieldValue
     */
    public String getFieldValue() {
        return this.fieldValue;
    }

    /**
     * @return groupField
     */
    public String getGroupField() {
        return this.groupField;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return machineTypes
     */
    public String getMachineTypes() {
        return this.machineTypes;
    }

    /**
     * @return noPage
     */
    public Boolean getNoPage() {
        return this.noPage;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return resourceDirectoryAccountId
     */
    public Long getResourceDirectoryAccountId() {
        return this.resourceDirectoryAccountId;
    }

    /**
     * @return saleVersionCheckCode
     */
    public String getSaleVersionCheckCode() {
        return this.saleVersionCheckCode;
    }

    /**
     * @return vendor
     */
    public Integer getVendor() {
        return this.vendor;
    }

    /**
     * @return vendors
     */
    public String getVendors() {
        return this.vendors;
    }

    public static final class Builder extends Request.Builder<DescribeGroupedInstancesRequest, Builder> {
        private Integer currentPage; 
        private String fieldValue; 
        private String groupField; 
        private String lang; 
        private String machineTypes; 
        private Boolean noPage; 
        private Integer pageSize; 
        private Long resourceDirectoryAccountId; 
        private String saleVersionCheckCode; 
        private Integer vendor; 
        private String vendors; 

        private Builder() {
            super();
        } 

        private Builder(DescribeGroupedInstancesRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.fieldValue = request.fieldValue;
            this.groupField = request.groupField;
            this.lang = request.lang;
            this.machineTypes = request.machineTypes;
            this.noPage = request.noPage;
            this.pageSize = request.pageSize;
            this.resourceDirectoryAccountId = request.resourceDirectoryAccountId;
            this.saleVersionCheckCode = request.saleVersionCheckCode;
            this.vendor = request.vendor;
            this.vendors = request.vendors;
        } 

        /**
         * <p>The page number of the first page to return. Default value: <strong>1</strong>, which indicates that the query results are returned starting from page 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The name of the asset group to query. Fuzzy match is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>test-01</p>
         */
        public Builder fieldValue(String fieldValue) {
            this.putQueryParameter("FieldValue", fieldValue);
            this.fieldValue = fieldValue;
            return this;
        }

        /**
         * <p>The filter condition for querying assets. Valid values:</p>
         * <ul>
         * <li><strong>groupId</strong>: queries assets by asset group.</li>
         * <li><strong>regionId</strong>: queries assets by region.</li>
         * <li><strong>vpcInstanceId</strong>: queries assets by virtual private cloud (VPC).</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>groupId</p>
         */
        public Builder groupField(String groupField) {
            this.putQueryParameter("GroupField", groupField);
            this.groupField = groupField;
            return this;
        }

        /**
         * <p>The language type for the request and response messages. Default value: <strong>zh</strong>. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese</li>
         * <li><strong>en</strong>: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The type of assets to query. Set the value to <strong>ecs</strong>, which indicates Elastic Compute Service (ECS) instances.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs</p>
         */
        public Builder machineTypes(String machineTypes) {
            this.putQueryParameter("MachineTypes", machineTypes);
            this.machineTypes = machineTypes;
            return this;
        }

        /**
         * <p>Settings for whether to enable paged query. Default value: <strong>true</strong>. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Paged query is enabled.</li>
         * <li><strong>false</strong>: Paged query is disabled. Paging is not performed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder noPage(Boolean noPage) {
            this.putQueryParameter("NoPage", noPage);
            this.noPage = noPage;
            return this;
        }

        /**
         * <p>The number of entries per page in a paged query. Default value: <strong>20</strong>, which indicates that 20 entries of asset information are displayed per page.</p>
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
         * <p>The ID of the Alibaba Cloud account that is added as a member of a resource folder for member accounts.</p>
         * <blockquote>
         * <p>Invoke the <a href="~~DescribeMonitorAccounts~~">DescribeMonitorAccounts</a> operation to obtain this parameter.</p>
         * </blockquote>
         */
        public Builder resourceDirectoryAccountId(Long resourceDirectoryAccountId) {
            this.putQueryParameter("ResourceDirectoryAccountId", resourceDirectoryAccountId);
            this.resourceDirectoryAccountId = resourceDirectoryAccountId;
            return this;
        }

        /**
         * <p>The edition-based filter condition for querying assets. Valid values:</p>
         * <ul>
         * <li><strong>sas_gte_advanced</strong>: Advanced Edition or higher</li>
         * <li><strong>sas_gte_enterprise</strong>: Enterprise Edition or higher</li>
         * <li><strong>sas_gt_basic</strong>: paid edition</li>
         * <li><strong>sas_eq_advanced</strong>: Advanced Edition</li>
         * <li><strong>sas_gt_anti_virus</strong>: higher than Anti-virus Edition</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>sas_gt_basic</p>
         */
        public Builder saleVersionCheckCode(String saleVersionCheckCode) {
            this.putQueryParameter("SaleVersionCheckCode", saleVersionCheckCode);
            this.saleVersionCheckCode = saleVersionCheckCode;
            return this;
        }

        /**
         * <p>The server vendor. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Alibaba Cloud asset</li>
         * <li><strong>1</strong>: non-cloud asset</li>
         * <li><strong>2</strong>: IDC asset</li>
         * <li><strong>3</strong>, <strong>4</strong>, <strong>5</strong>, <strong>7</strong>: third-party cloud asset</li>
         * <li><strong>8</strong>: lightweight asset</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder vendor(Integer vendor) {
            this.putQueryParameter("Vendor", vendor);
            this.vendor = vendor;
            return this;
        }

        /**
         * <p>The server vendors. Separate multiple vendors with commas (,). Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Alibaba Cloud asset</li>
         * <li><strong>1</strong>: non-cloud asset</li>
         * <li><strong>2</strong>: IDC asset</li>
         * <li><strong>3</strong>, <strong>4</strong>, <strong>5</strong>, <strong>7</strong>: third-party cloud asset</li>
         * <li><strong>8</strong>: lightweight asset</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0,8</p>
         */
        public Builder vendors(String vendors) {
            this.putQueryParameter("Vendors", vendors);
            this.vendors = vendors;
            return this;
        }

        @Override
        public DescribeGroupedInstancesRequest build() {
            return new DescribeGroupedInstancesRequest(this);
        } 

    } 

}
