// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeGroupedInstancesRequest} extends {@link RequestModel}
 *
 * <p>DescribeGroupedInstancesRequest</p>
 */
public class DescribeGroupedInstancesRequest extends Request {
    @Query
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @Query
    @NameInMap("FieldValue")
    private String fieldValue;

    @Query
    @NameInMap("GroupField")
    @Validation(required = true)
    private String groupField;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("MachineTypes")
    private String machineTypes;

    @Query
    @NameInMap("NoPage")
    private Boolean noPage;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("SaleVersionCheckCode")
    private String saleVersionCheckCode;

    @Query
    @NameInMap("Vendor")
    private Integer vendor;

    @Query
    @NameInMap("Vendors")
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
            this.saleVersionCheckCode = request.saleVersionCheckCode;
            this.vendor = request.vendor;
            this.vendors = request.vendors;
        } 

        /**
         * The number of entries to return on each page. Default value: **20**.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * The pagination information.
         */
        public Builder fieldValue(String fieldValue) {
            this.putQueryParameter("FieldValue", fieldValue);
            this.fieldValue = fieldValue;
            return this;
        }

        /**
         * An array that consists of the information about the assets.
         */
        public Builder groupField(String groupField) {
            this.putQueryParameter("GroupField", groupField);
            this.groupField = groupField;
            return this;
        }

        /**
         * The number of entries returned on the current page.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * Specifies whether to enable paged query. Default value: **true**. Valid values:
         * <p>
         * 
         * *   **true**: yes
         * *   **false**: no
         */
        public Builder machineTypes(String machineTypes) {
            this.putQueryParameter("MachineTypes", machineTypes);
            this.machineTypes = machineTypes;
            return this;
        }

        /**
         * The number of assets on which high-risk vulnerabilities are detected.
         */
        public Builder noPage(Boolean noPage) {
            this.putQueryParameter("NoPage", noPage);
            this.noPage = noPage;
            return this;
        }

        /**
         * The type of the server group. Valid values:
         * <p>
         * 
         * *   **0**: the default group
         * *   **1**: other group
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * SaleVersionCheckCode.
         */
        public Builder saleVersionCheckCode(String saleVersionCheckCode) {
            this.putQueryParameter("SaleVersionCheckCode", saleVersionCheckCode);
            this.saleVersionCheckCode = saleVersionCheckCode;
            return this;
        }

        /**
         * The language of the content within the request and response. Default value: **zh**. Valid values:
         * <p>
         * 
         * *   **zh**: Chinese
         * *   **en**: English
         */
        public Builder vendor(Integer vendor) {
            this.putQueryParameter("Vendor", vendor);
            this.vendor = vendor;
            return this;
        }

        /**
         * The name of the group to which the assets belong. Fuzzy search is supported.
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
