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
 * {@link DescribeVpcHoneyPotListRequest} extends {@link RequestModel}
 *
 * <p>DescribeVpcHoneyPotListRequest</p>
 */
public class DescribeVpcHoneyPotListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HoneyPotExistence")
    private Boolean honeyPotExistence;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcId")
    private String vpcId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcName")
    private String vpcName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcRegionId")
    private String vpcRegionId;

    private DescribeVpcHoneyPotListRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.honeyPotExistence = builder.honeyPotExistence;
        this.pageSize = builder.pageSize;
        this.vpcId = builder.vpcId;
        this.vpcName = builder.vpcName;
        this.vpcRegionId = builder.vpcRegionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVpcHoneyPotListRequest create() {
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
     * @return honeyPotExistence
     */
    public Boolean getHoneyPotExistence() {
        return this.honeyPotExistence;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * @return vpcName
     */
    public String getVpcName() {
        return this.vpcName;
    }

    /**
     * @return vpcRegionId
     */
    public String getVpcRegionId() {
        return this.vpcRegionId;
    }

    public static final class Builder extends Request.Builder<DescribeVpcHoneyPotListRequest, Builder> {
        private Integer currentPage; 
        private Boolean honeyPotExistence; 
        private Integer pageSize; 
        private String vpcId; 
        private String vpcName; 
        private String vpcRegionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeVpcHoneyPotListRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.honeyPotExistence = request.honeyPotExistence;
            this.pageSize = request.pageSize;
            this.vpcId = request.vpcId;
            this.vpcName = request.vpcName;
            this.vpcRegionId = request.vpcRegionId;
        } 

        /**
         * <p>Specifies the page number of the current page during paging for a paged query.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>Specifies whether the cloud honeypot feature is enabled for the VPCs to be queried. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Enabled.</li>
         * <li><strong>false</strong>: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder honeyPotExistence(Boolean honeyPotExistence) {
            this.putQueryParameter("HoneyPotExistence", honeyPotExistence);
            this.honeyPotExistence = honeyPotExistence;
            return this;
        }

        /**
         * <p>Specifies the maximum number of entries to return on each page during paging for a paged query. Default value: 20. If this parameter is left empty, 20 entries are returned by default.</p>
         * <blockquote>
         * <p>Specify a value for PageSize.</p>
         * </blockquote>
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
         * <p>The ID of the VPC where the honeypot instance resides.</p>
         * <blockquote>
         * <p>You can call the <a href="~~DescribeVpcList~~">DescribeVpcList</a> operation to obtain the VPC ID.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>vpc-d7o009q63fqy21r8u****</p>
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        /**
         * <p>The name of the VPC where the honeypot instance resides.</p>
         * <blockquote>
         * <p>You can call the <a href="~~DescribeVpcList~~">DescribeVpcList</a> operation to obtain the VPC name.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>abcnet</p>
         */
        public Builder vpcName(String vpcName) {
            this.putQueryParameter("VpcName", vpcName);
            this.vpcName = vpcName;
            return this;
        }

        /**
         * <p>The region ID of the VPC where the honeypot instance resides.</p>
         * <blockquote>
         * <p>You can call the <a href="~~DescribeVpcList~~">DescribeVpcList</a> operation to obtain the region ID of the VPC.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ap-southeast-2</p>
         */
        public Builder vpcRegionId(String vpcRegionId) {
            this.putQueryParameter("VpcRegionId", vpcRegionId);
            this.vpcRegionId = vpcRegionId;
            return this;
        }

        @Override
        public DescribeVpcHoneyPotListRequest build() {
            return new DescribeVpcHoneyPotListRequest(this);
        } 

    } 

}
