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
         * <p>The number of the page to return.</p>
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
         * <p>Specifies whether the cloud honeypot feature is enabled for the VPCs. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: yes</li>
         * <li><strong>false</strong>: no</li>
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
         * <p>The number of entries to return on each page. Default value: 20. If you leave this parameter empty, 20 entries are returned on each page.</p>
         * <blockquote>
         * <p>We recommend that you do not leave this parameter empty.</p>
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
         * <p>The ID of the VPC on which the honeypot is deployed.</p>
         * <blockquote>
         * <p>You can call the <a href="~~DescribeVpcList~~">DescribeVpcList</a> operation to query the IDs of VPCs.</p>
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
         * <p>The name of the VPC.</p>
         * <blockquote>
         * <p>You can call the <a href="~~DescribeVpcList~~">DescribeVpcList</a> operation to query the names of VPCs.</p>
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
         * <p>The region ID of the VPC.</p>
         * <blockquote>
         * <p>You can call the <a href="~~DescribeVpcList~~">DescribeVpcList</a> operation to query the region IDs of VPCs.</p>
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
