// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.neuron20211115.models;

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
 * {@link ListPdpServiceGroupsRequest} extends {@link RequestModel}
 *
 * <p>ListPdpServiceGroupsRequest</p>
 */
public class ListPdpServiceGroupsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("alias")
    private String alias;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("enterpriseId")
    private Long enterpriseId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("env")
    @com.aliyun.core.annotation.Validation(required = true)
    private String env;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("envType")
    private String envType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("groupType")
    private String groupType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ids")
    private java.util.List<Long> ids;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("orderBy")
    private String orderBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("orderDirection")
    private String orderDirection;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("orgType")
    private String orgType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pbcId")
    private Long pbcId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("productId")
    private Long productId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("region")
    private String region;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("repoId")
    private String repoId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("serviceId")
    private Long serviceId;

    private ListPdpServiceGroupsRequest(Builder builder) {
        super(builder);
        this.alias = builder.alias;
        this.enterpriseId = builder.enterpriseId;
        this.env = builder.env;
        this.envType = builder.envType;
        this.groupType = builder.groupType;
        this.ids = builder.ids;
        this.name = builder.name;
        this.orderBy = builder.orderBy;
        this.orderDirection = builder.orderDirection;
        this.orgType = builder.orgType;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.pbcId = builder.pbcId;
        this.productId = builder.productId;
        this.region = builder.region;
        this.repoId = builder.repoId;
        this.serviceId = builder.serviceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPdpServiceGroupsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alias
     */
    public String getAlias() {
        return this.alias;
    }

    /**
     * @return enterpriseId
     */
    public Long getEnterpriseId() {
        return this.enterpriseId;
    }

    /**
     * @return env
     */
    public String getEnv() {
        return this.env;
    }

    /**
     * @return envType
     */
    public String getEnvType() {
        return this.envType;
    }

    /**
     * @return groupType
     */
    public String getGroupType() {
        return this.groupType;
    }

    /**
     * @return ids
     */
    public java.util.List<Long> getIds() {
        return this.ids;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return orderBy
     */
    public String getOrderBy() {
        return this.orderBy;
    }

    /**
     * @return orderDirection
     */
    public String getOrderDirection() {
        return this.orderDirection;
    }

    /**
     * @return orgType
     */
    public String getOrgType() {
        return this.orgType;
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
     * @return pbcId
     */
    public Long getPbcId() {
        return this.pbcId;
    }

    /**
     * @return productId
     */
    public Long getProductId() {
        return this.productId;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return repoId
     */
    public String getRepoId() {
        return this.repoId;
    }

    /**
     * @return serviceId
     */
    public Long getServiceId() {
        return this.serviceId;
    }

    public static final class Builder extends Request.Builder<ListPdpServiceGroupsRequest, Builder> {
        private String alias; 
        private Long enterpriseId; 
        private String env; 
        private String envType; 
        private String groupType; 
        private java.util.List<Long> ids; 
        private String name; 
        private String orderBy; 
        private String orderDirection; 
        private String orgType; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private Long pbcId; 
        private Long productId; 
        private String region; 
        private String repoId; 
        private Long serviceId; 

        private Builder() {
            super();
        } 

        private Builder(ListPdpServiceGroupsRequest request) {
            super(request);
            this.alias = request.alias;
            this.enterpriseId = request.enterpriseId;
            this.env = request.env;
            this.envType = request.envType;
            this.groupType = request.groupType;
            this.ids = request.ids;
            this.name = request.name;
            this.orderBy = request.orderBy;
            this.orderDirection = request.orderDirection;
            this.orgType = request.orgType;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.pbcId = request.pbcId;
            this.productId = request.productId;
            this.region = request.region;
            this.repoId = request.repoId;
            this.serviceId = request.serviceId;
        } 

        /**
         * alias.
         */
        public Builder alias(String alias) {
            this.putQueryParameter("alias", alias);
            this.alias = alias;
            return this;
        }

        /**
         * enterpriseId.
         */
        public Builder enterpriseId(Long enterpriseId) {
            this.putQueryParameter("enterpriseId", enterpriseId);
            this.enterpriseId = enterpriseId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>TEST</p>
         */
        public Builder env(String env) {
            this.putQueryParameter("env", env);
            this.env = env;
            return this;
        }

        /**
         * envType.
         */
        public Builder envType(String envType) {
            this.putQueryParameter("envType", envType);
            this.envType = envType;
            return this;
        }

        /**
         * groupType.
         */
        public Builder groupType(String groupType) {
            this.putQueryParameter("groupType", groupType);
            this.groupType = groupType;
            return this;
        }

        /**
         * ids.
         */
        public Builder ids(java.util.List<Long> ids) {
            String idsShrink = shrink(ids, "ids", "json");
            this.putQueryParameter("ids", idsShrink);
            this.ids = ids;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.putQueryParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * orderBy.
         */
        public Builder orderBy(String orderBy) {
            this.putQueryParameter("orderBy", orderBy);
            this.orderBy = orderBy;
            return this;
        }

        /**
         * orderDirection.
         */
        public Builder orderDirection(String orderDirection) {
            this.putQueryParameter("orderDirection", orderDirection);
            this.orderDirection = orderDirection;
            return this;
        }

        /**
         * orgType.
         */
        public Builder orgType(String orgType) {
            this.putQueryParameter("orgType", orgType);
            this.orgType = orgType;
            return this;
        }

        /**
         * pageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("pageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>pbcId</p>
         * 
         * <strong>example:</strong>
         * <p>64</p>
         */
        public Builder pbcId(Long pbcId) {
            this.putQueryParameter("pbcId", pbcId);
            this.pbcId = pbcId;
            return this;
        }

        /**
         * productId.
         */
        public Builder productId(Long productId) {
            this.putQueryParameter("productId", productId);
            this.productId = productId;
            return this;
        }

        /**
         * region.
         */
        public Builder region(String region) {
            this.putQueryParameter("region", region);
            this.region = region;
            return this;
        }

        /**
         * repoId.
         */
        public Builder repoId(String repoId) {
            this.putQueryParameter("repoId", repoId);
            this.repoId = repoId;
            return this;
        }

        /**
         * serviceId.
         */
        public Builder serviceId(Long serviceId) {
            this.putQueryParameter("serviceId", serviceId);
            this.serviceId = serviceId;
            return this;
        }

        @Override
        public ListPdpServiceGroupsRequest build() {
            return new ListPdpServiceGroupsRequest(this);
        } 

    } 

}
