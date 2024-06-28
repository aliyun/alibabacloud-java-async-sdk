// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCostUnitRequest} extends {@link RequestModel}
 *
 * <p>CreateCostUnitRequest</p>
 */
public class CreateCostUnitRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UnitEntityList")
    private java.util.List < UnitEntityList> unitEntityList;

    private CreateCostUnitRequest(Builder builder) {
        super(builder);
        this.unitEntityList = builder.unitEntityList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCostUnitRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return unitEntityList
     */
    public java.util.List < UnitEntityList> getUnitEntityList() {
        return this.unitEntityList;
    }

    public static final class Builder extends Request.Builder<CreateCostUnitRequest, Builder> {
        private java.util.List < UnitEntityList> unitEntityList; 

        private Builder() {
            super();
        } 

        private Builder(CreateCostUnitRequest request) {
            super(request);
            this.unitEntityList = request.unitEntityList;
        } 

        /**
         * The list of cost centers.
         */
        public Builder unitEntityList(java.util.List < UnitEntityList> unitEntityList) {
            this.putQueryParameter("UnitEntityList", unitEntityList);
            this.unitEntityList = unitEntityList;
            return this;
        }

        @Override
        public CreateCostUnitRequest build() {
            return new CreateCostUnitRequest(this);
        } 

    } 

    public static class UnitEntityList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OwnerUid")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long ownerUid;

        @com.aliyun.core.annotation.NameInMap("ParentUnitId")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long parentUnitId;

        @com.aliyun.core.annotation.NameInMap("UnitName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String unitName;

        private UnitEntityList(Builder builder) {
            this.ownerUid = builder.ownerUid;
            this.parentUnitId = builder.parentUnitId;
            this.unitName = builder.unitName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UnitEntityList create() {
            return builder().build();
        }

        /**
         * @return ownerUid
         */
        public Long getOwnerUid() {
            return this.ownerUid;
        }

        /**
         * @return parentUnitId
         */
        public Long getParentUnitId() {
            return this.parentUnitId;
        }

        /**
         * @return unitName
         */
        public String getUnitName() {
            return this.unitName;
        }

        public static final class Builder {
            private Long ownerUid; 
            private Long parentUnitId; 
            private String unitName; 

            /**
             * The user ID of the owner of the cost center.
             */
            public Builder ownerUid(Long ownerUid) {
                this.ownerUid = ownerUid;
                return this;
            }

            /**
             * The ID of the parent cost center. A value of -1 indicates the root cost center.
             */
            public Builder parentUnitId(Long parentUnitId) {
                this.parentUnitId = parentUnitId;
                return this;
            }

            /**
             * The name of the cost center.
             */
            public Builder unitName(String unitName) {
                this.unitName = unitName;
                return this;
            }

            public UnitEntityList build() {
                return new UnitEntityList(this);
            } 

        } 

    }
}
