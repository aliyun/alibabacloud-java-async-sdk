// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20230930.models;

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
 * {@link CreateCostCenterRequest} extends {@link RequestModel}
 *
 * <p>CreateCostCenterRequest</p>
 */
public class CreateCostCenterRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CostCenterEntityList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<CostCenterEntityList> costCenterEntityList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Nbid")
    private String nbid;

    private CreateCostCenterRequest(Builder builder) {
        super(builder);
        this.costCenterEntityList = builder.costCenterEntityList;
        this.nbid = builder.nbid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCostCenterRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return costCenterEntityList
     */
    public java.util.List<CostCenterEntityList> getCostCenterEntityList() {
        return this.costCenterEntityList;
    }

    /**
     * @return nbid
     */
    public String getNbid() {
        return this.nbid;
    }

    public static final class Builder extends Request.Builder<CreateCostCenterRequest, Builder> {
        private java.util.List<CostCenterEntityList> costCenterEntityList; 
        private String nbid; 

        private Builder() {
            super();
        } 

        private Builder(CreateCostCenterRequest request) {
            super(request);
            this.costCenterEntityList = request.costCenterEntityList;
            this.nbid = request.nbid;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder costCenterEntityList(java.util.List<CostCenterEntityList> costCenterEntityList) {
            String costCenterEntityListShrink = shrink(costCenterEntityList, "CostCenterEntityList", "json");
            this.putQueryParameter("CostCenterEntityList", costCenterEntityListShrink);
            this.costCenterEntityList = costCenterEntityList;
            return this;
        }

        /**
         * Nbid.
         */
        public Builder nbid(String nbid) {
            this.putQueryParameter("Nbid", nbid);
            this.nbid = nbid;
            return this;
        }

        @Override
        public CreateCostCenterRequest build() {
            return new CreateCostCenterRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateCostCenterRequest} extends {@link TeaModel}
     *
     * <p>CreateCostCenterRequest</p>
     */
    public static class CostCenterEntityList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CostCenterName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String costCenterName;

        @com.aliyun.core.annotation.NameInMap("OwnerAccountId")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long ownerAccountId;

        @com.aliyun.core.annotation.NameInMap("ParentCostCenterId")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long parentCostCenterId;

        private CostCenterEntityList(Builder builder) {
            this.costCenterName = builder.costCenterName;
            this.ownerAccountId = builder.ownerAccountId;
            this.parentCostCenterId = builder.parentCostCenterId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CostCenterEntityList create() {
            return builder().build();
        }

        /**
         * @return costCenterName
         */
        public String getCostCenterName() {
            return this.costCenterName;
        }

        /**
         * @return ownerAccountId
         */
        public Long getOwnerAccountId() {
            return this.ownerAccountId;
        }

        /**
         * @return parentCostCenterId
         */
        public Long getParentCostCenterId() {
            return this.parentCostCenterId;
        }

        public static final class Builder {
            private String costCenterName; 
            private Long ownerAccountId; 
            private Long parentCostCenterId; 

            private Builder() {
            } 

            private Builder(CostCenterEntityList model) {
                this.costCenterName = model.costCenterName;
                this.ownerAccountId = model.ownerAccountId;
                this.parentCostCenterId = model.parentCostCenterId;
            } 

            /**
             * <p>This parameter is required.</p>
             */
            public Builder costCenterName(String costCenterName) {
                this.costCenterName = costCenterName;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1314839403940987</p>
             */
            public Builder ownerAccountId(Long ownerAccountId) {
                this.ownerAccountId = ownerAccountId;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>-1</p>
             */
            public Builder parentCostCenterId(Long parentCostCenterId) {
                this.parentCostCenterId = parentCostCenterId;
                return this;
            }

            public CostCenterEntityList build() {
                return new CostCenterEntityList(this);
            } 

        } 

    }
}
