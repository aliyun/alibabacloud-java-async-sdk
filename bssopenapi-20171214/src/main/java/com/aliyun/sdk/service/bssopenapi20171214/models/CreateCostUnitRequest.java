// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCostUnitRequest} extends {@link RequestModel}
 *
 * <p>CreateCostUnitRequest</p>
 */
public class CreateCostUnitRequest extends Request {
    @Query
    @NameInMap("UnitEntityList")
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

        private Builder(CreateCostUnitRequest response) {
            super(response);
            this.unitEntityList = response.unitEntityList;
        } 

        /**
         * UnitEntityList.
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
        @NameInMap("OwnerUid")
        @Validation(required = true)
        private Long ownerUid;

        @NameInMap("ParentUnitId")
        @Validation(required = true)
        private Long parentUnitId;

        @NameInMap("UnitName")
        @Validation(required = true)
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
             * OwnerUid.
             */
            public Builder ownerUid(Long ownerUid) {
                this.ownerUid = ownerUid;
                return this;
            }

            /**
             * ParentUnitId.
             */
            public Builder parentUnitId(Long parentUnitId) {
                this.parentUnitId = parentUnitId;
                return this;
            }

            /**
             * UnitName.
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
