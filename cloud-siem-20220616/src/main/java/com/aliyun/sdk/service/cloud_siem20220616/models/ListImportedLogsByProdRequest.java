// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListImportedLogsByProdRequest} extends {@link RequestModel}
 *
 * <p>ListImportedLogsByProdRequest</p>
 */
public class ListImportedLogsByProdRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CloudCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String cloudCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProdCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String prodCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoleFor")
    private Long roleFor;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoleType")
    private Integer roleType;

    private ListImportedLogsByProdRequest(Builder builder) {
        super(builder);
        this.cloudCode = builder.cloudCode;
        this.prodCode = builder.prodCode;
        this.regionId = builder.regionId;
        this.roleFor = builder.roleFor;
        this.roleType = builder.roleType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListImportedLogsByProdRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cloudCode
     */
    public String getCloudCode() {
        return this.cloudCode;
    }

    /**
     * @return prodCode
     */
    public String getProdCode() {
        return this.prodCode;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return roleFor
     */
    public Long getRoleFor() {
        return this.roleFor;
    }

    /**
     * @return roleType
     */
    public Integer getRoleType() {
        return this.roleType;
    }

    public static final class Builder extends Request.Builder<ListImportedLogsByProdRequest, Builder> {
        private String cloudCode; 
        private String prodCode; 
        private String regionId; 
        private Long roleFor; 
        private Integer roleType; 

        private Builder() {
            super();
        } 

        private Builder(ListImportedLogsByProdRequest request) {
            super(request);
            this.cloudCode = request.cloudCode;
            this.prodCode = request.prodCode;
            this.regionId = request.regionId;
            this.roleFor = request.roleFor;
            this.roleType = request.roleType;
        } 

        /**
         * The code of the cloud service provider. Valid values:
         * <p>
         * 
         * *   qcloud: Tencent Cloud.
         * *   aliyun: Alibaba Cloud.
         * *   hcloud: Huawei Cloud.
         */
        public Builder cloudCode(String cloudCode) {
            this.putBodyParameter("CloudCode", cloudCode);
            this.cloudCode = cloudCode;
            return this;
        }

        /**
         * The code of the cloud service.
         */
        public Builder prodCode(String prodCode) {
            this.putBodyParameter("ProdCode", prodCode);
            this.prodCode = prodCode;
            return this;
        }

        /**
         * The region in which the data management center of the threat analysis feature resides. Specify this parameter based on the regions in which your assets reside. Valid values:
         * <p>
         * 
         * *   cn-hangzhou: Your assets reside in regions in China.
         * *   ap-southeast-1: Your assets reside in regions outside China.
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the account that you switch from the management account.
         */
        public Builder roleFor(Long roleFor) {
            this.putBodyParameter("RoleFor", roleFor);
            this.roleFor = roleFor;
            return this;
        }

        /**
         * The type of the view. Valid values:
         * <p>
         * - 0: the current Alibaba Cloud account
         * - 1: the global account
         */
        public Builder roleType(Integer roleType) {
            this.putBodyParameter("RoleType", roleType);
            this.roleType = roleType;
            return this;
        }

        @Override
        public ListImportedLogsByProdRequest build() {
            return new ListImportedLogsByProdRequest(this);
        } 

    } 

}
