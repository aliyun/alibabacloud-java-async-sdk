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
 * {@link ListVccsRequest} extends {@link RequestModel}
 *
 * <p>ListVccsRequest</p>
 */
public class ListVccsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Bandwidth")
    private Integer bandwidth;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CenId")
    private String cenId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EnablePage")
    private Boolean enablePage;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExStatus")
    private String exStatus;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FilterErId")
    private String filterErId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VccId")
    private String vccId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VpcId")
    private String vpcId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VpdId")
    private String vpdId;

    private ListVccsRequest(Builder builder) {
        super(builder);
        this.bandwidth = builder.bandwidth;
        this.cenId = builder.cenId;
        this.enablePage = builder.enablePage;
        this.exStatus = builder.exStatus;
        this.filterErId = builder.filterErId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.status = builder.status;
        this.tag = builder.tag;
        this.vccId = builder.vccId;
        this.vpcId = builder.vpcId;
        this.vpdId = builder.vpdId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListVccsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bandwidth
     */
    public Integer getBandwidth() {
        return this.bandwidth;
    }

    /**
     * @return cenId
     */
    public String getCenId() {
        return this.cenId;
    }

    /**
     * @return enablePage
     */
    public Boolean getEnablePage() {
        return this.enablePage;
    }

    /**
     * @return exStatus
     */
    public String getExStatus() {
        return this.exStatus;
    }

    /**
     * @return filterErId
     */
    public String getFilterErId() {
        return this.filterErId;
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

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return tag
     */
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    /**
     * @return vccId
     */
    public String getVccId() {
        return this.vccId;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * @return vpdId
     */
    public String getVpdId() {
        return this.vpdId;
    }

    public static final class Builder extends Request.Builder<ListVccsRequest, Builder> {
        private Integer bandwidth; 
        private String cenId; 
        private Boolean enablePage; 
        private String exStatus; 
        private String filterErId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private String resourceGroupId; 
        private String status; 
        private java.util.List<Tag> tag; 
        private String vccId; 
        private String vpcId; 
        private String vpdId; 

        private Builder() {
            super();
        } 

        private Builder(ListVccsRequest request) {
            super(request);
            this.bandwidth = request.bandwidth;
            this.cenId = request.cenId;
            this.enablePage = request.enablePage;
            this.exStatus = request.exStatus;
            this.filterErId = request.filterErId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.status = request.status;
            this.tag = request.tag;
            this.vccId = request.vccId;
            this.vpcId = request.vpcId;
            this.vpdId = request.vpdId;
        } 

        /**
         * <p>The peak bandwidth of the Lingjun connection instance. Unit: Mbit/s. Valid values: 1000 to 400000</p>
         * 
         * <strong>example:</strong>
         * <p>5000</p>
         */
        public Builder bandwidth(Integer bandwidth) {
            this.putBodyParameter("Bandwidth", bandwidth);
            this.bandwidth = bandwidth;
            return this;
        }

        /**
         * <p>The ID of the CEN instance; <a href="https://help.aliyun.com/document_detail/181681.html">What is the CEN?</a></p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/468215.htm">DescribeCens</a> to query the information of CEN instances under the current Alibaba Cloud account.</p>
         * 
         * <strong>example:</strong>
         * <p>cen-95iwtpyvj3kk1v0ao0</p>
         */
        public Builder cenId(String cenId) {
            this.putBodyParameter("CenId", cenId);
            this.cenId = cenId;
            return this;
        }

        /**
         * <p>Specifies whether to enable paged query. Optional values:</p>
         * <ul>
         * <li><strong>true</strong>: Enable pagination query</li>
         * <li><strong>false</strong>: Pagination query is disabled</li>
         * </ul>
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
         * <p>Excludes all data in the specified status. If the status parameter exists, ExStatus does not take effect.</p>
         * 
         * <strong>example:</strong>
         * <p>Prepaid</p>
         */
        public Builder exStatus(String exStatus) {
            this.putBodyParameter("ExStatus", exStatus);
            this.exStatus = exStatus;
            return this;
        }

        /**
         * <p>Filter queries by Lingjun HUB instance ID</p>
         * 
         * <strong>example:</strong>
         * <p>er-a7rqv1rq</p>
         */
        public Builder filterErId(String filterErId) {
            this.putBodyParameter("FilterErId", filterErId);
            this.filterErId = filterErId;
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
         * <p>The number of entries to return on each page. Default value: 20.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The region ID.</p>
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
         * <p>The resource group ID.</p>
         * <p>For more information about resource groups, see <a href="https://help.aliyun.com/document_detail/94475.htm?spm=a2c4g.11186623.0.0.29e15d7akXhpuu">Resource groups</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aeky5f3qx6ceapq</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putBodyParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The instance status.</p>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        public Builder status(String status) {
            this.putBodyParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The tag information.</p>
         * <p>You can specify up to 20 tags.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putBodyParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>The ID of the Lingjun connection instance.</p>
         * 
         * <strong>example:</strong>
         * <p>vcc-cn-zvp2w222001</p>
         */
        public Builder vccId(String vccId) {
            this.putBodyParameter("VccId", vccId);
            this.vccId = vccId;
            return this;
        }

        /**
         * <p>Virtual Private Cloud IDs; <a href="https://help.aliyun.com/document_detail/34217.html">What is Virtual Private Cloud</a></p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/35739.html#demo-0">DescribeVpcs</a> operation to query the specified VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp1nrtkmamy329u6a1z0i</p>
         */
        public Builder vpcId(String vpcId) {
            this.putBodyParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        /**
         * <p>Lingjun CIDR block instance ID</p>
         * 
         * <strong>example:</strong>
         * <p>vpd-omqutbff</p>
         */
        public Builder vpdId(String vpdId) {
            this.putBodyParameter("VpdId", vpdId);
            this.vpdId = vpdId;
            return this;
        }

        @Override
        public ListVccsRequest build() {
            return new ListVccsRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListVccsRequest} extends {@link TeaModel}
     *
     * <p>ListVccsRequest</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
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

            /**
             * <p>The tag key of the VPN attachment.</p>
             * <p>You cannot specify an empty string as a tag key. It can be up to 64 characters in length and cannot start with aliyun or acs:. It cannot contain http:// or https://.</p>
             * <p>You can specify at most 20 tag keys in each call.</p>
             * 
             * <strong>example:</strong>
             * <p>tag-vcc</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value of the VPN connection.</p>
             * <p>The tag value can be empty or a string of up to 128 characters. It cannot start with aliyun or acs:, and cannot contain http:// or https://.</p>
             * <p>Each key-value pair must be unique. You can specify values for at most 20 tag keys in each call.</p>
             * 
             * <strong>example:</strong>
             * <p>vcc-group-1</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}
