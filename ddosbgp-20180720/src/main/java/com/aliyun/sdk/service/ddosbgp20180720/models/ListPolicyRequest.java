// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosbgp20180720.models;

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
 * {@link ListPolicyRequest} extends {@link RequestModel}
 *
 * <p>ListPolicyRequest</p>
 */
public class ListPolicyRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Long pageNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductType")
    private String productType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private ListPolicyRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.name = builder.name;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.productType = builder.productType;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPolicyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return pageNo
     */
    public Long getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return productType
     */
    public String getProductType() {
        return this.productType;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<ListPolicyRequest, Builder> {
        private String regionId; 
        private String name; 
        private Long pageNo; 
        private Long pageSize; 
        private String productType; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(ListPolicyRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.name = request.name;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.productType = request.productType;
            this.type = request.type;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The policy name.</p>
         * 
         * <strong>example:</strong>
         * <p>test**</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The page number of the current page in a paging query.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNo(Long pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * <p>The number of entries per page in a paging query. Default value: <strong>10</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The applicable product type. Valid values:</p>
         * <ul>
         * <li><p><strong>ecs</strong>: queries the default policy applicable to ECS.</p>
         * </li>
         * <li><p><strong>slb</strong>: queries the default policy applicable to SLB.</p>
         * </li>
         * <li><p><strong>eip</strong>: queries the default policy applicable to EIP.</p>
         * </li>
         * <li><p><strong>gf-eip</strong>: queries the default policy applicable to elastic IP addresses (EIPs) with Anti-DDoS Proxy Enabled.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>This parameter takes effect only when the policy type is <code>default</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ecs</p>
         */
        public Builder productType(String productType) {
            this.putQueryParameter("ProductType", productType);
            this.productType = productType;
            return this;
        }

        /**
         * <p>The policy type. Valid values:</p>
         * <ul>
         * <li><p><strong>default</strong>: the default mitigation policy.</p>
         * </li>
         * <li><p><strong>l3</strong>: the IP-specific mitigation policy.</p>
         * </li>
         * <li><p><strong>l4</strong>: the port-specific mitigation policy.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>l3</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public ListPolicyRequest build() {
            return new ListPolicyRequest(this);
        } 

    } 

}
