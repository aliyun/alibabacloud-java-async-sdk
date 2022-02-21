// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyCostUnitRequest} extends {@link RequestModel}
 *
 * <p>ModifyCostUnitRequest</p>
 */
public class ModifyCostUnitRequest extends Request {
    @Query
    @NameInMap("UnitEntityList")
    private java.util.List < UnitEntityList> unitEntityList;

    private ModifyCostUnitRequest(Builder builder) {
        super(builder);
        this.unitEntityList = builder.unitEntityList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyCostUnitRequest create() {
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

    public static final class Builder extends Request.Builder<ModifyCostUnitRequest, Builder> {
        private java.util.List < UnitEntityList> unitEntityList; 

        private Builder() {
            super();
        } 

        private Builder(ModifyCostUnitRequest response) {
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
        public ModifyCostUnitRequest build() {
            return new ModifyCostUnitRequest(this);
        } 

    } 

    public static class UnitEntityList extends TeaModel {
        @NameInMap("NewUnitName")
        @Validation(required = true)
        private String newUnitName;

        @NameInMap("OwnerUid")
        @Validation(required = true)
        private Long ownerUid;

        @NameInMap("UnitId")
        @Validation(required = true)
        private Long unitId;

        private UnitEntityList(Builder builder) {
            this.newUnitName = builder.newUnitName;
            this.ownerUid = builder.ownerUid;
            this.unitId = builder.unitId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UnitEntityList create() {
            return builder().build();
        }

        /**
         * @return newUnitName
         */
        public String getNewUnitName() {
            return this.newUnitName;
        }

        /**
         * @return ownerUid
         */
        public Long getOwnerUid() {
            return this.ownerUid;
        }

        /**
         * @return unitId
         */
        public Long getUnitId() {
            return this.unitId;
        }

        public static final class Builder {
            private String newUnitName; 
            private Long ownerUid; 
            private Long unitId; 

            /**
             * NewUnitName.
             */
            public Builder newUnitName(String newUnitName) {
                this.newUnitName = newUnitName;
                return this;
            }

            /**
             * OwnerUid.
             */
            public Builder ownerUid(Long ownerUid) {
                this.ownerUid = ownerUid;
                return this;
            }

            /**
             * UnitId.
             */
            public Builder unitId(Long unitId) {
                this.unitId = unitId;
                return this;
            }

            public UnitEntityList build() {
                return new UnitEntityList(this);
            } 

        } 

    }
}
