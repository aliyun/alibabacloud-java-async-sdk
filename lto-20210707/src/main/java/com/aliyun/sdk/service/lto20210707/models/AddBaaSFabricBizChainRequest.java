// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.lto20210707.models;

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
 * {@link AddBaaSFabricBizChainRequest} extends {@link RequestModel}
 *
 * <p>AddBaaSFabricBizChainRequest</p>
 */
public class AddBaaSFabricBizChainRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BaaSFabricChannelId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String baaSFabricChannelId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BaaSFabricConsortiumId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String baaSFabricConsortiumId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BaaSFabricOrganizationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String baaSFabricOrganizationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContractTemplateIdList")
    private String contractTemplateIdList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Remark")
    private String remark;

    private AddBaaSFabricBizChainRequest(Builder builder) {
        super(builder);
        this.baaSFabricChannelId = builder.baaSFabricChannelId;
        this.baaSFabricConsortiumId = builder.baaSFabricConsortiumId;
        this.baaSFabricOrganizationId = builder.baaSFabricOrganizationId;
        this.contractTemplateIdList = builder.contractTemplateIdList;
        this.name = builder.name;
        this.regionId = builder.regionId;
        this.remark = builder.remark;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddBaaSFabricBizChainRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return baaSFabricChannelId
     */
    public String getBaaSFabricChannelId() {
        return this.baaSFabricChannelId;
    }

    /**
     * @return baaSFabricConsortiumId
     */
    public String getBaaSFabricConsortiumId() {
        return this.baaSFabricConsortiumId;
    }

    /**
     * @return baaSFabricOrganizationId
     */
    public String getBaaSFabricOrganizationId() {
        return this.baaSFabricOrganizationId;
    }

    /**
     * @return contractTemplateIdList
     */
    public String getContractTemplateIdList() {
        return this.contractTemplateIdList;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    public static final class Builder extends Request.Builder<AddBaaSFabricBizChainRequest, Builder> {
        private String baaSFabricChannelId; 
        private String baaSFabricConsortiumId; 
        private String baaSFabricOrganizationId; 
        private String contractTemplateIdList; 
        private String name; 
        private String regionId; 
        private String remark; 

        private Builder() {
            super();
        } 

        private Builder(AddBaaSFabricBizChainRequest request) {
            super(request);
            this.baaSFabricChannelId = request.baaSFabricChannelId;
            this.baaSFabricConsortiumId = request.baaSFabricConsortiumId;
            this.baaSFabricOrganizationId = request.baaSFabricOrganizationId;
            this.contractTemplateIdList = request.contractTemplateIdList;
            this.name = request.name;
            this.regionId = request.regionId;
            this.remark = request.remark;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder baaSFabricChannelId(String baaSFabricChannelId) {
            this.putQueryParameter("BaaSFabricChannelId", baaSFabricChannelId);
            this.baaSFabricChannelId = baaSFabricChannelId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder baaSFabricConsortiumId(String baaSFabricConsortiumId) {
            this.putQueryParameter("BaaSFabricConsortiumId", baaSFabricConsortiumId);
            this.baaSFabricConsortiumId = baaSFabricConsortiumId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder baaSFabricOrganizationId(String baaSFabricOrganizationId) {
            this.putQueryParameter("BaaSFabricOrganizationId", baaSFabricOrganizationId);
            this.baaSFabricOrganizationId = baaSFabricOrganizationId;
            return this;
        }

        /**
         * ContractTemplateIdList.
         */
        public Builder contractTemplateIdList(String contractTemplateIdList) {
            this.putQueryParameter("ContractTemplateIdList", contractTemplateIdList);
            this.contractTemplateIdList = contractTemplateIdList;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Remark.
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        @Override
        public AddBaaSFabricBizChainRequest build() {
            return new AddBaaSFabricBizChainRequest(this);
        } 

    } 

}
