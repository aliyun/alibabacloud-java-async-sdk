// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

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
 * {@link ModifyCostUnitRequest} extends {@link RequestModel}
 *
 * <p>ModifyCostUnitRequest</p>
 */
public class ModifyCostUnitRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UnitEntityList")
    private java.util.List<UnitEntityList> unitEntityList;

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
    public java.util.List<UnitEntityList> getUnitEntityList() {
        return this.unitEntityList;
    }

    public static final class Builder extends Request.Builder<ModifyCostUnitRequest, Builder> {
        private java.util.List<UnitEntityList> unitEntityList; 

        private Builder() {
            super();
        } 

        private Builder(ModifyCostUnitRequest request) {
            super(request);
            this.unitEntityList = request.unitEntityList;
        } 

        /**
         * <p>The cost centers to be modified.</p>
         */
        public Builder unitEntityList(java.util.List<UnitEntityList> unitEntityList) {
            this.putQueryParameter("UnitEntityList", unitEntityList);
            this.unitEntityList = unitEntityList;
            return this;
        }

        @Override
        public ModifyCostUnitRequest build() {
            return new ModifyCostUnitRequest(this);
        } 

    } 

    /**
     * 
     * {@link ModifyCostUnitRequest} extends {@link TeaModel}
     *
     * <p>ModifyCostUnitRequest</p>
     */
    public static class UnitEntityList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NewUnitName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String newUnitName;

        @com.aliyun.core.annotation.NameInMap("OwnerUid")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long ownerUid;

        @com.aliyun.core.annotation.NameInMap("UnitId")
        @com.aliyun.core.annotation.Validation(required = true)
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
             * <p>The new name of the cost center.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>newTest</p>
             */
            public Builder newUnitName(String newUnitName) {
                this.newUnitName = newUnitName;
                return this;
            }

            /**
             * <p>The user ID of the cost center owner.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1321312312</p>
             */
            public Builder ownerUid(Long ownerUid) {
                this.ownerUid = ownerUid;
                return this;
            }

            /**
             * <p>The ID of the cost center.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>2524352</p>
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
